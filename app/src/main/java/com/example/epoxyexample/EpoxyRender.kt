package com.example.epoxyexample

import com.airbnb.epoxy.DataBindingEpoxyModel

/**
 * Created by toandv6 on 13/08/2020.
 * Copyright (c) {2020} VinID. All rights reserved.
 */

interface EpoxyRender {
    fun generateModel(): DataBindingEpoxyModel
}