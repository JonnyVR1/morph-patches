package com.p074ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes11.dex */
public enum AudioFrameCallbackMethod {
    AUDIO_FRAME_CALLBACK_RECORD(0),
    AUDIO_FRAME_CALLBACK_PLAYBACK(1),
    AUDIO_FRAME_CALLBACK_MIXED(2),
    AUDIO_FRAME_CALLBACK_REMOTE_USER(3),
    AUDIO_FRAME_CALLBACK_CAPTURE_MIXED(5);

    private int value;

    AudioFrameCallbackMethod(int i) {
        this.value = i;
    }

    public static AudioFrameCallbackMethod fromId(int i) {
        for (AudioFrameCallbackMethod audioFrameCallbackMethod : values()) {
            if (audioFrameCallbackMethod.value() == i) {
                return audioFrameCallbackMethod;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
