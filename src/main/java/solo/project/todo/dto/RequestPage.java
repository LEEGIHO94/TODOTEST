package solo.project.todo.dto;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.domain.Sort;
@Getter
@Builder
public class RequestPage {
    private int page;
    private int size;
    private Sort.Direction direction;
    private String properties;
}
