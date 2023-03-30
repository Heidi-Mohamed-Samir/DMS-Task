package com.example.DMS.dto;

import java.util.Date;

import lombok.Data;
@Data
public class EmployeeDTO {
    
    private Integer id;
    private String name;
    private Date birthDate;
    private String birthCity;
    private Integer code;
    private String department;
    private String jobTitle;
    private String directManager;
    private String contractType;
    private String status;
    public EmployeeDTO(Integer id, String name, Date birthDate, String birthCity, Integer code, String department,
            String jobTitle, String directManager, String contractType, String status) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.birthCity = birthCity;
        this.code = code;
        this.department = department;
        this.jobTitle = jobTitle;
        this.directManager = directManager;
        this.contractType = contractType;
        this.status = status;
    }
    public EmployeeDTO() {
    } 
}
