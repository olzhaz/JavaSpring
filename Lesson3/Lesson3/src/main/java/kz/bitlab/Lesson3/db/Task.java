package kz.bitlab.Lesson3.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Task {
    private Long id;
    private String name;
    private String description;
    private String date;
    private boolean completed;
}
