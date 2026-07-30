package p153l;

import androidx.annotation.IntRange;

/* JADX INFO: renamed from: l.lu */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC18464lu implements C20939vv.a {

    /* JADX INFO: renamed from: a */
    public int f133584a = 0;

    /* JADX INFO: renamed from: b */
    public long f133585b = 0;

    @Override // p153l.C20939vv.a
    /* JADX INFO: renamed from: a */
    public void mo155828a(@IntRange(from = 0, to = 359) int i) {
        if (System.currentTimeMillis() - this.f133585b <= mo155831d()) {
            return;
        }
        int i2 = this.f133584a;
        if (i2 == 0) {
            m155833f(i);
        } else if (i2 == 1) {
            m155832e(i);
        } else {
            if (i2 != 2) {
                return;
            }
            m155834g(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo155829b();

    /* JADX INFO: renamed from: c */
    public abstract void mo155830c();

    /* JADX INFO: renamed from: d */
    public long mo155831d() {
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public final void m155832e(int i) {
        if (i > 290) {
            this.f133584a = 0;
            this.f133585b = System.currentTimeMillis();
            mo155836i();
        } else if (i <= 110) {
            this.f133584a = 2;
            this.f133585b = System.currentTimeMillis();
            mo155829b();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m155833f(int i) {
        if (i <= 290 && i > 180) {
            this.f133584a = 1;
            this.f133585b = System.currentTimeMillis();
            mo155835h();
        } else {
            if (i < 70 || i >= 180) {
                return;
            }
            this.f133584a = 2;
            this.f133585b = System.currentTimeMillis();
            mo155837j();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m155834g(int i) {
        if (i < 70) {
            this.f133584a = 0;
            this.f133585b = System.currentTimeMillis();
            mo155836i();
        } else if (i >= 250) {
            this.f133584a = 1;
            this.f133585b = System.currentTimeMillis();
            mo155830c();
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo155835h();

    /* JADX INFO: renamed from: i */
    public abstract void mo155836i();

    /* JADX INFO: renamed from: j */
    public abstract void mo155837j();
}
