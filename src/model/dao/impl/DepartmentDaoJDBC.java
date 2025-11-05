package src.model.dao.impl;

import src.model.dao.DepartmentDao;
import src.model.entites.Department;

import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {

    @Override
    public void insert(Department obj) {
        
    }

    @Override
    public void update(Department obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {
        return null;
    }

    @Override
    public List<Department> FindAll() {
        return List.of();
    }
}
