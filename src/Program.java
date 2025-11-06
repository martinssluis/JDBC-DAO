package src;

import src.model.dao.DaoFactory;
import src.model.dao.DepartmentDao;
import src.model.entites.Department;
import src.model.entites.Seller;

import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        //System.out.println("\n=== TEST 1: department insert ===");
        //Department musicDepartment = new Department(7, "Music");
        //departmentDao.insert(musicDepartment);
        //System.out.println("Inserted! New id = " + musicDepartment.getId());

        System.out.println("\n=== TEST 2: department findById ===");
        Department departmentId = departmentDao.findById(7);
        System.out.println(departmentId);

        System.out.println("\n=== TEST 3: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for(Department dep : list){
            System.out.println(dep);
        }
    }
}
