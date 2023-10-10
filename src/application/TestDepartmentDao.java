package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class TestDepartmentDao {

    public static void main(String[] args) {



        DepartmentDao departmentDao = DaoFactory.createDepartmentDAO();


        System.out.println("INSERT");
        Department department = new Department(null, "OUTROS");
        departmentDao.insert(department);
        System.out.println("Inserido ID=" + department.getId());

        System.out.println("FindByID");
        Department dep1 = departmentDao.findById(1);
        System.out.println(dep1);



//        System.out.println("UPDATE");
//
//        department.setName("Arabe");
//        departmentDao.update(department);
//        System.out.println();







    }




}
