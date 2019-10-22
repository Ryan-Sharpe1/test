package com.nationwide.gym.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nationwide.gym.entity.Exercises;
import com.nationwide.gym.service.ExerciseService;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {

	
	private ExerciseService exerciseService = new ExerciseService();

	@GetMapping
	public ArrayList<Exercises> showAll() {
		return exerciseService.showAll();
	}

	@GetMapping("/{exercise}")
	public ArrayList<Exercises> findByExercise(@PathVariable String exercise) {
		return exerciseService.findByExercise(exercise);
	}

	@PostMapping
	public Exercises saveData(@RequestBody Exercises exercise) {
		exercise.setExerciseid(null);
		return exerciseService.saveData(exercise);
	}
	public String deleteData(@PathVariable Integer id) {
		exerciseService.deleteData(id);
		return "Succesfully Deleted";
	}

}
