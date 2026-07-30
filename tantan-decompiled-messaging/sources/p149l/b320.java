package p149l;

import androidx.annotation.Nullable;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class b320 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f72762a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final float[] f72763b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c */
    public static final Object f72764c = new Object();

    /* JADX INFO: renamed from: d */
    public static int[] f72765d = new int[10];

    /* JADX INFO: renamed from: l.b320$a */
    public static final class C15783a {

        /* JADX INFO: renamed from: a */
        public final int f72766a;

        /* JADX INFO: renamed from: b */
        public final boolean f72767b;

        /* JADX INFO: renamed from: c */
        public final int f72768c;

        /* JADX INFO: renamed from: d */
        public final int f72769d;

        /* JADX INFO: renamed from: e */
        public final int f72770e;

        /* JADX INFO: renamed from: f */
        public final int f72771f;

        /* JADX INFO: renamed from: g */
        public final int f72772g;

        /* JADX INFO: renamed from: h */
        public final int[] f72773h;

        /* JADX INFO: renamed from: i */
        public final int f72774i;

        /* JADX INFO: renamed from: j */
        public final int f72775j;

        /* JADX INFO: renamed from: k */
        public final int f72776k;

        /* JADX INFO: renamed from: l */
        public final int f72777l;

        /* JADX INFO: renamed from: m */
        public final float f72778m;

        /* JADX INFO: renamed from: n */
        public final int f72779n;

        /* JADX INFO: renamed from: o */
        public final int f72780o;

        /* JADX INFO: renamed from: p */
        public final int f72781p;

        public C15783a(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int[] iArr, int i7, int i8, int i9, int i10, float f, int i11, int i12, int i13) {
            this.f72766a = i;
            this.f72767b = z;
            this.f72768c = i2;
            this.f72769d = i3;
            this.f72770e = i4;
            this.f72771f = i5;
            this.f72772g = i6;
            this.f72773h = iArr;
            this.f72774i = i7;
            this.f72775j = i8;
            this.f72776k = i9;
            this.f72777l = i10;
            this.f72778m = f;
            this.f72779n = i11;
            this.f72780o = i12;
            this.f72781p = i13;
        }
    }

    /* JADX INFO: renamed from: l.b320$b */
    public static final class C15784b {

        /* JADX INFO: renamed from: a */
        public final int f72782a;

        /* JADX INFO: renamed from: b */
        public final int f72783b;

        /* JADX INFO: renamed from: c */
        public final boolean f72784c;

        public C15784b(int i, int i2, boolean z) {
            this.f72782a = i;
            this.f72783b = i2;
            this.f72784c = z;
        }
    }

    /* JADX INFO: renamed from: l.b320$c */
    public static final class C15785c {

        /* JADX INFO: renamed from: a */
        public final int f72785a;

        /* JADX INFO: renamed from: b */
        public final int f72786b;

        /* JADX INFO: renamed from: c */
        public final int f72787c;

        /* JADX INFO: renamed from: d */
        public final int f72788d;

        /* JADX INFO: renamed from: e */
        public final int f72789e;

        /* JADX INFO: renamed from: f */
        public final int f72790f;

        /* JADX INFO: renamed from: g */
        public final int f72791g;

        /* JADX INFO: renamed from: h */
        public final float f72792h;

        /* JADX INFO: renamed from: i */
        public final boolean f72793i;

        /* JADX INFO: renamed from: j */
        public final boolean f72794j;

        /* JADX INFO: renamed from: k */
        public final int f72795k;

        /* JADX INFO: renamed from: l */
        public final int f72796l;

        /* JADX INFO: renamed from: m */
        public final int f72797m;

        /* JADX INFO: renamed from: n */
        public final boolean f72798n;

        /* JADX INFO: renamed from: o */
        public final int f72799o;

        /* JADX INFO: renamed from: p */
        public final int f72800p;

        /* JADX INFO: renamed from: q */
        public final int f72801q;

        public C15785c(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, boolean z, boolean z2, int i8, int i9, int i10, boolean z3, int i11, int i12, int i13) {
            this.f72785a = i;
            this.f72786b = i2;
            this.f72787c = i3;
            this.f72788d = i4;
            this.f72789e = i5;
            this.f72790f = i6;
            this.f72791g = i7;
            this.f72792h = f;
            this.f72793i = z;
            this.f72794j = z2;
            this.f72795k = i8;
            this.f72796l = i9;
            this.f72797m = i10;
            this.f72798n = z3;
            this.f72799o = i11;
            this.f72800p = i12;
            this.f72801q = i13;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m100038a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX INFO: renamed from: b */
    public static void m100039b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i4 = byteBuffer.get(i) & 255;
            if (i2 == 3) {
                if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i4 == 0) {
                i2++;
            }
            if (i4 != 0) {
                i2 = 0;
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m100040c(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        p11.m167013g(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m100038a(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m100038a(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m100038a(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    m100038a(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    /* JADX INFO: renamed from: d */
    public static int m100041d(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: e */
    public static int m100042e(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* JADX INFO: renamed from: f */
    public static int m100043f(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m100044g(@Nullable String str, byte b) {
        return (YtVideoEncoder.MIME_TYPE.equals(str) && (b & 31) == 6) || ("video/hevc".equals(str) && ((b & 126) >> 1) == 39);
    }

    /* JADX INFO: renamed from: h */
    public static C15783a m100045h(byte[] bArr, int i, int i2) {
        return m100046i(bArr, i + 2, i2);
    }

    /* JADX INFO: renamed from: i */
    public static C15783a m100046i(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        e860 e860Var = new e860(bArr, i, i2);
        e860Var.m115254l(4);
        int iM115247e = e860Var.m115247e(3);
        e860Var.m115253k();
        int iM115247e2 = e860Var.m115247e(2);
        boolean zM115246d = e860Var.m115246d();
        int iM115247e3 = e860Var.m115247e(5);
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            if (e860Var.m115246d()) {
                i10 |= 1 << i11;
            }
        }
        int[] iArr = new int[6];
        for (int i12 = 0; i12 < 6; i12++) {
            iArr[i12] = e860Var.m115247e(8);
        }
        int iM115247e4 = e860Var.m115247e(8);
        int i13 = 0;
        for (int i14 = 0; i14 < iM115247e; i14++) {
            if (e860Var.m115246d()) {
                i13 += 89;
            }
            if (e860Var.m115246d()) {
                i13 += 8;
            }
        }
        e860Var.m115254l(i13);
        if (iM115247e > 0) {
            e860Var.m115254l((8 - iM115247e) * 2);
        }
        int iM115250h = e860Var.m115250h();
        int iM115250h2 = e860Var.m115250h();
        if (iM115250h2 == 3) {
            e860Var.m115253k();
        }
        int iM115250h3 = e860Var.m115250h();
        int iM115250h4 = e860Var.m115250h();
        if (e860Var.m115246d()) {
            int iM115250h5 = e860Var.m115250h();
            int iM115250h6 = e860Var.m115250h();
            int iM115250h7 = e860Var.m115250h();
            int iM115250h8 = e860Var.m115250h();
            iM115250h3 -= ((iM115250h2 == 1 || iM115250h2 == 2) ? 2 : 1) * (iM115250h5 + iM115250h6);
            iM115250h4 -= (iM115250h2 == 1 ? 2 : 1) * (iM115250h7 + iM115250h8);
        }
        int iM115250h9 = e860Var.m115250h();
        int iM115250h10 = e860Var.m115250h();
        int iM115250h11 = e860Var.m115250h();
        for (int i15 = e860Var.m115246d() ? 0 : iM115247e; i15 <= iM115247e; i15++) {
            e860Var.m115250h();
            e860Var.m115250h();
            e860Var.m115250h();
        }
        e860Var.m115250h();
        e860Var.m115250h();
        e860Var.m115250h();
        e860Var.m115250h();
        e860Var.m115250h();
        e860Var.m115250h();
        if (e860Var.m115246d() && e860Var.m115246d()) {
            m100051n(e860Var);
        }
        e860Var.m115254l(2);
        if (e860Var.m115246d()) {
            e860Var.m115254l(8);
            e860Var.m115250h();
            e860Var.m115250h();
            e860Var.m115253k();
        }
        m100053p(e860Var);
        if (e860Var.m115246d()) {
            int iM115250h12 = e860Var.m115250h();
            for (int i16 = 0; i16 < iM115250h12; i16++) {
                e860Var.m115254l(iM115250h11 + 5);
            }
        }
        e860Var.m115254l(2);
        float f = 1.0f;
        if (e860Var.m115246d()) {
            if (e860Var.m115246d()) {
                int iM115247e5 = e860Var.m115247e(8);
                if (iM115247e5 == 255) {
                    int iM115247e6 = e860Var.m115247e(16);
                    int iM115247e7 = e860Var.m115247e(16);
                    if (iM115247e6 != 0 && iM115247e7 != 0) {
                        f = iM115247e6 / iM115247e7;
                    }
                } else {
                    float[] fArr = f72763b;
                    if (iM115247e5 < fArr.length) {
                        f = fArr[iM115247e5];
                    } else {
                        jwv.m143689i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iM115247e5);
                    }
                }
            }
            if (e860Var.m115246d()) {
                e860Var.m115253k();
            }
            if (e860Var.m115246d()) {
                e860Var.m115254l(3);
                i9 = e860Var.m115246d() ? 1 : 2;
                if (e860Var.m115246d()) {
                    int iM115247e8 = e860Var.m115247e(8);
                    int iM115247e9 = e860Var.m115247e(8);
                    e860Var.m115254l(8);
                    int iM111099h = de5.m111099h(iM115247e8);
                    int iM111100i = de5.m111100i(iM115247e9);
                    i8 = iM111099h;
                    i7 = iM111100i;
                } else {
                    i7 = -1;
                    i8 = -1;
                }
            } else {
                i7 = -1;
                i8 = -1;
                i9 = -1;
            }
            if (e860Var.m115246d()) {
                e860Var.m115250h();
                e860Var.m115250h();
            }
            e860Var.m115253k();
            if (e860Var.m115246d()) {
                iM115250h4 *= 2;
            }
            i6 = i7;
            i4 = i8;
            i5 = i9;
            i3 = iM115250h4;
        } else {
            i3 = iM115250h4;
            i4 = -1;
            i5 = -1;
            i6 = -1;
        }
        return new C15783a(iM115247e2, zM115246d, iM115247e3, i10, iM115250h2, iM115250h9, iM115250h10, iArr, iM115247e4, iM115250h, iM115250h3, i3, f, i4, i5, i6);
    }

    /* JADX INFO: renamed from: j */
    public static C15784b m100047j(byte[] bArr, int i, int i2) {
        return m100048k(bArr, i + 1, i2);
    }

    /* JADX INFO: renamed from: k */
    public static C15784b m100048k(byte[] bArr, int i, int i2) {
        e860 e860Var = new e860(bArr, i, i2);
        int iM115250h = e860Var.m115250h();
        int iM115250h2 = e860Var.m115250h();
        e860Var.m115253k();
        return new C15784b(iM115250h, iM115250h2, e860Var.m115246d());
    }

    /* JADX INFO: renamed from: l */
    public static C15785c m100049l(byte[] bArr, int i, int i2) {
        return m100050m(bArr, i + 1, i2);
    }

    /* JADX WARN: Code duplicated, block: B:98:0x01b2 A[PHI: r16
      0x01b2: PHI (r16v5 float) = (r16v4 float), (r16v9 float) binds: [B:72:0x0139, B:89:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: m */
    public static C15785c m100050m(byte[] bArr, int i, int i2) {
        int iM115250h;
        boolean zM115246d;
        int i3;
        boolean z;
        int iM115250h2;
        int iM111099h;
        int i4;
        int iM111100i;
        int i5;
        e860 e860Var = new e860(bArr, i, i2);
        int iM115247e = e860Var.m115247e(8);
        int iM115247e2 = e860Var.m115247e(8);
        int iM115247e3 = e860Var.m115247e(8);
        int iM115250h3 = e860Var.m115250h();
        int i6 = 1;
        if (iM115247e == 100 || iM115247e == 110 || iM115247e == 122 || iM115247e == 244 || iM115247e == 44 || iM115247e == 83 || iM115247e == 86 || iM115247e == 118 || iM115247e == 128 || iM115247e == 138) {
            iM115250h = e860Var.m115250h();
            zM115246d = iM115250h == 3 ? e860Var.m115246d() : false;
            e860Var.m115250h();
            e860Var.m115250h();
            e860Var.m115253k();
            if (e860Var.m115246d()) {
                int i7 = iM115250h != 3 ? 8 : 12;
                int i8 = 0;
                while (i8 < i7) {
                    if (e860Var.m115246d()) {
                        m100052o(e860Var, i8 < 6 ? 16 : 64);
                    }
                    i8++;
                }
            }
        } else {
            iM115250h = 1;
            zM115246d = false;
        }
        int iM115250h4 = e860Var.m115250h() + 4;
        int iM115250h5 = e860Var.m115250h();
        if (iM115250h5 == 0) {
            i6 = 1;
            zM115246d = zM115246d;
            iM115250h2 = e860Var.m115250h() + 4;
            i3 = 16;
            z = false;
        } else {
            if (iM115250h5 == 1) {
                boolean zM115246d2 = e860Var.m115246d();
                e860Var.m115249g();
                e860Var.m115249g();
                long jM115250h = e860Var.m115250h();
                i3 = 16;
                for (int i9 = 0; i9 < jM115250h; i9++) {
                    e860Var.m115250h();
                }
                z = zM115246d2;
            } else {
                i3 = 16;
                z = false;
            }
            iM115250h2 = 0;
        }
        int iM115250h6 = e860Var.m115250h();
        e860Var.m115253k();
        int iM115250h7 = e860Var.m115250h() + 1;
        int iM115250h8 = e860Var.m115250h() + 1;
        boolean zM115246d3 = e860Var.m115246d();
        int i10 = (2 - (zM115246d3 ? 1 : 0)) * iM115250h8;
        if (!zM115246d3) {
            e860Var.m115253k();
        }
        e860Var.m115253k();
        int i11 = iM115250h7 * 16;
        int i12 = i10 * 16;
        if (e860Var.m115246d()) {
            int iM115250h9 = e860Var.m115250h();
            int iM115250h10 = e860Var.m115250h();
            int iM115250h11 = e860Var.m115250h();
            int iM115250h12 = e860Var.m115250h();
            if (iM115250h == 0) {
                i5 = 2 - (zM115246d3 ? 1 : 0);
            } else {
                if (iM115250h != 3) {
                    i6 = 2;
                }
                i5 = (iM115250h == i6 ? 2 : i6) * (2 - (zM115246d3 ? 1 : 0));
            }
            i11 -= (iM115250h9 + iM115250h10) * i6;
            i12 -= (iM115250h11 + iM115250h12) * i5;
        }
        float f = 1.0f;
        if (e860Var.m115246d()) {
            if (e860Var.m115246d()) {
                int iM115247e4 = e860Var.m115247e(8);
                if (iM115247e4 == 255) {
                    int i13 = i3;
                    int iM115247e5 = e860Var.m115247e(i13);
                    int iM115247e6 = e860Var.m115247e(i13);
                    if (iM115247e5 != 0 && iM115247e6 != 0) {
                        f = iM115247e5 / iM115247e6;
                    }
                } else {
                    float[] fArr = f72763b;
                    if (iM115247e4 < fArr.length) {
                        f = fArr[iM115247e4];
                    } else {
                        jwv.m143689i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iM115247e4);
                    }
                }
            }
            if (e860Var.m115246d()) {
                e860Var.m115253k();
            }
            if (e860Var.m115246d()) {
                e860Var.m115254l(3);
                i4 = e860Var.m115246d() ? 1 : 2;
                if (e860Var.m115246d()) {
                    int iM115247e7 = e860Var.m115247e(8);
                    int iM115247e8 = e860Var.m115247e(8);
                    e860Var.m115254l(8);
                    iM111099h = de5.m111099h(iM115247e7);
                    iM111100i = de5.m111100i(iM115247e8);
                } else {
                    iM111099h = -1;
                }
            } else {
                iM111099h = -1;
                i4 = -1;
            }
            iM111100i = -1;
        } else {
            iM111099h = -1;
            i4 = -1;
            iM111100i = -1;
        }
        return new C15785c(iM115247e, iM115247e2, iM115247e3, iM115250h3, iM115250h6, i11, i12, f, zM115246d, zM115246d3, iM115250h4, iM115250h5, iM115250h2, z, iM111099h, i4, iM111100i);
    }

    /* JADX INFO: renamed from: n */
    public static void m100051n(e860 e860Var) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (e860Var.m115246d()) {
                    int iMin = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        e860Var.m115249g();
                    }
                    for (int i4 = 0; i4 < iMin; i4++) {
                        e860Var.m115249g();
                    }
                } else {
                    e860Var.m115250h();
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m100052o(e860 e860Var, int i) {
        int iM115249g = 8;
        int i2 = 8;
        for (int i3 = 0; i3 < i; i3++) {
            if (iM115249g != 0) {
                iM115249g = ((e860Var.m115249g() + i2) + 256) % 256;
            }
            if (iM115249g != 0) {
                i2 = iM115249g;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m100053p(e860 e860Var) {
        int iM115250h = e860Var.m115250h();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < iM115250h; i3++) {
            if (i3 == 0 || !e860Var.m115246d()) {
                int iM115250h2 = e860Var.m115250h();
                int iM115250h3 = e860Var.m115250h();
                int[] iArr2 = new int[iM115250h2];
                int i4 = 0;
                while (i4 < iM115250h2) {
                    iArr2[i4] = (i4 > 0 ? iArr2[i4 - 1] : 0) - (e860Var.m115250h() + 1);
                    e860Var.m115253k();
                    i4++;
                }
                int[] iArr3 = new int[iM115250h3];
                int i5 = 0;
                while (i5 < iM115250h3) {
                    iArr3[i5] = (i5 > 0 ? iArr3[i5 - 1] : 0) + e860Var.m115250h() + 1;
                    e860Var.m115253k();
                    i5++;
                }
                i = iM115250h2;
                iArr = iArr2;
                i2 = iM115250h3;
                iArrCopyOf = iArr3;
            } else {
                int i6 = i + i2;
                int iM115250h4 = (1 - ((e860Var.m115246d() ? 1 : 0) * 2)) * (e860Var.m115250h() + 1);
                int i7 = i6 + 1;
                boolean[] zArr = new boolean[i7];
                for (int i8 = 0; i8 <= i6; i8++) {
                    if (e860Var.m115246d()) {
                        zArr[i8] = true;
                    } else {
                        zArr[i8] = e860Var.m115246d();
                    }
                }
                int[] iArr4 = new int[i7];
                int[] iArr5 = new int[i7];
                int i9 = 0;
                for (int i10 = i2 - 1; i10 >= 0; i10--) {
                    int i11 = iArrCopyOf[i10] + iM115250h4;
                    if (i11 < 0 && zArr[i + i10]) {
                        iArr4[i9] = i11;
                        i9++;
                    }
                }
                if (iM115250h4 < 0 && zArr[i6]) {
                    iArr4[i9] = iM115250h4;
                    i9++;
                }
                for (int i12 = 0; i12 < i; i12++) {
                    int i13 = iArr[i12] + iM115250h4;
                    if (i13 < 0 && zArr[i12]) {
                        iArr4[i9] = i13;
                        i9++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i9);
                int i14 = 0;
                for (int i15 = i - 1; i15 >= 0; i15--) {
                    int i16 = iArr[i15] + iM115250h4;
                    if (i16 > 0 && zArr[i15]) {
                        iArr5[i14] = i16;
                        i14++;
                    }
                }
                if (iM115250h4 > 0 && zArr[i6]) {
                    iArr5[i14] = iM115250h4;
                    i14++;
                }
                for (int i17 = 0; i17 < i2; i17++) {
                    int i18 = iArrCopyOf[i17] + iM115250h4;
                    if (i18 > 0 && zArr[i + i17]) {
                        iArr5[i14] = i18;
                        i14++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i14);
                iArr = iArrCopyOf2;
                i = i9;
                i2 = i14;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static int m100054q(byte[] bArr, int i) {
        int i2;
        synchronized (f72764c) {
            int iM100041d = 0;
            int i3 = 0;
            while (iM100041d < i) {
                try {
                    iM100041d = m100041d(bArr, iM100041d, i);
                    if (iM100041d < i) {
                        int[] iArr = f72765d;
                        if (iArr.length <= i3) {
                            f72765d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f72765d[i3] = iM100041d;
                        iM100041d += 3;
                        i3++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2 = i - i3;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = f72765d[i6] - i5;
                System.arraycopy(bArr, i5, bArr, i4, i7);
                int i8 = i4 + i7;
                int i9 = i8 + 1;
                bArr[i8] = 0;
                i4 = i8 + 2;
                bArr[i9] = 0;
                i5 += i7 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i4, i2 - i4);
        }
        return i2;
    }
}
