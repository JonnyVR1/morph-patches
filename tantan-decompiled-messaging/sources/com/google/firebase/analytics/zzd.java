package com.google.firebase.analytics;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import p149l.e0y0;
import p149l.nrx0;
import p149l.srx0;
import p149l.tpu0;

/* JADX INFO: loaded from: classes7.dex */
final class zzd implements e0y0 {
    private final /* synthetic */ tpu0 zza;

    public zzd(tpu0 tpu0Var) {
        this.zza = tpu0Var;
    }

    @Override // p149l.e0y0
    public final int zza(String str) {
        return this.zza.m190041a(str);
    }

    @Override // p149l.e0y0
    public final void zzb(String str) {
        this.zza.m190024H(str);
    }

    @Override // p149l.e0y0
    public final void zzc(String str) {
        this.zza.m190030O(str);
    }

    @Override // p149l.e0y0
    public final long zzf() {
        return this.zza.m190043b();
    }

    @Override // p149l.e0y0
    @Nullable
    public final String zzg() {
        return this.zza.m190036V();
    }

    @Override // p149l.e0y0
    @Nullable
    public final String zzh() {
        return this.zza.m190037W();
    }

    @Override // p149l.e0y0
    @Nullable
    public final String zzi() {
        return this.zza.m190038X();
    }

    @Override // p149l.e0y0
    @Nullable
    public final String zzj() {
        return this.zza.m190039Y();
    }

    @Override // p149l.e0y0
    public final void zzb(String str, String str2, Bundle bundle) {
        this.zza.m190026J(str, str2, bundle);
    }

    @Nullable
    public final Object zza(int i) {
        return this.zza.m190045d(i);
    }

    public final void zzb(nrx0 nrx0Var) {
        this.zza.m190027K(nrx0Var);
    }

    @Override // p149l.e0y0
    public final List<Bundle> zza(@Nullable String str, @Nullable String str2) {
        return this.zza.m190046e(str, str2);
    }

    @Override // p149l.e0y0
    public final Map<String, Object> zza(@Nullable String str, @Nullable String str2, boolean z) {
        return this.zza.m190047f(str, str2, z);
    }

    @Override // p149l.e0y0
    public final void zza(String str, @Nullable String str2, @Nullable Bundle bundle) {
        this.zza.m190057s(str, str2, bundle);
    }

    public final void zza(String str, String str2, Bundle bundle, long j) {
        this.zza.m190058t(str, str2, bundle, j);
    }

    public final void zza(nrx0 nrx0Var) {
        this.zza.m190019A(nrx0Var);
    }

    @Override // p149l.e0y0
    public final void zza(Bundle bundle) {
        this.zza.m190053o(bundle);
    }

    public final void zza(srx0 srx0Var) {
        this.zza.m190020B(srx0Var);
    }
}
