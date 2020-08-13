package com.example.epoxyexample

import com.airbnb.epoxy.DataBindingEpoxyModel

/**
 * Created by toandv6 on 13/08/2020.
 * Copyright (c) {2020} VinID. All rights reserved.
 */

data class HeaderItem(
    var title: String,
    var subTitle: String? = null
) : EpoxyRender {
    override fun generateModel(): DataBindingEpoxyModel {
        return HeaderBindingModel_()
            .item(this@HeaderItem)
    }

    fun hasSubTitle(): Boolean {
        return !subTitle.isNullOrEmpty()
    }
}