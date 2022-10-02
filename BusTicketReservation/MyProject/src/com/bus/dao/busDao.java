package com.bus.dao;

import com.bus.bean.Bus;
import com.bus.exception.BusException;
import java.util.List;

public interface busDao {
    String registerNewBus(int var1, String var2, String var3, String var4, String var5, int var6, String var7, String var8, int var9, String var10, String var11);

    List<Bus> getEmptyBuses() throws BusException;

    String removeBusById(int var1);

    String registerNewBus2(Bus var1);

    List<Bus> getAllBusDetails() throws BusException;

    Bus bookTicket(String var1, String var2, int var3, String var4) throws BusException;

    int noOfTicketsAval(String var1, String var2);

    Bus getBus(String var1, String var2);

    String cancelTicket(int var1);

    String updateBusSeats(int var1, int var2);

    int getBusId(int var1);

    int getReleasedSeats(int var1);

    int checkTime(String var1, String var2);

    String getDeptTime(String var1, String var2) throws BusException;
}

