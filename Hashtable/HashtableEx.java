package Hashtable;

import java.util.*;

/**
 * HashMap
 */
public class HashtableEx {

    public static void main(String[] args) {
        // initialize hashtable
        Hashtable<String, String> phoneNumbers = new Hashtable<String, String>();
        Enumeration name;
        String customer;

        phoneNumbers.put("Ryan", "808-765-5843");
        phoneNumbers.put("John", "816-489-6542");
        phoneNumbers.put("Alfred", "459-455-4582");
        phoneNumbers.put("Billy", "654-987-1658");
        phoneNumbers.put("Jeff", "231-645-9785");
        phoneNumbers.put("Carl", "465-457-4893");
        phoneNumbers.put("Phil", "159-756-1572");

        name = phoneNumbers.keys();

        while (name.hasMoreElements()) {
            customer = (String) name.nextElement();
            System.out.println(customer + "'s phone number is " + phoneNumbers.get(customer));
        }

    }
}