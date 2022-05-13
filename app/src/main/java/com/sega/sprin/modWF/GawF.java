package com.sega.sprin.modWF;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.sega.sprin.R;
import com.sega.sprin.acWF.BuWF;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GawF {
    int a;
    int b;
    boolean intWF;
    boolean bb = false;
    int vvv = 0;

    public boolean isBb() {
        return bb;
    }

    public void setBb(boolean bb) {
        this.bb = bb;
    }

    public boolean isIntWF() {
        return intWF;
    }

    public void loadingWF(ImageView csca, ImageView cscac, ImageView hrge, ImageView teda) {


        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                vvv++;

                switch (vvv) {
                    case 1:
                        csca.setVisibility(View.VISIBLE);
                        hrge.setVisibility(View.INVISIBLE);
                        break;
                    case 2:
                        cscac.setVisibility(View.VISIBLE);
                        teda.setVisibility(View.INVISIBLE);

                        break;
                    case 3:
                        hrge.setVisibility(View.VISIBLE);
                        csca.setVisibility(View.INVISIBLE);

                        break;
                    case 4:
                        cscac.setVisibility(View.INVISIBLE);
                        teda.setVisibility(View.VISIBLE);
                        vvv = 0;
                        break;
                }

                if (!bb) {
                    handler.postDelayed(this::run, 1000);
                } else {
                    csca.setVisibility(View.INVISIBLE);
                    cscac.setVisibility(View.INVISIBLE);
                    hrge.setVisibility(View.INVISIBLE);
                    teda.setVisibility(View.INVISIBLE);
                }
            }
        });

    }

    public void init(BuWF buWF) {
        String cs = Context.CONNECTIVITY_SERVICE;
        ConnectivityManager cm = (ConnectivityManager) buWF.getSystemService(cs);
        if (cm.getActiveNetworkInfo() == null) {
            intWF = false;
        } else {
            intWF = true;
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void gg(List<ArrayList<ImageView>> lists, int[][] ff) {
        Random caca = new Random();
        a = caca.nextInt(3);
        b = caca.nextInt(3);
        if (ff[a][b] != 1 && ff[a][b] != 2) {
            ff[a][b] = 2;
            ImageView imageView = lists.get(a).get(b);
            imageView.setImageResource(R.drawable.gg);
            imageView.setClickable(false);

        } else {

            for (int j = 0; j < ff.length; j++) {
                if (ff[j][j] != 1 && ff[j][j] != 2) {

                    ff[j][j] = 2;
                    a = j;
                    b = j;
                    ImageView imageView = lists.get(j).get(j);
                    imageView.setImageResource(R.drawable.gg);
                    imageView.setClickable(false);

                    break;
                }

            }

        }

    }
}
