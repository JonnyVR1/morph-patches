package io.agora.base.internal.video;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class SoftwareVideoEncoderFactory implements VideoEncoderFactory {
    public static VideoCodecInfo[] supportedCodecs() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VideoCodecInfo("VP8", new HashMap()));
        if (VP9Encoder.nativeIsSupported()) {
            arrayList.add(new VideoCodecInfo("VP9", new HashMap()));
        }
        if (H264Encoder.nativeIsSupported()) {
            arrayList.add(new VideoCodecInfo("H264", new HashMap()));
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }

    @Override // io.agora.base.internal.video.VideoEncoderFactory
    @Nullable
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo, boolean z) {
        if (videoCodecInfo.name.equalsIgnoreCase("VP8")) {
            return new VP8Encoder();
        }
        if (videoCodecInfo.name.equalsIgnoreCase("VP9") && VP9Encoder.nativeIsSupported()) {
            return new VP9Encoder();
        }
        if (videoCodecInfo.name.equalsIgnoreCase("H264") && H264Encoder.nativeIsSupported()) {
            return new H264Encoder();
        }
        return null;
    }

    @Override // io.agora.base.internal.video.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs(boolean z) {
        return supportedCodecs();
    }

    @Override // io.agora.base.internal.video.VideoEncoderFactory
    @Nullable
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo, boolean z, boolean z2) {
        return createEncoder(videoCodecInfo, z);
    }
}
