import java.util.HashMap;
import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void swap(ArrayList<String> c, int a, int b){
		String d = c.get(a);
		c.set(a,c.get(b));
		c.set(b,d);

	}
	public static ArrayList<Double> createArrayList(double[] a){
    	ArrayList<Double> c = new ArrayList<>();

    	for (int i = 0; i < a.length; i++){
        	c.add(a[i]);
    	}

    	return c;
	}
	public static HashMap<String,Integer> combineParallelArrays(String[]a, int []b){
		HashMap<String, Integer> c = new HashMap<>();
		for (int i =0; i<a.length; i++){
			c.put(a[i], b[i]);
		}
		return c;
	}







	public static HashMap<String, Integer> increaseAge(HashMap<String, Integer> a, String b){
		a.put(b, a.get(b)+1);
		return a;
	}

}
