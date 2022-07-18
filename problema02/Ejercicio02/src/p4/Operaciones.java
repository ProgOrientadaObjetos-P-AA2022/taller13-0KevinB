/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p4;

import java.util.ArrayList;
import p1.*;
import p2.*;

/**
 *
 * @author SALA I
 */
public class Operaciones {

    private double promedioMatriculas;
    private ArrayList<Matricula> m;

    public void establecerMatriculas(ArrayList<Matricula> t) {
        m = t;
    }

    public ArrayList<Matricula> obtenerMatriculas() {
        return m;
    }

    public void establecerPromedioMatriculas() {
        double suma = 0;
        for (int i = 0; i < obtenerMatriculas().size(); i++) {
            suma = suma + obtenerMatriculas().get(i).obtenerMatricula();
        }
        promedioMatriculas = suma / obtenerMatriculas().size();

    }

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i < m.size(); i++) {
            cadena = String.format("%s\nTipo de matricula: %s\n"
                    + "Costo de matricula: %.2f\n",
                    cadena,
                    m.get(i).obtenerTipoMatricula(),
                    m.get(i).obtenerMatricula()
            );
        }
        cadena = String.format("%sPromedio de matricula: %.2f\n", 
                cadena, promedioMatriculas);
        return cadena;
    }
}
