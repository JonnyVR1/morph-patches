package com.google.android.libraries.places.internal;

import com.clevertap.android.sdk.Constants;
import java.util.HashMap;
import java.util.Map;
import p153l.wg3;

/* JADX INFO: loaded from: classes7.dex */
public final class zzqc {
    private static final zzqg zza = new zzpz();
    private static final zzqf zzb = new zzqa();
    private final zzqg zze;
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzqf zzf = null;

    public final zzqc zza(zzqf zzqfVar) {
        this.zzf = zzqfVar;
        return this;
    }

    public final zzqh zzd() {
        return new zzqe(this, null);
    }

    public final void zzg(zzpr zzprVar) {
        zzrr.zza(zzprVar, Constants.KEY_KEY);
        if (!zzprVar.zzb()) {
            zzqg zzqgVar = zza;
            zzrr.zza(zzprVar, Constants.KEY_KEY);
            this.zzd.remove(zzprVar);
            this.zzc.put(zzprVar, zzqgVar);
            return;
        }
        zzqf zzqfVar = zzb;
        zzrr.zza(zzprVar, Constants.KEY_KEY);
        if (!zzprVar.zzb()) {
            wg3.m206174a("key must be repeating");
        } else {
            this.zzc.remove(zzprVar);
            this.zzd.put(zzprVar, zzqfVar);
        }
    }
}
