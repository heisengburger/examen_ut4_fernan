package ets.examen.parte2;

import javax.swing.*;

/**
 * The type Cono.
 */
public class Cono {
    private float radioBase;
    private float altura;

    /**
     * Instantiates a new Cono.
     */
    public Cono() {
    }

    /**
     * Instantiates a new Cono.
     *
     * @param altura    the altura
     * @param radioBase the radio base
     */
    public Cono(float altura, float radioBase) {
        this.altura = altura;
        this.radioBase = radioBase;
    }

    /**
     * Gets altura.
     *
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Sets altura.
     *
     * @param altura the altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Gets radio base.
     *
     * @return the radio base
     */
    public float getRadioBase() {
        return radioBase;
    }

    /**
     * Sets radio base.
     *
     * @param radioBase the radio base
     */
    public void setRadioBase(float radioBase) {
        this.radioBase = radioBase;
    }

    /**
     * Calcular area base float.
     *
     * @param altura    the altura
     * @param radioBase the radio base
     * @return the float
     */
    public static float calcularAreaBase(float altura, float radioBase){
        return altura * radioBase;
    }

    /**
     * Calcular volumen float.
     *
     * @param altura    the altura
     * @param radioBase the radio base
     * @return the float
     */
    public static float calcularVolumen(float altura, float radioBase){
        float volumen = 0, aux = 0;
        aux = radioBase * radioBase;
        volumen = Float.parseFloat("3.1416") * aux * altura / radioBase;
        return volumen;
    }

    /**
     * Solicitar valores
     */
    public void solicitarValores(){
        this.radioBase = Integer.parseInt(
                JOptionPane.showInputDialog("Dime el radioBase :")
        );

        this.altura = Integer.parseInt(
                JOptionPane.showInputDialog("Dime la altura :")
        );

        imprimirResultados();
    }

    /**
     * Imprimir resultados.
     */
    public void imprimirResultados() {
        JOptionPane.showMessageDialog(null, "AreaBase: " + calcularAreaBase(altura, radioBase));

        JOptionPane.showMessageDialog(null, "Volumen del cubo: " + calcularVolumen(altura, radioBase));
    }

    @Override
    public String toString() {
        return "Cono{" +
                "altura=" + altura +
                ", radioBase=" + radioBase +
                ", areaBase=" + calcularAreaBase(this.altura, this.radioBase) +
                ", volumen=" + calcularVolumen(this.altura, this.radioBase) +
                '}';
    }
}
