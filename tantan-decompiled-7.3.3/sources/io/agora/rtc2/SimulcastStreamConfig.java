package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;
import io.agora.rtc2.video.VideoEncoderConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class SimulcastStreamConfig {
    public int bitrate;
    public VideoEncoderConfiguration.VideoDimensions dimensions;
    public int framerate;

    public SimulcastStreamConfig() {
        this.dimensions = new VideoEncoderConfiguration.VideoDimensions(-1, -1);
        this.bitrate = -1;
        this.framerate = 5;
    }

    @CalledByNative
    public int getBitrate() {
        return this.bitrate;
    }

    @CalledByNative
    public int getDimensionsHeight() {
        return this.dimensions.height;
    }

    @CalledByNative
    public int getDimensionsWidth() {
        return this.dimensions.width;
    }

    @CalledByNative
    public int getFramerate() {
        return this.framerate;
    }

    public SimulcastStreamConfig(VideoEncoderConfiguration.VideoDimensions videoDimensions, int i, int i2) {
        this.dimensions = videoDimensions;
        this.bitrate = i;
        this.framerate = i2;
    }
}
