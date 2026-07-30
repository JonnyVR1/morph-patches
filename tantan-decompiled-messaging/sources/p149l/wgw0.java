package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class wgw0 {
    /* JADX INFO: renamed from: a */
    public static int m203081a(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* JADX INFO: renamed from: b */
    public static int m203082b(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iM111843b = dhw0.m111843b(obj);
        int i2 = iM111843b & i;
        int iM203083c = m203083c(obj3, i2);
        if (iM203083c != 0) {
            int i3 = ~i;
            int i4 = iM111843b & i3;
            int i5 = -1;
            while (true) {
                int i6 = iM203083c - 1;
                int i7 = iArr[i6];
                int i8 = i7 & i;
                if ((i7 & i3) != i4 || !efw0.m116096a(obj, objArr[i6]) || (objArr2 != null && !efw0.m116096a(obj2, objArr2[i6]))) {
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    iM203083c = i8;
                } else {
                    if (i5 == -1) {
                        m203085e(obj3, i2, i8);
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
    public static int m203083c(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    /* JADX INFO: renamed from: d */
    public static Object m203084d(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            k250.m144273a("must be power of 2 between 2^1 and 2^30: ", i);
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    /* JADX INFO: renamed from: e */
    public static void m203085e(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
