package com.alexis.webalexis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebView url = (WebView)findViewById(R.id.web);

        url.setWebViewClient(new mostrando( ));
        Bundle obtener=getIntent().getExtras();
        String nombre2 = obtener.getString("llama");
        url.getSettings().setLoadsImagesAutomatically(true);
        url.getSettings().setJavaScriptEnabled(true);
        url.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        url.loadUrl(nombre2);
    }
    private class mostrando extends WebViewClient {
        public boolean url1(WebView view,String url){
            view.loadUrl(url);
            return true;
        }
    }
}