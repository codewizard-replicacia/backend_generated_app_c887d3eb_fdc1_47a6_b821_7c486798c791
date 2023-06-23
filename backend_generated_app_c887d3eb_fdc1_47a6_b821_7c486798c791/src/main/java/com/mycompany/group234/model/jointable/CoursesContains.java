package com.mycompany.group234.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.mycompany.group234.model.College;
import com.mycompany.group234.model.Subjects;
import com.mycompany.group234.model.Departments;
import com.mycompany.group234.model.PreviousEducation;
import com.mycompany.group234.model.Students;
import com.mycompany.group234.model.Courses;
import com.mycompany.group234.model.Lecturers;

@Entity(name = "CoursesContains")
@Table(schema = "\"generated_app\"", name = "\"CoursesContains\"")
@Data
public class CoursesContains{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"CourseID\"")
	private String courseID;

    
    @Column(name = "\"SubjectID\"")
    private Integer subjectID;
 
}