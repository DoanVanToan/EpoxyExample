package com.example.epoxyexample

import com.airbnb.epoxy.TypedEpoxyController

/**
 * Created by toandv6 on 13/08/2020.
 * Copyright (c) {2020} VinID. All rights reserved.
 */

class MainController constructor(
    private val onDividerClickListener: OnDividerClickListener? = null,
    private val onHeaderClickListener: OnHeaderClickListener? = null,
    private val onLabelClickListener: OnLabelClickListener? = null
) : TypedEpoxyController<List<EpoxyRender>>() {
    override fun buildModels(data: List<EpoxyRender>?) {
        data?.forEachIndexed { index, item ->
            val model = item.generateModel().id(index)
            (model as? DividerBindingModel_)?.onDividerClickListener(onDividerClickListener)
            (model as? HeaderBindingModel_)?.onHeaderClickListener(onHeaderClickListener)
            (model as? InfomativeLabelBindingModel_)?.onLabelClickListener(onLabelClickListener)
            add(model)
        }
    }
}