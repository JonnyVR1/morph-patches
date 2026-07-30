package p153l;

import android.net.Uri;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class nht0 extends ugt0 implements ret0 {

    /* JADX INFO: renamed from: d */
    public set0 f142059d;

    /* JADX INFO: renamed from: e */
    public String f142060e;

    /* JADX INFO: renamed from: f */
    public boolean f142061f;

    /* JADX INFO: renamed from: g */
    public boolean f142062g;

    /* JADX INFO: renamed from: h */
    public mgt0 f142063h;

    /* JADX INFO: renamed from: i */
    public long f142064i;

    /* JADX INFO: renamed from: j */
    public long f142065j;

    public nht0(bft0 bft0Var, aft0 aft0Var) {
        super(bft0Var);
        fit0 fit0Var = new fit0(bft0Var.getContext(), aft0Var, (bft0) this.f178933c.get(), null);
        dct0.m115297f("ExoPlayerAdapter initialized.");
        this.f142059d = fit0Var;
        fit0Var.mo125728C(this);
    }

    /* JADX INFO: renamed from: A */
    public static String m163234A(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    /* JADX INFO: renamed from: z */
    public static final String m163235z(String str) {
        return "cache:".concat(String.valueOf(obt0.m167038g(str)));
    }

    /* JADX INFO: renamed from: B */
    public final void m163236B(long j) {
        C2098b.f9751l.postDelayed(new Runnable() { // from class: l.mht0
            @Override // java.lang.Runnable
            public final void run() {
                this.f136878a.m163244y();
            }
        }, j);
    }

    @Override // p153l.ret0
    /* JADX INFO: renamed from: b */
    public final void mo13701b() {
        dct0.m115298g("Precache onRenderedFirstFrame");
    }

    @Override // p153l.ret0
    /* JADX INFO: renamed from: c */
    public final void mo13703c(String str, Exception exc) {
        dct0.m115299h("Precache exception", exc);
        bxy0.m106933q().m120274v(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // p153l.ret0
    /* JADX INFO: renamed from: d */
    public final void mo13704d(final boolean z, final long j) {
        final bft0 bft0Var = (bft0) this.f178933c.get();
        if (bft0Var != null) {
            oct0.f146737e.execute(new Runnable() { // from class: l.lht0
                @Override // java.lang.Runnable
                public final void run() {
                    bft0Var.mo13714K(z, j);
                }
            });
        }
    }

    @Override // p153l.ret0
    /* JADX INFO: renamed from: e */
    public final void mo13705e(String str, Exception exc) {
        dct0.m115299h("Precache error", exc);
        bxy0.m106933q().m120274v(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // p153l.ugt0
    /* JADX INFO: renamed from: g */
    public final void mo140035g() {
        synchronized (this) {
            this.f142061f = true;
            notify();
            release();
        }
        String str = this.f142060e;
        if (str != null) {
            m195942h(this.f142060e, m163235z(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // p153l.ugt0
    /* JADX INFO: renamed from: q */
    public final void mo163237q(int i) {
        this.f142059d.mo125726A(i);
    }

    @Override // p153l.ugt0
    /* JADX INFO: renamed from: r */
    public final void mo163238r(int i) {
        this.f142059d.mo125727B(i);
    }

    @Override // p153l.ugt0, com.google.android.gms.common.api.Releasable
    public final void release() {
        set0 set0Var = this.f142059d;
        if (set0Var != null) {
            set0Var.mo125728C(null);
            this.f142059d.mo125758y();
        }
    }

    @Override // p153l.ugt0
    /* JADX INFO: renamed from: s */
    public final void mo163239s(int i) {
        this.f142059d.mo125729D(i);
    }

    @Override // p153l.ugt0
    /* JADX INFO: renamed from: t */
    public final void mo163240t(int i) {
        this.f142059d.mo125730E(i);
    }

    @Override // p153l.ugt0
    /* JADX INFO: renamed from: u */
    public final boolean mo140036u(String str) {
        return mo163241v(str, new String[]{str});
    }

    @Override // p153l.ugt0
    /* JADX INFO: renamed from: v */
    public final boolean mo163241v(String str, String[] strArr) {
        long j;
        long j2;
        long j3;
        this.f142060e = str;
        String strM163235z = m163235z(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.f142059d.mo125756w(uriArr, this.f178932b);
            bft0 bft0Var = (bft0) this.f178933c.get();
            if (bft0Var != null) {
                bft0Var.mo13741g(strM163235z, this);
            }
            Clock clockM106918b = bxy0.m106918b();
            long jCurrentTimeMillis = clockM106918b.currentTimeMillis();
            long jLongValue = ((Long) jas0.m144075c().m176505a(sgs0.f168533y)).longValue();
            long jLongValue2 = ((Long) jas0.m144075c().m176505a(sgs0.f168521x)).longValue() * 1000;
            long jIntValue = ((Integer) jas0.m144075c().m176505a(sgs0.f168509w)).intValue();
            boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168109Q1)).booleanValue();
            long j4 = -1;
            while (true) {
                synchronized (this) {
                    if (clockM106918b.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                        throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                    }
                    if (this.f142061f) {
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    if (!this.f142062g) {
                        if (!this.f142059d.mo125738M()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jMo125745V = this.f142059d.mo125745V();
                        if (jMo125745V > 0) {
                            long jMo125741R = this.f142059d.mo125741R();
                            if (jMo125741R != j4) {
                                long j5 = jLongValue;
                                j3 = jMo125741R;
                                j2 = jMo125745V;
                                j = j5;
                                m195946p(str, strM163235z, j3, j2, jMo125741R > 0, zBooleanValue ? this.f142059d.mo125753r() : -1L, zBooleanValue ? this.f142059d.mo125743T() : -1L, zBooleanValue ? this.f142059d.mo125754s() : -1L, set0.m185572O(), set0.m185573Q());
                                j4 = j3;
                            } else {
                                j = jLongValue;
                                j2 = jMo125745V;
                                j3 = jMo125741R;
                            }
                            if (j3 >= j2) {
                                m195944m(str, strM163235z, j2);
                            } else if (this.f142059d.mo125742S() < jIntValue || j3 <= 0) {
                                jLongValue = j;
                            }
                        } else {
                            jLongValue2 = jLongValue2;
                            jIntValue = jIntValue;
                        }
                        try {
                            wait(jLongValue);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    }
                    return true;
                }
                return true;
                jIntValue = jIntValue;
                jLongValue2 = jLongValue2;
            }
        } catch (Exception e) {
            dct0.m115298g("Failed to preload url " + str + " Exception: " + e.getMessage());
            bxy0.m106933q().m120274v(e, "VideoStreamExoPlayerCache.preload");
            release();
            m195942h(str, strM163235z, "error", m163234A("error", e));
            return false;
        }
    }

    @Override // p153l.ugt0
    /* JADX INFO: renamed from: w */
    public final boolean mo163242w(String str, String[] strArr, mgt0 mgt0Var) {
        this.f142060e = str;
        this.f142063h = mgt0Var;
        String strM163235z = m163235z(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.f142059d.mo125756w(uriArr, this.f178932b);
            bft0 bft0Var = (bft0) this.f178933c.get();
            if (bft0Var != null) {
                bft0Var.mo13741g(strM163235z, this);
            }
            this.f142064i = bxy0.m106918b().currentTimeMillis();
            this.f142065j = -1L;
            m163236B(0L);
            return true;
        } catch (Exception e) {
            dct0.m115298g("Failed to preload url " + str + " Exception: " + e.getMessage());
            bxy0.m106933q().m120274v(e, "VideoStreamExoPlayerCache.preload");
            release();
            m195942h(str, strM163235z, "error", m163234A("error", e));
            return false;
        }
    }

    /* JADX INFO: renamed from: x */
    public final set0 m163243x() {
        synchronized (this) {
            this.f142062g = true;
            notify();
        }
        this.f142059d.mo125728C(null);
        set0 set0Var = this.f142059d;
        this.f142059d = null;
        return set0Var;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m163244y() {
        long j;
        long j2;
        long j3;
        String strM163235z = m163235z(this.f142060e);
        try {
            long jLongValue = ((Long) jas0.m144075c().m176505a(sgs0.f168521x)).longValue() * 1000;
            long jIntValue = ((Integer) jas0.m144075c().m176505a(sgs0.f168509w)).intValue();
            boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168109Q1)).booleanValue();
            synchronized (this) {
                if (bxy0.m106918b().currentTimeMillis() - this.f142064i > jLongValue) {
                    throw new IOException("Timeout reached. Limit: " + jLongValue + " ms");
                }
                if (this.f142061f) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!this.f142062g) {
                    if (!this.f142059d.mo125738M()) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long jMo125745V = this.f142059d.mo125745V();
                    if (jMo125745V > 0) {
                        long jMo125741R = this.f142059d.mo125741R();
                        if (jMo125741R != this.f142065j) {
                            j2 = jMo125745V;
                            j3 = jMo125741R;
                            j = jIntValue;
                            m195946p(this.f142060e, strM163235z, j3, j2, jMo125741R > 0, zBooleanValue ? this.f142059d.mo125753r() : -1L, zBooleanValue ? this.f142059d.mo125743T() : -1L, zBooleanValue ? this.f142059d.mo125754s() : -1L, set0.m185572O(), set0.m185573Q());
                            this.f142065j = j3;
                        } else {
                            j = jIntValue;
                            j2 = jMo125745V;
                            j3 = jMo125741R;
                        }
                        if (j3 >= j2) {
                            m195944m(this.f142060e, strM163235z, j2);
                        } else if (this.f142059d.mo125742S() >= j && j3 > 0) {
                        }
                    }
                    m163236B(((Long) jas0.m144075c().m176505a(sgs0.f168533y)).longValue());
                    return;
                }
                bxy0.m106915A().m163009f(this.f142063h);
            }
        } catch (Exception e) {
            dct0.m115298g("Failed to preload url " + this.f142060e + " Exception: " + e.getMessage());
            bxy0.m106933q().m120274v(e, "VideoStreamExoPlayerCache.preload");
            release();
            m195942h(this.f142060e, strM163235z, "error", m163234A("error", e));
        }
    }

    @Override // p153l.ret0
    public final void zzm(int i) {
    }

    @Override // p153l.ret0
    /* JADX INFO: renamed from: a */
    public final void mo13699a(int i, int i2) {
    }
}
