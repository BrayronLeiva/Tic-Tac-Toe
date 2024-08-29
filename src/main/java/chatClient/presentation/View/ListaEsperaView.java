package chatClient.presentation.View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ListaEsperaView {
    private JLabel lbEspera;
    private JTable tableEspera;
    private JPanel panelEspera;
    private JButton btnListo;
    private JButton btnStart;
    private JButton btn_log_out;

    public ListaEsperaView() {
        panelEspera.setVisible(true);
        initTable();

    }

    public JTable getTableEspera() {
        return tableEspera;
    }

    public JPanel getPanelEspera() {
        return panelEspera;
    }

    public JButton getBtnListo() {return btnListo;}

    public JButton getBtn_log_out() {return btn_log_out;}

    public void initTable(){
        // Inicializar el modelo de la tabla
        DefaultTableModel model = new DefaultTableModel();

        // Agregar la columna "Usuario" al modelo
        model.addColumn("Usuario");
        model.addColumn("Espera");
        tableEspera.setModel(model);
    }
}
