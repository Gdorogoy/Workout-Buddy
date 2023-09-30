package com.app.gym.crudApi.Controller;


import com.app.gym.crudApi.Model.Exercise;
import com.app.gym.crudApi.Service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ExerciseController {
    @Autowired
    private ExerciseService exerciseService;

    @GetMapping("/exercise")
    public List<Exercise> get(){
        return exerciseService.get();
    }

    @GetMapping("/exercise/{id}")
    public Exercise getExercise(@PathVariable int id){
        return exerciseService.get(id);
    }

    @PostMapping("/add")
    public Exercise save(@RequestBody Exercise exercise){
        exerciseService.save(exercise);
        return exercise;
    }


    /*
    @PostMapping("/update/{id}")
    public Exercise update(@PathVariable int id,@RequestBody Exercise exercise){
        exerciseService.update(id,exercise);
        return exercise;
    }
     */

    @PutMapping("/add")
    public Exercise update(@RequestBody Exercise exercise){
        exerciseService.save(exercise);
        return exercise;
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        Exercise exercise=getExercise(id);
        exerciseService.delete(id);
        return  "Exercise :"+exercise.toString()+"\n has been deleted";
    }
}
