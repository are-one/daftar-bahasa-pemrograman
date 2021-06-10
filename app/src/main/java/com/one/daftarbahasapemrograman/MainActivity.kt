package com.one.daftarbahasapemrograman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rv_lang: RecyclerView
    private var list: ArrayList<Lang> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_lang = findViewById(R.id.rv_lang)
        rv_lang.setHasFixedSize(true)

        list.addAll(LangData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rv_lang.layoutManager = LinearLayoutManager(this) // Setting layout nya
        val langAdapter = LangAdapter(list)
        rv_lang.adapter = langAdapter           // setting adapternya
    }
}