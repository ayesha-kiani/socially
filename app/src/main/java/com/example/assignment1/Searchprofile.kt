package com.example.assignment1

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.tabs.TabLayout

class Searchprofile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searchprofile)

        val searchEditText = findViewById<EditText>(R.id.searchEditText)
        val clearTextView = findViewById<TextView>(R.id.clearTextView)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val resultsRecyclerView = findViewById<RecyclerView>(R.id.resultsRecyclerView)

        val tabTitles = arrayOf("Top", "Accounts", "Tags", "Places")
        tabTitles.forEach { tabLayout.addTab(tabLayout.newTab().setText(it)) }

        val data = listOf(
            SearchResult(ItemType.PROFILE, "IS", "internshala", "internshala"),
            SearchResult(ItemType.HASHTAG, null, "#internshala", "1000+ post"),
            SearchResult(ItemType.HASHTAG, null, "#internshala_challange", "500+ post"),
            SearchResult(ItemType.PLACE, null, "Internshala", "Internshala, B-610, Untech Business Zone,...")
        )

        resultsRecyclerView.layoutManager = LinearLayoutManager(this)
        resultsRecyclerView.adapter = SearchResultAdapter(data)

        clearTextView.setOnClickListener {
            searchEditText.text.clear()
        }
    }
}
