package p149l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes7.dex */
public class dy00 extends zdk {

    /* JADX INFO: renamed from: H */
    private p6k f88336H;

    /* JADX INFO: renamed from: I */
    private us2 f88337I;

    /* JADX INFO: renamed from: J */
    bm40 f88338J;

    /* JADX INFO: renamed from: K */
    private boolean f88339K;

    /* JADX INFO: renamed from: L */
    private ji70 f88340L;

    public dy00() {
        us2 us2Var = new us2();
        this.f88337I = us2Var;
        us2Var.m158945C(this);
        m218168R(this.f88337I);
        m218169S(this.f88337I);
    }

    /* JADX INFO: renamed from: W */
    public void m114042W(Bitmap bitmap) {
        synchronized (m158947I()) {
            try {
                if (!this.f88339K) {
                    this.f88337I.m158951M(this);
                    m218172V(this.f88337I);
                    m218167Q(this.f88337I);
                    bm40 bm40Var = new bm40();
                    this.f88338J = bm40Var;
                    bm40Var.m158945C(this);
                    this.f88340L = new ji70(0.02f, 1.0f);
                    this.f88336H = new p6k();
                    this.f88337I.m158945C(this.f88338J);
                    this.f88337I.m158945C(this.f88340L);
                    this.f88340L.m158945C(this.f88336H);
                    this.f88336H.m158945C(this.f88338J);
                    this.f88338J.m215029Q(this.f88337I, 0);
                    this.f88338J.m215029Q(this.f88336H, 1);
                    this.f88338J.m158945C(this);
                    m218169S(this.f88338J);
                    this.f88339K = true;
                }
                this.f88336H.m167684R(bitmap);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public void m114043X(boolean z) {
        ji70 ji70Var = this.f88340L;
        if (ji70Var != null) {
            ji70Var.m141633O(z);
        }
    }

    @Override // p149l.zdk, p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: f */
    public void mo102038f() {
        super.mo102038f();
        bm40 bm40Var = this.f88338J;
        if (bm40Var != null) {
            bm40Var.mo102038f();
        }
        us2 us2Var = this.f88337I;
        if (us2Var != null) {
            us2Var.mo102038f();
        }
    }
}
