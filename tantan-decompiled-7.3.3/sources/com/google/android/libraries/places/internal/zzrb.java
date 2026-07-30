package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes7.dex */
public final class zzrb extends zzqp {
    private static final Set zza;
    private static final zzqh zzb;
    private static final zzqy zzc;
    private final String zzd;
    private final zzpu zze;
    private final Level zzf;
    private final Set zzg;
    private final zzqh zzh;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzpo.zza, zzpt.zza)));
        zza = setUnmodifiableSet;
        zzb = zzqk.zza(setUnmodifiableSet).zzd();
        zzc = new zzqy();
    }

    public /* synthetic */ zzrb(String str, String str2, boolean z, zzpu zzpuVar, Level level, Set set, zzqh zzqhVar, zzra zzraVar) {
        super(str2);
        if (str2.length() > 23) {
            int i = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char cCharAt = str2.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i = length;
                    break;
                }
            }
            str2 = str2.substring(i + 1);
        }
        String strConcat = "".concat(str2);
        this.zzd = strConcat.substring(0, Math.min(strConcat.length(), 23));
        this.zze = zzpuVar;
        this.zzf = level;
        this.zzg = set;
        this.zzh = zzqhVar;
    }

    public static zzqy zzc() {
        return zzc;
    }
}
