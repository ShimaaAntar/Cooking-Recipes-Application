package com.example.favoriterecipes.api.model

import com.google.gson.annotations.SerializedName

 class ExtendedIngredientsItem(

	@field:SerializedName("originalName")
	val originalName: String? = null,

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("amount")
	val amount: Any? = null,

	@field:SerializedName("unit")
	val unit: String? = null,

	@field:SerializedName("measures")
	val measures: Measures? = null,

	@field:SerializedName("nameClean")
	val nameClean: String? = null,

	@field:SerializedName("original")
	val original: String? = null,

	@field:SerializedName("meta")
	val meta: List<Any?>? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("aisle")
	val aisle: String? = null,

	@field:SerializedName("consistency")
	val consistency: String? = null
)