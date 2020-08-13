package com.example.epoxyexample

/**
 * Created by toandv6 on 13/08/2020.
 * Copyright (c) {2020} VinID. All rights reserved.
 */

data class LabelItem(
    var title: String,
    var subTitle: String? = null,
    var description: CharSequence? = null
) :Item {
    fun hasSubTitle(): Boolean {
        return !subTitle.isNullOrEmpty()
    }

    fun hasDes(): Boolean {
        return !description.isNullOrEmpty()
    }
}