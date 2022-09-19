package com.pk.stalin.service;

import com.pk.stalin.entity.BaseResponse;
import com.pk.stalin.entity.Education;

public interface BaseService {

    BaseResponse findBaseResponse();

    Education findEducation();
}
