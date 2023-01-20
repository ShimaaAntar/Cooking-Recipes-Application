package com.example.favoriterecipes.api.model

import com.google.gson.annotations.SerializedName

 class Measures(

	@field:SerializedName("metric")
	val metric: Metric? = null,

	@field:SerializedName("us")
	val us: Us? = null
)