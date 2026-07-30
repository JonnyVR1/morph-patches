package p153l;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class dcw0 {

    /* JADX INFO: renamed from: a */
    public final Object f87832a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f87833b;

    /* JADX INFO: renamed from: c */
    public final hpr f87834c;

    /* JADX INFO: renamed from: d */
    public final List f87835d;

    /* JADX INFO: renamed from: e */
    public final hpr f87836e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ecw0 f87837f;

    public dcw0(ecw0 ecw0Var, Object obj, String str, hpr hprVar, List list, hpr hprVar2) {
        this.f87837f = ecw0Var;
        this.f87832a = obj;
        this.f87833b = str;
        this.f87834c = hprVar;
        this.f87835d = list;
        this.f87836e = hprVar2;
    }

    /* JADX INFO: renamed from: a */
    public final mbw0 m115303a() {
        Object obj = this.f87832a;
        String strMo120410f = this.f87833b;
        if (strMo120410f == null) {
            strMo120410f = this.f87837f.mo120410f(obj);
        }
        final mbw0 mbw0Var = new mbw0(obj, strMo120410f, this.f87836e);
        this.f87837f.f93114c.mo125071S(mbw0Var);
        hpr hprVar = this.f87834c;
        Runnable runnable = new Runnable() { // from class: l.acw0
            @Override // java.lang.Runnable
            public final void run() {
                this.f69765a.f87837f.f93114c.mo125070P(mbw0Var);
            }
        };
        xvw0 xvw0Var = oct0.f146738f;
        hprVar.addListener(runnable, xvw0Var);
        pvw0.m173991r(mbw0Var, new bcw0(this, mbw0Var), xvw0Var);
        return mbw0Var;
    }

    /* JADX INFO: renamed from: b */
    public final dcw0 m115304b(Object obj) {
        return this.f87837f.m120409b(obj, m115303a());
    }

    /* JADX INFO: renamed from: c */
    public final dcw0 m115305c(Class cls, xuw0 xuw0Var) {
        return new dcw0(this.f87837f, this.f87832a, this.f87833b, this.f87834c, this.f87835d, pvw0.m173979f(this.f87836e, cls, xuw0Var, this.f87837f.f93112a));
    }

    /* JADX INFO: renamed from: d */
    public final dcw0 m115306d(final hpr hprVar) {
        return m115309g(new xuw0() { // from class: l.ubw0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return hprVar;
            }
        }, oct0.f146738f);
    }

    /* JADX INFO: renamed from: e */
    public final dcw0 m115307e(final kbw0 kbw0Var) {
        return m115308f(new xuw0() { // from class: l.tbw0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return pvw0.m173981h(kbw0Var.zza(obj));
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final dcw0 m115308f(xuw0 xuw0Var) {
        return m115309g(xuw0Var, this.f87837f.f93112a);
    }

    /* JADX INFO: renamed from: g */
    public final dcw0 m115309g(xuw0 xuw0Var, Executor executor) {
        return new dcw0(this.f87837f, this.f87832a, this.f87833b, this.f87834c, this.f87835d, pvw0.m173987n(this.f87836e, xuw0Var, executor));
    }

    /* JADX INFO: renamed from: h */
    public final dcw0 m115310h(String str) {
        return new dcw0(this.f87837f, this.f87832a, str, this.f87834c, this.f87835d, this.f87836e);
    }

    /* JADX INFO: renamed from: i */
    public final dcw0 m115311i(long j, TimeUnit timeUnit) {
        return new dcw0(this.f87837f, this.f87832a, this.f87833b, this.f87834c, this.f87835d, pvw0.m173988o(this.f87836e, j, timeUnit, this.f87837f.f93113b));
    }
}
