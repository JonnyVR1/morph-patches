package com.momosec.mmuid.android;

import p007l.mjw;
import p007l.rbr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class Native {
    static {
        try {
            rbr.m10556d("sharedId");
        } catch (Exception e) {
            mjw.m9867a(e);
        }
    }

    public static native byte[] doCommand(byte[] bArr, int i);
}
