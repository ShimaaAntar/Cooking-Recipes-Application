package com.example.favoriterecipes.api.model

import com.google.gson.annotations.SerializedName

 class Metric(

	@field:SerializedName("amount")
	val amount: Any? = null,

	@field:SerializedName("unitShort")
	val unitShort: String? = null,

	@field:SerializedName("unitLong")
	val unitLong: String? = null
)