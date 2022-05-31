/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PooTrabalhoAV2App;

import PooTrabalhoAV2.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 20161108339
 */
public class Aplicacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        boolean state = true;

        System.out.println("Qual Veículo deseja cadastrar?");
        System.out.println("1-Carro / 2-Moto / 3-Ônibus");
        select = Integer.parseInt(sc.nextLine());

        List<Carro> carro = new ArrayList<>();
        List<Moto> moto = new ArrayList<>();
        List<Onibus> onibus = new ArrayList<>();

        while (state) {

            if (select == 1) {
                carro.add(new Carro());
                carro.get(carro.size() - 1).entradaDados();
            }
            if (select == 2) {
                moto.add(new Moto());
                moto.get(moto.size() - 1).entradaDados();
            }
            if (select == 3) {
                onibus.add(new Onibus());
                onibus.get(onibus.size() - 1).entradaDados();
            }
                                        /*______CABEÇALHO_DO_RELATÓRIO________*/
            System.out.println("Veículo   Marca   Proprietario   Placa");
            System.out.println("-------  -------  ------------  -------");
            for (int i = 0; i < carro.size(); i++) {
                                                               /*___CARROS____*/
                System.out.print("Carro:   ");
                System.out.print(carro.get(i).getMarca());
                switch (carro.get(i).getMarca().length()) {
                    case 1:
                        System.out.print("        ");
                        break;
                    case 2:
                        System.out.print("       ");
                        break;
                    case 3:
                        System.out.print("      ");
                        break;
                    case 4:
                        System.out.print("     ");
                        break;
                    case 5:
                        System.out.print("    ");
                        break;
                    case 6:
                        System.out.print("   ");
                        break;
                    case 7:
                        System.out.print("  ");
                        break;
                    case 8:
                        System.out.print(" ");
                        break;
                }
                System.out.print(carro.get(i).getProprietario());
                switch (carro.get(i).getProprietario().length()) {
                    case 1:
                        System.out.print("             ");
                        break;
                    case 2:
                        System.out.print("            ");
                        break;
                    case 3:
                        System.out.print("           ");
                        break;
                    case 4:
                        System.out.print("          ");
                        break;
                    case 5:
                        System.out.print("         ");
                        break;
                    case 6:
                        System.out.print("        ");
                        break;
                    case 7:
                        System.out.print("       ");
                        break;
                    case 8:
                        System.out.print("      ");
                        break;
                    case 9:
                        System.out.print("     ");
                        break;
                    case 10:
                        System.out.print("    ");
                        break;
                    case 11:
                        System.out.print("   ");
                        break;
                    case 12:
                        System.out.print("  ");
                        break;
                    case 13:
                        System.out.print(" ");
                }
                System.out.println(carro.get(i).getPlaca());
            }
            for (int i = 0; i < moto.size(); i++) {
                                                                 /*___MOTOS___*/
                System.out.print("Moto:    ");
                System.out.print(moto.get(i).getMarca());
                switch (moto.get(i).getMarca().length()) {
                    case 1:
                        System.out.print("        ");
                        break;
                    case 2:
                        System.out.print("       ");
                        break;
                    case 3:
                        System.out.print("      ");
                        break;
                    case 4:
                        System.out.print("     ");
                        break;
                    case 5:
                        System.out.print("    ");
                        break;
                    case 6:
                        System.out.print("   ");
                        break;
                    case 7:
                        System.out.print("  ");
                        break;
                    case 8:
                        System.out.print(" ");
                        break;
                }
                System.out.print(moto.get(i).getProprietario());
                switch (moto.get(i).getProprietario().length()) {
                    case 1:
                        System.out.print("             ");
                        break;
                    case 2:
                        System.out.print("            ");
                        break;
                    case 3:
                        System.out.print("           ");
                        break;
                    case 4:
                        System.out.print("          ");
                        break;
                    case 5:
                        System.out.print("         ");
                        break;
                    case 6:
                        System.out.print("        ");
                        break;
                    case 7:
                        System.out.print("       ");
                        break;
                    case 8:
                        System.out.print("      ");
                        break;
                    case 9:
                        System.out.print("     ");
                        break;
                    case 10:
                        System.out.print("    ");
                        break;
                    case 11:
                        System.out.print("   ");
                        break;
                    case 12:
                        System.out.print("  ");
                        break;
                    case 13:
                        System.out.print(" ");
                }
                System.out.println(moto.get(i).getPlaca());
            }
            for (int i = 0; i < onibus.size(); i++) {
                                                                /*___ONIBUS___*/
                System.out.print("Onibus:  ");
                System.out.print(onibus.get(i).getMarca());
                switch (onibus.get(i).getMarca().length()) {
                    case 1:
                        System.out.print("        ");
                        break;
                    case 2:
                        System.out.print("       ");
                        break;
                    case 3:
                        System.out.print("      ");
                        break;
                    case 4:
                        System.out.print("     ");
                        break;
                    case 5:
                        System.out.print("    ");
                        break;
                    case 6:
                        System.out.print("   ");
                        break;
                    case 7:
                        System.out.print("  ");
                        break;
                    case 8:
                        System.out.print(" ");
                        break;
                }
                System.out.print(onibus.get(i).getProprietario());
                switch (onibus.get(i).getProprietario().length()) {
                    case 1:
                        System.out.print("             ");
                        break;
                    case 2:
                        System.out.print("            ");
                        break;
                    case 3:
                        System.out.print("           ");
                        break;
                    case 4:
                        System.out.print("          ");
                        break;
                    case 5:
                        System.out.print("         ");
                        break;
                    case 6:
                        System.out.print("        ");
                        break;
                    case 7:
                        System.out.print("       ");
                        break;
                    case 8:
                        System.out.print("      ");
                        break;
                    case 9:
                        System.out.print("     ");
                        break;
                    case 10:
                        System.out.print("    ");
                        break;
                    case 11:
                        System.out.print("   ");
                        break;
                    case 12:
                        System.out.print("  ");
                        break;
                    case 13:
                        System.out.print(" ");
                }
                System.out.println(onibus.get(i).getPlaca());
            }
            System.out.println("-------  -------  ------------  -------");
            boolean extencao=true;
            
            while(extencao) {
                int continuacao;
                System.out.println("Deseja cadastrar mais um Veículo ou excluir um existente?");
                System.out.println("1-cadastrar / 2-excluir / 3-finalizar");
                continuacao = Integer.parseInt(sc.nextLine());
            
                switch (continuacao) {
                    case 1:
                                          /*____CADASTRANDO_NOVO_VEÍCULO______*/
                        System.out.println("Qual Veículo deseja cadastrar?");
                        System.out.println("1-Carro / 2-Moto / 3-Ônibus");
                        select = Integer.parseInt(sc.nextLine());
                        extencao=false;
                        break;
                    case 2:
                                          /*____EXCLUINDO_UM_VEÍCULO__________*/
                        System.out.println("Qual Veículo deseja excluir?");
                        System.out.println("1-Carro / 2-Moto / 3-Ônibus");
                        int selecao = Integer.parseInt(sc.nextLine());
                        int removeVeiculo;

                        switch (selecao) {
                            case 1:
                                if (carro.size() < 1) {
                                    System.out.println("Você não possui carro(s)!");
                                    extencao=false;
                                } else if (carro.size() == 1) {
                                    carro.remove(carro.size() - 1);
                                } else {
                                    System.out.println("Qual o carro que vc deseja excluir?");
                                    System.out.println("1-primeiro carro / 2-segundo carro...");
                                    removeVeiculo = Integer.parseInt(sc.nextLine());
                                    carro.remove(removeVeiculo - 1);
                                }
                                break;
                            case 2:
                                if (moto.size() < 1) {
                                    System.out.println("Você não possui moto(s)!");
                                    extencao=false;
                                } else if (moto.size() == 1) {
                                    moto.remove(moto.size() - 1);
                                } else {
                                    System.out.println("Qual a moto que vc deseja excluir?");
                                    System.out.println("1-primeira moto / 2-segunda moto...");
                                    removeVeiculo = Integer.parseInt(sc.nextLine());
                                    moto.remove(removeVeiculo - 1);
                                }
                                break;
                            case 3:
                                if (onibus.size() < 1) {
                                    System.out.println("Você não possui onibus!");
                                    extencao=false;
                                } else if (onibus.size() == 1) {
                                    onibus.remove(onibus.size() - 1);
                                } else {
                                    System.out.println("Qual o onibus que vc deseja excluir?");
                                    System.out.println("1-primeiro onibus / 2-segundo onibus...");
                                    removeVeiculo = Integer.parseInt(sc.nextLine());
                                    onibus.remove(removeVeiculo - 1);
                                }
                                break;
                            default:
                                System.out.println("Você não selecionou nenhum tipo de veículo!");
                        }
                        break;
                    case 3:
                                            /*_____FINALIZANDO_APLICAÇÃO______*/
                        extencao = false;
                        state = false;
                }
            }
        }
    }
}