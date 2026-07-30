package com.idv.identity.face.photinus;

import com.google.android.exoplayer2.PlaybackException;

/* JADX INFO: loaded from: classes7.dex */
public enum VideoFormatConfig {
    S(50, PlaybackException.CUSTOM_ERROR_CODE_BASE),
    M(40, 2000000),
    L(30, 3000000);

    private int bitRate;
    private int frameRate;

    VideoFormatConfig(int i, int i2) {
        this.frameRate = i;
        this.bitRate = i2;
    }

    public int getBitRate() {
        return this.bitRate;
    }

    public int getFrameRate() {
        return this.frameRate;
    }
}
