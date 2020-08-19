import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {

		// ArrayList for TransactionList and archiveList -soon chuan
		ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
		ArrayList<Transaction> archiveList = new ArrayList<Transaction>();

		// adding product to arrayList
		ArrayList<String> productList = new ArrayList<String>();
		String productName = Helper.readString("Enter a product to add > ");
		String category = Helper.readString("Enter category of product (meat or veg?) > ");
		double price = Helper.readDouble("Enter price of product > ");
		String product1 = Helper.readString(productName);
		productList.add(product1);

		// view product and category
		for (int i = 0; i < productList.size(); i++) {
			String p = productList.get(i);
			System.out.println(String.format("%-20s %s  %-20s\n", productName, category, price));

		}

		// delete product
		String product2 = Helper.readString("Enter a product to delete > ");
		for (int j = 0; j < productList.size(); j++) {
			productList.remove(product2);
			System.out.println("Item has been deleted!");
		}
	}

	// inputting info for new transaction before adding -soon chuan
	public static Transaction inputTransaction() {
		String staffName = Helper.readString("Enter handling Staff: ");
		String itemTransacted = Helper.readString("Enter description > ");
		String actionTaken = Helper.readString("Enter description > ");

		Transaction tt = new Transaction(staffName, itemTransacted, actionTaken);
		return tt;

	}

	// adding new transaction to list -soon chuan
	public static void addTransaction(ArrayList<Transaction> transactionList, Transaction tt) {

		transactionList.add(tt);
		System.out.println("New transaction added");

	}

	// Viewing all transactions in list -soon chuan
	public static String retrieveAllTransaction(ArrayList<Transaction> transactionList) {
		String output = "";

		for (int i = 0; i < transactionList.size(); i++) {

			output += String.format("%-10s %-30s %-10s\n", transactionList.get(i).toString());
		}
		return output;
	}

	public static void viewAllTransaction(ArrayList<Transaction> transactionList) {

		String output = String.format("%-10s %-30s %-10s\n", "Handling Staff", "Item Transacted", "Action Taken");
		output += retrieveAllTransaction(transactionList);
		System.out.println(output);
	}

	// Archiving selected transaction -soon chuan
	public static void archiveTransaction(ArrayList<Transaction> transactionList, ArrayList<Transaction> archiveList) {

		int choice = Helper.readInt("Select which transaction to archive: ") - 1;
		Transaction selected = transactionList.get(choice);
		archiveList.add(selected);
		transactionList.remove(choice);

	}

}
