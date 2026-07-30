package io.agora.rtc2.video;

/* JADX INFO: loaded from: classes2.dex */
public class VideoDenoiserOptions {
    public static final int VIDEO_DENOISER_AUTO = 0;
    public static final int VIDEO_DENOISER_LEVEL_FAST = 1;
    public static final int VIDEO_DENOISER_LEVEL_HIGH_QUALITY = 0;
    public static final int VIDEO_DENOISER_MANUAL = 1;
    public int denoiserLevel;
    public int denoiserMode;

    public VideoDenoiserOptions() {
        this.denoiserMode = 0;
        this.denoiserLevel = 0;
    }

    public VideoDenoiserOptions(int i, int i2) {
        this.denoiserMode = i;
        this.denoiserLevel = i2;
    }
}
