package edu.testing.repository;

import edu.testing.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepostory extends CrudRepository <StudentEntity, Long> {
}
