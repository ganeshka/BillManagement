package com.lf.bill.management.service.biller;


import com.lf.bill.management.entity.biller.Biller;
import com.lf.bill.management.model.db.utils.DatabaseUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BillerRepository {
    public BillerRepository() {
        super();
    }

    public void addBiller(Biller biller) {
        DatabaseUtils utils = new DatabaseUtils();
        String billerId = biller.getId();
        String billerName = biller.getName();
        String billerDesc = biller.getDesc();
        String query = "insert into biller values ('" + billerId + "','" + billerName + "','" + billerDesc + "')";
        utils.executeUpdate(query);
    }

    public void updateBiller(Biller biller) {
        DatabaseUtils utils = new DatabaseUtils();
        String billerId = biller.getId();
        String billerName = biller.getName();
        String billerDesc = biller.getDesc();
        String query =
            "update biller set billerName = '" + billerName + "', billerDesc = '" + billerDesc + "' where billerid = '" +
            billerId + "'";
        utils.executeUpdate(query);
    }

    public Biller fetchBiller(String billerId) {
        DatabaseUtils utils = new DatabaseUtils();
        Connection connection = null;
        Biller biller = new Biller();
        try {
            connection = utils.createConnection();
            String query = "select billerid, billername, billerdesc from biller where billerid = '" + billerId + "'";
            ResultSet resultSet = utils.executeQuery(connection, query);
            if (resultSet != null) {
                try {
                    while (resultSet.next()) {
                        billerId = resultSet.getString("billerid");
                        String billerName = resultSet.getString("billername");
                        String billerDesc = resultSet.getString("billerdesc");
                        biller.setId(billerId);
                        biller.setName(billerName);
                        biller.setDesc(billerDesc);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            utils.closeConnection(connection);
        }
        return biller;
    }

    public void deleteBiller(String billerId) {
        DatabaseUtils utils = new DatabaseUtils();
        String query = "delete from biller where billerid = '" + billerId + "'";
        utils.executeUpdate(query);
    }

    public static void main(String[] args) {
        BillerRepository rep = new BillerRepository();
        Biller biller = new Biller();
        biller.setId("Biller01");
        biller.setName("BillerName01");
        biller.setDesc("BillerDesc01");
        rep.addBiller(biller);

        biller.setDesc("BillerDesc01Updated");
        rep.updateBiller(biller);

        Biller newBiller = rep.fetchBiller("Biller01");

        System.out.println(newBiller.getId());

        rep.deleteBiller("Biller01");

    }
}
