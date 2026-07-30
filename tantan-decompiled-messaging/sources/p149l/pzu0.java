package p149l;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbze;

/* JADX INFO: loaded from: classes6.dex */
public final class pzu0 implements r0u0, ezt0, mxt0 {

    /* JADX INFO: renamed from: a */
    public final o3w0 f151974a;

    /* JADX INFO: renamed from: b */
    public final p3w0 f151975b;

    /* JADX INFO: renamed from: c */
    public final c2t0 f151976c;

    public pzu0(o3w0 o3w0Var, p3w0 p3w0Var, c2t0 c2t0Var) {
        this.f151974a = o3w0Var;
        this.f151975b = p3w0Var;
        this.f151976c = c2t0Var;
    }

    @Override // p149l.r0u0
    /* JADX INFO: renamed from: A */
    public final void mo97687A(vxv0 vxv0Var) {
        this.f151974a.m162496h(vxv0Var, this.f151976c);
    }

    @Override // p149l.mxt0
    /* JADX INFO: renamed from: u */
    public final void mo97693u(zze zzeVar) {
        o3w0 o3w0Var = this.f151974a;
        o3w0Var.m162491a("action", "ftl");
        o3w0Var.m162491a("ftl", String.valueOf(zzeVar.zza));
        o3w0Var.m162491a("ed", zzeVar.zzc);
        this.f151975b.mo124429a(this.f151974a);
    }

    @Override // p149l.r0u0
    /* JADX INFO: renamed from: x */
    public final void mo97694x(zzbze zzbzeVar) {
        this.f151974a.m162497i(zzbzeVar.zza);
    }

    @Override // p149l.ezt0
    public final void zzr() {
        o3w0 o3w0Var = this.f151974a;
        o3w0Var.m162491a("action", "loaded");
        this.f151975b.mo124429a(o3w0Var);
    }
}
