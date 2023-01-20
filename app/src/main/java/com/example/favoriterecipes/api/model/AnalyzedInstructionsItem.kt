package com.example.favoriterecipes.api.model

import com.google.gson.annotations.SerializedName

 class AnalyzedInstructionsItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("steps")
	val steps: List<StepsItem?>? = null
)