package com.one.daftarbahasapemrograman

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class LangAdapter(val listLang: ArrayList<Lang>): RecyclerView.Adapter<LangAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_lang, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val lang = listLang[position]

        Glide.with(holder.itemView.context)
                .load(lang.photo)
                .apply(RequestOptions().override(55,55))
                .into(holder.imgPhoto)

        holder.tvName.text = lang.name
        holder.tvDetail.text = lang.detail

        holder.itemView.setOnClickListener {
            val detailLangIntent = Intent(it.context, DetailLangActivity::class.java)
            detailLangIntent.putExtra(DetailLangActivity.EXTRA_NAME, lang.name)
            detailLangIntent.putExtra(DetailLangActivity.EXTRA_DESIGNED_BY, lang.designed_by)
            detailLangIntent.putExtra(DetailLangActivity.EXTRA_FIRST_RELEASE, lang.first_release)
            detailLangIntent.putExtra(DetailLangActivity.EXTRA_STABLE_RELEASE, lang.stable_release)
            detailLangIntent.putExtra(DetailLangActivity.EXTRA_PARADIGM, lang.paradigm)
            detailLangIntent.putExtra(DetailLangActivity.EXTRA_DETAIL, lang.detail)
            detailLangIntent.putExtra(DetailLangActivity.EXTRA_REFERENCE, lang.reference)
            detailLangIntent.putExtra(DetailLangActivity.EXTRA_PHOTO, lang.photo)
            it.context.startActivity(detailLangIntent)
        }
    }

    override fun getItemCount(): Int {
        return listLang.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}