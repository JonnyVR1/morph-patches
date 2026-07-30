package com.google.android.libraries.places.internal;

import com.p046p1.mobile.putong.core.data.Target;

/* JADX INFO: loaded from: classes7.dex */
public final class zzrq {
    private static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final zzru zzb;

    static {
        zzru zzrvVar;
        for (int i = 0; i < 2; i++) {
            zzrvVar = null;
            try {
                zzrvVar = (zzru) Class.forName(zza[i]).asSubclass(zzru.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (zzrvVar != null) {
                zzb = zzrvVar;
            }
        }
        zzrvVar = new zzrv();
        zzb = zzrvVar;
    }

    public static StackTraceElement zza(Class cls, int i) {
        zzrr.zza(cls, Target.TYPE);
        return zzb.zza(cls, 2);
    }
}
