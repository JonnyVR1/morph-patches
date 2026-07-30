package p153l;

import com.google.android.gms.internal.ads.C2317y5;
import com.google.android.gms.internal.ads.zzhag;

/* JADX INFO: loaded from: classes6.dex */
public final class fmx0 extends emx0 {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r12[r13] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r12[r13] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0080, code lost:
    
        if (r12[r13] <= (-65)) goto L11;
     */
    @Override // p153l.emx0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo121387a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        if (i != 0) {
            if (i2 >= i3) {
                return i;
            }
            byte b = (byte) i;
            if (b < -32) {
                if (b >= -62) {
                    i5 = i2 + 1;
                }
                return -1;
            }
            int i6 = ~(i >> 8);
            if (b < -16) {
                byte b2 = (byte) i6;
                if (b2 == 0) {
                    int i7 = i2 + 1;
                    byte b3 = bArr[i2];
                    if (i7 >= i3) {
                        return C2317y5.m13557k(b, b3);
                    }
                    i2 = i7;
                    b2 = b3;
                }
                if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                    i5 = i2 + 1;
                }
                return -1;
            }
            byte b4 = (byte) i6;
            if (b4 == 0) {
                int i8 = i2 + 1;
                b4 = bArr[i2];
                if (i8 >= i3) {
                    return C2317y5.m13557k(b, b4);
                }
                i2 = i8;
                i4 = 0;
            } else {
                i4 = i >> 16;
            }
            if (i4 == 0) {
                int i9 = i2 + 1;
                byte b5 = bArr[i2];
                if (i9 >= i3) {
                    return C2317y5.m13558l(b, b4, b5);
                }
                i2 = i9;
                i4 = b5;
            }
            if (b4 <= -65 && (((b << 28) + (b4 + 112)) >> 30) == 0 && i4 <= -65) {
                i5 = i2 + 1;
            }
            return -1;
            i2 = i5;
        }
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i10 = i2 + 1;
            byte b6 = bArr[i2];
            if (b6 >= 0) {
                i2 = i10;
            } else {
                if (b6 < -32) {
                    if (i10 >= i3) {
                        return b6;
                    }
                    if (b6 >= -62) {
                        i2 += 2;
                        if (bArr[i10] > -65) {
                        }
                    }
                    return -1;
                }
                if (b6 >= -16) {
                    if (i10 >= i3 - 2) {
                        return C2317y5.m13549c(bArr, i10, i3);
                    }
                    int i11 = i2 + 2;
                    byte b7 = bArr[i10];
                    if (b7 <= -65 && (((b6 << 28) + (b7 + 112)) >> 30) == 0) {
                        int i12 = i2 + 3;
                        if (bArr[i11] <= -65) {
                            i2 += 4;
                            if (bArr[i12] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i10 >= i3 - 1) {
                    return C2317y5.m13549c(bArr, i10, i3);
                }
                int i13 = i2 + 2;
                byte b8 = bArr[i10];
                if (b8 > -65 || (b6 == -32 && b8 < -96)) {
                    return -1;
                }
                if (b6 == -19 && b8 >= -96) {
                    return -1;
                }
                i2 += 3;
                if (bArr[i13] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    @Override // p153l.emx0
    /* JADX INFO: renamed from: b */
    public final String mo121388b(byte[] bArr, int i, int i2) throws zzhag {
        int i3;
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
            zg3.m219589a("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b = bArr[i];
            if (!dmx0.m117035d(b)) {
                break;
            }
            i++;
            cArr[i5] = (char) b;
            i5++;
        }
        int i6 = i5;
        while (i < i4) {
            int i7 = i + 1;
            byte b2 = bArr[i];
            if (dmx0.m117035d(b2)) {
                cArr[i6] = (char) b2;
                i6++;
                i = i7;
                while (i < i4) {
                    byte b3 = bArr[i];
                    if (!dmx0.m117035d(b3)) {
                        break;
                    }
                    i++;
                    cArr[i6] = (char) b3;
                    i6++;
                }
            } else {
                if (dmx0.m117037f(b2)) {
                    if (i7 >= i4) {
                        throw zzhag.zzd();
                    }
                    i3 = i6 + 1;
                    i += 2;
                    dmx0.m117034c(b2, bArr[i7], cArr, i6);
                } else if (dmx0.m117036e(b2)) {
                    if (i7 >= i4 - 1) {
                        throw zzhag.zzd();
                    }
                    i3 = i6 + 1;
                    int i8 = i + 2;
                    i += 3;
                    dmx0.m117033b(b2, bArr[i7], bArr[i8], cArr, i6);
                } else {
                    if (i7 >= i4 - 2) {
                        throw zzhag.zzd();
                    }
                    byte b4 = bArr[i7];
                    int i9 = i + 3;
                    byte b5 = bArr[i + 2];
                    i += 4;
                    dmx0.m117032a(b2, b4, b5, bArr[i9], cArr, i6);
                    i6 += 2;
                }
                i6 = i3;
            }
        }
        return new String(cArr, 0, i6);
    }
}
