package org.example.database.queries;

import static org.example.database.queries.Constants.ApartamenteTable.*;

public class Queries {

    public static final String SELECT_FROM_APARTAMENTE = "SELECT * FROM " + Constants.ApartamenteTable.TABLE_NAME;
    public static final String SELECT_FROM_AGENT = "SELECT * FROM " + Constants.AgentTable.TABLE_NAME;

    public static final String INSERT_INTO_APARTAMENTE =
            "insert into "+ Constants.ApartamenteTable.TABLE_NAME +
                    "(" + COD_APARTAMENT + "," +
                    ETAJ + "," + NR_CAMERE + "," +
                    PRET + "," + METRI_PATRATI + "," +
                    COD_AGENT + ") values (?,?,?,?)";

}
