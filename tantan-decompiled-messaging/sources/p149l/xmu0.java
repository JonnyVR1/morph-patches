package p149l;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbze;

/* JADX INFO: loaded from: classes6.dex */
public final class xmu0 implements r0u0, ezt0, mxt0 {

    /* JADX INFO: renamed from: a */
    public final mnu0 f193579a;

    /* JADX INFO: renamed from: b */
    public final wnu0 f193580b;

    public xmu0(mnu0 mnu0Var, wnu0 wnu0Var) {
        this.f193579a = mnu0Var;
        this.f193580b = wnu0Var;
    }

    @Override // p149l.r0u0
    /* JADX INFO: renamed from: A */
    public final void mo97687A(vxv0 vxv0Var) {
        this.f193579a.m155567b(vxv0Var);
    }

    @Override // p149l.mxt0
    /* JADX INFO: renamed from: u */
    public final void mo97693u(zze zzeVar) {
        this.f193579a.m155566a().put("action", "ftl");
        this.f193579a.m155566a().put("ftl", String.valueOf(zzeVar.zza));
        this.f193579a.m155566a().put("ed", zzeVar.zzc);
        this.f193580b.m219493f(this.f193579a.m155566a());
    }

    @Override // p149l.r0u0
    /* JADX INFO: renamed from: x */
    public final void mo97694x(zzbze zzbzeVar) {
        this.f193579a.m155568c(zzbzeVar.zza);
    }

    @Override // p149l.ezt0
    public final void zzr() {
        this.f193579a.m155566a().put("action", "loaded");
        this.f193580b.m219493f(this.f193579a.m155566a());
    }
}
