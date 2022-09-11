package com.pk.stalin.api;

import com.pk.stalin.entity.BaseResponse;
import com.pk.stalin.service.BaseService;
import com.pk.stalin.service.BaseServiceImpl;
import com.sun.xml.internal.rngom.parse.host.Base;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController implements BaseApi {

    private BaseServiceImpl baseService;

    public BaseController(BaseServiceImpl baseService){
        this.baseService = baseService;
    }


    @Override
    public ResponseEntity<BaseResponse> baseApiResponse(){

        BaseResponse response = baseService.findBaseResponse();
        return ResponseEntity.status(200).body(response);
    }




}
