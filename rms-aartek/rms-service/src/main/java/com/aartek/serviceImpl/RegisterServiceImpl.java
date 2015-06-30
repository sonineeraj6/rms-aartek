package com.aartek.serviceImpl;

import com.aartek.model.Register;
import com.aartek.repository.RegistrationRepository;
import com.aartek.service.RegisterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService{
	 @Autowired
	  private RegistrationRepository registrationRepository;
	public boolean addStudentInfo(Register registration){
		 boolean status = false;
		if (registration != null){
			Register registration2 = registrationRepository.addStudentInfo(registration);
			if (registration2 != null) {
				 return true;
			} else {
		        return false;
			
			}
		
	}
		 return status;
}
}
