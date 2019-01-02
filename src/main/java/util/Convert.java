package util;

import model.User;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Convert {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

//        User user = new User();
//        user.setUserName("asghar");
//        user.setPassword("aliiiiiiii");
//        mapper.writeValue(new File("c:\\file.json"), user);


        User obj = mapper.readValue(new File("c:\\file.json"), User.class);

        System.out.println(obj);


    }
}
