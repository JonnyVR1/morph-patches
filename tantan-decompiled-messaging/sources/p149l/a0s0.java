package p149l;

import com.google.android.gms.internal.measurement.C2327j0;
import com.google.android.gms.internal.measurement.C2329k0;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzgd$zzd;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class a0s0 {

    /* JADX INFO: renamed from: a */
    public final uov0 f67066a;

    /* JADX INFO: renamed from: b */
    public a9x0 f67067b;

    /* JADX INFO: renamed from: c */
    public m4r0 f67068c;

    /* JADX INFO: renamed from: d */
    public final t1r0 f67069d;

    public a0s0(uov0 uov0Var) {
        this.f67066a = uov0Var;
        this.f67067b = uov0Var.f177542b.m95463d();
        this.f67068c = new m4r0();
        this.f67069d = new t1r0();
        uov0Var.m194568b("internal.registerCallback", new Callable() { // from class: l.j0r0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f115709a.m94481e();
            }
        });
        uov0Var.m194568b("internal.eventLogger", new Callable() { // from class: l.gvt0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new cux0(this.f104606a.f67068c);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final m4r0 m94477a() {
        return this.f67068c;
    }

    /* JADX INFO: renamed from: b */
    public final void m94478b(C2329k0 c2329k0) throws zzc {
        ggr0 ggr0Var;
        try {
            this.f67067b = this.f67066a.f177542b.m95463d();
            if (this.f67066a.m194567a(this.f67067b, (zzgd$zzd[]) c2329k0.m14238D().toArray(new zzgd$zzd[0])) instanceof ldr0) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C2327j0 c2327j0 : c2329k0.m14237B().m14202D()) {
                List<zzgd$zzd> listM14234D = c2327j0.m14234D();
                String strM14233C = c2327j0.m14233C();
                Iterator<zzgd$zzd> it = listM14234D.iterator();
                while (it.hasNext()) {
                    ymr0 ymr0VarM194567a = this.f67066a.m194567a(this.f67067b, it.next());
                    if (!(ymr0VarM194567a instanceof ulr0)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    a9x0 a9x0Var = this.f67067b;
                    if (a9x0Var.m95466g(strM14233C)) {
                        ymr0 ymr0VarM95460a = a9x0Var.m95460a(strM14233C);
                        if (!(ymr0VarM95460a instanceof ggr0)) {
                            throw new IllegalStateException("Invalid function name: " + strM14233C);
                        }
                        ggr0Var = (ggr0) ymr0VarM95460a;
                    } else {
                        ggr0Var = null;
                    }
                    if (ggr0Var == null) {
                        throw new IllegalStateException("Rule function is undefined: " + strM14233C);
                    }
                    ggr0Var.mo108642d(this.f67067b, Collections.singletonList(ymr0VarM194567a));
                }
            }
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m94479c(String str, Callable<? extends ggr0> callable) {
        this.f67066a.m194568b(str, callable);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m94480d(y5r0 y5r0Var) throws zzc {
        try {
            this.f67068c.m153093c(y5r0Var);
            this.f67066a.f177543c.m95467h("runtime.counter", new acr0(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)));
            this.f67069d.m186919c(this.f67067b.m95463d(), this.f67068c);
            return m94483g() || m94482f();
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ggr0 m94481e() throws Exception {
        return new csy0(this.f67069d);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m94482f() {
        return !this.f67068c.m153096f().isEmpty();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m94483g() {
        return !this.f67068c.m153094d().equals(this.f67068c.m153091a());
    }

    public a0s0() {
        this(new uov0());
    }
}
