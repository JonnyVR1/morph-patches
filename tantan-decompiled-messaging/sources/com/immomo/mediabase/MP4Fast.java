package com.immomo.mediabase;

/* JADX INFO: loaded from: classes7.dex */
public class MP4Fast {
    private static MP4Fast sInstance;

    static {
        try {
            System.loadLibrary("mediabase");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static MP4Fast getInstance() {
        if (sInstance == null) {
            sInstance = new MP4Fast();
        }
        return sInstance;
    }

    private native int nativeMP4Fast(String str, String str2);

    public int mp4Fast(String str, String str2) {
        return nativeMP4Fast(str, str2);
    }
}
