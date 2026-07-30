package p006l;

import androidx.annotation.IntRange;

/* JADX INFO: renamed from: l.ru */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class AbstractC1232ru implements C0577bw.a {

    /* JADX INFO: renamed from: a */
    public int f20737a = 0;

    /* JADX INFO: renamed from: b */
    public long f20738b = 0;

    @Override // p006l.C0577bw.a
    /* JADX INFO: renamed from: a */
    public void mo12916a(@IntRange(from = 0, to = 359) int i) {
        if (System.currentTimeMillis() - this.f20738b <= mo22942d()) {
            return;
        }
        int i2 = this.f20737a;
        if (i2 == 0) {
            m22944f(i);
        } else if (i2 == 1) {
            m22943e(i);
        } else {
            if (i2 != 2) {
                return;
            }
            m22945g(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo22940b();

    /* JADX INFO: renamed from: c */
    public abstract void mo22941c();

    /* JADX INFO: renamed from: d */
    public long mo22942d() {
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public final void m22943e(int i) {
        if (i > 290) {
            this.f20737a = 0;
            this.f20738b = System.currentTimeMillis();
            mo22947i();
        } else if (i <= 110) {
            this.f20737a = 2;
            this.f20738b = System.currentTimeMillis();
            mo22940b();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m22944f(int i) {
        if (i <= 290 && i > 180) {
            this.f20737a = 1;
            this.f20738b = System.currentTimeMillis();
            mo22946h();
        } else {
            if (i < 70 || i >= 180) {
                return;
            }
            this.f20737a = 2;
            this.f20738b = System.currentTimeMillis();
            mo22948j();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m22945g(int i) {
        if (i < 70) {
            this.f20737a = 0;
            this.f20738b = System.currentTimeMillis();
            mo22947i();
        } else if (i >= 250) {
            this.f20737a = 1;
            this.f20738b = System.currentTimeMillis();
            mo22941c();
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo22946h();

    /* JADX INFO: renamed from: i */
    public abstract void mo22947i();

    /* JADX INFO: renamed from: j */
    public abstract void mo22948j();
}
