package p153l;

import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes13.dex */
public abstract class z560 implements dde0.InterfaceC16500a {

    /* JADX INFO: renamed from: a */
    public int f203008a = 0;

    /* JADX INFO: renamed from: b */
    public long f203009b = 0;

    @Override // p153l.dde0.InterfaceC16500a
    /* JADX INFO: renamed from: a */
    public void mo115338a(@IntRange(from = 0, to = 359) int i) {
        if (System.currentTimeMillis() - this.f203009b <= mo173339d()) {
            return;
        }
        int i2 = this.f203008a;
        if (i2 == 0) {
            m218630f(i);
        } else if (i2 == 1) {
            m218629e(i);
        } else {
            if (i2 != 2) {
                return;
            }
            m218631g(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo173337b();

    /* JADX INFO: renamed from: c */
    public abstract void mo173338c();

    /* JADX INFO: renamed from: d */
    public long mo173339d() {
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public final void m218629e(int i) {
        if (i > 290) {
            this.f203008a = 0;
            this.f203009b = System.currentTimeMillis();
            mo173341i();
        } else if (i <= 110) {
            this.f203008a = 2;
            this.f203009b = System.currentTimeMillis();
            mo173337b();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m218630f(int i) {
        if (i <= 290 && i > 180) {
            this.f203008a = 1;
            this.f203009b = System.currentTimeMillis();
            mo173340h();
        } else {
            if (i < 70 || i >= 180) {
                return;
            }
            this.f203008a = 2;
            this.f203009b = System.currentTimeMillis();
            mo173342j();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m218631g(int i) {
        if (i < 70) {
            this.f203008a = 0;
            this.f203009b = System.currentTimeMillis();
            mo173341i();
        } else if (i >= 250) {
            this.f203008a = 1;
            this.f203009b = System.currentTimeMillis();
            mo173338c();
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo173340h();

    /* JADX INFO: renamed from: i */
    public abstract void mo173341i();

    /* JADX INFO: renamed from: j */
    public abstract void mo173342j();
}
