package kea.daje.hellospringbootintro.spring_boot_demo.controller;

import kea.daje.hellospringbootintro.spring_boot_demo.model.Message;
import kea.daje.hellospringbootintro.spring_boot_demo.service.WelcomeService;
import kea.daje.hellospringbootintro.spring_boot_demo.*;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/welcome")
public class WelcomeController {
    private final WelcomeService welcomeService;

    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @GetMapping("")
    public ResponseEntity<List<Message>> getAllMessages() {
        List<Message> messages = welcomeService.getAllMessages();
        return new ResponseEntity<>(messages, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Message> getMessageById(@PathVariable int id) {
        Message message = welcomeService.findMessageById(id);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Message> addMessage(@RequestBody Message message) {
        Message msg = welcomeService.addMessage(message);
        return new ResponseEntity<>(msg, HttpStatus.CREATED);

    }





}
