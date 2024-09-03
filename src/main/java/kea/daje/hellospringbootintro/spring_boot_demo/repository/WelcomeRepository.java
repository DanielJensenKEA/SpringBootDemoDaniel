package kea.daje.hellospringbootintro.spring_boot_demo.repository;

import kea.daje.hellospringbootintro.spring_boot_demo.model.Message;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class WelcomeRepository {
    private int messageId = 1;
    private final List<Message> messages = new ArrayList<>();

    public WelcomeRepository() {
        populateMessages();

    }
    public int getMessageId() {
        return messageId++;
    }
    public void populateMessages() {
        messages.add(new Message(getMessageId(),"Velkommen til KEAs 1. semester"));
        messages.add(new Message(getMessageId(),"Velkommen til KEAs 2. semester"));
        messages.add(new Message(getMessageId(),"Velkommen til KEAs 3. semester"));

    }
    public List<Message> getAllMessages() {
        return messages;
    }
    public Message findMessageById(int id) {
        for (Message msg : messages) {
            if (msg.getId() == id) {
                return msg;
            }
        }
        return null;
    }

    public Message addMessage(Message message) {
        message.setId(getMessageId());
        messages.add(message);
        return message;
    }
}
