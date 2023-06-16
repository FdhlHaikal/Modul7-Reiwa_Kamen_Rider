package com.example.uts

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val ryuzakilogia = findViewById<Button>(R.id.button)
        ryuzakilogia.setOnClickListener {
            val url = "http://ryuzakilogia.net/kamen-rider-series/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
            }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val kr = intent.getParcelableExtra<KamenRiderClass>(HomeFragment.INTENT_PARCELABLE)

        val krimg = findViewById<ImageView>(R.id.image)
        val krname = findViewById<TextView>(R.id.tv_name)
        val krdate = findViewById<TextView>(R.id.tv_date)
        val krauthor = findViewById<TextView>(R.id.tv_author)
        val krrate = findViewById<TextView>(R.id.tv_rating)
        val ratingbar = findViewById<RatingBar>(R.id.ratingbar)
        val krdesc = findViewById<TextView>(R.id.tv_description)

        krimg.setImageResource(kr?.krimg!!)
        krname.text = kr.krname
        krdate.text = kr.krdate
        krauthor.text = kr.krauthor
        krrate.text = kr.krrate
        ratingbar.rating = kr.ratingbar.toFloat()
        krdesc.text = kr.krdesc
    }

    override fun onSupportNavigateUp(): Boolean {

        onBackPressed()
        return true
    }
}