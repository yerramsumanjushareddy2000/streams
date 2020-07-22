package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		List<StringBuilder>a=new ArrayList <StringBuilder>();
		 StringBuilder s1=new StringBuilder("aba");
		 StringBuilder s2=new StringBuilder("hello");
		 StringBuilder s3=new StringBuilder("madam");
		 StringBuilder s4=new StringBuilder("kik");
		 a.add(s1);
		 a.add(s2);
		 a.add(s3);
		 a.add(s4);
		for (StringBuilder x:a) {
			System.out.println(x);
		
	}
		List<StringBuilder> st=a.stream()
				  .filter(p->p==p.reverse())
				  .collect(Collectors.toList());
		System.out.println("Palindromes are...");
		for (StringBuilder x:st) {
			System.out.println(x.reverse());
		
	}
		s.close();

}
}