package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class l3x {
    /* JADX INFO: renamed from: a */
    public static int m148410a(hq3 hq3Var) {
        return m148411b(hq3Var, true) + m148411b(hq3Var, false);
    }

    /* JADX INFO: renamed from: b */
    public static int m148411b(hq3 hq3Var, boolean z) {
        int iM132424d = z ? hq3Var.m132424d() : hq3Var.m132425e();
        int iM132425e = z ? hq3Var.m132425e() : hq3Var.m132424d();
        byte[][] bArrM132423c = hq3Var.m132423c();
        int i = 0;
        for (int i2 = 0; i2 < iM132424d; i2++) {
            byte b = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < iM132425e; i4++) {
                byte b2 = z ? bArrM132423c[i2][i4] : bArrM132423c[i4][i2];
                if (b2 == b) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += i3 - 2;
                    }
                    i3 = 1;
                    b = b2;
                }
            }
            if (i3 >= 5) {
                i += i3 - 2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static int m148412c(hq3 hq3Var) {
        byte[][] bArrM132423c = hq3Var.m132423c();
        int iM132425e = hq3Var.m132425e();
        int iM132424d = hq3Var.m132424d();
        int i = 0;
        for (int i2 = 0; i2 < iM132424d - 1; i2++) {
            byte[] bArr = bArrM132423c[i2];
            int i3 = 0;
            while (i3 < iM132425e - 1) {
                byte b = bArr[i3];
                int i4 = i3 + 1;
                if (b == bArr[i4]) {
                    byte[] bArr2 = bArrM132423c[i2 + 1];
                    if (b == bArr2[i3] && b == bArr2[i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    /* JADX INFO: renamed from: d */
    public static int m148413d(hq3 hq3Var) {
        byte[][] bArrM132423c = hq3Var.m132423c();
        int iM132425e = hq3Var.m132425e();
        int iM132424d = hq3Var.m132424d();
        int i = 0;
        for (int i2 = 0; i2 < iM132424d; i2++) {
            for (int i3 = 0; i3 < iM132425e; i3++) {
                byte[] bArr = bArrM132423c[i2];
                int i4 = i3 + 6;
                if (i4 < iM132425e && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (m148416g(bArr, i3 - 4, i3) || m148416g(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < iM132424d && bArrM132423c[i2][i3] == 1 && bArrM132423c[i2 + 1][i3] == 0 && bArrM132423c[i2 + 2][i3] == 1 && bArrM132423c[i2 + 3][i3] == 1 && bArrM132423c[i2 + 4][i3] == 1 && bArrM132423c[i2 + 5][i3] == 0 && bArrM132423c[i5][i3] == 1 && (m148417h(bArrM132423c, i3, i2 - 4, i2) || m148417h(bArrM132423c, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    /* JADX INFO: renamed from: e */
    public static int m148414e(hq3 hq3Var) {
        byte[][] bArrM132423c = hq3Var.m132423c();
        int iM132425e = hq3Var.m132425e();
        int iM132424d = hq3Var.m132424d();
        int i = 0;
        for (int i2 = 0; i2 < iM132424d; i2++) {
            byte[] bArr = bArrM132423c[i2];
            for (int i3 = 0; i3 < iM132425e; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int iM132424d2 = hq3Var.m132424d() * hq3Var.m132425e();
        return ((Math.abs((i << 1) - iM132424d2) * 10) / iM132424d2) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x003c A[RETURN] */
    /* JADX INFO: renamed from: f */
    public static boolean m148415f(int i, int i2, int i3) {
        int i4;
        int i5;
        switch (i) {
            case 0:
                i3 += i2;
                i4 = i3 & 1;
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 1:
                i4 = i3 & 1;
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 2:
                i4 = i2 % 3;
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 3:
                i4 = (i3 + i2) % 3;
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 4:
                i3 /= 2;
                i2 /= 3;
                i3 += i2;
                i4 = i3 & 1;
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 5:
                int i6 = i3 * i2;
                i4 = (i6 & 1) + (i6 % 3);
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 6:
                int i7 = i3 * i2;
                i5 = (i7 & 1) + (i7 % 3);
                i4 = i5 & 1;
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 7:
                i5 = ((i3 * i2) % 3) + ((i3 + i2) & 1);
                i4 = i5 & 1;
                if (i4 == 0) {
                    return true;
                }
                return false;
            default:
                ig3.m135964a("Invalid mask pattern: ".concat(String.valueOf(i)));
                return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m148416g(byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, bArr.length);
        for (int iMax = Math.max(i, 0); iMax < iMin; iMax++) {
            if (bArr[iMax] == 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m148417h(byte[][] bArr, int i, int i2, int i3) {
        int iMin = Math.min(i3, bArr.length);
        for (int iMax = Math.max(i2, 0); iMax < iMin; iMax++) {
            if (bArr[iMax][i] == 1) {
                return false;
            }
        }
        return true;
    }
}
