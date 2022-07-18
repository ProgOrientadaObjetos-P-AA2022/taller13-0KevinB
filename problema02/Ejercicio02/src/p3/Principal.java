/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.*;
import p2.Matricula;
import p4.Operaciones;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerMatricula();
        mcamp.establecerTipo();

        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerMatricula();
        mcolegio.establecerTipo();

        MatriculaEscuela mescuela = new MatriculaEscuela();
        mescuela.establecerMatricula();
        mescuela.establecerTipo();

        MatriculaJardin mjardin = new MatriculaJardin();
        mjardin.establecerMatricula();
        mjardin.establecerTipo();

        MatriculaMaternal mmaternal = new MatriculaMaternal();
        mmaternal.establecerMatricula();
        mmaternal.establecerTipo();
        MatriculaMaternal mmaterna2 = new MatriculaMaternal();
        mmaterna2.establecerMatricula();
        mmaterna2.establecerTipo();

        Operaciones tipos = new Operaciones();
        ArrayList<Matricula> t = new ArrayList<>();
        t.add(mcamp);
        t.add(mcolegio);
        t.add(mescuela);
        t.add(mjardin);
        t.add(mmaternal);
        t.add(mmaterna2);

        tipos.establecerMatriculas(t);
        tipos.establecerPromedioMatriculas();
        System.out.printf("%s\n", tipos);
    }
}
