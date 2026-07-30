package p153l;

import com.google.android.gms.internal.measurement.C2337d;
import com.google.android.gms.internal.measurement.C2339e;
import com.google.android.gms.internal.measurement.C2342f0;

/* JADX INFO: loaded from: classes6.dex */
public final class f6z0 extends qar0 {

    /* JADX INFO: renamed from: g */
    public C2339e f97464g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ pwy0 f97465h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6z0(pwy0 pwy0Var, String str, int i, C2339e c2339e) {
        super(str, i);
        this.f97465h = pwy0Var;
        this.f97464g = c2339e;
    }

    @Override // p153l.qar0
    /* JADX INFO: renamed from: a */
    public final int mo102380a() {
        return this.f97464g.m14193h();
    }

    @Override // p153l.qar0
    /* JADX INFO: renamed from: i */
    public final boolean mo102381i() {
        return false;
    }

    @Override // p153l.qar0
    /* JADX INFO: renamed from: j */
    public final boolean mo102382j() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final boolean m124336k(Long l2, Long l3, C2342f0 c2342f0, boolean z) {
        Object[] objArr = rly0.m182036a() && this.f97465h.mo15139a().m98421B(this.f156409a, whs0.f189286o0);
        boolean zM14188I = this.f97464g.m14188I();
        boolean zM14189K = this.f97464g.m14189K();
        boolean zM14190L = this.f97464g.m14190L();
        Object[] objArr2 = zM14188I || zM14189K || zM14190L;
        Boolean boolM175990d = null;
        boolM175990d = null;
        boolM175990d = null;
        boolM175990d = null;
        boolM175990d = null;
        if (z && objArr2 != true) {
            this.f97465h.zzj().m114562E().m153302c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f156410b), this.f97464g.m14191M() ? Integer.valueOf(this.f97464g.m14193h()) : null);
            return true;
        }
        C2337d c2337dM14186C = this.f97464g.m14186C();
        boolean zM14150K = c2337dM14186C.m14150K();
        if (c2342f0.m14224b0()) {
            if (c2337dM14186C.m14152M()) {
                boolM175990d = qar0.m175990d(qar0.m175989c(c2342f0.m14218N(), c2337dM14186C.m14147E()), zM14150K);
            } else {
                this.f97465h.zzj().m114563F().m153301b("No number filter for long property. property", this.f97465h.mo15141c().m208452g(c2342f0.m14220X()));
            }
        } else if (c2342f0.m14222Z()) {
            if (c2337dM14186C.m14152M()) {
                boolM175990d = qar0.m175990d(qar0.m175988b(c2342f0.m14216B(), c2337dM14186C.m14147E()), zM14150K);
            } else {
                this.f97465h.zzj().m114563F().m153301b("No number filter for double property. property", this.f97465h.mo15141c().m208452g(c2342f0.m14220X()));
            }
        } else if (!c2342f0.m14226d0()) {
            this.f97465h.zzj().m114563F().m153301b("User property has no value, property", this.f97465h.mo15141c().m208452g(c2342f0.m14220X()));
        } else if (c2337dM14186C.m14154T()) {
            boolM175990d = qar0.m175990d(qar0.m175993g(c2342f0.m14221Y(), c2337dM14186C.m14148G(), this.f97465h.zzj()), zM14150K);
        } else if (!c2337dM14186C.m14152M()) {
            this.f97465h.zzj().m114563F().m153301b("No string or number filter defined. property", this.f97465h.mo15141c().m208452g(c2342f0.m14220X()));
        } else if (vmy0.m201870a0(c2342f0.m14221Y())) {
            boolM175990d = qar0.m175990d(qar0.m175991e(c2342f0.m14221Y(), c2337dM14186C.m14147E()), zM14150K);
        } else {
            this.f97465h.zzj().m114563F().m153302c("Invalid user property value for Numeric number filter. property, value", this.f97465h.mo15141c().m208452g(c2342f0.m14220X()), c2342f0.m14221Y());
        }
        this.f97465h.zzj().m114562E().m153301b("Property filter result", boolM175990d == null ? "null" : boolM175990d);
        if (boolM175990d == null) {
            return false;
        }
        this.f156411c = Boolean.TRUE;
        if (zM14190L && !boolM175990d.booleanValue()) {
            return true;
        }
        if (!z || this.f97464g.m14188I()) {
            this.f156412d = boolM175990d;
        }
        if (boolM175990d.booleanValue() && objArr2 != false && c2342f0.m14225c0()) {
            long jM14219U = c2342f0.m14219U();
            if (l2 != null) {
                jM14219U = l2.longValue();
            }
            if (objArr != false && this.f97464g.m14188I() && !this.f97464g.m14189K() && l3 != null) {
                jM14219U = l3.longValue();
            }
            if (this.f97464g.m14189K()) {
                this.f156414f = Long.valueOf(jM14219U);
            } else {
                this.f156413e = Long.valueOf(jM14219U);
            }
        }
        return true;
    }
}
