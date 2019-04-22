/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bruno.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
public class ListasPaginadas {

    private Integer mes;
    private List<TituloNotaFiscal> notas;

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public List<TituloNotaFiscal> getNotas() {
        if (notas == null) {
            notas = new ArrayList<>();
        }
        return notas;
    }

    public void setNotas(List<TituloNotaFiscal> notas) {
        this.notas = notas;
    }

}
