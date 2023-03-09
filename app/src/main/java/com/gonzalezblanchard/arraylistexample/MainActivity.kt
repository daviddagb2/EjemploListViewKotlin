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

    var listaPeliculas: ArrayList<Movie> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Metodo para Usar Array List
        /*val peliculas = arrayOf(
            "Terminator",
            "Rapidos y furiosos",
            "Titanic",
            "Soy Leyenda",
            "Batman",
            "Avatar",
            "Avatar",
            "Black Panther",
            "AntMan"
        )

        var itemsAdapter = ArrayAdapter<String>(this,
            R.layout.simple_list_item_1,
            peliculas)

        binding.listapeliculas.adapter = itemsAdapter*/

        //Metodo para usar Custom Adapter
        listaPeliculas.add(Movie("Terminator",
            1984,
            "https://cdn.shopify.com/s/files/1/1057/4964/products/The-Terminator-Vintage-Movie-Poster-Original-1-Sheet-27x41-7128_300x@2x.jpg?v=1669093452",
            "The Terminator es una película de ciencia ficción de 1984 escrita y dirigida por James Cameron y protagonizada por Arnold Schwarzenegger, Linda Hamilton y Michael Biehn."
        ))

        listaPeliculas.add(Movie("Rapidos y furiosos",
            2001,
            "https://static.wikia.nocookie.net/fastandfurious/images/8/87/Fast_One_Poster.jpg/revision/latest?cb=20200205060103",
            "")
        )
        listaPeliculas.add(Movie("Titanic",
            1997,
            "https://m.media-amazon.com/images/I/513BS19H0pL._AC_UF894,1000_QL80_.jpg",
            ""
        ))

        listaPeliculas.add(Movie("Soy Leyenda",
            2007,
            "https://www.themoviedb.org/t/p/original/pO1SrJgf5BumqcIRkYviSGIFdmX.jpg",
            ""
        ))

        listaPeliculas.add(Movie("Batman",
            2022,
            "https://m.media-amazon.com/images/M/MV5BMDdmMTBiNTYtMDIzNi00NGVlLWIzMDYtZTk3MTQ3NGQxZGEwXkEyXkFqcGdeQXVyMzMwOTU5MDk@._V1_FMjpg_UX1000_.jpg",
            ""
        ))

        listaPeliculas.add(Movie("Avatar",
            2009,
            "https://m.media-amazon.com/images/M/MV5BZDA0OGQxNTItMDZkMC00N2UyLTg3MzMtYTJmNjg3Nzk5MzRiXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_FMjpg_UX1000_.jpg",
            ""
        ))
        listaPeliculas.add(Movie("Black Panther",
            2018,
            "https://c8.alamy.com/compes/m590ka/pantera-negra-nosotros-poster-chadwick-boseman-caracteres-como-t-challa-pantera-negra-2018-marvel-walt-disney-studios-motion-pictures-cortesia-coleccion-everett-m590ka.jpg",
            ""
        ))

        listaPeliculas.add(Movie("Antman",
            2023,
            "https://m.media-amazon.com/images/M/MV5BMjM2NTQ5Mzc2M15BMl5BanBnXkFtZTgwNTcxMDI2NTE@._V1_.jpg",
            ""
        ))

        var adapter = MyAdapter(this, listaPeliculas)
        binding.listapeliculas.adapter = adapter

    }
}