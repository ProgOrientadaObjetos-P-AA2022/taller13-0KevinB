/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class Operaciones {

    public double total;
    public double caro;
    public String marca;

    public void establecerPrecioTvs(ArrayList<Televisor> t) {
        total = 0;
        for (int i = 0; i < t.size(); i++) {
            total = total + t.get(i).obtenerPrecio();
        }
    }

    public double obtenerTotalPrecioTvs() {
        return total;
    }

    public void establecerMasCaro(ArrayList<Televisor> t) {
        caro = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).obtenerPrecio() > caro) {
                caro = t.get(i).obtenerPrecio();
            }
        }
    }

    public double obtenerTvMasCaro() {
        return caro;
    }

    public void establecerListaMarcasVendidas(ArrayList<Televisor> t) {
        marca = "";
        for (int i = 0; i < t.size(); i++) {
            marca = String.format("%s%s\n", marca, t.get(i).obtenerMarca());
        }
    }

    public String obtenerMarcasVendidas() {
        return marca;
    }
}
