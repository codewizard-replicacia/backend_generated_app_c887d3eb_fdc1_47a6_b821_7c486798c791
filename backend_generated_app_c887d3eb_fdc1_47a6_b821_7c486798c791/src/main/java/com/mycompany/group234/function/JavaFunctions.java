package com.mycompany.group234.function;

import com.mycompany.group234.model.College;
import com.mycompany.group234.model.Subjects;
import com.mycompany.group234.model.Departments;
import com.mycompany.group234.model.PreviousEducation;
import com.mycompany.group234.model.Students;
import com.mycompany.group234.model.Courses;
import com.mycompany.group234.model.Lecturers;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.mycompany.group234.repository.DepartmentsRepository;
import com.mycompany.group234.repository.StudentsRepository;
import com.mycompany.group234.repository.LecturersRepository;
import com.mycompany.group234.repository.CollegeRepository;
import com.mycompany.group234.repository.CoursesRepository;
import com.mycompany.group234.repository.PreviousEducationRepository;
import com.mycompany.group234.repository.SubjectsRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
