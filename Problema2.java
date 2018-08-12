import java.util.Collections;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Problema2 <E> extends LinkedList<E> {
	public LinkedList<Integer> lista = new LinkedList<>();
	
	
	public void myList() {
		String  value =JOptionPane.showInputDialog("Type a value");
		int p = Integer.parseInt(value);
		if(this.lista.contains(p)) {
			JOptionPane.showMessageDialog(null, "Number is already on the list");	
		}
		else {
			this.lista.add(p);
		}
		 Collections.sort(this.lista);
		 //System.out.println(lista);
	}
	
	public void getMedia() {
		
		if(this.lista.size()%2==0) {
			int fv = (this.lista.size()-1)/2;
			int sv = (this.lista.size()-1)/2+1;
			
			System.out.println("Media are: "+ this.lista.get(fv)+" , "+this.lista.get(sv));
		}
		else {
			int fv = (this.lista.size()-1)/2;
			System.out.println("Media is : "+this.lista.get(fv));
		}
		 
	}
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		Problema2<Integer> rlista = new Problema2<>();	
		
		
		while (JOptionPane.showConfirmDialog(null, "add Numbers?", "ADD",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		    rlista.myList();
		 
		}
		System.out.println(rlista.lista);
		  rlista.getMedia();
		  
		  long endTime   = System.nanoTime();
			long totalTime = endTime - startTime;
			System.out.println("Program run time: " + totalTime + " ns"); 
		  
	}
}
