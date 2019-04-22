/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bruno.model;

/**
 *
 * @author bruno
 */
public class Contribuinte {

    /**
     * Texto fixo contendo “0150”;
     */
    private String identificador;
    /**
     * Código de identificação do participante no arquivo;
     */
    private String Codigo;
    /**
     * Nome pessoal ou empresarial do participante;
     */
    private String participante;
    /**
     * Código do país do participante;
     */
    private Long codPais;
    /**
     * CNPJ do participante;
     */
    private Long cnpj;
    /**
     * CPF do Participante;
     */
    private Long cpf;
    /**
     * Inscrição Estadual do participante;
     */
    private String ie;
    /**
     * Código do município, conforme a tabela IBGE;
     */
    private Long codMunicipio;
    /**
     * Número de inscrição do participante na SUFRAMA;
     */
    private String suframa;
    /**
     * Logradouro e endereço do imóvel;
     */
    private String endereco;
    /**
     * Número do imóvel;
     */
    private String numImovel;
    /**
     * Dados complementares do endereço;
     */
    private String complemento;
    /**
     * Bairro em que o imóvel está situado;
     */
    private String bairro;
    //***************************** get && setts *******************************

    /**
     * Texto fixo contendo “0150”;
     *
     * @return the identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Texto fixo contendo “0150”;
     *
     * @param identificador the identificador to set
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * Código de identificação do participante no arquivo;
     *
     * @return the Codigo
     */
    public String getCodigo() {
        return Codigo;
    }

    /**
     * Código de identificação do participante no arquivo;
     *
     * @param Codigo the Codigo to set
     */
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * Nome pessoal ou empresarial do participante;
     *
     * @return the participante
     */
    public String getParticipante() {
        return participante;
    }

    /**
     * Nome pessoal ou empresarial do participante;
     *
     * @param participante the participante to set
     */
    public void setParticipante(String participante) {
        this.participante = participante;
    }

    /**
     * Código do país do participante;
     *
     * @return the codPais
     */
    public Long getCodPais() {
        return codPais;
    }

    /**
     * Código do país do participante;
     *
     * @param codPais the codPais to set
     */
    public void setCodPais(Long codPais) {
        this.codPais = codPais;
    }

    /**
     * CNPJ do participante;
     *
     * @return the cnpj
     */
    public Long getCnpj() {
        return cnpj;
    }

    /**
     * CNPJ do participante;
     *
     * @param cnpj the cnpj to set
     */
    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * CPF do participante;
     *
     * @return the cpf
     */
    public Long getCpf() {
        return cpf;
    }

    /**
     * CPF do participante;
     *
     * @param cpf the cpf to set
     */
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    /**
     * Inscrição Estadual do participante;
     *
     * @return the ie
     */
    public String getIe() {
        return ie;
    }

    /**
     * Inscrição Estadual do participante;
     *
     * @param ie the ie to set
     */
    public void setIe(String ie) {
        this.ie = ie;
    }

    /**
     * Código do município, conforme a tabela IBGE;
     *
     * @return the codMunicipio
     */
    public Long getCodMunicipio() {
        return codMunicipio;
    }

    /**
     * Código do município, conforme a tabela IBGE;
     *
     * @param codMunicipio the codMunicipio to set
     */
    public void setCodMunicipio(Long codMunicipio) {
        this.codMunicipio = codMunicipio;
    }

    /**
     * Número de inscrição do participante na SUFRAMA;
     *
     * @return the suframa
     */
    public String getSuframa() {
        return suframa;
    }

    /**
     * Número de inscrição do participante na SUFRAMA;
     *
     * @param suframa the suframa to set
     */
    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    /**
     * Logradouro e endereço do imóvel;
     *
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Logradouro e endereço do imóvel;
     *
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Número do imóvel;
     *
     * @return the numImovel
     */
    public String getNumImovel() {
        return numImovel;
    }

    /**
     * Número do imóvel;
     *
     * @param numImovel the numImovel to set
     */
    public void setNumImovel(String numImovel) {
        this.numImovel = numImovel;
    }

    /**
     * Dados complementares do endereço;
     *
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Dados complementares do endereço;
     *
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * Bairro em que o imóvel está situado;
     *
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Bairro em que o imóvel está situado;
     *
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

}
