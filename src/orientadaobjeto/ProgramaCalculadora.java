/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientadaobjeto;

import java.util.Scanner;

/**
 *
 * @author eduardo.3946
 */
public class ProgramaCalculadora {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        CalculadoraCientifica cc = new CalculadoraCientifica();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                             Selecione a Opção da Calculadora                                            ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                 1 - Calculadora Simples                                                 ");
        System.out.println("                                                 2 - Calculadora CIentifica                                              ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                            Dijite o Cod da Calculadora Desejada                                          ");
        float Cal = scanner.nextFloat();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                                                                         ");
        
        if(Cal == 1){
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                                                   Calculadora Simples                                                   ");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                                                   Escoçlha uma Opção                                                    ");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                                                        1 - Soma                                                         ");
            System.out.println("                                                        2 - Subtração                                                    ");
            System.out.println("                                                        3 - Multiplicação                                                ");
            System.out.println("                                                        4 - Divisão                                                      ");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            float opcao = scanner.nextFloat();
            System.out.println("                                                Informeo o Primeiro Valor                                                ");
            float num1 = scanner.nextFloat();
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                                                Informeo o Segundo Valor                                                 ");
            float num2 = scanner.nextFloat();
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");

            if(opcao == 1){
                System.out.println("Escolheu Soma");
                System.out.println("A soma de " + num1 + " + " + num2 + "O Resultado da soma sera: " + calculadora.somar(num1,num2));
            }else if(opcao == 2){
                System.out.println("Escolheu Subtração");
                System.out.println("A subtracao de " + num1 + " - " + num2 + "O Resultado da subtracao sera: " + calculadora.subtrair(num1,num2));
            }else if(opcao == 3){
                System.out.println("Escolheu Multiplicação");
                System.out.println("A multiplicacao de " + num1 + " * " + num2 + "O Resultado da multiplicacao sera: " + calculadora.multiplicar(num1,num2));
            }else if(opcao == 4){
                System.out.println("Escolheu Divisão");
                System.out.println("A divisao de " + num1 + " / " + num2 + "O Resultado da divisao sera: " + calculadora.divisao(num1,num2));
            }
            
        }else if(Cal == 2){
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                                                 Calculadora Cientifica                                                  ");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                                                   Escoçlha uma Opção                                                    ");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                                                    1 - Raiz Quadrada                                                    ");
            System.out.println("                                                    2 - Potenciação                                                      ");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            float opcao1 = scanner.nextFloat();
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            
            if(opcao1 == 1){
                System.out.println("                                                Escolheu Raiz Quadrada                                                   ");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                System.out.println("                                                Informeo o Valor                                                ");
                float num1 = scanner.nextFloat();
                System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                System.out.println("A Raiz Quadrada de " + num1 + "O Resultado da Raiz Quadrada sera: √ " + cc.raizquadrada(num1));
                System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            }else if(opcao1 == 1){
                System.out.println("                                                  Escolheu Potenciação                                                   ");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                System.out.println("                                                Informeo o Primeiro Valor                                                ");
                float num1 = scanner.nextFloat();
                System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                System.out.println("                                                Informeo o Segundo Valor                                                 ");
                float num2 = scanner.nextFloat();
                System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                System.out.println("A potenciação de " + num1 + " X^z " + num2 + "O Resultado da Potenciação sera: " + cc.potencia(num1,num2));
                System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            }
            
        }
        
    }
    
}