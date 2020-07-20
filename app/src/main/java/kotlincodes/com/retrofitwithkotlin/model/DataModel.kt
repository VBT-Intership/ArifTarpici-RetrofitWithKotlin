package kotlincodes.com.retrofitwithkotlin.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class DataModel(

        @SerializedName("imageUrl")
        val imageUrl: String,
        @SerializedName("description")
        val description: String,
        @SerializedName("statusCode")
        var statusCode: kotlin.Int

)