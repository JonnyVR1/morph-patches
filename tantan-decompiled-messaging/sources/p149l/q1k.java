package p149l;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public class q1k extends mx2 {

    /* JADX INFO: renamed from: d */
    public static final byte[] f152136d = new byte[0];

    /* JADX INFO: renamed from: b */
    public byte[] f152137b;

    /* JADX INFO: renamed from: c */
    public final int[] f152138c;

    public q1k(wfw wfwVar) {
        super(wfwVar);
        this.f152137b = f152136d;
        this.f152138c = new int[32];
    }

    /* JADX INFO: renamed from: g */
    public static int m172397g(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 > i) {
                i3 = i4;
                i = i5;
            }
            if (i5 > i2) {
                i2 = i5;
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 - i3;
            int i10 = iArr[i8] * i9 * i9;
            if (i10 > i7) {
                i6 = i8;
                i7 = i10;
            }
        }
        if (i3 <= i6) {
            int i11 = i3;
            i3 = i6;
            i6 = i11;
        }
        if (i3 - i6 <= length / 16) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i12 = i3 - 1;
        int i13 = -1;
        int i14 = i12;
        while (i12 > i6) {
            int i15 = i12 - i6;
            int i16 = i15 * i15 * (i3 - i12) * (i2 - iArr[i12]);
            if (i16 > i13) {
                i14 = i12;
                i13 = i16;
            }
            i12--;
        }
        return i14 << 3;
    }

    @Override // p149l.mx2
    /* JADX INFO: renamed from: b */
    public o03 mo156827b() throws NotFoundException {
        wfw wfwVarM156830e = m156830e();
        int iM202992d = wfwVarM156830e.m202992d();
        int iM202991a = wfwVarM156830e.m202991a();
        o03 o03Var = new o03(iM202992d, iM202991a);
        m172398h(iM202992d);
        int[] iArr = this.f152138c;
        for (int i = 1; i < 5; i++) {
            byte[] bArrMo167374c = wfwVarM156830e.mo167374c((iM202991a * i) / 5, this.f152137b);
            int i2 = (iM202992d << 2) / 5;
            for (int i3 = iM202992d / 5; i3 < i2; i3++) {
                int i4 = (bArrMo167374c[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int iM172397g = m172397g(iArr);
        byte[] bArrMo167373b = wfwVarM156830e.mo167373b();
        for (int i5 = 0; i5 < iM202991a; i5++) {
            int i6 = i5 * iM202992d;
            for (int i7 = 0; i7 < iM202992d; i7++) {
                if ((bArrMo167373b[i6 + i7] & 255) < iM172397g) {
                    o03Var.m162118o(i7, i5);
                }
            }
        }
        return o03Var;
    }

    @Override // p149l.mx2
    /* JADX INFO: renamed from: c */
    public m03 mo156828c(int i, m03 m03Var) throws NotFoundException {
        wfw wfwVarM156830e = m156830e();
        int iM202992d = wfwVarM156830e.m202992d();
        if (m03Var == null || m03Var.m152494m() < iM202992d) {
            m03Var = new m03(iM202992d);
        } else {
            m03Var.clear();
        }
        m172398h(iM202992d);
        byte[] bArrMo167374c = wfwVarM156830e.mo167374c(i, this.f152137b);
        int[] iArr = this.f152138c;
        for (int i2 = 0; i2 < iM202992d; i2++) {
            int i3 = (bArrMo167374c[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int iM172397g = m172397g(iArr);
        if (iM202992d < 3) {
            for (int i4 = 0; i4 < iM202992d; i4++) {
                if ((bArrMo167374c[i4] & 255) < iM172397g) {
                    m03Var.m152498r(i4);
                }
            }
        } else {
            int i5 = bArrMo167374c[0] & 255;
            int i6 = bArrMo167374c[1] & 255;
            int i7 = 1;
            while (i7 < iM202992d - 1) {
                int i8 = i7 + 1;
                int i9 = bArrMo167374c[i8] & 255;
                if ((((i6 << 2) - i5) - i9) / 2 < iM172397g) {
                    m03Var.m152498r(i7);
                }
                i5 = i6;
                i7 = i8;
                i6 = i9;
            }
        }
        return m03Var;
    }

    /* JADX INFO: renamed from: h */
    public final void m172398h(int i) {
        if (this.f152137b.length < i) {
            this.f152137b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f152138c[i2] = 0;
        }
    }
}
