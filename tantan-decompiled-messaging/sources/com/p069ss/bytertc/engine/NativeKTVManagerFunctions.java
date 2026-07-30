package com.p069ss.bytertc.engine;

import com.p069ss.bytertc.ktv.IKTVManagerEventHandler;

/* JADX INFO: loaded from: classes13.dex */
public class NativeKTVManagerFunctions {
    public static native void nativeCancelDownload(long j, int i);

    public static native void nativeClearCache(long j);

    public static native int nativeDownloadLyric(long j, String str, int i);

    public static native int nativeDownloadMidi(long j, String str);

    public static native int nativeDownloadMusic(long j, String str);

    public static native void nativeGetHotMusic(long j, String[] strArr, int i);

    public static native long nativeGetKTVPlayer(long j);

    public static native void nativeGetMusicDetail(long j, String str);

    public static native void nativeGetMusicList(long j, int i, int i2, int i3);

    public static native void nativeReleaseKTVManagerEventHandler(long j);

    public static native void nativeSearchMusic(long j, String str, int i, int i2, int i3);

    public static native long nativeSetKTVManagerEventHandler(long j, IKTVManagerEventHandler iKTVManagerEventHandler);

    public static native void nativeSetMaxCacheSize(long j, int i);
}
