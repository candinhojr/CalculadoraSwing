/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufsc.ine5612.calculadoraswing;

/**
 *
 * @author 16101097
 */
public class Controle {

    protected Calculadora calculadora;

    public Controle() {
        this.calculadora = new Calculadora();
    }

    public String somar(String x, String y) {
        //Transformo para Double
        Double num1 = new Double(x);
        Double num2 = new Double(y);

        return this.calculadora.somar(num1, num2).toString();
    }

    public String subtrair(String x, String y) {
        Double num1 = new Double(x);
        Double num2 = new Double(y);

        return this.calculadora.subtrair(num1, num2).toString();
    }

    public String dividir(String x, String y) {
        Double num1 = new Double(x);
        Double num2 = new Double(y);

        return this.calculadora.dividir(num1, num2).toString();
    }

    public String multiplicar(String x, String y) {
        Double num1 = new Double(x);
        Double num2 = new Double(y);

        return this.calculadora.multiplicar(num1, num2).toString();
    }

    public String resto(String x, String y) {
        Double num1 = new Double(x);
        Double num2 = new Double(y);

        return this.calculadora.resto(num1, num2).toString();
    }
}
