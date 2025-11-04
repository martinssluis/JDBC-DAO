package src;

import src.model.dao.DaoFactory;
import src.model.dao.SellerDao;
import src.model.entites.Department;
import src.model.entites.Seller;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1; seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2; seller findByDepartment ===");
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3; seller findAll ===");
        list = sellerDao.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }
    }
}
