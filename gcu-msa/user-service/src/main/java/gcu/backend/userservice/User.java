package gcu.backend.userservice;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@SuppressWarnings({"JpaDataSourceORMInspection"})
@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
public class User {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "age", nullable = false)
    private Integer age;
    @Lob
    @Column(name = "contents")
    private String contents;
    @Builder
    public User(String name, String address, Integer age, String contents) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.contents = contents;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}