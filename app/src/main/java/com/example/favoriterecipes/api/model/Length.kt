package com.example.favoriterecipes.api.model

import com.google.gson.annotations.SerializedName

 class Length(

	@field:SerializedName("number")
	val number: Int? = null,

	@field:SerializedName("unit")
	val unit: String? = null
)