package it.fgorlani.test.ArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

 
public class EsempioGenerico {
    public static void main(String[] args) throws SQLException {
        
        try {
            // Step 1: Load the JDBC driver. jdbc:mysql://localhost:3306/travel
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
 
            // Step 2: Establish the connection to the database.
            String url = "jdbc:sqlserver://SRVDATIORIM14:1433;databaseName=fg_controlliStandard";
            Connection conn = DriverManager.getConnection(url, "fgorlani", "fgorlani");
            Statement st = conn.createStatement();
            ResultSet rsIn = st.executeQuery("SELECT * FROM ter_comuni");
            
			while (rsIn.next()) {
				
				ArrayList<Cella> riga = new ArrayList<Cella>();
				
				ResultSetMetaData rsInMd = rsIn.getMetaData();
				
				System.out.println("Carico la lista temporanea che rappresenta la riga");
				
				int i;
				for (i = 1; i <= rsInMd.getColumnCount(); i++) {
					Cella cella = new Cella();
					cella.setNomeColonna(rsInMd.getColumnName(i));
					cella.setTipoColonna(rsInMd.getColumnTypeName(i));
					cella.setValore(rsIn.getString(i));
					
					System.out.println("Cella" + i + ": "+ cella.toString());
					riga.add(cella);
				}
				
				String elencoColonne= "";
				String elencoValori = "";
				System.out.println("Stampo la lista temporanea che rappresenta la riga");
				for (Cella tmpCella : riga) { 		      
					elencoColonne= elencoColonne + tmpCella.getNomeColonna() + ", ";
					elencoValori = elencoValori + tmpCella.getValore() + ", ";
					
					
			    }
				System.out.println("Insert (" + elencoColonne + ") value (" + elencoValori + ")");

			}
            
 
 
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}