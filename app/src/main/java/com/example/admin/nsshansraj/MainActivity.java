package com.example.admin.nsshansraj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;
    private RecyclerView recyclerView;
    Intent intent;



    //
    // final android.app.ActionBar actionBar= getActionBar();
  /*  View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            actionBar.hide();
        }
    };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        setContentView(R.layout.activity_main);

        myWebView = (WebView) findViewById(R.id.webView);
        //recyclerView = (RecyclerView) findViewById(R.id.rec);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://www.hansrajcollege.ac.in/NSS/");
       /*myWebView.setOnTouchListener(new View.OnTouchListener() {
                                         @Override
                                         public boolean onTouch(View view, MotionEvent motionEvent) {
                                             if(view.getId()==R.id.webView && motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                                               /*  getSupportActionBar().hide();
                                                // Toast.makeText(MainActivity.this,"f",Toast.LENGTH_LONG).show();
                                                 }
                                             if(view.getId()==R.id.webView && motionEvent.getAction()==MotionEvent.ACTION_UP)
                                             {
                                                 getSupportActionBar().show();
                                                 //Toast.makeText(MainActivity.this,"f",Toast.LENGTH_LONG).show();
                                                  }*/
                                         //    }


                                        //     return false;
                                      //   }
                                     //});
        myWebView.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        intent=new Intent(this, EmailPasswordActivity.class);
        int id = item.getItemId();
            if(id==R.id.action_settings)
                startActivity(intent);
        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

}