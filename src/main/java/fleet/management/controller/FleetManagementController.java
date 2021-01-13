package fleet.management.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class FleetManagementController {

    @RequestMapping("/welcome")
    public String welcomeAPI(){
        return "Welcome User";
    }
}
