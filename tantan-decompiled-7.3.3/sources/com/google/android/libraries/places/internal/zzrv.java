package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzrv implements zzru {
    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:16:0x002f A[RETURN] */
    @Override // com.google.android.libraries.places.internal.zzru
    public final StackTraceElement zza(Class cls, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String name = cls.getName();
        int i2 = 3;
        boolean z = false;
        while (i2 < stackTrace.length) {
            if (stackTrace[i2].getClassName().equals(name)) {
                z = true;
            } else {
                if (z) {
                    if (i2 != -1) {
                        return stackTrace[i2];
                    }
                    return null;
                }
                z = false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 != -1) {
            return stackTrace[i2];
        }
        return null;
    }
}
