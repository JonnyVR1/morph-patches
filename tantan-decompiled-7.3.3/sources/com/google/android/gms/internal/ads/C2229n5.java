package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import p153l.fkx0;
import p153l.ukx0;
import p153l.ygx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2229n5 extends ygx0 {

    /* JADX INFO: renamed from: h */
    public final OutputStream f10042h;

    public C2229n5(OutputStream outputStream, int i) {
        super(i);
        this.f10042h = outputStream;
    }

    /* JADX INFO: renamed from: H */
    public final void m13090H() throws IOException {
        this.f10042h.write(this.f199887d, 0, this.f199889f);
        this.f199889f = 0;
    }

    /* JADX INFO: renamed from: I */
    public final void m13091I(int i) throws IOException {
        if (this.f199888e - this.f199889f < i) {
            m13090H();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m13092J(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f199888e;
        int i4 = this.f199889f;
        int i5 = i3 - i4;
        byte[] bArr2 = this.f199887d;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i4, i2);
            this.f199889f += i2;
            this.f199890g += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i4, i5);
        int i6 = i + i5;
        this.f199889f = this.f199888e;
        this.f199890g += i5;
        m13090H();
        int i7 = i2 - i5;
        if (i7 <= this.f199888e) {
            System.arraycopy(bArr, i6, this.f199887d, 0, i7);
            this.f199889f = i7;
        } else {
            this.f10042h.write(bArr, i6, i7);
        }
        this.f199890g += i7;
    }

    /* JADX INFO: renamed from: K */
    public final void m13093K(String str) throws IOException {
        int iM13551e;
        try {
            int length = str.length() * 3;
            int iM13149B = AbstractC2237o5.m13149B(length);
            int i = iM13149B + length;
            int i2 = this.f199888e;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iM13550d = C2317y5.m13550d(str, bArr, 0, length);
                mo12981v(iM13550d);
                m13092J(bArr, 0, iM13550d);
                return;
            }
            if (i > i2 - this.f199889f) {
                m13090H();
            }
            int iM13149B2 = AbstractC2237o5.m13149B(str.length());
            int i3 = this.f199889f;
            try {
                if (iM13149B2 == iM13149B) {
                    int i4 = i3 + iM13149B2;
                    this.f199889f = i4;
                    int iM13550d2 = C2317y5.m13550d(str, this.f199887d, i4, this.f199888e - i4);
                    this.f199889f = i3;
                    iM13551e = (iM13550d2 - i3) - iM13149B2;
                    m215886F(iM13551e);
                    this.f199889f = iM13550d2;
                } else {
                    iM13551e = C2317y5.m13551e(str);
                    m215886F(iM13551e);
                    this.f199889f = C2317y5.m13550d(str, this.f199887d, this.f199889f, iM13551e);
                }
                this.f199890g += iM13551e;
            } catch (zzhdd e) {
                this.f199890g -= this.f199889f - i3;
                this.f199889f = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new zzgyx(e2);
            }
        } catch (zzhdd e3) {
            m13156e(str, e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5, p153l.jgx0
    /* JADX INFO: renamed from: a */
    public final void mo12965a(byte[] bArr, int i, int i2) throws IOException {
        m13092J(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: g */
    public final void mo12966g() throws IOException {
        if (this.f199889f > 0) {
            m13090H();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: h */
    public final void mo12967h(byte b) throws IOException {
        if (this.f199889f == this.f199888e) {
            m13090H();
        }
        m215883C(b);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: i */
    public final void mo12968i(int i, boolean z) throws IOException {
        m13091I(11);
        m215886F(i << 3);
        m215883C(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: j */
    public final void mo12969j(int i, zzgyl zzgylVar) throws IOException {
        mo12981v((i << 3) | 2);
        mo12981v(zzgylVar.zzd());
        zzgylVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: l */
    public final void mo12971l(int i, int i2) throws IOException {
        m13091I(14);
        m215886F((i << 3) | 5);
        m215884D(i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: m */
    public final void mo12972m(int i) throws IOException {
        m13091I(4);
        m215884D(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: n */
    public final void mo12973n(int i, long j) throws IOException {
        m13091I(18);
        m215886F((i << 3) | 1);
        m215885E(j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: o */
    public final void mo12974o(long j) throws IOException {
        m13091I(8);
        m215885E(j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: p */
    public final void mo12975p(int i, int i2) throws IOException {
        m13091I(20);
        m215886F(i << 3);
        if (i2 >= 0) {
            m215886F(i2);
        } else {
            m215887G(i2);
        }
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
        m13093K(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: t */
    public final void mo12979t(int i, int i2) throws IOException {
        mo12981v((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: u */
    public final void mo12980u(int i, int i2) throws IOException {
        m13091I(20);
        m215886F(i << 3);
        m215886F(i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: v */
    public final void mo12981v(int i) throws IOException {
        m13091I(5);
        m215886F(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: w */
    public final void mo12982w(int i, long j) throws IOException {
        m13091I(20);
        m215886F(i << 3);
        m215887G(j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2237o5
    /* JADX INFO: renamed from: x */
    public final void mo12983x(long j) throws IOException {
        m13091I(10);
        m215887G(j);
    }
}
