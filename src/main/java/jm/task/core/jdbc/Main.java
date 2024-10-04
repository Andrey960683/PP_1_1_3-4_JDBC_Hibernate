package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("name","lastName", (byte) 18);
        System.out.println("User с именем — name добавлен в базу данных");
        userService.saveUser("name1","lastName1", (byte) 19);
        System.out.println("User с именем — name1 добавлен в базу данных");
        userService.saveUser("name2","lastName2", (byte) 20);
        System.out.println("User с именем — name2 добавлен в базу данных");
        userService.saveUser("name3","lastName3", (byte) 21);
        System.out.println("User с именем — name3 добавлен в базу данных");
        List<User> allUsers = userService.getAllUsers();
        for (User user : allUsers){
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
