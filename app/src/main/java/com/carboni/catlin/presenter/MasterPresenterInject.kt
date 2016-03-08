package com.carboni.catlin.presenter

/**
 * Created by ericcarboni on 3/7/16.
 */
class MasterPresenterInject {
    val masterPresenterImpl: MasterPresenterImpl by lazy { createMasterPresenterImpl() }

    protected fun createMasterPresenterImpl(): MasterPresenterImpl {
        return MasterPresenterImpl()
    }
}