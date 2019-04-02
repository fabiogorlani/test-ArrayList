package it.fgorlani.test.ArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

 
public class EsempioTer {
    public static void main(String[] args) throws SQLException {
        ArrayList<RigaTerComuni> ArrTerComuni = new ArrayList<RigaTerComuni>();
        try {
            // Step 1: Load the JDBC driver. jdbc:mysql://localhost:3306/travel
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
 
            // Step 2: Establish the connection to the database.
            String url = "jdbc:sqlserver://SRVDATIORIM14:1433;databaseName=fg_controlliStandard";
            Connection conn = DriverManager.getConnection(url, "fgorlani", "fgorlani");
                        
            Statement st = conn.createStatement();
            ResultSet rsIn = st.executeQuery("SELECT * FROM ter_comuni");
            while (rsIn.next()) {
                RigaTerComuni rigaTerComuni = new RigaTerComuni();
                rigaTerComuni.setPkId(rsIn.getString("pkid"));
                rigaTerComuni.setCod(rsIn.getString("cod"));
                rigaTerComuni.setDes(rsIn.getString("des"));
                System.out.println(rigaTerComuni.toString());

            }
 
 
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}