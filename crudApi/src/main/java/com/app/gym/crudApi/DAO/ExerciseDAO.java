package com.app.gym.crudApi.DAO;

import com.app.gym.crudApi.Model.Exercise;

import java.util.List;

public interface ExerciseDAO {

    List<Exercise> get();
    Exercise get(int id);
     void save(Exercise exercise);

     //void update(int id,Exercise exercise);
     void delete(int id);
}
