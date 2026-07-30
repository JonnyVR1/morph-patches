package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import p149l.obx0;
import p149l.s7x0;
import p149l.zax0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2206n5 extends s7x0 {

    /* JADX INFO: renamed from: h */
    public final OutputStream f10005h;

    public C2206n5(OutputStream outputStream, int i) {
        super(i);
        this.f10005h = outputStream;
    }

    /* JADX INFO: renamed from: H */
    public final void m13036H() throws IOException {
        this.f10005h.write(this.f162955d, 0, this.f162957f);
        this.f162957f = 0;
    }

    /* JADX INFO: renamed from: I */
    public final void m13037I(int i) throws IOException {
        if (this.f162956e - this.f162957f < i) {
            m13036H();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m13038J(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f162956e;
        int i4 = this.f162957f;
        int i5 = i3 - i4;
        byte[] bArr2 = this.f162955d;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i4, i2);
            this.f162957f += i2;
            this.f162958g += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i4, i5);
        int i6 = i + i5;
        this.f162957f = this.f162956e;
        this.f162958g += i5;
        m13036H();
        int i7 = i2 - i5;
        if (i7 <= this.f162956e) {
            System.arraycopy(bArr, i6, this.f162955d, 0, i7);
            this.f162957f = i7;
        } else {
            this.f10005h.write(bArr, i6, i7);
        }
        this.f162958g += i7;
    }

    /* JADX INFO: renamed from: K */
    public final void m13039K(String str) throws IOException {
        int iM13497e;
        try {
            int length = str.length() * 3;
            int iM13095B = AbstractC2214o5.m13095B(length);
            int i = iM13095B + length;
            int i2 = this.f162956e;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iM13496d = C2294y5.m13496d(str, bArr, 0, length);
                mo12927v(iM13496d);
                m13038J(bArr, 0, iM13496d);
                return;
            }
            if (i > i2 - this.f162957f) {
                m13036H();
            }
            int iM13095B2 = AbstractC2214o5.m13095B(str.length());
            int i3 = this.f162957f;
            try {
                if (iM13095B2 == iM13095B) {
                    int i4 = i3 + iM13095B2;
                    this.f162957f = i4;
                    int iM13496d2 = C2294y5.m13496d(str, this.f162955d, i4, this.f162956e - i4);
                    this.f162957f = i3;
                    iM13497e = (iM13496d2 - i3) - iM13095B2;
                    m182532F(iM13497e);
                    this.f162957f = iM13496d2;
                } else {
                    iM13497e = C2294y5.m13497e(str);
                    m182532F(iM13497e);
                    this.f162957f = C2294y5.m13496d(str, this.f162955d, this.f162957f, iM13497e);
                }
                this.f162958g += iM13497e;
            } catch (zzhdd e) {
                this.f162958g -= this.f162957f - i3;
                this.f162957f = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new zzgyx(e2);
            }
        } catch (zzhdd e3) {
            m13102e(str, e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5, p149l.d7x0
    /* JADX INFO: renamed from: a */
    public final void mo12911a(byte[] bArr, int i, int i2) throws IOException {
        m13038J(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: g */
    public final void mo12912g() throws IOException {
        if (this.f162957f > 0) {
            m13036H();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: h */
    public final void mo12913h(byte b) throws IOException {
        if (this.f162957f == this.f162956e) {
            m13036H();
        }
        m182529C(b);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: i */
    public final void mo12914i(int i, boolean z) throws IOException {
        m13037I(11);
        m182532F(i << 3);
        m182529C(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: j */
    public final void mo12915j(int i, zzgyl zzgylVar) throws IOException {
        mo12927v((i << 3) | 2);
        mo12927v(zzgylVar.zzd());
        zzgylVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: l */
    public final void mo12917l(int i, int i2) throws IOException {
        m13037I(14);
        m182532F((i << 3) | 5);
        m182530D(i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: m */
    public final void mo12918m(int i) throws IOException {
        m13037I(4);
        m182530D(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: n */
    public final void mo12919n(int i, long j) throws IOException {
        m13037I(18);
        m182532F((i << 3) | 1);
        m182531E(j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: o */
    public final void mo12920o(long j) throws IOException {
        m13037I(8);
        m182531E(j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: p */
    public final void mo12921p(int i, int i2) throws IOException {
        m13037I(20);
        m182532F(i << 3);
        if (i2 >= 0) {
            m182532F(i2);
        } else {
            m182533G(i2);
        }
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
        m13039K(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: t */
    public final void mo12925t(int i, int i2) throws IOException {
        mo12927v((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: u */
    public final void mo12926u(int i, int i2) throws IOException {
        m13037I(20);
        m182532F(i << 3);
        m182532F(i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: v */
    public final void mo12927v(int i) throws IOException {
        m13037I(5);
        m182532F(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: w */
    public final void mo12928w(int i, long j) throws IOException {
        m13037I(20);
        m182532F(i << 3);
        m182533G(j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2214o5
    /* JADX INFO: renamed from: x */
    public final void mo12929x(long j) throws IOException {
        m13037I(10);
        m182533G(j);
    }
}
