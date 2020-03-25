package br.com.gilsomjacoby.fazenda;

public class Morcego extends Animais implements Aves {

    public Morcego(int idade, float tamanho, String cor) {
        super(idade, tamanho, cor);
    }

    @Override
    public String emitirSom() {
        return "Farfalho";
    }

    @Override
    public String voar() {
        return "30 metros";
    }

    @Override
    public boolean colocarOvos() {
        return false;
    }

}
