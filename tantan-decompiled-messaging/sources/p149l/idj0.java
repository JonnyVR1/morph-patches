package p149l;

/* JADX INFO: loaded from: classes.dex */
public class idj0 {

    /* JADX INFO: renamed from: d */
    public static idj0 f112563d;

    /* JADX INFO: renamed from: a */
    public long f112564a;

    /* JADX INFO: renamed from: b */
    public long f112565b;

    /* JADX INFO: renamed from: c */
    public int f112566c;

    /* JADX INFO: renamed from: b */
    public static idj0 m135461b() {
        if (f112563d == null) {
            f112563d = new idj0();
        }
        return f112563d;
    }

    /* JADX INFO: renamed from: a */
    public void m135462a(long j, double d, double d2) {
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
            this.f112566c = 1;
            this.f112564a = -1L;
            this.f112565b = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f112566c = 0;
                this.f112564a = -1L;
                this.f112565b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f112564a = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
            this.f112565b = jRound;
            if (jRound >= j || this.f112564a <= j) {
                this.f112566c = 1;
            } else {
                this.f112566c = 0;
            }
        }
    }
}
