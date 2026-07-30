package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class zzasu extends IOException {
    public zzasu(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zzasu() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzasu(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
