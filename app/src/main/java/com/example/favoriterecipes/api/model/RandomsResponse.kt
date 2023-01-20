package com.example.favoriterecipes.api.model

import com.google.gson.annotations.SerializedName

 class RandomsResponse(

	@field:SerializedName("recipes")
	val recipes: List<RecipesItem?>? = null,
	 @field:SerializedName("code")
     val code: String? = null,
	@field:SerializedName("message")
    val message: String? = null
)