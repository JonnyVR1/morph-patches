package p149l;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public abstract class jcg0 implements nbg0 {

    /* JADX INFO: renamed from: a */
    public final vjg0 f117307a;

    public jcg0(vjg0 vjg0Var) {
        this.f117307a = vjg0Var;
        vjg0Var.f181702a = this;
    }

    /* JADX INFO: renamed from: e */
    public final void m140920e(slg0 slg0Var, int i, long j) {
        vjg0 vjg0Var = this.f117307a;
        a7g0 a7g0Var = vjg0Var.f181704c;
        if (slg0Var.f165194f == null) {
            s7g0 s7g0Var = bog0.m102944a().f76517c;
            slg0Var.f165194f = (tfg0) s7g0Var.f162913b.f71265a.get(slg0Var.f165190b);
        }
        ocg0 ocg0Var = (ocg0) a7g0Var.m95288a(slg0Var);
        if (ocg0Var == null) {
            return;
        }
        pog0 pog0Var = vjg0Var.f181703b;
        if (pog0Var == null) {
            if (vjg0Var.f181702a != null) {
                return;
            }
            return;
        }
        kmg0 kmg0Var = (kmg0) ocg0Var;
        synchronized (((q6g0) kmg0Var.f123794f.get(i))) {
            SystemClock.uptimeMillis();
        }
        if (pog0Var.f150503a != null) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m140921f(slg0 slg0Var, tfg0 tfg0Var) {
        dgg0 dgg0Var;
        vjg0 vjg0Var = this.f117307a;
        a7g0 a7g0Var = vjg0Var.f181704c;
        rjg0 rjg0Var = a7g0Var.f67924c;
        int i = slg0Var.f165190b;
        rjg0Var.getClass();
        kmg0 kmg0Var = new kmg0(i);
        synchronized (a7g0Var) {
            try {
                if (a7g0Var.f67922a == null) {
                    a7g0Var.f67922a = kmg0Var;
                } else {
                    a7g0Var.f67923b.put(slg0Var.f165190b, kmg0Var);
                }
                if (tfg0Var != null) {
                    kmg0Var.m146532a(tfg0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        pog0 pog0Var = vjg0Var.f181703b;
        if (pog0Var == null || (dgg0Var = pog0Var.f150503a) == null) {
            return;
        }
        dgg0Var.mo135982b(tfg0Var);
    }

    /* JADX INFO: renamed from: g */
    public final void m140922g(slg0 slg0Var, tfg0 tfg0Var, int i) {
        dgg0 dgg0Var;
        vjg0 vjg0Var = this.f117307a;
        a7g0 a7g0Var = vjg0Var.f181704c;
        rjg0 rjg0Var = a7g0Var.f67924c;
        int i2 = slg0Var.f165190b;
        rjg0Var.getClass();
        kmg0 kmg0Var = new kmg0(i2);
        synchronized (a7g0Var) {
            try {
                if (a7g0Var.f67922a == null) {
                    a7g0Var.f67922a = kmg0Var;
                } else {
                    a7g0Var.f67923b.put(slg0Var.f165190b, kmg0Var);
                }
                if (tfg0Var != null) {
                    kmg0Var.m146532a(tfg0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        pog0 pog0Var = vjg0Var.f181703b;
        if (pog0Var == null || (dgg0Var = pog0Var.f150503a) == null) {
            return;
        }
        dgg0Var.mo135982b(tfg0Var);
    }

    /* JADX INFO: renamed from: h */
    public final void m140923h(slg0 slg0Var, int i, long j) {
        vjg0 vjg0Var = this.f117307a;
        a7g0 a7g0Var = vjg0Var.f181704c;
        if (slg0Var.f165194f == null) {
            slg0Var.f165194f = (tfg0) bog0.m102944a().f76517c.f162913b.f71265a.get(slg0Var.f165190b);
        }
        ocg0 ocg0Var = (ocg0) a7g0Var.m95288a(slg0Var);
        if (ocg0Var == null) {
            return;
        }
        ocg0Var.f143039d.put(i, Long.valueOf(((Long) ocg0Var.f143039d.get(i)).longValue() + j));
        ocg0Var.f143038c += j;
        pog0 pog0Var = vjg0Var.f181703b;
        if (pog0Var != null) {
            kmg0 kmg0Var = (kmg0) ocg0Var;
            q6g0 q6g0Var = (q6g0) kmg0Var.f123794f.get(i);
            synchronized (q6g0Var) {
                if (q6g0Var.f152907a == 0) {
                    q6g0Var.f152907a = SystemClock.uptimeMillis();
                }
            }
            kmg0Var.f123793e.m173129a(j);
            if (pog0Var.f150503a != null) {
                ((Long) ocg0Var.f143039d.get(i)).getClass();
                pog0Var.f150503a.mo135983d(ocg0Var.f143038c);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m140924i(slg0 slg0Var, int i, Exception exc) {
        vjg0 vjg0Var = this.f117307a;
        synchronized (vjg0Var) {
            try {
                a7g0 a7g0Var = vjg0Var.f181704c;
                if (slg0Var.f165194f == null) {
                    s7g0 s7g0Var = bog0.m102944a().f76517c;
                    slg0Var.f165194f = (tfg0) s7g0Var.f162913b.f71265a.get(slg0Var.f165190b);
                }
                ocg0 ocg0Var = (ocg0) a7g0Var.m95289b(slg0Var, slg0Var.f165194f);
                pog0 pog0Var = vjg0Var.f181703b;
                if (pog0Var != null) {
                    pog0Var.m170557a(slg0Var, i, exc, ocg0Var);
                } else if (vjg0Var.f181702a != null) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
