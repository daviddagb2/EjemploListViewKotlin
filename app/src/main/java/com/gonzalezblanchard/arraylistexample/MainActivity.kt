package com.gonzalezblanchard.arraylistexample

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.gonzalezblanchard.arraylistexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var peliculas = emptyList<String>()
    lateinit var arrayAdapter: ArrayAdapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val peliculas = arrayOf(
            "Terminator",
            "Rapidos y furiosos",
            "Titanic",
            "Soy Leyenda",
            "Batman",
            "Avatar",
            "Avatar",
            "Pantera Negra",
            "AntMan"
        )

        var itemsAdapter = ArrayAdapter<String>(this,
             R.layout.simple_list_item_1,
                peliculas)

        binding.listapeliculas.adapter = itemsAdapter

    }
}