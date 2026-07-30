package com.momosec.mmuid.android;

import p149l.mjw;
import p149l.rbr;

/* JADX INFO: loaded from: classes8.dex */
public class Native {
    static {
        try {
            rbr.m178691d("sharedId");
        } catch (Exception e) {
            mjw.m154917a(e);
        }
    }

    public static native byte[] doCommand(byte[] bArr, int i);
}
