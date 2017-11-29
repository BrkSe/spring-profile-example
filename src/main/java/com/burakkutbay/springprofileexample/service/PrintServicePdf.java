package com.burakkutbay.springprofileexample.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("pdf")
public class PrintServicePdf implements PrintService{

    @Override
    public String printHello(String name) {
        return "Pdf Printed" + name ;
    }
}
