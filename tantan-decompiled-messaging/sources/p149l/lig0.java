package p149l;

import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class lig0 extends yag0 {

    /* JADX INFO: renamed from: a */
    public int f128191a;

    /* JADX INFO: renamed from: b */
    public int f128192b;

    /* JADX INFO: renamed from: c */
    public int f128193c;

    /* JADX INFO: renamed from: d */
    public boolean f128194d;

    /* JADX INFO: renamed from: f */
    public int f128196f;

    /* JADX INFO: renamed from: g */
    public vig0 f128197g;

    /* JADX INFO: renamed from: i */
    public int f128199i;

    /* JADX INFO: renamed from: j */
    public int f128200j;

    /* JADX INFO: renamed from: k */
    public int f128201k;

    /* JADX INFO: renamed from: l */
    public int f128202l;

    /* JADX INFO: renamed from: m */
    public int f128203m;

    /* JADX INFO: renamed from: n */
    public int f128204n;

    /* JADX INFO: renamed from: o */
    public int f128205o;

    /* JADX INFO: renamed from: p */
    public int f128206p;

    /* JADX INFO: renamed from: q */
    public int f128207q;

    /* JADX INFO: renamed from: r */
    public int f128208r;

    /* JADX INFO: renamed from: s */
    public int f128209s;

    /* JADX INFO: renamed from: t */
    public char f128210t;

    /* JADX INFO: renamed from: u */
    public zag0 f128211u;

    /* JADX INFO: renamed from: e */
    public final dfg0 f128195e = new dfg0();

    /* JADX INFO: renamed from: h */
    public int f128198h = 1;

    public lig0(InputStream inputStream) throws IOException {
        vig0 vig0Var = new vig0(inputStream == System.in ? new zng0(inputStream) : inputStream, ByteOrder.BIG_ENDIAN);
        this.f128197g = vig0Var;
        int bits = (int) vig0Var.readBits(8);
        int bits2 = (int) this.f128197g.readBits(8);
        int bits3 = (int) this.f128197g.readBits(8);
        if (bits != 66 || bits2 != 90 || bits3 != 104) {
            rhg0.m179353a("Stream is not in the BZip2 format");
            throw null;
        }
        int bits4 = (int) this.f128197g.readBits(8);
        if (bits4 < 49 || bits4 > 57) {
            rhg0.m179353a("BZip2 block size is invalid");
            throw null;
        }
        this.f128193c = bits4 - 48;
        this.f128201k = 0;
        m149892k();
    }

    /* JADX INFO: renamed from: b */
    public static int m149890b(vig0 vig0Var, int i) throws IOException {
        long bits = vig0Var.readBits(i);
        if (bits >= 0) {
            return (int) bits;
        }
        rhg0.m179353a("Unexpected end of stream");
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public static void m149891m(int i, int i2, String str) throws IOException {
        if (i < 0) {
            uhg0.m193714a("Corrupted input, ", str, " value negative");
        } else {
            if (i < i2) {
                return;
            }
            uhg0.m193714a("Corrupted input, ", str, " value too big");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        vig0 vig0Var = this.f128197g;
        if (vig0Var != null) {
            try {
                vig0Var.close();
            } finally {
                this.f128211u = null;
                this.f128197g = null;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m149892k() throws IOException {
        char c;
        int i;
        vig0 vig0Var = this.f128197g;
        char cM149890b = (char) m149890b(vig0Var, 8);
        char cM149890b2 = (char) m149890b(vig0Var, 8);
        char cM149890b3 = (char) m149890b(vig0Var, 8);
        char cM149890b4 = (char) m149890b(vig0Var, 8);
        char cM149890b5 = (char) m149890b(vig0Var, 8);
        char cM149890b6 = (char) m149890b(vig0Var, 8);
        char c2 = 0;
        if (cM149890b == 23 && cM149890b2 == 'r' && cM149890b3 == 'E' && cM149890b4 == '8' && cM149890b5 == 'P' && cM149890b6 == 144) {
            int iM149890b = m149890b(this.f128197g, 32);
            this.f128200j = iM149890b;
            this.f128198h = 0;
            this.f128211u = null;
            if (iM149890b == this.f128201k) {
                return;
            }
            rhg0.m179353a("BZip2 CRC error");
            return;
        }
        if (cM149890b != '1' || cM149890b2 != 'A' || cM149890b3 != 'Y' || cM149890b4 != '&' || cM149890b5 != 'S' || cM149890b6 != 'Y') {
            this.f128198h = 0;
            rhg0.m179353a("Bad block header");
            return;
        }
        this.f128199i = m149890b(vig0Var, 32);
        int i2 = 1;
        this.f128194d = m149890b(vig0Var, 1) == 1;
        if (this.f128211u == null) {
            this.f128211u = new zag0(this.f128193c);
        }
        vig0 vig0Var2 = this.f128197g;
        this.f128192b = m149890b(vig0Var2, 24);
        vig0 vig0Var3 = this.f128197g;
        zag0 zag0Var = this.f128211u;
        boolean[] zArr = zag0Var.f202347a;
        byte[] bArr = zag0Var.f202359m;
        byte[] bArr2 = zag0Var.f202349c;
        byte[] bArr3 = zag0Var.f202350d;
        int i3 = 0;
        for (int i4 = 0; i4 < 16; i4++) {
            if (m149890b(vig0Var3, 1) != 0) {
                i3 |= 1 << i4;
            }
        }
        Arrays.fill(zArr, false);
        for (int i5 = 0; i5 < 16; i5++) {
            if ((i3 & (1 << i5)) != 0) {
                int i6 = i5 << 4;
                for (int i7 = 0; i7 < 16; i7++) {
                    if (m149890b(vig0Var3, 1) != 0) {
                        zArr[i6 + i7] = true;
                    }
                }
            }
        }
        zag0 zag0Var2 = this.f128211u;
        boolean[] zArr2 = zag0Var2.f202347a;
        byte[] bArr4 = zag0Var2.f202348b;
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
        this.f128196f = i9;
        int i10 = i9 + 2;
        int iM149890b2 = m149890b(vig0Var3, 3);
        int iM149890b3 = m149890b(vig0Var3, 15);
        if (iM149890b3 < 0) {
            rhg0.m179353a("Corrupted input, nSelectors value negative");
            return;
        }
        m149891m(i10, 259, "alphaSize");
        m149891m(iM149890b2, 7, "nGroups");
        for (int i11 = c3; i11 < iM149890b3; i11++) {
            int i12 = c3;
            while (m149890b(vig0Var3, 1) != 0) {
                i12++;
            }
            if (i11 < 18002) {
                bArr3[i11] = (byte) i12;
            }
        }
        if (iM149890b3 > 18002) {
            iM149890b3 = 18002;
        }
        int i13 = iM149890b2;
        while (true) {
            i13--;
            if (i13 < 0) {
                break;
            } else {
                bArr[i13] = (byte) i13;
            }
        }
        for (int i14 = c3; i14 < iM149890b3; i14++) {
            int i15 = bArr3[i14] & 255;
            m149891m(i15, 6, "selectorMtf");
            byte b = bArr[i15];
            while (i15 > 0) {
                bArr[i15] = bArr[i15 - 1];
                i15--;
            }
            bArr[c3] = b;
            bArr2[i14] = b;
        }
        char[][] cArr = zag0Var.f202358l;
        for (int i16 = c3; i16 < iM149890b2; i16++) {
            int iM149890b4 = m149890b(vig0Var3, 5);
            char[] cArr2 = cArr[i16];
            for (int i17 = c3; i17 < i10; i17++) {
                while (m149890b(vig0Var3, 1) != 0) {
                    iM149890b4 += m149890b(vig0Var3, 1) != 0 ? -1 : 1;
                }
                cArr2[i17] = (char) iM149890b4;
            }
        }
        zag0 zag0Var3 = this.f128211u;
        char[][] cArr3 = zag0Var3.f202358l;
        int[] iArr = zag0Var3.f202355i;
        int[][] iArr2 = zag0Var3.f202352f;
        int[][] iArr3 = zag0Var3.f202353g;
        int[][] iArr4 = zag0Var3.f202354h;
        int i18 = c3;
        while (i18 < iM149890b2) {
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
                m149891m(c9, 258, "length");
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
        zag0 zag0Var4 = this.f128211u;
        byte[] bArr5 = zag0Var4.f202361o;
        int[] iArr8 = zag0Var4.f202351e;
        byte[] bArr6 = zag0Var4.f202349c;
        byte[] bArr7 = zag0Var4.f202348b;
        char[] cArr6 = zag0Var4.f202357k;
        int[] iArr9 = zag0Var4.f202355i;
        int[][] iArr10 = zag0Var4.f202352f;
        int[][] iArr11 = zag0Var4.f202353g;
        int[][] iArr12 = zag0Var4.f202354h;
        int i37 = this.f128193c * LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY;
        int i38 = 256;
        while (true) {
            i38--;
            if (i38 < 0) {
                break;
            }
            cArr6[i38] = (char) i38;
            iArr8[i38] = c3;
        }
        int i39 = this.f128196f + 1;
        zag0 zag0Var5 = this.f128211u;
        int i40 = zag0Var5.f202349c[c3] & 255;
        m149891m(i40, 6, "zt");
        int[] iArr13 = zag0Var5.f202352f[i40];
        int i41 = zag0Var5.f202355i[i40];
        m149891m(i41, 258, "zn");
        int iM149890b5 = m149890b(this.f128197g, i41);
        int i42 = i41;
        while (iM149890b5 > iArr13[i42]) {
            int i43 = i42 + 1;
            m149891m(i43, 258, "zn");
            i42 = i43;
            iM149890b5 = (iM149890b5 << 1) | m149890b(this.f128197g, i36);
            i36 = 1;
        }
        int i44 = iM149890b5 - zag0Var5.f202353g[i40][i42];
        m149891m(i44, 258, "zvec");
        int i45 = zag0Var5.f202354h[i40][i44];
        int i46 = bArr6[c3] & 255;
        m149891m(i46, 6, "zt");
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
                        m149891m(i53, 18002, "groupNo");
                        int i54 = bArr6[i53] & 255;
                        m149891m(i54, 6, "zt");
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
                    m149891m(i55, 258, "zn");
                    i47 = i55;
                    int iM149890b6 = m149890b(vig0Var2, i55);
                    int i56 = i47;
                    while (iM149890b6 > iArr15[i56]) {
                        int i57 = i56 + 1;
                        m149891m(i57, 258, "zn");
                        iM149890b6 = (iM149890b6 << 1) | m149890b(vig0Var2, 1);
                        i56 = i57;
                        cArr6 = cArr6;
                    }
                    int i58 = iM149890b6 - iArr18[i56];
                    m149891m(i58, 258, "zvec");
                    i45 = iArr17[i58];
                    i52 <<= 1;
                    cArr6 = cArr6;
                }
                char[] cArr7 = cArr6;
                char c10 = cArr7[0];
                m149891m(c10, 256, "yy");
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
                m149891m(i45, 257, "nextSym");
                int i62 = i45 - 1;
                char c11 = cArr6[i62];
                int[] iArr20 = iArr14;
                m149891m(c11, 256, "yy");
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
                    m149891m(i65, 18002, "groupNo");
                    int i66 = bArr6[i65] & 255;
                    m149891m(i66, 6, "zt");
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
                m149891m(i, 258, "zn");
                int iM149890b7 = m149890b(vig0Var2, i);
                int i67 = i;
                while (iM149890b7 > iArr15[i67]) {
                    i67++;
                    m149891m(i67, 258, "zn");
                    iM149890b7 = (iM149890b7 << 1) | m149890b(vig0Var2, 1);
                }
                int i68 = iM149890b7 - iArr20[i67];
                m149891m(i68, 258, "zvec");
                i45 = iArr17[i68];
                i47 = i;
                iArr14 = iArr20;
            }
            c3 = 0;
        }
        this.f128191a = i48;
        this.f128195e.f85941a = -1;
        this.f128198h = 1;
    }

    /* JADX INFO: renamed from: n */
    public final int m149893n() throws IOException {
        zag0 zag0Var;
        if (this.f128198h == 0 || (zag0Var = this.f128211u) == null) {
            return -1;
        }
        int[] iArr = zag0Var.f202356j;
        int i = this.f128191a + 1;
        int[] iArr2 = zag0Var.f202360n;
        if (iArr2 == null || iArr2.length < i) {
            iArr2 = new int[i];
            zag0Var.f202360n = iArr2;
        }
        byte[] bArr = zag0Var.f202361o;
        iArr[0] = 0;
        System.arraycopy(zag0Var.f202351e, 0, iArr, 1, 256);
        int i2 = iArr[0];
        for (int i3 = 1; i3 <= 256; i3++) {
            i2 += iArr[i3];
            iArr[i3] = i2;
        }
        int i4 = this.f128191a;
        for (int i5 = 0; i5 <= i4; i5++) {
            int i6 = bArr[i5] & 255;
            int i7 = iArr[i6];
            iArr[i6] = i7 + 1;
            m149891m(i7, i, "tt index");
            iArr2[i7] = i5;
        }
        int i8 = this.f128192b;
        if (i8 < 0 || i8 >= iArr2.length) {
            rhg0.m179353a("Stream corrupted");
            return 0;
        }
        this.f128209s = iArr2[i8];
        this.f128202l = 0;
        this.f128205o = 0;
        this.f128203m = 256;
        if (!this.f128194d) {
            return m149895t();
        }
        this.f128207q = 0;
        this.f128208r = 0;
        return m149896u();
    }

    /* JADX INFO: renamed from: q */
    public final int m149894q() throws IOException {
        switch (this.f128198h) {
            case 0:
                return -1;
            case 1:
                return m149893n();
            case 2:
                ohg0.m164364a();
                return 0;
            case 3:
                if (this.f128203m != this.f128204n) {
                    this.f128198h = 2;
                    this.f128202l = 1;
                    return m149896u();
                }
                int i = this.f128202l + 1;
                this.f128202l = i;
                if (i < 4) {
                    this.f128198h = 2;
                    return m149896u();
                }
                zag0 zag0Var = this.f128211u;
                byte[] bArr = zag0Var.f202361o;
                int i2 = this.f128209s;
                this.f128210t = (char) (bArr[i2] & 255);
                m149891m(i2, zag0Var.f202360n.length, "su_tPos");
                this.f128209s = this.f128211u.f202360n[this.f128209s];
                int i3 = this.f128207q;
                if (i3 == 0) {
                    int i4 = this.f128208r;
                    this.f128207q = glg0.f103319a[i4] - 1;
                    int i5 = i4 + 1;
                    this.f128208r = i5;
                    if (i5 == 512) {
                        this.f128208r = 0;
                    }
                } else {
                    this.f128207q = i3 - 1;
                }
                this.f128206p = 0;
                this.f128198h = 4;
                if (this.f128207q == 1) {
                    this.f128210t = (char) (this.f128210t ^ 1);
                }
                if (this.f128210t > 0) {
                    this.f128195e.m111463a(this.f128203m);
                    this.f128206p++;
                    return this.f128203m;
                }
                this.f128198h = 2;
                this.f128205o++;
                this.f128202l = 0;
                return m149896u();
            case 4:
                if (this.f128206p < this.f128210t) {
                    this.f128195e.m111463a(this.f128203m);
                    this.f128206p++;
                    return this.f128203m;
                }
                this.f128198h = 2;
                this.f128205o++;
                this.f128202l = 0;
                return m149896u();
            case 5:
                ohg0.m164364a();
                return 0;
            case 6:
                if (this.f128203m != this.f128204n) {
                    this.f128202l = 1;
                    return m149895t();
                }
                int i6 = this.f128202l + 1;
                this.f128202l = i6;
                if (i6 < 4) {
                    return m149895t();
                }
                m149891m(this.f128209s, this.f128211u.f202361o.length, "su_tPos");
                zag0 zag0Var2 = this.f128211u;
                byte[] bArr2 = zag0Var2.f202361o;
                int i7 = this.f128209s;
                char c = (char) (bArr2[i7] & 255);
                this.f128210t = c;
                this.f128209s = zag0Var2.f202360n[i7];
                this.f128206p = 0;
                if (c <= 0) {
                    this.f128205o++;
                    this.f128202l = 0;
                    return m149895t();
                }
                int i8 = this.f128203m;
                this.f128195e.m111463a(i8);
                this.f128206p++;
                this.f128198h = 7;
                return i8;
            case 7:
                if (this.f128206p >= this.f128210t) {
                    this.f128205o++;
                    this.f128202l = 0;
                    return m149895t();
                }
                int i9 = this.f128203m;
                this.f128195e.m111463a(i9);
                this.f128206p++;
                this.f128198h = 7;
                return i9;
            default:
                ohg0.m164364a();
                return 0;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            thg0.m188906a("offs(", i, ") < 0.");
            return 0;
        }
        if (i2 < 0) {
            thg0.m188906a("len(", i2, ") < 0.");
            return 0;
        }
        int i3 = i + i2;
        if (i3 > bArr.length) {
            throw new IndexOutOfBoundsException("offs(" + i + ") + len(" + i2 + ") > dest.length(" + bArr.length + ").");
        }
        if (this.f128197g == null) {
            rhg0.m179353a("Stream closed");
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        int i4 = i;
        while (i4 < i3) {
            int iM149894q = m149894q();
            if (iM149894q < 0) {
                break;
            }
            bArr[i4] = (byte) iM149894q;
            count(1);
            i4++;
        }
        if (i4 == i) {
            return -1;
        }
        return i4 - i;
    }

    /* JADX INFO: renamed from: t */
    public final int m149895t() throws IOException {
        if (this.f128205o <= this.f128191a) {
            this.f128204n = this.f128203m;
            zag0 zag0Var = this.f128211u;
            byte[] bArr = zag0Var.f202361o;
            int i = this.f128209s;
            int i2 = bArr[i] & 255;
            this.f128203m = i2;
            m149891m(i, zag0Var.f202360n.length, "su_tPos");
            this.f128209s = this.f128211u.f202360n[this.f128209s];
            this.f128205o++;
            this.f128198h = 6;
            this.f128195e.m111463a(i2);
            return i2;
        }
        this.f128198h = 5;
        int i3 = ~this.f128195e.f85941a;
        int i4 = this.f128199i;
        if (i4 == i3) {
            int i5 = this.f128201k;
            this.f128201k = i3 ^ ((i5 >>> 31) | (i5 << 1));
            m149892k();
            return m149893n();
        }
        int i6 = this.f128200j;
        this.f128201k = ((i6 >>> 31) | (i6 << 1)) ^ i4;
        rhg0.m179353a("BZip2 CRC error");
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public final int m149896u() throws IOException {
        if (this.f128205o > this.f128191a) {
            int i = ~this.f128195e.f85941a;
            int i2 = this.f128199i;
            if (i2 == i) {
                int i3 = this.f128201k;
                this.f128201k = i ^ ((i3 >>> 31) | (i3 << 1));
                m149892k();
                return m149893n();
            }
            int i4 = this.f128200j;
            this.f128201k = ((i4 >>> 31) | (i4 << 1)) ^ i2;
            rhg0.m179353a("BZip2 CRC error");
            return 0;
        }
        this.f128204n = this.f128203m;
        zag0 zag0Var = this.f128211u;
        byte[] bArr = zag0Var.f202361o;
        int i5 = this.f128209s;
        int i6 = bArr[i5] & 255;
        m149891m(i5, zag0Var.f202360n.length, "su_tPos");
        this.f128209s = this.f128211u.f202360n[this.f128209s];
        int i7 = this.f128207q;
        if (i7 == 0) {
            int i8 = this.f128208r;
            this.f128207q = glg0.f103319a[i8] - 1;
            int i9 = i8 + 1;
            this.f128208r = i9;
            if (i9 == 512) {
                this.f128208r = 0;
            }
        } else {
            this.f128207q = i7 - 1;
        }
        int i10 = i6 ^ (this.f128207q == 1 ? 1 : 0);
        this.f128203m = i10;
        this.f128205o++;
        this.f128198h = 3;
        this.f128195e.m111463a(i10);
        return i10;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f128197g != null) {
            int iM149894q = m149894q();
            count(iM149894q < 0 ? -1 : 1);
            return iM149894q;
        }
        rhg0.m179353a("Stream closed");
        return 0;
    }
}
