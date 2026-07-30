package p149l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class lnd implements tqf {

    /* JADX INFO: renamed from: b */
    public final w4c f128978b;

    /* JADX INFO: renamed from: c */
    public final long f128979c;

    /* JADX INFO: renamed from: d */
    public long f128980d;

    /* JADX INFO: renamed from: f */
    public int f128982f;

    /* JADX INFO: renamed from: g */
    public int f128983g;

    /* JADX INFO: renamed from: e */
    public byte[] f128981e = new byte[65536];

    /* JADX INFO: renamed from: a */
    public final byte[] f128977a = new byte[4096];

    static {
        n8f.m158492a("goog.exo.extractor");
    }

    public lnd(w4c w4cVar, long j, long j2) {
        this.f128978b = w4cVar;
        this.f128980d = j;
        this.f128979c = j2;
    }

    @Override // p149l.tqf
    /* JADX INFO: renamed from: c */
    public boolean mo150653c(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int iM150664r = m150664r(bArr, i, i2);
        while (iM150664r < i2 && iM150664r != -1) {
            iM150664r = m150665s(bArr, i, i2, iM150664r, z);
        }
        m150658j(iM150664r);
        return iM150664r != -1;
    }

    @Override // p149l.tqf
    /* JADX INFO: renamed from: d */
    public int mo150654d(byte[] bArr, int i, int i2) throws IOException {
        lnd lndVar;
        int iMin;
        m150663q(i2);
        int i3 = this.f128983g;
        int i4 = this.f128982f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            lndVar = this;
            iMin = lndVar.m150665s(this.f128981e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            lndVar.f128983g += iMin;
        } else {
            lndVar = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(lndVar.f128981e, lndVar.f128982f, bArr, i, iMin);
        lndVar.f128982f += iMin;
        return iMin;
    }

    @Override // p149l.tqf
    /* JADX INFO: renamed from: f */
    public void mo150655f(byte[] bArr, int i, int i2) throws IOException {
        mo150656g(bArr, i, i2, false);
    }

    @Override // p149l.tqf
    /* JADX INFO: renamed from: g */
    public boolean mo150656g(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!mo150662p(i2, z)) {
            return false;
        }
        System.arraycopy(this.f128981e, this.f128982f - i2, bArr, i, i2);
        return true;
    }

    @Override // p149l.tqf
    public long getLength() {
        return this.f128979c;
    }

    @Override // p149l.tqf
    public long getPosition() {
        return this.f128980d;
    }

    @Override // p149l.tqf
    /* JADX INFO: renamed from: h */
    public void mo150657h() {
        this.f128982f = 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m150658j(int i) {
        if (i != -1) {
            this.f128980d += (long) i;
        }
    }

    @Override // p149l.tqf
    /* JADX INFO: renamed from: k */
    public long mo150659k() {
        return this.f128980d + ((long) this.f128982f);
    }

    @Override // p149l.tqf
    /* JADX INFO: renamed from: m */
    public void mo150660m(int i) throws IOException {
        mo150662p(i, false);
    }

    @Override // p149l.tqf
    /* JADX INFO: renamed from: o */
    public void mo150661o(int i) throws IOException {
        m150667u(i, false);
    }

    @Override // p149l.tqf
    /* JADX INFO: renamed from: p */
    public boolean mo150662p(int i, boolean z) throws IOException {
        m150663q(i);
        int iM150665s = this.f128983g - this.f128982f;
        while (iM150665s < i) {
            lnd lndVar = this;
            int i2 = i;
            boolean z2 = z;
            iM150665s = lndVar.m150665s(this.f128981e, this.f128982f, i2, iM150665s, z2);
            if (iM150665s == -1) {
                return false;
            }
            lndVar.f128983g = lndVar.f128982f + iM150665s;
            this = lndVar;
            i = i2;
            z = z2;
        }
        this.f128982f += i;
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m150663q(int i) {
        int i2 = this.f128982f + i;
        byte[] bArr = this.f128981e;
        if (i2 > bArr.length) {
            this.f128981e = Arrays.copyOf(this.f128981e, vck0.m197884q(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* JADX INFO: renamed from: r */
    public final int m150664r(byte[] bArr, int i, int i2) {
        int i3 = this.f128983g;
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.f128981e, 0, bArr, i, iMin);
        m150668v(iMin);
        return iMin;
    }

    @Override // p149l.tqf, p149l.w4c
    public int read(byte[] bArr, int i, int i2) throws IOException {
        lnd lndVar;
        int iM150664r = m150664r(bArr, i, i2);
        if (iM150664r == 0) {
            lndVar = this;
            iM150664r = lndVar.m150665s(bArr, i, i2, 0, true);
        } else {
            lndVar = this;
        }
        lndVar.m150658j(iM150664r);
        return iM150664r;
    }

    @Override // p149l.tqf
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        mo150653c(bArr, i, i2, false);
    }

    /* JADX INFO: renamed from: s */
    public final int m150665s(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.f128978b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        hg3.m130807a();
        return 0;
    }

    @Override // p149l.tqf
    public int skip(int i) throws IOException {
        lnd lndVar;
        int iM150666t = m150666t(i);
        if (iM150666t == 0) {
            byte[] bArr = this.f128977a;
            lndVar = this;
            iM150666t = lndVar.m150665s(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            lndVar = this;
        }
        lndVar.m150658j(iM150666t);
        return iM150666t;
    }

    /* JADX INFO: renamed from: t */
    public final int m150666t(int i) {
        int iMin = Math.min(this.f128983g, i);
        m150668v(iMin);
        return iMin;
    }

    /* JADX INFO: renamed from: u */
    public boolean m150667u(int i, boolean z) throws IOException {
        int iM150666t = m150666t(i);
        while (iM150666t < i && iM150666t != -1) {
            iM150666t = m150665s(this.f128977a, -iM150666t, Math.min(i, this.f128977a.length + iM150666t), iM150666t, z);
        }
        m150658j(iM150666t);
        return iM150666t != -1;
    }

    /* JADX INFO: renamed from: v */
    public final void m150668v(int i) {
        int i2 = this.f128983g - i;
        this.f128983g = i2;
        this.f128982f = 0;
        byte[] bArr = this.f128981e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f128981e = bArr2;
    }
}
