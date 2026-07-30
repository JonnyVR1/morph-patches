package p149l;

/* JADX INFO: loaded from: classes.dex */
public final class kqf0 extends xee<kqf0> {

    /* JADX INFO: renamed from: A */
    public vqf0 f124256A;

    /* JADX INFO: renamed from: B */
    public float f124257B;

    /* JADX INFO: renamed from: C */
    public boolean f124258C;

    public kqf0(dqi dqiVar) {
        super(dqiVar);
        this.f124256A = null;
        this.f124257B = Float.MAX_VALUE;
        this.f124258C = false;
    }

    @Override // p149l.xee
    /* JADX INFO: renamed from: l */
    public void mo146938l() {
        m146942q();
        this.f124256A.m199493g(m208544f());
        super.mo146938l();
    }

    @Override // p149l.xee
    /* JADX INFO: renamed from: n */
    public boolean mo146939n(long j) {
        boolean z = this.f124258C;
        float f = this.f124257B;
        if (z) {
            if (f != Float.MAX_VALUE) {
                this.f124256A.m199491e(f);
                this.f124257B = Float.MAX_VALUE;
            }
            this.f192580b = this.f124256A.m199487a();
            this.f192579a = 0.0f;
            this.f124258C = false;
            return true;
        }
        vqf0 vqf0Var = this.f124256A;
        if (f != Float.MAX_VALUE) {
            vqf0Var.m199487a();
            long j2 = j / 2;
            xee.C21137p c21137pM199494h = this.f124256A.m199494h(this.f192580b, this.f192579a, j2);
            this.f124256A.m199491e(this.f124257B);
            this.f124257B = Float.MAX_VALUE;
            xee.C21137p c21137pM199494h2 = this.f124256A.m199494h(c21137pM199494h.f192593a, c21137pM199494h.f192594b, j2);
            this.f192580b = c21137pM199494h2.f192593a;
            this.f192579a = c21137pM199494h2.f192594b;
        } else {
            xee.C21137p c21137pM199494h3 = vqf0Var.m199494h(this.f192580b, this.f192579a, j);
            this.f192580b = c21137pM199494h3.f192593a;
            this.f192579a = c21137pM199494h3.f192594b;
        }
        float fMax = Math.max(this.f192580b, this.f192586h);
        this.f192580b = fMax;
        float fMin = Math.min(fMax, this.f192585g);
        this.f192580b = fMin;
        if (!m146941p(fMin, this.f192579a)) {
            return false;
        }
        this.f192580b = this.f124256A.m199487a();
        this.f192579a = 0.0f;
        return true;
    }

    /* JADX INFO: renamed from: o */
    public void m146940o(float f) {
        if (m208545g()) {
            this.f124257B = f;
            return;
        }
        if (this.f124256A == null) {
            this.f124256A = new vqf0(f);
        }
        this.f124256A.m199491e(f);
        mo146938l();
    }

    /* JADX INFO: renamed from: p */
    public boolean m146941p(float f, float f2) {
        return this.f124256A.m199489c(f, f2);
    }

    /* JADX INFO: renamed from: q */
    public final void m146942q() {
        vqf0 vqf0Var = this.f124256A;
        if (vqf0Var == null) {
            qq3.m175877a("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
            return;
        }
        double dM199487a = vqf0Var.m199487a();
        if (dM199487a > this.f192585g) {
            qq3.m175877a("Final position of the spring cannot be greater than the max value.");
        } else {
            if (dM199487a >= this.f192586h) {
                return;
            }
            qq3.m175877a("Final position of the spring cannot be less than the min value.");
        }
    }

    /* JADX INFO: renamed from: r */
    public kqf0 m146943r(vqf0 vqf0Var) {
        this.f124256A = vqf0Var;
        return this;
    }

    public <K> kqf0(K k, cqi<K> cqiVar) {
        super(k, cqiVar);
        this.f124256A = null;
        this.f124257B = Float.MAX_VALUE;
        this.f124258C = false;
    }
}
