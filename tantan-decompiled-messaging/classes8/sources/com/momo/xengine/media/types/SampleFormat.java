package com.momo.xengine.media.types;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public enum SampleFormat {
    AUDIO_FORMAT_UNKNOWN(0, 0),
    AUDIO_FORMAT_U8BIT(1, 1),
    AUDIO_FORMAT_16BIT(2, 2),
    AUDIO_FORMAT_32BIT(3, 4),
    AUDIO_FORMAT_FLOAT(4, 4),
    AUDIO_FORMAT_U8BIT_PLANAR(5, 1),
    AUDIO_FORMAT_16BIT_PLANAR(6, 2),
    AUDIO_FORMAT_32BIT_PLANAR(7, 4),
    AUDIO_FORMAT_FLOAT_PLANAR(8, 4);

    private final int sampleByte;
    private final int value;

    SampleFormat(int i, int i2) {
        this.value = i;
        this.sampleByte = i2;
    }

    public static SampleFormat getAudioFormat(int i) {
        switch (i) {
            case 1:
                return AUDIO_FORMAT_U8BIT;
            case 2:
                return AUDIO_FORMAT_16BIT;
            case 3:
                return AUDIO_FORMAT_32BIT;
            case 4:
                return AUDIO_FORMAT_FLOAT;
            case 5:
                return AUDIO_FORMAT_U8BIT_PLANAR;
            case 6:
                return AUDIO_FORMAT_16BIT_PLANAR;
            case 7:
                return AUDIO_FORMAT_32BIT_PLANAR;
            case 8:
                return AUDIO_FORMAT_FLOAT_PLANAR;
            default:
                return AUDIO_FORMAT_UNKNOWN;
        }
    }

    public int getSampleBit() {
        return this.sampleByte;
    }

    public int getValue() {
        return this.value;
    }
}
