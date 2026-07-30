package p149l;

import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ux50 implements z4e0.InterfaceC21618a {

    /* JADX INFO: renamed from: a */
    public int f178707a = 0;

    /* JADX INFO: renamed from: b */
    public long f178708b = 0;

    @Override // p149l.z4e0.InterfaceC21618a
    /* JADX INFO: renamed from: a */
    public void mo196149a(@IntRange(from = 0, to = 359) int i) {
        if (System.currentTimeMillis() - this.f178708b <= mo136372d()) {
            return;
        }
        int i2 = this.f178707a;
        if (i2 == 0) {
            m196151f(i);
        } else if (i2 == 1) {
            m196150e(i);
        } else {
            if (i2 != 2) {
                return;
            }
            m196152g(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo136370b();

    /* JADX INFO: renamed from: c */
    public abstract void mo136371c();

    /* JADX INFO: renamed from: d */
    public long mo136372d() {
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public final void m196150e(int i) {
        if (i > 290) {
            this.f178707a = 0;
            this.f178708b = System.currentTimeMillis();
            mo136374i();
        } else if (i <= 110) {
            this.f178707a = 2;
            this.f178708b = System.currentTimeMillis();
            mo136370b();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m196151f(int i) {
        if (i <= 290 && i > 180) {
            this.f178707a = 1;
            this.f178708b = System.currentTimeMillis();
            mo136373h();
        } else {
            if (i < 70 || i >= 180) {
                return;
            }
            this.f178707a = 2;
            this.f178708b = System.currentTimeMillis();
            mo136375j();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m196152g(int i) {
        if (i < 70) {
            this.f178707a = 0;
            this.f178708b = System.currentTimeMillis();
            mo136374i();
        } else if (i >= 250) {
            this.f178707a = 1;
            this.f178708b = System.currentTimeMillis();
            mo136371c();
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo136373h();

    /* JADX INFO: renamed from: i */
    public abstract void mo136374i();

    /* JADX INFO: renamed from: j */
    public abstract void mo136375j();
}
