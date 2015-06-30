package com.aartek.repositoryImpl;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.*;
import com.aartek.repository.*;

@SuppressWarnings("unchecked")
@Repository
public class RegisterRepImpl implements RegistrationRepository {
	 @Autowired
	  private HibernateTemplate hibernateTemplate;
	 public Register addStudentInfo(Register registration) {
		    if (registration != null) {
		      hibernateTemplate.save(registration);
		      return registration;
		    } else {
		      return null;
		    }
		  }

}
