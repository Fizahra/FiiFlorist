package com.fizahra.fiiflorist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.fizahra.fiiflorist.model.Flower

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val dataFlower = intent.getParcelableExtra<Flower>("key_flower")

        val longDesc : TextView = findViewById(R.id.tv_long_desc)
        val nameFlower : TextView = findViewById(R.id.tv_flower)
        val nameIlmiah : TextView = findViewById(R.id.tv_ilmiah)
        val imgFlower : ImageView = findViewById(R.id.img_flower)
        val fav : ToggleButton = findViewById(R.id.fav_button)
        val share : Button = findViewById(R.id.share_button)


        longDesc.text = dataFlower?.longdesc
        nameFlower.text = dataFlower?.name
        nameIlmiah.text = dataFlower?.ilmiah
        dataFlower?.photo?.let { imgFlower.setImageResource(it) }

        fav.setOnCheckedChangeListener(){ _, isChecked -> Toast.makeText(this, if(isChecked)"Berhasil menambahkan ke favorit" else "Menghapus dari favorit :(", Toast.LENGTH_SHORT).show()}
        share.setOnClickListener{
            val shortdesc = dataFlower?.shortdesc
            val name = dataFlower?.name
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,"Aku menemukan $name yang cantik, katanya ia adalah $shortdesc. Kau harus melihatnya di Fii's Florist")
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"Bagikan ke:"))
        }
    }
}