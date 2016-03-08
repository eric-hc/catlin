package com.carboni.catlin.view

import rx.Observable
import com.carboni.catlin.model.Cats

/**
 * Created by ericcarboni on 3/7/16.
 */
interface ImagesAdapter {
    fun setObservable(observableCats: Observable<Cats>)

    fun unsubscribe()
}