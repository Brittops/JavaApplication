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
public abstract class Veiculo implements Direcao {

    private String marca, proprietario, placa;
    private int numeroPassageiros;
    private double preco;
    public Motor motor = new Motor();

/*___________________________________SETTERS__________________________________*/
    public void setMarca(String marca) {
        if (!"".equals(marca)) {
            this.marca = marca;
        }
    }

    public void setProprietario(String proprietario) {
        if (!"".equals(proprietario)) {
                    this.proprietario = proprietario;
        }
    }
    
    public void setPlaca(String placa) {
        if (!"".equals(placa)) {
            this.placa = placa;
        }
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        if (numeroPassageiros > 0) {
            this.numeroPassageiros = numeroPassageiros;
        }
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

/*____________________________________GETTERS_________________________________*/
    public String getMarca() {
        return this.marca;
    }

    public String getProprietario() {
        return this.proprietario;
    }

    public String getPlaca() {
        return this.placa;
    }

    public Integer getIdadeMinimaMotorista() {
        return this.IDADEMINIMAMOTORISTA;
    }

    public Integer getTempoMaxUso() {
        return this.TEMPOMAXUSO;
    }

    public Integer getNumeroPassageiros() {
        return this.numeroPassageiros;
    }

    public Double getPreco() {
        return this.preco;
    }

/*_________________________________ENTRADA_DADOS______________________________*/
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);

        boolean state = true;
        String var;

        while (state) {
                                     /*______CONTROLE_DE_EXCESSÕES__MARCA_____*/
            try {
                System.out.println("Digite a Marca:");
                var = sc.nextLine();
                if (!"".equals(var)) {
                    setMarca(var);
                    state = false;
                } else {
                    throw new Exception("ERROR! Campo vazio.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (state == false) {
                               /*______CONTROLE_DE_EXCESSÕES__PROPRITARIO_____*/
            try {
                System.out.println("Digite o nome do Proprietário:");
                var = sc.nextLine();
                if (!"".equals(var)) {
                    setProprietario(var);
                    state = true;
                } else {
                    throw new Exception("ERROR! Campo vazio.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (state) {
                                     /*______CONTROLE_DE_EXCESSÕES__PLACA_____*/
            try {
                System.out.println("Digite a Placa:");
                var = sc.nextLine();
                if (!"".equals(var)) {
                    setPlaca(var);
                    state = false;
                } else {
                    throw new Exception("ERROR! Campo vazio.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (state == false) {
                                /*__CONTROLE_DE_EXCESSÕES__NÚMERO_PASSAGEIROS_*/
            try {
                System.out.println("Digite o número de Passageiros:");
                var = sc.nextLine();
                if (Integer.parseInt(var) > 0) {
                    setNumeroPassageiros(Integer.parseInt(var));
                    state = true;
                } else {
                    throw new Exception("ERROR! Valor menor/igual a zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR! Valor INTEIRO não reconhecido.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (state) {
                                  /*______CONTROLE_DE_EXCESSÕES__PREÇO________*/
            try {
                System.out.println("Digite o Preço:");
                var = sc.nextLine();
                if (Double.parseDouble(var) > 0) {
                    setPreco(Double.parseDouble(var));
                    state = false;
                } else {
                    throw new Exception("ERROR! Valor menor/igual a zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR! Valor REAL não reconhecido.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("------------Informações do Motor------------");
        motor.entradaDados();
        System.out.println("--------------------------------------------");
    }

/*__________________________________CADASTRAR_________________________________*/
    public void cadastrar(
            String marca,
            String proprietario,
            String placa,
            int numeroPassageiros,
            double preco,
            Motor motor) {
        setMarca(marca);
        setProprietario(proprietario);
        setPlaca(placa);
        setNumeroPassageiros(numeroPassageiros);
        setPreco(preco);
        this.motor = motor;
    }

/*___________________________________DESCONTO_________________________________*/
    public double desconto(double percentual) {
        double desconto = 0;
        try {
            if (percentual < 5 || percentual > 70) {
                throw new Exception("ERROR! Percentual deve ser de 5% à 70%");
            } else {
                desconto = getPreco() * (percentual / 100);
            }
        } catch (NumberFormatException e) {
            System.out.println("ERROR! Valor REAL não reconhecido.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return getPreco() - desconto;
    }

/*___________________________________IMPRIMIR_________________________________*/
    public void imprimir() {
        if ("".equals(getMarca())) {
            System.out.println("Marca: CAMPO_VAZIO");
        } else {
            System.out.println("Marca: " + getMarca());
        }
        if ("".equals(getProprietario())) {
            System.out.println("Proprietário: CAMPO_VAZIO");
        } else {
            System.out.println("Proprietário: " + getProprietario());
        }
        if ("".equals(getPlaca())) {
            System.out.println("Placa: CAMPO_VAZIO");
        } else {
            System.out.println("Placa: " + getPlaca());
        }
        System.out.println("Tempo máximo de uso: " + getTempoMaxUso());
        System.out.println("Idade mínima do motorista: " + getIdadeMinimaMotorista());
        if (getNumeroPassageiros() > 0) {
            System.out.println("Número de Passageiros: " + getNumeroPassageiros());
        }
        if (getPreco() > 0) {
            System.out.printf("Preço: R$%.2f", getPreco());
        }
        System.out.println("------------Informações do Motor------------");
        motor.imprimir();
    }

/*_________________________________CONSTRUTORES_______________________________*/
    public Veiculo() {
    }

    public Veiculo(String marca) {
        setMarca(marca);
    }

    public Veiculo(int numeroPassageiros) {
        setNumeroPassageiros(numeroPassageiros);
    }

    public Veiculo(double preco) {
        setPreco(preco);
    }

    public Veiculo(String marca, String proprietario) {
        setMarca(marca);
        setProprietario(proprietario);
    }

    public Veiculo(String marca, int numeroPassageiros) {
        setMarca(marca);
        setNumeroPassageiros(numeroPassageiros);
    }

    public Veiculo(int numeroPassageiros, String proprietario) {
        setNumeroPassageiros(numeroPassageiros);
        setProprietario(proprietario);
    }

    public Veiculo(String placa, double preco) {
        setPlaca(placa);
        setPreco(preco);
    }

    public Veiculo(double preco, String proprietario) {
        setPreco(preco);
        setProprietario(proprietario);
    }

    public Veiculo(String marca, String proprietario, int numeroPassageiros) {
        setMarca(marca);
        setProprietario(proprietario);
        setNumeroPassageiros(numeroPassageiros);
    }

    public Veiculo(String marca, String proprietario, String placa) {
        setMarca(marca);
        setProprietario(proprietario);
        setPlaca(placa);
    }

    public Veiculo(
            String marca,
            String proprietario,
            String placa,
            int numeroPassageiros) {
        setMarca(marca);
        setProprietario(proprietario);
        setPlaca(placa);
        setNumeroPassageiros(numeroPassageiros);
    }

    public Veiculo(
            String marca,
            String proprietario,
            String placa,
            double preco) {
        setMarca(marca);
        setProprietario(proprietario);
        setPlaca(placa);
        setPreco(preco);
    }

    public Veiculo(
            String marca,
            String proprietario,
            String placa,
            int numeroPassageiros,
            double preco) {
        setMarca(marca);
        setProprietario(proprietario);
        setPlaca(placa);
        setNumeroPassageiros(numeroPassageiros);
        setPreco(preco);
    }

    public Veiculo(Motor motor) {
        this.motor = motor;
    }

    public Veiculo(
            String marca,
            String proprietario,
            String placa,
            Motor motor) {
        setMarca(marca);
        setProprietario(proprietario);
        setPlaca(placa);
        this.motor = motor;
    }

    public Veiculo(
            String marca,
            String proprietario,
            String placa,
            int numeroPassageiros,
            Motor motor) {
        setMarca(marca);
        setProprietario(proprietario);
        setPlaca(placa);
        setNumeroPassageiros(numeroPassageiros);
        this.motor = motor;
    }

    public Veiculo(
            String marca,
            String proprietario,
            String placa,
            double preco,
            Motor motor) {
        setMarca(marca);
        setProprietario(proprietario);
        setPlaca(placa);
        setPreco(preco);
        this.motor = motor;
    }

    public Veiculo(
            String marca,
            String proprietario,
            String placa,
            int numeroPassageiros,
            double preco,
            Motor motor) {
        setMarca(marca);
        setProprietario(proprietario);
        setPlaca(placa);
        setNumeroPassageiros(numeroPassageiros);
        setPreco(preco);
        this.motor = motor;
    }
}