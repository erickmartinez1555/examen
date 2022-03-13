package com.example.prueba.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize

//creamos una solocitud para nuestra lista de elementos
data class MovieResponse(
    @SerializedName("results")
    val movies : List<Movie>

): Parcelable{
    constructor() :this(mutableListOf())
}