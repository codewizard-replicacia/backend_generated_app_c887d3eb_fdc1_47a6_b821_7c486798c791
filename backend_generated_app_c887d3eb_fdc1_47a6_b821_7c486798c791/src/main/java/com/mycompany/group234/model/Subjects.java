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

@Entity(name = "Subjects")
@Table(name = "\"Subjects\"", schema =  "\"generated_app\"")
@Data
                        
public class Subjects {
	public Subjects () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"SubjectID\"", nullable = true )
  private Integer subjectID;
	  
  @Column(name = "\"Subject1Name\"", nullable = true )
  private String subject1Name;
  
	  
  @Column(name = "\"Subject2Name\"", nullable = true )
  private String subject2Name;
  
	  
  @Column(name = "\"Subject3Name\"", nullable = true )
  private String subject3Name;
  
	  
  @Column(name = "\"Subject4Name\"", nullable = true )
  private String subject4Name;
  
	  
  @Column(name = "\"Subject5Name\"", nullable = true )
  private String subject5Name;
  
	  
  @Column(name = "\"Subject6Name\"", nullable = true )
  private String subject6Name;
  
	  
  @Column(name = "\"Lab1\"", nullable = true )
  private String lab1;
  
	  
  @Column(name = "\"Lab2\"", nullable = true )
  private String lab2;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Subjects [" 
  + "SubjectID= " + subjectID  + ", " 
  + "Subject1Name= " + subject1Name  + ", " 
  + "Subject2Name= " + subject2Name  + ", " 
  + "Subject3Name= " + subject3Name  + ", " 
  + "Subject4Name= " + subject4Name  + ", " 
  + "Subject5Name= " + subject5Name  + ", " 
  + "Subject6Name= " + subject6Name  + ", " 
  + "Lab1= " + lab1  + ", " 
  + "Lab2= " + lab2 
 + "]";
	}
	
}