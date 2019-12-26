package com.example.myapplication.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myapplication.FirstFragment
import com.example.myapplication.SecondFragment

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        var fragment : Fragment = FirstFragment()
        when (position) {
            0 -> fragment = FirstFragment()
            1 -> fragment = SecondFragment()
        }
        return fragment
    }
    override fun getPageTitle(position: Int): CharSequence? {
        var title : String? = null
        when (position){
            0 -> title ="Tab 1"
            1 -> title ="Tab 2"

        }
        return title
    }

    override fun getCount(): Int =2
}