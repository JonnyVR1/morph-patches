package com.p051p1.mobile.android.media;

import com.tantanapp.ijk.media.player.ffmpeg.TTFFmpegApi;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class TTFFmpegCommand {

    public static class FFmpegCommandException extends RuntimeException {
        public FFmpegCommandException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m21729a(String[] strArr) {
        int iTtffmpegapi = TTFFmpegApi.ttffmpegapi(strArr);
        if (iTtffmpegapi == 0) {
            return;
        }
        throw new FFmpegCommandException("TTFFmpeg command failed with code " + iTtffmpegapi + " command: " + Arrays.toString(strArr));
    }
}
