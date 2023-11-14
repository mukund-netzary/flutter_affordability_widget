package com.example.razorpay

import android.content.Context
import android.util.Log
import  android.view.View
import android.widget.FrameLayout
import com.example.flutter_affordability_widget.BuildConfig

import com.razorpay.affordability.Widget
import io.flutter.plugin.platform.PlatformView
import org.json.JSONObject

internal class NativeView(
    context: Context,
    id: Int,
    creationParams: Map<String?, Any?>?
) : PlatformView {
    private val widget: Widget
    private val frameLayout: FrameLayout
    override fun getView(): View {
        return frameLayout
    }

    override fun dispose() {}

    init {
        widget = Widget(context)
        frameLayout = FrameLayout(context)
        frameLayout.addView(widget)
        Log.d("Razor Pay Debug", "RazorPay Key: ${BuildConfig.RAZORPAYKEY}")
        val widgetConfig = JSONObject(
            """
    {
        "key": ${BuildConfig.RAZORPAYKEY}, 
        "amount": 5000000,
        "currency": "INR"
    }
    """.trimIndent()
        )
        widget.render(context, widgetConfig)
    }
}