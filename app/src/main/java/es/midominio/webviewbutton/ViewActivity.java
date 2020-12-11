package es.midominio.webviewbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class ViewActivity extends AppCompatActivity {

    WebView miVisorWeb;
    String url = "https://www3.gobiernodecanarias.org/medusa/evagd/base/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        //Intent a=getIntent();
        miVisorWeb = (WebView) findViewById(R.id.visorWeb);
        final WebSettings ajustesVisorWeb = miVisorWeb.getSettings();
        ajustesVisorWeb.setJavaScriptEnabled(true);
        miVisorWeb.loadUrl(url);
    }
}