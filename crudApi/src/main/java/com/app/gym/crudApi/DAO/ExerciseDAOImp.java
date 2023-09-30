package com.app.gym.crudApi.DAO;

import com.app.gym.crudApi.Model.Exercise;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ExerciseDAOImp implements ExerciseDAO{


    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Exercise> get() {
        Session currentSession= entityManager.unwrap(Session.class);
        Query<Exercise> query= currentSession.createQuery("from Exercise",Exercise.class);
        List<Exercise> list=query.getResultList();
        return list;
    }

    @Override
    public Exercise get(int id) {
        Session currentSession=entityManager.unwrap(Session.class);
        Exercise exercise = currentSession.get(Exercise.class,id);
        return exercise;
    }

    @Override
    public void save(Exercise exercise) {
        Session currentSession=entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(exercise);
    }
/*
    @Override
    public void update(int id, Exercise updatedExercise) {
        Session currentSession = entityManager.unwrap(Session.class);
        Exercise exercise = currentSession.get(Exercise.class, id);
        if (exercise != null) {
            exercise.setName(updatedExercise.getName());
            exercise.setSets(updatedExercise.getSets());
            exercise.setReps(updatedExercise.getReps());
            exercise.setRestTime(updatedExercise.getRestTime());
            exercise.setWeight(updatedExercise.getWeight());
            currentSession.merge(exercise);
        }
    }

 */
    @Override
    public void delete(int id) {
        Session currentSession=entityManager.unwrap(Session.class);
        Exercise exercise= currentSession.get(Exercise.class,id);
        currentSession.delete(exercise);
    }
}
