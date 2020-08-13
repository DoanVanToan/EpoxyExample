package com.example.epoxyexample

import android.view.View
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import kotlin.math.roundToInt

/**
 * Created by toandv6 on 13/08/2020.
 * Copyright (c) {2020} VinID. All rights reserved.
 */

@BindingAdapter("bind:dividerItem")
fun View.bindDividerItem(item: DividerItem?) {
    if (item == null) return
    setBackgroundColor(ContextCompat.getColor(context, item.backgroundColor))
    val params = LinearLayout.LayoutParams(
        LinearLayout.LayoutParams.MATCH_PARENT,
        resources.getDimension(item.height).roundToInt()
    )
    params.marginStart = resources.getDimension(item.marginStart).roundToInt()
    params.marginEnd = resources.getDimension(item.marginEnd).roundToInt()
    params.topMargin = resources.getDimension(item.marginTop).roundToInt()
    params.bottomMargin = resources.getDimension(item.marginBottom).roundToInt()
    layoutParams = params
}