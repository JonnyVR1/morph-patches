package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import p149l.ohg0;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.i */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1826i extends AbstractC1822e {

    /* JADX INFO: renamed from: i */
    public final long f7237i;

    /* JADX INFO: renamed from: j */
    public final long f7238j;

    /* JADX INFO: renamed from: k */
    public final short f7239k;

    /* JADX INFO: renamed from: l */
    public int f7240l;

    /* JADX INFO: renamed from: m */
    public boolean f7241m;

    /* JADX INFO: renamed from: n */
    public byte[] f7242n;

    /* JADX INFO: renamed from: o */
    public byte[] f7243o;

    /* JADX INFO: renamed from: p */
    public int f7244p;

    /* JADX INFO: renamed from: q */
    public int f7245q;

    /* JADX INFO: renamed from: r */
    public int f7246r;

    /* JADX INFO: renamed from: s */
    public boolean f7247s;

    /* JADX INFO: renamed from: t */
    public long f7248t;

    public C1826i(long j, long j2, short s) {
        p11.m167007a(j2 <= j);
        this.f7237i = j;
        this.f7238j = j2;
        this.f7239k = s;
        byte[] bArr = vck0.f180953f;
        this.f7242n = bArr;
        this.f7243o = bArr;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1822e
    /* JADX INFO: renamed from: b */
    public AudioProcessor.C1804a mo9604b(AudioProcessor.C1804a c1804a) throws AudioProcessor.UnhandledAudioFormatException {
        if (c1804a.f7042c == 2) {
            return this.f7241m ? c1804a : AudioProcessor.C1804a.f7039e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(c1804a);
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1822e
    /* JADX INFO: renamed from: d */
    public void mo9605d() {
        if (this.f7241m) {
            this.f7240l = this.f7202b.f7043d;
            int iM9663h = m9663h(this.f7237i) * this.f7240l;
            if (this.f7242n.length != iM9663h) {
                this.f7242n = new byte[iM9663h];
            }
            int iM9663h2 = m9663h(this.f7238j) * this.f7240l;
            this.f7246r = iM9663h2;
            if (this.f7243o.length != iM9663h2) {
                this.f7243o = new byte[iM9663h2];
            }
        }
        this.f7244p = 0;
        this.f7248t = 0L;
        this.f7245q = 0;
        this.f7247s = false;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1822e
    /* JADX INFO: renamed from: e */
    public void mo9606e() {
        int i = this.f7245q;
        if (i > 0) {
            m9668r(this.f7242n, i);
        }
        if (this.f7247s) {
            return;
        }
        this.f7248t += (long) (this.f7246r / this.f7240l);
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1822e
    /* JADX INFO: renamed from: f */
    public void mo9607f() {
        this.f7241m = false;
        this.f7246r = 0;
        byte[] bArr = vck0.f180953f;
        this.f7242n = bArr;
        this.f7243o = bArr;
    }

    /* JADX INFO: renamed from: h */
    public final int m9663h(long j) {
        return (int) ((j * ((long) this.f7202b.f7040a)) / 1000000);
    }

    /* JADX INFO: renamed from: i */
    public final int m9664i(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(iLimit)) <= this.f7239k);
        int i = this.f7240l;
        return ((iLimit / i) * i) + i;
    }

    /* JADX INFO: renamed from: j */
    public final int m9665j(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f7239k) {
                int i = this.f7240l;
                return i * (iPosition / i);
            }
        }
        return byteBuffer.limit();
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1822e, com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: k */
    public boolean mo9418k() {
        return this.f7241m;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: l */
    public void mo9419l(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !m9603a()) {
            int i = this.f7244p;
            if (i == 0) {
                m9670t(byteBuffer);
            } else if (i == 1) {
                m9669s(byteBuffer);
            } else {
                if (i != 2) {
                    ohg0.m164364a();
                    return;
                }
                m9671u(byteBuffer);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public long m9666p() {
        return this.f7248t;
    }

    /* JADX INFO: renamed from: q */
    public final void m9667q(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        m9608g(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.f7247s = true;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m9668r(byte[] bArr, int i) {
        m9608g(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f7247s = true;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m9669s(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iM9665j = m9665j(byteBuffer);
        int iPosition = iM9665j - byteBuffer.position();
        byte[] bArr = this.f7242n;
        int length = bArr.length;
        int i = this.f7245q;
        int i2 = length - i;
        if (iM9665j < iLimit && iPosition < i2) {
            m9668r(bArr, i);
            this.f7245q = 0;
            this.f7244p = 0;
            return;
        }
        int iMin = Math.min(iPosition, i2);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f7242n, this.f7245q, iMin);
        int i3 = this.f7245q + iMin;
        this.f7245q = i3;
        byte[] bArr2 = this.f7242n;
        if (i3 == bArr2.length) {
            if (this.f7247s) {
                m9668r(bArr2, this.f7246r);
                this.f7248t += (long) ((this.f7245q - (this.f7246r * 2)) / this.f7240l);
            } else {
                this.f7248t += (long) ((i3 - this.f7246r) / this.f7240l);
            }
            m9673w(byteBuffer, this.f7242n, this.f7245q);
            this.f7245q = 0;
            this.f7244p = 2;
        }
        byteBuffer.limit(iLimit);
    }

    /* JADX INFO: renamed from: t */
    public final void m9670t(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f7242n.length));
        int iM9664i = m9664i(byteBuffer);
        if (iM9664i == byteBuffer.position()) {
            this.f7244p = 1;
        } else {
            byteBuffer.limit(iM9664i);
            m9667q(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    /* JADX INFO: renamed from: u */
    public final void m9671u(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iM9665j = m9665j(byteBuffer);
        byteBuffer.limit(iM9665j);
        this.f7248t += (long) (byteBuffer.remaining() / this.f7240l);
        m9673w(byteBuffer, this.f7243o, this.f7246r);
        if (iM9665j < iLimit) {
            m9668r(this.f7243o, this.f7246r);
            this.f7244p = 0;
            byteBuffer.limit(iLimit);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m9672v(boolean z) {
        this.f7241m = z;
    }

    /* JADX INFO: renamed from: w */
    public final void m9673w(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.f7246r);
        int i2 = this.f7246r - iMin;
        System.arraycopy(bArr, i - i2, this.f7243o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f7243o, i2, iMin);
    }

    public C1826i() {
        this(150000L, 20000L, (short) 1024);
    }
}
