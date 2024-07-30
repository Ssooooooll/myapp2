package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context 
            = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student = context.getBean("student",Student.class);
        student.setName("홍길동");
        System.out.println(student.getName());

        Employee employee = context.getBean("employee",Employee.class);
        Address address = context.getBean("address",Address.class);
        address.setLocation("서울");
        System.out.println(employee.getAddress().getLocation());

        Department dp = context.getBean(Department.class);
        dp.setName("전문교육부");
        System.out.println(dp.getName());
        
        employee.setName("을지문덕");
        Company company = context.getBean(Company.class);
        company.getEmployeeName();

    }
}