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

@Entity(name = "Lecturers")
@Table(name = "\"Lecturers\"", schema =  "\"generated_app\"")
@Data
                        
public class Lecturers {
	public Lecturers () {   
  }
	  
  @Id
  @Column(name = "\"StaffID\"", nullable = true )
  private String staffID;
	  
  @Column(name = "\"StaffName\"", nullable = true )
  private String staffName;
  
	  
  @Column(name = "\"PhoneNumber\"", nullable = true )
  private Long phoneNumber;
  
	  
  @Column(name = "\"Address\"", nullable = true )
  private String address;
  
  
  
  
   
	@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"LecturersTeaches\"",
            joinColumns = @JoinColumn( name="\"StaffID\""),
            inverseJoinColumns = @JoinColumn( name="\"SubjectID\""), schema = "\"generated_app\"")
private List<Subjects> teaches = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Lecturers [" 
  + "StaffID= " + staffID  + ", " 
  + "StaffName= " + staffName  + ", " 
  + "PhoneNumber= " + phoneNumber  + ", " 
  + "Address= " + address 
 + "]";
	}
	
}