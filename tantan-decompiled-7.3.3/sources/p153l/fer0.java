package p153l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class fer0 implements qer0 {

    /* JADX INFO: renamed from: b */
    public final nyy0 f98704b;

    /* JADX INFO: renamed from: c */
    public final long f98705c;

    /* JADX INFO: renamed from: d */
    public long f98706d;

    /* JADX INFO: renamed from: f */
    public int f98708f;

    /* JADX INFO: renamed from: g */
    public int f98709g;

    /* JADX INFO: renamed from: e */
    public byte[] f98707e = new byte[65536];

    /* JADX INFO: renamed from: a */
    public final byte[] f98703a = new byte[4096];

    static {
        cts0.m112551b("media3.extractor");
    }

    public fer0(nyy0 nyy0Var, long j, long j2) {
        this.f98704b = nyy0Var;
        this.f98706d = j;
        this.f98705c = j2;
    }

    @Override // p153l.qer0, p153l.nyy0
    /* JADX INFO: renamed from: a */
    public final int mo12781a(byte[] bArr, int i, int i2) throws IOException {
        fer0 fer0Var;
        int iM125320l = m125320l(bArr, i, i2);
        if (iM125320l == 0) {
            fer0Var = this;
            iM125320l = fer0Var.m125321m(bArr, i, i2, 0, true);
        } else {
            fer0Var = this;
        }
        fer0Var.m125323o(iM125320l);
        return iM125320l;
    }

    @Override // p153l.qer0
    /* JADX INFO: renamed from: b */
    public final boolean mo125312b(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int iM125320l = m125320l(bArr, i, i2);
        while (iM125320l < i2 && iM125320l != -1) {
            iM125320l = m125321m(bArr, i, i2, iM125320l, z);
        }
        m125323o(iM125320l);
        return iM125320l != -1;
    }

    @Override // p153l.qer0
    /* JADX INFO: renamed from: c */
    public final boolean mo125313c(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!m125318j(i2, z)) {
            return false;
        }
        System.arraycopy(this.f98707e, this.f98708f - i2, bArr, i, i2);
        return true;
    }

    @Override // p153l.qer0
    /* JADX INFO: renamed from: d */
    public final void mo125314d(int i) throws IOException {
        m125319k(i, false);
    }

    @Override // p153l.qer0
    /* JADX INFO: renamed from: g */
    public final int mo125315g(byte[] bArr, int i, int i2) throws IOException {
        fer0 fer0Var;
        int iMin;
        m125324p(i2);
        int i3 = this.f98709g;
        int i4 = this.f98708f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            fer0Var = this;
            iMin = fer0Var.m125321m(this.f98707e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            fer0Var.f98709g += iMin;
        } else {
            fer0Var = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(fer0Var.f98707e, fer0Var.f98708f, bArr, i, iMin);
        fer0Var.f98708f += iMin;
        return iMin;
    }

    @Override // p153l.qer0
    /* JADX INFO: renamed from: h */
    public final void mo125316h(byte[] bArr, int i, int i2) throws IOException {
        mo125312b(bArr, i, i2, false);
    }

    @Override // p153l.qer0
    /* JADX INFO: renamed from: i */
    public final void mo125317i(byte[] bArr, int i, int i2) throws IOException {
        mo125313c(bArr, i, i2, false);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m125318j(int i, boolean z) throws IOException {
        m125324p(i);
        int iM125321m = this.f98709g - this.f98708f;
        while (iM125321m < i) {
            fer0 fer0Var = this;
            int i2 = i;
            boolean z2 = z;
            iM125321m = fer0Var.m125321m(this.f98707e, this.f98708f, i2, iM125321m, z2);
            if (iM125321m == -1) {
                return false;
            }
            fer0Var.f98709g = fer0Var.f98708f + iM125321m;
            this = fer0Var;
            i = i2;
            z = z2;
        }
        this.f98708f += i;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m125319k(int i, boolean z) throws IOException {
        int iM125322n = m125322n(i);
        while (iM125322n < i && iM125322n != -1) {
            iM125322n = m125321m(this.f98703a, -iM125322n, Math.min(i, iM125322n + 4096), iM125322n, false);
        }
        m125323o(iM125322n);
        return iM125322n != -1;
    }

    /* JADX INFO: renamed from: l */
    public final int m125320l(byte[] bArr, int i, int i2) {
        int i3 = this.f98709g;
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.f98707e, 0, bArr, i, iMin);
        m125325q(iMin);
        return iMin;
    }

    /* JADX INFO: renamed from: m */
    public final int m125321m(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iMo12781a = this.f98704b.mo12781a(bArr, i + i3, i2 - i3);
        if (iMo12781a != -1) {
            return i3 + iMo12781a;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        vg3.m201207a();
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public final int m125322n(int i) {
        int iMin = Math.min(this.f98709g, i);
        m125325q(iMin);
        return iMin;
    }

    /* JADX INFO: renamed from: o */
    public final void m125323o(int i) {
        if (i != -1) {
            this.f98706d += (long) i;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m125324p(int i) {
        int i2 = this.f98708f + i;
        int length = this.f98707e.length;
        if (i2 > length) {
            this.f98707e = Arrays.copyOf(this.f98707e, Math.max(65536 + i2, Math.min(length + length, i2 + 524288)));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m125325q(int i) {
        int i2 = this.f98709g - i;
        this.f98709g = i2;
        this.f98708f = 0;
        byte[] bArr = this.f98707e;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f98707e = bArr2;
    }

    @Override // p153l.qer0
    public final int zzc(int i) throws IOException {
        fer0 fer0Var;
        int iM125322n = m125322n(1);
        if (iM125322n == 0) {
            fer0Var = this;
            iM125322n = fer0Var.m125321m(this.f98703a, 0, Math.min(1, 4096), 0, true);
        } else {
            fer0Var = this;
        }
        fer0Var.m125323o(iM125322n);
        return iM125322n;
    }

    @Override // p153l.qer0
    public final long zzd() {
        return this.f98705c;
    }

    @Override // p153l.qer0
    public final long zze() {
        return this.f98706d + ((long) this.f98708f);
    }

    @Override // p153l.qer0
    public final long zzf() {
        return this.f98706d;
    }

    @Override // p153l.qer0
    public final void zzg(int i) throws IOException {
        m125318j(i, false);
    }

    @Override // p153l.qer0
    public final void zzj() {
        this.f98708f = 0;
    }
}
