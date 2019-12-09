package com.xuanli.billinit;

import com.network.booking.entities.Bill;
import com.network.booking.entities.BillProvider;
import com.network.booking.entities.Provider;
import com.network.booking.mapper.BillMapper;
import com.network.booking.mapper.ProviderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BillInitApplicationTests {

    @Autowired
    ProviderMapper providerMapper;

    @Test
    public void contextLoads() {
        List<Provider> providers = providerMapper.getProviders(null);
        System.out.println(providers.get(0));

        Provider provider = providerMapper.getProviderByPid(1);
        System.out.println(provider);
//
//        provider.setProviderCode("P_111");
//        int size = providerMapper.updateProvider(provider);
//        System.out.println(size);
//
//        providerMapper.addProvider(new Provider(null, "PR-AA", "梦学谷供应商111",
//                "小张", "18888666981", "深圳软件园", "0911-0123456", "品质A"));
//        providerMapper.deleteProviderByPid(8);

    }


    @Autowired
    BillMapper billMapper;

    @Test
    public void billTest(){
        Bill b = new Bill();
        b.setBillName("com");

        List<BillProvider> billProviders = billMapper.getBills(b);
        System.out.println(billProviders.get(0));


        BillProvider billByBid = billMapper.getBillByBid(4);
        System.out.println(billByBid);

        Bill bill = (Bill) billByBid;
        bill.setBillName("com...");
        billMapper.updateBill(bill);

//        billMapper.addBill(new Bill(3001, "Bi-AA11", "粮油aaa", "斤", 80,480.8,1, 1));
//        billMapper.deleteBill(7);
    }

}
