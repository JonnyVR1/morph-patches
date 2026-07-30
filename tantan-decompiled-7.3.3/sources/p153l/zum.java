package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class zum extends bkm {

    /* JADX INFO: renamed from: o */
    hfj f206138o;

    /* JADX INFO: renamed from: p */
    private boolean f206139p;

    /* JADX INFO: renamed from: q */
    private int f206140q;

    /* JADX INFO: renamed from: r */
    private crf0 f206141r;

    /* JADX INFO: renamed from: s */
    private kt2 f206142s = null;

    /* JADX INFO: renamed from: t */
    private int f206143t = 0;

    /* JADX INFO: renamed from: B */
    private void m221666B() {
        hfj hfjVar = this.f206138o;
        if (hfjVar == null || !(hfjVar instanceof hb20)) {
            return;
        }
        if (this.f206139p) {
            ((hb20) hfjVar).mo134336O(360 - this.f206140q);
            ((hb20) this.f206138o).mo134337P(2);
        } else {
            ((hb20) hfjVar).mo134336O(this.f206140q);
            ((hb20) this.f206138o).mo134337P(0);
        }
        crf0 crf0Var = this.f206141r;
        if (crf0Var != null) {
            this.f206138o.mo172261z(crf0Var.m112050b(), this.f206141r.m112049a());
        }
    }

    /* JADX INFO: renamed from: A */
    public synchronized void m221667A(int i) {
        try {
            this.f206143t = i;
            if (i == 0) {
                this.f206138o = new ss30();
            } else if (i == 1) {
                this.f206138o = new nmq0();
            } else if (i == 2) {
                this.f206138o = new r1f();
            }
            hfj hfjVar = this.f206138o;
            if (hfjVar != null) {
                hfjVar.mo172261z(this.f206141r.m112050b(), this.f206141r.m112049a());
            }
            m104829k(this.f206138o);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: C */
    public synchronized void m221668C(byte[] bArr, int i) {
        hfj hfjVar = this.f206138o;
        if (hfjVar != null && bArr != null && (hfjVar instanceof hb20)) {
            ((hb20) hfjVar).mo134343V(bArr, i);
        }
    }

    @Override // p153l.bkm
    /* JADX INFO: renamed from: f */
    public void mo104824f() {
        if (this.f206138o == null) {
            int i = this.f206143t;
            if (i == 0) {
                this.f206138o = new ss30();
            } else if (i == 1) {
                this.f206138o = new nmq0();
            } else if (i == 2) {
                this.f206138o = new r1f();
            }
        }
        m221666B();
        m104833o(this.f206138o);
    }

    @Override // p153l.bkm
    /* JADX INFO: renamed from: i */
    public void mo104827i() {
        super.mo104827i();
        kt2 kt2Var = this.f206142s;
        if (kt2Var != null) {
            kt2Var.mo96080f();
            this.f206142s = null;
        }
    }

    @Override // p153l.bkm
    /* JADX INFO: renamed from: n */
    public void mo104832n(crf0 crf0Var) {
        this.f206141r = crf0Var;
        hfj hfjVar = this.f206138o;
        if (hfjVar != null) {
            hfjVar.mo172261z(crf0Var.m112050b(), this.f206141r.m112049a());
        }
        super.mo104832n(crf0Var);
    }

    /* JADX INFO: renamed from: t */
    public synchronized void m221669t(kt2 kt2Var) {
        hfj hfjVar = this.f77092d;
        if (hfjVar != null) {
            this.f206142s = kt2Var;
            hfjVar.m134795C(kt2Var);
        }
    }

    /* JADX INFO: renamed from: u */
    public synchronized boolean m221670u() {
        Object obj = this.f206138o;
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof gul)) {
            return false;
        }
        return ((gul) obj).mo132335b();
    }

    /* JADX INFO: renamed from: v */
    public void m221671v(int i) {
        hfj hfjVar = this.f206138o;
        if (hfjVar == null || !(hfjVar instanceof r1f)) {
            return;
        }
        ((r1f) hfjVar).m179407P(i);
    }

    /* JADX INFO: renamed from: w */
    public void m221672w(int i) {
        this.f206140q = i;
        m221666B();
    }

    /* JADX INFO: renamed from: x */
    public void m221673x(boolean z) {
        this.f206139p = z;
        m221666B();
    }

    /* JADX INFO: renamed from: y */
    public void m221674y(int i) {
        this.f206143t = i;
    }

    /* JADX INFO: renamed from: z */
    public void m221675z(int i, int i2, int i3, int i4, int i5, int i6) {
        hfj hfjVar = this.f206138o;
        if (hfjVar == null || !(hfjVar instanceof ss30)) {
            return;
        }
        ((ss30) hfjVar).m187685W(i, i2, i3, i4, i5, i6);
    }
}
