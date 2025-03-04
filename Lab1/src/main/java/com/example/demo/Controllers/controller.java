package com.example.demo.Controllers;
import org.springframework.web.bind.annotation.*;

@RestController

public class controller {
    @GetMapping("/hello")
    public String GetWorked()
    {
        return "Get Worked Successfully";
    }

    @PostMapping("/hello")
    public String PostWorked()
    {
        return "post Worked Successfully";
    }

    @PutMapping("/hello")
    public String PutWorked()
    {
        return "Put Worked Successfully";
    }

    @DeleteMapping("/hello")
    public String DeleteWorked()
    {
        return "Delete Worked Successfully";
    }
}
