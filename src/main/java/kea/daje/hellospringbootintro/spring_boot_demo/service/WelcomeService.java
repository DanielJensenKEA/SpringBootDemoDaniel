package kea.daje.hellospringbootintro.spring_boot_demo.service;

import kea.daje.hellospringbootintro.spring_boot_demo.model.Message;
import kea.daje.hellospringbootintro.spring_boot_demo.repository.WelcomeRepository;
import org.springframework.stereotype.Service;
import kea.daje.hellospringbootintro.spring_boot_demo.*;

import java.util.List;

@Service
public class WelcomeService {
    private final WelcomeRepository welcomeRepository;

    public WelcomeService(WelcomeRepository welcomeRepository) {
        this.welcomeRepository = welcomeRepository;
    }
    public List<Message> getAllMessages() {
        return welcomeRepository.getAllMessages();
    }
    public Message findMessageById(int id) {
        return welcomeRepository.findMessageById(id);
    }

    public Message addMessage(Message message) {
        return welcomeRepository.addMessage(message);
    }
}
