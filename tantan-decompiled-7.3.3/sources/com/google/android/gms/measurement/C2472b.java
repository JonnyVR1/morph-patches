package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C2481g;
import java.util.List;
import java.util.Map;
import p153l.atx0;

/* JADX INFO: renamed from: com.google.android.gms.measurement.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2472b extends AppMeasurement.AbstractC2470a {

    /* JADX INFO: renamed from: a */
    public final atx0 f10478a;

    /* JADX INFO: renamed from: b */
    public final C2481g f10479b;

    public C2472b(@NonNull atx0 atx0Var) {
        super();
        Preconditions.checkNotNull(atx0Var);
        this.f10478a = atx0Var;
        this.f10479b = atx0Var.m100282C();
    }

    @Override // p153l.k9y0
    public final void zza(String str, String str2, Bundle bundle) {
        this.f10478a.m100282C().m15256Y(str, str2, bundle);
    }

    @Override // p153l.k9y0
    public final void zzb(String str) {
        this.f10478a.m100307t().m162041r(str, this.f10478a.zzb().elapsedRealtime());
    }

    @Override // p153l.k9y0
    public final void zzc(String str) {
        this.f10478a.m100307t().m162043w(str, this.f10478a.zzb().elapsedRealtime());
    }

    @Override // p153l.k9y0
    public final long zzf() {
        return this.f10478a.m100286G().m136336L0();
    }

    @Override // p153l.k9y0
    public final String zzg() {
        return this.f10479b.m15273p0();
    }

    @Override // p153l.k9y0
    public final String zzh() {
        return this.f10479b.m15274q0();
    }

    @Override // p153l.k9y0
    public final String zzi() {
        return this.f10479b.m15275r0();
    }

    @Override // p153l.k9y0
    public final String zzj() {
        return this.f10479b.m15273p0();
    }

    @Override // p153l.k9y0
    public final List<Bundle> zza(String str, String str2) {
        return this.f10479b.m15218A(str, str2);
    }

    @Override // p153l.k9y0
    public final Map<String, Object> zza(String str, String str2, boolean z) {
        return this.f10479b.m15220B(str, str2, z);
    }

    @Override // p153l.k9y0
    public final int zza(String str) {
        return C2481g.m15216y(str);
    }

    @Override // p153l.k9y0
    public final void zza(Bundle bundle) {
        this.f10479b.m15232H0(bundle);
    }

    @Override // p153l.k9y0
    public final void zzb(String str, String str2, Bundle bundle) {
        this.f10479b.m15240N0(str, str2, bundle);
    }
}
