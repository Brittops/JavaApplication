/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PooTrabalhoAV2App;

import PooTrabalhoAV2.*;
import java.util.Scanner;
/**
 *
 * @author danib
 */
public class Dirigindo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean state=true;
        
        while (state) {
            int escolha;

            System.out.println("Escolha um tipo de Veículo para dirigir:");
            System.out.println("1-Carro / 2-Moto / 3-Ônibus");
            escolha = Integer.parseInt(sc.nextLine());
            Carro carro = new Carro();
            Moto moto = new Moto();
            Onibus onibus = new Onibus();
            
            switch (escolha) {
                case 1:
                    boolean RPM = true;
                    String var;
                    while (RPM) {
                               /*______CONTROLE_DE_EXCESSÕES__RPM_MÁXIMO______*/
                        try {
                            System.out.println("Digite o número máximo de rotações por minuto(RPM):");
                            var = sc.nextLine();
                            if (Integer.parseInt(var) > 0) {
                                carro.motor.setRpmMaximo(Integer.parseInt(var));
                                RPM = false;
                            } else {
                                throw new Exception("ERROR! Valor menor/igual a zero.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("ERROR! Valor INTEIRO não reconhecido.");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 2:
                    boolean RPM1 = true;
                    String var1;
                    while (RPM1) {
                               /*______CONTROLE_DE_EXCESSÕES__RPM_MÁXIMO______*/
                        try {
                            System.out.println("Digite o número máximo de rotações por minuto(RPM):");
                            var1 = sc.nextLine();
                            if (Integer.parseInt(var1) > 0) {
                                moto.motor.setRpmMaximo(Integer.parseInt(var1));
                                RPM1 = false;
                            } else {
                                throw new Exception("ERROR! Valor menor/igual a zero.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("ERROR! Valor INTEIRO não reconhecido.");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 3:
                    boolean RPM2 = true;
                    String var2;
                    while (RPM2) {
                               /*______CONTROLE_DE_EXCESSÕES__RPM_MÁXIMO______*/
                        try {
                            System.out.println("Digite o número máximo de rotações por minuto(RPM):");
                            var2 = sc.nextLine();
                            if (Integer.parseInt(var2) > 0) {
                                carro.motor.setRpmMaximo(Integer.parseInt(var2));
                                RPM2 = false;
                            } else {
                                throw new Exception("ERROR! Valor menor/igual a zero.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("ERROR! Valor INTEIRO não reconhecido.");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
            }
            
            System.out.println("\n\n\n     Lista de comandos para sua Direção!");
            System.out.println("------------------------------------------------");
            System.out.println("           ACELERAR!");
            System.out.println("               |          (0)--FREAR");
            System.out.println("              (8)");
            System.out.println("ESQUERDA --(4)(5)(6)-- DIREITA");
            System.out.println("               |");
            System.out.println("          DESACELERAR");
            System.out.println("                          (7)--FINALIZAR PASSEIO");
            System.out.println("------------------------------------------------");
            System.out.println("     Boa sorte, dirija com cuidado! ;)\n\n\n");
            
            int comando = Integer.parseInt(sc.nextLine());
            
            while (comando!=7) {
                switch (escolha) {
                    case 1:                              
                                                         /*__DIRIGINDO_CARRO__*/
                        switch (comando) {
                            case 0:
                                carro.frear();
                                break;
                            case 4:
                                carro.virarEsquerda();
                                break;
                            case 5:
                                carro.desacelerar();
                                break;
                            case 6:
                                carro.virarDireita();
                                break;
                            case 8:
                                carro.acelerar();
                                break;
                        }
                        comando = Integer.parseInt(sc.nextLine());
                        state = false;
                        break;
                    case 2:                              
                                                         /*__DIRIGINDO_MOTO___*/
                        switch (comando) {
                            case 0:
                                moto.frear();
                                break;
                            case 4:
                                moto.virarEsquerda();
                                break;
                            case 5:
                                moto.desacelerar();
                                break;
                            case 6:
                                moto.virarDireita();
                                break;
                            case 8:
                                moto.acelerar();
                                break;
                        }
                        comando = Integer.parseInt(sc.nextLine());
                        state = false;
                        break;
                    case 3:                             
                                                         /*__DIRIGINDO_ÔNIBUS_*/
                        switch (comando) {
                            case 0:
                                onibus.frear();
                                break;
                            case 4:
                                onibus.virarEsquerda();
                                break;
                            case 5:
                                onibus.desacelerar();
                                break;
                            case 6:
                                onibus.virarDireita();
                                break;
                            case 8:
                                onibus.acelerar();
                                break;
                        }
                        comando = Integer.parseInt(sc.nextLine());
                        state = false;
                        break;
                    default:
                        System.out.println("ERROR! Escolha não identificada.");
                }
            }
        }
    }
}