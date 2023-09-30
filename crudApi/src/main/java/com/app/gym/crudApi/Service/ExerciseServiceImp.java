package com.app.gym.crudApi.Service;

import com.app.gym.crudApi.DAO.ExerciseDAO;
import com.app.gym.crudApi.Model.Exercise;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;

@Service
public class ExerciseServiceImp implements ExerciseService {

    @Autowired
    private ExerciseDAO exerciseDAO;
    @Transactional
    @Override
    public List<Exercise> get() {
        return exerciseDAO.get();
    }
    @Transactional
    @Override
    public Exercise get(int id) {
        return exerciseDAO.get(id);
    }
    @Transactional
    @Override
    public void save(Exercise exercise) {
        exerciseDAO.save(exercise);
    }
   /*
    @Transactional
    @Override
    public void update(int id,Exercise exercise) {
        exerciseDAO.update(id,exercise);

    }
    */
    @Transactional
    @Override
    public void delete(int id) {
        exerciseDAO.delete(id);
    }
}
