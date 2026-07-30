package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;
import p153l.q1y0;
import p153l.uxx0;
import p153l.wg3;
import p153l.yvx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C2446z extends AbstractC2395a0 {

    /* JADX INFO: renamed from: d */
    public final byte[] f10412d;

    /* JADX INFO: renamed from: e */
    public final int f10413e;

    /* JADX INFO: renamed from: f */
    public int f10414f;

    public C2446z(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            wg3.m206174a(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
            throw null;
        }
        this.f10412d = bArr;
        this.f10414f = 0;
        this.f10413e = i2;
    }

    /* JADX INFO: renamed from: C */
    public final void m15023C(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f10412d, this.f10414f, i2);
            this.f10414f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgp(this.f10414f, this.f10413e, i2, e);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m15024D(String str) throws IOException {
        int i = this.f10414f;
        try {
            int iM14771B = AbstractC2395a0.m14771B(str.length() * 3);
            int iM14771B2 = AbstractC2395a0.m14771B(str.length());
            if (iM14771B2 != iM14771B) {
                mo14795v(C2419l0.m14919c(str));
                byte[] bArr = this.f10412d;
                int i2 = this.f10414f;
                this.f10414f = C2419l0.m14918b(str, bArr, i2, this.f10413e - i2);
                return;
            }
            int i3 = i + iM14771B2;
            this.f10414f = i3;
            int iM14918b = C2419l0.m14918b(str, this.f10412d, i3, this.f10413e - i3);
            this.f10414f = i;
            mo14795v((iM14918b - i) - iM14771B2);
            this.f10414f = iM14918b;
        } catch (zzjs e) {
            this.f10414f = i;
            m14777c(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgp(e2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: e */
    public final int mo14778e() {
        return this.f10413e - this.f10414f;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: f */
    public final void mo14779f(byte b) throws IOException {
        int i = this.f10414f;
        try {
            int i2 = i + 1;
            try {
                this.f10412d[i] = b;
                this.f10414f = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzgp(i, this.f10413e, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: g */
    public final void mo14780g(int i, boolean z) throws IOException {
        mo14795v(i << 3);
        mo14779f(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: h */
    public final void mo14781h(int i, zzgk zzgkVar) throws IOException {
        mo14795v((i << 3) | 2);
        mo14795v(zzgkVar.zzd());
        zzgkVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: i */
    public final void mo14782i(int i, int i2) throws IOException {
        mo14795v((i << 3) | 5);
        mo14783j(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: j */
    public final void mo14783j(int i) throws IOException {
        int i2 = this.f10414f;
        try {
            byte[] bArr = this.f10412d;
            bArr[i2] = (byte) (i & 255);
            bArr[i2 + 1] = (byte) ((i >> 8) & 255);
            bArr[i2 + 2] = (byte) ((i >> 16) & 255);
            bArr[i2 + 3] = (byte) ((i >> 24) & 255);
            this.f10414f = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgp(i2, this.f10413e, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: k */
    public final void mo14784k(int i, long j) throws IOException {
        mo14795v((i << 3) | 1);
        mo14785l(j);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: l */
    public final void mo14785l(long j) throws IOException {
        int i = this.f10414f;
        try {
            byte[] bArr = this.f10412d;
            bArr[i] = (byte) (((int) j) & 255);
            bArr[i + 1] = (byte) (((int) (j >> 8)) & 255);
            bArr[i + 2] = (byte) (((int) (j >> 16)) & 255);
            bArr[i + 3] = (byte) (((int) (j >> 24)) & 255);
            bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
            bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
            bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
            bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
            this.f10414f = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgp(i, this.f10413e, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: m */
    public final void mo14786m(int i, int i2) throws IOException {
        mo14795v(i << 3);
        mo14787n(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: n */
    public final void mo14787n(int i) throws IOException {
        if (i >= 0) {
            mo14795v(i);
        } else {
            mo14797x(i);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: o */
    public final void mo14788o(byte[] bArr, int i, int i2) throws IOException {
        m15023C(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: p */
    public final void mo14789p(int i, yvx0 yvx0Var, uxx0 uxx0Var) throws IOException {
        mo14795v((i << 3) | 2);
        mo14795v(((AbstractC2444y) yvx0Var).mo14821b(uxx0Var));
        uxx0Var.mo14872e(yvx0Var, this.f10343a);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: q */
    public final void mo14790q(int i, yvx0 yvx0Var) throws IOException {
        mo14795v(11);
        mo14794u(2, i);
        mo14795v(26);
        mo14795v(yvx0Var.zzk());
        yvx0Var.mo14820a(this);
        mo14795v(12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: r */
    public final void mo14791r(int i, zzgk zzgkVar) throws IOException {
        mo14795v(11);
        mo14794u(2, i);
        mo14781h(3, zzgkVar);
        mo14795v(12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: s */
    public final void mo14792s(int i, String str) throws IOException {
        mo14795v((i << 3) | 2);
        m15024D(str);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: t */
    public final void mo14793t(int i, int i2) throws IOException {
        mo14795v((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: u */
    public final void mo14794u(int i, int i2) throws IOException {
        mo14795v(i << 3);
        mo14795v(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: v */
    public final void mo14795v(int i) throws IOException {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.f10412d;
            if (i2 == 0) {
                int i3 = this.f10414f;
                this.f10414f = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f10414f;
                    this.f10414f = i4 + 1;
                    bArr[i4] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzgp(this.f10414f, this.f10413e, 1, e);
                }
            }
            throw new zzgp(this.f10414f, this.f10413e, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: w */
    public final void mo14796w(int i, long j) throws IOException {
        mo14795v(i << 3);
        mo14797x(j);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2395a0
    /* JADX INFO: renamed from: x */
    public final void mo14797x(long j) throws IOException {
        if (!AbstractC2395a0.f10342c || this.f10413e - this.f10414f < 10) {
            while (true) {
                long j2 = j & (-128);
                byte[] bArr = this.f10412d;
                if (j2 == 0) {
                    int i = this.f10414f;
                    this.f10414f = i + 1;
                    bArr[i] = (byte) j;
                    return;
                } else {
                    try {
                        int i2 = this.f10414f;
                        this.f10414f = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) | 128) & 255);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzgp(this.f10414f, this.f10413e, 1, e);
                    }
                }
                throw new zzgp(this.f10414f, this.f10413e, 1, e);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i3 = (int) j;
            byte[] bArr2 = this.f10412d;
            if (j3 == 0) {
                int i4 = this.f10414f;
                this.f10414f = i4 + 1;
                q1y0.m174953s(bArr2, i4, (byte) i3);
                return;
            } else {
                int i5 = this.f10414f;
                this.f10414f = i5 + 1;
                q1y0.m174953s(bArr2, i5, (byte) ((i3 | 128) & 255));
                j >>>= 7;
            }
        }
    }
}
