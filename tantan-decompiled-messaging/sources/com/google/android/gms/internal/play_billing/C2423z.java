package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;
import p149l.ig3;
import p149l.ksx0;
import p149l.oox0;
import p149l.smx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C2423z extends AbstractC2372a0 {

    /* JADX INFO: renamed from: d */
    public final byte[] f10375d;

    /* JADX INFO: renamed from: e */
    public final int f10376e;

    /* JADX INFO: renamed from: f */
    public int f10377f;

    public C2423z(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            ig3.m135964a(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
            throw null;
        }
        this.f10375d = bArr;
        this.f10377f = 0;
        this.f10376e = i2;
    }

    /* JADX INFO: renamed from: C */
    public final void m14969C(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f10375d, this.f10377f, i2);
            this.f10377f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgp(this.f10377f, this.f10376e, i2, e);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m14970D(String str) throws IOException {
        int i = this.f10377f;
        try {
            int iM14717B = AbstractC2372a0.m14717B(str.length() * 3);
            int iM14717B2 = AbstractC2372a0.m14717B(str.length());
            if (iM14717B2 != iM14717B) {
                mo14741v(C2396l0.m14865c(str));
                byte[] bArr = this.f10375d;
                int i2 = this.f10377f;
                this.f10377f = C2396l0.m14864b(str, bArr, i2, this.f10376e - i2);
                return;
            }
            int i3 = i + iM14717B2;
            this.f10377f = i3;
            int iM14864b = C2396l0.m14864b(str, this.f10375d, i3, this.f10376e - i3);
            this.f10377f = i;
            mo14741v((iM14864b - i) - iM14717B2);
            this.f10377f = iM14864b;
        } catch (zzjs e) {
            this.f10377f = i;
            m14723c(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgp(e2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: e */
    public final int mo14724e() {
        return this.f10376e - this.f10377f;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: f */
    public final void mo14725f(byte b) throws IOException {
        int i = this.f10377f;
        try {
            int i2 = i + 1;
            try {
                this.f10375d[i] = b;
                this.f10377f = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzgp(i, this.f10376e, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: g */
    public final void mo14726g(int i, boolean z) throws IOException {
        mo14741v(i << 3);
        mo14725f(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: h */
    public final void mo14727h(int i, zzgk zzgkVar) throws IOException {
        mo14741v((i << 3) | 2);
        mo14741v(zzgkVar.zzd());
        zzgkVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: i */
    public final void mo14728i(int i, int i2) throws IOException {
        mo14741v((i << 3) | 5);
        mo14729j(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: j */
    public final void mo14729j(int i) throws IOException {
        int i2 = this.f10377f;
        try {
            byte[] bArr = this.f10375d;
            bArr[i2] = (byte) (i & 255);
            bArr[i2 + 1] = (byte) ((i >> 8) & 255);
            bArr[i2 + 2] = (byte) ((i >> 16) & 255);
            bArr[i2 + 3] = (byte) ((i >> 24) & 255);
            this.f10377f = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgp(i2, this.f10376e, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: k */
    public final void mo14730k(int i, long j) throws IOException {
        mo14741v((i << 3) | 1);
        mo14731l(j);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: l */
    public final void mo14731l(long j) throws IOException {
        int i = this.f10377f;
        try {
            byte[] bArr = this.f10375d;
            bArr[i] = (byte) (((int) j) & 255);
            bArr[i + 1] = (byte) (((int) (j >> 8)) & 255);
            bArr[i + 2] = (byte) (((int) (j >> 16)) & 255);
            bArr[i + 3] = (byte) (((int) (j >> 24)) & 255);
            bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
            bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
            bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
            bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
            this.f10377f = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgp(i, this.f10376e, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: m */
    public final void mo14732m(int i, int i2) throws IOException {
        mo14741v(i << 3);
        mo14733n(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: n */
    public final void mo14733n(int i) throws IOException {
        if (i >= 0) {
            mo14741v(i);
        } else {
            mo14743x(i);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: o */
    public final void mo14734o(byte[] bArr, int i, int i2) throws IOException {
        m14969C(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: p */
    public final void mo14735p(int i, smx0 smx0Var, oox0 oox0Var) throws IOException {
        mo14741v((i << 3) | 2);
        mo14741v(((AbstractC2421y) smx0Var).mo14767b(oox0Var));
        oox0Var.mo14818e(smx0Var, this.f10306a);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: q */
    public final void mo14736q(int i, smx0 smx0Var) throws IOException {
        mo14741v(11);
        mo14740u(2, i);
        mo14741v(26);
        mo14741v(smx0Var.zzk());
        smx0Var.mo14766a(this);
        mo14741v(12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: r */
    public final void mo14737r(int i, zzgk zzgkVar) throws IOException {
        mo14741v(11);
        mo14740u(2, i);
        mo14727h(3, zzgkVar);
        mo14741v(12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: s */
    public final void mo14738s(int i, String str) throws IOException {
        mo14741v((i << 3) | 2);
        m14970D(str);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: t */
    public final void mo14739t(int i, int i2) throws IOException {
        mo14741v((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: u */
    public final void mo14740u(int i, int i2) throws IOException {
        mo14741v(i << 3);
        mo14741v(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: v */
    public final void mo14741v(int i) throws IOException {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.f10375d;
            if (i2 == 0) {
                int i3 = this.f10377f;
                this.f10377f = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f10377f;
                    this.f10377f = i4 + 1;
                    bArr[i4] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzgp(this.f10377f, this.f10376e, 1, e);
                }
            }
            throw new zzgp(this.f10377f, this.f10376e, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: w */
    public final void mo14742w(int i, long j) throws IOException {
        mo14741v(i << 3);
        mo14743x(j);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2372a0
    /* JADX INFO: renamed from: x */
    public final void mo14743x(long j) throws IOException {
        if (!AbstractC2372a0.f10305c || this.f10376e - this.f10377f < 10) {
            while (true) {
                long j2 = j & (-128);
                byte[] bArr = this.f10375d;
                if (j2 == 0) {
                    int i = this.f10377f;
                    this.f10377f = i + 1;
                    bArr[i] = (byte) j;
                    return;
                } else {
                    try {
                        int i2 = this.f10377f;
                        this.f10377f = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) | 128) & 255);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzgp(this.f10377f, this.f10376e, 1, e);
                    }
                }
                throw new zzgp(this.f10377f, this.f10376e, 1, e);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i3 = (int) j;
            byte[] bArr2 = this.f10375d;
            if (j3 == 0) {
                int i4 = this.f10377f;
                this.f10377f = i4 + 1;
                ksx0.m147127s(bArr2, i4, (byte) i3);
                return;
            } else {
                int i5 = this.f10377f;
                this.f10377f = i5 + 1;
                ksx0.m147127s(bArr2, i5, (byte) ((i3 | 128) & 255));
                j >>>= 7;
            }
        }
    }
}
