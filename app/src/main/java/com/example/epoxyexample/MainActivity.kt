package com.example.epoxyexample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val provider = ExampleDataProvider()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val controller = MainController(
            onDividerClickListener = object : OnDividerClickListener {
                override fun onClick() {
                    Toast.makeText(this@MainActivity, "onDividerClick", Toast.LENGTH_SHORT).show()
                }
            },
            onHeaderClickListener = object : OnHeaderClickListener {
                override fun onClick(item: HeaderItem?) {
                    Toast.makeText(
                        this@MainActivity,
                        "onHeaderClick ${item?.title}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            },
            onLabelClickListener = object : OnLabelClickListener {
                override fun onClick(item: LabelItem?) {
                    Toast.makeText(
                        this@MainActivity,
                        "onLabelClick ${item?.title}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        )
        setContentView(R.layout.activity_main)
        rvSample.setController(controller)

        btnChangeData.setOnClickListener {
            controller.setData(provider.provide())
        }
    }
}
