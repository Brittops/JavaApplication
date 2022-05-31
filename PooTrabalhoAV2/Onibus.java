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
public class Onibus extends Veiculo{
    
    private String motorista;
    
/*____________________________________SETTERS_________________________________*/
    public void setMotorista(String motorista) {
        boolean state = true;
        while (state) {
            try {
                if (!"".equals(motorista)) {
                    this.motorista = motorista;
                    state = false;
                } else {
                    throw new Exception("ERROR! String Vazia.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
/*____________________________________GETTERS_________________________________*/
    public String getMotorista() {
        return motorista;
    }
    
/*_________________________________ENTRADA_DADOS______________________________*/
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);

        super.entradaDados();      // herança do método Veiculo.entradaDados()
        boolean state = true;
        String var;

        while (state) {
                                /*______CONTROLE_DE_EXCESSÕES__VOLUME_MALA____*/
            try {
                System.out.println("Digite o nome do Motorista:");
                var = sc.nextLine();
                if (!"".equals(var)) {
                    setMotorista(var);
                    state = false;
                } else {
                    throw new Exception("ERROR! Campo vazio.");
                }
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
            String motorista) {
        super.cadastrar(           // herança do método Veiculo.cadastrar()
                marca, 
                proprietario, 
                placa, 
                numeroPassageiros, 
                preco, 
                motor);
        setMotorista(motorista);
    }
    
/*___________________________________DESCONTO_________________________________*/
    public double desconto(double percentual) {
        return super.desconto(percentual);
    }
    
/*___________________________________IMPRIMIR_________________________________*/
    public void imprimir() {
        super.imprimir();          // herança do método Veiculo.imprimir()
        if (!"".equals(getMotorista())) {
            System.out.println("Motorista: " + getMotorista());
        }
    }
    
/*___________________________________DIREÇÃO__________________________________*/
    public void acelerar() {        
        if (motor.getRpm() <= motor.getRpmMaximo()-50) {
            motor.setRpm(motor.getRpm() + 50);
            System.out.println("Aceleração atual: " + motor.getRpm() + " RPM");
        } else {
            motor.setRpm(motor.getRpmMaximo());
            System.out.println("Aceleração atual: " + motor.getRpm() + " RPM");
        }
    }
    
    public void desacelerar() {        
        if (motor.getRpm() >= 50) {
            motor.setRpm(motor.getRpm()-50);
            System.out.println("Aceleração atual: " + motor.getRpm() + " RPM");
        } else {
            motor.setRpm(0);
            System.out.println("Aceleração atual: " + motor.getRpm() + " RPM");
        }
    }
   
    public void frear() {
        motor.setRpm(0);
        System.out.println("Ônibus Freando!");
    }

    public void virarDireita() {
        System.out.println("Ônibus virando a direita!");
    }

    public void virarEsquerda() {
        System.out.println("Ônibus virando a esquerda!");
    }
    
/*_________________________________CONSTRUTORES_______________________________*/
    public Onibus() {
    }
    
    public Onibus(String motorista) {
        setMotorista(motorista);
    }
    
    public Onibus(String marca, String motorista) {
        super(marca);
        setMotorista(motorista);
    }

    public Onibus(int numeroPassageiros, String motorista) {
        super(numeroPassageiros);
        setMotorista(motorista);
    }

    public Onibus(double preco, String motorista) {
        super(preco);
        setMotorista(motorista);
    }

    public Onibus(String marca, String proprietario, String motorista) {
        super(marca, proprietario);
        setMotorista(motorista);
    }

    public Onibus(String marca, int numeroPassageiros, String motorista) {
        super(marca, numeroPassageiros);
        setMotorista(motorista);
    }

    public Onibus(int numeroPassageiros, String proprietario, String motorista) {
        super(numeroPassageiros, proprietario);
        setMotorista(motorista);
    }

    public Onibus(String placa, double preco, String motorista) {
        super(placa, preco);
        setMotorista(motorista);
    }

    public Onibus(double preco, String proprietario, String motorista) {
        super(preco, proprietario);
        setMotorista(motorista);
    }

    public Onibus(
            String marca, 
            String proprietario, 
            int numeroPassageiros, 
            String motorista) {
        super(marca, proprietario, numeroPassageiros);
        setMotorista(motorista);
    }

    public Onibus(
            String marca, 
            String proprietario, 
            String placa, 
            String motorista) {
        super(marca, proprietario, placa);
        setMotorista(motorista);
    }

    public Onibus(
            String marca, 
            String proprietario, 
            String placa, 
            int numeroPassageiros, 
            String motorista) {
        super(marca, proprietario, placa, numeroPassageiros);
        setMotorista(motorista);
    }

    public Onibus(
            String marca, 
            String proprietario, 
            String placa, 
            double preco, 
            String motorista) {
        super(marca, proprietario, placa, preco);
        setMotorista(motorista);
    }

    public Onibus(
            String marca, 
            String proprietario, 
            String placa, 
            int numeroPassageiros, 
            double preco, 
            String motorista) {
        super(marca, proprietario, placa, numeroPassageiros, preco);
        setMotorista(motorista);
    }
    
    public Onibus(Motor motor, String motorista) {
        super(motor);
        setMotorista(motorista);
    }
    
    public Onibus(
            String marca, 
            String proprietario, 
            String placa, 
            Motor motor, 
            String motorista) {
        super(marca, proprietario, placa, motor);
        setMotorista(motorista);
    }
    
    public Onibus(
            String marca, 
            String proprietario, 
            String placa, 
            int numeroPassageiros, 
            Motor motor, 
            String motorista) {
        super(marca, proprietario, placa, numeroPassageiros, motor);
        setMotorista(motorista);
    }

    public Onibus(
            String marca, 
            String proprietario, 
            String placa, 
            double preco, 
            Motor motor, 
            String motorista) {
        super(marca, proprietario, placa, preco, motor);
        setMotorista(motorista);
    }

    public Onibus(
            String marca, 
            String proprietario, 
            String placa, 
            int numeroPassageiros, 
            double preco, 
            Motor motor, 
            String motorista) {
        super(marca, proprietario, placa, numeroPassageiros, preco, motor);
        setMotorista(motorista);
    }
}
