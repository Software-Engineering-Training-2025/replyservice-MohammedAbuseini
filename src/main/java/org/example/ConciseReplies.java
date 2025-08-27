package org.example;

import java.lang.constant.Constable;
import java.util.HashMap;

public class ConciseReplies {
    public static ConciseReplies instance;
    public HashMap <String,String> replies;
    public String NotExisted;

    private ConciseReplies() {
        replies = new HashMap<>();

        NotExisted = "Please clarify.";
        replies.put("hi", "Hello. How can I help?");
        replies.put("hello", "Hello. How can I help?");
        replies.put("how are you", "I’m good. How can I help?");
        replies.put("i need help", "Share details; I’ll help.");
        replies.put("can you help me with my account", "Describe the account issue…");
        replies.put("thanks", "You’re welcome.");
        replies.put("bye", "Goodbye.");
        replies.put("what is your name", "I’m your assistant.");
    }

    public static ConciseReplies getInstance() {
        if (instance == null) {
            instance = new ConciseReplies();
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
