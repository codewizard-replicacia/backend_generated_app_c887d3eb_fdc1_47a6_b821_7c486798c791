package com.mycompany.group234.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.mycompany.group234.model.College;
import com.mycompany.group234.model.Subjects;
import com.mycompany.group234.model.Departments;
import com.mycompany.group234.model.PreviousEducation;
import com.mycompany.group234.model.Students;
import com.mycompany.group234.model.Courses;
import com.mycompany.group234.model.Lecturers;
import com.mycompany.group234.converter.DurationConverter;
import com.mycompany.group234.converter.UUIDToByteConverter;
import com.mycompany.group234.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Students")
@Table(name = "\"Students\"", schema =  "\"generated_app\"")
@Data
                        
public class Students {
	public Students () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"StudentID\"", nullable = true )
  private Integer studentID;
	  
  @Column(name = "\"StudentName\"", nullable = true )
  private String studentName;
  
	  
  @Column(name = "\"StudentAddress\"", nullable = true )
  private String studentAddress;
  
	  
  @Column(name = "\"ParentNames\"", nullable = true )
  private String parentNames;
  
	  
  @Column(name = "\"PhoneNumber\"", nullable = true )
  private Long phoneNumber;
  
	  
  @Column(name = "\"State\"", nullable = true )
  private String state;
  
  
  
  
		@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"StudentsEnrolledWith\"", referencedColumnName = "\"CourseID\"", insertable = false, updatable = false)
	private Courses enrolledWith;
	
	@Column(name = "\"StudentsEnrolledWith\"")
	private String studentsEnrolledWith;
   
	@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"StudentsEducationDetails\"",
            joinColumns = @JoinColumn( name="\"StudentID\""),
            inverseJoinColumns = @JoinColumn( name="\"EducationID\""), schema = "\"generated_app\"")
private List<PreviousEducation> educationDetails = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Students [" 
  + "StudentID= " + studentID  + ", " 
  + "StudentName= " + studentName  + ", " 
  + "StudentAddress= " + studentAddress  + ", " 
  + "ParentNames= " + parentNames  + ", " 
  + "PhoneNumber= " + phoneNumber  + ", " 
  + "State= " + state 
 + "]";
	}
	
}