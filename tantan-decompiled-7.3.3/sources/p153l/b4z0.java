package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class b4z0 extends h5z0 implements Comparable {

    /* JADX INFO: renamed from: e */
    public final int f75005e;

    /* JADX INFO: renamed from: f */
    public final int f75006f;

    public b4z0(int i, t2u0 t2u0Var, int i2, h4z0 h4z0Var, int i3) {
        super(i, t2u0Var, i2);
        this.f75005e = l5z0.m153034t(i3, h4z0Var.f107873v0) ? 1 : 0;
        this.f75006f = this.f107992d.m187558a();
    }

    @Override // p153l.h5z0
    /* JADX INFO: renamed from: a */
    public final int mo96008a() {
        return this.f75005e;
    }

    @Override // p153l.h5z0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo96009b(h5z0 h5z0Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(b4z0 b4z0Var) {
        return Integer.compare(this.f75006f, b4z0Var.f75006f);
    }
}
