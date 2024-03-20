package n1exercici2.main;

import n1exercici2.handlers.ArbreDirectoris;

public class ArbreDirectorisMain {

	public static void main(String[] args) {
		
		String path = "";
		if(args.length == 1) {
			path = args[0];	
		}
		
		ArbreDirectoris demo = new ArbreDirectoris();
		demo.ordernarDirectori(path);

	}

}
