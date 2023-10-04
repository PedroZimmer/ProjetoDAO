package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {



        SellerDao sellerDAO = DaoFactory.createSellerDAO();

        Seller seller = sellerDAO.findById(3);

        System.out.println(seller);


    }

}
