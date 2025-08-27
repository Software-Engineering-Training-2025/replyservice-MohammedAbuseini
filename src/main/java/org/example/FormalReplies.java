package org.example;

import java.util.HashMap;

public class FormalReplies {
    public static FormalReplies instance;
    public HashMap <String,String> replies;
    public String NotExisted;

    private FormalReplies() {
        replies = new HashMap<>();

        NotExisted = "Could you clarify your request?";
        replies.put("hi", "Hello. How may I assist you today?");
        replies.put("hello", "Hello. How may I assist you today?");
        replies.put("how are you", "I am functioning properly. How may I assist you?");
        replies.put("i need help", "I can assist with that. Please provide more details.");
        replies.put("can you help me with my account", "Certainly. Please describe the account issue.");
        replies.put("thanks", "You are welcome.");
        replies.put("bye", "Goodbye.");
        replies.put("what is your name", "I am your virtual assistant.");
    }

    public static FormalReplies getInstance() {
        if (instance == null) {
            instance = new FormalReplies();
        }
        return instance;
    }

    public String get(String input) {
        getInstance();
        if (!instance.replies.containsKey(input)) {
            return NotExisted;
        }
        return instance.replies.get(input);

    }
}
