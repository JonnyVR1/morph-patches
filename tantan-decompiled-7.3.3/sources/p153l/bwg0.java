package p153l;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class bwg0 extends mng0 {

    /* JADX INFO: renamed from: b */
    public final int f78730b;

    /* JADX INFO: renamed from: c */
    public final uqg0 f78731c;

    /* JADX INFO: renamed from: d */
    public final uqg0 f78732d;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ kgg0 f78736h;

    /* JADX INFO: renamed from: a */
    public boolean f78729a = false;

    /* JADX INFO: renamed from: e */
    public int f78733e = 0;

    /* JADX INFO: renamed from: f */
    public byte[] f78734f = new byte[0];

    /* JADX INFO: renamed from: g */
    public int f78735g = 0;

    public bwg0(kgg0 kgg0Var, int i, int[] iArr, int[] iArr2) {
        this.f78736h = kgg0Var;
        this.f78730b = i;
        this.f78731c = kgg0.m149746e(iArr);
        this.f78732d = kgg0.m149746e(iArr2);
    }

    @Override // p153l.mng0
    /* JADX INFO: renamed from: a */
    public final int mo106694a() {
        return this.f78735g - this.f78733e;
    }

    @Override // p153l.mng0
    /* JADX INFO: renamed from: b */
    public final int mo106695b(byte[] bArr, int i, int i2) throws EOFException {
        int iMin;
        int iMin2;
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.f78729a) {
            return -1;
        }
        int i4 = this.f78735g - this.f78733e;
        if (i4 > 0) {
            iMin = Math.min(i2, i4);
            System.arraycopy(this.f78734f, this.f78733e, bArr, i, iMin);
            this.f78733e += iMin;
        } else {
            iMin = 0;
        }
        while (iMin < i2) {
            int iM149744b = kgg0.m149744b(this.f78736h.f126608c, this.f78731c);
            if (iM149744b >= 256) {
                if (iM149744b <= 256) {
                    this.f78729a = true;
                    break;
                }
                short s = kgg0.f126601f[iM149744b - 257];
                int iM149745d = (int) (kgg0.m149745d(this.f78736h.f126608c, s & 31) + ((long) (s >>> 5)));
                int i5 = kgg0.f126602g[kgg0.m149744b(this.f78736h.f126608c, this.f78732d)];
                int iM149745d2 = (int) (kgg0.m149745d(this.f78736h.f126608c, i5 & 15) + ((long) (i5 >>> 4)));
                if (this.f78734f.length < iM149745d) {
                    this.f78734f = new byte[iM149745d];
                }
                this.f78735g = iM149745d;
                this.f78733e = i3;
                ptg0 ptg0Var = this.f78736h.f126610e;
                byte[] bArr2 = this.f78734f;
                if (iM149745d2 > ptg0Var.f154071a.length) {
                    int i6 = i3;
                    wtq0.m207906a(dmg0.m116959a(iM149745d2, "Illegal distance parameter: "));
                    return i6;
                }
                int i7 = ptg0Var.f154072b;
                int i8 = (i7 - iM149745d2) & p7f.COLOR_SPACE_UNCALIBRATED;
                if (!ptg0Var.f154073c && i8 >= i7) {
                    wtq0.m207906a(dmg0.m116959a(iM149745d2, "Attempt to read beyond memory: dist="));
                    return i3;
                }
                int i9 = i3;
                while (i9 < iM149745d) {
                    byte[] bArr3 = ptg0Var.f154071a;
                    byte b = bArr3[i8];
                    int i10 = ptg0Var.f154072b;
                    bArr3[i10] = b;
                    int i11 = (i10 + 1) & p7f.COLOR_SPACE_UNCALIBRATED;
                    int i12 = i3;
                    if (!ptg0Var.f154073c && i11 < i10) {
                        ptg0Var.f154073c = true;
                    }
                    ptg0Var.f154072b = i11;
                    bArr2[i9] = b;
                    i9++;
                    int i13 = (i8 + 1) & p7f.COLOR_SPACE_UNCALIBRATED;
                    if (!ptg0Var.f154073c && i13 < i8) {
                        ptg0Var.f154073c = true;
                    }
                    i8 = i13;
                    i3 = i12;
                }
                int i14 = i3;
                int i15 = i + iMin;
                int i16 = i2 - iMin;
                int i17 = this.f78735g - this.f78733e;
                if (i17 > 0) {
                    iMin2 = Math.min(i16, i17);
                    System.arraycopy(this.f78734f, this.f78733e, bArr, i15, iMin2);
                    this.f78733e += iMin2;
                } else {
                    iMin2 = i14;
                }
                iMin += iMin2;
                i3 = i14;
            } else {
                int i18 = iMin + 1;
                int i19 = iMin + i;
                ptg0 ptg0Var2 = this.f78736h.f126610e;
                byte b2 = (byte) iM149744b;
                byte[] bArr4 = ptg0Var2.f154071a;
                int i20 = ptg0Var2.f154072b;
                bArr4[i20] = b2;
                int i21 = 65535 & (i20 + 1);
                if (!ptg0Var2.f154073c && i21 < i20) {
                    ptg0Var2.f154073c = true;
                }
                ptg0Var2.f154072b = i21;
                bArr[i19] = b2;
                iMin = i18;
            }
        }
        return iMin;
    }

    @Override // p153l.mng0
    /* JADX INFO: renamed from: c */
    public final int mo106696c() {
        if (this.f78729a) {
            return 1;
        }
        return this.f78730b;
    }

    @Override // p153l.mng0
    /* JADX INFO: renamed from: d */
    public final boolean mo106697d() {
        return !this.f78729a;
    }
}
