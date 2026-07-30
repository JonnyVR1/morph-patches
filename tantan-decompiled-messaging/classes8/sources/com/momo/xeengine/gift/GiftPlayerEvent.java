package com.momo.xeengine.gift;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public class GiftPlayerEvent {
    private String message;
    private EventType type;

    public enum EventType {
        None(0),
        Goto(1),
        Downgrade(3);

        private final int value;

        EventType(int i) {
            this.value = i;
        }

        public static EventType fromValue(int i) {
            for (EventType eventType : values()) {
                if (eventType.value == i) {
                    return eventType;
                }
            }
            return None;
        }

        public int getValue() {
            return this.value;
        }
    }

    public GiftPlayerEvent(EventType eventType, String str) {
        EventType eventType2 = EventType.None;
        this.message = "";
        this.type = eventType;
        this.message = str == null ? "" : str;
    }

    public String getMessage() {
        return this.message;
    }

    public EventType getType() {
        return this.type;
    }

    public void setMessage(String str) {
        if (str == null) {
            str = "";
        }
        this.message = str;
    }

    public void setType(EventType eventType) {
        this.type = eventType;
    }

    public GiftPlayerEvent() {
        this.type = EventType.None;
        this.message = "";
    }
}
