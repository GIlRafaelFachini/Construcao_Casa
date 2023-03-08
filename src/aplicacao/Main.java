package aplicacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Casa casa = new Casa();

        System.out.println("Entre com a largura da casa em metros:");
        Double larguara = entrada.nextDouble();
        System.out.println("Entre com o comprimento da casa em metros:");
        Double comprimento = entrada.nextDouble();

        Double areaCasa = casa.calculaAreaCasa(larguara, comprimento);
        System.out.println("A area da casa é :" + areaCasa + " metros quadrados");
        System.out.println("--------------------------------------------------------------------------");

        System.out.println("Entre com a largura do baldrame em metros:");
        Double larguaraBaldrame = entrada.nextDouble();
        System.out.println("Entre com o comprimento do baldrame em metros:");
        Double comprimentoBaldrame = entrada.nextDouble();
        System.out.println("Entre com o altura do baldrame em metros:");
        Double alturaBaldrame = entrada.nextDouble();
        Double volumeBaldrame = casa.calcularVolumeBaldrame(larguaraBaldrame, comprimentoBaldrame, alturaBaldrame);
        System.out.println("O volume do baldrame da casa é: " + volumeBaldrame + " metros cúbicos");
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Entre com valor do metro cubico de cimento: ");
        Double valorMetrocimento = entrada.nextDouble();
        Double custoConcretoBase = casa.custoConcretoBase(areaCasa ,valorMetrocimento);
        System.out.println("O valor da basede concreto é " + custoConcretoBase);
        
    }
}
