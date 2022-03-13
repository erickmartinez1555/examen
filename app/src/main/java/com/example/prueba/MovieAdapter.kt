package com.example.prueba


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.prueba.models.Movie
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieAdapter (
    private val movies : List<Movie>,
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){


    class MovieViewHolder(View : View) : RecyclerView.ViewHolder(View){


        //pasasmos nuestra url de la api themoviedb
        private val IMAGE_BASE = "https://image.tmdb.org/t/p/w500/"

        fun bindMovie(movie : Movie){

            //hacemos un casting de los elementos de la interfaz

            //muestra el titulo de la pelicula
            itemView.movie_title.text = movie.title
            //muestra resumen de pelocula
            itemView.overview.text = movie.overview
            //muestra en text la fecha de la pelicula
            itemView.release_date.text = movie.release_date
            //muestra el titulo original
            itemView.original_language.text = movie.original_language
            //muestra


            //muestra el poster de la pelicula en un imageview
            Glide.with(itemView).load(IMAGE_BASE + movie.poster).into(itemView.movie_poster)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        )
    }

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindMovie(movies.get(position))
    }
}