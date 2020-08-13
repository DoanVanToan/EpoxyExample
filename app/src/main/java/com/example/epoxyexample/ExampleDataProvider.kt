package com.example.epoxyexample

/**
 * Created by toandv6 on 13/08/2020.
 * Copyright (c) {2020} VinID. All rights reserved.
 */

class ExampleDataProvider {
    var count = 0;
    val data = listOf(
        HeaderItem("Thông tin thanh toán"),
        LabelItem("Số tiền", "3,000,000đ"),
        DividerItem(),
        LabelItem("Phí thu hộ", "3,000đ"),
        DividerItem(),
        LabelItem("Tổng thanh toán", "3,003,000đ"),
        DividerItem(
            height = R.dimen.margin_1,
            marginStart = R.dimen.margin_0,
            marginEnd = R.dimen.margin_0
        ),
        HeaderItem("Thông tin học sinh"),
        LabelItem("Tên học sinh", "Phạm Văn Thành"),
        DividerItem(),
        LabelItem("Mã học sinh", "SSC0011223300"),
        DividerItem(
            height = R.dimen.margin_1,
            marginStart = R.dimen.margin_0,
            marginEnd = R.dimen.margin_0
        ),
        HeaderItem("Chi tiết kỳ hoá đơn"),
        LabelItem("Học phí 05/2020", "1,500,000đ"),
        DividerItem(),
        LabelItem("Học phí 06/2020", "1,500,000đ"),
        DividerItem(
            height = R.dimen.margin_1,
            marginStart = R.dimen.margin_0,
            marginEnd = R.dimen.margin_0
        ),
        HeaderItem("Thông tin giao dịch"),
        LabelItem("Nguồn tiền", "Ví Vinid Pay"),
        DividerItem(),
        LabelItem("Mã giao dịch", "202021010230102"),
        DividerItem(),
        LabelItem("Thời gian giao dịch ", "31/07/2020 - 11:25"),
        DividerItem(
            height = R.dimen.margin_2,
            marginStart = R.dimen.margin_0,
            marginEnd = R.dimen.margin_0
        )
    )

    fun provide(): List<EpoxyRender> {
        return if (count % 2 == 0) {
            count = 1
            mutableListOf<EpoxyRender>().apply {
                addAll(data)
                addAll(data)
            }
        } else {
            count = 0
            data
        }
    }
}