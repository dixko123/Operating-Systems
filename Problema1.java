import java.util.LinkedList;

public class Problema1<E> extends LinkedList<E> {
	public String palabra="google";
	
	public char buscaRepetido(){	
		int cuentaLetras=0,
			contador=0;
		char busca = 0;
		
		while(cuentaLetras!=1) {
			busca=this.palabra.charAt(contador++);
			cuentaLetras=0;
			for (int i = 0; i < this.palabra.length(); i++) {
				if(busca==this.palabra.charAt(i)) {					
					cuentaLetras++;
				}
			}
		}
		System.out.println(busca);
		return busca;
		
	}
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		Problema1<String> p = new Problema1<>();
		p.buscaRepetido();
		

		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Program run time: " + totalTime + " ns");
				
	}
}
