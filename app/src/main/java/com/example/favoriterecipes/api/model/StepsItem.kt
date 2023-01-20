package com.example.favoriterecipes.api.model

import com.google.gson.annotations.SerializedName

 class StepsItem(

	@field:SerializedName("number")
	val number: Int? = null,

	@field:SerializedName("ingredients")
	val ingredients: List<IngredientsItem?>? = null,

	@field:SerializedName("equipment")
	val equipment: List<EquipmentItem?>? = null,

	@field:SerializedName("step")
	val step: String? = null,

	@field:SerializedName("length")
	val length: Length? = null
)