package com.nationwide.gym.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nationwide.gym.entity.Exercises;

@Repository
public interface ExerciseRepo extends JpaRepository<Exercises, Integer> {

	public ArrayList<Exercises> findAll();

	public ArrayList<Exercises> findByExercise(String exercise);

}
