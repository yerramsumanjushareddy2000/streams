package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors; 


public class Length {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		List<String>a=new ArrayList <String>();
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			a.add(s.next());
			
		}
		
		List<String> st=a.stream()
				  .filter(p -> p.startsWith("a"))
				  .filter(t -> t.length() == 3)
				  .collect(Collectors.toList());
		System.out.println("The Strings are....");
		for (String x:st) {
			System.out.println(x);
		}
		s.close();

	}

}
