package com.sega.sprin.modWF;

import static com.sega.sprin.modWF.ApDeWF.decodeWF;

import com.sega.sprin.acWF.BuWF;

public class GHK {

    String loadWF;

    public String getLoadWF() {
        return loadWF;
    }

    public void setLoadWF(String loadWF, BuWF buWF) {
        this.loadWF = loadWF;
        buWF.getSharedPreferences(buWF.getPackageName(), buWF.MODE_PRIVATE).edit().putString(decodeWF("ONQXMZI="), loadWF).apply();
    }

    public void setLoadWF(String loadWF) {
        this.loadWF = loadWF;

    }


}
