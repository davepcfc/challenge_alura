package org.example;

import org.example.valores.ConversorDeMoedas;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

//        https://v6.exchangerate-api.com/v6/53ed20e2bf25aa0b84c1e8f2/pair/EUR/GBP/10 url exemplo

        Scanner scanner = new Scanner(System.in);
        int escolherMoeda = 0;

        ConversorDeMoedas conversorDeMoedas = new ConversorDeMoedas();

        String EUR = "EUR";
        String USD = "USD";
        String BRL = "BRL";
        String ARS = "ARS";


        while(escolherMoeda != 7) {
            System.out.println("""
                   *****************
                   Esolha uma opção: 
                   1 - EUR => BRL
                   2 - BRL => EUR
                   3 - USD => BRL
                   4 - BRL => USD
                   5 - ARS => USD
                   6 - USD => ARS
                   7 - Sair
                   *****************
                """);

            escolherMoeda = scanner.nextInt();

            if(escolherMoeda == 7) {
                System.out.println("Até a próxima!");
                break;
            }

            if (escolherMoeda < 1 || escolherMoeda > 7) {
                System.out.println("Opção inválida, tente novamente!");
            }

            switch (escolherMoeda){
                case 1:
                    System.out.println("Digite o valor: ");
                    double euroConvertido = scanner.nextDouble();
                    conversorDeMoedas.converterMoedas(EUR,BRL,euroConvertido);
                    break;
                case 2:
                    System.out.println("Digite o valor: ");
                    double realConvertidoParaEuro = scanner.nextDouble();
                    conversorDeMoedas.converterMoedas(BRL, EUR ,realConvertidoParaEuro);
                    break;
                case 3:
                    System.out.println("Digite o valor: ");
                    double dolarConvertido = scanner.nextDouble();
                    conversorDeMoedas.converterMoedas(USD, BRL ,dolarConvertido);
                    break;
                case 4:
                    System.out.println("Digite o valor: ");
                    double realConvertidoParaDolar = scanner.nextDouble();
                    conversorDeMoedas.converterMoedas(BRL, USD ,realConvertidoParaDolar);
                    break;
                case 5:
                    System.out.println("Digite o valor: ");
                    double pesoConvertidoParaDolar = scanner.nextDouble();
                    conversorDeMoedas.converterMoedas(ARS, USD ,pesoConvertidoParaDolar);
                    break;
                case 6:
                    System.out.println("Digite o valor: ");
                    double dolarConvertidoParaPeso = scanner.nextDouble();
                    conversorDeMoedas.converterMoedas(USD, ARS ,dolarConvertidoParaPeso);
                    break;
                default:
                    break;
            }
        }
    }
}