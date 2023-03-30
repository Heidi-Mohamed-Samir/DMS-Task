 
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core'; 
import { FormControl, FormGroup } from '@angular/forms';
// import { Router } from '@angular/router';
import { Employee } from 'src/app/model/employee';
import { ResponseViewModel } from 'src/app/model/response-view-model';
import { EmployeeService } from 'src/app/services/EmployeeService';
import { ShareEmployeeDataService } from 'src/app/services/share-employee-data.service';

@Component({
  selector: 'app-dms',
  templateUrl: './dms.component.html',
  styleUrls: ['./dms.component.css']
})
export class DMSComponent  implements OnInit   {
  employeeSearch = new FormGroup({
    name: new FormControl(''),
    code: new FormControl(''),
    id: new FormControl(''),
    department:new FormControl(''),
    contractType:new FormControl(''),
    status:new FormControl(''),
    birthDate:new FormControl(''),
    birthCity:new FormControl(''),
    jobTitle:new FormControl(''),
    directManager:new FormControl('')
    
  });
   Employees!:Employee[];
    
    employee :any;
    // = new Employee();  
   constructor( private _http:HttpClient ){
     this.employee = new Employee();
     }
    
   employeess:any; 
  
   
 
   ngOnInit()  { 

    this.getemployee().subscribe(
      res =>{
        this.Employees=[];
        for(let i=0;i<res.toString().split(",").length;i++){
          this.Employees.push(res[i]);
        };
        console.log("hello");
        
         console.log(this.Employees);
      } 
    );
  
     
   }
 
  
 

 getemployee(  ){
        return this._http.post('http://localhost:8080/employee/employees',this.employee);
          console.log(this.employee)
      }

      onSearch(){
        this.employee.name = this.employeeSearch.getRawValue().name;
        console.log(this.employee.name);

        this.employee.id = this.employeeSearch.getRawValue().id;
        console.log(this.employee.id);

        this.employee.code = this.employeeSearch.getRawValue().code;
        console.log(this.employee.code);

        this.employee.jobTitle = this.employeeSearch.getRawValue().jobTitle;
        console.log(this.employee.jobTitle);

        this.employee.birthCity = this.employeeSearch.getRawValue().birthCity;
        console.log(this.employee.birthCity);

        
        this.employee.birthDate = this.employeeSearch.getRawValue().birthDate;
        console.log(this.employee.birthDate);
        

        this.employee.department = this.employeeSearch.getRawValue().department;
        console.log(this.employee.department);

        this.employee.directManager = this.employeeSearch.getRawValue().directManager;
        console.log(this.employee.directManager);

        this.employee.contractType = this.employeeSearch.getRawValue().contractType;
        console.log(this.employee.contractType);

        
        this.employee.status = this.employeeSearch.getRawValue().status;
        console.log(this.employee.status);


        this.ngOnInit();
       
      }
     

  }


 
