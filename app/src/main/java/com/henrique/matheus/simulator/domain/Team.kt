package com.henrique.matheus.simulator.domain

import com.google.gson.annotations.SerializedName

data class Team(
    val name: String,
    @SerializedName("power")
    val stars: Int,
    val image: String,
    var score: Int?
    )
