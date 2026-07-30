package com.immomo.hdata.android;

import p153l.kmw;
import p153l.sdr;

/* JADX INFO: loaded from: classes7.dex */
public class Coded {
    static {
        try {
            sdr.m185502d("smses");
        } catch (Exception e) {
            kmw.m150491a(e);
        }
    }

    public static native byte[] doCommand(byte[] bArr, int i);

    public static native byte[] doCommand2(int i, int i2);
}
