package com.marvellousinfosystems.First;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Laptop
{
    @GetMapping("/laptopDetails")
    public String DisplayLaptopDetails()
    {
        return"its core i7 2nd gen Laptop";
    }
}
