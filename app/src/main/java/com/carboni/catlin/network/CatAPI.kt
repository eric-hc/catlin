package com.carboni.catlin.network

import com.carboni.catlin.BuildConfig
import com.carboni.catlin.model.Cats
import retrofit2.http.GET
import rx.Observable

/**
 * Created by ericcarboni on 3/7/16.
 */
interface CatAPI {
    @GET("/api/images/get?format=xml&results_per_page=" + BuildConfig.MAX_IMAGES_PER_REQUEST) fun getCatImageUrls(): Observable<Cats>
}