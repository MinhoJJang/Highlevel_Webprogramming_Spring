package com.example.week4_ice02;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserRest
{
    private
    UserDaoService service;

    @PutMapping("/put")
    public UserDaoService put(@RequestBody UserDaoService userDaoService){
        service = userDaoService;
        return  userDaoService;
    }

    @GetMapping("/get")
    public List<User> retriveAllUsers()
    {
        return service.findAll();
    }

    @GetMapping("/get/{id}")
    public User retriveUser(@PathVariable int id)
    {
        return service.findOne(id);

    }
}