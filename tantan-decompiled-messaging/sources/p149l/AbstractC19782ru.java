package p149l;

import androidx.annotation.IntRange;

/* JADX INFO: renamed from: l.ru */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC19782ru implements C15991bw.a {

    /* JADX INFO: renamed from: a */
    public int f161012a = 0;

    /* JADX INFO: renamed from: b */
    public long f161013b = 0;

    @Override // p149l.C15991bw.a
    /* JADX INFO: renamed from: a */
    public void mo104111a(@IntRange(from = 0, to = 359) int i) {
        if (System.currentTimeMillis() - this.f161013b <= mo180840d()) {
            return;
        }
        int i2 = this.f161012a;
        if (i2 == 0) {
            m180842f(i);
        } else if (i2 == 1) {
            m180841e(i);
        } else {
            if (i2 != 2) {
                return;
            }
            m180843g(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo180838b();

    /* JADX INFO: renamed from: c */
    public abstract void mo180839c();

    /* JADX INFO: renamed from: d */
    public long mo180840d() {
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public final void m180841e(int i) {
        if (i > 290) {
            this.f161012a = 0;
            this.f161013b = System.currentTimeMillis();
            mo180845i();
        } else if (i <= 110) {
            this.f161012a = 2;
            this.f161013b = System.currentTimeMillis();
            mo180838b();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m180842f(int i) {
        if (i <= 290 && i > 180) {
            this.f161012a = 1;
            this.f161013b = System.currentTimeMillis();
            mo180844h();
        } else {
            if (i < 70 || i >= 180) {
                return;
            }
            this.f161012a = 2;
            this.f161013b = System.currentTimeMillis();
            mo180846j();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m180843g(int i) {
        if (i < 70) {
            this.f161012a = 0;
            this.f161013b = System.currentTimeMillis();
            mo180845i();
        } else if (i >= 250) {
            this.f161012a = 1;
            this.f161013b = System.currentTimeMillis();
            mo180839c();
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo180844h();

    /* JADX INFO: renamed from: i */
    public abstract void mo180845i();

    /* JADX INFO: renamed from: j */
    public abstract void mo180846j();
}
