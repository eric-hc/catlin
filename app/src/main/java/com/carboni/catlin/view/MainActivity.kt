package com.carboni.catlin.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.Toolbar
import com.carboni.catlin.R
import com.carboni.catlin.presenter.MasterPresenterImpl
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.find

class MainActivity : AppCompatActivity() {

    lateinit var toolbar: Toolbar

    private val imagesAdapterImpl: ImagesAdapterImpl by lazy {
        ImagesAdapterImpl()
    }

    private val masterPresenterImpl: MasterPresenterImpl by lazy {
        MasterPresenterImpl()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = find(R.id.toolbar)
        setSupportActionBar(toolbar)

        initRecyclerView()
        connectingToMasterPresenter()
        getURLs()
    }

    override fun onDestroy() {
        imagesAdapterImpl.unsubscribe()
        super.onDestroy()
    }

    private fun initRecyclerView() {
        containerRecyclerView.layoutManager = GridLayoutManager(this, 1);
        containerRecyclerView.adapter = imagesAdapterImpl
    }

    private fun connectingToMasterPresenter() {
        masterPresenterImpl.connect(imagesAdapterImpl)
    }

    private fun getURLs() {
        masterPresenterImpl.getMasterRequest()
    }
}
