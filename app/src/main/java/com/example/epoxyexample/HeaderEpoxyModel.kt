package com.example.epoxyexample

import android.view.View
import com.airbnb.epoxy.EpoxyModel
import com.airbnb.epoxy.EpoxyModelClass

/**
 * Created by toandv6 on 13/08/2020.
 * Copyright (c) {2020} VinID. All rights reserved.
 */

@EpoxyModelClass(layout = R.layout.item_header)
class HeaderEpoxyModel : EpoxyModel<View>() {
    override fun getDefaultLayout(): Int {
        TODO("Not yet implemented")
    }
}