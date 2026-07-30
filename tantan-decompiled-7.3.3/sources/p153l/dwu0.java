package p153l;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbze;

/* JADX INFO: loaded from: classes6.dex */
public final class dwu0 implements x9u0, k8u0, s6u0 {

    /* JADX INFO: renamed from: a */
    public final swu0 f91044a;

    /* JADX INFO: renamed from: b */
    public final cxu0 f91045b;

    public dwu0(swu0 swu0Var, cxu0 cxu0Var) {
        this.f91044a = swu0Var;
        this.f91045b = cxu0Var;
    }

    @Override // p153l.x9u0
    /* JADX INFO: renamed from: A */
    public final void mo107082A(b7w0 b7w0Var) {
        this.f91044a.m188364b(b7w0Var);
    }

    @Override // p153l.s6u0
    /* JADX INFO: renamed from: u */
    public final void mo103145u(zze zzeVar) {
        this.f91044a.m188363a().put("action", "ftl");
        this.f91044a.m188363a().put("ftl", String.valueOf(zzeVar.zza));
        this.f91044a.m188363a().put("ed", zzeVar.zzc);
        this.f91045b.m128028f(this.f91044a.m188363a());
    }

    @Override // p153l.x9u0
    /* JADX INFO: renamed from: x */
    public final void mo107088x(zzbze zzbzeVar) {
        this.f91044a.m188365c(zzbzeVar.zza);
    }

    @Override // p153l.k8u0
    public final void zzr() {
        this.f91044a.m188363a().put("action", "loaded");
        this.f91045b.m128028f(this.f91044a.m188363a());
    }
}
