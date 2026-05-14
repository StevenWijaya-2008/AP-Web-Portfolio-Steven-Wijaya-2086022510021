package com.example.demo.Repository;
import com.example.demo.Model.Skill;

import org.springframework.data.repository.CrudRepository;


public interface SkillsRepository extends CrudRepository<Skill, Integer> {

}