package io.agora.base.internal.video;

import android.media.MediaCodecInfo;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
import io.agora.base.internal.Logging;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class HardwareVideoDecoderFactory implements VideoDecoderFactory {
    private static final String TAG = "HardwareVideoDecoderFactory";

    @Nullable
    private final EglBase.Context sharedContext;

    @Nullable
    private final Surface surface;

    @Deprecated
    public HardwareVideoDecoderFactory() {
        this.sharedContext = null;
        this.surface = null;
    }

    private boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.");
    }

    @Override // io.agora.base.internal.video.VideoDecoderFactory
    @Nullable
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        VideoCodecType videoCodecTypeValueOf;
        MediaCodecInfo mediaCodecInfoFindCodecForType;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        EglBase.Context context;
        if (!VideoCodecType.contains(videoCodecInfo.getName()) || (mediaCodecInfoFindCodecForType = VideoDecoderUtils.findCodecForType((videoCodecTypeValueOf = VideoCodecType.valueOf(videoCodecInfo.getName())))) == null) {
            return null;
        }
        try {
            capabilitiesForType = mediaCodecInfoFindCodecForType.getCapabilitiesForType(videoCodecTypeValueOf.mimeType());
        } catch (IllegalArgumentException e) {
            ThrowableExtension.printStackTrace(e);
            capabilitiesForType = null;
        }
        if (capabilitiesForType != null && capabilitiesForType.colorFormats != null) {
            Logging.m87211i(TAG, "supportedColorFormat : " + Arrays.toString(capabilitiesForType.colorFormats));
        }
        EglBase.Context context2 = this.sharedContext;
        Surface surface = this.surface;
        Map<String, String> map = videoCodecInfo.params;
        if (map != null && map.containsKey("av_dec_output_byte_frame")) {
            Logging.m87213w(TAG, "force decode to byte frame");
            context2 = null;
        }
        if (surface != null) {
            Logging.m87213w(TAG, "force direct surface");
            context = null;
        } else {
            context = context2;
        }
        Integer numSelectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, capabilitiesForType);
        if (numSelectColorFormat == null) {
            Logging.m87213w(TAG, "Unsupported color format!");
            return null;
        }
        Logging.m87211i(TAG, "select color format: " + numSelectColorFormat);
        return new HardwareVideoDecoder(new MediaCodecWrapperFactoryImpl(), mediaCodecInfoFindCodecForType.getName(), videoCodecTypeValueOf, videoCodecInfo.params, numSelectColorFormat.intValue(), context, surface);
    }

    @Override // io.agora.base.internal.video.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        VideoCodecType[] videoCodecTypeArr = {VideoCodecType.VP8, VideoCodecType.VP9, VideoCodecType.H264, VideoCodecType.H265};
        for (int i = 0; i < 4; i++) {
            VideoCodecType videoCodecType = videoCodecTypeArr[i];
            MediaCodecInfo mediaCodecInfoFindCodecForType = VideoDecoderUtils.findCodecForType(videoCodecType);
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

    public HardwareVideoDecoderFactory(EglBase.Context context) {
        this.sharedContext = context;
        this.surface = null;
    }

    public HardwareVideoDecoderFactory(Surface surface) {
        this.surface = surface;
        this.sharedContext = null;
    }

    @Override // io.agora.base.internal.video.VideoDecoderFactory
    @Nullable
    public VideoDecoder createDecoder(String str) {
        throw new UnsupportedOperationException("Deprecated and not implemented.");
    }

    @Override // io.agora.base.internal.video.VideoDecoderFactory
    @Nullable
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo, boolean z) {
        return createDecoder(videoCodecInfo);
    }
}
