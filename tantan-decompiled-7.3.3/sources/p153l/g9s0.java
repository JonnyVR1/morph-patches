package p153l;

import com.google.android.gms.internal.measurement.C2350j0;
import com.google.android.gms.internal.measurement.C2352k0;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzgd$zzd;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class g9s0 {

    /* JADX INFO: renamed from: a */
    public final ayv0 f102880a;

    /* JADX INFO: renamed from: b */
    public gix0 f102881b;

    /* JADX INFO: renamed from: c */
    public sdr0 f102882c;

    /* JADX INFO: renamed from: d */
    public final zar0 f102883d;

    public g9s0(ayv0 ayv0Var) {
        this.f102880a = ayv0Var;
        this.f102881b = ayv0Var.f74019b.m130396d();
        this.f102882c = new sdr0();
        this.f102883d = new zar0();
        ayv0Var.m100927b("internal.registerCallback", new Callable() { // from class: l.p9r0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f151178a.m129608e();
            }
        });
        ayv0Var.m100927b("internal.eventLogger", new Callable() { // from class: l.m4u0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new i3y0(this.f134834a.f102882c);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final sdr0 m129604a() {
        return this.f102882c;
    }

    /* JADX INFO: renamed from: b */
    public final void m129605b(C2352k0 c2352k0) throws zzc {
        mpr0 mpr0Var;
        try {
            this.f102881b = this.f102880a.f74019b.m130396d();
            if (this.f102880a.m100926a(this.f102881b, (zzgd$zzd[]) c2352k0.m14292D().toArray(new zzgd$zzd[0])) instanceof rmr0) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C2350j0 c2350j0 : c2352k0.m14291B().m14256D()) {
                List<zzgd$zzd> listM14288D = c2350j0.m14288D();
                String strM14287C = c2350j0.m14287C();
                Iterator<zzgd$zzd> it = listM14288D.iterator();
                while (it.hasNext()) {
                    ewr0 ewr0VarM100926a = this.f102880a.m100926a(this.f102881b, it.next());
                    if (!(ewr0VarM100926a instanceof avr0)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    gix0 gix0Var = this.f102881b;
                    if (gix0Var.m130399g(strM14287C)) {
                        ewr0 ewr0VarM130393a = gix0Var.m130393a(strM14287C);
                        if (!(ewr0VarM130393a instanceof mpr0)) {
                            throw new IllegalStateException("Invalid function name: " + strM14287C);
                        }
                        mpr0Var = (mpr0) ewr0VarM130393a;
                    } else {
                        mpr0Var = null;
                    }
                    if (mpr0Var == null) {
                        throw new IllegalStateException("Rule function is undefined: " + strM14287C);
                    }
                    mpr0Var.mo107102d(this.f102881b, Collections.singletonList(ewr0VarM100926a));
                }
            }
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m129606c(String str, Callable<? extends mpr0> callable) {
        this.f102880a.m100927b(str, callable);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m129607d(efr0 efr0Var) throws zzc {
        try {
            this.f102882c.m185505c(efr0Var);
            this.f102880a.f74020c.m130400h("runtime.counter", new glr0(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)));
            this.f102883d.m219135c(this.f102881b.m130396d(), this.f102882c);
            return m129610g() || m129609f();
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ mpr0 m129608e() throws Exception {
        return new i1z0(this.f102883d);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m129609f() {
        return !this.f102882c.m185508f().isEmpty();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m129610g() {
        return !this.f102882c.m185506d().equals(this.f102882c.m185503a());
    }

    public g9s0() {
        this(new ayv0());
    }
}
