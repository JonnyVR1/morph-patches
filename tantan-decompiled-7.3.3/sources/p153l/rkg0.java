package p153l;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public abstract class rkg0 implements vjg0 {

    /* JADX INFO: renamed from: a */
    public final dsg0 f163619a;

    public rkg0(dsg0 dsg0Var) {
        this.f163619a = dsg0Var;
        dsg0Var.f90476a = this;
    }

    /* JADX INFO: renamed from: e */
    public final void m181852e(aug0 aug0Var, int i, long j) {
        dsg0 dsg0Var = this.f163619a;
        ifg0 ifg0Var = dsg0Var.f90478c;
        if (aug0Var.f73497f == null) {
            agg0 agg0Var = jwg0.m147162a().f122921c;
            aug0Var.f73497f = (bog0) agg0Var.f71160b.f117696a.get(aug0Var.f73493b);
        }
        wkg0 wkg0Var = (wkg0) ifg0Var.m139728a(aug0Var);
        if (wkg0Var == null) {
            return;
        }
        xwg0 xwg0Var = dsg0Var.f90477b;
        if (xwg0Var == null) {
            if (dsg0Var.f90476a != null) {
                return;
            }
            return;
        }
        sug0 sug0Var = (sug0) wkg0Var;
        synchronized (((yeg0) sug0Var.f170686f.get(i))) {
            SystemClock.uptimeMillis();
        }
        if (xwg0Var.f196499a != null) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m181853f(aug0 aug0Var, bog0 bog0Var) {
        log0 log0Var;
        dsg0 dsg0Var = this.f163619a;
        ifg0 ifg0Var = dsg0Var.f90478c;
        zrg0 zrg0Var = ifg0Var.f114664c;
        int i = aug0Var.f73493b;
        zrg0Var.getClass();
        sug0 sug0Var = new sug0(i);
        synchronized (ifg0Var) {
            try {
                if (ifg0Var.f114662a == null) {
                    ifg0Var.f114662a = sug0Var;
                } else {
                    ifg0Var.f114663b.put(aug0Var.f73493b, sug0Var);
                }
                if (bog0Var != null) {
                    sug0Var.m188025a(bog0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        xwg0 xwg0Var = dsg0Var.f90477b;
        if (xwg0Var == null || (log0Var = xwg0Var.f196499a) == null) {
            return;
        }
        log0Var.mo177303b(bog0Var);
    }

    /* JADX INFO: renamed from: g */
    public final void m181854g(aug0 aug0Var, bog0 bog0Var, int i) {
        log0 log0Var;
        dsg0 dsg0Var = this.f163619a;
        ifg0 ifg0Var = dsg0Var.f90478c;
        zrg0 zrg0Var = ifg0Var.f114664c;
        int i2 = aug0Var.f73493b;
        zrg0Var.getClass();
        sug0 sug0Var = new sug0(i2);
        synchronized (ifg0Var) {
            try {
                if (ifg0Var.f114662a == null) {
                    ifg0Var.f114662a = sug0Var;
                } else {
                    ifg0Var.f114663b.put(aug0Var.f73493b, sug0Var);
                }
                if (bog0Var != null) {
                    sug0Var.m188025a(bog0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        xwg0 xwg0Var = dsg0Var.f90477b;
        if (xwg0Var == null || (log0Var = xwg0Var.f196499a) == null) {
            return;
        }
        log0Var.mo177303b(bog0Var);
    }

    /* JADX INFO: renamed from: h */
    public final void m181855h(aug0 aug0Var, int i, long j) {
        dsg0 dsg0Var = this.f163619a;
        ifg0 ifg0Var = dsg0Var.f90478c;
        if (aug0Var.f73497f == null) {
            aug0Var.f73497f = (bog0) jwg0.m147162a().f122921c.f71160b.f117696a.get(aug0Var.f73493b);
        }
        wkg0 wkg0Var = (wkg0) ifg0Var.m139728a(aug0Var);
        if (wkg0Var == null) {
            return;
        }
        wkg0Var.f189550d.put(i, Long.valueOf(((Long) wkg0Var.f189550d.get(i)).longValue() + j));
        wkg0Var.f189549c += j;
        xwg0 xwg0Var = dsg0Var.f90477b;
        if (xwg0Var != null) {
            sug0 sug0Var = (sug0) wkg0Var;
            yeg0 yeg0Var = (yeg0) sug0Var.f170686f.get(i);
            synchronized (yeg0Var) {
                if (yeg0Var.f199346a == 0) {
                    yeg0Var.f199346a = SystemClock.uptimeMillis();
                }
            }
            sug0Var.f170685e.m215411a(j);
            if (xwg0Var.f196499a != null) {
                ((Long) wkg0Var.f189550d.get(i)).getClass();
                xwg0Var.f196499a.mo177304d(wkg0Var.f189549c);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m181856i(aug0 aug0Var, int i, Exception exc) {
        dsg0 dsg0Var = this.f163619a;
        synchronized (dsg0Var) {
            try {
                ifg0 ifg0Var = dsg0Var.f90478c;
                if (aug0Var.f73497f == null) {
                    agg0 agg0Var = jwg0.m147162a().f122921c;
                    aug0Var.f73497f = (bog0) agg0Var.f71160b.f117696a.get(aug0Var.f73493b);
                }
                wkg0 wkg0Var = (wkg0) ifg0Var.m139729b(aug0Var, aug0Var.f73497f);
                xwg0 xwg0Var = dsg0Var.f90477b;
                if (xwg0Var != null) {
                    xwg0Var.m213351a(aug0Var, i, exc, wkg0Var);
                } else if (dsg0Var.f90476a != null) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
