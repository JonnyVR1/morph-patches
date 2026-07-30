package p153l;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.CharEncoding;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes8.dex */
public class te2 {

    /* JADX INFO: renamed from: l.te2$a */
    public static abstract class AbstractC20295a {

        /* JADX INFO: renamed from: a */
        public byte[] f173424a;

        /* JADX INFO: renamed from: b */
        public int f173425b;
    }

    /* JADX INFO: renamed from: l.te2$b */
    public static class C20296b extends AbstractC20295a {

        /* JADX INFO: renamed from: j */
        public static final byte[] f173426j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* JADX INFO: renamed from: k */
        public static final byte[] f173427k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* JADX INFO: renamed from: c */
        public final byte[] f173428c;

        /* JADX INFO: renamed from: d */
        public int f173429d;

        /* JADX INFO: renamed from: e */
        public int f173430e;

        /* JADX INFO: renamed from: f */
        public final boolean f173431f;

        /* JADX INFO: renamed from: g */
        public final boolean f173432g;

        /* JADX INFO: renamed from: h */
        public final boolean f173433h;

        /* JADX INFO: renamed from: i */
        public final byte[] f173434i;

        public C20296b(int i, byte[] bArr) {
            this.f173424a = bArr;
            this.f173431f = (i & 1) == 0;
            boolean z = (i & 2) == 0;
            this.f173432g = z;
            this.f173433h = (i & 4) != 0;
            this.f173434i = (i & 8) == 0 ? f173426j : f173427k;
            this.f173428c = new byte[2];
            this.f173429d = 0;
            this.f173430e = z ? 19 : -1;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0050  */
        /* JADX INFO: renamed from: a */
        public boolean m190679a(byte[] bArr, int i, int i2, boolean z) {
            int i3;
            int i4;
            int i5;
            int i6;
            byte b;
            byte b2;
            byte b3;
            int i7;
            int i8;
            byte[] bArr2 = this.f173434i;
            byte[] bArr3 = this.f173424a;
            int i9 = this.f173430e;
            int i10 = i2 + i;
            int i11 = this.f173429d;
            char c = 2;
            int i12 = 0;
            if (i11 != 1) {
                if (i11 == 2 && (i8 = i + 1) <= i10) {
                    byte[] bArr4 = this.f173428c;
                    i4 = ((bArr4[1] & 255) << 8) | ((bArr4[0] & 255) << 16) | (bArr[i] & 255);
                    this.f173429d = 0;
                    i3 = i8;
                } else {
                    i3 = i;
                    i4 = -1;
                }
            } else if (i + 2 <= i10) {
                i3 = i + 2;
                i4 = (bArr[i + 1] & 255) | ((this.f173428c[0] & 255) << 16) | ((bArr[i] & 255) << 8);
                this.f173429d = 0;
            } else {
                i3 = i;
                i4 = -1;
            }
            if (i4 != -1) {
                bArr3[0] = bArr2[(i4 >> 18) & 63];
                bArr3[1] = bArr2[(i4 >> 12) & 63];
                bArr3[2] = bArr2[(i4 >> 6) & 63];
                bArr3[3] = bArr2[i4 & 63];
                i9--;
                if (i9 == 0) {
                    if (this.f173433h) {
                        bArr3[4] = HttpTokens.CARRIAGE_RETURN;
                        i7 = 5;
                    } else {
                        i7 = 4;
                    }
                    i5 = i7 + 1;
                    bArr3[i7] = 10;
                    i9 = 19;
                } else {
                    i5 = 4;
                }
            } else {
                i5 = 0;
            }
            while (true) {
                i3 += 3;
                if (i3 > i10) {
                    break;
                }
                c = c;
                int i13 = ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3] & 255) << 16) | (bArr[i3 + 2] & 255);
                bArr3[i5] = bArr2[(i13 >> 18) & 63];
                bArr3[i5 + 1] = bArr2[(i13 >> 12) & 63];
                bArr3[i5 + 2] = bArr2[(i13 >> 6) & 63];
                bArr3[i5 + 3] = bArr2[i13 & 63];
                int i14 = i5 + 4;
                i9--;
                if (i9 == 0) {
                    if (this.f173433h) {
                        bArr3[i14] = HttpTokens.CARRIAGE_RETURN;
                        i14 = i5 + 5;
                    }
                    i5 = i14 + 1;
                    bArr3[i14] = 10;
                    i9 = 19;
                } else {
                    i5 = i14;
                }
            }
            if (z) {
                int i15 = this.f173429d;
                if (i3 - i15 == i10 - 1) {
                    if (i15 > 0) {
                        b3 = this.f173428c[0];
                        i12 = 1;
                    } else {
                        b3 = bArr[i3];
                    }
                    int i16 = (b3 & 255) << 4;
                    this.f173429d = i15 - i12;
                    bArr3[i5] = bArr2[(i16 >> 6) & 63];
                    int i17 = i5 + 2;
                    bArr3[i5 + 1] = bArr2[i16 & 63];
                    if (this.f173431f) {
                        bArr3[i17] = 61;
                        i17 = i5 + 4;
                        bArr3[i5 + 3] = 61;
                    }
                    if (this.f173432g) {
                        if (this.f173433h) {
                            bArr3[i17] = HttpTokens.CARRIAGE_RETURN;
                            i17++;
                        }
                        i6 = i17 + 1;
                        bArr3[i17] = 10;
                        i5 = i6;
                    } else {
                        i5 = i17;
                    }
                } else if (i3 - i15 == i10 - 2) {
                    if (i15 > 1) {
                        b = this.f173428c[0];
                        i12 = 1;
                    } else {
                        byte b4 = bArr[i3];
                        i3++;
                        b = b4;
                    }
                    int i18 = (b & 255) << 10;
                    if (i15 > 0) {
                        b2 = this.f173428c[i12];
                        i12++;
                    } else {
                        b2 = bArr[i3];
                    }
                    int i19 = i18 | ((b2 & 255) << 2);
                    this.f173429d = i15 - i12;
                    bArr3[i5] = bArr2[(i19 >> 12) & 63];
                    bArr3[i5 + 1] = bArr2[(i19 >> 6) & 63];
                    int i20 = i5 + 3;
                    bArr3[i5 + 2] = bArr2[i19 & 63];
                    if (this.f173431f) {
                        bArr3[i20] = 61;
                        i20 = i5 + 4;
                    }
                    if (this.f173432g) {
                        if (this.f173433h) {
                            bArr3[i20] = HttpTokens.CARRIAGE_RETURN;
                            i20++;
                        }
                        i6 = i20 + 1;
                        bArr3[i20] = 10;
                        i5 = i6;
                    } else {
                        i5 = i20;
                    }
                } else if (this.f173432g && i5 > 0 && i9 != 19) {
                    if (this.f173433h) {
                        bArr3[i5] = HttpTokens.CARRIAGE_RETURN;
                        i5++;
                    }
                    i6 = i5 + 1;
                    bArr3[i5] = 10;
                    i5 = i6;
                }
            } else if (i3 == i10 - 1) {
                byte[] bArr5 = this.f173428c;
                int i21 = this.f173429d;
                this.f173429d = i21 + 1;
                bArr5[i21] = bArr[i3];
            } else if (i3 == i10 - 2) {
                byte[] bArr6 = this.f173428c;
                int i22 = this.f173429d;
                int i23 = i22 + 1;
                this.f173429d = i23;
                bArr6[i22] = bArr[i3];
                this.f173429d = i22 + 2;
                bArr6[i23] = bArr[i3 + 1];
            }
            this.f173425b = i5;
            this.f173430e = i9;
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m190676a(byte[] bArr, int i) {
        return m190677b(bArr, 0, bArr.length, i);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m190677b(byte[] bArr, int i, int i2, int i3) {
        C20296b c20296b = new C20296b(i3, null);
        int i4 = (i2 / 3) * 4;
        if (!c20296b.f173431f) {
            int i5 = i2 % 3;
            if (i5 == 1) {
                i4 += 2;
            } else if (i5 == 2) {
                i4 += 3;
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (c20296b.f173432g && i2 > 0) {
            i4 += (((i2 - 1) / 57) + 1) * (c20296b.f173433h ? 2 : 1);
        }
        c20296b.f173424a = new byte[i4];
        c20296b.m190679a(bArr, i, i2, true);
        return c20296b.f173424a;
    }

    /* JADX INFO: renamed from: c */
    public static String m190678c(byte[] bArr, int i) {
        try {
            return new String(m190676a(bArr, i), CharEncoding.US_ASCII);
        } catch (UnsupportedEncodingException e) {
            gig0.m130323a(e);
            return null;
        }
    }
}
