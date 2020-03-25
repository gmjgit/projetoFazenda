
package br.com.gilsomjacoby.fazenda;


public class Vaca extends Animais{
    
    public Vaca(int idade, float tamanho, String cor) {
        super(idade, tamanho, cor);
    }
    
     @Override
    public String emitirSom() {
        return "Mugido";
    }
   
    
}
