package com.immomo.moment.mediautils;

import p153l.n7y;

/* JADX INFO: loaded from: classes7.dex */
public class MP4Fast extends n7y {
    private static MP4Fast sInstance;

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
