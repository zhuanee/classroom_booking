package com.network.booking.mapper;

import com.network.booking.entities.Provider;

import java.util.List;

//@Mapper
public interface ProviderMapper {

    List<Provider> getProviders(Provider provider);

    Provider getProviderByPid(Integer pid);

    int addProvider(Provider provider);

    int deleteProviderByPid(Integer pid);

    int updateProvider(Provider provider);
}
