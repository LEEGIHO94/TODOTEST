package solo.project.todo.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TodoUpdateDto {
    private String title;

    private int todoOrder;
    private boolean completed;
}
