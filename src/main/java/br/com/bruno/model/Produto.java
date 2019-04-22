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
public class Produto {

    /**
     * Texto fixo contendo "0200";
     */
    private String identificador;
    /**
     * Código do item;
     */
    private String codItem;
    /**
     * Descrição do item;
     */
    private String nmProduto;
    /**
     * Representação alfanumérico do código de barra do produto, se houver;
     */
    private String codBarra;
    /**
     * Código anterior do item com relação à última informação apresentada;
     */
    private String codAntItem;
    /**
     * Unidade de medida utilizada na quantificação de estoques;
     */
    private String unidade;
    /**
     * Tipo do item – Atividades Industriais, Comerciais e Serviços: 00 –
     * Mercadoria para Revenda; 01 – Matéria-Prima; 02 – Embalagem; 03 – Produto
     * em Processo; 04 – Produto Acabado; 05 – Subproduto; 06 – Produto
     * Intermediário; 07 – Material de Uso e Consumo; 08 – Ativo Imobilizado; 09
     * – Serviços; 10 – Outros insumos; 99 – Outras;
     */
    private String tipoProd;
    /**
     * Código da Nomenclatura Comum do Mercosul;
     */
    private String ncm;
    /**
     * Código EX, conforme a TIPI;
     */
    private String exIpi;
    /**
     * Código do gênero do item;
     */
    private Long codGenero;
    /**
     * Código do serviço conforme lista do Anexo I da Lei Complementar Federal
     * nº 116/03;
     */
    private Long codLista;
    /**
     * Alíquota de ICMS aplicável ao item nas operações internas;
     */
    private Long aliqIcms;

    //************************* get && setts ***********************************

    /**
     * Texto fixo contendo "0200";
     * @return the identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Texto fixo contendo "0200";
     * @param identificador the identificador to set
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * Código do item;
     * @return the codItem
     */
    public String getCodItem() {
        return codItem;
    }

    /**
     * Código do item;
     * @param codItem the codItem to set
     */
    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    /**
     * Descrição do item;
     * @return the nmProduto
     */
    public String getNmProduto() {
        return nmProduto;
    }

    /**
     * Descrição do item;
     * @param nmProduto the nmProduto to set
     */
    public void setNmProduto(String nmProduto) {
        this.nmProduto = nmProduto;
    }

    /**
     * Representação alfanumérico do código de barra do produto, se houver;
     * @return the codBarra
     */
    public String getCodBarra() {
        return codBarra;
    }

    /**
     * Representação alfanumérico do código de barra do produto, se houver;
     * @param codBarra the codBarra to set
     */
    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    /**
     * Código anterior do item com relação à última informação apresentada;
     * @return the codAntItem
     */
    public String getCodAntItem() {
        return codAntItem;
    }

    /**
     * Código anterior do item com relação à última informação apresentada;
     * @param codAntItem the codAntItem to set
     */
    public void setCodAntItem(String codAntItem) {
        this.codAntItem = codAntItem;
    }

    /**
     * Unidade de medida utilizada na quantificação de estoques;
     * @return the unidade
     */
    public String getUnidade() {
        return unidade;
    }

    /**
     * Unidade de medida utilizada na quantificação de estoques;
     * @param unidade the unidade to set
     */
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    /**
     * Tipo do item – Atividades Industriais, Comerciais e Serviços: 00 –
     * Mercadoria para Revenda; 01 – Matéria-Prima; 02 – Embalagem; 03 – Produto
     * em Processo; 04 – Produto Acabado; 05 – Subproduto; 06 – Produto
     * Intermediário; 07 – Material de Uso e Consumo; 08 – Ativo Imobilizado; 09
     * – Serviços; 10 – Outros insumos; 99 – Outras;
     * @return the tipoProd
     */
    public String getTipoProd() {
        return tipoProd;
    }

    /**
     * Tipo do item – Atividades Industriais, Comerciais e Serviços: 00 –
     * Mercadoria para Revenda; 01 – Matéria-Prima; 02 – Embalagem; 03 – Produto
     * em Processo; 04 – Produto Acabado; 05 – Subproduto; 06 – Produto
     * Intermediário; 07 – Material de Uso e Consumo; 08 – Ativo Imobilizado; 09
     * – Serviços; 10 – Outros insumos; 99 – Outras;
     * @param tipoProd the tipoProd to set
     */
    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }

    /**
     * Código da Nomenclatura Comum do Mercosul;
     * @return the ncm
     */
    public String getNcm() {
        return ncm;
    }

    /**
     * Código da Nomenclatura Comum do Mercosul;
     * @param ncm the ncm to set
     */
    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    /**
     * Código EX, conforme a TIPI;
     * @return the exIpi
     */
    public String getExIpi() {
        return exIpi;
    }

    /**
     * Código EX, conforme a TIPI;
     * @param exIpi the exIpi to set
     */
    public void setExIpi(String exIpi) {
        this.exIpi = exIpi;
    }

    /**
     * Código do gênero do item;
     * @return the codGenero
     */
    public Long getCodGenero() {
        return codGenero;
    }

    /**
     * Código do gênero do item;
     * @param codGenero the codGenero to set
     */
    public void setCodGenero(Long codGenero) {
        this.codGenero = codGenero;
    }

    /**
     * Código do serviço conforme lista do Anexo I da Lei Complementar Federal
     * nº 116/03;
     * @return the codLista
     */
    public Long getCodLista() {
        return codLista;
    }

    /**
     * Código do serviço conforme lista do Anexo I da Lei Complementar Federal
     * nº 116/03;
     * @param codLista the codLista to set
     */
    public void setCodLista(Long codLista) {
        this.codLista = codLista;
    }

    /**
     * Alíquota de ICMS aplicável ao item nas operações internas;
     * @return the aliqIcms
     */
    public Long getAliqIcms() {
        return aliqIcms;
    }

    /**
     * Alíquota de ICMS aplicável ao item nas operações internas;
     * @param aliqIcms the aliqIcms to set
     */
    public void setAliqIcms(Long aliqIcms) {
        this.aliqIcms = aliqIcms;
    }
}
