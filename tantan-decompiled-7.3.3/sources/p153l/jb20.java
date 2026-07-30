package p153l;

import androidx.annotation.Nullable;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class jb20 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f119084a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final float[] f119085b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c */
    public static final Object f119086c = new Object();

    /* JADX INFO: renamed from: d */
    public static int[] f119087d = new int[10];

    /* JADX INFO: renamed from: l.jb20$a */
    public static final class C17912a {

        /* JADX INFO: renamed from: a */
        public final int f119088a;

        /* JADX INFO: renamed from: b */
        public final boolean f119089b;

        /* JADX INFO: renamed from: c */
        public final int f119090c;

        /* JADX INFO: renamed from: d */
        public final int f119091d;

        /* JADX INFO: renamed from: e */
        public final int f119092e;

        /* JADX INFO: renamed from: f */
        public final int f119093f;

        /* JADX INFO: renamed from: g */
        public final int f119094g;

        /* JADX INFO: renamed from: h */
        public final int[] f119095h;

        /* JADX INFO: renamed from: i */
        public final int f119096i;

        /* JADX INFO: renamed from: j */
        public final int f119097j;

        /* JADX INFO: renamed from: k */
        public final int f119098k;

        /* JADX INFO: renamed from: l */
        public final int f119099l;

        /* JADX INFO: renamed from: m */
        public final float f119100m;

        /* JADX INFO: renamed from: n */
        public final int f119101n;

        /* JADX INFO: renamed from: o */
        public final int f119102o;

        /* JADX INFO: renamed from: p */
        public final int f119103p;

        public C17912a(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int[] iArr, int i7, int i8, int i9, int i10, float f, int i11, int i12, int i13) {
            this.f119088a = i;
            this.f119089b = z;
            this.f119090c = i2;
            this.f119091d = i3;
            this.f119092e = i4;
            this.f119093f = i5;
            this.f119094g = i6;
            this.f119095h = iArr;
            this.f119096i = i7;
            this.f119097j = i8;
            this.f119098k = i9;
            this.f119099l = i10;
            this.f119100m = f;
            this.f119101n = i11;
            this.f119102o = i12;
            this.f119103p = i13;
        }
    }

    /* JADX INFO: renamed from: l.jb20$b */
    public static final class C17913b {

        /* JADX INFO: renamed from: a */
        public final int f119104a;

        /* JADX INFO: renamed from: b */
        public final int f119105b;

        /* JADX INFO: renamed from: c */
        public final boolean f119106c;

        public C17913b(int i, int i2, boolean z) {
            this.f119104a = i;
            this.f119105b = i2;
            this.f119106c = z;
        }
    }

    /* JADX INFO: renamed from: l.jb20$c */
    public static final class C17914c {

        /* JADX INFO: renamed from: a */
        public final int f119107a;

        /* JADX INFO: renamed from: b */
        public final int f119108b;

        /* JADX INFO: renamed from: c */
        public final int f119109c;

        /* JADX INFO: renamed from: d */
        public final int f119110d;

        /* JADX INFO: renamed from: e */
        public final int f119111e;

        /* JADX INFO: renamed from: f */
        public final int f119112f;

        /* JADX INFO: renamed from: g */
        public final int f119113g;

        /* JADX INFO: renamed from: h */
        public final float f119114h;

        /* JADX INFO: renamed from: i */
        public final boolean f119115i;

        /* JADX INFO: renamed from: j */
        public final boolean f119116j;

        /* JADX INFO: renamed from: k */
        public final int f119117k;

        /* JADX INFO: renamed from: l */
        public final int f119118l;

        /* JADX INFO: renamed from: m */
        public final int f119119m;

        /* JADX INFO: renamed from: n */
        public final boolean f119120n;

        /* JADX INFO: renamed from: o */
        public final int f119121o;

        /* JADX INFO: renamed from: p */
        public final int f119122p;

        /* JADX INFO: renamed from: q */
        public final int f119123q;

        public C17914c(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, boolean z, boolean z2, int i8, int i9, int i10, boolean z3, int i11, int i12, int i13) {
            this.f119107a = i;
            this.f119108b = i2;
            this.f119109c = i3;
            this.f119110d = i4;
            this.f119111e = i5;
            this.f119112f = i6;
            this.f119113g = i7;
            this.f119114h = f;
            this.f119115i = z;
            this.f119116j = z2;
            this.f119117k = i8;
            this.f119118l = i9;
            this.f119119m = i10;
            this.f119120n = z3;
            this.f119121o = i11;
            this.f119122p = i12;
            this.f119123q = i13;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m144183a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX INFO: renamed from: b */
    public static void m144184b(ByteBuffer byteBuffer) {
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
    public static int m144185c(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        w11.m204371g(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m144183a(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m144183a(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m144183a(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    m144183a(zArr);
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
    public static int m144186d(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: e */
    public static int m144187e(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* JADX INFO: renamed from: f */
    public static int m144188f(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m144189g(@Nullable String str, byte b) {
        return (YtVideoEncoder.MIME_TYPE.equals(str) && (b & 31) == 6) || ("video/hevc".equals(str) && ((b & 126) >> 1) == 39);
    }

    /* JADX INFO: renamed from: h */
    public static C17912a m144190h(byte[] bArr, int i, int i2) {
        return m144191i(bArr, i + 2, i2);
    }

    /* JADX INFO: renamed from: i */
    public static C17912a m144191i(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        jg60 jg60Var = new jg60(bArr, i, i2);
        jg60Var.m144770l(4);
        int iM144763e = jg60Var.m144763e(3);
        jg60Var.m144769k();
        int iM144763e2 = jg60Var.m144763e(2);
        boolean zM144762d = jg60Var.m144762d();
        int iM144763e3 = jg60Var.m144763e(5);
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            if (jg60Var.m144762d()) {
                i10 |= 1 << i11;
            }
        }
        int[] iArr = new int[6];
        for (int i12 = 0; i12 < 6; i12++) {
            iArr[i12] = jg60Var.m144763e(8);
        }
        int iM144763e4 = jg60Var.m144763e(8);
        int i13 = 0;
        for (int i14 = 0; i14 < iM144763e; i14++) {
            if (jg60Var.m144762d()) {
                i13 += 89;
            }
            if (jg60Var.m144762d()) {
                i13 += 8;
            }
        }
        jg60Var.m144770l(i13);
        if (iM144763e > 0) {
            jg60Var.m144770l((8 - iM144763e) * 2);
        }
        int iM144766h = jg60Var.m144766h();
        int iM144766h2 = jg60Var.m144766h();
        if (iM144766h2 == 3) {
            jg60Var.m144769k();
        }
        int iM144766h3 = jg60Var.m144766h();
        int iM144766h4 = jg60Var.m144766h();
        if (jg60Var.m144762d()) {
            int iM144766h5 = jg60Var.m144766h();
            int iM144766h6 = jg60Var.m144766h();
            int iM144766h7 = jg60Var.m144766h();
            int iM144766h8 = jg60Var.m144766h();
            iM144766h3 -= ((iM144766h2 == 1 || iM144766h2 == 2) ? 2 : 1) * (iM144766h5 + iM144766h6);
            iM144766h4 -= (iM144766h2 == 1 ? 2 : 1) * (iM144766h7 + iM144766h8);
        }
        int iM144766h9 = jg60Var.m144766h();
        int iM144766h10 = jg60Var.m144766h();
        int iM144766h11 = jg60Var.m144766h();
        for (int i15 = jg60Var.m144762d() ? 0 : iM144763e; i15 <= iM144763e; i15++) {
            jg60Var.m144766h();
            jg60Var.m144766h();
            jg60Var.m144766h();
        }
        jg60Var.m144766h();
        jg60Var.m144766h();
        jg60Var.m144766h();
        jg60Var.m144766h();
        jg60Var.m144766h();
        jg60Var.m144766h();
        if (jg60Var.m144762d() && jg60Var.m144762d()) {
            m144196n(jg60Var);
        }
        jg60Var.m144770l(2);
        if (jg60Var.m144762d()) {
            jg60Var.m144770l(8);
            jg60Var.m144766h();
            jg60Var.m144766h();
            jg60Var.m144769k();
        }
        m144198p(jg60Var);
        if (jg60Var.m144762d()) {
            int iM144766h12 = jg60Var.m144766h();
            for (int i16 = 0; i16 < iM144766h12; i16++) {
                jg60Var.m144770l(iM144766h11 + 5);
            }
        }
        jg60Var.m144770l(2);
        float f = 1.0f;
        if (jg60Var.m144762d()) {
            if (jg60Var.m144762d()) {
                int iM144763e5 = jg60Var.m144763e(8);
                if (iM144763e5 == 255) {
                    int iM144763e6 = jg60Var.m144763e(16);
                    int iM144763e7 = jg60Var.m144763e(16);
                    if (iM144763e6 != 0 && iM144763e7 != 0) {
                        f = iM144763e6 / iM144763e7;
                    }
                } else {
                    float[] fArr = f119085b;
                    if (iM144763e5 < fArr.length) {
                        f = fArr[iM144763e5];
                    } else {
                        kyv.m152151i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iM144763e5);
                    }
                }
            }
            if (jg60Var.m144762d()) {
                jg60Var.m144769k();
            }
            if (jg60Var.m144762d()) {
                jg60Var.m144770l(3);
                i9 = jg60Var.m144762d() ? 1 : 2;
                if (jg60Var.m144762d()) {
                    int iM144763e8 = jg60Var.m144763e(8);
                    int iM144763e9 = jg60Var.m144763e(8);
                    jg60Var.m144770l(8);
                    int iM115496h = df5.m115496h(iM144763e8);
                    int iM115497i = df5.m115497i(iM144763e9);
                    i8 = iM115496h;
                    i7 = iM115497i;
                } else {
                    i7 = -1;
                    i8 = -1;
                }
            } else {
                i7 = -1;
                i8 = -1;
                i9 = -1;
            }
            if (jg60Var.m144762d()) {
                jg60Var.m144766h();
                jg60Var.m144766h();
            }
            jg60Var.m144769k();
            if (jg60Var.m144762d()) {
                iM144766h4 *= 2;
            }
            i6 = i7;
            i4 = i8;
            i5 = i9;
            i3 = iM144766h4;
        } else {
            i3 = iM144766h4;
            i4 = -1;
            i5 = -1;
            i6 = -1;
        }
        return new C17912a(iM144763e2, zM144762d, iM144763e3, i10, iM144766h2, iM144766h9, iM144766h10, iArr, iM144763e4, iM144766h, iM144766h3, i3, f, i4, i5, i6);
    }

    /* JADX INFO: renamed from: j */
    public static C17913b m144192j(byte[] bArr, int i, int i2) {
        return m144193k(bArr, i + 1, i2);
    }

    /* JADX INFO: renamed from: k */
    public static C17913b m144193k(byte[] bArr, int i, int i2) {
        jg60 jg60Var = new jg60(bArr, i, i2);
        int iM144766h = jg60Var.m144766h();
        int iM144766h2 = jg60Var.m144766h();
        jg60Var.m144769k();
        return new C17913b(iM144766h, iM144766h2, jg60Var.m144762d());
    }

    /* JADX INFO: renamed from: l */
    public static C17914c m144194l(byte[] bArr, int i, int i2) {
        return m144195m(bArr, i + 1, i2);
    }

    /* JADX WARN: Code duplicated, block: B:98:0x01b2 A[PHI: r16
      0x01b2: PHI (r16v5 float) = (r16v4 float), (r16v9 float) binds: [B:72:0x0139, B:89:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: m */
    public static C17914c m144195m(byte[] bArr, int i, int i2) {
        int iM144766h;
        boolean zM144762d;
        int i3;
        boolean z;
        int iM144766h2;
        int iM115496h;
        int i4;
        int iM115497i;
        int i5;
        jg60 jg60Var = new jg60(bArr, i, i2);
        int iM144763e = jg60Var.m144763e(8);
        int iM144763e2 = jg60Var.m144763e(8);
        int iM144763e3 = jg60Var.m144763e(8);
        int iM144766h3 = jg60Var.m144766h();
        int i6 = 1;
        if (iM144763e == 100 || iM144763e == 110 || iM144763e == 122 || iM144763e == 244 || iM144763e == 44 || iM144763e == 83 || iM144763e == 86 || iM144763e == 118 || iM144763e == 128 || iM144763e == 138) {
            iM144766h = jg60Var.m144766h();
            zM144762d = iM144766h == 3 ? jg60Var.m144762d() : false;
            jg60Var.m144766h();
            jg60Var.m144766h();
            jg60Var.m144769k();
            if (jg60Var.m144762d()) {
                int i7 = iM144766h != 3 ? 8 : 12;
                int i8 = 0;
                while (i8 < i7) {
                    if (jg60Var.m144762d()) {
                        m144197o(jg60Var, i8 < 6 ? 16 : 64);
                    }
                    i8++;
                }
            }
        } else {
            iM144766h = 1;
            zM144762d = false;
        }
        int iM144766h4 = jg60Var.m144766h() + 4;
        int iM144766h5 = jg60Var.m144766h();
        if (iM144766h5 == 0) {
            i6 = 1;
            zM144762d = zM144762d;
            iM144766h2 = jg60Var.m144766h() + 4;
            i3 = 16;
            z = false;
        } else {
            if (iM144766h5 == 1) {
                boolean zM144762d2 = jg60Var.m144762d();
                jg60Var.m144765g();
                jg60Var.m144765g();
                long jM144766h = jg60Var.m144766h();
                i3 = 16;
                for (int i9 = 0; i9 < jM144766h; i9++) {
                    jg60Var.m144766h();
                }
                z = zM144762d2;
            } else {
                i3 = 16;
                z = false;
            }
            iM144766h2 = 0;
        }
        int iM144766h6 = jg60Var.m144766h();
        jg60Var.m144769k();
        int iM144766h7 = jg60Var.m144766h() + 1;
        int iM144766h8 = jg60Var.m144766h() + 1;
        boolean zM144762d3 = jg60Var.m144762d();
        int i10 = (2 - (zM144762d3 ? 1 : 0)) * iM144766h8;
        if (!zM144762d3) {
            jg60Var.m144769k();
        }
        jg60Var.m144769k();
        int i11 = iM144766h7 * 16;
        int i12 = i10 * 16;
        if (jg60Var.m144762d()) {
            int iM144766h9 = jg60Var.m144766h();
            int iM144766h10 = jg60Var.m144766h();
            int iM144766h11 = jg60Var.m144766h();
            int iM144766h12 = jg60Var.m144766h();
            if (iM144766h == 0) {
                i5 = 2 - (zM144762d3 ? 1 : 0);
            } else {
                if (iM144766h != 3) {
                    i6 = 2;
                }
                i5 = (iM144766h == i6 ? 2 : i6) * (2 - (zM144762d3 ? 1 : 0));
            }
            i11 -= (iM144766h9 + iM144766h10) * i6;
            i12 -= (iM144766h11 + iM144766h12) * i5;
        }
        float f = 1.0f;
        if (jg60Var.m144762d()) {
            if (jg60Var.m144762d()) {
                int iM144763e4 = jg60Var.m144763e(8);
                if (iM144763e4 == 255) {
                    int i13 = i3;
                    int iM144763e5 = jg60Var.m144763e(i13);
                    int iM144763e6 = jg60Var.m144763e(i13);
                    if (iM144763e5 != 0 && iM144763e6 != 0) {
                        f = iM144763e5 / iM144763e6;
                    }
                } else {
                    float[] fArr = f119085b;
                    if (iM144763e4 < fArr.length) {
                        f = fArr[iM144763e4];
                    } else {
                        kyv.m152151i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iM144763e4);
                    }
                }
            }
            if (jg60Var.m144762d()) {
                jg60Var.m144769k();
            }
            if (jg60Var.m144762d()) {
                jg60Var.m144770l(3);
                i4 = jg60Var.m144762d() ? 1 : 2;
                if (jg60Var.m144762d()) {
                    int iM144763e7 = jg60Var.m144763e(8);
                    int iM144763e8 = jg60Var.m144763e(8);
                    jg60Var.m144770l(8);
                    iM115496h = df5.m115496h(iM144763e7);
                    iM115497i = df5.m115497i(iM144763e8);
                } else {
                    iM115496h = -1;
                }
            } else {
                iM115496h = -1;
                i4 = -1;
            }
            iM115497i = -1;
        } else {
            iM115496h = -1;
            i4 = -1;
            iM115497i = -1;
        }
        return new C17914c(iM144763e, iM144763e2, iM144763e3, iM144766h3, iM144766h6, i11, i12, f, zM144762d, zM144762d3, iM144766h4, iM144766h5, iM144766h2, z, iM115496h, i4, iM115497i);
    }

    /* JADX INFO: renamed from: n */
    public static void m144196n(jg60 jg60Var) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (jg60Var.m144762d()) {
                    int iMin = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        jg60Var.m144765g();
                    }
                    for (int i4 = 0; i4 < iMin; i4++) {
                        jg60Var.m144765g();
                    }
                } else {
                    jg60Var.m144766h();
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m144197o(jg60 jg60Var, int i) {
        int iM144765g = 8;
        int i2 = 8;
        for (int i3 = 0; i3 < i; i3++) {
            if (iM144765g != 0) {
                iM144765g = ((jg60Var.m144765g() + i2) + 256) % 256;
            }
            if (iM144765g != 0) {
                i2 = iM144765g;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m144198p(jg60 jg60Var) {
        int iM144766h = jg60Var.m144766h();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < iM144766h; i3++) {
            if (i3 == 0 || !jg60Var.m144762d()) {
                int iM144766h2 = jg60Var.m144766h();
                int iM144766h3 = jg60Var.m144766h();
                int[] iArr2 = new int[iM144766h2];
                int i4 = 0;
                while (i4 < iM144766h2) {
                    iArr2[i4] = (i4 > 0 ? iArr2[i4 - 1] : 0) - (jg60Var.m144766h() + 1);
                    jg60Var.m144769k();
                    i4++;
                }
                int[] iArr3 = new int[iM144766h3];
                int i5 = 0;
                while (i5 < iM144766h3) {
                    iArr3[i5] = (i5 > 0 ? iArr3[i5 - 1] : 0) + jg60Var.m144766h() + 1;
                    jg60Var.m144769k();
                    i5++;
                }
                i = iM144766h2;
                iArr = iArr2;
                i2 = iM144766h3;
                iArrCopyOf = iArr3;
            } else {
                int i6 = i + i2;
                int iM144766h4 = (1 - ((jg60Var.m144762d() ? 1 : 0) * 2)) * (jg60Var.m144766h() + 1);
                int i7 = i6 + 1;
                boolean[] zArr = new boolean[i7];
                for (int i8 = 0; i8 <= i6; i8++) {
                    if (jg60Var.m144762d()) {
                        zArr[i8] = true;
                    } else {
                        zArr[i8] = jg60Var.m144762d();
                    }
                }
                int[] iArr4 = new int[i7];
                int[] iArr5 = new int[i7];
                int i9 = 0;
                for (int i10 = i2 - 1; i10 >= 0; i10--) {
                    int i11 = iArrCopyOf[i10] + iM144766h4;
                    if (i11 < 0 && zArr[i + i10]) {
                        iArr4[i9] = i11;
                        i9++;
                    }
                }
                if (iM144766h4 < 0 && zArr[i6]) {
                    iArr4[i9] = iM144766h4;
                    i9++;
                }
                for (int i12 = 0; i12 < i; i12++) {
                    int i13 = iArr[i12] + iM144766h4;
                    if (i13 < 0 && zArr[i12]) {
                        iArr4[i9] = i13;
                        i9++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i9);
                int i14 = 0;
                for (int i15 = i - 1; i15 >= 0; i15--) {
                    int i16 = iArr[i15] + iM144766h4;
                    if (i16 > 0 && zArr[i15]) {
                        iArr5[i14] = i16;
                        i14++;
                    }
                }
                if (iM144766h4 > 0 && zArr[i6]) {
                    iArr5[i14] = iM144766h4;
                    i14++;
                }
                for (int i17 = 0; i17 < i2; i17++) {
                    int i18 = iArrCopyOf[i17] + iM144766h4;
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
    public static int m144199q(byte[] bArr, int i) {
        int i2;
        synchronized (f119086c) {
            int iM144186d = 0;
            int i3 = 0;
            while (iM144186d < i) {
                try {
                    iM144186d = m144186d(bArr, iM144186d, i);
                    if (iM144186d < i) {
                        int[] iArr = f119087d;
                        if (iArr.length <= i3) {
                            f119087d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f119087d[i3] = iM144186d;
                        iM144186d += 3;
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
                int i7 = f119087d[i6] - i5;
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
