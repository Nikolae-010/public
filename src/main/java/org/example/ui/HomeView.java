package org.example.ui;

import org.example.models.Apartament;
import org.example.services.ApartamentService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class HomeView {
    public static void createAndShowTable() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing Frame with Table");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            DefaultTableModel tableModel = new DefaultTableModel();

            tableModel.setColumnIdentifiers(new String[]{"Etaj", "Numar camere", "Pret", "Metri patrati", "Agent"});

            List<Apartament> apartamentList = ApartamentService.getAll();
            for (Apartament a : apartamentList) {
                tableModel.addRow(new String[]{
                        String.valueOf(a.getEtaj()),
                        String.valueOf(a.getNrCamere()),
                        String.valueOf(a.getPret()),
                        String.valueOf(a.getMetriPatrati()),
                        String.valueOf(a.getCodAgent())
                });
            }

            JTable table = new JTable(tableModel);

            JScrollPane scrollPane = new JScrollPane(table);

            frame.getContentPane().add(scrollPane);

            frame.setSize(1200, 700);
            frame.setVisible(true);
        });
    }
}
