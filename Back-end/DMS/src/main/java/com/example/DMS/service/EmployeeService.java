package com.example.DMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DMS.dto.EmployeeDTO;
import com.example.DMS.mapper.EmployeeMapper;
import com.example.DMS.model.Employee;
import com.example.DMS.repository.EmployeeRepository;

@Service
public class EmployeeService {
@Autowired
private EmployeeRepository employeeRepository;
@Autowired
private EmployeeMapper employeeMapper;


public List<EmployeeDTO> employeeFilterService(EmployeeDTO employeeDTO) {
    List<Employee> employee = employeeRepository.employeefilter(employeeDTO);
    return employeeMapper.map(employee);
}

}
