package solo.project.todo.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import solo.project.todo.domain.Todo;
import solo.project.todo.dto.TodoDto;
import solo.project.todo.dto.TodoUpdateDto;
import solo.project.todo.mapper.TodoMapper;
import solo.project.todo.service.TodoService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;
    private final TodoMapper todoMapper;

    /*
    * 단건 조회
    * */
    @GetMapping("/{todoId}")
    public ResponseEntity getTodo() {
        //TODO : 컨트롤러 구현

        return null;
    }

    /*
    * 다건 조회
    * */
    @GetMapping
    public ResponseEntity getTodoList() {
        //TODO : 컨트롤러 구현

        return null;
    }

    /*
    * 질문 생성
    * */
    @PostMapping
    public ResponseEntity createTodo() {
        //TODO : 컨트롤러 구현

        return null;
    }

    /*
    * 전체 삭제
    * */
    @DeleteMapping
    public ResponseEntity deleteAll() {
        //TODO : 컨트롤러 구현

        return null;
    }


    /*
    * 해당 질문 삭제
    * */
    @DeleteMapping("/{todoId}")
    public ResponseEntity deleteTodo() {
        //TODO : 컨트롤러 구현

        return null;
    }

    /*
    * 질문 수정
    * */
    @PatchMapping("/{todoId}")
    public ResponseEntity update() {
        //TODO : 컨트롤러 구현

        return null;
    }

}
