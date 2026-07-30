package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class cqw0 {
    /* JADX INFO: renamed from: a */
    public static int m111993a(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* JADX INFO: renamed from: b */
    public static int m111994b(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iM146641b = jqw0.m146641b(obj);
        int i2 = iM146641b & i;
        int iM111995c = m111995c(obj3, i2);
        if (iM111995c != 0) {
            int i3 = ~i;
            int i4 = iM146641b & i3;
            int i5 = -1;
            while (true) {
                int i6 = iM111995c - 1;
                int i7 = iArr[i6];
                int i8 = i7 & i;
                if ((i7 & i3) != i4 || !kow0.m150688a(obj, objArr[i6]) || (objArr2 != null && !kow0.m150688a(obj2, objArr2[i6]))) {
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    iM111995c = i8;
                } else {
                    if (i5 == -1) {
                        m111997e(obj3, i2, i8);
                        return i6;
                    }
                    iArr[i5] = (iArr[i5] & i3) | (i8 & i);
                    return i6;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static int m111995c(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    /* JADX INFO: renamed from: d */
    public static Object m111996d(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            za50.m219101a("must be power of 2 between 2^1 and 2^30: ", i);
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    /* JADX INFO: renamed from: e */
    public static void m111997e(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
