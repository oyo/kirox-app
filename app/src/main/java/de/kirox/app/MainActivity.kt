package de.kirox.app

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Window
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        window.requestFeature(Window.FEATURE_NO_TITLE)
        val webView = WebView(this)
        val webSettings: WebSettings = webView.getSettings()
        webSettings.javaScriptEnabled = true
        //webView.loadUrl("http://192.168.1.102:3000/kirox/?mode=app")
        webView.loadUrl("https://oyo.github.io/kirox/?mode=app")
        this.setContentView(webView)
    }
}