package com.example.DMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;

import com.example.DMS.dto.EmployeeDTO;
import com.example.DMS.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = {"http://localhost:4200"}, methods = { RequestMethod.POST })
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
 
    @PostMapping("employees")
    public ResponseEntity findAllEmployee(@RequestBody EmployeeDTO employeeDTO) {
        try {
            List<EmployeeDTO> employees = employeeService.employeeFilterService(employeeDTO);
            return ResponseEntity.ok().body(employees);
        } catch (HttpMessageNotReadableException e) {
            return ResponseEntity.badRequest().body("Something went Wrong!! ");
        }
    }}