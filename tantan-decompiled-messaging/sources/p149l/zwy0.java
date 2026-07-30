package p149l;

import com.google.android.gms.internal.measurement.C2314d;
import com.google.android.gms.internal.measurement.C2316e;
import com.google.android.gms.internal.measurement.C2319f0;

/* JADX INFO: loaded from: classes6.dex */
public final class zwy0 extends k1r0 {

    /* JADX INFO: renamed from: g */
    public C2316e f205335g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ jny0 f205336h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwy0(jny0 jny0Var, String str, int i, C2316e c2316e) {
        super(str, i);
        this.f205336h = jny0Var;
        this.f205335g = c2316e;
    }

    @Override // p149l.k1r0
    /* JADX INFO: renamed from: a */
    public final int mo144228a() {
        return this.f205335g.m14139h();
    }

    @Override // p149l.k1r0
    /* JADX INFO: renamed from: i */
    public final boolean mo144229i() {
        return false;
    }

    @Override // p149l.k1r0
    /* JADX INFO: renamed from: j */
    public final boolean mo144230j() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final boolean m220742k(Long l2, Long l3, C2319f0 c2319f0, boolean z) {
        Object[] objArr = lcy0.m149371a() && this.f205336h.mo15085a().m192629B(this.f120642a, q8s0.f153310o0);
        boolean zM14134I = this.f205335g.m14134I();
        boolean zM14135K = this.f205335g.m14135K();
        boolean zM14136L = this.f205335g.m14136L();
        Object[] objArr2 = zM14134I || zM14135K || zM14136L;
        Boolean boolM144223d = null;
        boolM144223d = null;
        boolM144223d = null;
        boolM144223d = null;
        boolM144223d = null;
        if (z && objArr2 != true) {
            this.f205336h.zzj().m211416E().m123938c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f120643b), this.f205335g.m14137M() ? Integer.valueOf(this.f205335g.m14139h()) : null);
            return true;
        }
        C2314d c2314dM14132C = this.f205335g.m14132C();
        boolean zM14096K = c2314dM14132C.m14096K();
        if (c2319f0.m14170b0()) {
            if (c2314dM14132C.m14098M()) {
                boolM144223d = k1r0.m144223d(k1r0.m144222c(c2319f0.m14164N(), c2314dM14132C.m14093E()), zM14096K);
            } else {
                this.f205336h.zzj().m211417F().m123937b("No number filter for long property. property", this.f205336h.mo15087c().m175779g(c2319f0.m14166X()));
            }
        } else if (c2319f0.m14168Z()) {
            if (c2314dM14132C.m14098M()) {
                boolM144223d = k1r0.m144223d(k1r0.m144221b(c2319f0.m14162B(), c2314dM14132C.m14093E()), zM14096K);
            } else {
                this.f205336h.zzj().m211417F().m123937b("No number filter for double property. property", this.f205336h.mo15087c().m175779g(c2319f0.m14166X()));
            }
        } else if (!c2319f0.m14172d0()) {
            this.f205336h.zzj().m211417F().m123937b("User property has no value, property", this.f205336h.mo15087c().m175779g(c2319f0.m14166X()));
        } else if (c2314dM14132C.m14100T()) {
            boolM144223d = k1r0.m144223d(k1r0.m144226g(c2319f0.m14167Y(), c2314dM14132C.m14094G(), this.f205336h.zzj()), zM14096K);
        } else if (!c2314dM14132C.m14098M()) {
            this.f205336h.zzj().m211417F().m123937b("No string or number filter defined. property", this.f205336h.mo15087c().m175779g(c2319f0.m14166X()));
        } else if (pdy0.m168465a0(c2319f0.m14167Y())) {
            boolM144223d = k1r0.m144223d(k1r0.m144224e(c2319f0.m14167Y(), c2314dM14132C.m14093E()), zM14096K);
        } else {
            this.f205336h.zzj().m211417F().m123938c("Invalid user property value for Numeric number filter. property, value", this.f205336h.mo15087c().m175779g(c2319f0.m14166X()), c2319f0.m14167Y());
        }
        this.f205336h.zzj().m211416E().m123937b("Property filter result", boolM144223d == null ? "null" : boolM144223d);
        if (boolM144223d == null) {
            return false;
        }
        this.f120644c = Boolean.TRUE;
        if (zM14136L && !boolM144223d.booleanValue()) {
            return true;
        }
        if (!z || this.f205335g.m14134I()) {
            this.f120645d = boolM144223d;
        }
        if (boolM144223d.booleanValue() && objArr2 != false && c2319f0.m14171c0()) {
            long jM14165U = c2319f0.m14165U();
            if (l2 != null) {
                jM14165U = l2.longValue();
            }
            if (objArr != false && this.f205335g.m14134I() && !this.f205335g.m14135K() && l3 != null) {
                jM14165U = l3.longValue();
            }
            if (this.f205335g.m14135K()) {
                this.f120647f = Long.valueOf(jM14165U);
            } else {
                this.f120646e = Long.valueOf(jM14165U);
            }
        }
        return true;
    }
}
