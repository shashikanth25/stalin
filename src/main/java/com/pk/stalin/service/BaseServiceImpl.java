package com.pk.stalin.service;

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
        response.setInspiration(favs);
        return response;
    }
}
