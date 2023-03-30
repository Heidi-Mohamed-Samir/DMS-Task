package com.example.DMS.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DMS.dto.EmployeeDTO;
import com.example.DMS.model.Employee; 
import javax.persistence.criteria.Predicate; 

@Repository
public class EmployeeRepository {
    
    @Autowired
    private EntityManager entityManager ;

    public List<Employee> employeefilter(EmployeeDTO employeeDTO) {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
        List<Predicate> predicates = new ArrayList<>();

        Root<Employee> root = criteriaQuery.from(Employee.class);

        if (employeeDTO.getName() != null) {
            Predicate name = criteriaBuilder.like(root.get("name"), "%" + employeeDTO.getName() + "%");
            predicates.add(name);
        }

        if (employeeDTO.getDepartment() != null) {
            Predicate department = criteriaBuilder.like(root.get("department"), "%" + employeeDTO.getDepartment() + "%");
            predicates.add(department);
        }

       
        if (employeeDTO.getCode() != null) {
            Predicate code = criteriaBuilder.equal(root.get("code"), employeeDTO.getCode());
            predicates.add(code);
        }

        if (employeeDTO.getId() != null) {
            Predicate id = criteriaBuilder.equal(root.get("id"),  employeeDTO.getId() );
            predicates.add(id);
        }

        if (employeeDTO.getBirthCity() != null) {
            Predicate birthCity = criteriaBuilder.like(root.get("birthCity"), "%" + employeeDTO.getBirthCity() + "%");
            predicates.add(birthCity);
        }

        if (employeeDTO.getContractType() != null) {
            Predicate contractType = criteriaBuilder.like(root.get("contractType"), "%" + employeeDTO.getContractType() + "%");
            predicates.add(contractType);
        }

        if (employeeDTO.getJobTitle() != null) {
            Predicate jobTitle = criteriaBuilder.like(root.get("jobTitle"), "%" + employeeDTO.getJobTitle() + "%");
            predicates.add(jobTitle);
        }

        if (employeeDTO.getBirthDate() != null) {
//            LocalDate date = LocalDate.parse(employeeDTO.getBirthDate());
            Predicate birthDate = criteriaBuilder.equal(root.get("birthDate"), employeeDTO.getBirthDate() );
            predicates.add(birthDate);
        }

        if (employeeDTO.getStatus() != null) {
            Predicate status = criteriaBuilder.like(root.get("status"), "%" + employeeDTO.getStatus() + "%");
            predicates.add(status);
        }

        if (employeeDTO.getDirectManager() != null) {
            Predicate directManager = criteriaBuilder.like(root.get("directManager"), "%" + employeeDTO.getDirectManager() + "%");
            predicates.add(directManager);
        }

        criteriaQuery.where(criteriaBuilder.and(predicates.toArray(new Predicate[0])));
        TypedQuery<Employee> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }

 

}

 
