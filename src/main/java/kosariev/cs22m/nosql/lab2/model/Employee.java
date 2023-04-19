package kosariev.cs22m.nosql.lab2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Employee")
public class Employee {
    @Id
    private String id;
    @Indexed
    private String name;
    @Indexed
    private int age;
}
