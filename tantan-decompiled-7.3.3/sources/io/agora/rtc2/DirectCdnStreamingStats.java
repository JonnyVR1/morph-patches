package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class DirectCdnStreamingStats {
    public int audioBitrate;
    public int fps;
    public int videoBitrate;
    public int videoHeight;
    public int videoWidth;

    public DirectCdnStreamingStats() {
        this.videoWidth = 0;
        this.videoHeight = 0;
        this.fps = 0;
        this.videoBitrate = 0;
        this.audioBitrate = 0;
    }

    public String toString() {
        return String.format(Locale.getDefault(), "videoWidth=%d videoHeight=%d fps=%d videoBitrate=%d audioBitrate=%d", Integer.valueOf(this.videoWidth), Integer.valueOf(this.videoHeight), Integer.valueOf(this.fps), Integer.valueOf(this.videoBitrate), Integer.valueOf(this.audioBitrate));
    }

    @CalledByNative
    public DirectCdnStreamingStats(int i, int i2, int i3, int i4, int i5) {
        this.videoWidth = i;
        this.videoHeight = i2;
        this.fps = i3;
        this.videoBitrate = i4;
        this.audioBitrate = i5;
    }
}
