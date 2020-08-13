package com.example.epoxyexample

import com.airbnb.epoxy.DataBindingEpoxyModel

/**
 * Created by toandv6 on 13/08/2020.
 * Copyright (c) {2020} VinID. All rights reserved.
 */

data class LabelItem(
    var title: String,
    var subTitle: String? = null,
    var description: CharSequence? = null
) : EpoxyRender {
    override fun generateModel(): DataBindingEpoxyModel {
        return InfomativeLabelBindingModel_()
            .item(this@LabelItem)
    }

    fun hasSubTitle(): Boolean {
        return !subTitle.isNullOrEmpty()
    }

    fun hasDes(): Boolean {
        return !description.isNullOrEmpty()
    }
}