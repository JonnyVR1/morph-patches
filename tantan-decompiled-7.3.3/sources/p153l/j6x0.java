package p153l;

import com.google.android.gms.internal.ads.zzgpl;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class j6x0 {

    /* JADX INFO: renamed from: b */
    public static final j6x0 f118612b = (j6x0) zzgpl.zza(new t7x0() { // from class: l.h6x0
        @Override // p153l.t7x0
        public final Object zza() throws GeneralSecurityException {
            j6x0 j6x0Var = new j6x0();
            j6x0Var.m143732h(new k5x0(q5x0.class, c7x0.class, new l5x0() { // from class: l.i6x0
                @Override // p153l.l5x0
                /* JADX INFO: renamed from: a */
                public final l7x0 mo118767a(xww0 xww0Var, ayw0 ayw0Var) {
                    return ((q5x0) xww0Var).m175535a(ayw0Var);
                }
            }));
            return j6x0Var;
        }
    });

    /* JADX INFO: renamed from: a */
    public final AtomicReference f118613a = new AtomicReference(new s7x0(new m7x0(), null));

    /* JADX INFO: renamed from: d */
    public static j6x0 m143725d() {
        return f118612b;
    }

    /* JADX INFO: renamed from: a */
    public final xww0 m143726a(l7x0 l7x0Var, ayw0 ayw0Var) throws GeneralSecurityException {
        return ((s7x0) this.f118613a.get()).m185044a(l7x0Var, ayw0Var);
    }

    /* JADX INFO: renamed from: b */
    public final xww0 m143727b(c7x0 c7x0Var, ayw0 ayw0Var) throws GeneralSecurityException {
        return !((s7x0) this.f118613a.get()).m185048i(c7x0Var) ? new q5x0(c7x0Var, ayw0Var) : m143726a(c7x0Var, ayw0Var);
    }

    /* JADX INFO: renamed from: c */
    public final lxw0 m143728c(l7x0 l7x0Var) throws GeneralSecurityException {
        return ((s7x0) this.f118613a.get()).m185045b(l7x0Var);
    }

    /* JADX INFO: renamed from: e */
    public final l7x0 m143729e(xww0 xww0Var, Class cls, ayw0 ayw0Var) throws GeneralSecurityException {
        return ((s7x0) this.f118613a.get()).m185046c(xww0Var, cls, ayw0Var);
    }

    /* JADX INFO: renamed from: f */
    public final l7x0 m143730f(lxw0 lxw0Var, Class cls) throws GeneralSecurityException {
        return ((s7x0) this.f118613a.get()).m185047d(lxw0Var, cls);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m143731g(j5x0 j5x0Var) throws GeneralSecurityException {
        m7x0 m7x0Var = new m7x0((s7x0) this.f118613a.get());
        m7x0Var.m157339a(j5x0Var);
        this.f118613a.set(new s7x0(m7x0Var, null));
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m143732h(n5x0 n5x0Var) throws GeneralSecurityException {
        m7x0 m7x0Var = new m7x0((s7x0) this.f118613a.get());
        m7x0Var.m157340b(n5x0Var);
        this.f118613a.set(new s7x0(m7x0Var, null));
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m143733i(n6x0 n6x0Var) throws GeneralSecurityException {
        m7x0 m7x0Var = new m7x0((s7x0) this.f118613a.get());
        m7x0Var.m157341c(n6x0Var);
        this.f118613a.set(new s7x0(m7x0Var, null));
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m143734j(r6x0 r6x0Var) throws GeneralSecurityException {
        m7x0 m7x0Var = new m7x0((s7x0) this.f118613a.get());
        m7x0Var.m157342d(r6x0Var);
        this.f118613a.set(new s7x0(m7x0Var, null));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m143735k(l7x0 l7x0Var) {
        return ((s7x0) this.f118613a.get()).m185049j(l7x0Var);
    }
}
