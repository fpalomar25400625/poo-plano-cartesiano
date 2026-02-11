/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ferna
 */
public class Punto1 {

    // Subtema 2.1 — Atributos privados (encapsulamiento)
    private final String etiqueta;
    private final int x;
    private final int y;

    // Subtema 2.5 — Constructor con parámetros
    public Punto1 (String etiqueta, int x, int y) {
        this.etiqueta = etiqueta; // Subtema 2.3 — this
        this.x = x;
        this.y = y;
    }

    // Subtema 2.4 — Métodos de acceso (getters) con retorno de valores
    public String getEtiqueta() {
        return etiqueta;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Representación textual: etiqueta(x,y) ej. A(3,-5)
    @Override
    public String toString() {
        return etiqueta + "(" + x + "," + y + ")";
    }

}
