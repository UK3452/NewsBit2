package com.example.android.newsbit.ui

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.android.newsbit.R
import com.example.android.newsbit.db.ArticleDatabase
import com.example.android.newsbit.repository.NewsRepository
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import org.jetbrains.annotations.NotNull


class MainActivity : AppCompatActivity() {

    lateinit var viewModel: NewsViewModel
    private lateinit var mAuth: FirebaseAuth
    lateinit var currentUser: FirebaseUser
    private lateinit var googleSignInClient: GoogleSignInClient
    val TAG = "Main Activity"
    lateinit var sharedPreferences: SharedPreferences
    lateinit var phonenumber: String

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        mAuth = FirebaseAuth.getInstance()
        if (mAuth.currentUser != null) {
            currentUser = mAuth.currentUser!!
        }

        //CHECK IF THE USER SIGNED WITH PHONE NUMBER OR NOT

        if (mAuth.currentUser ==null) {
            Log.e("PhoneNumber","Signed as"+sharedPreferences.getString("phonenumber", null))
            if (restorePrefData()) {
                getPhonePreference()
            } else {
                val i = Intent(applicationContext, SignInActivity::class.java)
                startActivity(i)
                finish()
            }
        }
        else{
            Log.e("CurrentUser","Signed as"+currentUser.phoneNumber)
        }

        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()

        googleSignInClient = GoogleSignIn.getClient(this, gso)

        /*
        The next 3 lines(where we are instantiating viewModel) work only
        if we write them before setContentView(R.layout.activity_main).
        It has something to relate with lifecycle. I don't understand it fully yet
        because in phillip lackner course it works fine if we write these lines after
        setContentView(R.layout.activity_main) line
         */
        val newsRepository = NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(newsRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(NewsViewModel::class.java)

        setTheme(R.style.Theme_NewsBit)
        setContentView(R.layout.activity_main)

        /* Log.e(TAG, "\n\n Ho to raha hai yaar \n\n")*/



        if (this::viewModel.isInitialized) {
            Log.e(TAG, " Ho to raha hai yaar ")
        } else {
            Log.e(TAG, "Abhi nahi yaar ")
        }

        val navController = findNavController(R.id.newsNavHostFragment)
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setupWithNavController(navController)
    }

    private fun signOut() {
        // Firebase sign out
        mAuth.signOut()

        // Google sign out
        googleSignInClient.signOut()
    }

    private fun restorePrefData(): Boolean {
        sharedPreferences = applicationContext.getSharedPreferences("pref", Context.MODE_PRIVATE)
        return sharedPreferences!!.getBoolean("verified", false)
    }

    private fun getPhonePreference() {
        sharedPreferences = applicationContext.getSharedPreferences("pref", Context.MODE_PRIVATE)
        phonenumber = sharedPreferences!!.getString("phonenumber", null)!!
//        Toast.makeText(this,"Signed as"+phonenumber,Toast.LENGTH_SHORT).show()
    }
}
