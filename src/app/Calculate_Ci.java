package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Calculate_Ci {

	public void calculateCi(File f1) throws IOException {
		
		String[] words=null;
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		StringBuilder sb= new StringBuilder();
		String s;
		int count = 0;
		int ifstring = 0;
		String input1="extends";   						
	    String input2="implements";
	    String input3="if";
	    String input4="if(";
		
		while((s=br.readLine()) != null)
		{
			s = s.replaceAll("\\s+", "");
			//System.out.println(s);
			
			if(s.substring(0,2).equals("//")) {
				int i=0;
				i++;
				System.out.println(i);
			  //System.out.println(s.substring(0,2));
			}
			
			
			 words=s.split(" ");   //Split the word using space
			 
	         for(int i=0;i<words.length;i++)
	         { 
	            for(int j=0;j<words[i].length();j++)
	            {	       
	               char ch=words[i].charAt(j);   //Read the word char by char
	               if(ch == '"') {
	            	   ifstring = ifstring + 1;
	               }   
	            }
	         }
	         if(ifstring%2==0)
			 {
	        	 for (String word : words) 
	        	 {
	        		// System.out.print(word);
	                 if (word.equals(input1) || word.equals(input2))   					//Search for the given word
	                 {
	                   count++;    						//If Present increase the count by one
	                 }
//	                 if (word.equals(input4) || word.equals(input3))   					//Search for the given word
//	                 {
//	                   count++;    						//If Present increase the count by one
//	                 }
	        	 }
			 }
		}
		
		System.out.println("count = "+ count);

	}
		
	
	
}
