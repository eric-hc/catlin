package com.carboni.catlin.model

import java.util.*


/**
 * Created by ericcarboni on 3/7/16.
 */
data class Cats(var data: Data? = null)

data class Data(var images: ArrayList<Image>? = null)

data class Image(var url: String? = "", var id: String? = "", var source_url: String? = "")

