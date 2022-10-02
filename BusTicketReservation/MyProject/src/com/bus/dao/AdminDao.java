package com.bus.dao;

import com.bus.bean.Admin;
import com.bus.exception.AdminException;

public interface AdminDao {
    String registerAdmin1(String var1, String var2, String var3, String var4);

    String registerAdmin2(Admin var1);

    Admin loginAdmin(String var1, String var2) throws AdminException;

    void getAllAdmin() throws AdminException;

    int getAdminID(String var1, String var2);
}

