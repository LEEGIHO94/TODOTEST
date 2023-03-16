package solo.project.todo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import solo.project.todo.domain.Todo;
import solo.project.todo.dto.RequestPage;
import solo.project.todo.repository.TodoRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    /*
    * 생성
    * */
    public Long createTodo() {
        //TODO 구현

        return null;
    }
    /*
    *
    * 단건 조회 및 검증
    * */
    @Transactional(readOnly = true)
    public Todo verifyExistsTodo() {
        //TODO 구현

        return null;
    }

    /*
     * 다건 조회
     * */
    @Transactional(readOnly = true)
    public List<Todo> getTodoList() {
        //TODO 구현

        return null;
    }

    //페이징
    @Transactional(readOnly = true)
    public Page<Todo> getTodoPaging() {
        //TODO 구현

        return null;
    }


    /*
     * 단건 삭제 구현
     * */
    public void deleteTodo() {
        //TODO 구현

    }

    /*
     * 전체 삭제 구현
     * */
    public void deleteAll() {
        //TODO 구현

    }

    /*
    * 업데이트 구현
    * */
    public Todo updateTodo(Todo todo, Long todoId) {
        //TODO 구현

        return null;
    }

    /*
    * 이미 존재하는지 여부 체크
    * */
    private void checkTodo(String title) {
        //TODO 구현

    }

}
