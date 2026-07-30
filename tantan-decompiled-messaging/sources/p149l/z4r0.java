package p149l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class z4r0 implements k5r0 {

    /* JADX INFO: renamed from: b */
    public final hpy0 f201628b;

    /* JADX INFO: renamed from: c */
    public final long f201629c;

    /* JADX INFO: renamed from: d */
    public long f201630d;

    /* JADX INFO: renamed from: f */
    public int f201632f;

    /* JADX INFO: renamed from: g */
    public int f201633g;

    /* JADX INFO: renamed from: e */
    public byte[] f201631e = new byte[65536];

    /* JADX INFO: renamed from: a */
    public final byte[] f201627a = new byte[4096];

    static {
        wjs0.m203497b("media3.extractor");
    }

    public z4r0(hpy0 hpy0Var, long j, long j2) {
        this.f201628b = hpy0Var;
        this.f201630d = j;
        this.f201629c = j2;
    }

    @Override // p149l.k5r0, p149l.hpy0
    /* JADX INFO: renamed from: a */
    public final int mo12727a(byte[] bArr, int i, int i2) throws IOException {
        z4r0 z4r0Var;
        int iM217120l = m217120l(bArr, i, i2);
        if (iM217120l == 0) {
            z4r0Var = this;
            iM217120l = z4r0Var.m217121m(bArr, i, i2, 0, true);
        } else {
            z4r0Var = this;
        }
        z4r0Var.m217123o(iM217120l);
        return iM217120l;
    }

    @Override // p149l.k5r0
    /* JADX INFO: renamed from: b */
    public final boolean mo140050b(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int iM217120l = m217120l(bArr, i, i2);
        while (iM217120l < i2 && iM217120l != -1) {
            iM217120l = m217121m(bArr, i, i2, iM217120l, z);
        }
        m217123o(iM217120l);
        return iM217120l != -1;
    }

    @Override // p149l.k5r0
    /* JADX INFO: renamed from: c */
    public final boolean mo140051c(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!m217118j(i2, z)) {
            return false;
        }
        System.arraycopy(this.f201631e, this.f201632f - i2, bArr, i, i2);
        return true;
    }

    @Override // p149l.k5r0
    /* JADX INFO: renamed from: d */
    public final void mo140052d(int i) throws IOException {
        m217119k(i, false);
    }

    @Override // p149l.k5r0
    /* JADX INFO: renamed from: g */
    public final int mo140053g(byte[] bArr, int i, int i2) throws IOException {
        z4r0 z4r0Var;
        int iMin;
        m217124p(i2);
        int i3 = this.f201633g;
        int i4 = this.f201632f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            z4r0Var = this;
            iMin = z4r0Var.m217121m(this.f201631e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            z4r0Var.f201633g += iMin;
        } else {
            z4r0Var = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(z4r0Var.f201631e, z4r0Var.f201632f, bArr, i, iMin);
        z4r0Var.f201632f += iMin;
        return iMin;
    }

    @Override // p149l.k5r0
    /* JADX INFO: renamed from: h */
    public final void mo140054h(byte[] bArr, int i, int i2) throws IOException {
        mo140050b(bArr, i, i2, false);
    }

    @Override // p149l.k5r0
    /* JADX INFO: renamed from: i */
    public final void mo140055i(byte[] bArr, int i, int i2) throws IOException {
        mo140051c(bArr, i, i2, false);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m217118j(int i, boolean z) throws IOException {
        m217124p(i);
        int iM217121m = this.f201633g - this.f201632f;
        while (iM217121m < i) {
            z4r0 z4r0Var = this;
            int i2 = i;
            boolean z2 = z;
            iM217121m = z4r0Var.m217121m(this.f201631e, this.f201632f, i2, iM217121m, z2);
            if (iM217121m == -1) {
                return false;
            }
            z4r0Var.f201633g = z4r0Var.f201632f + iM217121m;
            this = z4r0Var;
            i = i2;
            z = z2;
        }
        this.f201632f += i;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m217119k(int i, boolean z) throws IOException {
        int iM217122n = m217122n(i);
        while (iM217122n < i && iM217122n != -1) {
            iM217122n = m217121m(this.f201627a, -iM217122n, Math.min(i, iM217122n + 4096), iM217122n, false);
        }
        m217123o(iM217122n);
        return iM217122n != -1;
    }

    /* JADX INFO: renamed from: l */
    public final int m217120l(byte[] bArr, int i, int i2) {
        int i3 = this.f201633g;
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.f201631e, 0, bArr, i, iMin);
        m217125q(iMin);
        return iMin;
    }

    /* JADX INFO: renamed from: m */
    public final int m217121m(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iMo12727a = this.f201628b.mo12727a(bArr, i + i3, i2 - i3);
        if (iMo12727a != -1) {
            return i3 + iMo12727a;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        hg3.m130807a();
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public final int m217122n(int i) {
        int iMin = Math.min(this.f201633g, i);
        m217125q(iMin);
        return iMin;
    }

    /* JADX INFO: renamed from: o */
    public final void m217123o(int i) {
        if (i != -1) {
            this.f201630d += (long) i;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m217124p(int i) {
        int i2 = this.f201632f + i;
        int length = this.f201631e.length;
        if (i2 > length) {
            this.f201631e = Arrays.copyOf(this.f201631e, Math.max(65536 + i2, Math.min(length + length, i2 + 524288)));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m217125q(int i) {
        int i2 = this.f201633g - i;
        this.f201633g = i2;
        this.f201632f = 0;
        byte[] bArr = this.f201631e;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f201631e = bArr2;
    }

    @Override // p149l.k5r0
    public final int zzc(int i) throws IOException {
        z4r0 z4r0Var;
        int iM217122n = m217122n(1);
        if (iM217122n == 0) {
            z4r0Var = this;
            iM217122n = z4r0Var.m217121m(this.f201627a, 0, Math.min(1, 4096), 0, true);
        } else {
            z4r0Var = this;
        }
        z4r0Var.m217123o(iM217122n);
        return iM217122n;
    }

    @Override // p149l.k5r0
    public final long zzd() {
        return this.f201629c;
    }

    @Override // p149l.k5r0
    public final long zze() {
        return this.f201630d + ((long) this.f201632f);
    }

    @Override // p149l.k5r0
    public final long zzf() {
        return this.f201630d;
    }

    @Override // p149l.k5r0
    public final void zzg(int i) throws IOException {
        m217118j(i, false);
    }

    @Override // p149l.k5r0
    public final void zzj() {
        this.f201632f = 0;
    }
}
