package com.example.epoxyexample

/**
 * Created by toandv6 on 13/08/2020.
 * Copyright (c) {2020} VinID. All rights reserved.
 */

data class HeaderItem(
    val title: String,
    val subTitle: String? = null
) {
    fun hasSubTitle(): Boolean {
        return !subTitle.isNullOrEmpty()
    }
}