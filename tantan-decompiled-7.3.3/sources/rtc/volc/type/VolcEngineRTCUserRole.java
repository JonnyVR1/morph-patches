package rtc.volc.type;

/* JADX INFO: loaded from: classes3.dex */
public enum VolcEngineRTCUserRole {
    UNKNOWUSER(1),
    BROADCASTER(2),
    AUDIENCE(3),
    LEADER_SINGER(4),
    ACCOMPANY_SINGER(5);

    private int value;

    VolcEngineRTCUserRole(int i) {
        this.value = i;
    }

    public static VolcEngineRTCUserRole fromId(int i) {
        for (VolcEngineRTCUserRole volcEngineRTCUserRole : values()) {
            if (volcEngineRTCUserRole.value() == i) {
                return volcEngineRTCUserRole;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
