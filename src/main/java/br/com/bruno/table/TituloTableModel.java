package br.com.bruno.table;

import br.com.bruno.table.AbstractTableModel;
import br.com.bruno.model.TituloNotaFiscal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import java.util.List;

public class TituloTableModel extends AbstractTableModel<TituloNotaFiscal> {

    public String[] columns = new String[]{"Idenficador", "Tipo Operação", "Tipo Emitente", "Data Emissão", "Data Entrada/Saída", "Participante", "Cod Modelo", "Cod Situação", "Série", "Num Documento", "Chave Nfe", "Valor Documento"};

    public TituloTableModel(List<TituloNotaFiscal> list) {
        super(list);
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TituloNotaFiscal t = getItem(rowIndex);
        switch (columnIndex) {
            case 0: {
                return t.getIdentificador();

            }
            case 1: {
                return t.getTipoOperacao().equals("0") ? "Entrada" : "Saída";

            }
            case 2: {
                return t.getTipoEmitente().equals("0") ? "Emissão Própria" : "Terceiros";

            }
            case 3: {
                return t.getDtEmissao() == null ? "" : new SimpleDateFormat("dd/MM/yyyy").format(t.getDtEmissao());

            }
            case 4: {
                return t.getDtEntradaSaida() == null ? "" : new SimpleDateFormat("dd/MM/yyyy").format(t.getDtEntradaSaida());

            }
            case 5: {

                return t.getContribuinte() == null ? "Não Informado" : t.getContribuinte().getParticipante();

            }
            case 6: {
                return t.getCodModelo();

            }
            case 7: {
                return t.getCodSituacao() == null ? "" : t.getCodSituacao();

            }
            case 8: {
                return t.getSerie();

            }
            case 9: {
                return t.getNumDocumento() == null ? "" : t.getNumDocumento();

            }
            case 10: {
                return t.getChaveNfe();

            }

            case 11: {
                return t.getValorDoc() == null ? "" : new DecimalFormat("#,##0.00").format(t.getValorDoc());

            }
            default:
        }

        return null;
    }

}
