package org.example.database.queries;

public class Constants {

    public static final class ApartamenteTable{
        public final static String TABLE_NAME = "apartamente_table";

        public static final String COD_APARTAMENT = "codApartament";
        public static final String ETAJ = "etaj";
        public static final String NR_CAMERE = "nrCamere";
        public static final String PRET = "pret";
        public static final String METRI_PATRATI = "metriPatrati";
        public static final String COD_AGENT = "codAgent";
    }
    public static final class AgentTable{
        public final static String TABLE_NAME = "agent_table";
        public final static String COD_AGENT = "codAgent";
        public final static String NUME = "nume";
        public final static String PRENUME = "prenume";
        public final static String VARSTA = "varsta";
        public final static String TELEFON = "telefon";
    }
}
