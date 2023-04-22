package gcu.backend.memberservice;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member implements Serializable {

    private long id;
    private String name;
    private String password;
}