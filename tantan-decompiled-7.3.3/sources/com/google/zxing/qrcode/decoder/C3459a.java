package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import p153l.d13;
import p153l.o9l0;
import p153l.q1j;

/* JADX INFO: renamed from: com.google.zxing.qrcode.decoder.a */
/* JADX INFO: loaded from: classes7.dex */
public final class C3459a {

    /* JADX INFO: renamed from: a */
    public final d13 f11713a;

    /* JADX INFO: renamed from: b */
    public o9l0 f11714b;

    /* JADX INFO: renamed from: c */
    public q1j f11715c;

    /* JADX INFO: renamed from: d */
    public boolean f11716d;

    public C3459a(d13 d13Var) throws FormatException {
        int iM113483j = d13Var.m113483j();
        if (iM113483j < 21 || (iM113483j & 3) != 1) {
            throw FormatException.getFormatInstance();
        }
        this.f11713a = d13Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m17418a(int i, int i2, int i3) {
        boolean z = this.f11716d;
        d13 d13Var = this.f11713a;
        return z ? d13Var.m113480d(i2, i) : d13Var.m113480d(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* JADX INFO: renamed from: b */
    public void m17419b() {
        int i = 0;
        while (i < this.f11713a.m113486m()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f11713a.m113483j(); i3++) {
                if (this.f11713a.m113480d(i, i3) != this.f11713a.m113480d(i3, i)) {
                    this.f11713a.m113479c(i3, i);
                    this.f11713a.m113479c(i, i3);
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: c */
    public byte[] m17420c() throws FormatException {
        q1j q1jVarM17421d = m17421d();
        o9l0 o9l0VarM17422e = m17422e();
        DataMask dataMask = DataMask.values()[q1jVarM17421d.m174890c()];
        int iM113483j = this.f11713a.m113483j();
        dataMask.unmaskBitMatrix(this.f11713a, iM113483j);
        d13 d13VarM166746a = o9l0VarM17422e.m166746a();
        byte[] bArr = new byte[o9l0VarM17422e.m166750h()];
        int i = iM113483j - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < iM113483j; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!d13VarM166746a.m113480d(i9, i7)) {
                        i4++;
                        i5 <<= 1;
                        if (this.f11713a.m113480d(i9, i7)) {
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
        if (i3 == o9l0VarM17422e.m166750h()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX INFO: renamed from: d */
    public q1j m17421d() throws FormatException {
        q1j q1jVar = this.f11715c;
        if (q1jVar != null) {
            return q1jVar;
        }
        int iM17418a = 0;
        int iM17418a2 = 0;
        for (int i = 0; i < 6; i++) {
            iM17418a2 = m17418a(i, 8, iM17418a2);
        }
        int iM17418a3 = m17418a(8, 7, m17418a(8, 8, m17418a(7, 8, iM17418a2)));
        for (int i2 = 5; i2 >= 0; i2--) {
            iM17418a3 = m17418a(8, i2, iM17418a3);
        }
        int iM113483j = this.f11713a.m113483j();
        int i3 = iM113483j - 7;
        for (int i4 = iM113483j - 1; i4 >= i3; i4--) {
            iM17418a = m17418a(8, i4, iM17418a);
        }
        for (int i5 = iM113483j - 8; i5 < iM113483j; i5++) {
            iM17418a = m17418a(i5, 8, iM17418a);
        }
        q1j q1jVarM174887a = q1j.m174887a(iM17418a3, iM17418a);
        this.f11715c = q1jVarM174887a;
        if (q1jVarM174887a != null) {
            return q1jVarM174887a;
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX INFO: renamed from: e */
    public o9l0 m17422e() throws FormatException {
        o9l0 o9l0Var = this.f11714b;
        if (o9l0Var != null) {
            return o9l0Var;
        }
        int iM113483j = this.f11713a.m113483j();
        int i = (iM113483j - 17) / 4;
        if (i <= 6) {
            return o9l0.m166745i(i);
        }
        int i2 = iM113483j - 11;
        int iM17418a = 0;
        int iM17418a2 = 0;
        for (int i3 = 5; i3 >= 0; i3--) {
            for (int i4 = iM113483j - 9; i4 >= i2; i4--) {
                iM17418a2 = m17418a(i4, i3, iM17418a2);
            }
        }
        o9l0 o9l0VarM166743c = o9l0.m166743c(iM17418a2);
        if (o9l0VarM166743c != null && o9l0VarM166743c.m166748e() == iM113483j) {
            this.f11714b = o9l0VarM166743c;
            return o9l0VarM166743c;
        }
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = iM113483j - 9; i6 >= i2; i6--) {
                iM17418a = m17418a(i5, i6, iM17418a);
            }
        }
        o9l0 o9l0VarM166743c2 = o9l0.m166743c(iM17418a);
        if (o9l0VarM166743c2 == null || o9l0VarM166743c2.m166748e() != iM113483j) {
            throw FormatException.getFormatInstance();
        }
        this.f11714b = o9l0VarM166743c2;
        return o9l0VarM166743c2;
    }

    /* JADX INFO: renamed from: f */
    public void m17423f() {
        if (this.f11715c == null) {
            return;
        }
        DataMask.values()[this.f11715c.m174890c()].unmaskBitMatrix(this.f11713a, this.f11713a.m113483j());
    }

    /* JADX INFO: renamed from: g */
    public void m17424g(boolean z) {
        this.f11714b = null;
        this.f11715c = null;
        this.f11716d = z;
    }
}
