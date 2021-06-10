package com.one.daftarbahasapemrograman

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.one.daftarbahasapemrograman.databinding.ActivityDetailLangBinding

class DetailLangActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESIGNED_BY = "extra_designed_by"
        const val EXTRA_FIRST_RELEASE = "extra_first_release"
        const val EXTRA_STABLE_RELEASE = "extra_stable_release"
        const val EXTRA_PARADIGM = "extra_paradigm"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_REFERENCE = "extra_reference"
        const val EXTRA_PHOTO = "extra_photo"
    }

    private lateinit var binding: ActivityDetailLangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailLangBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        val name = intent.getStringExtra(EXTRA_NAME)
        val designedBy = intent.getStringExtra(EXTRA_DESIGNED_BY)
        val firstRelease = intent.getStringExtra(EXTRA_FIRST_RELEASE)
        val stableRelease = intent.getStringExtra(EXTRA_STABLE_RELEASE)
        val paradigm = intent.getStringExtra(EXTRA_PARADIGM)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val reference = intent.getStringExtra(EXTRA_REFERENCE)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        supportActionBar?.apply {
            setTitle("Detail")
            setDisplayHomeAsUpEnabled(true)
        }

        binding.tvItemName.text = name
        binding.tvDesignedBy.text = designedBy
        binding.tvFirstRelease.text = firstRelease
        binding.tvStableRelease.text = stableRelease
        binding.tvParadigm.text = paradigm
        binding.tvDetail.text = detail
        binding.tvReference.text = reference
        Glide.with(this).load(photo).into(binding.imgItemPhoto)


    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}