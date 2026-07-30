package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class a7y {

    /* JADX INFO: renamed from: a */
    private long f68857a;

    /* JADX INFO: renamed from: b */
    private long f68858b;

    /* JADX INFO: renamed from: c */
    private long f68859c;

    /* JADX INFO: renamed from: d */
    private long f68860d;

    /* JADX INFO: renamed from: l.a7y$b */
    public static class C15668b {

        /* JADX INFO: renamed from: a */
        private static a7y f68861a = new a7y();
    }

    private a7y() {
        this.f68857a = 0L;
        this.f68858b = 0L;
        this.f68859c = 0L;
        this.f68860d = 7200000L;
    }

    /* JADX INFO: renamed from: a */
    public static a7y m96388a() {
        return C15668b.f68861a;
    }

    /* JADX INFO: renamed from: b */
    public long m96389b() {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f68857a;
        if (m96391d()) {
            jCurrentTimeMillis = m96390c();
            z = true;
        } else {
            z = false;
        }
        esx.m122396a("MediaTimeUtils", "getNetAnchorTime " + jCurrentTimeMillis + " / " + z);
        return jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: c */
    public long m96390c() {
        return System.currentTimeMillis() - this.f68859c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m96391d() {
        return this.f68858b != 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean m96392e() {
        return !m96391d() || m96390c() - this.f68858b > this.f68860d;
    }

    /* JADX INFO: renamed from: f */
    public void m96393f(long j, long j2) {
        this.f68858b = j + j2;
        this.f68859c = System.currentTimeMillis() - this.f68858b;
        esx.m122399d("HttpRequester", "momoNtpTimeMs " + this.f68859c + " / cost " + j2);
    }
}
