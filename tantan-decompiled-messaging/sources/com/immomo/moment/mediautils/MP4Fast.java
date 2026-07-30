package com.immomo.moment.mediautils;

import p149l.qyx;

/* JADX INFO: loaded from: classes7.dex */
public class MP4Fast extends qyx {
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
