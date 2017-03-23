package com.jorgechuc.android.geoapp.model;

/**
 * Created by Edward on 23/03/2017.
 */

public class Pregunta {
    Integer mdIdResTexto;
    Boolean MRespuestaVerdadera;

    public Pregunta(){

    }
    public Pregunta(Integer mdIdResTexto, Boolean MRespuestaVerdadera) {
        this.mdIdResTexto = mdIdResTexto;
        this.MRespuestaVerdadera = MRespuestaVerdadera;
    }

    public Integer getMdIdResTexto() { return mdIdResTexto; }

    public void setMdIdResTexto(Integer mdIdResTexto) { this.mdIdResTexto = mdIdResTexto; }

    public Boolean getMRespuestaVerdadera() { return MRespuestaVerdadera; }

    public void setMRespuestaVerdadera(Boolean MRespuestaVerdadera) {
        this.MRespuestaVerdadera = MRespuestaVerdadera;
    }
}
