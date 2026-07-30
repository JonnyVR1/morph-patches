package p149l;

import android.net.Uri;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class h8t0 extends o7t0 implements l5t0 {

    /* JADX INFO: renamed from: d */
    public m5t0 f106464d;

    /* JADX INFO: renamed from: e */
    public String f106465e;

    /* JADX INFO: renamed from: f */
    public boolean f106466f;

    /* JADX INFO: renamed from: g */
    public boolean f106467g;

    /* JADX INFO: renamed from: h */
    public g7t0 f106468h;

    /* JADX INFO: renamed from: i */
    public long f106469i;

    /* JADX INFO: renamed from: j */
    public long f106470j;

    public h8t0(v5t0 v5t0Var, u5t0 u5t0Var) {
        super(v5t0Var);
        z8t0 z8t0Var = new z8t0(v5t0Var.getContext(), u5t0Var, (v5t0) this.f142543c.get(), null);
        x2t0.m206868f("ExoPlayerAdapter initialized.");
        this.f106464d = z8t0Var;
        z8t0Var.mo153155C(this);
    }

    /* JADX INFO: renamed from: A */
    public static String m129895A(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    /* JADX INFO: renamed from: z */
    public static final String m129896z(String str) {
        return "cache:".concat(String.valueOf(i2t0.m134085g(str)));
    }

    /* JADX INFO: renamed from: B */
    public final void m129897B(long j) {
        C2075b.f9714l.postDelayed(new Runnable() { // from class: l.g8t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f101518a.m129905y();
            }
        }, j);
    }

    @Override // p149l.l5t0
    /* JADX INFO: renamed from: b */
    public final void mo13647b() {
        x2t0.m206869g("Precache onRenderedFirstFrame");
    }

    @Override // p149l.l5t0
    /* JADX INFO: renamed from: c */
    public final void mo13649c(String str, Exception exc) {
        x2t0.m206870h("Precache exception", exc);
        vny0.m199079q().m212289v(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // p149l.l5t0
    /* JADX INFO: renamed from: d */
    public final void mo13650d(final boolean z, final long j) {
        final v5t0 v5t0Var = (v5t0) this.f142543c.get();
        if (v5t0Var != null) {
            i3t0.f111376e.execute(new Runnable() { // from class: l.f8t0
                @Override // java.lang.Runnable
                public final void run() {
                    v5t0Var.mo13660K(z, j);
                }
            });
        }
    }

    @Override // p149l.l5t0
    /* JADX INFO: renamed from: e */
    public final void mo13651e(String str, Exception exc) {
        x2t0.m206870h("Precache error", exc);
        vny0.m199079q().m212289v(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // p149l.o7t0
    /* JADX INFO: renamed from: g */
    public final void mo105821g() {
        synchronized (this) {
            this.f106466f = true;
            notify();
            release();
        }
        String str = this.f106465e;
        if (str != null) {
            m163063h(this.f106465e, m129896z(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // p149l.o7t0
    /* JADX INFO: renamed from: q */
    public final void mo129898q(int i) {
        this.f106464d.mo153153A(i);
    }

    @Override // p149l.o7t0
    /* JADX INFO: renamed from: r */
    public final void mo129899r(int i) {
        this.f106464d.mo153154B(i);
    }

    @Override // p149l.o7t0, com.google.android.gms.common.api.Releasable
    public final void release() {
        m5t0 m5t0Var = this.f106464d;
        if (m5t0Var != null) {
            m5t0Var.mo153155C(null);
            this.f106464d.mo153178y();
        }
    }

    @Override // p149l.o7t0
    /* JADX INFO: renamed from: s */
    public final void mo129900s(int i) {
        this.f106464d.mo153156D(i);
    }

    @Override // p149l.o7t0
    /* JADX INFO: renamed from: t */
    public final void mo129901t(int i) {
        this.f106464d.mo153157E(i);
    }

    @Override // p149l.o7t0
    /* JADX INFO: renamed from: u */
    public final boolean mo105822u(String str) {
        return mo129902v(str, new String[]{str});
    }

    @Override // p149l.o7t0
    /* JADX INFO: renamed from: v */
    public final boolean mo129902v(String str, String[] strArr) {
        long j;
        long j2;
        long j3;
        this.f106465e = str;
        String strM129896z = m129896z(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.f106464d.mo153176w(uriArr, this.f142542b);
            v5t0 v5t0Var = (v5t0) this.f142543c.get();
            if (v5t0Var != null) {
                v5t0Var.mo13687g(strM129896z, this);
            }
            Clock clockM199064b = vny0.m199064b();
            long jCurrentTimeMillis = clockM199064b.currentTimeMillis();
            long jLongValue = ((Long) d1s0.m109677c().m144697a(m7s0.f132462y)).longValue();
            long jLongValue2 = ((Long) d1s0.m109677c().m144697a(m7s0.f132450x)).longValue() * 1000;
            long jIntValue = ((Integer) d1s0.m109677c().m144697a(m7s0.f132438w)).intValue();
            boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132038Q1)).booleanValue();
            long j4 = -1;
            while (true) {
                synchronized (this) {
                    if (clockM199064b.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                        throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                    }
                    if (this.f106466f) {
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    if (!this.f106467g) {
                        if (!this.f106464d.mo153165M()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jMo153172V = this.f106464d.mo153172V();
                        if (jMo153172V > 0) {
                            long jMo153168R = this.f106464d.mo153168R();
                            if (jMo153168R != j4) {
                                long j5 = jLongValue;
                                j3 = jMo153168R;
                                j2 = jMo153172V;
                                j = j5;
                                m163067p(str, strM129896z, j3, j2, jMo153168R > 0, zBooleanValue ? this.f106464d.mo153173r() : -1L, zBooleanValue ? this.f106464d.mo153170T() : -1L, zBooleanValue ? this.f106464d.mo153174s() : -1L, m5t0.m153149O(), m5t0.m153150Q());
                                j4 = j3;
                            } else {
                                j = jLongValue;
                                j2 = jMo153172V;
                                j3 = jMo153168R;
                            }
                            if (j3 >= j2) {
                                m163065m(str, strM129896z, j2);
                            } else if (this.f106464d.mo153169S() < jIntValue || j3 <= 0) {
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
            x2t0.m206869g("Failed to preload url " + str + " Exception: " + e.getMessage());
            vny0.m199079q().m212289v(e, "VideoStreamExoPlayerCache.preload");
            release();
            m163063h(str, strM129896z, "error", m129895A("error", e));
            return false;
        }
    }

    @Override // p149l.o7t0
    /* JADX INFO: renamed from: w */
    public final boolean mo129903w(String str, String[] strArr, g7t0 g7t0Var) {
        this.f106465e = str;
        this.f106468h = g7t0Var;
        String strM129896z = m129896z(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.f106464d.mo153176w(uriArr, this.f142542b);
            v5t0 v5t0Var = (v5t0) this.f142543c.get();
            if (v5t0Var != null) {
                v5t0Var.mo13687g(strM129896z, this);
            }
            this.f106469i = vny0.m199064b().currentTimeMillis();
            this.f106470j = -1L;
            m129897B(0L);
            return true;
        } catch (Exception e) {
            x2t0.m206869g("Failed to preload url " + str + " Exception: " + e.getMessage());
            vny0.m199079q().m212289v(e, "VideoStreamExoPlayerCache.preload");
            release();
            m163063h(str, strM129896z, "error", m129895A("error", e));
            return false;
        }
    }

    /* JADX INFO: renamed from: x */
    public final m5t0 m129904x() {
        synchronized (this) {
            this.f106467g = true;
            notify();
        }
        this.f106464d.mo153155C(null);
        m5t0 m5t0Var = this.f106464d;
        this.f106464d = null;
        return m5t0Var;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m129905y() {
        long j;
        long j2;
        long j3;
        String strM129896z = m129896z(this.f106465e);
        try {
            long jLongValue = ((Long) d1s0.m109677c().m144697a(m7s0.f132450x)).longValue() * 1000;
            long jIntValue = ((Integer) d1s0.m109677c().m144697a(m7s0.f132438w)).intValue();
            boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132038Q1)).booleanValue();
            synchronized (this) {
                if (vny0.m199064b().currentTimeMillis() - this.f106469i > jLongValue) {
                    throw new IOException("Timeout reached. Limit: " + jLongValue + " ms");
                }
                if (this.f106466f) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!this.f106467g) {
                    if (!this.f106464d.mo153165M()) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long jMo153172V = this.f106464d.mo153172V();
                    if (jMo153172V > 0) {
                        long jMo153168R = this.f106464d.mo153168R();
                        if (jMo153168R != this.f106470j) {
                            j2 = jMo153172V;
                            j3 = jMo153168R;
                            j = jIntValue;
                            m163067p(this.f106465e, strM129896z, j3, j2, jMo153168R > 0, zBooleanValue ? this.f106464d.mo153173r() : -1L, zBooleanValue ? this.f106464d.mo153170T() : -1L, zBooleanValue ? this.f106464d.mo153174s() : -1L, m5t0.m153149O(), m5t0.m153150Q());
                            this.f106470j = j3;
                        } else {
                            j = jIntValue;
                            j2 = jMo153172V;
                            j3 = jMo153168R;
                        }
                        if (j3 >= j2) {
                            m163065m(this.f106465e, strM129896z, j2);
                        } else if (this.f106464d.mo153169S() >= j && j3 > 0) {
                        }
                    }
                    m129897B(((Long) d1s0.m109677c().m144697a(m7s0.f132462y)).longValue());
                    return;
                }
                vny0.m199061A().m129794f(this.f106468h);
            }
        } catch (Exception e) {
            x2t0.m206869g("Failed to preload url " + this.f106465e + " Exception: " + e.getMessage());
            vny0.m199079q().m212289v(e, "VideoStreamExoPlayerCache.preload");
            release();
            m163063h(this.f106465e, strM129896z, "error", m129895A("error", e));
        }
    }

    @Override // p149l.l5t0
    public final void zzm(int i) {
    }

    @Override // p149l.l5t0
    /* JADX INFO: renamed from: a */
    public final void mo13645a(int i, int i2) {
    }
}
