package ru.evgeniykudashov.adservice.model;

import ru.evgeniykudashov.adservice.model.statuses.MessageType;

import java.time.LocalDateTime;

public class Message {
    private String messageId;
    private long senderId;
    private long recipientId;
    private String content;
    private LocalDateTime sendTime;

    private MessageType messageType;

}
