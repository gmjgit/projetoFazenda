package br.com.gilsomjacoby.fazenda;

public class Galinha extends Animais implements Aves {

    public Galinha(int idade, float tamanho, String cor) {
        super(idade, tamanho, cor);

    }

    @Override
    public boolean colocarOvos() {
        return true;
    }

    @Override
    public String emitirSom() {
        return "Cacarejo";
    }

    @Override
    public String voar() {
        return "3 metros";
    }

}
