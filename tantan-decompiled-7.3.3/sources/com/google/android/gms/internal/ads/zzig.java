package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes6.dex */
public final class zzig extends IllegalStateException {
    public zzig(int i, int i2) {
        super("Buffer too small (" + i + " < " + i2 + ")");
    }
}
