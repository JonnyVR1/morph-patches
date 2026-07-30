package p149l;

import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class m5v0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ n5v0 f131425a;

    public m5v0(n5v0 n5v0Var) {
        this.f131425a = n5v0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        zze zzeVarM190437a = this.f131425a.f137249a.mo189931d().m190437a(th);
        this.f131425a.f137252d.mo97693u(zzeVarM190437a);
        kzv0.m147957b(zzeVarM190437a.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // p149l.fmw0
    public final /* synthetic */ void zzb(Object obj) {
        ((ont0) obj).mo106179c();
    }
}
