/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PooTrabalhoAV2;

import java.util.Scanner;

/**
 *
 * @author danib
 */
public class Moto extends Veiculo{
    
    private int volumeBagageiro;
    
/*____________________________________SETTERS_________________________________*/
    public void setVolumeBagageiro(int volumeBagageiro) {
        boolean state = true;
        while (state) {
            try {
                if (volumeBagageiro > 0) {
                    this.volumeBagageiro = volumeBagageiro;
                    state = false;
                } else {
                    throw new Exception("ERROR! Valor deve ser maior que zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR! Valor INTEIRO não reconhecido.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
/*____________________________________GETTERS_________________________________*/
    public Integer getVolumeBagageiro() {
        return volumeBagageiro;
    }
    
/*_________________________________ENTRADA_DADOS______________________________*/
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);

        super.entradaDados();      // herança do método Veiculo.entradaDados()
        boolean state = true;
        String var;

        while (state) {
                            /*_____CONTROLE_DE_EXCESSÕES__VOLUME_BAGAGEIRO____*/
            try {
                System.out.println("Digite o volume do Bagageiro:");
                var = sc.nextLine();
                if (Integer.parseInt(var) > 0) {
                    setVolumeBagageiro(Integer.parseInt(var));
                    state = false;
                } else {
                    throw new Exception("ERROR! Valor menor/igual a zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR! Valor INTEIRO não reconhecido.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
/*__________________________________CADASTRAR_________________________________*/
    public void cadastrar(
            String marca,
            String proprietario,
            String placa,
            int numeroPassageiros,
            double preco,
            Motor motor,
            int volumeBagageiro) {
        super.cadastrar(           // herança do método Veiculo.cadastrar()
                marca, 
                proprietario, 
                placa, 
                numeroPassageiros, 
                preco, 
                motor);
        setVolumeBagageiro(volumeBagageiro);
    }
    
/*___________________________________DESCONTO_________________________________*/
    public double desconto(double percentual) {
        return super.desconto(percentual);
    }
    
/*___________________________________IMPRIMIR_________________________________*/
    public void imprimir() {
        super.imprimir();          // herança do método Veiculo.imprimir()
        if (getVolumeBagageiro()>0) {
            System.out.println("Volume do bagageiro: " + getVolumeBagageiro());
        }
    }
    
/*___________________________________DIREÇÃO__________________________________*/
    public void acelerar() {        
        if (motor.getRpm() <= motor.getRpmMaximo()-200) {
            motor.setRpm(motor.getRpm() + 200);
            System.out.println("Aceleração atual: " + motor.getRpm() + " RPM");
        } else {
            motor.setRpm(motor.getRpmMaximo());
            System.out.println("Aceleração atual: " + motor.getRpm() + " RPM");
        }
    }
    
    public void desacelerar() {        
        if (motor.getRpm() >= 200) {
            motor.setRpm(motor.getRpm()-200);
            System.out.println("Aceleração atual: " + motor.getRpm() + " RPM");
        } else {
            motor.setRpm(0);
            System.out.println("Aceleração atual: " + motor.getRpm() + " RPM");
        }
    }
   
    public void frear() {
        motor.setRpm(0);
        System.out.println("Moto Freando!");
    }

    public void virarDireita() {
        System.out.println("Moto virando a direita!");
    }

    public void virarEsquerda() {
        System.out.println("Moto virando a esquerda!");
    }
    
/*_________________________________CONSTRUTORES_______________________________*/
    public Moto() {
    }
    
    public Moto(int volumeBagageiro) {
        setVolumeBagageiro(volumeBagageiro);
    }
    
    public Moto(String marca, int volumeBagageiro) {
        super(marca);
        setVolumeBagageiro(volumeBagageiro);
    }

    public Moto(int numeroPassageiros, int volumeBagageiro) {
        super(numeroPassageiros);
        setVolumeBagageiro(volumeBagageiro);
    }

    public Moto(double preco, int volumeBagageiro) {
        super(preco);
        setVolumeBagageiro(volumeBagageiro);
    }

    public Moto(String marca, String proprietario, int volumeBagageiro) {
        super(marca, proprietario);
        setVolumeBagageiro(volumeBagageiro);
    }

    public Moto(String marca, int numeroPassageiros, int volumeBagageiro) {
        super(marca, numeroPassageiros);
        setVolumeBagageiro(volumeBagageiro);
    }

    public Moto(int numeroPassageiros, String proprietario, int volumeBagageiro) {
        super(numeroPassageiros, proprietario);
        setVolumeBagageiro(volumeBagageiro);
    }

    public Moto(String placa, double preco, int volumeBagageiro) {
        super(placa, preco);
        setVolumeBagageiro(volumeBagageiro);
    }

    public Moto(double preco, String proprietario, int volumeBagageiro) {
        super(preco, proprietario);
        setVolumeBagageiro(volumeBagageiro);
    }

    public Moto(
            String marca, 
            String proprietario, 
            int numeroPassageiros, 
            int volumeBagageiro) {
        super(marca, proprietario, numeroPassageiros);
        setVolumeBagageiro(volumeBagageiro);
    }

    public Moto(
            String marca, 
            String proprietario, 
            String placa, 
            int volumeBagageiro) {
        super(marca, proprietario, placa);
        setVolumeBagageiro(volumeBagageiro);
    }

    public Moto(
            String marca, 
            String proprietario, 
            String placa, 
            int numeroPassageiros, 
            int volumeBagageiro) {
        super(marca, proprietario, placa, numeroPassageiros);
        setVolumeBagageiro(volumeBagageiro);
    }

    public Moto(
            String marca, 
            String proprietario, 
            String placa, 
            double preco, 
            int volumeBagageiro) {
        super(marca, proprietario, placa, preco);
        setVolumeBagageiro(volumeBagageiro);
    }

    public Moto(
            String marca, 
            String proprietario, 
            String placa, 
            int numeroPassageiros, 
            double preco, 
            int volumeBagageiro) {
        super(marca, proprietario, placa, numeroPassageiros, preco);
        setVolumeBagageiro(volumeBagageiro);
    }
    
    public Moto(Motor motor, int volumeBagageiro) {
        super(motor);
        setVolumeBagageiro(volumeBagageiro);
    }
    
    public Moto(
            String marca, 
            String proprietario, 
            String placa, 
            Motor motor, 
            int volumeBagageiro) {
        super(marca, proprietario, placa, motor);
        setVolumeBagageiro(volumeBagageiro);
    }
    
    public Moto(
            String marca, 
            String proprietario, 
            String placa, 
            int numeroPassageiros, 
            Motor motor, 
            int volumeBagageiro) {
        super(marca, proprietario, placa, numeroPassageiros, motor);
        setVolumeBagageiro(volumeBagageiro);
    }

    public Moto(
            String marca, 
            String proprietario, 
            String placa, 
            double preco, 
            Motor motor, 
            int volumeBagageiro) {
        super(marca, proprietario, placa, preco, motor);
        setVolumeBagageiro(volumeBagageiro);
    }

    public Moto(
            String marca, 
            String proprietario, 
            String placa, 
            int numeroPassageiros, 
            double preco, 
            Motor motor, 
            int volumeBagageiro) {
        super(marca, proprietario, placa, numeroPassageiros, preco, motor);
        setVolumeBagageiro(volumeBagageiro);
    }
}