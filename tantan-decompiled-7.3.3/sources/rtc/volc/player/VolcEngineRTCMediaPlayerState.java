package rtc.volc.player;

/* JADX INFO: loaded from: classes3.dex */
public enum VolcEngineRTCMediaPlayerState {
    STOPPED(0),
    PLAYING(1),
    PAUSED(2),
    ERROR(3),
    PLAY_COMPLETED(4),
    OPEN_COMPLETED(5),
    PLAY_FAILED(6);

    private int value;

    VolcEngineRTCMediaPlayerState(int i) {
        this.value = i;
    }

    public static VolcEngineRTCMediaPlayerState fromId(int i) {
        for (VolcEngineRTCMediaPlayerState volcEngineRTCMediaPlayerState : values()) {
            if (volcEngineRTCMediaPlayerState.value() == i) {
                return volcEngineRTCMediaPlayerState;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
