package com.sega.sprin.acWF;

import static com.sega.sprin.modWF.ApDeWF.decodeWF;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.sega.sprin.R;
import com.sega.sprin.vieWF.VieWF;

public class BuWF extends AppCompatActivity {

    public Button buttonOn, buttonAnd, buttonClo, buttonIn;
    ImageView cscs, csa, cscfds, csaa;
    public static VieWF vieWF;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buwf);
        cscs = findViewById(R.id.imageView);
        csa = findViewById(R.id.imageView4);
        cscfds = findViewById(R.id.imageView2);
        csaa = findViewById(R.id.imageView3);
        buttonIn = findViewById(R.id.buttonIn);
        buttonOn = findViewById(R.id.buttonOn);
        buttonAnd = findViewById(R.id.buttonAnd);
        buttonClo = findViewById(R.id.buttonClo);
        vieWF = new ViewModelProvider.AndroidViewModelFactory(getApplication()).create(VieWF.class);
        vieWF.innn(this);
        vieWF.ooo(this);
        vieWF.kkl(this);


        if (!getIntent().getBooleanExtra("vvv", false)) {
            if (vieWF.innnc()) {
                String osn = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(decodeWF("ONQXMZI="), decodeWF("NZXG4==="));
                if (osn.equals(decodeWF("NZXG4==="))){
                    vieWF.looo(cscs, csa, cscfds, csaa);
                    vieWF.jjj(this);
                }else {
                  vieWF.jks(osn);
                  startActivity(new Intent(getApplicationContext(), WeWF.class));
                   finishAffinity();
                }

            } else {
                vieWF.hhh(buttonIn, this);
            }
        } else {
            vieWF.vdvvd(buttonOn, buttonAnd, buttonClo);
        }


        buttonOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("dd", true);
                startActivity(intent);
            }
        });

        buttonAnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("dd", false);
                startActivity(intent);
            }
        });

        buttonClo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });


    }
}
