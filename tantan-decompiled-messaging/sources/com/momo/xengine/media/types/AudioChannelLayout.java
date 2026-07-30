package com.momo.xengine.media.types;

/* JADX INFO: loaded from: classes8.dex */
public enum AudioChannelLayout {
    CHANNELS_UNKNOWN(0, 0),
    CHANNELS_MONO(1, 1),
    CHANNELS_STEREO(2, 2),
    CHANNELS_2POINT1(3, 3),
    CHANNELS_4POINT0(4, 4),
    CHANNELS_4POINT1(5, 5),
    CHANNELS_5POINT1(6, 6),
    CHANNELS_7POINT1(7, 8);

    private final int channelNum;
    private final int value;

    AudioChannelLayout(int i, int i2) {
        this.value = i;
        this.channelNum = i2;
    }

    public static AudioChannelLayout valueOf(int i) {
        switch (i) {
            case 1:
                return CHANNELS_MONO;
            case 2:
                return CHANNELS_STEREO;
            case 3:
                return CHANNELS_2POINT1;
            case 4:
                return CHANNELS_4POINT0;
            case 5:
                return CHANNELS_4POINT1;
            case 6:
                return CHANNELS_5POINT1;
            case 7:
                return CHANNELS_7POINT1;
            default:
                return CHANNELS_UNKNOWN;
        }
    }

    public int getChannelNum() {
        return this.channelNum;
    }

    public int getValue() {
        return this.value;
    }
}
