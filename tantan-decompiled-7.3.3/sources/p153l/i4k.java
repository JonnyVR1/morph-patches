package p153l;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public class i4k extends by2 {

    /* JADX INFO: renamed from: d */
    public static final byte[] f112922d = new byte[0];

    /* JADX INFO: renamed from: b */
    public byte[] f112923b;

    /* JADX INFO: renamed from: c */
    public final int[] f112924c;

    public i4k(uhw uhwVar) {
        super(uhwVar);
        this.f112923b = f112922d;
        this.f112924c = new int[32];
    }

    /* JADX INFO: renamed from: g */
    public static int m138550g(int[] iArr) throws NotFoundException {
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

    @Override // p153l.by2
    /* JADX INFO: renamed from: b */
    public d13 mo106956b() throws NotFoundException {
        uhw uhwVarM106959e = m106959e();
        int iM196129d = uhwVarM106959e.m196129d();
        int iM196126a = uhwVarM106959e.m196126a();
        d13 d13Var = new d13(iM196129d, iM196126a);
        m138551h(iM196129d);
        int[] iArr = this.f112924c;
        for (int i = 1; i < 5; i++) {
            byte[] bArrMo196128c = uhwVarM106959e.mo196128c((iM196126a * i) / 5, this.f112923b);
            int i2 = (iM196129d << 2) / 5;
            for (int i3 = iM196129d / 5; i3 < i2; i3++) {
                int i4 = (bArrMo196128c[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int iM138550g = m138550g(iArr);
        byte[] bArrMo196127b = uhwVarM106959e.mo196127b();
        for (int i5 = 0; i5 < iM196126a; i5++) {
            int i6 = i5 * iM196129d;
            for (int i7 = 0; i7 < iM196129d; i7++) {
                if ((bArrMo196127b[i6 + i7] & 255) < iM138550g) {
                    d13Var.m113488o(i7, i5);
                }
            }
        }
        return d13Var;
    }

    @Override // p153l.by2
    /* JADX INFO: renamed from: c */
    public b13 mo106957c(int i, b13 b13Var) throws NotFoundException {
        uhw uhwVarM106959e = m106959e();
        int iM196129d = uhwVarM106959e.m196129d();
        if (b13Var == null || b13Var.m101402m() < iM196129d) {
            b13Var = new b13(iM196129d);
        } else {
            b13Var.clear();
        }
        m138551h(iM196129d);
        byte[] bArrMo196128c = uhwVarM106959e.mo196128c(i, this.f112923b);
        int[] iArr = this.f112924c;
        for (int i2 = 0; i2 < iM196129d; i2++) {
            int i3 = (bArrMo196128c[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int iM138550g = m138550g(iArr);
        if (iM196129d < 3) {
            for (int i4 = 0; i4 < iM196129d; i4++) {
                if ((bArrMo196128c[i4] & 255) < iM138550g) {
                    b13Var.m101406r(i4);
                }
            }
        } else {
            int i5 = bArrMo196128c[0] & 255;
            int i6 = bArrMo196128c[1] & 255;
            int i7 = 1;
            while (i7 < iM196129d - 1) {
                int i8 = i7 + 1;
                int i9 = bArrMo196128c[i8] & 255;
                if ((((i6 << 2) - i5) - i9) / 2 < iM138550g) {
                    b13Var.m101406r(i7);
                }
                i5 = i6;
                i7 = i8;
                i6 = i9;
            }
        }
        return b13Var;
    }

    /* JADX INFO: renamed from: h */
    public final void m138551h(int i) {
        if (this.f112923b.length < i) {
            this.f112923b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f112924c[i2] = 0;
        }
    }
}
