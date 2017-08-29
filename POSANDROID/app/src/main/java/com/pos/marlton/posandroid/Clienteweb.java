package com.pos.marlton.posandroid;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Locoromoto on 29/08/2017.
 */

public class Clienteweb extends WebViewClient{

    public boolean shouldOverrideUrlLoading(WebView view, String url){
        if(Uri.parse(url).getHost().equals("http://dev.2x2clienttracker.droisys.info/")){
            return false;
        }
        Intent intento = new Intent(Intent.ACTION_VIEW,Uri.parse(url));

        return true;
    }

}
