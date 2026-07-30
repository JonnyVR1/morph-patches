package com.momo.rtcbase;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class SoftwareVideoDecoderFactory implements VideoDecoderFactory {
    public static VideoCodecInfo[] supportedCodecs() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VideoCodecInfo("VP8", new HashMap()));
        if (LibvpxVp9Decoder.nativeIsSupported()) {
            arrayList.add(new VideoCodecInfo("VP9", new HashMap()));
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }

    @Override // com.momo.rtcbase.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        if (videoCodecInfo.getName().equalsIgnoreCase("VP8")) {
            return new LibvpxVp8Decoder();
        }
        if (videoCodecInfo.getName().equalsIgnoreCase("VP9") && LibvpxVp9Decoder.nativeIsSupported()) {
            return new LibvpxVp9Decoder();
        }
        return null;
    }

    @Override // com.momo.rtcbase.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return supportedCodecs();
    }

    @Override // com.momo.rtcbase.VideoDecoderFactory
    @Deprecated
    public VideoDecoder createDecoder(String str) {
        return createDecoder(new VideoCodecInfo(str, new HashMap()));
    }
}
