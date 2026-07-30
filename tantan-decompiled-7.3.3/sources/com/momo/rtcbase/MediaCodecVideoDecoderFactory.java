package com.momo.rtcbase;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
class MediaCodecVideoDecoderFactory implements VideoDecoderFactory {
    private static final String TAG = "MediaCodecVideoDecoderFactory";
    private final Predicate<MediaCodecInfo> codecAllowedPredicate;
    private final EglBase.Context sharedContext;

    public MediaCodecVideoDecoderFactory(EglBase.Context context, Predicate<MediaCodecInfo> predicate) {
        this.sharedContext = context;
        this.codecAllowedPredicate = predicate;
    }

    private MediaCodecInfo findCodecForType(VideoCodecType videoCodecType) {
        int i = 0;
        while (true) {
            MediaCodecInfo codecInfoAt = null;
            if (i >= MediaCodecList.getCodecCount()) {
                return null;
            }
            try {
                codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e) {
                Logging.m21198e(TAG, "Cannot retrieve decoder codec info", e);
            }
            if (codecInfoAt != null && !codecInfoAt.isEncoder() && isSupportedCodec(codecInfoAt, videoCodecType)) {
                return codecInfoAt;
            }
            i++;
        }
    }

    private boolean isCodecAllowed(MediaCodecInfo mediaCodecInfo) {
        Predicate<MediaCodecInfo> predicate = this.codecAllowedPredicate;
        if (predicate == null) {
            return true;
        }
        return predicate.test(mediaCodecInfo);
    }

    private boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.");
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        mediaCodecInfo.getName();
        if (MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecType) && MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecType.mimeType())) != null) {
            return isCodecAllowed(mediaCodecInfo);
        }
        return false;
    }

    @Override // com.momo.rtcbase.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        VideoCodecType videoCodecTypeValueOf = VideoCodecType.valueOf(videoCodecInfo.getName());
        MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(videoCodecTypeValueOf);
        if (mediaCodecInfoFindCodecForType == null) {
            return null;
        }
        return new AndroidVideoDecoder(new MediaCodecWrapperFactoryImpl(), mediaCodecInfoFindCodecForType.getName(), videoCodecTypeValueOf, MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, mediaCodecInfoFindCodecForType.getCapabilitiesForType(videoCodecTypeValueOf.mimeType())).intValue(), this.sharedContext);
    }

    @Override // com.momo.rtcbase.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        VideoCodecType[] videoCodecTypeArr = {VideoCodecType.VP8, VideoCodecType.VP9, VideoCodecType.H264};
        for (int i = 0; i < 3; i++) {
            VideoCodecType videoCodecType = videoCodecTypeArr[i];
            MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(videoCodecType);
            if (mediaCodecInfoFindCodecForType != null) {
                String strName = videoCodecType.name();
                if (videoCodecType == VideoCodecType.H264 && isH264HighProfileSupported(mediaCodecInfoFindCodecForType)) {
                    arrayList.add(new VideoCodecInfo(strName, MediaCodecUtils.getCodecProperties(videoCodecType, true)));
                }
                arrayList.add(new VideoCodecInfo(strName, MediaCodecUtils.getCodecProperties(videoCodecType, false)));
            }
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }
}
