package classes;

import java.io.FileWriter;
import java.io.IOException;

public class CriaScript {
	
	public static boolean GeraScript(String nomeTabela, String nomeColuna, String tipo, Boolean notNull, Boolean autoInc)  {
			String Script = "ALTER TABLE "+nomeTabela+" ADD "+nomeColuna+" "+tipo;
			
			if (notNull) {
				Script = Script+" NOT NULL"; 
			}
			
			if (autoInc) {
				Script = Script+" AUTO_INCREMENT"; 
			}
			
			Script = Script+";";
			try {
				FileWriter fw = new FileWriter("src/arquivosGerados/Script.sql");				
				fw.write(Script);			
				fw.close();
				return true;
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}

}
