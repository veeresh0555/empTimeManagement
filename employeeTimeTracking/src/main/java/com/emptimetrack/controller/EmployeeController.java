package com.emptimetrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emptimetrack.model.Employe;
import com.emptimetrack.service.EmployeService;

@RestController
public class EmployeeController {

	
	@Autowired
	private EmployeService empservice;
	
	 @PostMapping("/employe")
	   public ResponseEntity<?> save(@RequestBody Employe emp) {
	      long id = empservice.save(emp);
	      return ResponseEntity.ok().body("New Employee has been saved with ID:" + id);
	   }
	
 @GetMapping("/employelist")
 public ResponseEntity<List<Employe>> list() {
      List<Employe> employe = empservice.list();
      return ResponseEntity.ok().body(employe);
   }
 
 
	
	
	
	
	
	
	
}
