package com.sega.sprin.acWF;

import static com.sega.sprin.acWF.BuWF.vieWF;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.sega.sprin.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ImageView im1, im2, im3, im4, im5, im6, im7, im8, im9;
    int mm[][];
    List<ArrayList<ImageView>> lists;
    ArrayList<ImageView> arrayList1;
    ArrayList<ImageView> arrayList2;
    ArrayList<ImageView> arrayList3;
    boolean ff = true;
    boolean p1 = false;
    boolean p2 = false;
    TextView csca, cscaca, cacau, refs;
    int countWF = 0;
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);

        mm = new int[3][3];
        lists = new ArrayList<>();
        arrayList1 = new ArrayList<>();
        arrayList2 = new ArrayList<>();
        arrayList3 = new ArrayList<>();
        im1 = findViewById(R.id.im1);
        im2 = findViewById(R.id.im2);
        im3 = findViewById(R.id.im3);
        im4 = findViewById(R.id.im4);
        im5 = findViewById(R.id.im5);
        im6 = findViewById(R.id.im6);
        im7 = findViewById(R.id.im7);
        im8 = findViewById(R.id.im8);
        im9 = findViewById(R.id.im9);
        refs = findViewById(R.id.textViewp4);
        csca = findViewById(R.id.textViewp1);
        cscaca = findViewById(R.id.textViewp2);
        cacau = findViewById(R.id.textViewp3);
        button = findViewById(R.id.button);
        boolean ss = getIntent().getBooleanExtra("dd", true);
        if (ss) {
            gaWF();
        } else {
            gamWF();
        }


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ss) {
                    gaWF();
                } else {
                    gamWF();
                }
            }
        });

    }


    public void gamWF() {
        oo();
        ff = true;
        p1 = false;
        p2 = false;
        vieWF.kk(false);
        arrayList1.add(im1);
        arrayList1.add(im2);
        arrayList1.add(im3);
        arrayList2.add(im4);
        arrayList2.add(im5);
        arrayList2.add(im6);
        arrayList3.add(im7);
        arrayList3.add(im8);
        arrayList3.add(im9);
        lists.add(arrayList1);
        lists.add(arrayList2);
        lists.add(arrayList3);
        refs.setVisibility(View.INVISIBLE);
        csca.setVisibility(View.INVISIBLE);

        for (int i = 0; i < mm.length; i++) {
            for (int j = 0; j < mm.length; j++) {
                mm[i][j] = 0;
            }
        }
        countWF = 0;
        im1.setImageResource(R.drawable.sss);
        im2.setImageResource(R.drawable.sss);
        im3.setImageResource(R.drawable.sss);
        im4.setImageResource(R.drawable.sss);
        im5.setImageResource(R.drawable.sss);
        im6.setImageResource(R.drawable.sss);
        im7.setImageResource(R.drawable.sss);
        im8.setImageResource(R.drawable.sss);
        im9.setImageResource(R.drawable.sss);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im1.setClickable(false);
                countWF++;
                mm[0][0] = 1;
                im1.setImageResource(R.drawable.ff);
                ff = false;

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        vieWF.jj(lists,mm);
                        countWF++;

                        p1 = vieWF.kk(0, 0, mm);
                        if (!p1){
                            p2 = vieWF.kk(vieWF.gA(), vieWF.gB(), mm);
                        }

                        if (p2) {
                            refs.setVisibility(View.VISIBLE);
                            bb();
                            button.setVisibility(View.VISIBLE);

                        }

                        if (p1) {
                            csca.setVisibility(View.VISIBLE);
                            bb();
                            button.setVisibility(View.VISIBLE);

                        }
                    }
                },1000);




            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im2.setClickable(false);
                countWF++;
                im2.setImageResource(R.drawable.ff);
                mm[0][1] = 1;

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        vieWF.jj(lists,mm);
                        countWF++;
                        p1 = vieWF.kk(0, 1, mm);
                        if (!p1){
                            p2 = vieWF.kk(vieWF.gA(), vieWF.gB(), mm);
                        }

                        if (p2) {
                            refs.setVisibility(View.VISIBLE);
                            bb();
                            button.setVisibility(View.VISIBLE);
                            Log.d("weq","2");
                        }
                        if (p1) {
                            csca.setVisibility(View.VISIBLE);
                            bb();
                            button.setVisibility(View.VISIBLE);
                            Log.d("weq","1");
                        }
                    }
                },1000);



            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im3.setClickable(false);
                countWF++;
                im3.setImageResource(R.drawable.ff);
                mm[0][2] = 1;

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        vieWF.jj(lists,mm);
                        countWF++;
                        p1 = vieWF.kk(0, 2, mm);
                        if (!p1){
                            p2 = vieWF.kk(vieWF.gA(), vieWF.gB(), mm);
                        }

                        if (p2) {
                            refs.setVisibility(View.VISIBLE);
                            bb();
                            button.setVisibility(View.VISIBLE);

                        }
                        if (p1) {
                            csca.setVisibility(View.VISIBLE);
                            bb();
                            button.setVisibility(View.VISIBLE);

                        }
                    }
                },1000);



            }
        });
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im4.setClickable(false);
                countWF++;
                im4.setImageResource(R.drawable.ff);
                mm[1][0] = 1;

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        vieWF.jj(lists,mm);
                        countWF++;
                        p1 = vieWF.kk(1, 0, mm);
                        if (!p1){
                            p2 = vieWF.kk(vieWF.gA(), vieWF.gB(), mm);
                        }

                        if (p2) {
                            refs.setVisibility(View.VISIBLE);
                            bb();
                            button.setVisibility(View.VISIBLE);

                        }
                        if (p1) {
                            csca.setVisibility(View.VISIBLE);
                            bb();
                            button.setVisibility(View.VISIBLE);

                        }
                    }
                },1000);


            }
        });
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im5.setClickable(false);
                countWF++;
                im5.setImageResource(R.drawable.ff);
                mm[1][1] = 1;

                countWF++;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        vieWF.jj(lists,mm);

                        p1 = vieWF.kk(1, 1, mm);
                        if (!p1){
                            p2 = vieWF.kk(vieWF.gA(), vieWF.gB(), mm);
                        }

                        if (p2) {
                            refs.setVisibility(View.VISIBLE);
                            bb();
                            button.setVisibility(View.VISIBLE);

                        }
                        if (p1) {
                            csca.setVisibility(View.VISIBLE);
                            bb();
                            button.setVisibility(View.VISIBLE);

                        }
                    }
                },1000);


            }
        });
        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countWF++;
                im6.setClickable(false);
                im6.setImageResource(R.drawable.ff);
                mm[1][2] = 1;

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        countWF++;
                        vieWF.jj(lists,mm);
                        p1 = vieWF.kk(1, 2, mm);
                        if (!p1){
                            p2 = vieWF.kk(vieWF.gA(), vieWF.gB(), mm);
                        }

                        if (p2) {
                            refs.setVisibility(View.VISIBLE);
                            bb();
                            button.setVisibility(View.VISIBLE);

                        }
                        if (p1) {
                            csca.setVisibility(View.VISIBLE);
                            bb();
                            button.setVisibility(View.VISIBLE);

                        }

                    }
                },1000);

            }
        });
        im7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countWF++;
                im7.setClickable(false);
                im7.setImageResource(R.drawable.ff);
                mm[2][0] = 1;

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        countWF++;
                        vieWF.jj(lists,mm);
                        p1 = vieWF.kk(2, 0, mm);
                        if (!p1){
                            p2 = vieWF.kk(vieWF.gA(), vieWF.gB(), mm);
                        }

                        if (p2) {
                            refs.setVisibility(View.VISIBLE);
                            bb();
                            button.setVisibility(View.VISIBLE);

                        }
                        if (p1) {
                            csca.setVisibility(View.VISIBLE);
                            bb();
                            button.setVisibility(View.VISIBLE);

                        }
                    }
                },1000);


            }
        });
        im8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countWF++;
                im8.setClickable(false);
                im8.setImageResource(R.drawable.ff);
                mm[2][1] = 1;

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        countWF++;
                        vieWF.jj(lists,mm);
                        p1 = vieWF.kk(2, 1, mm);
                        if (!p1){
                            p2 = vieWF.kk(vieWF.gA(), vieWF.gB(), mm);
                        }

                        if (p2) {
                            refs.setVisibility(View.VISIBLE);
                            bb();
                            button.setVisibility(View.VISIBLE);
                        }
                        if (p1) {
                            csca.setVisibility(View.VISIBLE);
                            bb();
                            button.setVisibility(View.VISIBLE);
                        }
                    }
                },1000);


            }
        });
        im9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countWF++;
                im9.setClickable(false);
                im9.setImageResource(R.drawable.ff);
                mm[2][2] = 1;

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        countWF++;
                        vieWF.jj(lists,mm);
                        p1 = vieWF.kk(2, 2, mm);
                        if (!p1){
                            p2 = vieWF.kk(vieWF.gA(), vieWF.gB(), mm);
                        }

                        if (p2) {
                            refs.setVisibility(View.VISIBLE);
                            bb();
                            button.setVisibility(View.VISIBLE);
                        }
                        if (p1) {
                            csca.setVisibility(View.VISIBLE);
                            bb();
                            button.setVisibility(View.VISIBLE);
                        }
                    }
                },1000);

            }
        });


        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (countWF == 9) {
                    bb();
                    cacau.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                } else {
                    handler.postDelayed(this::run, 10);
                }
            }
        });

    }


    public void gaWF() {
        oo();
        ff = true;
        p1 = false;
        p2 = false;
        vieWF.kk(false);
        for (int i = 0; i < mm.length; i++) {
            for (int j = 0; j < mm.length; j++) {
                mm[i][j] = 0;
            }
        }
        countWF = 0;
        im1.setImageResource(R.drawable.sss);
        im2.setImageResource(R.drawable.sss);
        im3.setImageResource(R.drawable.sss);
        im4.setImageResource(R.drawable.sss);
        im5.setImageResource(R.drawable.sss);
        im6.setImageResource(R.drawable.sss);
        im7.setImageResource(R.drawable.sss);
        im8.setImageResource(R.drawable.sss);
        im9.setImageResource(R.drawable.sss);


        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im1.setClickable(false);
                countWF++;
                if (ff) {
                    mm[0][0] = 1;
                    im1.setImageResource(R.drawable.ff);
                    ff = false;
                    p1 = vieWF.kk(0, 0, mm);
                    if (p1) {
                        csca.setVisibility(View.VISIBLE);
                        bb();
                        button.setVisibility(View.VISIBLE);
                    }
                } else {
                    mm[0][0] = 2;
                    im1.setImageResource(R.drawable.gg);
                    ff = true;
                    p2 = vieWF.kk(0, 0, mm);
                    if (p2) {
                        cscaca.setVisibility(View.VISIBLE);
                        bb();
                        button.setVisibility(View.VISIBLE);
                    }
                }

            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im2.setClickable(false);
                countWF++;
                if (ff) {
                    ff = false;
                    im2.setImageResource(R.drawable.ff);
                    mm[0][1] = 1;
                    p1 = vieWF.kk(0, 1, mm);
                    if (p1) {
                        csca.setVisibility(View.VISIBLE);
                        bb();
                        button.setVisibility(View.VISIBLE);
                    }
                } else {
                    mm[0][1] = 2;
                    im2.setImageResource(R.drawable.gg);
                    ff = true;
                    p2 = vieWF.kk(0, 1, mm);
                    if (p2) {
                        cscaca.setVisibility(View.VISIBLE);
                        bb();
                        button.setVisibility(View.VISIBLE);
                    }
                }

            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im3.setClickable(false);
                countWF++;
                if (ff) {
                    ff = false;
                    im3.setImageResource(R.drawable.ff);
                    mm[0][2] = 1;
                    p1 = vieWF.kk(0, 2, mm);
                    if (p1) {
                        csca.setVisibility(View.VISIBLE);
                        bb();
                        button.setVisibility(View.VISIBLE);
                    }
                } else {
                    mm[0][2] = 2;
                    im3.setImageResource(R.drawable.gg);
                    ff = true;
                    p2 = vieWF.kk(0, 2, mm);
                    if (p2) {
                        cscaca.setVisibility(View.VISIBLE);
                        bb();
                        button.setVisibility(View.VISIBLE);
                    }

                }

            }
        });
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im4.setClickable(false);
                countWF++;
                if (ff) {
                    ff = false;
                    im4.setImageResource(R.drawable.ff);
                    mm[1][0] = 1;
                    p1 = vieWF.kk(1, 0, mm);
                    if (p1) {
                        csca.setVisibility(View.VISIBLE);
                        bb();
                        button.setVisibility(View.VISIBLE);
                    }
                } else {
                    ff = true;
                    im4.setImageResource(R.drawable.gg);
                    mm[1][0] = 2;
                    p2 = vieWF.kk(1, 0, mm);
                    if (p2) {
                        cscaca.setVisibility(View.VISIBLE);
                        bb();
                        button.setVisibility(View.VISIBLE);
                    }
                }

            }
        });
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im5.setClickable(false);
                countWF++;
                if (ff) {
                    ff = false;
                    im5.setImageResource(R.drawable.ff);
                    mm[1][1] = 1;
                    p1 = vieWF.kk(1, 1, mm);
                    if (p1) {
                        csca.setVisibility(View.VISIBLE);
                        bb();
                        button.setVisibility(View.VISIBLE);
                    }
                } else {
                    ff = true;
                    im5.setImageResource(R.drawable.gg);
                    mm[1][1] = 2;
                    p2 = vieWF.kk(1, 1, mm);
                    if (p2) {
                        cscaca.setVisibility(View.VISIBLE);
                        bb();
                        button.setVisibility(View.VISIBLE);
                    }
                }

            }
        });
        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countWF++;
                im6.setClickable(false);
                if (ff) {
                    ff = false;
                    im6.setImageResource(R.drawable.ff);
                    mm[1][2] = 1;
                    p1 = vieWF.kk(1, 2, mm);
                    if (p1) {
                        csca.setVisibility(View.VISIBLE);
                        bb();
                        button.setVisibility(View.VISIBLE);
                    }
                } else {
                    ff = true;
                    im6.setImageResource(R.drawable.gg);
                    mm[1][2] = 2;
                    p2 = vieWF.kk(1, 2, mm);
                    if (p2) {
                        cscaca.setVisibility(View.VISIBLE);
                        bb();
                        button.setVisibility(View.VISIBLE);
                    }
                }

            }
        });
        im7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countWF++;
                im7.setClickable(false);
                if (ff) {
                    ff = false;
                    im7.setImageResource(R.drawable.ff);
                    mm[2][0] = 1;
                    p1 = vieWF.kk(2, 0, mm);
                    if (p1) {
                        csca.setVisibility(View.VISIBLE);
                        bb();
                        button.setVisibility(View.VISIBLE);
                    }
                } else {
                    ff = true;
                    im7.setImageResource(R.drawable.gg);
                    mm[2][0] = 2;
                    p2 = vieWF.kk(2, 0, mm);
                    if (p2) {
                        cscaca.setVisibility(View.VISIBLE);
                        bb();
                        button.setVisibility(View.VISIBLE);
                    }
                }

            }
        });
        im8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countWF++;
                im8.setClickable(false);
                if (ff) {
                    ff = false;
                    im8.setImageResource(R.drawable.ff);
                    mm[2][1] = 1;
                    p1 = vieWF.kk(2, 1, mm);
                    if (p1) {
                        csca.setVisibility(View.VISIBLE);
                        bb();
                        button.setVisibility(View.VISIBLE);
                    }
                } else {
                    ff = true;
                    im8.setImageResource(R.drawable.gg);
                    mm[2][1] = 2;
                    p2 = vieWF.kk(2, 1, mm);
                    if (p2) {
                        cscaca.setVisibility(View.VISIBLE);
                        bb();
                        button.setVisibility(View.VISIBLE);
                    }
                }

            }
        });
        im9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countWF++;
                im9.setClickable(false);
                if (ff) {
                    ff = false;
                    im9.setImageResource(R.drawable.ff);
                    mm[2][2] = 1;
                    p1 = vieWF.kk(2, 2, mm);
                    if (p1) {
                        csca.setVisibility(View.VISIBLE);
                        bb();
                        button.setVisibility(View.VISIBLE);
                    }
                } else {
                    ff = true;
                    im9.setImageResource(R.drawable.gg);
                    mm[2][2] = 2;
                    p2 = vieWF.kk(2, 2, mm);
                    if (p2) {
                        cscaca.setVisibility(View.VISIBLE);
                        bb();
                        button.setVisibility(View.VISIBLE);
                    }
                }

            }
        });

        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (countWF == 9) {
                    bb();
                    cacau.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                } else {
                    handler.postDelayed(this::run, 10);
                }
            }
        });

    }

    public void bb() {
        im1.setVisibility(View.INVISIBLE);
        im2.setVisibility(View.INVISIBLE);
        im3.setVisibility(View.INVISIBLE);
        im4.setVisibility(View.INVISIBLE);
        im5.setVisibility(View.INVISIBLE);
        im6.setVisibility(View.INVISIBLE);
        im7.setVisibility(View.INVISIBLE);
        im8.setVisibility(View.INVISIBLE);
        im9.setVisibility(View.INVISIBLE);

    }

    public void oo() {
        im1.setVisibility(View.VISIBLE);
        im2.setVisibility(View.VISIBLE);
        im3.setVisibility(View.VISIBLE);
        im4.setVisibility(View.VISIBLE);
        im5.setVisibility(View.VISIBLE);
        im6.setVisibility(View.VISIBLE);
        im7.setVisibility(View.VISIBLE);
        im8.setVisibility(View.VISIBLE);
        im9.setVisibility(View.VISIBLE);
        button.setVisibility(View.INVISIBLE);
        csca.setVisibility(View.INVISIBLE);
        cscaca.setVisibility(View.INVISIBLE);
        cacau.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), BuWF.class);
        intent.putExtra("vvv", true);
        startActivity(intent);
        finishAffinity();
    }
}