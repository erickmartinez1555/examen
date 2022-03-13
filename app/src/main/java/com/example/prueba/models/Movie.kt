package com.example.prueba.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(

    //evaluamos los nombres de los datos que obtendremos
    @SerializedName("id")
    val id : String?,

    @SerializedName("title")
    val title : String?,

    @SerializedName("poster_path")
    val poster : String?,

    @SerializedName("overview")
    val overview : String?,

    @SerializedName("release_date")
    val release_date : String,

    @SerializedName("original_language")
    val original_language : String?,

    @SerializedName("region")
    val region : String?
//pasamos nuestros objetos
):Parcelable{
    constructor(): this("","","","","","","")
}