package com.burakkutbay.springprofileexample.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("html")
public class PrintServiceHtml implements PrintService{

    @Override
    public String printHello(String name) {
        return "Html Printed : " +name;
    }
}
