package com.androimads.retrolin

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("rates")
	val rates: Rates? = null,

	@field:SerializedName("base")
	val base: String? = null

)

data class Rates(

	@field:SerializedName("GBP")
	val gBP: Double? = null,

	@field:SerializedName("USD")
	val uSD: Double? = null,

	@field:SerializedName("SEK")
    val sEK: Double? = null,

	@field:SerializedName("EUR")
    val eUR: Double? = null,

	@field:SerializedName("CAD")
	val cAD: Double? = null,

	@field:SerializedName("CHF")
	val cHF: Double? = null

)
