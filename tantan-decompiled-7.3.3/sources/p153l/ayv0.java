package p153l;

import com.google.android.gms.internal.measurement.C2366r0;
import com.google.android.gms.internal.measurement.zzgd$zzd;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class ayv0 {

    /* JADX INFO: renamed from: a */
    public final mbs0 f74018a;

    /* JADX INFO: renamed from: b */
    public final gix0 f74019b;

    /* JADX INFO: renamed from: c */
    public final gix0 f74020c;

    /* JADX INFO: renamed from: d */
    public final n8y0 f74021d;

    public ayv0() {
        mbs0 mbs0Var = new mbs0();
        this.f74018a = mbs0Var;
        gix0 gix0Var = new gix0(null, mbs0Var);
        this.f74020c = gix0Var;
        this.f74019b = gix0Var.m130396d();
        n8y0 n8y0Var = new n8y0();
        this.f74021d = n8y0Var;
        gix0Var.m130400h("require", new p6z0(n8y0Var));
        n8y0Var.m161948b("internal.platform", new Callable() { // from class: l.p1v0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new r4z0();
            }
        });
        gix0Var.m130400h("runtime.counter", new glr0(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)));
    }

    /* JADX INFO: renamed from: a */
    public final ewr0 m100926a(gix0 gix0Var, zzgd$zzd... zzgd_zzdArr) {
        ewr0 ewr0VarM14332a = ewr0.f96187w0;
        for (zzgd$zzd zzgd_zzd : zzgd_zzdArr) {
            ewr0VarM14332a = C2366r0.m14332a(zzgd_zzd);
            tqw0.m192368b(this.f74020c);
            if ((ewr0VarM14332a instanceof xzr0) || (ewr0VarM14332a instanceof pxr0)) {
                ewr0VarM14332a = this.f74018a.m157884a(gix0Var, ewr0VarM14332a);
            }
        }
        return ewr0VarM14332a;
    }

    /* JADX INFO: renamed from: b */
    public final void m100927b(String str, Callable<? extends mpr0> callable) {
        this.f74021d.m161948b(str, callable);
    }
}
