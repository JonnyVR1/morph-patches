package p153l;

import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class sev0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tev0 f167658a;

    public sev0(tev0 tev0Var) {
        this.f167658a = tev0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        zze zzeVarM218166a = this.f167658a.f173898a.mo121817d().m218166a(th);
        this.f167658a.f173901d.mo103145u(zzeVarM218166a);
        q8w0.m175828b(zzeVarM218166a.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // p153l.lvw0
    public final /* synthetic */ void zzb(Object obj) {
        ((uwt0) obj).mo140700c();
    }
}
