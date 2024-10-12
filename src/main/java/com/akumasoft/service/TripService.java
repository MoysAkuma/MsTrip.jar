package com.akumasoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akumasoft.entity.Trip;
import com.akumasoft.repository.TripRepository;
import com.akumasoft.request.CreateTripRequest;

@Service
public class TripService {
	@Autowired
	TripRepository TripRp;
	
	public List<Trip> getNewPublicTrips () {
		return TripRp.findAll();
	}
	
	public List<Trip> findByName (String name) {
		return TripRp.findByName(name);
	}
	
	public List<Trip> findBy (String name) {
		return TripRp.findBy(name);
	}
	
	public Trip createTrip (CreateTripRequest createTripRequest) {
		Trip t = new Trip(createTripRequest);
		
		t = TripRp.save(t);
		return t;
		
		
	}
	/*
	public Student createTrip (CreateStudentRequest createStudentRequest) {
		Student student = new Student(createStudentRequest);
		
		student = studentRepository.save(student);
		return student;
	}
	
	public Student updateStudent (UpdateStudentRequest updateStudentRequest) {
		Student student = studentRepository.findById(updateStudentRequest.getId()).get();
		
		if (updateStudentRequest.getFirstName() != null && 
				!updateStudentRequest.getFirstName().isEmpty()) {
			student.setFirstName(updateStudentRequest.getFirstName());
		}
		
		student = studentRepository.save(student);
		return student;
	}
	
	public String deleteStudent (long id) {
		studentRepository.deleteById(id);
		return "Student has been deleted successfully";
	}
	
	public List<Student> getByFirstName (String firstName) {
		return studentRepository.findByFirstName(firstName);
	}*/
}
