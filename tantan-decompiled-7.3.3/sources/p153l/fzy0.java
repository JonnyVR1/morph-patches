package p153l;

import android.util.Pair;
import androidx.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class fzy0 extends r2z0 {

    /* JADX INFO: renamed from: l */
    public final boolean f101562l;

    /* JADX INFO: renamed from: m */
    public final wyt0 f101563m;

    /* JADX INFO: renamed from: n */
    public final hwt0 f101564n;

    /* JADX INFO: renamed from: o */
    public dzy0 f101565o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public czy0 f101566p;

    /* JADX INFO: renamed from: q */
    public boolean f101567q;

    /* JADX INFO: renamed from: r */
    public boolean f101568r;

    /* JADX INFO: renamed from: s */
    public boolean f101569s;

    public fzy0(mzy0 mzy0Var, boolean z) {
        boolean z2;
        super(mzy0Var);
        if (z) {
            mzy0Var.mo160935b();
            z2 = true;
        } else {
            z2 = false;
        }
        this.f101562l = z2;
        this.f101563m = new wyt0();
        this.f101564n = new hwt0();
        mzy0Var.mo160943y();
        this.f101565o = dzy0.m118768q(mzy0Var.mo128582d());
    }

    @Override // p153l.r2z0
    @Nullable
    /* JADX INFO: renamed from: F */
    public final kzy0 mo128351F(kzy0 kzy0Var) {
        Object obj = this.f101565o.f91394h;
        Object obj2 = kzy0Var.f129476a;
        if (obj != null && this.f101565o.f91394h.equals(obj2)) {
            obj2 = dzy0.f91392i;
        }
        return kzy0Var.m152239a(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    @Override // p153l.r2z0
    /* JADX INFO: renamed from: H */
    public final void mo128353H(d0u0 d0u0Var) {
        long j;
        kzy0 kzy0VarM152239a = null;
        if (this.f101568r) {
            this.f101565o = this.f101565o.m118771p(d0u0Var);
            czy0 czy0Var = this.f101566p;
            if (czy0Var != null) {
                m128358M(czy0Var.m113353h());
            }
        } else if (d0u0Var.m113469o()) {
            this.f101565o = this.f101569s ? this.f101565o.m118771p(d0u0Var) : dzy0.m118769r(d0u0Var, wyt0.f191680p, dzy0.f91392i);
        } else {
            d0u0Var.mo107663e(0, this.f101563m, 0L);
            Object obj = this.f101563m.f191691a;
            czy0 czy0Var2 = this.f101566p;
            if (czy0Var2 != null) {
                long jM113354i = czy0Var2.m113354i();
                this.f101565o.mo113468n(czy0Var2.f84507a.f129476a, this.f101564n);
                this.f101565o.mo107663e(0, this.f101563m, 0L);
                if (jM113354i != 0) {
                    j = jM113354i;
                } else {
                    j = 0;
                }
            } else {
                j = 0;
            }
            Pair pairM113466l = d0u0Var.m113466l(this.f101563m, this.f101564n, 0, j);
            Object obj2 = pairM113466l.first;
            long jLongValue = ((Long) pairM113466l.second).longValue();
            this.f101565o = this.f101569s ? this.f101565o.m118771p(d0u0Var) : dzy0.m118769r(d0u0Var, obj, obj2);
            czy0 czy0Var3 = this.f101566p;
            if (czy0Var3 != null) {
                m128358M(jLongValue);
                kzy0 kzy0Var = czy0Var3.f84507a;
                kzy0VarM152239a = kzy0Var.m152239a(m128357L(kzy0Var.f129476a));
            }
        }
        this.f101569s = true;
        this.f101568r = true;
        m193550w(this.f101565o);
        if (kzy0VarM152239a != null) {
            czy0 czy0Var4 = this.f101566p;
            czy0Var4.getClass();
            czy0Var4.m113355j(kzy0VarM152239a);
        }
    }

    @Override // p153l.r2z0
    /* JADX INFO: renamed from: I */
    public final void mo128354I() {
        if (this.f101562l) {
            return;
        }
        this.f101567q = true;
        m193632B(null, this.f160992k);
    }

    /* JADX INFO: renamed from: J */
    public final d0u0 m128355J() {
        return this.f101565o;
    }

    @Override // p153l.mzy0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final czy0 mo128359i(kzy0 kzy0Var, c6z0 c6z0Var, long j) {
        czy0 czy0Var = new czy0(kzy0Var, c6z0Var, j);
        czy0Var.m113358o(this.f160992k);
        if (this.f101568r) {
            czy0Var.m113355j(kzy0Var.m152239a(m128357L(kzy0Var.f129476a)));
            return czy0Var;
        }
        this.f101566p = czy0Var;
        if (!this.f101567q) {
            this.f101567q = true;
            m193632B(null, this.f160992k);
        }
        return czy0Var;
    }

    /* JADX INFO: renamed from: L */
    public final Object m128357L(Object obj) {
        return (this.f101565o.f91394h == null || !obj.equals(dzy0.f91392i)) ? obj : this.f101565o.f91394h;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* JADX INFO: renamed from: M */
    public final void m128358M(long j) {
        czy0 czy0Var = this.f101566p;
        int iMo113457a = this.f101565o.mo113457a(czy0Var.f84507a.f129476a);
        if (iMo113457a == -1) {
            return;
        }
        dzy0 dzy0Var = this.f101565o;
        hwt0 hwt0Var = this.f101564n;
        dzy0Var.mo107662d(iMo113457a, hwt0Var, false);
        long j2 = hwt0Var.f111931d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        czy0Var.m113356m(j);
    }

    @Override // p153l.r2z0, p153l.mzy0
    /* JADX INFO: renamed from: k */
    public final void mo128360k(izy0 izy0Var) {
        ((czy0) izy0Var).m113357n();
        if (izy0Var == this.f101566p) {
            this.f101566p = null;
        }
    }

    @Override // p153l.txy0, p153l.mzy0
    /* JADX INFO: renamed from: m */
    public final void mo128361m(trs0 trs0Var) {
        if (this.f101569s) {
            this.f101565o = this.f101565o.m118771p(new o2z0(this.f101565o.f202161f, trs0Var));
        } else {
            this.f101565o = dzy0.m118768q(trs0Var);
        }
        this.f160992k.mo128361m(trs0Var);
    }

    @Override // p153l.tyy0, p153l.txy0
    /* JADX INFO: renamed from: x */
    public final void mo128362x() {
        this.f101568r = false;
        this.f101567q = false;
        super.mo128362x();
    }

    @Override // p153l.tyy0, p153l.mzy0
    /* JADX INFO: renamed from: G */
    public final void mo128352G() {
    }
}
