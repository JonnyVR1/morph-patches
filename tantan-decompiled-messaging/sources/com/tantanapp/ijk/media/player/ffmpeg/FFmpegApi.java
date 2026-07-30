package com.tantanapp.ijk.media.player.ffmpeg;

import com.tantanapp.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes13.dex */
public class FFmpegApi {
    static {
        IjkMediaPlayer.loadLibrariesOnce(null);
        IjkMediaPlayer.native_profileBegin("libttplayer.so");
    }

    public static native String av_base64_encode(byte[] bArr);

    public static native int exec(String[] strArr);
}
