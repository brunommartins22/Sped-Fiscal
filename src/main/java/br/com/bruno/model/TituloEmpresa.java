/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bruno.model;

import java.util.Date;

/**
 *
 * @author bruno
 */
public class TituloEmpresa {

    /**
     * Texto fixo contendo "0000".
     */
    private String identificador;
    /**
     * Código da versão do leiaute conforme a Tabela indicada no Ato Cotepe.
     */
    private Long codVersaoLeiaute;
    /**
     * Código da finalidade do arquivo: 0: Remessa do arquivo original; 1:
     * Remessa do arquivo substituto.
     */
    private Long codFinalidade;
    /**
     * Data inicial das informações contidas no arquivo.
     */
    private Date dataInicial;
    /**
     * Data final das informações contidas no arquivo.
     */
    private Date dataFinal;
    /**
     * Nome empresarial da entidade.
     */
    private String nmEmpresa;
    /**
     * Número de inscrição da entidade no CNPJ.
     */
    private String cnpj;
    /**
     * Número de inscrição da entidade no CPF.
     */
    private String cpf;
    /**
     * Sigla da UF da entidade.
     */
    private String uf;
    /**
     * IE da entidade.
     */
    private String ie;
    /**
     * Código do Município do domicílio fiscal da entidade, conforme a Tabela
     * IBGE.
     */
    private Long codMunicipio;
    /**
     * Inscrição Municipal da entidade.
     */
    private String im;
    /**
     * Inscrição da entidade na Suframa.
     */
    private String suframa;
    /**
     * Perfil de apresentação do arquivo fiscal: A: Perfil A; B: Perfil B; ou C:
     * Perfil C.
     */
    private String indPerfil;
    /**
     * Indicador de tipo de atividade: 0: Industrial ou equiparado a industrial;
     * ou 1: Outros.
     */
    private Long indAtividade;

    /**
     * Texto fixo contendo "0000".
     * @return the identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Texto fixo contendo "0000".
     * @param identificador the identificador to set
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * Código da versão do leiaute conforme a Tabela indicada no Ato Cotepe.
     * @return the codVersaoLeiaute
     */
    public Long getCodVersaoLeiaute() {
        return codVersaoLeiaute;
    }

    /**
     * Código da versão do leiaute conforme a Tabela indicada no Ato Cotepe.
     * @param codVersaoLeiaute the codVersaoLeiaute to set
     */
    public void setCodVersaoLeiaute(Long codVersaoLeiaute) {
        this.codVersaoLeiaute = codVersaoLeiaute;
    }

    /**
     * Código da finalidade do arquivo: 0: Remessa do arquivo original; 1:
     * Remessa do arquivo substituto.
     * @return the codFinalidade
     */
    public Long getCodFinalidade() {
        return codFinalidade;
    }

    /**
     * Código da finalidade do arquivo: 0: Remessa do arquivo original; 1:
     * Remessa do arquivo substituto.
     * @param codFinalidade the codFinalidade to set
     */
    public void setCodFinalidade(Long codFinalidade) {
        this.codFinalidade = codFinalidade;
    }

    /**
     * Data inicial das informações contidas no arquivo.
     * @return the dataInicial
     */
    public Date getDataInicial() {
        return dataInicial;
    }

    /**
     * Data inicial das informações contidas no arquivo.
     * @param dataInicial the dataInicial to set
     */
    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    /**
     * Data final das informações contidas no arquivo.
     * @return the dataFinal
     */
    public Date getDataFinal() {
        return dataFinal;
    }

    /**
     * Data final das informações contidas no arquivo.
     * @param dataFinal the dataFinal to set
     */
    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    /**
     * Nome empresarial da entidade.
     * @return the nmEmpresa
     */
    public String getNmEmpresa() {
        return nmEmpresa;
    }

    /**
     * Nome empresarial da entidade.
     * @param nmEmpresa the nmEmpresa to set
     */
    public void setNmEmpresa(String nmEmpresa) {
        this.nmEmpresa = nmEmpresa;
    }

    /**
     * Número de inscrição da entidade no CNPJ.
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Número de inscrição da entidade no CNPJ.
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * Número de inscrição da entidade no CPF.
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Número de inscrição da entidade no CPF.
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Sigla da UF da entidade.
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * Sigla da UF da entidade.
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * IE da entidade.
     * @return the ie
     */
    public String getIe() {
        return ie;
    }

    /**
     * IE da entidade.
     * @param ie the ie to set
     */
    public void setIe(String ie) {
        this.ie = ie;
    }

    /**
     * Código do Município do domicílio fiscal da entidade, conforme a Tabela
     * IBGE.
     * @return the codMunicipio
     */
    public Long getCodMunicipio() {
        return codMunicipio;
    }

    /**
     * Código do Município do domicílio fiscal da entidade, conforme a Tabela
     * IBGE.
     * @param codMunicipio the codMunicipio to set
     */
    public void setCodMunicipio(Long codMunicipio) {
        this.codMunicipio = codMunicipio;
    }

    /**
     * Inscrição Municipal da entidade.
     * @return the im
     */
    public String getIm() {
        return im;
    }

    /**
     * Inscrição Municipal da entidade.
     * @param im the im to set
     */
    public void setIm(String im) {
        this.im = im;
    }

    /**
     * Inscrição da entidade na Suframa.
     * @return the suframa
     */
    public String getSuframa() {
        return suframa;
    }

    /**
     * Inscrição da entidade na Suframa.
     * @param suframa the suframa to set
     */
    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    /**
     * Perfil de apresentação do arquivo fiscal: A: Perfil A; B: Perfil B; ou C:
     * Perfil C.
     * @return the indPerfil
     */
    public String getIndPerfil() {
        return indPerfil;
    }

    /**
     * Perfil de apresentação do arquivo fiscal: A: Perfil A; B: Perfil B; ou C:
     * Perfil C.
     * @param indPerfil the indPerfil to set
     */
    public void setIndPerfil(String indPerfil) {
        this.indPerfil = indPerfil;
    }

    /**
     * Indicador de tipo de atividade: 0: Industrial ou equiparado a industrial;
     * ou 1: Outros.
     * @return the indAtividade
     */
    public Long getIndAtividade() {
        return indAtividade;
    }

    /**
     * Indicador de tipo de atividade: 0: Industrial ou equiparado a industrial;
     * ou 1: Outros.
     * @param indAtividade the indAtividade to set
     */
    public void setIndAtividade(Long indAtividade) {
        this.indAtividade = indAtividade;
    }

}
