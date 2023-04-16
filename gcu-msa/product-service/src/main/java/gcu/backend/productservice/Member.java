package gcu.backend.productservice;

import lombok.Data;

//page 23
@Data
public class Member {
    private Long id;
    private String name;
    private String password;
}
