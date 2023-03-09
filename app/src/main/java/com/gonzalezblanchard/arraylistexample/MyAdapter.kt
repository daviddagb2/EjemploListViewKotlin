package com.gonzalezblanchard.arraylistexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.gonzalezblanchard.arraylistexample.databinding.ItemMovieBinding
import com.squareup.picasso.Picasso

class MyAdapter(private val context: Context, private val arrayList: java.util.ArrayList<Movie>)
    : BaseAdapter() {

    override fun getCount(): Int {
        return arrayList.size
    }
    override fun getItem(position: Int): Any {
        return position
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {

        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        var convertView = convertView
        //convertView = LayoutInflater.from(context).inflate(R.layout.row, parent, false)
        convertView = binding.root

        binding.txtTitle.text = arrayList[position].title
        binding.txtYear.text = "${arrayList[position].year}"

        if(arrayList[position].imageUrl != null){
            Picasso.get().load(arrayList[position].imageUrl).into(binding.imageMovie);
        }

        return convertView
    }
}