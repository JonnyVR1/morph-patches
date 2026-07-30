package p149l;

import android.util.Pair;
import androidx.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class zpy0 extends lty0 {

    /* JADX INFO: renamed from: l */
    public final boolean f204323l;

    /* JADX INFO: renamed from: m */
    public final qpt0 f204324m;

    /* JADX INFO: renamed from: n */
    public final bnt0 f204325n;

    /* JADX INFO: renamed from: o */
    public xpy0 f204326o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public wpy0 f204327p;

    /* JADX INFO: renamed from: q */
    public boolean f204328q;

    /* JADX INFO: renamed from: r */
    public boolean f204329r;

    /* JADX INFO: renamed from: s */
    public boolean f204330s;

    public zpy0(gqy0 gqy0Var, boolean z) {
        boolean z2;
        super(gqy0Var);
        if (z) {
            gqy0Var.mo127637b();
            z2 = true;
        } else {
            z2 = false;
        }
        this.f204323l = z2;
        this.f204324m = new qpt0();
        this.f204325n = new bnt0();
        gqy0Var.mo127645y();
        this.f204326o = xpy0.m210535q(gqy0Var.mo98642d());
    }

    @Override // p149l.lty0
    @Nullable
    /* JADX INFO: renamed from: F */
    public final eqy0 mo151759F(eqy0 eqy0Var) {
        Object obj = this.f204326o.f193970h;
        Object obj2 = eqy0Var.f92867a;
        if (obj != null && this.f204326o.f193970h.equals(obj2)) {
            obj2 = xpy0.f193968i;
        }
        return eqy0Var.m117806a(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    @Override // p149l.lty0
    /* JADX INFO: renamed from: H */
    public final void mo151760H(xqt0 xqt0Var) {
        long j;
        eqy0 eqy0VarM117806a = null;
        if (this.f204329r) {
            this.f204326o = this.f204326o.m210538p(xqt0Var);
            wpy0 wpy0Var = this.f204327p;
            if (wpy0Var != null) {
                m219813M(wpy0Var.m204952h());
            }
        } else if (xqt0Var.m210615o()) {
            this.f204326o = this.f204330s ? this.f204326o.m210538p(xqt0Var) : xpy0.m210536r(xqt0Var, qpt0.f155803p, xpy0.f193968i);
        } else {
            xqt0Var.mo112552e(0, this.f204324m, 0L);
            Object obj = this.f204324m.f155814a;
            wpy0 wpy0Var2 = this.f204327p;
            if (wpy0Var2 != null) {
                long jM204953i = wpy0Var2.m204953i();
                this.f204326o.mo112558n(wpy0Var2.f187589a.f92867a, this.f204325n);
                this.f204326o.mo112552e(0, this.f204324m, 0L);
                if (jM204953i != 0) {
                    j = jM204953i;
                } else {
                    j = 0;
                }
            } else {
                j = 0;
            }
            Pair pairM210613l = xqt0Var.m210613l(this.f204324m, this.f204325n, 0, j);
            Object obj2 = pairM210613l.first;
            long jLongValue = ((Long) pairM210613l.second).longValue();
            this.f204326o = this.f204330s ? this.f204326o.m210538p(xqt0Var) : xpy0.m210536r(xqt0Var, obj, obj2);
            wpy0 wpy0Var3 = this.f204327p;
            if (wpy0Var3 != null) {
                m219813M(jLongValue);
                eqy0 eqy0Var = wpy0Var3.f187589a;
                eqy0VarM117806a = eqy0Var.m117806a(m219812L(eqy0Var.f92867a));
            }
        }
        this.f204330s = true;
        this.f204329r = true;
        m160438w(this.f204326o);
        if (eqy0VarM117806a != null) {
            wpy0 wpy0Var4 = this.f204327p;
            wpy0Var4.getClass();
            wpy0Var4.m204954j(eqy0VarM117806a);
        }
    }

    @Override // p149l.lty0
    /* JADX INFO: renamed from: I */
    public final void mo151761I() {
        if (this.f204323l) {
            return;
        }
        this.f204328q = true;
        m160551B(null, this.f130022k);
    }

    /* JADX INFO: renamed from: J */
    public final xqt0 m219810J() {
        return this.f204326o;
    }

    @Override // p149l.gqy0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final wpy0 mo98643i(eqy0 eqy0Var, wwy0 wwy0Var, long j) {
        wpy0 wpy0Var = new wpy0(eqy0Var, wwy0Var, j);
        wpy0Var.m204957o(this.f130022k);
        if (this.f204329r) {
            wpy0Var.m204954j(eqy0Var.m117806a(m219812L(eqy0Var.f92867a)));
            return wpy0Var;
        }
        this.f204327p = wpy0Var;
        if (!this.f204328q) {
            this.f204328q = true;
            m160551B(null, this.f130022k);
        }
        return wpy0Var;
    }

    /* JADX INFO: renamed from: L */
    public final Object m219812L(Object obj) {
        return (this.f204326o.f193970h == null || !obj.equals(xpy0.f193968i)) ? obj : this.f204326o.f193970h;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* JADX INFO: renamed from: M */
    public final void m219813M(long j) {
        wpy0 wpy0Var = this.f204327p;
        int iMo112550a = this.f204326o.mo112550a(wpy0Var.f187589a.f92867a);
        if (iMo112550a == -1) {
            return;
        }
        xpy0 xpy0Var = this.f204326o;
        bnt0 bnt0Var = this.f204325n;
        xpy0Var.mo112551d(iMo112550a, bnt0Var, false);
        long j2 = bnt0Var.f76446d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        wpy0Var.m204955m(j);
    }

    @Override // p149l.lty0, p149l.gqy0
    /* JADX INFO: renamed from: k */
    public final void mo98644k(cqy0 cqy0Var) {
        ((wpy0) cqy0Var).m204956n();
        if (cqy0Var == this.f204327p) {
            this.f204327p = null;
        }
    }

    @Override // p149l.noy0, p149l.gqy0
    /* JADX INFO: renamed from: m */
    public final void mo98645m(nis0 nis0Var) {
        if (this.f204330s) {
            this.f204326o = this.f204326o.m210538p(new ity0(this.f204326o.f165893f, nis0Var));
        } else {
            this.f204326o = xpy0.m210535q(nis0Var);
        }
        this.f130022k.mo98645m(nis0Var);
    }

    @Override // p149l.npy0, p149l.noy0
    /* JADX INFO: renamed from: x */
    public final void mo98647x() {
        this.f204329r = false;
        this.f204328q = false;
        super.mo98647x();
    }

    @Override // p149l.npy0, p149l.gqy0
    /* JADX INFO: renamed from: G */
    public final void mo98640G() {
    }
}
