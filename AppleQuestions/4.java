// find uniqie emails from emails array 

import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		String[] emails = {"hiba.barakat@gmail.com","hiba.barakat+jnjnkd@gmail.com","hibabarakat@gmail.com","hiba.bart@gmail.com"};
		System.out.print(getUnigueEmails(emails));

	}
	   public static int getUnigueEmails(String[] emails) {
	         Set<String> uniqueEmails = new HashSet<>();
	         for(String email: emails){
	        	 System.out.println(email);
	            String e = email.split("@")[0];
	            String domain = email.split("@")[1]; //gmail.com
	            
	            e = e.replace(".", "");
	            System.out.println("replaceddd >> "+e);
	            if(email.contains("+")) {
	            	e = e.substring(0, e.indexOf('+'));	            	System.out.println("the plus >> "+e);
	            }
	            System.out.println("finish >> "+e);
	            
	            uniqueEmails.add(e+"@"+domain);
	            
	             
	         }
			return uniqueEmails.size();
	         
	         
	     }

}