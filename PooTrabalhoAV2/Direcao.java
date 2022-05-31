/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PooTrabalhoAV2;

/**
 *
 * @author danib
 */
public interface Direcao {

    int TEMPOMAXUSO = 30, IDADEMINIMAMOTORISTA = 18;

    Integer getIdadeMinimaMotorista();

    Integer getTempoMaxUso();

    void acelerar();

    void desacelerar();

    void frear();

    void virarDireita();

    void virarEsquerda();
    
    void entradaDados();
    
    void imprimir();
}