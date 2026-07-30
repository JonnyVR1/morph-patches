package com.tantanapp.ijk.media.player.ffmpeg;

import com.tantanapp.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes11.dex */
public class TTFFmpegApi {
    static {
        IjkMediaPlayer.loadLibrariesOnce(null);
    }

    public static native int ttffmpegapi(String[] strArr);
}
