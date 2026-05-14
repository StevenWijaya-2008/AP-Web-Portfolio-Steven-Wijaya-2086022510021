package com.example.demo.Repository;
import com.example.demo.Model.Project;

import org.springframework.data.repository.CrudRepository;


public interface ProjectsRepository extends CrudRepository<Project, Integer> {

}