package com.marvellous.dependancy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laptop {

    //field injection
    @Autowired
    Hardisk hobj;

    @Autowired
    RAM robj;

    @GetMapping("Laptop")
    public String LaptopInformation() {
        String h = hobj.GetHardisk();
        String r = robj.GetRAM();

        String data = "Laptop Configuaration:"+h+"&"+r;
        //return "it is a laptop having __ configuaration";

        return data;
    }
}
