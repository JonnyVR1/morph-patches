package com.momo.xengine.media;

import android.text.TextUtils;
import com.momo.xengine.media.types.VideoFormat;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
final class MediaUtilImpl implements IMediaUtil {
    private static boolean isFileExists(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    private native boolean nativeGetVideoInfo(String str, VideoFormat videoFormat);

    @Override // com.momo.xengine.media.IMediaUtil
    public VideoFormat getVideoInfo(@NotNull String str) {
        if (!isFileExists(str)) {
            return null;
        }
        VideoFormat videoFormat = new VideoFormat();
        if (nativeGetVideoInfo(str, videoFormat)) {
            return videoFormat;
        }
        return null;
    }
}
