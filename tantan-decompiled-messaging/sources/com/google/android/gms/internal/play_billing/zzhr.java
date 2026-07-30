package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class zzhr extends IOException {
    public zzhr(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public zzhr(String str) {
        super(str);
    }
}
