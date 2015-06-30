package com.aartek.validator;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.aartek.model.*;
import java.text.ParseException;

@Component
public class RegistrationValidator implements Validator{
	 public boolean supports(Class<?> clazz) {
		    return Register.class.isAssignableFrom(clazz);
		  }
	 public void validate(Object target, Errors errors) {
		    Register registration = (Register) target;
		    ValidationUtils.rejectIfEmpty(errors, "firstName", "error.name.empty");
		    ValidationUtils.rejectIfEmpty(errors, "contact", "error.contact.empty");
		    ValidationUtils.rejectIfEmpty(errors, "emailId", "error.email.empty");
		    ValidationUtils.rejectIfEmpty(errors, "lastName", "error.lastName.empty");
		    ValidationUtils.rejectIfEmpty(errors, "qualification", "error.qualification.empty");
		    ValidationUtils.rejectIfEmpty(errors, "dateOfBirth", "error.dateOfBirth.empty");
		    ValidationUtils.rejectIfEmpty(errors, "city", "error.city.empty");
		    ValidationUtils.rejectIfEmpty(errors, "state", "error.state.empty");
		    ValidationUtils.rejectIfEmpty(errors, "password", "error.password.empty");
		    if (registration.getEmailId() != null && registration.getEmailId().trim().length() > 0) {
		      boolean b = ValidationUtil.validateEmail(registration.getEmailId());
		      if (registration.getEmailId().contains("@") != true && !b) {
		        errors.rejectValue("emailId", "error.email.first.rule");
		      } else if (registration.getEmailId().contains(".com") != true
		          && registration.getEmailId().contains(".net") != true && !b) {
		        errors.rejectValue("emailId", "error.email.second.rule");
		      } else if (!b) {
		        errors.rejectValue("emailId", "error.email.required");
		      }
		    }
		   
		    if (registration.getDateOfBirth() != null && registration.getDateOfBirth() != "") {
		      Date date = new Date();
		      SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		      String dateOfBirth = registration.getDateOfBirth();
		      String currentDate = sdf.format(date).toString();
		      try {
		        Calendar cal1 = new GregorianCalendar();
		        Calendar cal2 = new GregorianCalendar();
		        int age = 0;
		        int factor = 0;
		        Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(dateOfBirth);
		        Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(currentDate);
		        cal1.setTime(date1);
		        cal2.setTime(date2);
		        if (cal2.get(Calendar.DAY_OF_YEAR) < cal1.get(Calendar.DAY_OF_YEAR)) {
		          factor = -1;
		        }
		        age = cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR) + factor;
		        if (age <= 13) {
		          errors.rejectValue("dateOfBirth", "error.age.empty");
		        }
		      } catch (ParseException e) {
		        System.out.println(e);
		      }
		    }
		  }

}
