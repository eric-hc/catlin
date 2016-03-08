package com.carboni.catlin.presenter

import com.carboni.catlin.view.ImagesAdapter

/**
 * Created by ericcarboni on 3/7/16.
 */
interface MasterPresenter {
    fun connect(imagesAdapter: ImagesAdapter)
    fun getMasterRequest()
}