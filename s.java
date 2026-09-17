import java.util.Arrays;
import java.util.HashSet;

public class s {

    public static void main(String[] args)  {
		int[] a= {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,4,5,6};
		HashSet s=new HashSet();
		
		for(int i:a) {
			s.add(i);
		}
		// s=[1,2,3,4,5,6]
		
		System.out.println(Arrays.toString(a));
		System.out.println(s);
		
		if(s.contains(11)) {
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
		
    
}
