package com.sega.sprin.modWF;

import android.util.Log;

import androidx.annotation.Nullable;

import com.facebook.applinks.AppLinkData;
import com.sega.sprin.R;
import com.sega.sprin.acWF.BuWF;

import org.apache.commons.codec.binary.Base32;

public class ApDeWF {

    public String af_statusWf = "-";
    public String media_sourceWF;
    public String af_channelWF;
    public String campaignWF;
    public String strAppsFlyerWF = "-";
    public String devWF = "R9F8JJnBY59vRLfDr9mhGX";
    public String deepWF = null;
    public String strDeppWF = "-";

    public String getAf_statusWf() {
        return af_statusWf;
    }

    public void setAf_statusWf(String af_statusWf) {
        this.af_statusWf = af_statusWf;
    }

    public String getMedia_sourceWF() {
        return media_sourceWF;
    }

    public void setMedia_sourceWF(String media_sourceWF) {
        this.media_sourceWF = media_sourceWF;
    }

    public String getAf_channelWF() {
        return af_channelWF;
    }

    public void setAf_channelWF(String af_channelWF) {
        this.af_channelWF = af_channelWF;
    }

    public String getCampaignWF() {
        return campaignWF;
    }

    public void setCampaignWF(String campaignWF) {
        this.campaignWF = campaignWF;
    }

    public String getStrAppsFlyerWF() {
        return strAppsFlyerWF;
    }

    public void setStrAppsFlyerWF(String strAppsFlyerWF) {
        this.strAppsFlyerWF = strAppsFlyerWF;
    }

    public String getDeepWF() {
        return deepWF;
    }

    public void setDeepWF(String deepWF) {
        this.deepWF = deepWF;
    }

    public String getStrDeppWF() {
        return strDeppWF;
    }

    public void setStrDeppWF(String strDeppWF) {
        this.strDeppWF = strDeppWF;
    }


    public void kjk(BuWF buWF , CoWF coWF) {

        AppLinkData.fetchDeferredAppLinkData(buWF.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {

                if (appLinkData == null) {
                    appLinkData = AppLinkData.createFromActivity(buWF);

                }
                if (appLinkData != null) {

                    String[] csca = appLinkData.getTargetUri().toString().split("://");
                    setDeepWF(csca[1]);
                    setStrDeppWF(parseAP(deepWF, buWF,coWF));
                    Log.d("weq", getStrDeppWF());
                } else {

                }
            }
        });
    }

    public String parseAP(String ss, BuWF buWF,CoWF coWF) {
        String[] gf = ss.split("_");
        String[] iuj = {decodeWF("EZZXKYRRHU======"), decodeWF("EZZXKYRSHU======"), decodeWF("EZZXKYRTHU======"), decodeWF("EZZXKYRUHU======"), decodeWF("EZZXKYRVHU======"), decodeWF("EZZXKYRWHU======"), decodeWF("EZZXKYRXHU======"), decodeWF("EZZXKYRYHU======"), decodeWF("EZZXKYRZHU======"), decodeWF("EZZXKYRRGA6Q====")};
        StringBuilder stringBuilderWF = new StringBuilder();
        for (int i = 0; i< iuj.length;i++){
            try {
                stringBuilderWF.append(iuj[i]);
                stringBuilderWF.append(gf[i]);
            }catch (Exception e){

            }
        }
        String dd  = decodeWF("H5WWKZDJMFPXG33VOJRWKPI=") + getMedia_sourceWF() + stringBuilderWF +  decodeWF("EZRWC3LQMFUWO3R5")+ getCampaignWF() + decodeWF("EZTW633HNRSV6YLENFSD2===")+ coWF.getAIDWF() + decodeWF("EZQWMX3VONSXE2LEHU======") + coWF.getApps_idWF() +
                decodeWF("EZQWMX3DNBQW43TFNQ6Q====")+ getAf_channelWF() + decodeWF("EZSGK5S7NNSXSPI=") + devWF + decodeWF("EZRHK3TENRST2===") + buWF.getPackageName() + decodeWF("EZTGEX3BOBYF62LEHU======") + buWF.getResources().getString(R.string.f) + decodeWF("EZTGEX3BOQ6Q====") + buWF.getResources().getString(R.string.t);
        return dd;
    }

    public static String decodeWF(String scs) {
        Base32 base32WF = new Base32();
        byte[] decodedBytesWF = base32WF.decode(scs);
        return new String(decodedBytesWF);
    }
}
