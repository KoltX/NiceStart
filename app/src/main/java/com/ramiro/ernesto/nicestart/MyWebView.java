package com.ramiro.ernesto.nicestart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * @author ernesto
 */
public class MyWebView extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        myWebView = (WebView) findViewById(R.id.wv1);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://console.dialogflow.com/api-client/demo/embedded/fb934939-194a-49df-9e41-b20a3a1ba073");

    }
}



//        myWebView.loadUrl("https://console.dialogflow.com/api-client/demo/embedded/fb934939-194a-49df-9e41-b20a3a1ba073");
////      myWebView.loadUrl("https://google.es");
//        myWebView.setWebViewClient(new WebViewClient());
//        myWebView.loadData("<iframe\n" +
//                        "    allow=\"microphone;\"\n" +
////                        "    width=\"350\"\n" +
////                        "    height=\"430\"\n" +
//                        "    width=\"100%\"\n" +
//                        "    height=\"100%\"\n" +
//                "    src=\"https://console.dialogflow.com/api-client/demo/embedded/fb934939-194a-49df-9e41-b20a3a1ba073\">\n" +
////                        "    src=\"https://console.dialogflow.com/api-client/demo/embedded/ad0227a0-d37d-4437-9761-899ad31d42d1\">\n" +
//                        "</iframe>\n", "text/html",
//
//           "utf-8");