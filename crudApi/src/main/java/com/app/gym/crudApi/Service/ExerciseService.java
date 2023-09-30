package com.app.gym.crudApi.Service;

import com.app.gym.crudApi.Model.Exercise;

import java.util.List;

public interface ExerciseService {
    List<Exercise> get();
    Exercise get(int id);
    void save(Exercise exercise);

   // void update(int id,Exercise exercise);
    void delete(int id);
}
