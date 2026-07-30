package p007l;

import androidx.annotation.IntRange;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class ux50 implements z4e0.InterfaceC2543a {

    /* JADX INFO: renamed from: a */
    public int f13978a = 0;

    /* JADX INFO: renamed from: b */
    public long f13979b = 0;

    @Override // p007l.z4e0.InterfaceC2543a
    /* JADX INFO: renamed from: a */
    public void mo15179a(@IntRange(from = 0, to = 359) int i) {
        if (System.currentTimeMillis() - this.f13979b <= mo10879d()) {
            return;
        }
        int i2 = this.f13978a;
        if (i2 == 0) {
            m15181f(i);
        } else if (i2 == 1) {
            m15180e(i);
        } else {
            if (i2 != 2) {
                return;
            }
            m15182g(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo10877b();

    /* JADX INFO: renamed from: c */
    public abstract void mo10878c();

    /* JADX INFO: renamed from: d */
    public long mo10879d() {
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public final void m15180e(int i) {
        if (i > 290) {
            this.f13978a = 0;
            this.f13979b = System.currentTimeMillis();
            mo10881i();
        } else if (i <= 110) {
            this.f13978a = 2;
            this.f13979b = System.currentTimeMillis();
            mo10877b();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m15181f(int i) {
        if (i <= 290 && i > 180) {
            this.f13978a = 1;
            this.f13979b = System.currentTimeMillis();
            mo10880h();
        } else {
            if (i < 70 || i >= 180) {
                return;
            }
            this.f13978a = 2;
            this.f13979b = System.currentTimeMillis();
            mo10882j();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m15182g(int i) {
        if (i < 70) {
            this.f13978a = 0;
            this.f13979b = System.currentTimeMillis();
            mo10881i();
        } else if (i >= 250) {
            this.f13978a = 1;
            this.f13979b = System.currentTimeMillis();
            mo10878c();
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo10880h();

    /* JADX INFO: renamed from: i */
    public abstract void mo10881i();

    /* JADX INFO: renamed from: j */
    public abstract void mo10882j();
}
