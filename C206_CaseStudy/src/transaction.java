import java.util.ArrayList;

public class transaction {
	
	private String handlingStaff;
	private String productReturned;
	private String actionTaken;
	
	public transaction(String handlingStaff, String productReturned, String actionTaken) {
		this.handlingStaff = handlingStaff;
		this.productReturned = productReturned;
		this.actionTaken = actionTaken;
		
	}
	/*I really have no idea what i'm doing. Should all of this be in C206_CaseStudy instead
	of here??? */
	
	/*I think our class diagram is wrong as well .-. */
	
	ArrayList<transaction> transactionList = new ArrayList<transaction>();
	ArrayList<transaction> archiveList = new ArrayList<transaction>();
	
	public void addTransaction() {
		
		transaction newTransaction = new transaction(Helper.readString("Enter handling staff name: "), Helper.readString("Enter product returned: "), Helper.readString("Enter action taken by staff: "));
		transactionList.add(newTransaction);
		
	}
	
	public void viewTransaction() {
		
		for(int i = 0; i < transactionList.size(); i++) {
			
			System.out.println(transactionList.get(i));
			
		}
		
	}
	
	public void archiveTransaction() {
		
		int choice = (Helper.readInt("Enter which transaction to archive: ") - 1);
		archiveList.add(transactionList.get(choice));
		transactionList.remove(transactionList.get(choice));
		
	}
	
}

