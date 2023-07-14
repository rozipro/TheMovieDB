package com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.model.TV
import com.themoviedb.R
import kotlinx.android.synthetic.main.activity_tv_detail.*

class TvDetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TvS = "extra_tvs"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tv_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        img_item_photo.clipToOutline = true

        val detailTvs = intent.getParcelableExtra<TV>(EXTRA_TvS)

        if (detailTvs != null){
            val IMAGE_BASE = "https://image.tmdb.org/t/p/w500/"
            Glide.with(this).load(IMAGE_BASE + detailTvs.poster).into(img_item_photo)
            tv_item_name.text = detailTvs.title
            tv_item_desc.text = detailTvs.overview
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}