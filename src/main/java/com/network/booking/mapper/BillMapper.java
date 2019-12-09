package com.network.booking.mapper;

import com.network.booking.entities.Bill;
import com.network.booking.entities.BillProvider;

import java.util.List;

//@Mapper
public interface BillMapper {

    List<BillProvider> getBills(Bill bill);

    BillProvider getBillByBid(Integer bid);

    int addBill(Bill bill);

    int deleteBill(Integer bid);

    int updateBill(Bill bill);
}
