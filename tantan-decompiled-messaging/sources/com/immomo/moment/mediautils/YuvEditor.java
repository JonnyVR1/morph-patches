package com.immomo.moment.mediautils;

import p149l.qyx;

/* JADX INFO: loaded from: classes7.dex */
public class YuvEditor extends qyx {
    private static YuvEditor sInstance;

    public static YuvEditor getDefault() {
        if (sInstance == null) {
            sInstance = new YuvEditor();
        }
        return sInstance;
    }

    private native byte[] nativeArgb2Nv21(int[] iArr, int i, int i2);

    private native byte[] nativeNV21toARGB(byte[] bArr, int i, int i2);

    public byte[] ConvertARGBToNV21(int[] iArr, int i, int i2) {
        return nativeArgb2Nv21(iArr, i, i2);
    }

    public byte[] ConvertNV21ToARGB(byte[] bArr, int i, int i2) {
        return nativeNV21toARGB(bArr, i, i2);
    }
}
