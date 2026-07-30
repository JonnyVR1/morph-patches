package com.google.android.gms.internal.ads;

import java.io.IOException;
import p153l.fkx0;
import p153l.gzi0;
import p153l.ukx0;
import p153l.xlx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2221m5 extends AbstractC2237o5 {

    /* JADX INFO: renamed from: d */
    public final byte[] f10029d;

    /* JADX INFO: renamed from: e */
    public final int f10030e;

    /* JADX INFO: renamed from: f */
    public int f10031f;

    public C2221m5(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            gzi0.m133102a("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)});
            throw null;
        }
        this.f10029d = bArr;
        this.f10031f = 0;
        this.f10030e = i2;
    }

    /* JADX INFO: renamed from: C */
    public final void m12963C(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.f10029d, this.f10031f, i2);
            this.f10031f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10031f), Integer.valueOf(this.f10030e), Integer.valueOf(i2)), e);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m12964D(String str) throws IOException {
        int i = this.f10031f;
        try {
            int iM13149B = AbstractC2237o5.m13149B(str.length() * 3);
            int iM13149B2 = AbstractC2237o5.m13149B(str.length());
            if (iM13149B2 != iM13149B) {
                mo12981v(C2317y5.m13551e(str));
                byte[] bArr = this.f10029d;
                int i2 = this.f10031f;
                this.f10031f = C2317y5.m13550d(str, bArr, i2, this.f10030e - i2);
                return;
            }
            int i3 = i + iM13149B2;
            this.f10031f = i3;
            int iM13550d = C2317y5.m13550d(str, this.f10029d, i3, this.f10030e - i3);
            this.f10031f = i;
            mo12981v((iM13550d - i) - iM13149B2);
            this.f10031f = iM13550d;
        } catch (zzhdd e) {
            this.f10031f = i;
            m13156e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgyx(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5, p153l.jgx0
    /* JADX INFO: renamed from: a */
    public final void mo12965a(byte[] bArr, int i, int i2) throws IOException {
        m12963C(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: g */
    public final void mo12966g() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: h */
    public final void mo12967h(byte b) throws IOException {
        try {
            byte[] bArr = this.f10029d;
            int i = this.f10031f;
            this.f10031f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10031f), Integer.valueOf(this.f10030e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: i */
    public final void mo12968i(int i, boolean z) throws IOException {
        mo12981v(i << 3);
        mo12967h(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: j */
    public final void mo12969j(int i, zzgyl zzgylVar) throws IOException {
        mo12981v((i << 3) | 2);
        mo12981v(zzgylVar.zzd());
        zzgylVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: k */
    public final int mo12970k() {
        return this.f10030e - this.f10031f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: l */
    public final void mo12971l(int i, int i2) throws IOException {
        mo12981v((i << 3) | 5);
        mo12972m(i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: m */
    public final void mo12972m(int i) throws IOException {
        try {
            byte[] bArr = this.f10029d;
            int i2 = this.f10031f;
            int i3 = i2 + 1;
            this.f10031f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f10031f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f10031f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f10031f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10031f), Integer.valueOf(this.f10030e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: n */
    public final void mo12973n(int i, long j) throws IOException {
        mo12981v((i << 3) | 1);
        mo12974o(j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: o */
    public final void mo12974o(long j) throws IOException {
        try {
            byte[] bArr = this.f10029d;
            int i = this.f10031f;
            int i2 = i + 1;
            this.f10031f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f10031f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f10031f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f10031f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f10031f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f10031f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f10031f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f10031f = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10031f), Integer.valueOf(this.f10030e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: p */
    public final void mo12975p(int i, int i2) throws IOException {
        mo12981v(i << 3);
        mo12976q(i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: q */
    public final void mo12976q(int i) throws IOException {
        if (i >= 0) {
            mo12981v(i);
        } else {
            mo12983x(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: r */
    public final void mo12977r(int i, fkx0 fkx0Var, ukx0 ukx0Var) throws IOException {
        mo12981v((i << 3) | 2);
        mo12981v(((AbstractC2181h5) fkx0Var).mo12795b(ukx0Var));
        ukx0Var.mo13342e(fkx0Var, this.f10055a);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: s */
    public final void mo12978s(int i, String str) throws IOException {
        mo12981v((i << 3) | 2);
        m12964D(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: t */
    public final void mo12979t(int i, int i2) throws IOException {
        mo12981v((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: u */
    public final void mo12980u(int i, int i2) throws IOException {
        mo12981v(i << 3);
        mo12981v(i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: v */
    public final void mo12981v(int i) throws IOException {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.f10029d;
            if (i2 == 0) {
                int i3 = this.f10031f;
                this.f10031f = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f10031f;
                    this.f10031f = i4 + 1;
                    bArr[i4] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10031f), Integer.valueOf(this.f10030e), 1), e);
                }
            }
            throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10031f), Integer.valueOf(this.f10030e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: w */
    public final void mo12982w(int i, long j) throws IOException {
        mo12981v(i << 3);
        mo12983x(j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: x */
    public final void mo12983x(long j) throws IOException {
        if (!AbstractC2237o5.f10054c || this.f10030e - this.f10031f < 10) {
            while (true) {
                long j2 = j & (-128);
                byte[] bArr = this.f10029d;
                if (j2 == 0) {
                    int i = this.f10031f;
                    this.f10031f = i + 1;
                    bArr[i] = (byte) j;
                    return;
                } else {
                    try {
                        int i2 = this.f10031f;
                        this.f10031f = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) | 128) & 255);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10031f), Integer.valueOf(this.f10030e), 1), e);
                    }
                }
                throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10031f), Integer.valueOf(this.f10030e), 1), e);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i3 = (int) j;
            byte[] bArr2 = this.f10029d;
            if (j3 == 0) {
                int i4 = this.f10031f;
                this.f10031f = i4 + 1;
                xlx0.m211712y(bArr2, i4, (byte) i3);
                return;
            } else {
                int i5 = this.f10031f;
                this.f10031f = i5 + 1;
                xlx0.m211712y(bArr2, i5, (byte) ((i3 | 128) & 255));
                j >>>= 7;
            }
        }
    }
}
