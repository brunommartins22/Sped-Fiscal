/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bruno.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author bruno
 */
public class TituloNotaFiscal {

    /**
     * Texto fixo contendo "C100";
     */
    private String identificador;
    /**
     * Indicador do tipo de operação: 0- Entrada; 1- Saída;
     */
    private String tipoOperacao;
    /**
     * Indicador do emitente do documento fiscal: 0- Emissão própria; 1-
     * Terceiros;
     */
    private String tipoEmitente;
    /**
     * Código do participante (campo 02 do Registro 0150): - do emitente do
     * documento ou do remetente das mercadorias, no caso de entradas; - do
     * adquirente, no caso de saídas;
     */
    private Contribuinte contribuinte;
    /**
     * Código do modelo do documento fiscal;
     */
    private String codModelo;
    /**
     * Código da situação do documento fiscal;
     */
    private Long codSituacao;
    /**
     * Série do documento fiscal;
     */
    private String serie;
    /**
     * Número do documento fiscal ;
     */
    private Long numDocumento;
    /**
     * Chave da Nota Fiscal Eletrônica;
     */
    private String chaveNfe;
    /**
     * Data da emissão do documento fiscal;
     */
    private Date dtEmissao;
    /**
     * Data da entrada ou da saída;
     */
    private Date dtEntradaSaida;
    /**
     * Valor total do documento fiscal ;
     */
    private Double valorDoc;
    /**
     * Obs.: A partir de 01/07/2012 passará a ser: Indicador do tipo de
     * pagamento: 0- À vista; 1- A prazo; 2 - Outros;
     */
    private String tipoPagamento;
    /**
     * Valor total do desconto
     */
    private Double valorDesconto;
    /**
     * Abatimento não tributado e não comercial Ex. desconto ICMS nas remessas
     * para ZFM.
     */
    private Double valorAbatimentoNT;
    /**
     * Valor total das mercadorias e serviços
     */
    private Double valorMercadorias;
    /**
     * Obs.: A partir de 01/01/2012 passará a ser: Indicador do tipo do frete:
     * 0- Por conta do emitente; 1- Por conta do destinatário/remetente; 2- Por
     * conta de terceiros; 9- Sem cobrança de frete.
     */
    private String tipoFrete;
    /**
     * Valor do frete indicado no documento fiscal;
     */
    private Double valorFrete;
    /**
     * Valor do seguro indicado no documento fiscal;
     */
    private Double valorSeguro;
    /**
     * Valor de outras despesas acessórias;
     */
    private Double valorDespesasAcessorias;
    /**
     * Valor da base de cálculo do ICMS;
     */
    private Double valorBaseCalculoICMS;
    /**
     * Valor do ICMS;
     */
    private Double valorICMS;
    /**
     * Valor da base de cálculo do ICMS substituição; tributária;
     */
    private Double valorBaseCalculoIcmsST;
    /**
     * Valor do ICMS retido por substituição tributária;
     */
    private Double valorIcmsST;
    /**
     * Valor total do IPI ;
     */
    private Double valorIPI;
    /**
     * Valor total do PIS;
     */
    private Double valorPis;
    /**
     * Valor total da COFINS;
     */
    private Double valorCofins;
    /**
     * Valor total do PIS retido por substituição tributária;
     */
    private Double valorPisST;
    /**
     * Valor total da COFINS retido por substituição tributária;
     */
    private Double valorCofinsSt;
    /**
     * Itens da Nota Fiscal;
     */
    private List<ItemNotaFiscal> ItensNotaFiscal;

    //******************************* get && setts *****************************
    /**
     * Texto fixo contendo "C100";
     *
     * @return the identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Texto fixo contendo "C100";
     *
     * @param identificador the identificador to set
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * Indicador do tipo de operação: 0- Entrada; 1- Saída;
     *
     * @return the tipoOperacao
     */
    public String getTipoOperacao() {
        return tipoOperacao;
    }

    /**
     * Indicador do tipo de operação: 0- Entrada; 1- Saída;
     *
     * @param tipoOperacao the tipoOperacao to set
     */
    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    /**
     * Indicador do emitente do documento fiscal: 0- Emissão própria; 1-
     * Terceiros;
     *
     * @return the tipoEmitente
     */
    public String getTipoEmitente() {
        return tipoEmitente;
    }

    /**
     * Indicador do emitente do documento fiscal: 0- Emissão própria; 1-
     * Terceiros;
     *
     * @param tipoEmitente the tipoEmitente to set
     */
    public void setTipoEmitente(String tipoEmitente) {
        this.tipoEmitente = tipoEmitente;
    }

    /**
     * Código do modelo do documento fiscal;
     *
     * @return the codModelo
     */
    public String getCodModelo() {
        return codModelo;
    }

    /**
     * Código do modelo do documento fiscal;
     *
     * @param codModelo the codModelo to set
     */
    public void setCodModelo(String codModelo) {
        this.codModelo = codModelo;
    }

    /**
     * Código da situação do documento fiscal;
     *
     * @return the codSituacao
     */
    public Long getCodSituacao() {
        return codSituacao;
    }

    /**
     * Código da situação do documento fiscal;
     *
     * @param codSituacao the codSituacao to set
     */
    public void setCodSituacao(Long codSituacao) {
        this.codSituacao = codSituacao;
    }

    /**
     * Série do documento fiscal;
     *
     * @return the serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Série do documento fiscal;
     *
     * @param serie the serie to set
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * Número do documento fiscal ;
     *
     * @return the numDocumento
     */
    public Long getNumDocumento() {
        return numDocumento;
    }

    /**
     * Número do documento fiscal ;
     *
     * @param numDocumento the numDocumento to set
     */
    public void setNumDocumento(Long numDocumento) {
        this.numDocumento = numDocumento;
    }

    /**
     * Chave da Nota Fiscal Eletrônica;
     *
     * @return the chaveNfe
     */
    public String getChaveNfe() {
        return chaveNfe;
    }

    /**
     * Chave da Nota Fiscal Eletrônica;
     *
     * @param chaveNfe the chaveNfe to set
     */
    public void setChaveNfe(String chaveNfe) {
        this.chaveNfe = chaveNfe;
    }

    /**
     * Data da emissão do documento fiscal;
     *
     * @return the dtEmissao
     */
    public Date getDtEmissao() {
        return dtEmissao;
    }

    /**
     * Data da emissão do documento fiscal;
     *
     * @param dtEmissao the dtEmissao to set
     */
    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    /**
     * Data da entrada ou da saída;
     *
     * @return the dtEntradaSaida
     */
    public Date getDtEntradaSaida() {
        return dtEntradaSaida;
    }

    /**
     * Data da entrada ou da saída;
     *
     * @param dtEntradaSaida the dtEntradaSaida to set
     */
    public void setDtEntradaSaida(Date dtEntradaSaida) {
        this.dtEntradaSaida = dtEntradaSaida;
    }

    /**
     * Valor total do documento fiscal ;
     *
     * @return the valorDoc
     */
    public Double getValorDoc() {
        if (valorDoc == null) {
            valorDoc = 0.0;
        }
        return valorDoc;
    }

    /**
     * Valor total do documento fiscal ;
     *
     * @param valorDoc the valorDoc to set
     */
    public void setValorDoc(Double valorDoc) {
        this.valorDoc = valorDoc;
    }

    /**
     * Obs.: A partir de 01/07/2012 passará a ser: Indicador do tipo de
     * pagamento: 0- À vista; 1- A prazo; 2 - Outros;
     *
     * @return the tipoPagamento
     */
    public String getTipoPagamento() {
        return tipoPagamento;
    }

    /**
     * Obs.: A partir de 01/07/2012 passará a ser: Indicador do tipo de
     * pagamento: 0- À vista; 1- A prazo; 2 - Outros;
     *
     * @param tipoPagamento the tipoPagamento to set
     */
    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    /**
     * Valor total do desconto
     *
     * @return the valorDesconto
     */
    public Double getValorDesconto() {
        return valorDesconto;
    }

    /**
     * Valor total do desconto
     *
     * @param valorDesconto the valorDesconto to set
     */
    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    /**
     * Abatimento não tributado e não comercial Ex. desconto ICMS nas remessas
     * para ZFM.
     *
     * @return the valorAbatimentoNT
     */
    public Double getValorAbatimentoNT() {
        return valorAbatimentoNT;
    }

    /**
     * Abatimento não tributado e não comercial Ex. desconto ICMS nas remessas
     * para ZFM.
     *
     * @param valorAbatimentoNT the valorAbatimentoNT to set
     */
    public void setValorAbatimentoNT(Double valorAbatimentoNT) {
        this.valorAbatimentoNT = valorAbatimentoNT;
    }

    /**
     * Valor total das mercadorias e serviços
     *
     * @return the valorMercadorias
     */
    public Double getValorMercadorias() {
        return valorMercadorias;
    }

    /**
     * Valor total das mercadorias e serviços
     *
     * @param valorMercadorias the valorMercadorias to set
     */
    public void setValorMercadorias(Double valorMercadorias) {
        this.valorMercadorias = valorMercadorias;
    }

    /**
     * Obs.: A partir de 01/01/2012 passará a ser: Indicador do tipo do frete:
     * 0- Por conta do emitente; 1- Por conta do destinatário/remetente; 2- Por
     * conta de terceiros; 9- Sem cobrança de frete.
     *
     * @return the tipoFrete
     */
    public String getTipoFrete() {
        return tipoFrete;
    }

    /**
     * Obs.: A partir de 01/01/2012 passará a ser: Indicador do tipo do frete:
     * 0- Por conta do emitente; 1- Por conta do destinatário/remetente; 2- Por
     * conta de terceiros; 9- Sem cobrança de frete.
     *
     * @param tipoFrete the tipoFrete to set
     */
    public void setTipoFrete(String tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    /**
     * Valor do frete indicado no documento fiscal;
     *
     * @return the valorFrete
     */
    public Double getValorFrete() {
        return valorFrete;
    }

    /**
     * Valor do frete indicado no documento fiscal;
     *
     * @param valorFrete the valorFrete to set
     */
    public void setValorFrete(Double valorFrete) {
        this.valorFrete = valorFrete;
    }

    /**
     * Valor do seguro indicado no documento fiscal;
     *
     * @return the valorSeguro
     */
    public Double getValorSeguro() {
        return valorSeguro;
    }

    /**
     * Valor do seguro indicado no documento fiscal;
     *
     * @param valorSeguro the valorSeguro to set
     */
    public void setValorSeguro(Double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    /**
     * Valor de outras despesas acessórias;
     *
     * @return the valorDespesasAcessorias
     */
    public Double getValorDespesasAcessorias() {
        return valorDespesasAcessorias;
    }

    /**
     * Valor de outras despesas acessórias;
     *
     * @param valorDespesasAcessorias the valorDespesasAcessorias to set
     */
    public void setValorDespesasAcessorias(Double valorDespesasAcessorias) {
        this.valorDespesasAcessorias = valorDespesasAcessorias;
    }

    /**
     * Valor da base de cálculo do ICMS;
     *
     * @return the valorBaseCalculoICMS
     */
    public Double getValorBaseCalculoICMS() {
        return valorBaseCalculoICMS;
    }

    /**
     * Valor da base de cálculo do ICMS;
     *
     * @param valorBaseCalculoICMS the valorBaseCalculoICMS to set
     */
    public void setValorBaseCalculoICMS(Double valorBaseCalculoICMS) {
        this.valorBaseCalculoICMS = valorBaseCalculoICMS;
    }

    /**
     * Valor do ICMS;
     *
     * @return the valorICMS
     */
    public Double getValorICMS() {
        return valorICMS;
    }

    /**
     * Valor do ICMS;
     *
     * @param valorICMS the valorICMS to set
     */
    public void setValorICMS(Double valorICMS) {
        this.valorICMS = valorICMS;
    }

    /**
     * Valor da base de cálculo do ICMS substituição; tributária;
     *
     * @return the valorBaseCalculoIcmsST
     */
    public Double getValorBaseCalculoIcmsST() {
        return valorBaseCalculoIcmsST;
    }

    /**
     * Valor da base de cálculo do ICMS substituição; tributária;
     *
     * @param valorBaseCalculoIcmsST the valorBaseCalculoIcmsST to set
     */
    public void setValorBaseCalculoIcmsST(Double valorBaseCalculoIcmsST) {
        this.valorBaseCalculoIcmsST = valorBaseCalculoIcmsST;
    }

    /**
     * Valor do ICMS retido por substituição tributária;
     *
     * @return the valorIcmsST
     */
    public Double getValorIcmsST() {
        return valorIcmsST;
    }

    /**
     * Valor do ICMS retido por substituição tributária;
     *
     * @param valorIcmsST the valorIcmsST to set
     */
    public void setValorIcmsST(Double valorIcmsST) {
        this.valorIcmsST = valorIcmsST;
    }

    /**
     * Valor total do IPI ;
     *
     * @return the valorIPI
     */
    public Double getValorIPI() {
        return valorIPI;
    }

    /**
     * Valor total do IPI ;
     *
     * @param valorIPI the valorIPI to set
     */
    public void setValorIPI(Double valorIPI) {
        this.valorIPI = valorIPI;
    }

    /**
     * Valor total do PIS;
     *
     * @return the valorPis
     */
    public Double getValorPis() {
        return valorPis;
    }

    /**
     * Valor total do PIS;
     *
     * @param valorPis the valorPis to set
     */
    public void setValorPis(Double valorPis) {
        this.valorPis = valorPis;
    }

    /**
     * Valor total da COFINS;
     *
     * @return the valorCofins
     */
    public Double getValorCofins() {
        return valorCofins;
    }

    /**
     * Valor total da COFINS;
     *
     * @param valorCofins the valorCofins to set
     */
    public void setValorCofins(Double valorCofins) {
        this.valorCofins = valorCofins;
    }

    /**
     * Valor total do PIS retido por substituição tributária;
     *
     * @return the valorPisST
     */
    public Double getValorPisST() {
        return valorPisST;
    }

    /**
     * Valor total do PIS retido por substituição tributária;
     *
     * @param valorPisST the valorPisST to set
     */
    public void setValorPisST(Double valorPisST) {
        this.valorPisST = valorPisST;
    }

    /**
     * Valor total da COFINS retido por substituição tributária;
     *
     * @return the valorCofinsSt
     */
    public Double getValorCofinsSt() {
        return valorCofinsSt;
    }

    /**
     * Valor total da COFINS retido por substituição tributária;
     *
     * @param valorCofinsSt the valorCofinsSt to set
     */
    public void setValorCofinsSt(Double valorCofinsSt) {
        this.valorCofinsSt = valorCofinsSt;
    }

    /**
     * Código do participante (campo 02 do Registro 0150): - do emitente do
     * documento ou do remetente das mercadorias, no caso de entradas; - do
     * adquirente, no caso de saídas;
     *
     * @return the contribuinte
     */
    public Contribuinte getContribuinte() {
        return contribuinte;
    }

    /**
     * Código do participante (campo 02 do Registro 0150): - do emitente do
     * documento ou do remetente das mercadorias, no caso de entradas; - do
     * adquirente, no caso de saídas;
     *
     * @param contribuinte the contribuinte to set
     */
    public void setContribuinte(Contribuinte contribuinte) {
        this.contribuinte = contribuinte;
    }

    /**
     * Itens da Nota Fiscal;
     *
     * @return the ItensNotaFiscal
     */
    public List<ItemNotaFiscal> getItensNotaFiscal() {
        if (ItensNotaFiscal == null) {
            ItensNotaFiscal = new ArrayList<>();
        }
        return ItensNotaFiscal;
    }

    /**
     * Itens da Nota Fiscal;
     *
     * @param ItensNotaFiscal the ItensNotaFiscal to set
     */
    public void setItensNotaFiscal(List<ItemNotaFiscal> ItensNotaFiscal) {
        this.ItensNotaFiscal = ItensNotaFiscal;
    }

}
