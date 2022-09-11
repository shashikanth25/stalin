package com.pk.stalin.service;

import com.pk.stalin.entity.Address;
import com.pk.stalin.entity.AddressWrapper;
import com.pk.stalin.entity.BaseResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BaseServiceImpl implements BaseService{

    @Value("${app.name}")
    private String appName;

    public BaseResponse findBaseResponse(){

        BaseResponse response = new BaseResponse();
        response.setName("Shashi");
        response.setPlayer("Nadal");
        response.setColor("Blue");
        response.setApplication(appName);

        List<String> favs= Arrays.asList("Nadal","Sachin", "PawanKalyan", "Ronaldo");
        response.setAddressWrapper(generateAddress());
        response.setInspiration(favs);
        return response;
    }

    public AddressWrapper generateAddress(){
        AddressWrapper addressWrapper = new AddressWrapper();
        Address address = new Address();
        address.setCity("Vizag");
        address.setState("Andhra Pradesh");
        address.setCountry("India");

        addressWrapper.setAddress(address);

        return addressWrapper;
    }
}
