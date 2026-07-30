package p153l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes6.dex */
public class n610 extends pgk {

    /* JADX INFO: renamed from: H */
    private h9k f140417H;

    /* JADX INFO: renamed from: I */
    private kt2 f140418I;

    /* JADX INFO: renamed from: J */
    pu40 f140419J;

    /* JADX INFO: renamed from: K */
    private boolean f140420K;

    /* JADX INFO: renamed from: L */
    private pq70 f140421L;

    public n610() {
        kt2 kt2Var = new kt2();
        this.f140418I = kt2Var;
        kt2Var.m134795C(this);
        m172256R(this.f140418I);
        m172257S(this.f140418I);
    }

    /* JADX INFO: renamed from: W */
    public void m161748W(Bitmap bitmap) {
        synchronized (m134800I()) {
            try {
                if (!this.f140420K) {
                    this.f140418I.m134803M(this);
                    m172260V(this.f140418I);
                    m172255Q(this.f140418I);
                    pu40 pu40Var = new pu40();
                    this.f140419J = pu40Var;
                    pu40Var.m134795C(this);
                    this.f140421L = new pq70(0.02f, 1.0f);
                    this.f140417H = new h9k();
                    this.f140418I.m134795C(this.f140419J);
                    this.f140418I.m134795C(this.f140421L);
                    this.f140421L.m134795C(this.f140417H);
                    this.f140417H.m134795C(this.f140419J);
                    this.f140419J.m141855Q(this.f140418I, 0);
                    this.f140419J.m141855Q(this.f140417H, 1);
                    this.f140419J.m134795C(this);
                    m172257S(this.f140419J);
                    this.f140420K = true;
                }
                this.f140417H.m134080R(bitmap);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public void m161749X(boolean z) {
        pq70 pq70Var = this.f140421L;
        if (pq70Var != null) {
            pq70Var.m173325O(z);
        }
    }

    @Override // p153l.pgk, p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: f */
    public void mo96080f() {
        super.mo96080f();
        pu40 pu40Var = this.f140419J;
        if (pu40Var != null) {
            pu40Var.mo96080f();
        }
        kt2 kt2Var = this.f140418I;
        if (kt2Var != null) {
            kt2Var.mo96080f();
        }
    }
}
