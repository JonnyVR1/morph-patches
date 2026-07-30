package com.google.android.gms.internal.ads;

import java.io.IOException;
import p149l.dqi0;
import p149l.obx0;
import p149l.rcx0;
import p149l.zax0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2198m5 extends AbstractC2214o5 {

    /* JADX INFO: renamed from: d */
    public final byte[] f9992d;

    /* JADX INFO: renamed from: e */
    public final int f9993e;

    /* JADX INFO: renamed from: f */
    public int f9994f;

    public C2198m5(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            dqi0.m113073a("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)});
            throw null;
        }
        this.f9992d = bArr;
        this.f9994f = 0;
        this.f9993e = i2;
    }

    /* JADX INFO: renamed from: C */
    public final void m12909C(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.f9992d, this.f9994f, i2);
            this.f9994f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9994f), Integer.valueOf(this.f9993e), Integer.valueOf(i2)), e);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m12910D(String str) throws IOException {
        int i = this.f9994f;
        try {
            int iM13095B = AbstractC2214o5.m13095B(str.length() * 3);
            int iM13095B2 = AbstractC2214o5.m13095B(str.length());
            if (iM13095B2 != iM13095B) {
                mo12927v(C2294y5.m13497e(str));
                byte[] bArr = this.f9992d;
                int i2 = this.f9994f;
                this.f9994f = C2294y5.m13496d(str, bArr, i2, this.f9993e - i2);
                return;
            }
            int i3 = i + iM13095B2;
            this.f9994f = i3;
            int iM13496d = C2294y5.m13496d(str, this.f9992d, i3, this.f9993e - i3);
            this.f9994f = i;
            mo12927v((iM13496d - i) - iM13095B2);
            this.f9994f = iM13496d;
        } catch (zzhdd e) {
            this.f9994f = i;
            m13102e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgyx(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5, p149l.d7x0
    /* JADX INFO: renamed from: a */
    public final void mo12911a(byte[] bArr, int i, int i2) throws IOException {
        m12909C(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: g */
    public final void mo12912g() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: h */
    public final void mo12913h(byte b) throws IOException {
        try {
            byte[] bArr = this.f9992d;
            int i = this.f9994f;
            this.f9994f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9994f), Integer.valueOf(this.f9993e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: i */
    public final void mo12914i(int i, boolean z) throws IOException {
        mo12927v(i << 3);
        mo12913h(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: j */
    public final void mo12915j(int i, zzgyl zzgylVar) throws IOException {
        mo12927v((i << 3) | 2);
        mo12927v(zzgylVar.zzd());
        zzgylVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: k */
    public final int mo12916k() {
        return this.f9993e - this.f9994f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: l */
    public final void mo12917l(int i, int i2) throws IOException {
        mo12927v((i << 3) | 5);
        mo12918m(i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: m */
    public final void mo12918m(int i) throws IOException {
        try {
            byte[] bArr = this.f9992d;
            int i2 = this.f9994f;
            int i3 = i2 + 1;
            this.f9994f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f9994f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f9994f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f9994f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9994f), Integer.valueOf(this.f9993e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: n */
    public final void mo12919n(int i, long j) throws IOException {
        mo12927v((i << 3) | 1);
        mo12920o(j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: o */
    public final void mo12920o(long j) throws IOException {
        try {
            byte[] bArr = this.f9992d;
            int i = this.f9994f;
            int i2 = i + 1;
            this.f9994f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f9994f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f9994f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f9994f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f9994f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f9994f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f9994f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f9994f = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9994f), Integer.valueOf(this.f9993e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: p */
    public final void mo12921p(int i, int i2) throws IOException {
        mo12927v(i << 3);
        mo12922q(i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: q */
    public final void mo12922q(int i) throws IOException {
        if (i >= 0) {
            mo12927v(i);
        } else {
            mo12929x(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: r */
    public final void mo12923r(int i, zax0 zax0Var, obx0 obx0Var) throws IOException {
        mo12927v((i << 3) | 2);
        mo12927v(((AbstractC2158h5) zax0Var).mo12741b(obx0Var));
        obx0Var.mo13288e(zax0Var, this.f10018a);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: s */
    public final void mo12924s(int i, String str) throws IOException {
        mo12927v((i << 3) | 2);
        m12910D(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: t */
    public final void mo12925t(int i, int i2) throws IOException {
        mo12927v((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: u */
    public final void mo12926u(int i, int i2) throws IOException {
        mo12927v(i << 3);
        mo12927v(i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: v */
    public final void mo12927v(int i) throws IOException {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.f9992d;
            if (i2 == 0) {
                int i3 = this.f9994f;
                this.f9994f = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f9994f;
                    this.f9994f = i4 + 1;
                    bArr[i4] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9994f), Integer.valueOf(this.f9993e), 1), e);
                }
            }
            throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9994f), Integer.valueOf(this.f9993e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: w */
    public final void mo12928w(int i, long j) throws IOException {
        mo12927v(i << 3);
        mo12929x(j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: x */
    public final void mo12929x(long j) throws IOException {
        if (!AbstractC2214o5.f10017c || this.f9993e - this.f9994f < 10) {
            while (true) {
                long j2 = j & (-128);
                byte[] bArr = this.f9992d;
                if (j2 == 0) {
                    int i = this.f9994f;
                    this.f9994f = i + 1;
                    bArr[i] = (byte) j;
                    return;
                } else {
                    try {
                        int i2 = this.f9994f;
                        this.f9994f = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) | 128) & 255);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9994f), Integer.valueOf(this.f9993e), 1), e);
                    }
                }
                throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9994f), Integer.valueOf(this.f9993e), 1), e);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i3 = (int) j;
            byte[] bArr2 = this.f9992d;
            if (j3 == 0) {
                int i4 = this.f9994f;
                this.f9994f = i4 + 1;
                rcx0.m178847y(bArr2, i4, (byte) i3);
                return;
            } else {
                int i5 = this.f9994f;
                this.f9994f = i5 + 1;
                rcx0.m178847y(bArr2, i5, (byte) ((i3 | 128) & 255));
                j >>>= 7;
            }
        }
    }
}
