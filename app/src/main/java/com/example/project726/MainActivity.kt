package com.example.project726

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuView
import androidx.fragment.app.Fragment
import com.example.project726.ui.home.HomeFragment
import com.example.project726.ui.menu.MenuFragment
import com.example.project726.ui.news.NewsFragment
import com.example.project726.util.showToast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val homeFragment = HomeFragment()
        val menuFragment = MenuFragment()
        val newsFragment = NewsFragment()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.navigation_home).setOnClickListener {
            onSelect(homeFragment)
            "home".showToast(this)
        }
        findViewById<View>(R.id.navigation_menu).setOnClickListener {
            onSelect(menuFragment)
            "menu".showToast(this)
        }
        findViewById<View>(R.id.navigation_news).setOnClickListener {
            onSelect(newsFragment)
            "news".showToast(this)
        }
    }

    private fun onSelect(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.nav_host_fragment_activity_main, fragment)
            .commit()
    }
}