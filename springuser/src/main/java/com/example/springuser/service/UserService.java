package com.example.springuser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springuser.entity.User;
import com.example.springuser.repository.UserRepo;

import java.util.List;
//Marks the class as a service component in Spring's component scanning.
@Service
public class UserService {
	//curd operation services this class is performing
		@Autowired   
		//dependency injection. Spring automatically wires the UserRepo
		private UserRepo ur;
		//This is the repository interface that extends JpaRepository ur is referecnce
		
		//adding employee details
		//This method is responsible for adding a new user to the database.
		 public User addUser(User user) {
		        return ur.save(user);
		    }
		 
		 //This method is responsible for retrieving all users from the database.
		    public List<User> getUser() {
		        return ur.findAll();
		    }
		    
		    
		    
		    
}
