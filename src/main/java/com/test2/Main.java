package com.test2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Student employee = context.getBean(Student.class);
        employee.setName("강감찬");
    
        Address address = context.getBean(Address.class);
        address.setLocation("Seoul");
        System.out.println(employee.getAddress().getLocation());
    
    }
   

}
