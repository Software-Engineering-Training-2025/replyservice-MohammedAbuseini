package org.example;

import java.util.HashMap;

public class FriendlyReplies {
    public static FriendlyReplies instance;
    public HashMap <String, String> replies;
    public String NotExisted;

    private FriendlyReplies() {
        replies = new HashMap<>();

        NotExisted = "Could you tell me more?";
        replies.put("hi", "Hey there! \uD83D\uDE0A How can I help?");
        replies.put("hello", "Hi! \uD83D\uDC4B What’s up?");
        replies.put("how are you", "Doing great! \uD83D\uDE04 How can I help?");
        replies.put("i need help", "I’ve got you! \uD83D\uDE42 Tell me a bit more.");
        replies.put("can you help me with my account", "Sure thing! \uD83D\uDE0A What’s wrong with the account?");
        replies.put("thanks", "Anytime! \uD83D\uDE4C");
        replies.put("bye", "See you later! \uD83D\uDC4B");
        replies.put("what is your name", "I’m your helper bot \uD83E\uDD16");
    }

    public static FriendlyReplies getInstance() {
        if (instance == null) {
            instance = new FriendlyReplies();
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
