package p153l;

import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class tqg0 extends gjg0 {

    /* JADX INFO: renamed from: a */
    public int f175711a;

    /* JADX INFO: renamed from: b */
    public int f175712b;

    /* JADX INFO: renamed from: c */
    public int f175713c;

    /* JADX INFO: renamed from: d */
    public boolean f175714d;

    /* JADX INFO: renamed from: f */
    public int f175716f;

    /* JADX INFO: renamed from: g */
    public drg0 f175717g;

    /* JADX INFO: renamed from: i */
    public int f175719i;

    /* JADX INFO: renamed from: j */
    public int f175720j;

    /* JADX INFO: renamed from: k */
    public int f175721k;

    /* JADX INFO: renamed from: l */
    public int f175722l;

    /* JADX INFO: renamed from: m */
    public int f175723m;

    /* JADX INFO: renamed from: n */
    public int f175724n;

    /* JADX INFO: renamed from: o */
    public int f175725o;

    /* JADX INFO: renamed from: p */
    public int f175726p;

    /* JADX INFO: renamed from: q */
    public int f175727q;

    /* JADX INFO: renamed from: r */
    public int f175728r;

    /* JADX INFO: renamed from: s */
    public int f175729s;

    /* JADX INFO: renamed from: t */
    public char f175730t;

    /* JADX INFO: renamed from: u */
    public hjg0 f175731u;

    /* JADX INFO: renamed from: e */
    public final lng0 f175715e = new lng0();

    /* JADX INFO: renamed from: h */
    public int f175718h = 1;

    public tqg0(InputStream inputStream) throws IOException {
        drg0 drg0Var = new drg0(inputStream == System.in ? new hwg0(inputStream) : inputStream, ByteOrder.BIG_ENDIAN);
        this.f175717g = drg0Var;
        int bits = (int) drg0Var.readBits(8);
        int bits2 = (int) this.f175717g.readBits(8);
        int bits3 = (int) this.f175717g.readBits(8);
        if (bits != 66 || bits2 != 90 || bits3 != 104) {
            zpg0.m220844a("Stream is not in the BZip2 format");
            throw null;
        }
        int bits4 = (int) this.f175717g.readBits(8);
        if (bits4 < 49 || bits4 > 57) {
            zpg0.m220844a("BZip2 block size is invalid");
            throw null;
        }
        this.f175713c = bits4 - 48;
        this.f175721k = 0;
        m192295k();
    }

    /* JADX INFO: renamed from: b */
    public static int m192293b(drg0 drg0Var, int i) throws IOException {
        long bits = drg0Var.readBits(i);
        if (bits >= 0) {
            return (int) bits;
        }
        zpg0.m220844a("Unexpected end of stream");
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public static void m192294m(int i, int i2, String str) throws IOException {
        if (i < 0) {
            cqg0.m111899a("Corrupted input, ", str, " value negative");
        } else {
            if (i < i2) {
                return;
            }
            cqg0.m111899a("Corrupted input, ", str, " value too big");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        drg0 drg0Var = this.f175717g;
        if (drg0Var != null) {
            try {
                drg0Var.close();
            } finally {
                this.f175731u = null;
                this.f175717g = null;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m192295k() throws IOException {
        char c;
        int i;
        drg0 drg0Var = this.f175717g;
        char cM192293b = (char) m192293b(drg0Var, 8);
        char cM192293b2 = (char) m192293b(drg0Var, 8);
        char cM192293b3 = (char) m192293b(drg0Var, 8);
        char cM192293b4 = (char) m192293b(drg0Var, 8);
        char cM192293b5 = (char) m192293b(drg0Var, 8);
        char cM192293b6 = (char) m192293b(drg0Var, 8);
        char c2 = 0;
        if (cM192293b == 23 && cM192293b2 == 'r' && cM192293b3 == 'E' && cM192293b4 == '8' && cM192293b5 == 'P' && cM192293b6 == 144) {
            int iM192293b = m192293b(this.f175717g, 32);
            this.f175720j = iM192293b;
            this.f175718h = 0;
            this.f175731u = null;
            if (iM192293b == this.f175721k) {
                return;
            }
            zpg0.m220844a("BZip2 CRC error");
            return;
        }
        if (cM192293b != '1' || cM192293b2 != 'A' || cM192293b3 != 'Y' || cM192293b4 != '&' || cM192293b5 != 'S' || cM192293b6 != 'Y') {
            this.f175718h = 0;
            zpg0.m220844a("Bad block header");
            return;
        }
        this.f175719i = m192293b(drg0Var, 32);
        int i2 = 1;
        this.f175714d = m192293b(drg0Var, 1) == 1;
        if (this.f175731u == null) {
            this.f175731u = new hjg0(this.f175713c);
        }
        drg0 drg0Var2 = this.f175717g;
        this.f175712b = m192293b(drg0Var2, 24);
        drg0 drg0Var3 = this.f175717g;
        hjg0 hjg0Var = this.f175731u;
        boolean[] zArr = hjg0Var.f110204a;
        byte[] bArr = hjg0Var.f110216m;
        byte[] bArr2 = hjg0Var.f110206c;
        byte[] bArr3 = hjg0Var.f110207d;
        int i3 = 0;
        for (int i4 = 0; i4 < 16; i4++) {
            if (m192293b(drg0Var3, 1) != 0) {
                i3 |= 1 << i4;
            }
        }
        Arrays.fill(zArr, false);
        for (int i5 = 0; i5 < 16; i5++) {
            if ((i3 & (1 << i5)) != 0) {
                int i6 = i5 << 4;
                for (int i7 = 0; i7 < 16; i7++) {
                    if (m192293b(drg0Var3, 1) != 0) {
                        zArr[i6 + i7] = true;
                    }
                }
            }
        }
        hjg0 hjg0Var2 = this.f175731u;
        boolean[] zArr2 = hjg0Var2.f110204a;
        byte[] bArr4 = hjg0Var2.f110205b;
        int i8 = 0;
        int i9 = 0;
        while (i8 < 256) {
            if (zArr2[i8]) {
                bArr4[i9] = (byte) i8;
                i9++;
            }
            i8++;
            c2 = c2;
        }
        char c3 = c2;
        this.f175716f = i9;
        int i10 = i9 + 2;
        int iM192293b2 = m192293b(drg0Var3, 3);
        int iM192293b3 = m192293b(drg0Var3, 15);
        if (iM192293b3 < 0) {
            zpg0.m220844a("Corrupted input, nSelectors value negative");
            return;
        }
        m192294m(i10, 259, "alphaSize");
        m192294m(iM192293b2, 7, "nGroups");
        for (int i11 = c3; i11 < iM192293b3; i11++) {
            int i12 = c3;
            while (m192293b(drg0Var3, 1) != 0) {
                i12++;
            }
            if (i11 < 18002) {
                bArr3[i11] = (byte) i12;
            }
        }
        if (iM192293b3 > 18002) {
            iM192293b3 = 18002;
        }
        int i13 = iM192293b2;
        while (true) {
            i13--;
            if (i13 < 0) {
                break;
            } else {
                bArr[i13] = (byte) i13;
            }
        }
        for (int i14 = c3; i14 < iM192293b3; i14++) {
            int i15 = bArr3[i14] & 255;
            m192294m(i15, 6, "selectorMtf");
            byte b = bArr[i15];
            while (i15 > 0) {
                bArr[i15] = bArr[i15 - 1];
                i15--;
            }
            bArr[c3] = b;
            bArr2[i14] = b;
        }
        char[][] cArr = hjg0Var.f110215l;
        for (int i16 = c3; i16 < iM192293b2; i16++) {
            int iM192293b4 = m192293b(drg0Var3, 5);
            char[] cArr2 = cArr[i16];
            for (int i17 = c3; i17 < i10; i17++) {
                while (m192293b(drg0Var3, 1) != 0) {
                    iM192293b4 += m192293b(drg0Var3, 1) != 0 ? -1 : 1;
                }
                cArr2[i17] = (char) iM192293b4;
            }
        }
        hjg0 hjg0Var3 = this.f175731u;
        char[][] cArr3 = hjg0Var3.f110215l;
        int[] iArr = hjg0Var3.f110212i;
        int[][] iArr2 = hjg0Var3.f110209f;
        int[][] iArr3 = hjg0Var3.f110210g;
        int[][] iArr4 = hjg0Var3.f110211h;
        int i18 = c3;
        while (i18 < iM192293b2) {
            char[] cArr4 = cArr3[i18];
            int i19 = i2;
            int i20 = i10;
            char c4 = c3;
            char c5 = ' ';
            while (true) {
                i20--;
                if (i20 < 0) {
                    break;
                }
                char c6 = cArr4[i20];
                if (c6 > c4) {
                    c4 = c6;
                }
                if (c6 < c5) {
                    c5 = c6;
                }
            }
            int[] iArr5 = iArr2[i18];
            int[] iArr6 = iArr3[i18];
            int[] iArr7 = iArr4[i18];
            char[] cArr5 = cArr3[i18];
            int i21 = c3;
            for (int i22 = c5; i22 <= c4; i22++) {
                int i23 = c3;
                while (i23 < i10) {
                    char c7 = c5;
                    if (cArr5[i23] == i22) {
                        iArr7[i21] = i23;
                        i21++;
                    }
                    i23++;
                    c5 = c7;
                }
            }
            char c8 = c5;
            int i24 = 23;
            while (true) {
                i24--;
                if (i24 <= 0) {
                    break;
                }
                iArr6[i24] = c3;
                iArr5[i24] = c3;
            }
            for (int i25 = c3; i25 < i10; i25++) {
                char c9 = cArr5[i25];
                m192294m(c9, 258, "length");
                int i26 = c9 + 1;
                iArr6[i26] = iArr6[i26] + 1;
            }
            int i27 = iArr6[c3];
            for (int i28 = i19; i28 < 23; i28++) {
                i27 += iArr6[i28];
                iArr6[i28] = i27;
            }
            int i29 = iArr6[c8];
            int i30 = c3;
            int i31 = c8;
            while (i31 <= c4) {
                int i32 = i31 + 1;
                int i33 = iArr6[i32];
                int i34 = (i33 - i29) + i30;
                iArr5[i31] = i34 - 1;
                i30 = i34 << 1;
                i31 = i32;
                i29 = i33;
            }
            for (int i35 = c8 + 1; i35 <= c4; i35++) {
                iArr6[i35] = ((iArr5[i35 - 1] + 1) << 1) - iArr6[i35];
            }
            iArr[i18] = c8;
            i18++;
            i2 = i19;
        }
        int i36 = i2;
        hjg0 hjg0Var4 = this.f175731u;
        byte[] bArr5 = hjg0Var4.f110218o;
        int[] iArr8 = hjg0Var4.f110208e;
        byte[] bArr6 = hjg0Var4.f110206c;
        byte[] bArr7 = hjg0Var4.f110205b;
        char[] cArr6 = hjg0Var4.f110214k;
        int[] iArr9 = hjg0Var4.f110212i;
        int[][] iArr10 = hjg0Var4.f110209f;
        int[][] iArr11 = hjg0Var4.f110210g;
        int[][] iArr12 = hjg0Var4.f110211h;
        int i37 = this.f175713c * LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY;
        int i38 = 256;
        while (true) {
            i38--;
            if (i38 < 0) {
                break;
            }
            cArr6[i38] = (char) i38;
            iArr8[i38] = c3;
        }
        int i39 = this.f175716f + 1;
        hjg0 hjg0Var5 = this.f175731u;
        int i40 = hjg0Var5.f110206c[c3] & 255;
        m192294m(i40, 6, "zt");
        int[] iArr13 = hjg0Var5.f110209f[i40];
        int i41 = hjg0Var5.f110212i[i40];
        m192294m(i41, 258, "zn");
        int iM192293b5 = m192293b(this.f175717g, i41);
        int i42 = i41;
        while (iM192293b5 > iArr13[i42]) {
            int i43 = i42 + 1;
            m192294m(i43, 258, "zn");
            i42 = i43;
            iM192293b5 = (iM192293b5 << 1) | m192293b(this.f175717g, i36);
            i36 = 1;
        }
        int i44 = iM192293b5 - hjg0Var5.f110210g[i40][i42];
        m192294m(i44, 258, "zvec");
        int i45 = hjg0Var5.f110211h[i40][i44];
        int i46 = bArr6[c3] & 255;
        m192294m(i46, 6, "zt");
        int[] iArr14 = iArr11[i46];
        int[] iArr15 = iArr10[i46];
        int[] iArr16 = iArr12[i46];
        int i47 = iArr9[i46];
        int i48 = -1;
        int[] iArr17 = iArr16;
        int i49 = 49;
        int i50 = c3;
        while (i45 != i39) {
            iArr9 = iArr9;
            iArr10 = iArr10;
            iArr11 = iArr11;
            i39 = i39;
            if (i45 == 0 || i45 == 1) {
                int[] iArr18 = iArr14;
                int i51 = -1;
                int i52 = 1;
                while (true) {
                    if (i45 == 0) {
                        i51 += i52;
                    } else if (i45 != 1) {
                        break;
                    } else {
                        i51 += i52 << 1;
                    }
                    if (i49 == 0) {
                        int i53 = i50 + 1;
                        m192294m(i53, 18002, "groupNo");
                        int i54 = bArr6[i53] & 255;
                        m192294m(i54, 6, "zt");
                        iArr18 = iArr11[i54];
                        int[] iArr19 = iArr10[i54];
                        iArr17 = iArr12[i54];
                        i47 = iArr9[i54];
                        i50 = i53;
                        iArr15 = iArr19;
                        i49 = 49;
                    } else {
                        i49--;
                    }
                    int i55 = i47;
                    m192294m(i55, 258, "zn");
                    i47 = i55;
                    int iM192293b6 = m192293b(drg0Var2, i55);
                    int i56 = i47;
                    while (iM192293b6 > iArr15[i56]) {
                        int i57 = i56 + 1;
                        m192294m(i57, 258, "zn");
                        iM192293b6 = (iM192293b6 << 1) | m192293b(drg0Var2, 1);
                        i56 = i57;
                        cArr6 = cArr6;
                    }
                    int i58 = iM192293b6 - iArr18[i56];
                    m192294m(i58, 258, "zvec");
                    i45 = iArr17[i58];
                    i52 <<= 1;
                    cArr6 = cArr6;
                }
                char[] cArr7 = cArr6;
                char c10 = cArr7[0];
                m192294m(c10, 256, "yy");
                byte b2 = bArr7[c10];
                int i59 = b2 & 255;
                iArr8[i59] = i51 + 1 + iArr8[i59];
                int i60 = i48 + 1;
                int i61 = i60 + i51;
                Arrays.fill(bArr5, i60, i61 + 1, b2);
                if (i61 >= i37) {
                    throw new IOException("Block overrun while expanding RLE in MTF, " + i61 + " exceeds " + i37);
                }
                i48 = i61;
                iArr14 = iArr18;
                cArr6 = cArr7;
            } else {
                i48++;
                if (i48 >= i37) {
                    throw new IOException("Block overrun in MTF, " + i48 + " exceeds " + i37);
                }
                m192294m(i45, 257, "nextSym");
                int i62 = i45 - 1;
                char c11 = cArr6[i62];
                int[] iArr20 = iArr14;
                m192294m(c11, 256, "yy");
                byte b3 = bArr7[c11];
                int i63 = b3 & 255;
                iArr8[i63] = iArr8[i63] + 1;
                bArr5[i48] = b3;
                if (i45 <= 16) {
                    while (i62 > 0) {
                        int i64 = i62 - 1;
                        cArr6[i62] = cArr6[i64];
                        i62 = i64;
                    }
                    c = c3;
                } else {
                    c = c3;
                    System.arraycopy(cArr6, c, cArr6, 1, i62);
                }
                cArr6[c] = c11;
                if (i49 == 0) {
                    int i65 = i50 + 1;
                    m192294m(i65, 18002, "groupNo");
                    int i66 = bArr6[i65] & 255;
                    m192294m(i66, 6, "zt");
                    int[] iArr21 = iArr11[i66];
                    int[] iArr22 = iArr10[i66];
                    int[] iArr23 = iArr12[i66];
                    i = iArr9[i66];
                    i50 = i65;
                    iArr20 = iArr21;
                    iArr15 = iArr22;
                    iArr17 = iArr23;
                    i49 = 49;
                } else {
                    i49--;
                    i = i47;
                }
                m192294m(i, 258, "zn");
                int iM192293b7 = m192293b(drg0Var2, i);
                int i67 = i;
                while (iM192293b7 > iArr15[i67]) {
                    i67++;
                    m192294m(i67, 258, "zn");
                    iM192293b7 = (iM192293b7 << 1) | m192293b(drg0Var2, 1);
                }
                int i68 = iM192293b7 - iArr20[i67];
                m192294m(i68, 258, "zvec");
                i45 = iArr17[i68];
                i47 = i;
                iArr14 = iArr20;
            }
            c3 = 0;
        }
        this.f175711a = i48;
        this.f175715e.f132774a = -1;
        this.f175718h = 1;
    }

    /* JADX INFO: renamed from: n */
    public final int m192296n() throws IOException {
        hjg0 hjg0Var;
        if (this.f175718h == 0 || (hjg0Var = this.f175731u) == null) {
            return -1;
        }
        int[] iArr = hjg0Var.f110213j;
        int i = this.f175711a + 1;
        int[] iArr2 = hjg0Var.f110217n;
        if (iArr2 == null || iArr2.length < i) {
            iArr2 = new int[i];
            hjg0Var.f110217n = iArr2;
        }
        byte[] bArr = hjg0Var.f110218o;
        iArr[0] = 0;
        System.arraycopy(hjg0Var.f110208e, 0, iArr, 1, 256);
        int i2 = iArr[0];
        for (int i3 = 1; i3 <= 256; i3++) {
            i2 += iArr[i3];
            iArr[i3] = i2;
        }
        int i4 = this.f175711a;
        for (int i5 = 0; i5 <= i4; i5++) {
            int i6 = bArr[i5] & 255;
            int i7 = iArr[i6];
            iArr[i6] = i7 + 1;
            m192294m(i7, i, "tt index");
            iArr2[i7] = i5;
        }
        int i8 = this.f175712b;
        if (i8 < 0 || i8 >= iArr2.length) {
            zpg0.m220844a("Stream corrupted");
            return 0;
        }
        this.f175729s = iArr2[i8];
        this.f175722l = 0;
        this.f175725o = 0;
        this.f175723m = 256;
        if (!this.f175714d) {
            return m192298t();
        }
        this.f175727q = 0;
        this.f175728r = 0;
        return m192299u();
    }

    /* JADX INFO: renamed from: q */
    public final int m192297q() throws IOException {
        switch (this.f175718h) {
            case 0:
                return -1;
            case 1:
                return m192296n();
            case 2:
                wpg0.m207458a();
                return 0;
            case 3:
                if (this.f175723m != this.f175724n) {
                    this.f175718h = 2;
                    this.f175722l = 1;
                    return m192299u();
                }
                int i = this.f175722l + 1;
                this.f175722l = i;
                if (i < 4) {
                    this.f175718h = 2;
                    return m192299u();
                }
                hjg0 hjg0Var = this.f175731u;
                byte[] bArr = hjg0Var.f110218o;
                int i2 = this.f175729s;
                this.f175730t = (char) (bArr[i2] & 255);
                m192294m(i2, hjg0Var.f110217n.length, "su_tPos");
                this.f175729s = this.f175731u.f110217n[this.f175729s];
                int i3 = this.f175727q;
                if (i3 == 0) {
                    int i4 = this.f175728r;
                    this.f175727q = otg0.f148957a[i4] - 1;
                    int i5 = i4 + 1;
                    this.f175728r = i5;
                    if (i5 == 512) {
                        this.f175728r = 0;
                    }
                } else {
                    this.f175727q = i3 - 1;
                }
                this.f175726p = 0;
                this.f175718h = 4;
                if (this.f175727q == 1) {
                    this.f175730t = (char) (this.f175730t ^ 1);
                }
                if (this.f175730t > 0) {
                    this.f175715e.m154980a(this.f175723m);
                    this.f175726p++;
                    return this.f175723m;
                }
                this.f175718h = 2;
                this.f175725o++;
                this.f175722l = 0;
                return m192299u();
            case 4:
                if (this.f175726p < this.f175730t) {
                    this.f175715e.m154980a(this.f175723m);
                    this.f175726p++;
                    return this.f175723m;
                }
                this.f175718h = 2;
                this.f175725o++;
                this.f175722l = 0;
                return m192299u();
            case 5:
                wpg0.m207458a();
                return 0;
            case 6:
                if (this.f175723m != this.f175724n) {
                    this.f175722l = 1;
                    return m192298t();
                }
                int i6 = this.f175722l + 1;
                this.f175722l = i6;
                if (i6 < 4) {
                    return m192298t();
                }
                m192294m(this.f175729s, this.f175731u.f110218o.length, "su_tPos");
                hjg0 hjg0Var2 = this.f175731u;
                byte[] bArr2 = hjg0Var2.f110218o;
                int i7 = this.f175729s;
                char c = (char) (bArr2[i7] & 255);
                this.f175730t = c;
                this.f175729s = hjg0Var2.f110217n[i7];
                this.f175726p = 0;
                if (c <= 0) {
                    this.f175725o++;
                    this.f175722l = 0;
                    return m192298t();
                }
                int i8 = this.f175723m;
                this.f175715e.m154980a(i8);
                this.f175726p++;
                this.f175718h = 7;
                return i8;
            case 7:
                if (this.f175726p >= this.f175730t) {
                    this.f175725o++;
                    this.f175722l = 0;
                    return m192298t();
                }
                int i9 = this.f175723m;
                this.f175715e.m154980a(i9);
                this.f175726p++;
                this.f175718h = 7;
                return i9;
            default:
                wpg0.m207458a();
                return 0;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            bqg0.m105918a("offs(", i, ") < 0.");
            return 0;
        }
        if (i2 < 0) {
            bqg0.m105918a("len(", i2, ") < 0.");
            return 0;
        }
        int i3 = i + i2;
        if (i3 > bArr.length) {
            throw new IndexOutOfBoundsException("offs(" + i + ") + len(" + i2 + ") > dest.length(" + bArr.length + ").");
        }
        if (this.f175717g == null) {
            zpg0.m220844a("Stream closed");
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        int i4 = i;
        while (i4 < i3) {
            int iM192297q = m192297q();
            if (iM192297q < 0) {
                break;
            }
            bArr[i4] = (byte) iM192297q;
            count(1);
            i4++;
        }
        if (i4 == i) {
            return -1;
        }
        return i4 - i;
    }

    /* JADX INFO: renamed from: t */
    public final int m192298t() throws IOException {
        if (this.f175725o <= this.f175711a) {
            this.f175724n = this.f175723m;
            hjg0 hjg0Var = this.f175731u;
            byte[] bArr = hjg0Var.f110218o;
            int i = this.f175729s;
            int i2 = bArr[i] & 255;
            this.f175723m = i2;
            m192294m(i, hjg0Var.f110217n.length, "su_tPos");
            this.f175729s = this.f175731u.f110217n[this.f175729s];
            this.f175725o++;
            this.f175718h = 6;
            this.f175715e.m154980a(i2);
            return i2;
        }
        this.f175718h = 5;
        int i3 = ~this.f175715e.f132774a;
        int i4 = this.f175719i;
        if (i4 == i3) {
            int i5 = this.f175721k;
            this.f175721k = i3 ^ ((i5 >>> 31) | (i5 << 1));
            m192295k();
            return m192296n();
        }
        int i6 = this.f175720j;
        this.f175721k = ((i6 >>> 31) | (i6 << 1)) ^ i4;
        zpg0.m220844a("BZip2 CRC error");
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public final int m192299u() throws IOException {
        if (this.f175725o > this.f175711a) {
            int i = ~this.f175715e.f132774a;
            int i2 = this.f175719i;
            if (i2 == i) {
                int i3 = this.f175721k;
                this.f175721k = i ^ ((i3 >>> 31) | (i3 << 1));
                m192295k();
                return m192296n();
            }
            int i4 = this.f175720j;
            this.f175721k = ((i4 >>> 31) | (i4 << 1)) ^ i2;
            zpg0.m220844a("BZip2 CRC error");
            return 0;
        }
        this.f175724n = this.f175723m;
        hjg0 hjg0Var = this.f175731u;
        byte[] bArr = hjg0Var.f110218o;
        int i5 = this.f175729s;
        int i6 = bArr[i5] & 255;
        m192294m(i5, hjg0Var.f110217n.length, "su_tPos");
        this.f175729s = this.f175731u.f110217n[this.f175729s];
        int i7 = this.f175727q;
        if (i7 == 0) {
            int i8 = this.f175728r;
            this.f175727q = otg0.f148957a[i8] - 1;
            int i9 = i8 + 1;
            this.f175728r = i9;
            if (i9 == 512) {
                this.f175728r = 0;
            }
        } else {
            this.f175727q = i7 - 1;
        }
        int i10 = i6 ^ (this.f175727q == 1 ? 1 : 0);
        this.f175723m = i10;
        this.f175725o++;
        this.f175718h = 3;
        this.f175715e.m154980a(i10);
        return i10;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f175717g != null) {
            int iM192297q = m192297q();
            count(iM192297q < 0 ? -1 : 1);
            return iM192297q;
        }
        zpg0.m220844a("Stream closed");
        return 0;
    }
}
