package com.pk.stalin.api;

import com.pk.stalin.entity.BaseResponse;
import com.pk.stalin.entity.Education;
import com.pk.stalin.entity.EducationResponse;
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

    @RequestMapping(
            value = "api/v1/education",
            produces = "application/json",
            method = RequestMethod.GET
    )
    default ResponseEntity<EducationResponse> findEducationApi(){
        return findEducationResponse();
    }

    ResponseEntity<EducationResponse> findEducationResponse();
}
