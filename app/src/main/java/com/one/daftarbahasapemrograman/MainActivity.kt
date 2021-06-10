package com.one.daftarbahasapemrograman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.one.daftarbahasapemrograman.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var rv_lang: RecyclerView
    private var list: ArrayList<Lang> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        rv_lang = binding.rvLang
        rv_lang.setHasFixedSize(true)

        list.addAll(LangData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rv_lang.layoutManager = LinearLayoutManager(this) // Setting layout nya
        val langAdapter = LangAdapter(list)
        rv_lang.adapter = langAdapter           // setting adapternya
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_about) {
            val aboutIntent = Intent(this, AboutActivity::class.java)
            startActivity(aboutIntent)
        }
        return super.onOptionsItemSelected(item)
    }
}