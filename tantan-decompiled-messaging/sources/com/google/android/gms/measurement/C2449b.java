package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C2458g;
import java.util.List;
import java.util.Map;
import p149l.ujx0;

/* JADX INFO: renamed from: com.google.android.gms.measurement.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2449b extends AppMeasurement.AbstractC2447a {

    /* JADX INFO: renamed from: a */
    public final ujx0 f10441a;

    /* JADX INFO: renamed from: b */
    public final C2458g f10442b;

    public C2449b(@NonNull ujx0 ujx0Var) {
        super();
        Preconditions.checkNotNull(ujx0Var);
        this.f10441a = ujx0Var;
        this.f10442b = ujx0Var.m194102C();
    }

    @Override // p149l.e0y0
    public final void zza(String str, String str2, Bundle bundle) {
        this.f10441a.m194102C().m15202Y(str, str2, bundle);
    }

    @Override // p149l.e0y0
    public final void zzb(String str) {
        this.f10441a.m194127t().m128972r(str, this.f10441a.zzb().elapsedRealtime());
    }

    @Override // p149l.e0y0
    public final void zzc(String str) {
        this.f10441a.m194127t().m128974w(str, this.f10441a.zzb().elapsedRealtime());
    }

    @Override // p149l.e0y0
    public final long zzf() {
        return this.f10441a.m194106G().m101469L0();
    }

    @Override // p149l.e0y0
    public final String zzg() {
        return this.f10442b.m15219p0();
    }

    @Override // p149l.e0y0
    public final String zzh() {
        return this.f10442b.m15220q0();
    }

    @Override // p149l.e0y0
    public final String zzi() {
        return this.f10442b.m15221r0();
    }

    @Override // p149l.e0y0
    public final String zzj() {
        return this.f10442b.m15219p0();
    }

    @Override // p149l.e0y0
    public final List<Bundle> zza(String str, String str2) {
        return this.f10442b.m15164A(str, str2);
    }

    @Override // p149l.e0y0
    public final Map<String, Object> zza(String str, String str2, boolean z) {
        return this.f10442b.m15166B(str, str2, z);
    }

    @Override // p149l.e0y0
    public final int zza(String str) {
        return C2458g.m15162y(str);
    }

    @Override // p149l.e0y0
    public final void zza(Bundle bundle) {
        this.f10442b.m15178H0(bundle);
    }

    @Override // p149l.e0y0
    public final void zzb(String str, String str2, Bundle bundle) {
        this.f10442b.m15186N0(str, str2, bundle);
    }
}
