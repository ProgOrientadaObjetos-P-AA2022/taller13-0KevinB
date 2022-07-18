/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

/**
 *
 * @author reroes
 */
public abstract class Matricula {

    protected double matricula;
    protected String tipo;

    public abstract void establecerMatricula();
    public abstract void establecerTipo();

    public double obtenerMatricula() {
        return matricula;
    }
    public String obtenerTipoMatricula() {
        return tipo;
    }
}
