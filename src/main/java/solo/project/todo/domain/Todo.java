package solo.project.todo.domain;

import lombok.*;

import javax.persistence.*;


//@Table(uniqueConstraints = {@UniqueConstraint(
//        name ="MEMBER_FIELD_UNIQUE",columnNames = {"MEMBER_ID_PK","EMAIL"})})

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(uniqueConstraints = {@UniqueConstraint(
           name = "MEMBER_FIELD_UNIQUE", columnNames = {"TODO_ID"})})
@ToString
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "TODO_ID")
    private Long id;
    private String title;

    private int todoOrder;
    private boolean completed;

}
