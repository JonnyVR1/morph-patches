package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class ForwardStreamEventInfo {
    public ForwardStreamEvent event;
    public String roomId;

    public enum ForwardStreamEvent {
        FORWARD_STREAM_EVENT_DISCONNECTED(0),
        FORWARD_STREAM_EVENT_CONNECTED(1),
        FORWARD_STREAM_EVENT_INTERRUPT(2),
        FORWARD_STREAM_EVENT_DST_ROOM_UPDATED(3),
        FORWARD_STREAM_EVENT_UN_EXPECT_API_CALL(4);

        private int value;

        ForwardStreamEvent(int i) {
            this.value = i;
        }

        @CalledByNative
        public static ForwardStreamEvent fromId(int i) {
            for (ForwardStreamEvent forwardStreamEvent : values()) {
                if (forwardStreamEvent.value() == i) {
                    return forwardStreamEvent;
                }
            }
            return null;
        }

        public int value() {
            return this.value;
        }
    }

    public ForwardStreamEventInfo(String str, ForwardStreamEvent forwardStreamEvent) {
        this.roomId = str;
        this.event = forwardStreamEvent;
    }

    @CalledByNative
    private static ForwardStreamEventInfo create(String str, int i) {
        return new ForwardStreamEventInfo(str, ForwardStreamEvent.fromId(i));
    }
}
