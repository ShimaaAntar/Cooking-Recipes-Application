package com.example.favoriterecipes.api.model

import com.google.gson.annotations.SerializedName

 class EquipmentItem(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("localizedName")
	val localizedName: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("temperature")
	val temperature: Temperature? = null
)