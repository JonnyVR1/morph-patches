package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum AudioAlignmentMode {
    AUDIO_ALIGNMENT_MODE_OFF(0),
    AUDIO_ALIGNMENT_MODE_AUDIOMIXING(1);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioAlignmentMode$1 */
    public static /* synthetic */ class C134061 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioAlignmentMode;

        static {
            int[] iArr = new int[AudioAlignmentMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioAlignmentMode = iArr;
            try {
                iArr[AudioAlignmentMode.AUDIO_ALIGNMENT_MODE_OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioAlignmentMode[AudioAlignmentMode.AUDIO_ALIGNMENT_MODE_AUDIOMIXING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    AudioAlignmentMode(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AudioAlignmentMode fromId(int i) {
        for (AudioAlignmentMode audioAlignmentMode : values()) {
            if (audioAlignmentMode.value() == i) {
                return audioAlignmentMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C134061.$SwitchMap$com$ss$bytertc$engine$data$AudioAlignmentMode[ordinal()];
        return (i == 1 || i != 2) ? "kAudioAlignmentModeOff" : "kAudioAlignmentModeAudioMixing";
    }

    public int value() {
        return this.value;
    }
}
