package io.agora.base.internal.video;

import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
enum VideoCodecType {
    VP8("video/x-vnd.on2.vp8"),
    VP9("video/x-vnd.on2.vp9"),
    H264(YtVideoEncoder.MIME_TYPE),
    H265("video/hevc"),
    UNKNOWN("video/unknown");

    private static Set<String> _values = new HashSet();
    private final String mimeType;

    static {
        for (VideoCodecType videoCodecType : values()) {
            _values.add(videoCodecType.name());
        }
    }

    VideoCodecType(String str) {
        this.mimeType = str;
    }

    public static boolean contains(String str) {
        return _values.contains(str);
    }

    public String mimeType() {
        return this.mimeType;
    }
}
