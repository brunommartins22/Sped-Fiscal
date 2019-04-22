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
public class ItemNotaFiscal {

    /**
     * Texto fixo contendo "C170";
     */
    private String identificador;
    /**
     * Número sequencial do item no documento fiscal;
     */
    private Long numItem;
    /**
     * Código do item (campo 02 do Registro 0200);
     */
    private Produto produto;
    /**
     * Descrição complementar do item como adotado no documento fiscal;
     */
    private String complementoItem;
    /**
     * Quantidade do item;
     */
    private Double quantidade;
    /**
     * Unidade do item (Campo 02 do registro 0190);
     */
    private String unidade;
    /**
     * Valor total do item (mercadorias ou serviços);
     */
    private Double valorItem;
    /**
     * Valor do desconto comercial;
     */
    private Double valorDesc;
    /**
     * Movimentação física do ITEM/PRODUTO: 0. SIM 1. NÃO;
     */
    private String tipoMvimentacao;
    /**
     * Código da Situação Tributária referente ao ICMS;
     */
    private Double cstICMS;
    /**
     * Código Fiscal de Operação e Prestação;
     */
    private Long cfop;
    /**
     * Código da natureza da operação (campo 02 do Registro 0400);
     */
    private String codNaturezaOper;
    /**
     * Valor da base de cálculo do ICMS;
     */
    private Double valorBaseCalculoICMS;
    /**
     * Alíquota do ICMS;
     */
    private Double aliquotaICMS;
    /**
     * Valor do ICMS creditado/debitado;
     */
    private Double valorICMS;
    /**
     * Valor da base de cálculo referente à substituição tributária;
     */
    private Double valorBaseCalculoIcmsST;
    /**
     * Alíquota do ICMS da substituição tributária na unidade da federação de
     * destino;
     */
    private Double aliquotaST;
    /**
     * Valor do ICMS referente à substituição tributária;
     */
    private Double valorIcmsST;
    /**
     * Indicador de período de apuração do IPI: 0 - Mensal; 1 - Decendial;
     */
    private String tipoApuracao;
    /**
     * Código da Situação Tributária referente ao IPI;
     */
    private String cstIPI;
    /**
     * Código de enquadramento legal do IPI;
     */
    private String codEquadramentoIPI;
    /**
     * Valor da base de cálculo do IPI;
     */
    private Double valorBaseCalculoIPI;
    /**
     * Alíquota do IPI;
     */
    private Double aliquotaIPI;
    /**
     * Valor do IPI creditado/debitado;
     */
    private Double valorIPI;
    /**
     * Código da Situação Tributária referente ao PIS;
     */
    private Double cstPIS;
    /**
     * Valor da base de cálculo do PIS;
     */
    private Double valorBaseCalculoPIS;
    /**
     * Alíquota do PIS (em percentual);
     */
    private Double aliquotaPercentPIS;
    /**
     * Quantidade – Base de cálculo PIS;
     */
    private Double quantidadeBaseCalculoPIS;
    /**
     * Alíquota do PIS (em reais);
     */
    private Double aliquotaValorPIS;
    /**
     * Valor do PIS;
     */
    private Double valorPIS;
    /**
     * Código da Situação Tributária referente ao COFINS;
     */
    private Double cstCOFINS;
    /**
     * Valor da base de cálculo da COFINS;
     */
    private Double valorBaseCalculoCOFINS;
    /**
     * Alíquota do COFINS (em percentual);
     */
    private Double aliquotaPercentCOFINS;
    /**
     * Quantidade – Base de cálculo COFINS;
     */
    private Double quantidadeBaseCalculoCOFINS;
    /**
     * Alíquota da COFINS (em reais);
     */
    private Double aliquotaValorCOFINS;
    /**
     * Valor da COFINS;
     */
    private Double valorCOFINS;
    /**
     * Código da conta analítica contábil debitada/creditada;
     */
    private String codContaContabil;
    //******************************* get && setts *****************************

    /**
     * Texto fixo contendo "C170";
     *
     * @return the identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Texto fixo contendo "C170";
     *
     * @param identificador the identificador to set
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * Número sequencial do item no documento fiscal;
     *
     * @return the numItem
     */
    public Long getNumItem() {
        return numItem;
    }

    /**
     * Número sequencial do item no documento fiscal;
     *
     * @param numItem the numItem to set
     */
    public void setNumItem(Long numItem) {
        this.numItem = numItem;
    }

    /**
     * Código do item (campo 02 do Registro 0200);
     *
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * Código do item (campo 02 do Registro 0200);
     *
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * Descrição complementar do item como adotado no documento fiscal;
     *
     * @return the complementoItem
     */
    public String getComplementoItem() {
        return complementoItem;
    }

    /**
     * Descrição complementar do item como adotado no documento fiscal;
     *
     * @param complementoItem the complementoItem to set
     */
    public void setComplementoItem(String complementoItem) {
        this.complementoItem = complementoItem;
    }

    /**
     * Quantidade do item;
     *
     * @return the quantidade
     */
    public Double getQuantidade() {
        if (quantidade == null) {
            quantidade = 0.0;
        }
        return quantidade;
    }

    /**
     * Quantidade do item;
     *
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Unidade do item (Campo 02 do registro 0190);
     *
     * @return the unidade
     */
    public String getUnidade() {
        return unidade;
    }

    /**
     * Unidade do item (Campo 02 do registro 0190);
     *
     * @param unidade the unidade to set
     */
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    /**
     * Valor total do item (mercadorias ou serviços);
     *
     * @return the valorItem
     */
    public Double getValorItem() {
        if (valorItem == null) {
            valorItem = 0.0;
        }
        return valorItem;
    }

    /**
     * Valor total do item (mercadorias ou serviços);
     *
     * @param valorItem the valorItem to set
     */
    public void setValorItem(Double valorItem) {
        this.valorItem = valorItem;
    }

    /**
     * Valor do desconto comercial;
     *
     * @return the valorDesc
     */
    public Double getValorDesc() {
        if (valorDesc == null) {
            valorDesc = 0.0;
        }
        return valorDesc;
    }

    /**
     * Valor do desconto comercial;
     *
     * @param valorDesc the valorDesc to set
     */
    public void setValorDesc(Double valorDesc) {
        this.valorDesc = valorDesc;
    }

    /**
     * Movimentação física do ITEM/PRODUTO: 0. SIM 1. NÃO;
     *
     * @return the tipoMvimentacao
     */
    public String getTipoMvimentacao() {
        return tipoMvimentacao;
    }

    /**
     * Movimentação física do ITEM/PRODUTO: 0. SIM 1. NÃO;
     *
     * @param tipoMvimentacao the tipoMvimentacao to set
     */
    public void setTipoMvimentacao(String tipoMvimentacao) {
        this.tipoMvimentacao = tipoMvimentacao;
    }

    /**
     * Código da Situação Tributária referente ao ICMS;
     *
     * @return the cstICMS
     */
    public Double getCstICMS() {
        if (cstICMS == null) {
            cstICMS = 0.0;
        }
        return cstICMS;
    }

    /**
     * Código da Situação Tributária referente ao ICMS;
     *
     * @param cstICMS the cstICMS to set
     */
    public void setCstICMS(Double cstICMS) {
        this.cstICMS = cstICMS;
    }

    /**
     * Código Fiscal de Operação e Prestação;
     *
     * @return the cfop
     */
    public Long getCfop() {
        return cfop;
    }

    /**
     * Código Fiscal de Operação e Prestação;
     *
     * @param cfop the cfop to set
     */
    public void setCfop(Long cfop) {
        this.cfop = cfop;
    }

    /**
     * Código da natureza da operação (campo 02 do Registro 0400);
     *
     * @return the codNaturezaOper
     */
    public String getCodNaturezaOper() {
        return codNaturezaOper;
    }

    /**
     * Código da natureza da operação (campo 02 do Registro 0400);
     *
     * @param codNaturezaOper the codNaturezaOper to set
     */
    public void setCodNaturezaOper(String codNaturezaOper) {
        this.codNaturezaOper = codNaturezaOper;
    }

    /**
     * Valor da base de cálculo do ICMS;
     *
     * @return the valorBaseCalculoICMS
     */
    public Double getValorBaseCalculoICMS() {
        if (valorBaseCalculoICMS == null) {
            valorBaseCalculoICMS = 0.0;
        }
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
     * Alíquota do ICMS;
     *
     * @return the aliquotaICMS
     */
    public Double getAliquotaICMS() {
        if (aliquotaICMS == null) {
            aliquotaICMS = 0.0;
        }
        return aliquotaICMS;
    }

    /**
     * Alíquota do ICMS;
     *
     * @param aliquotaICMS the aliquotaICMS to set
     */
    public void setAliquotaICMS(Double aliquotaICMS) {
        this.aliquotaICMS = aliquotaICMS;
    }

    /**
     * Valor do ICMS creditado/debitado;
     *
     * @return the valorICMS
     */
    public Double getValorICMS() {
        if (valorICMS == null) {
            valorICMS = 0.0;
        }
        return valorICMS;
    }

    /**
     * Valor do ICMS creditado/debitado;
     *
     * @param valorICMS the valorICMS to set
     */
    public void setValorICMS(Double valorICMS) {
        this.valorICMS = valorICMS;
    }

    /**
     * Valor da base de cálculo referente à substituição tributária;
     *
     * @return the valorBaseCalculoIcmsST
     */
    public Double getValorBaseCalculoIcmsST() {
        if (valorBaseCalculoIcmsST == null) {
            valorBaseCalculoIcmsST = 0.0;
        }
        return valorBaseCalculoIcmsST;
    }

    /**
     * Valor da base de cálculo referente à substituição tributária;
     *
     * @param valorBaseCalculoIcmsST the valorBaseCalculoIcmsST to set
     */
    public void setValorBaseCalculoIcmsST(Double valorBaseCalculoIcmsST) {
        this.valorBaseCalculoIcmsST = valorBaseCalculoIcmsST;
    }

    /**
     * Alíquota do ICMS da substituição tributária na unidade da federação de
     * destino;
     *
     * @return the aliquotaST
     */
    public Double getAliquotaST() {
        if (aliquotaST == null) {
            aliquotaST = 0.0;
        }
        return aliquotaST;
    }

    /**
     * Alíquota do ICMS da substituição tributária na unidade da federação de
     * destino;
     *
     * @param aliquotaST the aliquotaST to set
     */
    public void setAliquotaST(Double aliquotaST) {
        this.aliquotaST = aliquotaST;
    }

    /**
     * Valor do ICMS referente à substituição tributária;
     *
     * @return the valorIcmsST
     */
    public Double getValorIcmsST() {
        if (valorIcmsST == null) {
            valorIcmsST = 0.0;
        }
        return valorIcmsST;
    }

    /**
     * Valor do ICMS referente à substituição tributária;
     *
     * @param valorIcmsST the valorIcmsST to set
     */
    public void setValorIcmsST(Double valorIcmsST) {
        this.valorIcmsST = valorIcmsST;
    }

    /**
     * Indicador de período de apuração do IPI: 0 - Mensal; 1 - Decendial;
     *
     * @return the tipoApuracao
     */
    public String getTipoApuracao() {
        return tipoApuracao;
    }

    /**
     * Indicador de período de apuração do IPI: 0 - Mensal; 1 - Decendial;
     *
     * @param tipoApuracao the tipoApuracao to set
     */
    public void setTipoApuracao(String tipoApuracao) {
        this.tipoApuracao = tipoApuracao;
    }

    /**
     * Código da Situação Tributária referente ao IPI;
     *
     * @return the cstIPI
     */
    public String getCstIPI() {
        return cstIPI;
    }

    /**
     * Código da Situação Tributária referente ao IPI;
     *
     * @param cstIPI the cstIPI to set
     */
    public void setCstIPI(String cstIPI) {
        this.cstIPI = cstIPI;
    }

    /**
     * Código de enquadramento legal do IPI;
     *
     * @return the codEquadramentoIPI
     */
    public String getCodEquadramentoIPI() {
        return codEquadramentoIPI;
    }

    /**
     * Código de enquadramento legal do IPI;
     *
     * @param codEquadramentoIPI the codEquadramentoIPI to set
     */
    public void setCodEquadramentoIPI(String codEquadramentoIPI) {
        this.codEquadramentoIPI = codEquadramentoIPI;
    }

    /**
     * Valor da base de cálculo do IPI;
     *
     * @return the valorBaseCalculoIPI
     */
    public Double getValorBaseCalculoIPI() {
        if (valorBaseCalculoIPI == null) {
            valorBaseCalculoIPI = 0.0;
        }
        return valorBaseCalculoIPI;
    }

    /**
     * Valor da base de cálculo do IPI;
     *
     * @param valorBaseCalculoIPI the valorBaseCalculoIPI to set
     */
    public void setValorBaseCalculoIPI(Double valorBaseCalculoIPI) {
        this.valorBaseCalculoIPI = valorBaseCalculoIPI;
    }

    /**
     * Alíquota do IPI;
     *
     * @return the aliquotaIPI
     */
    public Double getAliquotaIPI() {
        if (aliquotaIPI == null) {
            aliquotaIPI = 0.0;
        }
        return aliquotaIPI;
    }

    /**
     * Alíquota do IPI;
     *
     * @param aliquotaIPI the aliquotaIPI to set
     */
    public void setAliquotaIPI(Double aliquotaIPI) {
        this.aliquotaIPI = aliquotaIPI;
    }

    /**
     * Valor do IPI creditado/debitado;
     *
     * @return the valorIPI
     */
    public Double getValorIPI() {
        if (valorIPI == null) {
            valorIPI = 0.0;
        }
        return valorIPI;
    }

    /**
     * Valor do IPI creditado/debitado;
     *
     * @param valorIPI the valorIPI to set
     */
    public void setValorIPI(Double valorIPI) {
        this.valorIPI = valorIPI;
    }

    /**
     * Código da Situação Tributária referente ao PIS;
     *
     * @return the cstPIS
     */
    public Double getCstPIS() {
        if (cstPIS == null) {
            cstPIS = 0.0;
        }
        return cstPIS;
    }

    /**
     * Código da Situação Tributária referente ao PIS;
     *
     * @param cstPIS the cstPIS to set
     */
    public void setCstPIS(Double cstPIS) {
        this.cstPIS = cstPIS;
    }

    /**
     * Valor da base de cálculo do PIS;
     *
     * @return the valorBaseCalculoPIS
     */
    public Double getValorBaseCalculoPIS() {
        if (valorBaseCalculoPIS == null) {
            valorBaseCalculoPIS = 0.0;
        }
        return valorBaseCalculoPIS;
    }

    /**
     * Valor da base de cálculo do PIS;
     *
     * @param valorBaseCalculoPIS the valorBaseCalculoPIS to set
     */
    public void setValorBaseCalculoPIS(Double valorBaseCalculoPIS) {
        this.valorBaseCalculoPIS = valorBaseCalculoPIS;
    }

    /**
     * Alíquota do PIS (em percentual);
     *
     * @return the aliquotaPercentPIS
     */
    public Double getAliquotaPercentPIS() {
        if (aliquotaPercentPIS == null) {
            aliquotaPercentPIS = 0.0;
        }
        return aliquotaPercentPIS;
    }

    /**
     * Alíquota do PIS (em percentual);
     *
     * @param aliquotaPercentPIS the aliquotaPercentPIS to set
     */
    public void setAliquotaPercentPIS(Double aliquotaPercentPIS) {
        this.aliquotaPercentPIS = aliquotaPercentPIS;
    }

    /**
     * Quantidade – Base de cálculo PIS;
     *
     * @return the quantidadeBaseCalculoPIS
     */
    public Double getQuantidadeBaseCalculoPIS() {
        if (quantidadeBaseCalculoPIS == null) {
            quantidadeBaseCalculoPIS = 0.0;
        }
        return quantidadeBaseCalculoPIS;
    }

    /**
     * Quantidade – Base de cálculo PIS;
     *
     * @param quantidadeBaseCalculoPIS the quantidadeBaseCalculoPIS to set
     */
    public void setQuantidadeBaseCalculoPIS(Double quantidadeBaseCalculoPIS) {
        this.quantidadeBaseCalculoPIS = quantidadeBaseCalculoPIS;
    }

    /**
     * Alíquota do PIS (em reais);
     *
     * @return the aliquotaValorPIS
     */
    public Double getAliquotaValorPIS() {
        if (aliquotaValorPIS == null) {
            aliquotaValorPIS = 0.0;
        }
        return aliquotaValorPIS;
    }

    /**
     * Alíquota do PIS (em reais);
     *
     * @param aliquotaValorPIS the aliquotaValorPIS to set
     */
    public void setAliquotaValorPIS(Double aliquotaValorPIS) {
        this.aliquotaValorPIS = aliquotaValorPIS;
    }

    /**
     * Valor do PIS;
     *
     * @return the valorPIS
     */
    public Double getValorPIS() {
        if (valorPIS == null) {
            valorPIS = 0.0;
        }
        return valorPIS;
    }

    /**
     * Valor do PIS;
     *
     * @param valorPIS the valorPIS to set
     */
    public void setValorPIS(Double valorPIS) {
        this.valorPIS = valorPIS;
    }

    /**
     * Código da Situação Tributária referente ao COFINS;
     *
     * @return the cstCOFINS
     */
    public Double getCstCOFINS() {
        if (cstCOFINS == null) {
            cstCOFINS = 0.0;
        }
        return cstCOFINS;
    }

    /**
     * Código da Situação Tributária referente ao COFINS;
     *
     * @param cstCOFINS the cstCOFINS to set
     */
    public void setCstCOFINS(Double cstCOFINS) {
        this.cstCOFINS = cstCOFINS;
    }

    /**
     * Valor da base de cálculo da COFINS;
     *
     * @return the valorBaseCalculoCOFINS
     */
    public Double getValorBaseCalculoCOFINS() {
        if (valorBaseCalculoCOFINS == null) {
            valorBaseCalculoCOFINS = 0.0;
        }
        return valorBaseCalculoCOFINS;
    }

    /**
     * Valor da base de cálculo da COFINS;
     *
     * @param valorBaseCalculoCOFINS the valorBaseCalculoCOFINS to set
     */
    public void setValorBaseCalculoCOFINS(Double valorBaseCalculoCOFINS) {
        this.valorBaseCalculoCOFINS = valorBaseCalculoCOFINS;
    }

    /**
     * Alíquota do COFINS (em percentual);
     *
     * @return the aliquotaPercentCOFINS
     */
    public Double getAliquotaPercentCOFINS() {
        if (aliquotaPercentCOFINS == null) {
            aliquotaPercentCOFINS = 0.0;
        }
        return aliquotaPercentCOFINS;
    }

    /**
     * Alíquota do COFINS (em percentual);
     *
     * @param aliquotaPercentCOFINS the aliquotaPercentCOFINS to set
     */
    public void setAliquotaPercentCOFINS(Double aliquotaPercentCOFINS) {
        this.aliquotaPercentCOFINS = aliquotaPercentCOFINS;
    }

    /**
     * Quantidade – Base de cálculo COFINS;
     *
     * @return the quantidadeBaseCalculoCOFINS
     */
    public Double getQuantidadeBaseCalculoCOFINS() {
        if (quantidadeBaseCalculoCOFINS == null) {
            quantidadeBaseCalculoCOFINS = 0.0;
        }
        return quantidadeBaseCalculoCOFINS;
    }

    /**
     * Quantidade – Base de cálculo COFINS;
     *
     * @param quantidadeBaseCalculoCOFINS the quantidadeBaseCalculoCOFINS to set
     */
    public void setQuantidadeBaseCalculoCOFINS(Double quantidadeBaseCalculoCOFINS) {
        this.quantidadeBaseCalculoCOFINS = quantidadeBaseCalculoCOFINS;
    }

    /**
     * Alíquota da COFINS (em reais);
     *
     * @return the aliquotaValorCOFINS
     */
    public Double getAliquotaValorCOFINS() {
        if (aliquotaValorCOFINS == null) {
            aliquotaValorCOFINS = 0.0;
        }
        return aliquotaValorCOFINS;
    }

    /**
     * Alíquota da COFINS (em reais);
     *
     * @param aliquotaValorCOFINS the aliquotaValorCOFINS to set
     */
    public void setAliquotaValorCOFINS(Double aliquotaValorCOFINS) {
        this.aliquotaValorCOFINS = aliquotaValorCOFINS;
    }

    /**
     * Valor da COFINS;
     *
     * @return the valorCOFINS
     */
    public Double getValorCOFINS() {
        if (valorCOFINS == null) {
            valorCOFINS = 0.0;
        }
        return valorCOFINS;
    }

    /**
     * Valor da COFINS;
     *
     * @param valorCOFINS the valorCOFINS to set
     */
    public void setValorCOFINS(Double valorCOFINS) {
        this.valorCOFINS = valorCOFINS;
    }

    /**
     * Código da conta analítica contábil debitada/creditada;
     *
     * @return the codContaContabil
     */
    public String getCodContaContabil() {
        return codContaContabil;
    }

    /**
     * Código da conta analítica contábil debitada/creditada;
     *
     * @param codContaContabil the codContaContabil to set
     */
    public void setCodContaContabil(String codContaContabil) {
        this.codContaContabil = codContaContabil;
    }

    public Double getValorUnitario() {

        return (valorItem == null ? 0.0 : valorItem) / (quantidade == null ? 0.0 : quantidade);
    }

}
