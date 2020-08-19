
import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {

		// ArrayList for customer's name
		ArrayList<String> customer = new ArrayList<String>();
		
		//ArrayList for TransactionList and archiveList
        ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
        ArrayList<Transaction> archiveList = new ArrayList<Transaction>();
        
        

		// add customer's name
		String name = Helper.readString("Enter a customer name > ");
		customer.add(name);

		// view customer
		for (int i = 0; i < customer.size(); i++) {
			System.out.println(name);
		}

		// delete customer name
		String dname = Helper.readString("Enter a customer name to delete > ");
		for (int s = 0; s < customer.size(); s++) {
			if (dname.equals(name)) {
				customer.remove(s);
			}
		}

	}

	//inputting info for new transaction before adding
	public static Transaction inputTransaction() {
		String staffName = Helper.readString("Enter handling Staff: ");
		String itemTransacted = Helper.readString("Enter description > ");
		String actionTaken = Helper.readString("Enter description > ");

		Transaction tt = new Transaction(staffName, itemTransacted, actionTaken);
		return tt;

	}
	
	//adding new transaction to list
	public static void addTransaction(ArrayList<Transaction> transactionList, Transaction tt) {

		transactionList.add(tt);
		System.out.println("New transaction added");

	}
	
	
	//Viewing all transactions in list
	public static String retrieveAllTransaction(ArrayList<Transaction> transactionList) {
		String output = "";

		for (int i = 0; i < transactionList.size(); i++) {

			output += String.format("%-10s %-30s %-10s\n", transactionList.get(i).toString());
		}
		return output;
	}
	public static void viewAllTransaction(ArrayList<Transaction> transactionList) {

		String output = String.format("%-10s %-30s %-10s\n", "Handling Staff", "Item Transacted",
				"Action Taken");
		 output += retrieveAllTransaction(transactionList);	
		System.out.println(output);
	}
	
	
	//Archiving selected transaction
	public static void archiveTransaction(ArrayList<Transaction> transactionList, ArrayList<Transaction> archiveList) {
		
		int choice = Helper.readInt("Select which transaction to archive: ") - 1;
		Transaction selected = transactionList.get(choice);
		archiveList.add(selected);
		transactionList.remove(choice);
			
		}
		
	}
	

