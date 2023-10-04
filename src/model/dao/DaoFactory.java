package model.dao;

import db.DB;
import model.dao.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDAO() {
        return new SellerDaoJDBC(DB.getConnection());
    }

}
