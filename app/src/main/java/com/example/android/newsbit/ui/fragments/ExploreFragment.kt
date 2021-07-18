package com.example.android.newsbit.ui.fragments

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.newsbit.R
import com.example.android.newsbit.adapters.CategoryAdapter
import com.example.android.newsbit.adapters.NewsSourceAdapter
import com.example.android.newsbit.models.Category
import com.example.android.newsbit.models.NewsSource
import com.example.android.newsbit.ui.MainActivity
import com.example.android.newsbit.ui.NewsViewModel
import java.util.*


class ExploreFragment : Fragment(R.layout.fragment_explore) {

    private lateinit var viewModel: NewsViewModel
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var categoryItemView: RecyclerView
    private lateinit var newsSourceAdapter: NewsSourceAdapter
    private lateinit var newsSourceItemView: RecyclerView

    //SEARCH KEYWORDS VARIABLES
    private lateinit var searchKeyword: String
    private lateinit var paginationProgressBarView: ProgressBar

    private lateinit var bottomSection1: LinearLayout

    var isScrolling = false

    var categories: MutableList<Category> = mutableListOf()
    private var newsSources: MutableList<NewsSource> = mutableListOf()
    private val date = Calendar.getInstance()
//    var previous = date.add(Calendar.DAY_OF_MONTH, -1); //Goes to previous day
    val year = date.get(Calendar.YEAR)
    private val month = date.get(Calendar.MONTH) + 1
    private val day = date.get(Calendar.DAY_OF_MONTH)
    var from = "$year-$month-$day"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = (activity as MainActivity).viewModel

        categories = mutableListOf(
            Category("Business", R.drawable.briefcase, false),
            Category("Covid", R.drawable.corona, true),
            Category("Entertainment", R.drawable.clapperboard, false),
            Category("Health", R.drawable.hospital, false),
            Category("International", R.drawable.global, true),
            Category("Cryptocurrency", R.drawable.crypto, true),
            Category("Science", R.drawable.science, false),
            Category("Sports", R.drawable.sports, false),
            Category("Technology", R.drawable.satellite, false)
        )



        newsSources = mutableListOf(
            NewsSource("bbc-news", "BBC", R.drawable.bbc),
            NewsSource("the-hindu", "The Hindu", R.drawable.the_hindu),
            NewsSource("the-times-of-india", "Times Of India", R.drawable.times_of_india),
//            NewsSource("engadget", "Engadget", R.drawable.technology),
            NewsSource("espn", "ESPN", R.drawable.espn),
            NewsSource("national-geographic", "Nat Geo", R.drawable.natgeo),
            NewsSource("polygon", "Polygon", R.drawable.p),
            NewsSource("techcrunch", "Tech Crunch", R.drawable.techcrunch),
//            NewsSource("the-next-web", "NextWeb", R.drawable.technology),
            NewsSource("the-verge", "Verge", R.drawable.v),
            NewsSource("techradar", "Tech Radar", R.drawable.tr)
        )
    }


    /*https://stackoverflow.com/questions/14678593/the-application-may-be-doing-too-much-work-on-
    its-main-thread*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        searchKeyword = ""
        categoryItemView = view.findViewById(R.id.categoryItemView)
        newsSourceItemView = view.findViewById(R.id.newsSourceItemView)
        bottomSection1 = view.findViewById(R.id.explore_bottom_section)
        ///
        ///
        ///
        val search = view.findViewById<SearchView>(R.id.search_view)

        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {

            override fun onQueryTextSubmit(p0: String?): Boolean {
                search.clearFocus()
                if (p0 != null) {
                    if (p0.isNotBlank() || p0.isNotEmpty()) {
//                  Toast.makeText(view.context,p0,Toast.LENGTH_SHORT).show()
//                        Log.e("KEYWORDD",p0)
                        searchKeyword = p0
                        search.setQuery("",false)
                        viewModel.getSearchedKeywordNews(searchKeyword, "en", from, 1)
                        val bundle = Bundle().apply {
                            putString("keyword", searchKeyword)
                        }
                        findNavController().navigate(
                            R.id.action_exploreFragment_to_searchFragment,
                            bundle
                        )
                    }
                }

                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                return false
            }
        })

        paginationProgressBarView = view.findViewById(R.id.progress_bar_search)


        setupCategoryRecyclerView()
        setupNewsSourceRecyclerView()

        categoryAdapter.setOnItemClickListener {

            if (!it.isCustomCategory) {
                viewModel.getCategoryNews("in", it.categoryName, 1)
            } else {
                if (it.categoryName == "Covid") {
                    viewModel.getCustomCategoryNews("\"Covid\"+India", "en", from, 1)
                } else if (it.categoryName == "Cryptocurency") {
                    viewModel.getCustomCategoryNews("\"cryptocurrency\"", "en", from, 1)
                } else if (it.categoryName == "International") {
                    viewModel.getCustomCategoryNews("International", "en", from, 1)
                }
            }

            val bundle = Bundle().apply {
                putString("categoryName", it.categoryName)
                putBoolean("isCustomCategory", it.isCustomCategory)
            }
            findNavController().navigate(
                R.id.action_exploreFragment_to_categoryNewsFragment,
                bundle
            )
        }

        newsSourceAdapter.setOnItemClickListener {
            viewModel.getSourceNews(it.newsSourceID, "en", from, 1)
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

}