package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Map;
import p153l.k9y0;

/* JADX INFO: renamed from: com.google.android.gms.measurement.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2471a extends AppMeasurement.AbstractC2470a {

    /* JADX INFO: renamed from: a */
    public final k9y0 f10477a;

    public C2471a(k9y0 k9y0Var) {
        super();
        Preconditions.checkNotNull(k9y0Var);
        this.f10477a = k9y0Var;
    }

    @Override // p153l.k9y0
    public final int zza(String str) {
        return this.f10477a.zza(str);
    }

    @Override // p153l.k9y0
    public final void zzb(String str) {
        this.f10477a.zzb(str);
    }

    @Override // p153l.k9y0
    public final void zzc(String str) {
        this.f10477a.zzc(str);
    }

    @Override // p153l.k9y0
    public final long zzf() {
        return this.f10477a.zzf();
    }

    @Override // p153l.k9y0
    public final String zzg() {
        return this.f10477a.zzg();
    }

    @Override // p153l.k9y0
    public final String zzh() {
        return this.f10477a.zzh();
    }

    @Override // p153l.k9y0
    public final String zzi() {
        return this.f10477a.zzi();
    }

    @Override // p153l.k9y0
    public final String zzj() {
        return this.f10477a.zzj();
    }

    @Override // p153l.k9y0
    public final void zzb(String str, String str2, Bundle bundle) {
        this.f10477a.zzb(str, str2, bundle);
    }

    @Override // p153l.k9y0
    public final List<Bundle> zza(String str, String str2) {
        return this.f10477a.zza(str, str2);
    }

    @Override // p153l.k9y0
    public final Map<String, Object> zza(String str, String str2, boolean z) {
        return this.f10477a.zza(str, str2, z);
    }

    @Override // p153l.k9y0
    public final void zza(String str, String str2, Bundle bundle) {
        this.f10477a.zza(str, str2, bundle);
    }

    @Override // p153l.k9y0
    public final void zza(Bundle bundle) {
        this.f10477a.zza(bundle);
    }
}
