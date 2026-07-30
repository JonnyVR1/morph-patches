package com.momosec.mmuid.android;

import p153l.lmw;
import p153l.tdr;

/* JADX INFO: loaded from: classes8.dex */
public class Native {
    static {
        try {
            tdr.m190640d("sharedId");
        } catch (Exception e) {
            lmw.m154891a(e);
        }
    }

    public static native byte[] doCommand(byte[] bArr, int i);
}
