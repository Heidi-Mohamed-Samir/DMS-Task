package com.example.DMS.mapper;

 
import java.util.List;
 
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;
import com.example.DMS.dto.EmployeeDTO;
import com.example.DMS.model.Employee;


@Component
@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface EmployeeMapper {
    Employee map(EmployeeDTO employeedto);

    EmployeeDTO map(Employee employee);

    List< EmployeeDTO> map(List<Employee> employee);

}
