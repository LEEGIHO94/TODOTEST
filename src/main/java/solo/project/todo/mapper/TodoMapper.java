package solo.project.todo.mapper;

import org.mapstruct.Mapper;
import solo.project.todo.domain.Todo;
import solo.project.todo.dto.TodoDto;
import solo.project.todo.dto.TodoUpdateDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TodoMapper {
    TodoDto transTodoToTodoDto(Todo todo);
    List<TodoDto> transTodoListToTodoDtoList(List<Todo> todo);

    Todo transTodoUpdateDtoToTodo(TodoUpdateDto todoUpdateDto);
    Todo transTodoToTodoUpdateDtd(TodoUpdateDto todoDto);
}
