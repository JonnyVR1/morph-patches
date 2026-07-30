package p149l;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.CharEncoding;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes8.dex */
public class le2 {

    /* JADX INFO: renamed from: l.le2$a */
    public static abstract class AbstractC18201a {

        /* JADX INFO: renamed from: a */
        public byte[] f127632a;

        /* JADX INFO: renamed from: b */
        public int f127633b;
    }

    /* JADX INFO: renamed from: l.le2$b */
    public static class C18202b extends AbstractC18201a {

        /* JADX INFO: renamed from: j */
        public static final byte[] f127634j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* JADX INFO: renamed from: k */
        public static final byte[] f127635k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* JADX INFO: renamed from: c */
        public final byte[] f127636c;

        /* JADX INFO: renamed from: d */
        public int f127637d;

        /* JADX INFO: renamed from: e */
        public int f127638e;

        /* JADX INFO: renamed from: f */
        public final boolean f127639f;

        /* JADX INFO: renamed from: g */
        public final boolean f127640g;

        /* JADX INFO: renamed from: h */
        public final boolean f127641h;

        /* JADX INFO: renamed from: i */
        public final byte[] f127642i;

        public C18202b(int i, byte[] bArr) {
            this.f127632a = bArr;
            this.f127639f = (i & 1) == 0;
            boolean z = (i & 2) == 0;
            this.f127640g = z;
            this.f127641h = (i & 4) != 0;
            this.f127642i = (i & 8) == 0 ? f127634j : f127635k;
            this.f127636c = new byte[2];
            this.f127637d = 0;
            this.f127638e = z ? 19 : -1;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0050  */
        /* JADX INFO: renamed from: a */
        public boolean m149478a(byte[] bArr, int i, int i2, boolean z) {
            int i3;
            int i4;
            int i5;
            int i6;
            byte b;
            byte b2;
            byte b3;
            int i7;
            int i8;
            byte[] bArr2 = this.f127642i;
            byte[] bArr3 = this.f127632a;
            int i9 = this.f127638e;
            int i10 = i2 + i;
            int i11 = this.f127637d;
            char c = 2;
            int i12 = 0;
            if (i11 != 1) {
                if (i11 == 2 && (i8 = i + 1) <= i10) {
                    byte[] bArr4 = this.f127636c;
                    i4 = ((bArr4[1] & 255) << 8) | ((bArr4[0] & 255) << 16) | (bArr[i] & 255);
                    this.f127637d = 0;
                    i3 = i8;
                } else {
                    i3 = i;
                    i4 = -1;
                }
            } else if (i + 2 <= i10) {
                i3 = i + 2;
                i4 = (bArr[i + 1] & 255) | ((this.f127636c[0] & 255) << 16) | ((bArr[i] & 255) << 8);
                this.f127637d = 0;
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
                    if (this.f127641h) {
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
                    if (this.f127641h) {
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
                int i15 = this.f127637d;
                if (i3 - i15 == i10 - 1) {
                    if (i15 > 0) {
                        b3 = this.f127636c[0];
                        i12 = 1;
                    } else {
                        b3 = bArr[i3];
                    }
                    int i16 = (b3 & 255) << 4;
                    this.f127637d = i15 - i12;
                    bArr3[i5] = bArr2[(i16 >> 6) & 63];
                    int i17 = i5 + 2;
                    bArr3[i5 + 1] = bArr2[i16 & 63];
                    if (this.f127639f) {
                        bArr3[i17] = 61;
                        i17 = i5 + 4;
                        bArr3[i5 + 3] = 61;
                    }
                    if (this.f127640g) {
                        if (this.f127641h) {
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
                        b = this.f127636c[0];
                        i12 = 1;
                    } else {
                        byte b4 = bArr[i3];
                        i3++;
                        b = b4;
                    }
                    int i18 = (b & 255) << 10;
                    if (i15 > 0) {
                        b2 = this.f127636c[i12];
                        i12++;
                    } else {
                        b2 = bArr[i3];
                    }
                    int i19 = i18 | ((b2 & 255) << 2);
                    this.f127637d = i15 - i12;
                    bArr3[i5] = bArr2[(i19 >> 12) & 63];
                    bArr3[i5 + 1] = bArr2[(i19 >> 6) & 63];
                    int i20 = i5 + 3;
                    bArr3[i5 + 2] = bArr2[i19 & 63];
                    if (this.f127639f) {
                        bArr3[i20] = 61;
                        i20 = i5 + 4;
                    }
                    if (this.f127640g) {
                        if (this.f127641h) {
                            bArr3[i20] = HttpTokens.CARRIAGE_RETURN;
                            i20++;
                        }
                        i6 = i20 + 1;
                        bArr3[i20] = 10;
                        i5 = i6;
                    } else {
                        i5 = i20;
                    }
                } else if (this.f127640g && i5 > 0 && i9 != 19) {
                    if (this.f127641h) {
                        bArr3[i5] = HttpTokens.CARRIAGE_RETURN;
                        i5++;
                    }
                    i6 = i5 + 1;
                    bArr3[i5] = 10;
                    i5 = i6;
                }
            } else if (i3 == i10 - 1) {
                byte[] bArr5 = this.f127636c;
                int i21 = this.f127637d;
                this.f127637d = i21 + 1;
                bArr5[i21] = bArr[i3];
            } else if (i3 == i10 - 2) {
                byte[] bArr6 = this.f127636c;
                int i22 = this.f127637d;
                int i23 = i22 + 1;
                this.f127637d = i23;
                bArr6[i22] = bArr[i3];
                this.f127637d = i22 + 2;
                bArr6[i23] = bArr[i3 + 1];
            }
            this.f127633b = i5;
            this.f127638e = i9;
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m149475a(byte[] bArr, int i) {
        return m149476b(bArr, 0, bArr.length, i);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m149476b(byte[] bArr, int i, int i2, int i3) {
        C18202b c18202b = new C18202b(i3, null);
        int i4 = (i2 / 3) * 4;
        if (!c18202b.f127639f) {
            int i5 = i2 % 3;
            if (i5 == 1) {
                i4 += 2;
            } else if (i5 == 2) {
                i4 += 3;
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (c18202b.f127640g && i2 > 0) {
            i4 += (((i2 - 1) / 57) + 1) * (c18202b.f127641h ? 2 : 1);
        }
        c18202b.f127632a = new byte[i4];
        c18202b.m149478a(bArr, i, i2, true);
        return c18202b.f127632a;
    }

    /* JADX INFO: renamed from: c */
    public static String m149477c(byte[] bArr, int i) {
        try {
            return new String(m149475a(bArr, i), CharEncoding.US_ASCII);
        } catch (UnsupportedEncodingException e) {
            y9g0.m213537a(e);
            return null;
        }
    }
}
