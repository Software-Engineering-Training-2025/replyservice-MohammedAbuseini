package org.example;

public class ReplySystem {
    public static String getReply(String message, ReplyType type) {
        if (type.equals(ReplyType.FORMAL)) {
            FormalReplies.getInstance();
            return FormalReplies.instance.get(message);
        }
        else if (type.equals(ReplyType.FRIENDLY)) {
            FriendlyReplies.getInstance();
            return FriendlyReplies.instance.get(message);
        }
        else if (type.equals(ReplyType.CONCISE)) {
            ConciseReplies.getInstance();
            return ConciseReplies.instance.get(message);
        }
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
