package com.sega.sprin.modWF;

import android.util.Log;

import androidx.annotation.NonNull;

import com.appsflyer.AppsFlyerLib;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.sega.sprin.acWF.BuWF;

public class CoWF {

    private String statusWF = "ooo";
    private String urlWF;
    private String AIDWF;
    private String apps_idWF;
    BuWF buWF;

    public String getAIDWF() {
        return AIDWF;
    }

    public String getApps_idWF() {
        return apps_idWF;
    }

    public CoWF(BuWF buWF) {
        this.buWF = buWF;
    }

    public String getStatusWF() {
        return statusWF;
    }


    public String getUrlWF() {
        return urlWF;
    }

    public void hh(BuWF buWF){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    AIDWF = AdvertisingIdClient.getAdvertisingIdInfo(buWF.getApplicationContext()).getId();

                }catch (Exception e){

                }
            }
        }).start();

        apps_idWF = AppsFlyerLib.getInstance().getAppsFlyerUID(buWF.getApplicationContext());

        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.fullyInitialize();
        AppEventsLogger.activateApp(buWF.getApplication());
    }

    public void conWF(){
        FirebaseRemoteConfig mFirebaseRemoteConfigWF = FirebaseRemoteConfig.getInstance();
        FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder()
                .setMinimumFetchIntervalInSeconds(3600)
                .build();
        mFirebaseRemoteConfigWF.setConfigSettingsAsync(configSettings);
        mFirebaseRemoteConfigWF.fetchAndActivate()
                .addOnCompleteListener(buWF, new OnCompleteListener<Boolean>() {
                    @Override
                    public void onComplete(@NonNull Task<Boolean> task) {
                        if (task.isSuccessful()) {
                            statusWF = mFirebaseRemoteConfigWF.getString("sWf");
                            urlWF = mFirebaseRemoteConfigWF.getString("uWf");
                            Log.d("weq", statusWF);
                            Log.d("weq", urlWF);

                        } else {

                        }
                    }
                });
    }
}
