package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class xpy0 extends spy0 {

    /* JADX INFO: renamed from: i */
    public static final Object f193968i = new Object();

    /* JADX INFO: renamed from: g */
    @Nullable
    public final Object f193969g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final Object f193970h;

    public xpy0(xqt0 xqt0Var, @Nullable Object obj, @Nullable Object obj2) {
        super(xqt0Var);
        this.f193969g = obj;
        this.f193970h = obj2;
    }

    /* JADX INFO: renamed from: q */
    public static xpy0 m210535q(nis0 nis0Var) {
        return new xpy0(new ypy0(nis0Var), qpt0.f155803p, f193968i);
    }

    /* JADX INFO: renamed from: r */
    public static xpy0 m210536r(xqt0 xqt0Var, @Nullable Object obj, @Nullable Object obj2) {
        return new xpy0(xqt0Var, obj, obj2);
    }

    @Override // p149l.spy0, p149l.xqt0
    /* JADX INFO: renamed from: a */
    public final int mo112550a(Object obj) {
        Object obj2;
        if (f193968i.equals(obj) && (obj2 = this.f193970h) != null) {
            obj = obj2;
        }
        return this.f165893f.mo112550a(obj);
    }

    @Override // p149l.spy0, p149l.xqt0
    /* JADX INFO: renamed from: d */
    public final bnt0 mo112551d(int i, bnt0 bnt0Var, boolean z) {
        this.f165893f.mo112551d(i, bnt0Var, z);
        if (ggw0.m126064f(bnt0Var.f76444b, this.f193970h) && z) {
            bnt0Var.f76444b = f193968i;
        }
        return bnt0Var;
    }

    @Override // p149l.spy0, p149l.xqt0
    /* JADX INFO: renamed from: e */
    public final qpt0 mo112552e(int i, qpt0 qpt0Var, long j) {
        this.f165893f.mo112552e(i, qpt0Var, j);
        if (ggw0.m126064f(qpt0Var.f155814a, this.f193969g)) {
            qpt0Var.f155814a = qpt0.f155803p;
        }
        return qpt0Var;
    }

    @Override // p149l.spy0, p149l.xqt0
    /* JADX INFO: renamed from: f */
    public final Object mo112553f(int i) {
        Object objMo112553f = this.f165893f.mo112553f(i);
        return ggw0.m126064f(objMo112553f, this.f193970h) ? f193968i : objMo112553f;
    }

    /* JADX INFO: renamed from: p */
    public final xpy0 m210538p(xqt0 xqt0Var) {
        return new xpy0(xqt0Var, this.f193969g, this.f193970h);
    }
}
