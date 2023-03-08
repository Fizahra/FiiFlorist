package com.fizahra.fiiflorist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fizahra.fiiflorist.adapter.ListFlowerAdapter
import com.fizahra.fiiflorist.model.Flower

class MainActivity : AppCompatActivity() {
    private lateinit var rvFlowers: RecyclerView
    private val data = Flower.loadData()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFlowers = findViewById(R.id.rv_flowers)
        rvFlowers.setHasFixedSize(true)

        showRecyclerList()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.button_me -> {
                val intent = Intent(this, AboutMeActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerList() {
        rvFlowers.layoutManager = LinearLayoutManager(this)
        val listFlowerAdapter = ListFlowerAdapter()
        rvFlowers.adapter = listFlowerAdapter
    }
}