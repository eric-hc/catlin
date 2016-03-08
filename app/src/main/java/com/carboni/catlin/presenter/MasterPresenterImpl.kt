package com.carboni.catlin.presenter

import com.carboni.catlin.model.Cats
import com.carboni.catlin.network.CatAPINetwork
import com.carboni.catlin.view.ImagesAdapter
import rx.Observable

/**
 * Created by ericcarboni on 3/7/16.
 */
class MasterPresenterImpl : MasterPresenter {
    lateinit private var imagesAdapter: ImagesAdapter

    override fun connect(imagesAdapter: ImagesAdapter) {
        this.imagesAdapter = imagesAdapter
    }

    override fun getMasterRequest() {
        imagesAdapter.setObservable(getObservableMasterRequest(CatAPINetwork()))
    }

    private fun getObservableMasterRequest(catAPINetwork: CatAPINetwork): Observable<Cats> {
        return catAPINetwork.getExec()
    }

}