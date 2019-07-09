package com.example.viikko11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView browser;
    EditText text;
    Button button;
    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.editText);
        browser = findViewById(R.id.webView);
        browser.setWebViewClient(new WebViewClient());
        browser.getSettings().setJavaScriptEnabled(true);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

    }

    public void onClick(View v) {
        String url = "http://" + text.getText().toString();
        browser.loadUrl(url);

    }

    public void refresh(View v) {
        String url = "http://" + text.getText().toString();
        browser.loadUrl(url);

    }
}
