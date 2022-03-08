package com.example.springBootCrud.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springBootCrud.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject,String> {

}
