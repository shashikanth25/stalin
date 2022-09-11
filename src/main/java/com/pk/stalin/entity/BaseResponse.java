package com.pk.stalin.entity;

import lombok.Data;

import java.util.List;


@Data
public class BaseResponse {

    String name;
    String player;
    String color;
    String application;
    List<String> inspiration;
    AddressWrapper addressWrapper;


}
