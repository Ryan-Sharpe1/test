//package com.nationwide.gym.service;
//
//import java.util.ArrayList;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.nationwide.gym.entity.MuscleGroups;
//import com.nationwide.gym.repository.MuscleRepo;
//
//@Service
//public class MuscleService {
//
//		@Autowired
//		private MuscleRepo repo;
//
//		public ArrayList<MuscleGroups> showAll() {
//			return repo.findAll();
//		}
//
//		public ArrayList<MuscleGroups> findByMuscle(String muscleGroup) {
//			return repo.findByMuscleGroups(muscleGroup);
//		}
//
//		public MuscleGroups saveData(MuscleGroups muscleGroup) {
//			return repo.save(muscleGroup);
//		}
//	}
//
