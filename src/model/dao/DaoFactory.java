package src.model.dao;

import db.DB;
import src.model.dao.impl.DepartmentDaoJDBC;
import src.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
    public static DepartmentDao createDepartmentDao(){return new DepartmentDaoJDBC(DB.getConnection());
    }
}
