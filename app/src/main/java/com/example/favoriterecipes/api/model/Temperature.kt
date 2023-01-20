package com.example.favoriterecipes.api.model

import com.google.gson.annotations.SerializedName

 class Temperature(

	@field:SerializedName("number")
	val number: Any? = null,

	@field:SerializedName("unit")
	val unit: String? = null
)