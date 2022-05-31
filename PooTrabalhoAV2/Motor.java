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
public class Motor {

    private int rpmMaximo, rpm;
    private String tipoCombustivel, marca;

/*___________________________________SETTERS__________________________________*/
    public void setMarca(String marca) {
        if (!"".equals(marca)) {
            this.marca = marca;
        }
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        if (!"".equals(tipoCombustivel)) {
            this.tipoCombustivel = tipoCombustivel;
        }
    }

    public void setRpmMaximo(int rpmMaximo) {
        if (rpmMaximo > 0) {
            this.rpmMaximo = rpmMaximo;
        }
    }

    public void setRpm(int rpm) {
        if (rpm >= 0) {
            this.rpm = rpm;
        }
    }

/*____________________________________GETTERS_________________________________*/
    public String getMarca() {
        return this.marca;
    }

    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }

    public Integer getRpmMaximo() {
        return this.rpmMaximo;
    }

    public Integer getRpm() {
        return this.rpm;
    }

/*_________________________________ENTRADA_DADOS______________________________*/
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        boolean state = true;
        String var;

        while (state) {
                                     /*______CONTROLE_DE_EXCESSÕES__MARCA_____*/
            try {
                System.out.println("Digite a Marca do Motor:");
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
                                /*_CONTROLE_DE_EXCESSÕES__TIPO_DE_COMBUSTÍVEL_*/
            try {
                System.out.println("Digite o tipo de Combustível:");
                var = sc.nextLine();
                if (!"".equals(var)) {
                    setTipoCombustivel(var);
                    state = true;
                } else {
                    throw new Exception("ERROR! Campo vazio.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (state) {
                               /*______CONTROLE_DE_EXCESSÕES__RPM_MÁXIMO______*/
            try {
                System.out.println("Digite o número máximo de rotações por minuto(RPM):");
                var = sc.nextLine();
                if (Integer.parseInt(var) > 0) {
                    setRpmMaximo(Integer.parseInt(var));
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
        while (state == false) {
                                        /*__CONTROLE_DE_EXCESSÕES__RPM________*/
            try {
                System.out.println("Digite o número de rotações por minuto(RPM) atuais:");
                var = sc.nextLine();
                if (Integer.parseInt(var) >= 0) {
                    setRpm(Integer.parseInt(var));
                    state = true;
                } else {
                    throw new Exception("ERROR! Valor menor que zero.");
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
            String tipoCombustivel,
            int rpmMaximo,
            int rpm) {
        setMarca(marca);
        setTipoCombustivel(tipoCombustivel);
        setRpmMaximo(rpmMaximo);
        setRpm(rpm);
    }

/*___________________________________IMPRIMIR_________________________________*/
    public void imprimir() {
        if ("".equals(getMarca())) {
            System.out.println("Marca: CAMPO_VAZIO");
        } else {
            System.out.println("Marca: " + getMarca());
        }
        if ("".equals(getTipoCombustivel())) {
            System.out.println("Tipo de combustível: CAMPO_VAZIO");
        } else {
            System.out.println("Tipo de Combustível: " + getTipoCombustivel());
        }
        if (getRpmMaximo() > 0) {
            System.out.println("Potência Máxima: " + getRpmMaximo());
        }
        if (getRpm() >= 0) {
            System.out.println("Potência Atual: " + getRpm());
        }
    }
}