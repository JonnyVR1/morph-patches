package p009l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class o7j0 {
    /* JADX INFO: renamed from: a */
    public static double[] m19644a(double d, double d2) {
        double d3 = d2 - 105.0d;
        double d4 = d - 35.0d;
        double dM19645b = m19645b(d3, d4);
        double dM19646c = m19646c(d3, d4);
        double d5 = (d / 180.0d) * 3.141592653589793d;
        double dSin = Math.sin(d5);
        double d6 = 1.0d - ((0.006693421622965943d * dSin) * dSin);
        double dSqrt = Math.sqrt(d6);
        return new double[]{(dM19645b * 180.0d) / ((6335552.717000426d / (d6 * dSqrt)) * 3.141592653589793d), (dM19646c * 180.0d) / (((6378245.0d / dSqrt) * Math.cos(d5)) * 3.141592653589793d)};
    }

    /* JADX INFO: renamed from: b */
    public static double m19645b(double d, double d2) {
        double d3 = d * 2.0d;
        double dSqrt = (-100.0d) + d3 + (d2 * 3.0d) + (d2 * 0.2d * d2) + (0.1d * d * d2) + (Math.sqrt(Math.abs(d)) * 0.2d) + ((((Math.sin((6.0d * d) * 3.141592653589793d) * 20.0d) + (Math.sin(d3 * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d);
        double d4 = d2 * 3.141592653589793d;
        return dSqrt + ((((Math.sin(d4) * 20.0d) + (Math.sin((d2 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d2 / 12.0d) * 3.141592653589793d) * 160.0d) + (Math.sin(d4 / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    /* JADX INFO: renamed from: c */
    public static double m19646c(double d, double d2) {
        double d3 = d * 0.1d;
        return d + 300.0d + (d2 * 2.0d) + (d3 * d) + (d3 * d2) + (Math.sqrt(Math.abs(d)) * 0.1d) + ((((Math.sin((6.0d * d) * 3.141592653589793d) * 20.0d) + (Math.sin((d * 2.0d) * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d * 3.141592653589793d) * 20.0d) + (Math.sin((d / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d / 12.0d) * 3.141592653589793d) * 150.0d) + (Math.sin((d / 30.0d) * 3.141592653589793d) * 300.0d)) * 2.0d) / 3.0d);
    }
}
