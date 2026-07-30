package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class xsm extends yhm {

    /* JADX INFO: renamed from: o */
    ncj f194284o;

    /* JADX INFO: renamed from: p */
    private boolean f194285p;

    /* JADX INFO: renamed from: q */
    private int f194286q;

    /* JADX INFO: renamed from: r */
    private tif0 f194287r;

    /* JADX INFO: renamed from: s */
    private us2 f194288s = null;

    /* JADX INFO: renamed from: t */
    private int f194289t = 0;

    /* JADX INFO: renamed from: B */
    private void m210798B() {
        ncj ncjVar = this.f194284o;
        if (ncjVar == null || !(ncjVar instanceof z220)) {
            return;
        }
        if (this.f194285p) {
            ((z220) ncjVar).mo135613O(360 - this.f194286q);
            ((z220) this.f194284o).mo135614P(2);
        } else {
            ((z220) ncjVar).mo135613O(this.f194286q);
            ((z220) this.f194284o).mo135614P(0);
        }
        tif0 tif0Var = this.f194287r;
        if (tif0Var != null) {
            this.f194284o.mo110713z(tif0Var.m189184b(), this.f194287r.m189183a());
        }
    }

    /* JADX INFO: renamed from: A */
    public synchronized void m210799A(int i) {
        try {
            this.f194289t = i;
            if (i == 0) {
                this.f194284o = new ek30();
            } else if (i == 1) {
                this.f194284o = new idq0();
            } else if (i == 2) {
                this.f194284o = new n0f();
            }
            ncj ncjVar = this.f194284o;
            if (ncjVar != null) {
                ncjVar.mo110713z(this.f194287r.m189184b(), this.f194287r.m189183a());
            }
            m214833k(this.f194284o);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: C */
    public synchronized void m210800C(byte[] bArr, int i) {
        ncj ncjVar = this.f194284o;
        if (ncjVar != null && bArr != null && (ncjVar instanceof z220)) {
            ((z220) ncjVar).mo135615V(bArr, i);
        }
    }

    @Override // p149l.yhm
    /* JADX INFO: renamed from: f */
    public void mo177602f() {
        if (this.f194284o == null) {
            int i = this.f194289t;
            if (i == 0) {
                this.f194284o = new ek30();
            } else if (i == 1) {
                this.f194284o = new idq0();
            } else if (i == 2) {
                this.f194284o = new n0f();
            }
        }
        m210798B();
        m214836o(this.f194284o);
    }

    @Override // p149l.yhm
    /* JADX INFO: renamed from: i */
    public void mo177603i() {
        super.mo177603i();
        us2 us2Var = this.f194288s;
        if (us2Var != null) {
            us2Var.mo102038f();
            this.f194288s = null;
        }
    }

    @Override // p149l.yhm
    /* JADX INFO: renamed from: n */
    public void mo177605n(tif0 tif0Var) {
        this.f194287r = tif0Var;
        ncj ncjVar = this.f194284o;
        if (ncjVar != null) {
            ncjVar.mo110713z(tif0Var.m189184b(), this.f194287r.m189183a());
        }
        super.mo177605n(tif0Var);
    }

    /* JADX INFO: renamed from: t */
    public synchronized void m210801t(us2 us2Var) {
        ncj ncjVar = this.f198360d;
        if (ncjVar != null) {
            this.f194288s = us2Var;
            ncjVar.m158945C(us2Var);
        }
    }

    /* JADX INFO: renamed from: u */
    public synchronized boolean m210802u() {
        Object obj = this.f194284o;
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof trl)) {
            return false;
        }
        return ((trl) obj).mo157270b();
    }

    /* JADX INFO: renamed from: v */
    public void m210803v(int i) {
        ncj ncjVar = this.f194284o;
        if (ncjVar == null || !(ncjVar instanceof n0f)) {
            return;
        }
        ((n0f) ncjVar).m157269P(i);
    }

    /* JADX INFO: renamed from: w */
    public void m210804w(int i) {
        this.f194286q = i;
        m210798B();
    }

    /* JADX INFO: renamed from: x */
    public void m210805x(boolean z) {
        this.f194285p = z;
        m210798B();
    }

    /* JADX INFO: renamed from: y */
    public void m210806y(int i) {
        this.f194289t = i;
    }

    /* JADX INFO: renamed from: z */
    public void m210807z(int i, int i2, int i3, int i4, int i5, int i6) {
        ncj ncjVar = this.f194284o;
        if (ncjVar == null || !(ncjVar instanceof ek30)) {
            return;
        }
        ((ek30) ncjVar).m116921W(i, i2, i3, i4, i5, i6);
    }
}
