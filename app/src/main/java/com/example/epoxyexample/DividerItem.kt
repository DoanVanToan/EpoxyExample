package com.example.epoxyexample

import androidx.annotation.ColorRes
import androidx.annotation.DimenRes

/**
 * Created by toandv6 on 13/08/2020.
 * Copyright (c) {2020} VinID. All rights reserved.
 */

data class DividerItem(
    @ColorRes
    val backgroundColor: Int,
    @DimenRes
    val height: Int = R.dimen.divider_normal,
    @DimenRes
    val marginStart: Int = R.dimen.margin_2,
    @DimenRes
    val marginEnd: Int = R.dimen.margin_2,
    @DimenRes
    val marginBottom: Int = R.dimen.margin_0,
    @DimenRes
    val marginTop: Int = R.dimen.margin_0
)