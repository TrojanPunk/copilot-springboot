package com.capstone.realestate.models;
import lombok.Data;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class User {
    private String id;
    private String roles;
    private String username;
    private String password;
    private String email;
    private List<String> favorites;
}
