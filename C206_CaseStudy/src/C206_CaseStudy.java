import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
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
				for(int j = 0; j < productList.size(); j++) {
					productList.remove(product2);
					System.out.println("Item has been deleted!");
		}
	}
}
