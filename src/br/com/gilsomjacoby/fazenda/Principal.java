package br.com.gilsomjacoby.fazenda;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int animal;
        int idade;
        float tamanho;
        String cor;
        System.out.println("Escolha entre os 4 animais: 1 - Vaca, 2 - Morcego, 3 - Pato, 4 - Galinha");
        animal = obj.nextInt();
        System.out.println("Digite a idade do animal: ");
        idade = obj.nextInt();
        System.out.println("Digite o tamanho/peso: ");
        tamanho = obj.nextFloat();
        System.out.println("Digite a cor: ");
        cor = obj.next();

        System.out.println("----");

        switch (animal) {

            case 1:
                Vaca v1 = new Vaca(idade, tamanho, cor);
                System.out.println("Animal ---- Vaca > Idade: " + v1.getIdade() + ", Tamanho: " + v1.getTamanho() + " kg, Cor: " + v1.getCor() + ".");
                System.out.println("Som emitido: " + v1.emitirSom());
                break;
            case 2:
                Morcego m1 = new Morcego(idade, tamanho, cor);
                System.out.println("Animal ---- Morcego > Idade: " + m1.getIdade() + ", Tamanho: " + m1.getTamanho() + " kg, Cor: " + m1.getCor() + ".");
                System.out.println("Som emitido: " + m1.emitirSom());
                System.out.println("Sua altitude chega a: "+ m1.voar());
                break;
            case 3:
                Pato p1 = new Pato(idade, tamanho, cor);
                System.out.println("Animal ---- Pato > Idade: " + p1.getIdade() + ", Tamanho: " + p1.getTamanho() + " kg, Cor: " + p1.getCor() + ".");
                System.out.println("Som emitido: " + p1.emitirSom());
                System.out.println("Animal que coloca ovos.");
                 System.out.println("Sua altitude chega a: "+ p1.voar());

                break;
            case 4:
                Galinha g1 = new Galinha(idade, tamanho, cor);
                System.out.println("Animal ---- Galinha > Idade:" + g1.getIdade() + ", Tamanho: " + g1.getTamanho() + " kg, Cor: " + g1.getCor() + ".");
                System.out.println("Som emitido: " + g1.emitirSom());
                System.out.println("Animal que coloca ovos.");

                break;
            default:
                break;
        }

    }

}
