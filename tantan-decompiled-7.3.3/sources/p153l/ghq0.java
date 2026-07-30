package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class ghq0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f104139a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final long[] f104140b = new long[0];

    /* JADX INFO: renamed from: c */
    public static final float[] f104141c = new float[0];

    /* JADX INFO: renamed from: d */
    public static final double[] f104142d = new double[0];

    /* JADX INFO: renamed from: e */
    public static final boolean[] f104143e = new boolean[0];

    /* JADX INFO: renamed from: f */
    public static final String[] f104144f = new String[0];

    /* JADX INFO: renamed from: g */
    public static final byte[][] f104145g = new byte[0][];

    /* JADX INFO: renamed from: h */
    public static final byte[] f104146h = new byte[0];

    /* JADX INFO: renamed from: a */
    public static final int m130256a(nc5 nc5Var, int i) throws IOException {
        int iM162479b = nc5Var.m162479b();
        nc5Var.m162500x(i);
        int i2 = 1;
        while (nc5Var.m162497u() == i) {
            nc5Var.m162500x(i);
            i2++;
        }
        nc5Var.m162499w(iM162479b);
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m130257b(int i) {
        return i >>> 3;
    }

    /* JADX INFO: renamed from: c */
    public static int m130258c(int i) {
        return i & 7;
    }

    /* JADX INFO: renamed from: d */
    public static int m130259d(int i, int i2) {
        return (i << 3) | i2;
    }
}
