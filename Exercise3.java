package Excerise;

public class Exercise3 {
    public static void main(String[] args) {
        //Given the String “12345 Big St., Alphabet City, CA 90210” or any other address with the
        //same format, can you write code that can parse and print out:
        //1. The building number: 12345
        //2. The Street: “Big St.”
        //3. City: “Alphabet City”
        //4. State: “CA”
        //5. Postal Code: 90210
        String address = "12345 Big St., Alphabet City, CA 90210";
        String buildingNumber = address.split(" ")[0];
        String street = parseStreet(address);
        String city = parseCity(address);
        String state = findState(address);
        String postalCode = findPostCode(address);
        System.out.println("The building Number: " + buildingNumber);
        System.out.println("The Street: " + street);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Postal Code: " + postalCode);
    }

    public static String parseStreet(String address){
        int getB = address.indexOf(" ");
        int beforePeriod = address.indexOf(",");
        String street = address.substring(getB + 1, beforePeriod);
        return street;
    }

    public static String parseCity(String address){
        return address.split(",")[1].strip();
    }
    public static String findState(String address) {
        // First split address on commas, which returns an array with 3 elements
        // Then get the 3rd element (arrays are zero-based, so 3rd element is [2]) which contains: " CA 90210"
        // Strip leading & trailing spaces
        // Then split 3rd element on spaces, which return array with 2 elements
        // Then get 1st element which contains: "CA" & return it
        return address.split(",")[2].strip().split(" ")[0];
    }
    public static String findPostCode(String address) {
        // same as findState() except gets second element at the end
        return address.split(",")[2].strip().split(" ")[1];
    }
}
