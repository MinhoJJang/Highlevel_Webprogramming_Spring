package com.example.week4_ice02;

import java.util.List;
import org.springframework.stereotype.Component;
@Component
public class UserDaoService
{
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserDaoService{" +
                "users=" + users +
                '}';
    }
    public List<User> findAll()
    {
        return users;
    }
    //method that finds a particular user from the list
    public User findOne(int id)
    {
        for(User user:users)
        {
            if(user.getId()==id)
                return user;
        }
        return null;
    }
}