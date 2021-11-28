package com.apps.sok

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.utils.widget.ImageFilterView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.apps.sok.activity.*
import com.apps.sok.auth.LoginActivity
import com.apps.sok.fragment.MainFragment
import com.apps.sok.fragment.MyOrders
import com.apps.sok.fragment.Notifications
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener  {

    private var backPressedTime: Long = 0
    lateinit var mDrawer: DrawerLayout
    lateinit var scriti_menyu_otkritiye: ImageFilterView
    lateinit var navigationView:NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.toolbar1)
        window.statusBarColor = resources.getColor(R.color.blue)


        navigationView = findViewById(R.id.navigationView)
        navigationView.setNavigationItemSelectedListener(this)

        mDrawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout

        scriti_menyu_otkritiye = findViewById(R.id.scriti_menyu_otkritiye)

        val buttomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView_3) as NavHostFragment
        val navController = navHostFragment.navController
        val glavni = MainFragment()
        val uslugi = MyOrders()
        val profil = Notifications()
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView_3,glavni)
        buttomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.glavni_item -> {
                    glavni.context
                    true
                }
                R.id.my_profil -> {
                    uslugi.context
                    true
                }
                R.id.notification -> {
                    profil.context
                    true
                }
                else -> false
            }
        }

        buttomNavigationView.setupWithNavController(navController)

    }

    fun onClickdriwer_open(view:View){
        mDrawer?.openDrawer(GravityCompat.START)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // The action bar home/up action should open or close the drawer.
        when (item.itemId) {
            android.R.id.home -> {
                mDrawer!!.openDrawer(GravityCompat.START)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.moy_zakaz_item -> {
                startActivity(Intent(this, MyOrderActivity::class.java))
                finish()
            }
            R.id.istoriya_item -> {
                startActivity(Intent(this, HistoryOp::class.java))
                finish()
            }
            R.id.my_profil -> {
                startActivity(Intent(this, ProfilActivity::class.java))
                finish()
            }
            R.id.my_card_item -> {
                startActivity(Intent(this, MyCardActivity::class.java))
                finish()
            }
            R.id.online_kam_item -> {

            }
            R.id.akcii_item -> {

            }
            R.id.kantakti_item -> {
                startActivity(Intent(this, Kontakti::class.java))
                finish()
            }
            R.id.informer_pagoda_item -> {
                startActivity(Intent(this, InfoPogoda::class.java))
                finish()
            }
            R.id.viyti_item -> {
                startActivity(Intent(this, LoginActivity::class.java))
                overridePendingTransition(R.anim.slidein1, R.anim.slideout2)
                finish()
            }
        }
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed()
            return
        }
        backPressedTime = System.currentTimeMillis()
    }
}