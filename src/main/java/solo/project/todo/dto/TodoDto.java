package solo.project.todo.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class TodoDto {
    private Long id;
    private String title;

    private int todoOrder;
    private boolean completed;

}
