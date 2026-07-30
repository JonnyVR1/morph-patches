package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class dyx {

    /* JADX INFO: renamed from: a */
    private long f88438a;

    /* JADX INFO: renamed from: b */
    private long f88439b;

    /* JADX INFO: renamed from: c */
    private long f88440c;

    /* JADX INFO: renamed from: d */
    private long f88441d;

    /* JADX INFO: renamed from: l.dyx$b */
    public static class C16504b {

        /* JADX INFO: renamed from: a */
        private static dyx f88442a = new dyx();
    }

    private dyx() {
        this.f88438a = 0L;
        this.f88439b = 0L;
        this.f88440c = 0L;
        this.f88441d = 7200000L;
    }

    /* JADX INFO: renamed from: a */
    public static dyx m114098a() {
        return C16504b.f88442a;
    }

    /* JADX INFO: renamed from: b */
    public long m114099b() {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f88438a;
        if (m114101d()) {
            jCurrentTimeMillis = m114100c();
            z = true;
        } else {
            z = false;
        }
        hjx.m131418a("MediaTimeUtils", "getNetAnchorTime " + jCurrentTimeMillis + " / " + z);
        return jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: c */
    public long m114100c() {
        return System.currentTimeMillis() - this.f88440c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m114101d() {
        return this.f88439b != 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean m114102e() {
        return !m114101d() || m114100c() - this.f88439b > this.f88441d;
    }

    /* JADX INFO: renamed from: f */
    public void m114103f(long j, long j2) {
        this.f88439b = j + j2;
        this.f88440c = System.currentTimeMillis() - this.f88439b;
        hjx.m131421d("HttpRequester", "momoNtpTimeMs " + this.f88440c + " / cost " + j2);
    }
}
