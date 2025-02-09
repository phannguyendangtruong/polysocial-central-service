package com.polysocial.service.exerciseQuiz;

import java.util.List;
import com.polysocial.dto.ExercisesDTO;

public interface ExerciseService {

    ExercisesDTO createOne(ExercisesDTO exercise);

    ExercisesDTO updateOne(ExercisesDTO exercise);

    ExercisesDTO deleteOne(ExercisesDTO exercise);

    List<Object> getAllExercisesEndDate(Long groupId);
}
