package com.sega.sprin.modWF;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.sega.sprin.acWF.BuWF;

public class GwF {

    boolean kk = false;

    public boolean isKk() {
        return kk;
    }

    public void setKk(boolean kk) {
        this.kk = kk;
    }

    public void ggg(Button buttonIn, BuWF buWF){
        buttonIn.setVisibility(View.VISIBLE);
        buttonIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buWF.startActivity(new Intent(buWF.getApplicationContext(),BuWF.class));
                buWF.finishAffinity();
            }
        });
    }

    public void vvv(Button buttonOn,Button buttonAnd, Button buttonClo){
        buttonOn.setVisibility(View.VISIBLE);
        buttonAnd.setVisibility(View.VISIBLE);
        buttonClo.setVisibility(View.VISIBLE);
    }

    public void v1(int i, int j, int[][] ff) {

        try {
            if (ff[i][j] == ff[i][j - 1] && ff[i][j] == ff[i][j - 2]) {
                kk = true;
            }

        } catch (Exception e) {

        }
    }

    public void v2(int i, int j, int[][] ff) {
        try {

            if (ff[i][j] == ff[i][j + 1] && ff[i][j] == ff[i][j + 2]) {
                kk = true;
            }

        } catch (Exception e) {

        }
    }

    public void v3(int i, int j, int[][] ff) {

        try {
            if (ff[i][j] == ff[i][j - 1] && ff[i][j] == ff[i][j + 1]) {
                kk = true;
                ;
            }
        } catch (Exception e) {

        }
    }

    public void h1(int i, int j, int[][] ff) {

        try {
            if (ff[i][j] == ff[i + 1][j] && ff[i][j] == ff[i + 2][j]) {
                kk = true;
            }
        } catch (Exception e) {

        }
    }

    public void h2(int i, int j, int[][] ff) {

        try {
            if (ff[i][j] == ff[i - 1][j] && ff[i][j] == ff[i - 2][j]) {
                kk = true;
            }
        } catch (Exception e) {

        }
    }

    public void h3(int i, int j, int[][] ff) {

        try {
            if (ff[i][j] == ff[i - 1][j] && ff[i][j] == ff[i + 1][j]) {
                kk = true;
            }
        } catch (Exception e) {

        }
    }

    public void d1(int i, int j, int[][] ff) {
        try {
            if (ff[i][j] == ff[i + 1][j + 1] && ff[i][j] == ff[i + 2][j + 2]) {
                kk = true;
            }
        } catch (Exception e) {

        }
    }

    public void d2(int i, int j, int[][] ff) {
        try {
            if (ff[i][j] == ff[i - 1][j - 1] && ff[i][j] == ff[i - 2][j - 2]) {
                kk = true;
            }
        } catch (Exception e) {

        }
    }

    public void d3(int i, int j, int[][] ff) {
        try {
            if (ff[i][j] == ff[i + 1][j + 1] && ff[i][j] == ff[i - 1][j - 1]) {
                kk = true;
            }
        } catch (Exception e) {

        }
    }

    public void d4(int i, int j, int[][] ff) {
        try {
            if (ff[i][j] == ff[i - 1][j + 1] && ff[i][j] == ff[i - 2][j + 2]) {
                kk = true;
            }
        } catch (Exception e) {

        }
    }

    public void d5(int i, int j, int[][] ff) {
        try {
            if (ff[i][j] == ff[i + 1][j - 1] && ff[i][j] == ff[i + 2][j - 2]) {
                kk = true;
            }
        } catch (Exception e) {

        }
    }

    public void d6(int i, int j, int[][] ff) {
        try {
            if (ff[i][j] == ff[i - 1][j + 1] && ff[i][j] == ff[i + 1][j - 1]) {
                kk = true;
            }
        } catch (Exception e) {

        }
    }

}
