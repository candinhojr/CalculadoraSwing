/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufsc.ine5612.calculadoraswing;

import javax.swing.JFrame;

/**
 *
 * @author 16101097
 */
public class Moldura extends JFrame{
    public Moldura() {
        super();//chama o constutor do JFrame
        Controle controle = new Controle();
        this.add(new Painel(controle));
        this.pack(); //Tamanho
        this.show();
    }
}
