package com.p069ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes13.dex */
public enum AudioPropertiesMode {
    AUDIO_PROPERTIES_MODE_MICROPHONE(0),
    AUDIO_PROPERTIES_MODE_AUDIOMIXING(1);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AudioPropertiesMode$1 */
    public static /* synthetic */ class C134151 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioPropertiesMode;

        static {
            int[] iArr = new int[AudioPropertiesMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioPropertiesMode = iArr;
            try {
                iArr[AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioPropertiesMode[AudioPropertiesMode.AUDIO_PROPERTIES_MODE_AUDIOMIXING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    AudioPropertiesMode(int i) {
        this.value = i;
    }

    public static AudioPropertiesMode fromId(int i) {
        for (AudioPropertiesMode audioPropertiesMode : values()) {
            if (audioPropertiesMode.value() == i) {
                return audioPropertiesMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C134151.$SwitchMap$com$ss$bytertc$engine$data$AudioPropertiesMode[ordinal()];
        return (i == 1 || i != 2) ? "AUDIO_PROPERTIES_MODE_MICROPHONE" : "AUDIO_PROPERTIES_MODE_AUDIOMIXING";
    }

    public int value() {
        return this.value;
    }
}
