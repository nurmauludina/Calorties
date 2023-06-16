package com.capstoneproject.calorties.api

import com.google.gson.annotations.SerializedName

data class GetFoodsResponse(

	@field:SerializedName("foods")
	val foods: List<FoodsItem?>? = null
)

data class FoodsItem(

	@field:SerializedName("thumbnail")
	val thumbnail: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("jumlah_kalori")
	val jumlahKalori: Int? = null,

	@field:SerializedName("type")
	val type: String? = null
)
