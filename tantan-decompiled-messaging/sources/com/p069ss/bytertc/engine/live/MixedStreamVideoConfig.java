package com.p069ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes13.dex */
public class MixedStreamVideoConfig {
    public MixedStreamVideoCodecType videoCodec = MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_H264;
    public int fps = 15;
    public int gop = 2;
    public int bitrate = 500;
    public int width = 360;
    public int height = 640;
    public boolean enableBframe = false;

    public String toString() {
        return "MixedStreamVideoConfig{videoCodec='" + this.videoCodec + "', fps=" + this.fps + ", gop=" + this.gop + ", bitrate=" + this.bitrate + ", width=" + this.width + ", height=" + this.height + ", enableBframe=" + this.enableBframe + '}';
    }
}
