package com.pk.stalin.api;

import com.pk.stalin.entity.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface BaseApi {
    @RequestMapping(
       value = "api/v1/base",
       produces = "application/json",
       method = RequestMethod.GET
    )
    default ResponseEntity<BaseResponse> baseApi(){

        return baseApiResponse();
    }

    ResponseEntity<BaseResponse> baseApiResponse();
}
