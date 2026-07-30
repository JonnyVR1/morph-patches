package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class b8q0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f74144a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final long[] f74145b = new long[0];

    /* JADX INFO: renamed from: c */
    public static final float[] f74146c = new float[0];

    /* JADX INFO: renamed from: d */
    public static final double[] f74147d = new double[0];

    /* JADX INFO: renamed from: e */
    public static final boolean[] f74148e = new boolean[0];

    /* JADX INFO: renamed from: f */
    public static final String[] f74149f = new String[0];

    /* JADX INFO: renamed from: g */
    public static final byte[][] f74150g = new byte[0][];

    /* JADX INFO: renamed from: h */
    public static final byte[] f74151h = new byte[0];

    /* JADX INFO: renamed from: a */
    public static final int m100784a(nb5 nb5Var, int i) throws IOException {
        int iM158734b = nb5Var.m158734b();
        nb5Var.m158755x(i);
        int i2 = 1;
        while (nb5Var.m158752u() == i) {
            nb5Var.m158755x(i);
            i2++;
        }
        nb5Var.m158754w(iM158734b);
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m100785b(int i) {
        return i >>> 3;
    }

    /* JADX INFO: renamed from: c */
    public static int m100786c(int i) {
        return i & 7;
    }

    /* JADX INFO: renamed from: d */
    public static int m100787d(int i, int i2) {
        return (i << 3) | i2;
    }
}
