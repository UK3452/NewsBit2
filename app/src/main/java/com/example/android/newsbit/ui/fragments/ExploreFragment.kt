package com.example.android.newsbit.ui.fragments

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.newsbit.R
import com.example.android.newsbit.adapters.CategoryAdapter
import com.example.android.newsbit.adapters.NewsSourceAdapter
import com.example.android.newsbit.adapters.SearchNewsAdapter
import com.example.android.newsbit.models.Category
import com.example.android.newsbit.models.NewsSource
import com.example.android.newsbit.ui.MainActivity
import com.example.android.newsbit.ui.NewsViewModel
import com.example.android.newsbit.utils.Resource
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type
import java.util.*


class ExploreFragment : Fragment(R.layout.fragment_explore) {

    lateinit var viewModel: NewsViewModel
    lateinit var categoryAdapter: CategoryAdapter
    lateinit var categoryItemView: RecyclerView
    lateinit var newsSourceAdapter: NewsSourceAdapter
    lateinit var newsSourceItemView : RecyclerView

    //SEARCH KEYWORDSS VARIABLES
    lateinit var searchKeyword : String
    lateinit var searchNewsAdapter: SearchNewsAdapter
    lateinit var searchItemView: RecyclerView
    lateinit var paginationProgressBarView: ProgressBar
    var searchNewsPageTemp = 1

    lateinit var bottom_section: LinearLayout

    lateinit var sharedPreferences: SharedPreferences

    var totalResults = 0 // totalResults will be received in news search later
    var isLoading = false
    var isScrolling = false


    var categories: MutableList<Category> = mutableListOf()
    var newsSources: MutableList<NewsSource> = mutableListOf()
    val date = Calendar.getInstance()
    var previous=date.add(Calendar.DAY_OF_MONTH, -1); //Goes to previous day
    val year = date.get(Calendar.YEAR)
    val month = date.get(Calendar.MONTH)+1
    val day = date.get(Calendar.DAY_OF_MONTH)
    var from = "$year-$month-$day"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
        if(isCategoryPrefExist()){
            retrievePreferenceCategory()
        }
        else{
            categories = mutableListOf(
                Category("Business", R.drawable.business,false),
                Category("Covid", R.drawable.covid,true),
                Category("Entertainment", R.drawable.entertainment,false),
                Category("Health", R.drawable.health,false),
                Category("International", R.drawable.international,true),
                Category("Politics", R.drawable.politics,true),
                Category("Science", R.drawable.science,false),
                Category("Sports", R.drawable.sports,false),
                Category("Technology", R.drawable.technology,false)
            )
            savePereferenceCategory()
        }

        newsSources  = mutableListOf(
            NewsSource("bbc-news","BBC",R.drawable.sports),
            NewsSource("the-hindu","The Hindu",R.drawable.the_hindu),
            NewsSource("the-times-of-india","Times Of India",R.drawable.technology)
        )
    }


    private fun savePereferenceCategory() {
        sharedPreferences = requireContext().getSharedPreferences("objectPref", Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreferences!!.edit()

        val cat: List<Category> = categories
        val connectionsJSONString = Gson().toJson(cat)
        editor.putString("CategoriesObject", connectionsJSONString)
        editor.putBoolean("categoryIsPresent",true)
        editor.commit()
        Log.e("SAVED-->",connectionsJSONString)
    }

    private fun retrievePreferenceCategory() {
        sharedPreferences = requireContext().getSharedPreferences("objectPref", Context.MODE_PRIVATE)
        val categoryStringJSON: String? = sharedPreferences.getString("CategoriesObject", null)
        val type: Type = object : TypeToken<List<Category?>?>() {}.type
        val catList: List<Category> =
            Gson().fromJson<List<Category>>(categoryStringJSON, type)
        categories = catList as MutableList<Category>
        Log.e("RETRIEVED-->",categories.toString())
    }

    private fun isCategoryPrefExist() : Boolean{
        sharedPreferences = requireContext().getSharedPreferences("objectPref", Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean("categoryIsPresent", false)
    }

    /*https://stackoverflow.com/questions/14678593/the-application-may-be-doing-too-much-work-on-
    its-main-thread*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        searchKeyword = ""
        categoryItemView = view.findViewById(R.id.categoryItemView)
        newsSourceItemView = view.findViewById(R.id.newsSourceItemView)
        searchItemView = view.findViewById(R.id.searchItemView)
        bottom_section = view.findViewById(R.id.explore_bottom_section)
        ///
        ///
        ///
        ///SEARCH VIEW COMPONENT
        val search = view.findViewById<SearchView>(R.id.search_view)
        search.setOnQueryTextListener(object :SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                search.clearFocus()
                if (p0 != null) {
                    if(p0.isNotBlank() || p0.isNotEmpty()){
//                        Toast.makeText(view.context,p0,Toast.LENGTH_SHORT).show()
                        searchKeyword=p0
                        viewModel.getSearchedKeywordNews(p0,"en",from,1)
                        searchItemView.visibility = View.VISIBLE
                        bottom_section.visibility = View.GONE
                    }
                }
                return false
            }
            override fun onQueryTextChange(p0: String?): Boolean {
//                Log.i("TEXTTTT",p0.toString())
                return false
            }
        })
        var c=0

        requireActivity()
            .onBackPressedDispatcher
            .addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {

//                    Toast.makeText(view.context,"BACK PRESSED",Toast.LENGTH_SHORT).show()
                    // Do custom work here
                    if(!search.isFocused){
                        if(c==0){
                            searchItemView.visibility = View.GONE
                            bottom_section.visibility = View.VISIBLE
                            search.setQuery("",true)
                            c=1
                        }
                        else {
                            if (isEnabled) {
                                isEnabled = false
                                requireActivity().onBackPressed()
                                c=0
                            }
                        }
                    }
                    search.clearFocus()
                }
            }
            )

        search.setOnCloseListener(object :SearchView.OnCloseListener{
            override fun onClose(): Boolean {
                searchKeyword=""
                searchItemView.visibility = View.GONE
                bottom_section.visibility = View.VISIBLE
                return false
            }

        })

        paginationProgressBarView = view.findViewById(R.id.progress_bar_search)

        searchNewsRecyclerView()

        searchNewsAdapter.setOnItemClickListener {
            val bundle = Bundle().apply {
                putSerializable("article", it)
            }
            findNavController().navigate(
                R.id.action_topNewsFragment_to_articleFragment,
                bundle
            )
        }

        viewModel.searchedNews.observe(viewLifecycleOwner, Observer{
            when(it) {
                is Resource.Success -> {
                    hideProgressBar()
                    it.data?.let { newsResponse ->
                        /*Convert mutable list to normal list newsResponse.articles.toList()
                        & then submit */
//                        Log.e(TAG, newsResponse.articles[0].title)
                        searchNewsAdapter.differ.submitList(newsResponse.articles.toList())
                        totalResults=newsResponse.totalResults
                    }
                }
                is Resource.Error -> {
                    hideProgressBar()
                    it.message?.let { message ->
//                        Log.e(TAG, "An error occured: $message")
                    }
                }
                is Resource.Loading -> {
                    showProgressBar()
                }
            }
        })

        ///
        ///
        ///
        ///SEARCH VIEW COMPONENT

        setupCategoryRecyclerView()
        setupNewsSourceRecyclerView()

        categoryAdapter.setOnItemClickListener {

            if(it.isCustomCategory==false)
            { viewModel.getCategoryNews("in", it.categoryName, 1) }
            else
            {

                if(it.categoryName=="Covid")
                {
                    viewModel.getCustomCategoryNews("\"Covid\"+India","en",from,1)
                }
                else if(it.categoryName=="Politics"){
                    viewModel.getCustomCategoryNews("\"Politics\"+India","en",from,1)
                }
                else if(it.categoryName=="International"){
                    viewModel.getCustomCategoryNews("International","en",from,1)
                }
            }

            val bundle = Bundle().apply {
                putString("categoryName", it.categoryName)
                putBoolean("isCustomCategory",it.isCustomCategory)
            }
            findNavController().navigate(
                R.id.action_exploreFragment_to_categoryNewsFragment,
                bundle
            )
        }

        newsSourceAdapter.setOnItemClickListener {
            val bundle = Bundle().apply {
                putString("newsSourceId", it.newsSourceID)

            }
            findNavController().navigate(
                R.id.action_exploreFragment_to_sourceNewsFragment,
                bundle
            )
        }

    }

    private fun setupCategoryRecyclerView() {
        categoryAdapter = CategoryAdapter(categories.toList())
        categoryItemView.apply {
            adapter = categoryAdapter
            layoutManager = GridLayoutManager(activity, 3)
        }
    }

    private fun setupNewsSourceRecyclerView() {
        newsSourceAdapter = NewsSourceAdapter(newsSources.toList())
        newsSourceItemView.apply {
            adapter = newsSourceAdapter
            layoutManager = GridLayoutManager(activity, 3)
        }
    }

//SETTING UP SEARCH RECYCLER VIEW????????????????????????????????????????????????




    private fun hideProgressBar() {
        paginationProgressBarView.visibility = View.INVISIBLE
        isLoading=false //use for paging
    }

    private fun showProgressBar() {
        paginationProgressBarView.visibility = View.VISIBLE
        isLoading=true //use for paging
    }




    val newsScrollListener = object : RecyclerView.OnScrollListener() {
        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            super.onScrolled(recyclerView, dx, dy)

            val layoutManager = recyclerView.layoutManager as LinearLayoutManager


            val firstVisiblePosition = layoutManager.findFirstVisibleItemPosition()
            val currentItemCount = layoutManager.itemCount
            val shouldPaginate = totalResults>currentItemCount &&
                    firstVisiblePosition>= currentItemCount - 2 &&
                    isScrolling && !isLoading

            if(shouldPaginate==true)
            {
                viewModel.getTopNews("in",++searchNewsPageTemp)
                isScrolling = false
            }
        }

        override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
            super.onScrollStateChanged(recyclerView, newState)
            if(newState == AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL) {
                isScrolling = true
            }
        }
    }




    private fun searchNewsRecyclerView(){
            searchNewsAdapter = SearchNewsAdapter()
            searchItemView.apply {
                adapter = searchNewsAdapter
                layoutManager = LinearLayoutManager(activity)
                addOnScrollListener(newsScrollListener) //using scroll listener for paging
            }
    }

}