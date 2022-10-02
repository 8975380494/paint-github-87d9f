package com.bus.dao;

import com.bus.bean.Customer;
import com.bus.exception.CustomerException;
import java.util.List;

public interface CustomerDao {
    Customer getCustomer(String var1, String var2, String var3, int var4);

    void addCustomer(Customer var1);

    List<Customer> getAllBookings(String var1) throws CustomerException;

    int getRefID(String var1, String var2, String var3);
}

