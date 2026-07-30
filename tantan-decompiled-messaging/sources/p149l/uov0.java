package p149l;

import com.google.android.gms.internal.measurement.C2343r0;
import com.google.android.gms.internal.measurement.zzgd$zzd;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class uov0 {

    /* JADX INFO: renamed from: a */
    public final g2s0 f177541a;

    /* JADX INFO: renamed from: b */
    public final a9x0 f177542b;

    /* JADX INFO: renamed from: c */
    public final a9x0 f177543c;

    /* JADX INFO: renamed from: d */
    public final hzx0 f177544d;

    public uov0() {
        g2s0 g2s0Var = new g2s0();
        this.f177541a = g2s0Var;
        a9x0 a9x0Var = new a9x0(null, g2s0Var);
        this.f177543c = a9x0Var;
        this.f177542b = a9x0Var.m95463d();
        hzx0 hzx0Var = new hzx0();
        this.f177544d = hzx0Var;
        a9x0Var.m95467h("require", new jxy0(hzx0Var));
        hzx0Var.m133725b("internal.platform", new Callable() { // from class: l.jsu0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new lvy0();
            }
        });
        a9x0Var.m95467h("runtime.counter", new acr0(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)));
    }

    /* JADX INFO: renamed from: a */
    public final ymr0 m194567a(a9x0 a9x0Var, zzgd$zzd... zzgd_zzdArr) {
        ymr0 ymr0VarM14278a = ymr0.f199051w0;
        for (zzgd$zzd zzgd_zzd : zzgd_zzdArr) {
            ymr0VarM14278a = C2343r0.m14278a(zzgd_zzd);
            nhw0.m159465b(this.f177543c);
            if ((ymr0VarM14278a instanceof rqr0) || (ymr0VarM14278a instanceof jor0)) {
                ymr0VarM14278a = this.f177541a.m124174a(a9x0Var, ymr0VarM14278a);
            }
        }
        return ymr0VarM14278a;
    }

    /* JADX INFO: renamed from: b */
    public final void m194568b(String str, Callable<? extends ggr0> callable) {
        this.f177544d.m133725b(str, callable);
    }
}
