package com.example.springBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springBootCrud.Repository.SubjectRepository;
import com.example.springBootCrud.bean.Subject;

@Service
public class SubjectService {
	
	@Autowired
    public SubjectRepository subjectRepo;
	public List<Subject> getAllsubjects()
	{
		List<Subject> subjects=new ArrayList<>();
		subjectRepo.findAll().forEach(subjects::add);
		return subjects;
	}
	public void addSubject(Subject subject) {
		subjectRepo.save(subject);
		
	}
	public void updateSubject(String id,Subject subject) 
	{
		subjectRepo.save(subject);
	}
	public void deleteSubject(String id)
	{
		subjectRepo.deleteById(id);
	}
}
