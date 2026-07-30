package p153l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class qod implements asf {

    /* JADX INFO: renamed from: b */
    public final e6c f158720b;

    /* JADX INFO: renamed from: c */
    public final long f158721c;

    /* JADX INFO: renamed from: d */
    public long f158722d;

    /* JADX INFO: renamed from: f */
    public int f158724f;

    /* JADX INFO: renamed from: g */
    public int f158725g;

    /* JADX INFO: renamed from: e */
    public byte[] f158723e = new byte[65536];

    /* JADX INFO: renamed from: a */
    public final byte[] f158719a = new byte[4096];

    static {
        t9f.m189752a("goog.exo.extractor");
    }

    public qod(e6c e6cVar, long j, long j2) {
        this.f158720b = e6cVar;
        this.f158722d = j;
        this.f158721c = j2;
    }

    @Override // p153l.asf
    /* JADX INFO: renamed from: b */
    public boolean mo99898b(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int iM177295r = m177295r(bArr, i, i2);
        while (iM177295r < i2 && iM177295r != -1) {
            iM177295r = m177296s(bArr, i, i2, iM177295r, z);
        }
        m177293j(iM177295r);
        return iM177295r != -1;
    }

    @Override // p153l.asf
    /* JADX INFO: renamed from: c */
    public int mo99899c(byte[] bArr, int i, int i2) throws IOException {
        qod qodVar;
        int iMin;
        m177294q(i2);
        int i3 = this.f158725g;
        int i4 = this.f158724f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            qodVar = this;
            iMin = qodVar.m177296s(this.f158723e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            qodVar.f158725g += iMin;
        } else {
            qodVar = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(qodVar.f158723e, qodVar.f158724f, bArr, i, iMin);
        qodVar.f158724f += iMin;
        return iMin;
    }

    @Override // p153l.asf
    /* JADX INFO: renamed from: f */
    public void mo99900f(byte[] bArr, int i, int i2) throws IOException {
        mo99901g(bArr, i, i2, false);
    }

    @Override // p153l.asf
    /* JADX INFO: renamed from: g */
    public boolean mo99901g(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!mo99906p(i2, z)) {
            return false;
        }
        System.arraycopy(this.f158723e, this.f158724f - i2, bArr, i, i2);
        return true;
    }

    @Override // p153l.asf
    public long getLength() {
        return this.f158721c;
    }

    @Override // p153l.asf
    public long getPosition() {
        return this.f158722d;
    }

    @Override // p153l.asf
    /* JADX INFO: renamed from: h */
    public void mo99902h() {
        this.f158724f = 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m177293j(int i) {
        if (i != -1) {
            this.f158722d += (long) i;
        }
    }

    @Override // p153l.asf
    /* JADX INFO: renamed from: k */
    public long mo99903k() {
        return this.f158722d + ((long) this.f158724f);
    }

    @Override // p153l.asf
    /* JADX INFO: renamed from: m */
    public void mo99904m(int i) throws IOException {
        mo99906p(i, false);
    }

    @Override // p153l.asf
    /* JADX INFO: renamed from: o */
    public void mo99905o(int i) throws IOException {
        m177298u(i, false);
    }

    @Override // p153l.asf
    /* JADX INFO: renamed from: p */
    public boolean mo99906p(int i, boolean z) throws IOException {
        m177294q(i);
        int iM177296s = this.f158725g - this.f158724f;
        while (iM177296s < i) {
            qod qodVar = this;
            int i2 = i;
            boolean z2 = z;
            iM177296s = qodVar.m177296s(this.f158723e, this.f158724f, i2, iM177296s, z2);
            if (iM177296s == -1) {
                return false;
            }
            qodVar.f158725g = qodVar.f158724f + iM177296s;
            this = qodVar;
            i = i2;
            z = z2;
        }
        this.f158724f += i;
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m177294q(int i) {
        int i2 = this.f158724f + i;
        byte[] bArr = this.f158723e;
        if (i2 > bArr.length) {
            this.f158723e = Arrays.copyOf(this.f158723e, bmk0.m105162q(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* JADX INFO: renamed from: r */
    public final int m177295r(byte[] bArr, int i, int i2) {
        int i3 = this.f158725g;
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.f158723e, 0, bArr, i, iMin);
        m177299v(iMin);
        return iMin;
    }

    @Override // p153l.asf, p153l.e6c
    public int read(byte[] bArr, int i, int i2) throws IOException {
        qod qodVar;
        int iM177295r = m177295r(bArr, i, i2);
        if (iM177295r == 0) {
            qodVar = this;
            iM177295r = qodVar.m177296s(bArr, i, i2, 0, true);
        } else {
            qodVar = this;
        }
        qodVar.m177293j(iM177295r);
        return iM177295r;
    }

    @Override // p153l.asf
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        mo99898b(bArr, i, i2, false);
    }

    /* JADX INFO: renamed from: s */
    public final int m177296s(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.f158720b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        vg3.m201207a();
        return 0;
    }

    @Override // p153l.asf
    public int skip(int i) throws IOException {
        qod qodVar;
        int iM177297t = m177297t(i);
        if (iM177297t == 0) {
            byte[] bArr = this.f158719a;
            qodVar = this;
            iM177297t = qodVar.m177296s(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            qodVar = this;
        }
        qodVar.m177293j(iM177297t);
        return iM177297t;
    }

    /* JADX INFO: renamed from: t */
    public final int m177297t(int i) {
        int iMin = Math.min(this.f158725g, i);
        m177299v(iMin);
        return iMin;
    }

    /* JADX INFO: renamed from: u */
    public boolean m177298u(int i, boolean z) throws IOException {
        int iM177297t = m177297t(i);
        while (iM177297t < i && iM177297t != -1) {
            iM177297t = m177296s(this.f158719a, -iM177297t, Math.min(i, this.f158719a.length + iM177297t), iM177297t, z);
        }
        m177293j(iM177297t);
        return iM177297t != -1;
    }

    /* JADX INFO: renamed from: v */
    public final void m177299v(int i) {
        int i2 = this.f158725g - i;
        this.f158725g = i2;
        this.f158724f = 0;
        byte[] bArr = this.f158723e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f158723e = bArr2;
    }
}
