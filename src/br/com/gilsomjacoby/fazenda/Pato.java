/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gilsomjacoby.fazenda;

/**
 *
 * @author GILSON 
 */
public class Pato extends Animais implements Aves{

    public Pato(int idade, float tamanho, String cor) {
        super(idade, tamanho, cor);
    }

    @Override
    public String emitirSom() {
        return "Grasnido";
    }

    @Override
    public String voar() {
        return "4 metros";
    }

    @Override
    public boolean colocarOvos() {
       return true;
    }
    
}
