package com.carboni.catlin.network

import com.carboni.catlin.model.Cats
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import rx.Observable

/**
 * Created by ericcarboni on 3/7/16.
 */
class CatAPINetwork {
    fun getExec(): Observable<Cats> {
        val retrofit = Retrofit.Builder()
                .baseUrl ("http://thecatapi.com")
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()
        val catAPI: CatAPI = retrofit.create(CatAPI::class.java)
        return catAPI.getCatImageUrls().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
    }
}