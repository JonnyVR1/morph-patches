package p153l;

/* JADX INFO: loaded from: classes.dex */
public class mmj0 {

    /* JADX INFO: renamed from: d */
    public static mmj0 f137599d;

    /* JADX INFO: renamed from: a */
    public long f137600a;

    /* JADX INFO: renamed from: b */
    public long f137601b;

    /* JADX INFO: renamed from: c */
    public int f137602c;

    /* JADX INFO: renamed from: b */
    public static mmj0 m159072b() {
        if (f137599d == null) {
            f137599d = new mmj0();
        }
        return f137599d;
    }

    /* JADX INFO: renamed from: a */
    public void m159073a(long j, double d, double d2) {
        float f = (j - 946728000000L) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = f2;
        double dSin = (Math.sin(d3) * 0.03341960161924362d) + d3 + (Math.sin(2.0f * f2) * 3.4906598739326E-4d) + (Math.sin(f2 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double dRound = ((double) (Math.round(((double) (f - 9.0E-4f)) - d4) + 9.0E-4f)) + d4 + (Math.sin(d3) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d5 = 0.01745329238474369d * d;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d5) * Math.sin(dAsin))) / (Math.cos(d5) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f137602c = 1;
            this.f137600a = -1L;
            this.f137601b = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f137602c = 0;
                this.f137600a = -1L;
                this.f137601b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f137600a = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
            this.f137601b = jRound;
            if (jRound >= j || this.f137600a <= j) {
                this.f137602c = 1;
            } else {
                this.f137602c = 0;
            }
        }
    }
}
