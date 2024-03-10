package n1exercici2.handlers;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ArbreDirectoris {
	
	
	public void ordernarDirectori(String path) {
	
		File directori = new File(path);
		SimpleDateFormat formatData = new SimpleDateFormat("yyyyMMdd");
	
		if(!directori.isDirectory()) {
			System.out.println("La ruta donada no és un directori vàlid");
		}
		File[] arxius = directori.listFiles();
		Arrays.sort(arxius);
		
		for(File arxiu : arxius) {
			
			Date dataModificacio = new Date(arxiu.lastModified());
			if(arxiu.isDirectory()) {
				System.out.println("Directori: " + arxiu.getName() + " - Última modificació : "
						+ formatData.format(dataModificacio));
				ordernarDirectori(path + "/" + arxiu.getName());
			}else {
				System.out.println("Arxiu: " + arxiu.getName() + " - Última modificació : "
						+ formatData.format(dataModificacio));
			}
		}
			
	}
}
