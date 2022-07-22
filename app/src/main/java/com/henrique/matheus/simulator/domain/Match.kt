package com.henrique.matheus.simulator.domain

import com.google.gson.annotations.SerializedName

data class Match(
    val description: String,
    @SerializedName("localization")
    val place : Place,
    @SerializedName("home-team")
    val homeTeam: Team,
    @SerializedName("away-team")
    val awayTeam: Team,
)
