package p149l;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class tng0 extends efg0 {

    /* JADX INFO: renamed from: b */
    public final int f171233b;

    /* JADX INFO: renamed from: c */
    public final mig0 f171234c;

    /* JADX INFO: renamed from: d */
    public final mig0 f171235d;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ c8g0 f171239h;

    /* JADX INFO: renamed from: a */
    public boolean f171232a = false;

    /* JADX INFO: renamed from: e */
    public int f171236e = 0;

    /* JADX INFO: renamed from: f */
    public byte[] f171237f = new byte[0];

    /* JADX INFO: renamed from: g */
    public int f171238g = 0;

    public tng0(c8g0 c8g0Var, int i, int[] iArr, int[] iArr2) {
        this.f171239h = c8g0Var;
        this.f171233b = i;
        this.f171234c = c8g0.m105796e(iArr);
        this.f171235d = c8g0.m105796e(iArr2);
    }

    @Override // p149l.efg0
    /* JADX INFO: renamed from: a */
    public final int mo116037a() {
        return this.f171238g - this.f171236e;
    }

    @Override // p149l.efg0
    /* JADX INFO: renamed from: b */
    public final int mo116038b(byte[] bArr, int i, int i2) throws EOFException {
        int iMin;
        int iMin2;
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.f171232a) {
            return -1;
        }
        int i4 = this.f171238g - this.f171236e;
        if (i4 > 0) {
            iMin = Math.min(i2, i4);
            System.arraycopy(this.f171237f, this.f171236e, bArr, i, iMin);
            this.f171236e += iMin;
        } else {
            iMin = 0;
        }
        while (iMin < i2) {
            int iM105794b = c8g0.m105794b(this.f171239h.f79764c, this.f171234c);
            if (iM105794b >= 256) {
                if (iM105794b <= 256) {
                    this.f171232a = true;
                    break;
                }
                short s = c8g0.f79757f[iM105794b - 257];
                int iM105795d = (int) (c8g0.m105795d(this.f171239h.f79764c, s & 31) + ((long) (s >>> 5)));
                int i5 = c8g0.f79758g[c8g0.m105794b(this.f171239h.f79764c, this.f171235d)];
                int iM105795d2 = (int) (c8g0.m105795d(this.f171239h.f79764c, i5 & 15) + ((long) (i5 >>> 4)));
                if (this.f171237f.length < iM105795d) {
                    this.f171237f = new byte[iM105795d];
                }
                this.f171238g = iM105795d;
                this.f171236e = i3;
                hlg0 hlg0Var = this.f171239h.f79766e;
                byte[] bArr2 = this.f171237f;
                if (iM105795d2 > hlg0Var.f108343a.length) {
                    int i6 = i3;
                    qkq0.m175383a(vdg0.m197997a(iM105795d2, "Illegal distance parameter: "));
                    return i6;
                }
                int i7 = hlg0Var.f108344b;
                int i8 = (i7 - iM105795d2) & j6f.COLOR_SPACE_UNCALIBRATED;
                if (!hlg0Var.f108345c && i8 >= i7) {
                    qkq0.m175383a(vdg0.m197997a(iM105795d2, "Attempt to read beyond memory: dist="));
                    return i3;
                }
                int i9 = i3;
                while (i9 < iM105795d) {
                    byte[] bArr3 = hlg0Var.f108343a;
                    byte b = bArr3[i8];
                    int i10 = hlg0Var.f108344b;
                    bArr3[i10] = b;
                    int i11 = (i10 + 1) & j6f.COLOR_SPACE_UNCALIBRATED;
                    int i12 = i3;
                    if (!hlg0Var.f108345c && i11 < i10) {
                        hlg0Var.f108345c = true;
                    }
                    hlg0Var.f108344b = i11;
                    bArr2[i9] = b;
                    i9++;
                    int i13 = (i8 + 1) & j6f.COLOR_SPACE_UNCALIBRATED;
                    if (!hlg0Var.f108345c && i13 < i8) {
                        hlg0Var.f108345c = true;
                    }
                    i8 = i13;
                    i3 = i12;
                }
                int i14 = i3;
                int i15 = i + iMin;
                int i16 = i2 - iMin;
                int i17 = this.f171238g - this.f171236e;
                if (i17 > 0) {
                    iMin2 = Math.min(i16, i17);
                    System.arraycopy(this.f171237f, this.f171236e, bArr, i15, iMin2);
                    this.f171236e += iMin2;
                } else {
                    iMin2 = i14;
                }
                iMin += iMin2;
                i3 = i14;
            } else {
                int i18 = iMin + 1;
                int i19 = iMin + i;
                hlg0 hlg0Var2 = this.f171239h.f79766e;
                byte b2 = (byte) iM105794b;
                byte[] bArr4 = hlg0Var2.f108343a;
                int i20 = hlg0Var2.f108344b;
                bArr4[i20] = b2;
                int i21 = 65535 & (i20 + 1);
                if (!hlg0Var2.f108345c && i21 < i20) {
                    hlg0Var2.f108345c = true;
                }
                hlg0Var2.f108344b = i21;
                bArr[i19] = b2;
                iMin = i18;
            }
        }
        return iMin;
    }

    @Override // p149l.efg0
    /* JADX INFO: renamed from: c */
    public final int mo116039c() {
        if (this.f171232a) {
            return 1;
        }
        return this.f171233b;
    }

    @Override // p149l.efg0
    /* JADX INFO: renamed from: d */
    public final boolean mo116040d() {
        return !this.f171232a;
    }
}
