package com.nationwide.gym.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nationwide.gym.entity.Exercises;
import com.nationwide.gym.repository.ExerciseRepo;

@Service
public class ExerciseService {

	@Autowired
	private ExerciseRepo repo;

	public ArrayList<Exercises> showAll() {
		return repo.findAll();
	}

	public ArrayList<Exercises> findByExercise(String exercise) {
		return repo.findByExercise(exercise);
	}

	public Exercises saveData(Exercises exercise) {
		return repo.save(exercise);
	}
	public void deleteData(Integer id) {
		 repo.deleteById(id);
	}
}
