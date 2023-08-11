package com.example.testproject.data.model

import com.google.gson.annotations.SerializedName

data class Day (

    @SerializedName("avgtemp_c")
    val avgtemp_c: Float?,

    @SerializedName("maxwind_kph")
    val maxwind_kph: Float?,

    @SerializedName("avghumidity")
    val avghumidity: Float?,

    @SerializedName("condition")
    val condition: Condition?
)