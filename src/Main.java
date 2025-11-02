package src;

import src.model.entites.Department;
import src.model.entites.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);

        System.out.println(obj);
        System.out.println(seller);

    }
}
