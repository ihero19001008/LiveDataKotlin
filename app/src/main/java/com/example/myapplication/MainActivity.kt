package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.Adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val adapter: ViewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view_pager.adapter = adapter
        this.tabs.setupWithViewPager(view_pager)
    }
    inner class Change(){
        fun Chang() = Toast.makeText(this@MainActivity,"Checked", Toast.LENGTH_SHORT).show()
    }
}
