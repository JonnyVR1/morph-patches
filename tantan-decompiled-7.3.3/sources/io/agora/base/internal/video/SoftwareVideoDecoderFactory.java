package io.agora.base.internal.video;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class SoftwareVideoDecoderFactory implements VideoDecoderFactory {
    public static VideoCodecInfo[] supportedCodecs() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VideoCodecInfo("VP8", new HashMap()));
        if (VP9Decoder.nativeIsSupported()) {
            arrayList.add(new VideoCodecInfo("VP9", new HashMap()));
        }
        if (H264Decoder.nativeIsSupported()) {
            arrayList.add(new VideoCodecInfo("H264", new HashMap()));
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }

    @Override // io.agora.base.internal.video.VideoDecoderFactory
    @Nullable
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        if (videoCodecInfo.getName().equalsIgnoreCase("VP8")) {
            return new VP8Decoder();
        }
        if (videoCodecInfo.getName().equalsIgnoreCase("VP9") && VP9Decoder.nativeIsSupported()) {
            return new VP9Decoder();
        }
        if (videoCodecInfo.getName().equalsIgnoreCase("H264") && H264Decoder.nativeIsSupported()) {
            return new H264Decoder();
        }
        return null;
    }

    @Override // io.agora.base.internal.video.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return supportedCodecs();
    }

    @Override // io.agora.base.internal.video.VideoDecoderFactory
    @Nullable
    @Deprecated
    public VideoDecoder createDecoder(String str) {
        return createDecoder(new VideoCodecInfo(str, new HashMap()));
    }

    @Override // io.agora.base.internal.video.VideoDecoderFactory
    @Nullable
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo, boolean z) {
        return createDecoder(videoCodecInfo);
    }
}
