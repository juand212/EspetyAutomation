package com.espety.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class UserModel {

    public Integer userType;
    public String name;
    public String lastName;
    public String email;
    public String password;
    public Boolean profile;

    public UserModel() {

    }

    public UserModel setData(List<String> data) {
        userType = 1;
        name = data.get(0);
        lastName = data.get(1);
        email = data.get(2);
        password = data.get(3);
        profile = true;
        return this;
    }

}
