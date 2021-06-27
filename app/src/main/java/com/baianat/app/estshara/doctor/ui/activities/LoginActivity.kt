package com.baianat.app.estshara.doctor.ui.activities

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.baianat.app.estshara.doctor.R
import com.baianat.app.estshara.doctor.databinding.ActivityLoginBinding
import com.google.android.material.navigation.NavigationView

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupNavigationDrawerAndToolbar()
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_login)

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.fragment_login  ,R.id.nav_change_lang, R.id.nav_fag
            ), binding.drawerLayoutLogin
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
    

    fun setTitle(title: String){
        binding.appBarLogin.toolbarTitle.setText(title)
    }

    fun showToolBar(){
        binding.appBarLogin.toolbar.visibility = View.VISIBLE
    }

    fun hideToolBar(){
        binding.appBarLogin.toolbar.visibility = View.GONE
    }
    private fun setupNavigationDrawerAndToolbar() {
        setSupportActionBar(binding.appBarLogin.toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        setTitle("Login")
        binding.drawerLayoutLogin .apply {

                //setStatusBarBackground(R.drawable.shape_gradient_main)
            }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_login)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}