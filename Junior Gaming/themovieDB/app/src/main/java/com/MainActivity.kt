package com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.adaptors.ViewPageAdaptor
import com.themoviedb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPagerAdapter: ViewPageAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewPagerAdapter = ViewPageAdaptor(supportFragmentManager,lifecycle)
        with(binding){
            viewPager.adapter = viewPagerAdapter

            TabLayoutMediator(tabLayout,viewPager){tab,position ->
                when(position){
                    0 -> tab.text ="Movie"
                    1 -> tab.text ="TV"
                }
            }.attach()
        }
    }
}