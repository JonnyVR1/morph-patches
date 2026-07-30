package io.agora.base.internal.video;

import androidx.annotation.Nullable;
import io.agora.base.internal.CalledByNative;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class VideoCodecInfo {
    public static final int EVENT_H264_CONSTRAINED_BASELINE_3_1 = 1;
    public static final int EVENT_H264_CONSTRAINED_HIGH_3_1 = 3;
    public static final int EVENT_H264_CONSTRAINED_MAIN_3_1 = 2;
    public static final String H264_CONSTRAINED_BASELINE_3_1 = "42e01f";
    public static final String H264_CONSTRAINED_HIGH_3_1 = "640c1f";
    public static final String H264_CONSTRAINED_MAIN_3_1 = "4d001f";
    public static final String H264_FMTP_LEVEL_ASYMMETRY_ALLOWED = "level-asymmetry-allowed";
    public static final String H264_FMTP_PACKETIZATION_MODE = "packetization-mode";
    public static final String H264_FMTP_PROFILE_LEVEL_ID = "profile-level-id";
    public static final String H264_IS_HIGH_PROFILE_SUPPORTED = "is-highprofile-supported";
    public static final String H264_LEVEL_3_1 = "1f";
    public static final String H264_PROFILE_CONSTRAINED_BASELINE = "42e0";
    public static final String H264_PROFILE_CONSTRAINED_HIGH = "640c";
    public static final String H264_PROFILE_CONSTRAINED_MAIN = "4d00";
    public static final String KEY_AV_DEC_VIDEO_BITRATE_ADJUSTMENT_TYPE = "av_enc_bitrate_adjustment_type";
    public static final String KEY_AV_DEC_VIDEO_HWDEC_CONFIG = "av_dec_video_hwdec_config";
    public static final String KEY_AV_DEC_VIDEO_TEXTURE_COPY_ENABLE = "av_dec_texture_copy_enable";
    public static final String KEY_AV_ENC_VIDEO_HWENC_CONFIG = "av_enc_video_hwenc_config";
    public final String name;
    public final Map<String, String> params;

    @Deprecated
    public final int payload;

    @CalledByNative
    public VideoCodecInfo(String str, Map<String, String> map) {
        this.payload = 0;
        this.name = str;
        this.params = map;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoCodecInfo)) {
            return false;
        }
        VideoCodecInfo videoCodecInfo = (VideoCodecInfo) obj;
        return this.name.equalsIgnoreCase(videoCodecInfo.name) && this.params.equals(videoCodecInfo.params);
    }

    @CalledByNative
    public String getName() {
        return this.name;
    }

    @CalledByNative
    public Map getParams() {
        return this.params;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.name.toUpperCase(Locale.ROOT), this.params});
    }

    @Deprecated
    public VideoCodecInfo(int i, String str, Map<String, String> map) {
        this.payload = i;
        this.name = str;
        this.params = map;
    }
}
