package tareaJugadoresFutbol_GuillermoRodriguezMoreno.comparators;

import java.util.Comparator;

import tareaJugadoresFutbol_GuillermoRodriguezMoreno.clases.Jugador;

public class JugadorComparatorNumeroFaltas implements Comparator{

    @Override
    public int compare(Object arg0, Object arg1) {
    
        int resultado = 0;

        Jugador j1 = (Jugador) arg0;
        Jugador j2 = (Jugador) arg1;

        if(j1.getNumeroFaltas() > j2.getNumeroFaltas()){

            resultado = 1;
        }

        else if(j1.getNumeroFaltas() < j2.getNumeroFaltas()){

            resultado = -1;
        }

        else {

            resultado = j1.getNombreCompleto().compareTo(j2.getNombreCompleto());
        }

        return resultado;
    }
    
}