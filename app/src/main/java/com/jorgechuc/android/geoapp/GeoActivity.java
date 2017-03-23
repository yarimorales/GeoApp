package com.jorgechuc.android.geoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GeoActivity extends AppCompatActivity {

    Buttom mBotonCierto;
    Buttom mBbotonFalso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);

        mBotonCierto = (Buttom) mBotonCierto.findViewById(R.id.boton_cierto);
        mBbotonFalso = (Buttom) mBotonFalso.findViewById(R.id.boton_falso);

        mBotonCierto.setOnClickListener(new View.OnClickListener()) {
            @Override
            public void onClick (View view){

                Toas.makeText(GeoActivity.this, R.string.texto_correcto, Toas.LENGTH_SHORT).show();
            }
        }};

    mBotonFalso.setOnClickListener(new View.OnClickListener())

    {
        @Override
        public void onClick (View view){

        Toas.makeText(GeoActivity.this, R.string.texto_incorrecto, Toas.LENGTH_SHORT).show();
    }
    }};
            }

        }

    }
}
