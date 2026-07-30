package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class dzy0 extends yyy0 {

    /* JADX INFO: renamed from: i */
    public static final Object f91392i = new Object();

    /* JADX INFO: renamed from: g */
    @Nullable
    public final Object f91393g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final Object f91394h;

    public dzy0(d0u0 d0u0Var, @Nullable Object obj, @Nullable Object obj2) {
        super(d0u0Var);
        this.f91393g = obj;
        this.f91394h = obj2;
    }

    /* JADX INFO: renamed from: q */
    public static dzy0 m118768q(trs0 trs0Var) {
        return new dzy0(new ezy0(trs0Var), wyt0.f191680p, f91392i);
    }

    /* JADX INFO: renamed from: r */
    public static dzy0 m118769r(d0u0 d0u0Var, @Nullable Object obj, @Nullable Object obj2) {
        return new dzy0(d0u0Var, obj, obj2);
    }

    @Override // p153l.yyy0, p153l.d0u0
    /* JADX INFO: renamed from: a */
    public final int mo113457a(Object obj) {
        Object obj2;
        if (f91392i.equals(obj) && (obj2 = this.f91394h) != null) {
            obj = obj2;
        }
        return this.f202161f.mo113457a(obj);
    }

    @Override // p153l.yyy0, p153l.d0u0
    /* JADX INFO: renamed from: d */
    public final hwt0 mo107662d(int i, hwt0 hwt0Var, boolean z) {
        this.f202161f.mo107662d(i, hwt0Var, z);
        if (mpw0.m159408f(hwt0Var.f111929b, this.f91394h) && z) {
            hwt0Var.f111929b = f91392i;
        }
        return hwt0Var;
    }

    @Override // p153l.yyy0, p153l.d0u0
    /* JADX INFO: renamed from: e */
    public final wyt0 mo107663e(int i, wyt0 wyt0Var, long j) {
        this.f202161f.mo107663e(i, wyt0Var, j);
        if (mpw0.m159408f(wyt0Var.f191691a, this.f91393g)) {
            wyt0Var.f191691a = wyt0.f191680p;
        }
        return wyt0Var;
    }

    @Override // p153l.yyy0, p153l.d0u0
    /* JADX INFO: renamed from: f */
    public final Object mo113460f(int i) {
        Object objMo113460f = this.f202161f.mo113460f(i);
        return mpw0.m159408f(objMo113460f, this.f91394h) ? f91392i : objMo113460f;
    }

    /* JADX INFO: renamed from: p */
    public final dzy0 m118771p(d0u0 d0u0Var) {
        return new dzy0(d0u0Var, this.f91393g, this.f91394h);
    }
}
