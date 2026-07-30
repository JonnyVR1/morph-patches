package p153l;

/* JADX INFO: loaded from: classes2.dex */
public final class rlk0 {
    /* JADX INFO: renamed from: a */
    public static int m181996a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static int m181997b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: renamed from: c */
    public static int m181998c(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* JADX INFO: renamed from: d */
    public static int m181999d(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m181996a(b);
        }
        if (i3 == 1) {
            return m181997b(b, bArr[i]);
        }
        if (i3 == 2) {
            return m181998c(b, bArr[i], bArr[i + 1]);
        }
        aqg0.m99478a();
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m182000e(byte[] bArr) {
        return m182001f(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m182001f(byte[] bArr, int i, int i2) {
        return m182003h(bArr, i, i2) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r7[r8] > (-65)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        if (r7[r8] > (-65)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
    
        if (r7[r6] > (-65)) goto L53;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m182002g(int i, byte[] bArr, int i2, int i3) {
        byte b;
        int i4;
        int i5;
        if (i != 0) {
            if (i2 >= i3) {
                return i;
            }
            byte b2 = (byte) i;
            if (b2 < -32) {
                if (b2 >= -62) {
                    i5 = i2 + 1;
                }
                return -1;
            }
            if (b2 < -16) {
                byte b3 = (byte) (~(i >> 8));
                if (b3 == 0) {
                    int i6 = i2 + 1;
                    byte b4 = bArr[i2];
                    if (i6 >= i3) {
                        return m181997b(b2, b4);
                    }
                    i2 = i6;
                    b3 = b4;
                }
                if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                    i5 = i2 + 1;
                }
                return -1;
            }
            byte b5 = (byte) (~(i >> 8));
            if (b5 == 0) {
                i4 = i2 + 1;
                b5 = bArr[i2];
                if (i4 >= i3) {
                    return m181997b(b2, b5);
                }
                b = 0;
            } else {
                b = (byte) (i >> 16);
                i4 = i2;
            }
            if (b == 0) {
                int i7 = i4 + 1;
                byte b6 = bArr[i4];
                if (i7 >= i3) {
                    return m181998c(b2, b5, b6);
                }
                b = b6;
                i4 = i7;
            }
            if (b5 <= -65 && (((b2 << 28) + (b5 + 112)) >> 30) == 0 && b <= -65) {
                i2 = i4 + 1;
            }
            return -1;
            i2 = i5;
        }
        return m182003h(bArr, i2, i3);
    }

    /* JADX INFO: renamed from: h */
    public static int m182003h(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        return m182004i(bArr, i, i2);
    }

    /* JADX INFO: renamed from: i */
    public static int m182004i(byte[] bArr, int i, int i2) {
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return -1;
                }
                if (b >= -16) {
                    if (i3 >= i2 - 2) {
                        return m181999d(bArr, i3, i2);
                    }
                    int i4 = i + 2;
                    byte b2 = bArr[i3];
                    if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                        int i5 = i + 3;
                        if (bArr[i4] <= -65) {
                            i += 4;
                            if (bArr[i5] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i3 >= i2 - 1) {
                    return m181999d(bArr, i3, i2);
                }
                int i6 = i + 2;
                byte b3 = bArr[i3];
                if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                    i += 3;
                    if (bArr[i6] > -65) {
                    }
                }
                return -1;
            }
            i = i3;
        }
        return 0;
    }
}
