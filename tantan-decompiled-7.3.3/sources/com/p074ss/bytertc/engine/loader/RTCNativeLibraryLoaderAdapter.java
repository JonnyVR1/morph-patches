package com.p074ss.bytertc.engine.loader;

/* JADX INFO: loaded from: classes11.dex */
public class RTCNativeLibraryLoaderAdapter {
    protected static RTCNativeLibraryLoader mRtcNativeLibraryLoader = new RTCNativeLibraryLoaderImpl();

    public static RTCNativeLibraryLoader getRtcNativeLibraryLoader() {
        return mRtcNativeLibraryLoader;
    }

    public static void setRtcNativeLibraryLoader(RTCNativeLibraryLoader rTCNativeLibraryLoader) {
        mRtcNativeLibraryLoader = rTCNativeLibraryLoader;
    }
}
