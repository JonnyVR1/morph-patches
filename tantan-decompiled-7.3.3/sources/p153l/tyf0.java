package p153l;

/* JADX INFO: loaded from: classes.dex */
public final class tyf0 extends bge<tyf0> {

    /* JADX INFO: renamed from: A */
    public ezf0 f176672A;

    /* JADX INFO: renamed from: B */
    public float f176673B;

    /* JADX INFO: renamed from: C */
    public boolean f176674C;

    public tyf0(zsi zsiVar) {
        super(zsiVar);
        this.f176672A = null;
        this.f176673B = Float.MAX_VALUE;
        this.f176674C = false;
    }

    @Override // p153l.bge
    /* JADX INFO: renamed from: l */
    public void mo104129l() {
        m193594q();
        this.f176672A.m123350g(m104124f());
        super.mo104129l();
    }

    @Override // p153l.bge
    /* JADX INFO: renamed from: n */
    public boolean mo104131n(long j) {
        boolean z = this.f176674C;
        float f = this.f176673B;
        if (z) {
            if (f != Float.MAX_VALUE) {
                this.f176672A.m123348e(f);
                this.f176673B = Float.MAX_VALUE;
            }
            this.f76601b = this.f176672A.m123344a();
            this.f76600a = 0.0f;
            this.f176674C = false;
            return true;
        }
        ezf0 ezf0Var = this.f176672A;
        if (f != Float.MAX_VALUE) {
            ezf0Var.m123344a();
            long j2 = j / 2;
            bge.C15999p c15999pM123351h = this.f176672A.m123351h(this.f76601b, this.f76600a, j2);
            this.f176672A.m123348e(this.f176673B);
            this.f176673B = Float.MAX_VALUE;
            bge.C15999p c15999pM123351h2 = this.f176672A.m123351h(c15999pM123351h.f76614a, c15999pM123351h.f76615b, j2);
            this.f76601b = c15999pM123351h2.f76614a;
            this.f76600a = c15999pM123351h2.f76615b;
        } else {
            bge.C15999p c15999pM123351h3 = ezf0Var.m123351h(this.f76601b, this.f76600a, j);
            this.f76601b = c15999pM123351h3.f76614a;
            this.f76600a = c15999pM123351h3.f76615b;
        }
        float fMax = Math.max(this.f76601b, this.f76607h);
        this.f76601b = fMax;
        float fMin = Math.min(fMax, this.f76606g);
        this.f76601b = fMin;
        if (!m193593p(fMin, this.f76600a)) {
            return false;
        }
        this.f76601b = this.f176672A.m123344a();
        this.f76600a = 0.0f;
        return true;
    }

    /* JADX INFO: renamed from: o */
    public void m193592o(float f) {
        if (m104125g()) {
            this.f176673B = f;
            return;
        }
        if (this.f176672A == null) {
            this.f176672A = new ezf0(f);
        }
        this.f176672A.m123348e(f);
        mo104129l();
    }

    /* JADX INFO: renamed from: p */
    public boolean m193593p(float f, float f2) {
        return this.f176672A.m123346c(f, f2);
    }

    /* JADX INFO: renamed from: q */
    public final void m193594q() {
        ezf0 ezf0Var = this.f176672A;
        if (ezf0Var == null) {
            pr3.m173429a("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
            return;
        }
        double dM123344a = ezf0Var.m123344a();
        if (dM123344a > this.f76606g) {
            pr3.m173429a("Final position of the spring cannot be greater than the max value.");
        } else {
            if (dM123344a >= this.f76607h) {
                return;
            }
            pr3.m173429a("Final position of the spring cannot be less than the min value.");
        }
    }

    /* JADX INFO: renamed from: r */
    public tyf0 m193595r(ezf0 ezf0Var) {
        this.f176672A = ezf0Var;
        return this;
    }

    public <K> tyf0(K k, ysi<K> ysiVar) {
        super(k, ysiVar);
        this.f176672A = null;
        this.f176673B = Float.MAX_VALUE;
        this.f176674C = false;
    }
}
