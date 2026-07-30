package com.bytedance.realx.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import androidx.annotation.Nullable;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.RXLogging;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class MediaCodecVideoDecoderFactory {
    private static final String TAG = "MediaCodecVideoDecoderFactory";
    private boolean enableAgfxSurfaceTextureHelper = false;

    @Nullable
    @CalledByNative
    public static VideoDecoder createDecoder(RXVideoCodecDesc rXVideoCodecDesc) {
        RXVideoCodecStandard standard = rXVideoCodecDesc.getStandard();
        MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(standard);
        if (mediaCodecInfoFindCodecForType == null) {
            return null;
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoFindCodecForType.getCapabilitiesForType(standard.mimeType());
        for (int i : capabilitiesForType.colorFormats) {
            RXLogging.m5692w(TAG, "support codecColorFormat:" + i);
        }
        Integer numSelectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, capabilitiesForType);
        if (numSelectColorFormat == null) {
            return null;
        }
        return new AndroidVideoDecoder(new MediaCodecWrapperFactoryImpl(), mediaCodecInfoFindCodecForType.getName(), standard, numSelectColorFormat.intValue());
    }

    @CalledByNative
    public static void enableEglLock(boolean z) {
        RXLogging.m5688e(TAG, "MediaCodecVideoDecoderFactory enableEglLock:" + z);
        EglBase.EglLock.enableEglLock = z;
    }

    @Nullable
    private static MediaCodecInfo findCodecForType(RXVideoCodecStandard rXVideoCodecStandard) {
        MediaCodecInfo codecInfoAt;
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            try {
                try {
                    codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                } catch (IllegalArgumentException e) {
                    RXLogging.m5689e(TAG, "Cannot retrieve decoder codec info", e);
                    codecInfoAt = null;
                }
                if (codecInfoAt != null && !codecInfoAt.isEncoder() && !isSoftwareDecoder(codecInfoAt) && isSupportedCodec(codecInfoAt, rXVideoCodecStandard)) {
                    return codecInfoAt;
                }
            } catch (Exception e2) {
                RXLogging.m5689e(TAG, "findCodecForType got system error:", e2);
            }
        }
        return null;
    }

    @CalledByNative
    public static RXVideoCodecDesc[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        RXVideoCodecStandard rXVideoCodecStandard = RXVideoCodecStandard.H264;
        MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(rXVideoCodecStandard);
        if (mediaCodecInfoFindCodecForType != null) {
            if (isH264HighProfileSupported(mediaCodecInfoFindCodecForType, rXVideoCodecStandard)) {
                arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileHigh));
            }
            arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileBaseline));
        }
        return (RXVideoCodecDesc[]) arrayList.toArray(new RXVideoCodecDesc[arrayList.size()]);
    }

    private static boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.")) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(rXVideoCodecStandard.mimeType());
        int i = 0;
        while (true) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
            if (i >= codecProfileLevelArr.length) {
                return false;
            }
            if (8 == codecProfileLevelArr[i].profile) {
                return true;
            }
            i++;
        }
    }

    private static boolean isSoftwareDecoder(MediaCodecInfo mediaCodecInfo) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                return mediaCodecInfo.isSoftwareOnly();
            }
            String name = mediaCodecInfo.getName();
            if (name == null) {
                return false;
            }
            String lowerCase = name.toLowerCase();
            if (lowerCase.startsWith("arc.")) {
                return false;
            }
            if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.")) {
                return true;
            }
            if ((lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.startsWith("c2.android.") || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.google.")) {
                return true;
            }
            return (lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")) ? false : true;
        } catch (Exception e) {
            RXLogging.m5689e(TAG, "check decoder softonly error.", e);
            return false;
        }
    }

    private static boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        mediaCodecInfo.getName();
        return MediaCodecUtils.codecSupportsType(mediaCodecInfo, rXVideoCodecStandard) && MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(rXVideoCodecStandard.mimeType())) != null;
    }
}
