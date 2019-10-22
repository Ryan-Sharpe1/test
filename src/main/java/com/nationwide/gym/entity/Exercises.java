package com.nationwide.gym.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


public class Exercises {

	@Id
	@GeneratedValue
	private Integer exerciseid;
	private String exercise;
	private Integer muscleid;
	
	@OneToOne
	@JoinColumn(name="muscleid", referencedColumnName="muscleid")
	private MuscleGroups musclegroups;

	public Integer getExerciseid() {
		return exerciseid;
	}

	public void setExerciseid(Integer exerciseid) {
		this.exerciseid = exerciseid;
	}

	public String getExercise() {
		return exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
	}

	public Integer getMuscleid() {
		return muscleid;
	}

	public void setMuscleid(Integer muscleid) {
		this.muscleid = muscleid;
	}

	public MuscleGroups getMusclegroups() {
		return musclegroups;
	}

	public void setMusclegroups(MuscleGroups musclegroups) {
		this.musclegroups = musclegroups;
	}
	
	
}

