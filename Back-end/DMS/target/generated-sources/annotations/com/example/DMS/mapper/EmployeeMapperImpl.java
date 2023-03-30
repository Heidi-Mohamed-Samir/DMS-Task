package com.example.DMS.mapper;

import com.example.DMS.dto.EmployeeDTO;
import com.example.DMS.model.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-30T15:21:09+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee map(EmployeeDTO employeedto) {
        if ( employeedto == null ) {
            return null;
        }

        Employee employee = new Employee();

        if ( employeedto.getId() != null ) {
            employee.setId( employeedto.getId() );
        }
        if ( employeedto.getName() != null ) {
            employee.setName( employeedto.getName() );
        }
        if ( employeedto.getBirthDate() != null ) {
            employee.setBirthDate( employeedto.getBirthDate() );
        }
        if ( employeedto.getBirthCity() != null ) {
            employee.setBirthCity( employeedto.getBirthCity() );
        }
        if ( employeedto.getCode() != null ) {
            employee.setCode( employeedto.getCode() );
        }
        if ( employeedto.getDepartment() != null ) {
            employee.setDepartment( employeedto.getDepartment() );
        }
        if ( employeedto.getJobTitle() != null ) {
            employee.setJobTitle( employeedto.getJobTitle() );
        }
        if ( employeedto.getDirectManager() != null ) {
            employee.setDirectManager( employeedto.getDirectManager() );
        }
        if ( employeedto.getContractType() != null ) {
            employee.setContractType( employeedto.getContractType() );
        }
        if ( employeedto.getStatus() != null ) {
            employee.setStatus( employeedto.getStatus() );
        }

        return employee;
    }

    @Override
    public EmployeeDTO map(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();

        if ( employee.getBirthCity() != null ) {
            employeeDTO.setBirthCity( employee.getBirthCity() );
        }
        if ( employee.getBirthDate() != null ) {
            employeeDTO.setBirthDate( employee.getBirthDate() );
        }
        if ( employee.getCode() != null ) {
            employeeDTO.setCode( employee.getCode() );
        }
        if ( employee.getContractType() != null ) {
            employeeDTO.setContractType( employee.getContractType() );
        }
        if ( employee.getDepartment() != null ) {
            employeeDTO.setDepartment( employee.getDepartment() );
        }
        if ( employee.getDirectManager() != null ) {
            employeeDTO.setDirectManager( employee.getDirectManager() );
        }
        if ( employee.getId() != null ) {
            employeeDTO.setId( employee.getId() );
        }
        if ( employee.getJobTitle() != null ) {
            employeeDTO.setJobTitle( employee.getJobTitle() );
        }
        if ( employee.getName() != null ) {
            employeeDTO.setName( employee.getName() );
        }
        if ( employee.getStatus() != null ) {
            employeeDTO.setStatus( employee.getStatus() );
        }

        return employeeDTO;
    }

    @Override
    public List<EmployeeDTO> map(List<Employee> employee) {
        if ( employee == null ) {
            return null;
        }

        List<EmployeeDTO> list = new ArrayList<EmployeeDTO>( employee.size() );
        for ( Employee employee1 : employee ) {
            list.add( map( employee1 ) );
        }

        return list;
    }
}
