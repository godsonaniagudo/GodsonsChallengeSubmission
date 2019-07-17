package com.codefroyo.alcandroidproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_b.*
import android.webkit.WebView
import android.net.http.SslError
import android.webkit.SslErrorHandler





class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        supportActionBar!!.title = "About ALC"

        aboutALC_webview.webViewClient = MyWebViewClient()
        aboutALC_webview.settings.javaScriptEnabled = true
        aboutALC_webview.settings.domStorageEnabled = true
        aboutALC_webview.settings.loadWithOverviewMode = true
        aboutALC_webview.settings.useWideViewPort = true
        aboutALC_webview.webChromeClient = WebChromeClient()




        aboutALC_webview.loadUrl("https://andela.com/alc")
    }



}

class MyWebViewClient : WebViewClient() {
    override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
        view.loadUrl(url)
        return super.shouldOverrideUrlLoading(view, url)
    }

    override fun onReceivedSslError(view: WebView, handler: SslErrorHandler?, error: SslError) {
        // ignore ssl error
        if (handler != null) {
            handler.proceed()
        } else {
            super.onReceivedSslError(view, null, error)
        }
    }
}
