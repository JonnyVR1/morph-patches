package com.momo.rtcbase;

import android.media.MediaCodecInfo;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class HardwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    private static final Predicate<MediaCodecInfo> defaultAllowedPredicate = new Predicate<MediaCodecInfo>() { // from class: com.momo.rtcbase.HardwareVideoDecoderFactory.1
        private String[] prefixBlacklist;

        {
            String[] strArr = MediaCodecUtils.SOFTWARE_IMPLEMENTATION_PREFIXES;
            this.prefixBlacklist = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        @Override // com.momo.rtcbase.Predicate
        public boolean test(MediaCodecInfo mediaCodecInfo) {
            String name = mediaCodecInfo.getName();
            for (String str : this.prefixBlacklist) {
                if (name.startsWith(str)) {
                    return false;
                }
            }
            return true;
        }
    };

    public HardwareVideoDecoderFactory(EglBase.Context context, Predicate<MediaCodecInfo> predicate) {
        super(context, predicate == null ? defaultAllowedPredicate : predicate.and(defaultAllowedPredicate));
    }

    @Override // com.momo.rtcbase.MediaCodecVideoDecoderFactory, com.momo.rtcbase.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    @Override // com.momo.rtcbase.MediaCodecVideoDecoderFactory, com.momo.rtcbase.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }

    public HardwareVideoDecoderFactory(EglBase.Context context) {
        this(context, null);
    }

    @Deprecated
    public HardwareVideoDecoderFactory() {
        this(null);
    }
}
