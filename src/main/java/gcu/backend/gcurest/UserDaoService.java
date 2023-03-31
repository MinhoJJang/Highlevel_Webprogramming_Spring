package gcu.backend.gcurest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Component;
@Component
public class UserDaoService
{
    public static int usersCount=5;
    //creating an instance of ArrayList
    private static List<User> users=new ArrayList<>();

    static
    {
//adding users to the list
        users.add(new User(1, "gasoon", new Date()));
        users.add(new User(2, "kakao", new Date()));
        users.add(new User(3, "kason", new Date()));
        users.add(new User(4, "heycacao", new Date()));
        users.add(new User(5, "gachon", new Date()));
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