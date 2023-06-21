package org.example.services;

import org.example.database.DatabaseController;
import org.example.database.queries.Constants;
import org.example.database.queries.Queries;
import org.example.models.Apartament;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static org.example.database.queries.Queries.INSERT_INTO_APARTAMENTE;

public class ApartamentService {
    public static List<Apartament> getAll() {
        Connection connection = DatabaseController.getConnection();
        if (connection != null) {
            try {
                connection.setAutoCommit(true);
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(Queries.SELECT_FROM_APARTAMENTE);

                List<Apartament> apartaments = new LinkedList<Apartament>();

                while (rs.next()) {
                    Apartament apartament = new Apartament();
                    apartament.setCodApartament(rs.getInt(Constants.ApartamenteTable.COD_APARTAMENT));
                    apartament.setEtaj(rs.getInt(Constants.ApartamenteTable.ETAJ));
                    apartament.setNrCamere(rs.getInt(Constants.ApartamenteTable.NR_CAMERE));
                    apartament.setPret(rs.getInt(Constants.ApartamenteTable.PRET));
                    apartament.setMetriPatrati(rs.getInt(Constants.ApartamenteTable.METRI_PATRATI));
                    apartament.setCodAgent(rs.getInt(Constants.ApartamenteTable.COD_AGENT));
                    apartaments.add(apartament);
                }
                return apartaments;
            } catch (SQLException e) {
            }
        }
        return null;
    }

    public static void add(Apartament apartament) {
        Connection connection = DatabaseController.getConnection();
        try {
            if(connection != null) {
                PreparedStatement prepStmt = connection.prepareStatement(INSERT_INTO_APARTAMENTE);

                    prepStmt.setInt(1,apartament.getCodApartament());
                    prepStmt.setInt(2,apartament.getEtaj());
                    prepStmt.setInt(3,apartament.getNrCamere());
                    prepStmt.setInt(4,apartament.getPret());
                    prepStmt.setInt(5,apartament.getMetriPatrati());
                    prepStmt.setInt(6,apartament.getCodAgent());
                    prepStmt.addBatch();

            }
        } catch (Exception e) {
        }
    }
}
