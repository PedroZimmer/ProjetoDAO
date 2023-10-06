package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class TestDepartmentDao {

    public static void main(String[] args) {



        DepartmentDao departmentDao = DaoFactory.createDepartmentDAO();


        System.out.println("INSERT");
        Department department = new Department(null, "Outros");
        departmentDao.insert(department);
        System.out.println("Inserido ID=" + department.getId());






    }




}
