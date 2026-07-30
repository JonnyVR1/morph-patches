package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
final class zzql {
    private static final zzqn zza = zzb(zzqn.zzd);

    private static zzqn zzb(String[] strArr) {
        zzqn zzqnVarZza;
        try {
            zzqnVarZza = zzqo.zza();
        } catch (NoClassDefFoundError unused) {
            zzqnVarZza = null;
        }
        if (zzqnVarZza != null) {
            return zzqnVarZza;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (zzqn) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th) {
                th = th;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
