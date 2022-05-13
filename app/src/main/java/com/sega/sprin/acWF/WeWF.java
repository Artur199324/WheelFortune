package com.sega.sprin.acWF;

import static com.sega.sprin.acWF.BuWF.vieWF;
import static com.sega.sprin.modWF.ApDeWF.decodeWF;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.sega.sprin.R;

public class WeWF extends AppCompatActivity {


    @Override
    protected void onActivityResult(int dcsa, int cscsu, @Nullable Intent cssa) {
        if (dcsa != yyyyyy || rrrrr == null) {
            super.onActivityResult(dcsa, cscsu, cssa);
            return;
        }
        Uri[] csaaxa = null;
        if (cscsu == Activity.RESULT_OK) {
            if (cssa == null) {
                if (ttttt != null) {
                    csaaxa = new Uri[]{Uri.parse(ttttt)};
                }
            } else {
                String vsaax = cssa.getDataString();
                if (vsaax != null) {
                    csaaxa = new Uri[]{Uri.parse(vsaax)};
                }
            }
        }
        rrrrr.onReceiveValue(csaaxa);
        rrrrr = null;
        if (qqqqq == null) {
            super.onActivityResult(dcsa, cscsu, cssa);
            return;
        }
        Uri csaa = null;
        try {
            if (cscsu != RESULT_OK) {
                csaa = null;
            } else {
                csaa = cssa == null ? wwwww : cssa.getData();
            }
        } catch (Exception e) {
        }
        qqqqq.onReceiveValue(csaa);
        qqqqq = null;
    }

    WebView webViewFullAppWF;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wewf);
        webViewFullAppWF = findViewById(R.id.webViewFullAppWF);
        jjk(webViewFullAppWF);
        jfjd(webViewFullAppWF);
    }

    public void jjk(WebView webViewFullAppWF) {

        webViewFullAppWF.getSettings().setAllowContentAccess(true);
        webViewFullAppWF.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webViewFullAppWF.getSettings().setSupportMultipleWindows(false);
        webViewFullAppWF.getSettings().setBuiltInZoomControls(true);
        webViewFullAppWF.getSettings().setUseWideViewPort(true);
        webViewFullAppWF.getSettings().setAppCacheEnabled(true);
        webViewFullAppWF.getSettings().setDisplayZoomControls(false);
        webViewFullAppWF.getSettings().setAllowFileAccess(true);
        webViewFullAppWF.getSettings().setLightTouchEnabled(true);
        webViewFullAppWF.getSettings().setJavaScriptEnabled(true);
        webViewFullAppWF.getSettings().setDomStorageEnabled(true);
        webViewFullAppWF.clearCache(false);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webViewFullAppWF, true);
        ;
        webViewFullAppWF.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onShowFileChooser(WebView view,
                                             ValueCallback<Uri[]> csabc,
                                             FileChooserParams cscscs) {
                if (rrrrr != null) {
                    rrrrr.onReceiveValue(null);
                }
                rrrrr = csabc;
                Intent csacsa = new Intent(Intent.ACTION_GET_CONTENT);
                csacsa.addCategory(Intent.CATEGORY_OPENABLE);
                csacsa.setType("*/*");
                Intent[] bbbbb = new Intent[0];
                Intent ggggg = new Intent(Intent.ACTION_CHOOSER);
                ggggg.putExtra(Intent.EXTRA_INTENT, csacsa);
                ggggg.putExtra(Intent.EXTRA_TITLE, decodeWF("KNSWYZLDOQQE64DUNFXW4OQ="));
                ggggg.putExtra(Intent.EXTRA_INITIAL_INTENTS, bbbbb);
                startActivityForResult(ggggg, 1);
                return true;
            }
        });
        webViewFullAppWF.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                if (url.contains(decodeWF("MVZHE33SHVQXA4DBMZAXGM3G")) || url.contains(decodeWF("MRUXGYLCNRSWILTIORWWY==="))) {
                    Intent intent = new Intent(getApplicationContext(), BuWF.class);
                    intent.putExtra("vvv", true);
                    startActivity(intent);
                    finishAffinity();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (webViewFullAppWF.isFocused() && webViewFullAppWF.canGoBack()) {
            webViewFullAppWF.goBack();
        }
    }

    public static ValueCallback<Uri> qqqqq;
    public static Uri wwwww = null;
    public static ValueCallback<Uri[]> rrrrr;
    public static String ttttt;
    public static final int yyyyyy = 1;

    public void jfjd(WebView webViewFullAppWF) {
        webViewFullAppWF.loadUrl(vieWF.ddk());
    }
}
