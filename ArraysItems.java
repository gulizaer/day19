public class ArraysItems {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        String result = "";
        int indexNum = 0;
        boolean iPad = false;


        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")){
                 indexNum = i;
            }

            if (items[i].equals("iPad")){
                iPad=true;
            }

            result += items[i]+" prices is_ "+prices[i]+", and ID is_ "+itemIDs[i]+"\n";

        }


        System.out.println(indexNum);
        System.out.println(iPad);
        System.out.println(result);
    }

}
/*
Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
 */