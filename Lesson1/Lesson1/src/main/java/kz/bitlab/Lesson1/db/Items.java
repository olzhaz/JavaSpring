package kz.bitlab.Lesson1.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items {
    private Long id;
    private String name;
    private String description;
    private double price;
}
