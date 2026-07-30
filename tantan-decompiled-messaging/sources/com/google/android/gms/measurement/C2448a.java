package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Map;
import p149l.e0y0;

/* JADX INFO: renamed from: com.google.android.gms.measurement.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2448a extends AppMeasurement.AbstractC2447a {

    /* JADX INFO: renamed from: a */
    public final e0y0 f10440a;

    public C2448a(e0y0 e0y0Var) {
        super();
        Preconditions.checkNotNull(e0y0Var);
        this.f10440a = e0y0Var;
    }

    @Override // p149l.e0y0
    public final int zza(String str) {
        return this.f10440a.zza(str);
    }

    @Override // p149l.e0y0
    public final void zzb(String str) {
        this.f10440a.zzb(str);
    }

    @Override // p149l.e0y0
    public final void zzc(String str) {
        this.f10440a.zzc(str);
    }

    @Override // p149l.e0y0
    public final long zzf() {
        return this.f10440a.zzf();
    }

    @Override // p149l.e0y0
    public final String zzg() {
        return this.f10440a.zzg();
    }

    @Override // p149l.e0y0
    public final String zzh() {
        return this.f10440a.zzh();
    }

    @Override // p149l.e0y0
    public final String zzi() {
        return this.f10440a.zzi();
    }

    @Override // p149l.e0y0
    public final String zzj() {
        return this.f10440a.zzj();
    }

    @Override // p149l.e0y0
    public final void zzb(String str, String str2, Bundle bundle) {
        this.f10440a.zzb(str, str2, bundle);
    }

    @Override // p149l.e0y0
    public final List<Bundle> zza(String str, String str2) {
        return this.f10440a.zza(str, str2);
    }

    @Override // p149l.e0y0
    public final Map<String, Object> zza(String str, String str2, boolean z) {
        return this.f10440a.zza(str, str2, z);
    }

    @Override // p149l.e0y0
    public final void zza(String str, String str2, Bundle bundle) {
        this.f10440a.zza(str, str2, bundle);
    }

    @Override // p149l.e0y0
    public final void zza(Bundle bundle) {
        this.f10440a.zza(bundle);
    }
}
