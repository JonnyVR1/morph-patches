package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class zzgyx extends IOException {
    public zzgyx(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zzgyx() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzgyx(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
