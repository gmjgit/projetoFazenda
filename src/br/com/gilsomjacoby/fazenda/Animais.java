package br.com.gilsomjacoby.fazenda;

public abstract class Animais {

    private int idade;
    private float tamanho;
    private String cor;

    public Animais(int idade, float tamanho, String cor) {
        this.idade = idade;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
   

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public abstract String emitirSom();       
    
    
}
