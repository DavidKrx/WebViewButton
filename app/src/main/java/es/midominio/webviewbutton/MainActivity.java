package es.midominio.webviewbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button toGoWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toGoWebView= (Button)findViewById(R.id.button);

       // toGoWebView.setOnClickListener(new View.OnClickListener() {

       // });

    }
    public void onClickView(View view) {
        Intent intent = new Intent(this, ViewActivity.class);
        startActivity(intent);
    }



}