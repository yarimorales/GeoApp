package com.jorgechuc.android.geoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jorgechuc.android.model.Pregunta;

public class GeoActivity extends AppCompatActivity {

    Buttom mBotonCierto;
    Buttom mBotonFalso;
    Button mBotonSiguiente;
    Button mTextoPregunta;

    public GeoActivity(Pregunta[] mBancoDePreguntas) {this.mBancoDePreguntas = mBancoDePreguntas;}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);

        mBotonCierto = (Buttom) mBotonCierto.findViewById(R.id.boton_cierto);
        mBbotonFalso = (Buttom) mBotonFalso.findViewById(R.id.boton_falso);
        mBotonSiguiente = (Buttom) mBotonSiguiente.findViewById(R.id.boton_siguiente);
        mTextoPregunta = (TexView) mTextoPregunta.findViewById(R.id.texto_pregunta);

        mBotonCierto.setOnClickListener(new View.OnClickListener()) {
            @Override
            public void onClick (View view){

                verificarRespuesta(true);

                //Toas.makeText(GeoActivity.this,R.string.texto_correcto, Toas.LENGTH_SHORT).show();
            }
        }};

    mBotonFalso.setOnClickListener(new View.OnClickListener())

    {
        @Override
        public void onClick (View view){

        verificarRespuesta(false);

        //Toas.makeText(GeoActivity.this,R.string.texto_incorrecto, Toas.LENGTH_SHORT).show();
    }
    }};

    mBotonSiguiente.setOnClickListener(new View.OnClickListener()){
@Override
public void onClick(View view){
        mPpreguntaActual=mPreguntaActual+1;
        if(mPreguntaActual==mBancoDePreguntas.length){
        mPreguntaActual=0;
        }

        actualizarPregunta();


        }
        }};


}
        private void setContenView(int activity_geo){
        }

        private Pregunta mBancoDePreguntas[] = {

        new Pregunta(R.string.texto_pregunta_1,false),
        new Pregunta(R.string.texto_pregunta_2,true),
        new Pregunta(R.string.texto_pregunta_3,true),
        new Pregunta(R.string.texto_pregunta_4,true),
        new Pregunta(R.string.texto_pregunta_5,false),
            };

        private int mPreguntaActual = 0;

        private void actualizarPregunta(){
        int preguntaActual=mBancoDePreguntas[mPreguntaActual].getMdIdResTexto();
        mTextoPregunta.setText(preguntaActual);
        }

        private void verificarRespuesta (boolean botonOprimido) {

        boolean respuestaVerdadera = mBancoDePreguntas[mPreguntaActual].getMRespuestaVerdadera();
        if (botonOprimido == respuestaVerdadera){

        //Toas.makeText(GeoActivity.this,R.string.texto_correcto,Toas.LENGTH_SHORT).show();

        }else{

        //Toas.makeText(GeoActivity.this,R.string.texto_incorrecto,Toas.LENGTH_SHORT).show();

        }

    }
}
