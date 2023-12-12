package com.projet5sae.gestiontransactioncontrat.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionRestAPI {
    private  String title="Hello, i'm the condidat micro service";
    @RequestMapping("/hello")
    public String sayHello()
    {
        System.out.println(title);
        return title;
    }
}
