package com.example.epoxyexample

/**
 * Created by toandv6 on 13/08/2020.
 * Copyright (c) {2020} VinID. All rights reserved.
 */

interface OnHeaderClickListener {
    fun onClick(item: HeaderItem?)
}

interface OnLabelClickListener {
    fun onClick(item: LabelItem?)
}

interface OnDividerClickListener {
    fun onClick()
}