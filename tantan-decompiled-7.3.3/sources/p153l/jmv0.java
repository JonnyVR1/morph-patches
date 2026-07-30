package p153l;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class jmv0 {

    /* JADX INFO: renamed from: a */
    public final fmu0 f121710a;

    /* JADX INFO: renamed from: b */
    public final wlv0 f121711b;

    /* JADX INFO: renamed from: c */
    public final s6u0 f121712c;

    public jmv0(fmu0 fmu0Var, vcw0 vcw0Var) {
        this.f121710a = fmu0Var;
        final wlv0 wlv0Var = new wlv0(vcw0Var);
        this.f121711b = wlv0Var;
        final xss0 xss0VarM126331g = fmu0Var.m126331g();
        this.f121712c = new s6u0() { // from class: l.imv0
            @Override // p153l.s6u0
            /* JADX INFO: renamed from: u */
            public final void mo103145u(zze zzeVar) {
                wlv0Var.mo103145u(zzeVar);
                xss0 xss0Var = xss0VarM126331g;
                if (xss0Var != null) {
                    try {
                        xss0Var.mo202664f(zzeVar);
                    } catch (RemoteException e) {
                        dct0.m115300i("#007 Could not call remote method.", e);
                    }
                }
                if (xss0Var != null) {
                    try {
                        xss0Var.zze(zzeVar.zza);
                    } catch (RemoteException e2) {
                        dct0.m115300i("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public final s6u0 m146171a() {
        return this.f121712c;
    }

    /* JADX INFO: renamed from: b */
    public final k8u0 m146172b() {
        return this.f121711b;
    }

    /* JADX INFO: renamed from: c */
    public final lju0 m146173c() {
        return new lju0(this.f121710a, this.f121711b.m207080z());
    }

    /* JADX INFO: renamed from: d */
    public final wlv0 m146174d() {
        return this.f121711b;
    }

    /* JADX INFO: renamed from: e */
    public final void m146175e(xhs0 xhs0Var) {
        this.f121711b.m207075D(xhs0Var);
    }
}
