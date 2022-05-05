package com.example.crypto.model1

import com.google.gson.annotations.SerializedName


data class Data (

  @SerializedName("id"                               ) var id                            : Int?              = null,
  @SerializedName("name"                             ) var name                          : String?           = null,
  @SerializedName("symbol"                           ) var symbol                        : String?           = null,
  @SerializedName("quote"                            ) var quote                         : Quote?            = Quote()

)