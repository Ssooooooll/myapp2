package com.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    //@Autowired
    private Address address;
    //@Autowired
    public Student(Address address){
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    
    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }


}
