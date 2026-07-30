package com.momo.rtcbase;

import android.media.MediaCodecInfo;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class PlatformSoftwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    private static final Predicate<MediaCodecInfo> defaultAllowedPredicate = new Predicate<MediaCodecInfo>() { // from class: com.momo.rtcbase.PlatformSoftwareVideoDecoderFactory.1
        private String[] prefixWhitelist;

        {
            String[] strArr = MediaCodecUtils.SOFTWARE_IMPLEMENTATION_PREFIXES;
            this.prefixWhitelist = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        @Override // com.momo.rtcbase.Predicate
        public boolean test(MediaCodecInfo mediaCodecInfo) {
            String name = mediaCodecInfo.getName();
            for (String str : this.prefixWhitelist) {
                if (name.startsWith(str)) {
                    return true;
                }
            }
            return false;
        }
    };

    public PlatformSoftwareVideoDecoderFactory(EglBase.Context context) {
        super(context, defaultAllowedPredicate);
    }

    @Override // com.momo.rtcbase.MediaCodecVideoDecoderFactory, com.momo.rtcbase.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    @Override // com.momo.rtcbase.MediaCodecVideoDecoderFactory, com.momo.rtcbase.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }
}
