package com.artem.WhenArrive.controller;

import com.artem.WhenArrive.services.DataCollectorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/search")
public class TestController {


    @GetMapping("/getFlights")
    @ResponseBody
    public String getSearch(@RequestParam String from,
                            @RequestParam String destination) {
        return String.format("You are looking for flights from %s, to %s",from,destination);
    }

}
