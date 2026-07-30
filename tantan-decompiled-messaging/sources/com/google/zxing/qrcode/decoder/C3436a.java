package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import p149l.j0l0;
import p149l.o03;
import p149l.vyi;

/* JADX INFO: renamed from: com.google.zxing.qrcode.decoder.a */
/* JADX INFO: loaded from: classes7.dex */
public final class C3436a {

    /* JADX INFO: renamed from: a */
    public final o03 f11676a;

    /* JADX INFO: renamed from: b */
    public j0l0 f11677b;

    /* JADX INFO: renamed from: c */
    public vyi f11678c;

    /* JADX INFO: renamed from: d */
    public boolean f11679d;

    public C3436a(o03 o03Var) throws FormatException {
        int iM162113j = o03Var.m162113j();
        if (iM162113j < 21 || (iM162113j & 3) != 1) {
            throw FormatException.getFormatInstance();
        }
        this.f11676a = o03Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m17363a(int i, int i2, int i3) {
        boolean z = this.f11679d;
        o03 o03Var = this.f11676a;
        return z ? o03Var.m162110d(i2, i) : o03Var.m162110d(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* JADX INFO: renamed from: b */
    public void m17364b() {
        int i = 0;
        while (i < this.f11676a.m162116m()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f11676a.m162113j(); i3++) {
                if (this.f11676a.m162110d(i, i3) != this.f11676a.m162110d(i3, i)) {
                    this.f11676a.m162109c(i3, i);
                    this.f11676a.m162109c(i, i3);
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: c */
    public byte[] m17365c() throws FormatException {
        vyi vyiVarM17366d = m17366d();
        j0l0 j0l0VarM17367e = m17367e();
        DataMask dataMask = DataMask.values()[vyiVarM17366d.m200654c()];
        int iM162113j = this.f11676a.m162113j();
        dataMask.unmaskBitMatrix(this.f11676a, iM162113j);
        o03 o03VarM139170a = j0l0VarM17367e.m139170a();
        byte[] bArr = new byte[j0l0VarM17367e.m139174h()];
        int i = iM162113j - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < iM162113j; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!o03VarM139170a.m162110d(i9, i7)) {
                        i4++;
                        i5 <<= 1;
                        if (this.f11676a.m162110d(i9, i7)) {
                            i5 |= 1;
                        }
                        if (i4 == 8) {
                            bArr[i3] = (byte) i5;
                            i3++;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                }
            }
            z = !z;
            i2 -= 2;
        }
        if (i3 == j0l0VarM17367e.m139174h()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX INFO: renamed from: d */
    public vyi m17366d() throws FormatException {
        vyi vyiVar = this.f11678c;
        if (vyiVar != null) {
            return vyiVar;
        }
        int iM17363a = 0;
        int iM17363a2 = 0;
        for (int i = 0; i < 6; i++) {
            iM17363a2 = m17363a(i, 8, iM17363a2);
        }
        int iM17363a3 = m17363a(8, 7, m17363a(8, 8, m17363a(7, 8, iM17363a2)));
        for (int i2 = 5; i2 >= 0; i2--) {
            iM17363a3 = m17363a(8, i2, iM17363a3);
        }
        int iM162113j = this.f11676a.m162113j();
        int i3 = iM162113j - 7;
        for (int i4 = iM162113j - 1; i4 >= i3; i4--) {
            iM17363a = m17363a(8, i4, iM17363a);
        }
        for (int i5 = iM162113j - 8; i5 < iM162113j; i5++) {
            iM17363a = m17363a(i5, 8, iM17363a);
        }
        vyi vyiVarM200651a = vyi.m200651a(iM17363a3, iM17363a);
        this.f11678c = vyiVarM200651a;
        if (vyiVarM200651a != null) {
            return vyiVarM200651a;
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX INFO: renamed from: e */
    public j0l0 m17367e() throws FormatException {
        j0l0 j0l0Var = this.f11677b;
        if (j0l0Var != null) {
            return j0l0Var;
        }
        int iM162113j = this.f11676a.m162113j();
        int i = (iM162113j - 17) / 4;
        if (i <= 6) {
            return j0l0.m139169i(i);
        }
        int i2 = iM162113j - 11;
        int iM17363a = 0;
        int iM17363a2 = 0;
        for (int i3 = 5; i3 >= 0; i3--) {
            for (int i4 = iM162113j - 9; i4 >= i2; i4--) {
                iM17363a2 = m17363a(i4, i3, iM17363a2);
            }
        }
        j0l0 j0l0VarM139167c = j0l0.m139167c(iM17363a2);
        if (j0l0VarM139167c != null && j0l0VarM139167c.m139172e() == iM162113j) {
            this.f11677b = j0l0VarM139167c;
            return j0l0VarM139167c;
        }
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = iM162113j - 9; i6 >= i2; i6--) {
                iM17363a = m17363a(i5, i6, iM17363a);
            }
        }
        j0l0 j0l0VarM139167c2 = j0l0.m139167c(iM17363a);
        if (j0l0VarM139167c2 == null || j0l0VarM139167c2.m139172e() != iM162113j) {
            throw FormatException.getFormatInstance();
        }
        this.f11677b = j0l0VarM139167c2;
        return j0l0VarM139167c2;
    }

    /* JADX INFO: renamed from: f */
    public void m17368f() {
        if (this.f11678c == null) {
            return;
        }
        DataMask.values()[this.f11678c.m200654c()].unmaskBitMatrix(this.f11676a, this.f11676a.m162113j());
    }

    /* JADX INFO: renamed from: g */
    public void m17369g(boolean z) {
        this.f11677b = null;
        this.f11678c = null;
        this.f11679d = z;
    }
}
