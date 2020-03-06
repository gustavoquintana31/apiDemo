package cast.demo.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoService {

    public List getAllUsers(){


        List <UserDTO> userDTOList = new ArrayList<>();

        UserDTO userDTO = new UserDTO();
        userDTO.setName("Dahiana");
        userDTO.setLastName("Ramirez");

        userDTOList.add(userDTO);




        return userDTOList;

    }

    public Integer sumar(Integer one, Integer two){
        return one + two;

    }

}
