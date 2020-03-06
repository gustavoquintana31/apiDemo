package cast.demo.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

    @Autowired
    DemoService demoService;


    @GetMapping("/users")
    public List<UserDTO> getAllUsers() {
        return demoService.getAllUsers();
    }

    @GetMapping("/sumar")
    public Integer sumar(@RequestParam Integer one, @RequestParam Integer two) {
        return demoService.sumar(one, two);
    }


}
