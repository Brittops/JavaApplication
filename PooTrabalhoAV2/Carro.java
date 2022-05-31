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
public class Carro extends Veiculo {

    private int volumeMala;

/*___________________________________SETTERS__________________________________*/
    public void setVolumeMala(int volumeMala) {
        boolean state = true;
        while (state) {
            try {
                if (volumeMala > 0) {
                    this.volumeMala = volumeMala;
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

/*____________________________________GETTERS_________________________________*/
    public Integer getVolumeMala() {
        return volumeMala;
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
                System.out.println("Digite o volume da Mala:");
                var = sc.nextLine();
                if (Integer.parseInt(var) > 0) {
                    setVolumeMala(Integer.parseInt(var));
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
            int volumeMala) {
        super.cadastrar(           // herança do método Veiculo.cadastrar()
                marca, 
                proprietario, 
                placa, 
                numeroPassageiros, 
                preco, 
                motor);
        setVolumeMala(volumeMala);
    }
    
/*___________________________________DESCONTO_________________________________*/
    public double desconto() {
        return super.desconto(10);
    }
    
/*___________________________________IMPRIMIR_________________________________*/
    public void imprimir() {
        super.imprimir();          // herança do método Veiculo.imprimir()
        if (getVolumeMala()>0) {
            System.out.println("Volume da mala: " + getVolumeMala());
        }
    }
    
/*___________________________________DIREÇÃO__________________________________*/
    public void acelerar() {        
        if (motor.getRpm() <= motor.getRpmMaximo()-100) {
            motor.setRpm(motor.getRpm() + 100);
            System.out.println("Aceleração atual: " + motor.getRpm() + " RPM");
        } else {
            motor.setRpm(motor.getRpmMaximo());
            System.out.println("Aceleração atual: " + motor.getRpm() + " RPM");
        }
    }
    
    public void desacelerar() {        
        if (motor.getRpm() >= 100) {
            motor.setRpm(motor.getRpm()-100);
            System.out.println("Aceleração atual: " + motor.getRpm() + " RPM");
        } else {
            motor.setRpm(0);
            System.out.println("Aceleração atual: " + motor.getRpm() + " RPM");
        }
    }
   
    public void frear() {
        motor.setRpm(0);
        System.out.println("Carro Freando!");
    }

    public void virarDireita() {
        System.out.println("Carro virando a direita!");
    }

    public void virarEsquerda() {
        System.out.println("Carro virando a esquerda!");
    }
    
/*_________________________________CONSTRUTORES_______________________________*/
    public Carro() {
    }
    
    public Carro(int volumeMala) {
        setVolumeMala(volumeMala);
    }
    
    public Carro(String marca, int volumeMala) {
        super(marca);
        setVolumeMala(volumeMala);
    }

    public Carro(int numeroPassageiros, int volumeMala) {
        super(numeroPassageiros);
        setVolumeMala(volumeMala);
    }

    public Carro(double preco, int volumeMala) {
        super(preco);
        setVolumeMala(volumeMala);
    }

    public Carro(String marca, String proprietario, int volumeMala) {
        super(marca, proprietario);
        setVolumeMala(volumeMala);
    }

    public Carro(String marca, int numeroPassageiros, int volumeMala) {
        super(marca, numeroPassageiros);
        setVolumeMala(volumeMala);
    }

    public Carro(int numeroPassageiros, String proprietario, int volumeMala) {
        super(numeroPassageiros, proprietario);
        setVolumeMala(volumeMala);
    }

    public Carro(String placa, double preco, int volumeMala) {
        super(placa, preco);
        setVolumeMala(volumeMala);
    }

    public Carro(double preco, String proprietario, int volumeMala) {
        super(preco, proprietario);
        setVolumeMala(volumeMala);
    }

    public Carro(
            String marca, 
            String proprietario, 
            int numeroPassageiros, 
            int volumeMala) {
        super(marca, proprietario, numeroPassageiros);
        setVolumeMala(volumeMala);
    }

    public Carro(
            String marca, 
            String proprietario, 
            String placa, 
            int volumeMala) {
        super(marca, proprietario, placa);
        setVolumeMala(volumeMala);
    }

    public Carro(
            String marca, 
            String proprietario, 
            String placa, 
            int numeroPassageiros, 
            int volumeMala) {
        super(marca, proprietario, placa, numeroPassageiros);
        setVolumeMala(volumeMala);
    }

    public Carro(
            String marca, 
            String proprietario, 
            String placa, 
            double preco, 
            int volumeMala) {
        super(marca, proprietario, placa, preco);
        setVolumeMala(volumeMala);
    }

    public Carro(
            String marca, 
            String proprietario, 
            String placa, 
            int numeroPassageiros, 
            double preco, 
            int volumeMala) {
        super(marca, proprietario, placa, numeroPassageiros, preco);
        setVolumeMala(volumeMala);
    }
    
    public Carro(Motor motor, int volumeMala) {
        super(motor);
        setVolumeMala(volumeMala);
    }
    
    public Carro(
            String marca, 
            String proprietario, 
            String placa, 
            Motor motor, 
            int volumeMala) {
        super(marca, proprietario, placa, motor);
        setVolumeMala(volumeMala);
    }
    
    public Carro(
            String marca, 
            String proprietario, 
            String placa, 
            int numeroPassageiros, 
            Motor motor, 
            int volumeMala) {
        super(marca, proprietario, placa, numeroPassageiros, motor);
        setVolumeMala(volumeMala);
    }

    public Carro(
            String marca, 
            String proprietario, 
            String placa, 
            double preco, 
            Motor motor, 
            int volumeMala) {
        super(marca, proprietario, placa, preco, motor);
        setVolumeMala(volumeMala);
    }

    public Carro(
            String marca, 
            String proprietario, 
            String placa, 
            int numeroPassageiros, 
            double preco, 
            Motor motor, 
            int volumeMala) {
        super(marca, proprietario, placa, numeroPassageiros, preco, motor);
        setVolumeMala(volumeMala);
    }
}