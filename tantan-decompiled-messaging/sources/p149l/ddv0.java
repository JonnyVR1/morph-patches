package p149l;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class ddv0 {

    /* JADX INFO: renamed from: a */
    public final zcu0 f85677a;

    /* JADX INFO: renamed from: b */
    public final qcv0 f85678b;

    /* JADX INFO: renamed from: c */
    public final mxt0 f85679c;

    public ddv0(zcu0 zcu0Var, p3w0 p3w0Var) {
        this.f85677a = zcu0Var;
        final qcv0 qcv0Var = new qcv0(p3w0Var);
        this.f85678b = qcv0Var;
        final rjs0 rjs0VarM218108g = zcu0Var.m218108g();
        this.f85679c = new mxt0() { // from class: l.cdv0
            @Override // p149l.mxt0
            /* JADX INFO: renamed from: u */
            public final void mo97693u(zze zzeVar) {
                qcv0Var.mo97693u(zzeVar);
                rjs0 rjs0Var = rjs0VarM218108g;
                if (rjs0Var != null) {
                    try {
                        rjs0Var.mo169933f(zzeVar);
                    } catch (RemoteException e) {
                        x2t0.m206871i("#007 Could not call remote method.", e);
                    }
                }
                if (rjs0Var != null) {
                    try {
                        rjs0Var.zze(zzeVar.zza);
                    } catch (RemoteException e2) {
                        x2t0.m206871i("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public final mxt0 m111080a() {
        return this.f85679c;
    }

    /* JADX INFO: renamed from: b */
    public final ezt0 m111081b() {
        return this.f85678b;
    }

    /* JADX INFO: renamed from: c */
    public final fau0 m111082c() {
        return new fau0(this.f85677a, this.f85678b.m173933z());
    }

    /* JADX INFO: renamed from: d */
    public final qcv0 m111083d() {
        return this.f85678b;
    }

    /* JADX INFO: renamed from: e */
    public final void m111084e(r8s0 r8s0Var) {
        this.f85678b.m173928D(r8s0Var);
    }
}
