
import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		
		//ArrayList for customer's name
		ArrayList<String> customer = new ArrayList<String>();
		
		//add customer's name
        String name = Helper.readString("Enter a customer name > ");
        customer.add(name);
        
        //view customer 
        for (int i = 0; i < customer.size(); i++) {
        	System.out.println(name);
        }
        
        //delete customer name
        String dname = Helper.readString("Enter a customer name to delete > ");
        for (int s = 0; s < customer.size(); s++) {
        	if (dname.equals(name)) {
        		customer.remove(s);
        	}
        }
        
	}

}
