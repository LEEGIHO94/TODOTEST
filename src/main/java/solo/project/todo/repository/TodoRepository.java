package solo.project.todo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import solo.project.todo.domain.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoRepository extends JpaRepository<Todo,Long> {
//    Optional<Todo> findByTitle(String title);

//    Page<Todo> findAll(Pageable pageable);


}
