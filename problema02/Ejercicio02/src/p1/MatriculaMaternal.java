/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import p2.Matricula;

/**
 *
 * @author reroes
 */
public class MatriculaMaternal extends Matricula {

    @Override
    public void establecerMatricula() {
        // tarifa = costo desayunos + costo almuerzo + costo medico
        matricula = 50.2 + 40.2 + 80.2;
    }

    @Override
    public void establecerTipo() {
        tipo = "Matricula maternal";
    }
}
