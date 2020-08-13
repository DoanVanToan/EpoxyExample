package com.example.epoxyexample

import androidx.annotation.ColorRes
import androidx.annotation.DimenRes
import com.airbnb.epoxy.DataBindingEpoxyModel

/**
 * Created by toandv6 on 13/08/2020.
 * Copyright (c) {2020} VinID. All rights reserved.
 */

data class DividerItem(
    @ColorRes
    var backgroundColor: Int = R.color.gray_500,
    @DimenRes
    var height: Int = R.dimen.divider_normal,
    @DimenRes
    var marginStart: Int = R.dimen.margin_2,
    @DimenRes
    var marginEnd: Int = R.dimen.margin_2,
    @DimenRes
    var marginBottom: Int = R.dimen.margin_0,
    @DimenRes
    var marginTop: Int = R.dimen.margin_0
) : EpoxyRender {
    override fun generateModel(): DataBindingEpoxyModel {
        return DividerBindingModel_().item(this@DividerItem)
    }
}