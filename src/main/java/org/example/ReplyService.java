package org.example;

public class ReplyService {

    public String reply(String message, ReplyType type) {
        if (message == null || message.isBlank()) {
            return "Please say something.";
        }
        return ReplySystem.getReply(message, type);
    }
}
