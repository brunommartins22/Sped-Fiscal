package br.com.bruno.table;

import br.com.bruno.table.AbstractTableModel;
import br.com.bruno.model.ItemNotaFiscal;
import java.text.DecimalFormat;
import java.util.List;

public class ItensTableModel1 extends AbstractTableModel<ItemNotaFiscal> {

    public String[] columns = new String[]{"Nº Item", "Cod Item", "CFOP", "NCM", "Produto", "Quantidade", "Unidade", "Valor"};

    public ItensTableModel1(List<ItemNotaFiscal> list) {
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
        ItemNotaFiscal t = getItem(rowIndex);
        switch (columnIndex) {
            case 0: {
                return t.getNumItem();
            }
            case 1: {
                return t.getProduto().getCodItem();
            }
            case 2: {
                return t.getCfop();
            }
            case 3: {
                return t.getProduto().getNcm();
            }
            case 4: {
                return t.getProduto().getNmProduto();
            }
            case 5: {
                return new DecimalFormat("00").format(t.getQuantidade());
            }
            case 6: {
                return t.getUnidade();
            }
            case 7: {
                return new DecimalFormat("#,##0.00").format(t.getValorItem());
            }
            default:
        }
        return null;
    }

}
