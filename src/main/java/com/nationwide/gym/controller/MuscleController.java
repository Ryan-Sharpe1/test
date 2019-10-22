//package com.nationwide.gym.controller;
//import java.util.ArrayList;
//
//	import org.springframework.beans.factory.annotation.Autowired;
//	import org.springframework.web.bind.annotation.GetMapping;
//	import org.springframework.web.bind.annotation.PathVariable;
//	import org.springframework.web.bind.annotation.PostMapping;
//	import org.springframework.web.bind.annotation.RequestBody;
//	import org.springframework.web.bind.annotation.RequestMapping;
//	import org.springframework.web.bind.annotation.RestController;
//	import com.nationwide.gym.entity.MuscleGroups;
//	import com.nationwide.gym.service.MuscleService;
//
//	@RestController
//	@RequestMapping("/muscle")
//	public class MuscleController {
//
//		@Autowired
//		private MuscleService muscleService;
//
//		@GetMapping
//		public ArrayList<MuscleGroups> showAll() {
//			return muscleService.showAll();
//		}
//
//		@GetMapping("/{muscle}")
//		public ArrayList<MuscleGroups> findByMuscle(@PathVariable String muscleGroup) {
//			return muscleService.findByMuscle(muscleGroup);
//		}
//
//		@PostMapping
//		public MuscleGroups saveData(@RequestBody MuscleGroups muscleGroup) {
//			muscleGroup.setMuscleid(null);
//			return muscleService.saveData(muscleGroup);
//		}
//}
