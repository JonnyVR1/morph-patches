package rtc.volc.type;

/* JADX INFO: loaded from: classes3.dex */
public enum RoomMode {
    CHAT_ROOM(1),
    KTV(2);

    private int value;

    RoomMode(int i) {
        this.value = i;
    }

    public static RoomMode fromId(int i) {
        for (RoomMode roomMode : values()) {
            if (roomMode.value() == i) {
                return roomMode;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
