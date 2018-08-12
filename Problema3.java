
import java.util.Collections;
import java.util.LinkedList;

public class Problema3 <E> extends LinkedList<E> {
	public LinkedList<Integer> prohibitedList = new LinkedList<>();
	public LinkedList<Integer> NonList = new LinkedList<>();
	public int N=20;              //<<<<<<<< N add the range 
	public int K=15;			  //<<<<<<<< K add the number of items 
	public int getRandom() {
		int x=N;
		int y=0;
		int number =(int)(Math.random()*x) + y;
		return number;	
	}
	public void getProhibitedList(){
		while(this.prohibitedList.size()<this.K) {
			int valor=getRandom();
			if(!(this.prohibitedList.contains(valor))) {
				this.prohibitedList.add(valor);			
			}
		}
		Collections.sort(this.prohibitedList);
		System.out.println(this.prohibitedList+"  <<---Prohibited List");
	}
	
	public void getNonNumbers() {
		while(this.NonList.size()<(this.N-this.K)) {
			int valor=getRandom();
			if(!(this.prohibitedList.contains(valor)) && !(this.NonList.contains(valor)) ) {
				this.NonList.add(valor);
			}
		}
		Collections.sort(this.NonList);
		System.out.println(this.NonList+"  <<---Non List");
	}
	
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		
		Problema3<Integer> lista = new Problema3<>();
		
		lista.getProhibitedList();
		lista.getNonNumbers();
		
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Program run time: " + totalTime + " ns");
				
	}
	
}
