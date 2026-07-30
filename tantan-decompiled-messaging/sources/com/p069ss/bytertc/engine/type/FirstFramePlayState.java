package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum FirstFramePlayState {
    FIRST_FRAME_PLAY_STATE_PLAYING(0),
    FIRST_FRAME_PLAY_STATE_PLAYED(1),
    FIRST_FRAME_PLAY_STATE_END(2);

    private int state;

    FirstFramePlayState(int i) {
        this.state = i;
    }

    public static FirstFramePlayState fromId(int i) {
        for (FirstFramePlayState firstFramePlayState : values()) {
            if (firstFramePlayState.value() == i) {
                return firstFramePlayState;
            }
        }
        return null;
    }

    public int value() {
        return this.state;
    }
}
