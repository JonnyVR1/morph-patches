package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import p153l.bmk0;
import p153l.w11;
import p153l.wpg0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.i */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1849i extends AbstractC1845e {

    /* JADX INFO: renamed from: i */
    public final long f7274i;

    /* JADX INFO: renamed from: j */
    public final long f7275j;

    /* JADX INFO: renamed from: k */
    public final short f7276k;

    /* JADX INFO: renamed from: l */
    public int f7277l;

    /* JADX INFO: renamed from: m */
    public boolean f7278m;

    /* JADX INFO: renamed from: n */
    public byte[] f7279n;

    /* JADX INFO: renamed from: o */
    public byte[] f7280o;

    /* JADX INFO: renamed from: p */
    public int f7281p;

    /* JADX INFO: renamed from: q */
    public int f7282q;

    /* JADX INFO: renamed from: r */
    public int f7283r;

    /* JADX INFO: renamed from: s */
    public boolean f7284s;

    /* JADX INFO: renamed from: t */
    public long f7285t;

    public C1849i(long j, long j2, short s) {
        w11.m204365a(j2 <= j);
        this.f7274i = j;
        this.f7275j = j2;
        this.f7276k = s;
        byte[] bArr = bmk0.f77318f;
        this.f7279n = bArr;
        this.f7280o = bArr;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1845e
    /* JADX INFO: renamed from: b */
    public AudioProcessor.C1827a mo9658b(AudioProcessor.C1827a c1827a) throws AudioProcessor.UnhandledAudioFormatException {
        if (c1827a.f7079c == 2) {
            return this.f7278m ? c1827a : AudioProcessor.C1827a.f7076e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(c1827a);
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1845e
    /* JADX INFO: renamed from: d */
    public void mo9659d() {
        if (this.f7278m) {
            this.f7277l = this.f7239b.f7080d;
            int iM9717h = m9717h(this.f7274i) * this.f7277l;
            if (this.f7279n.length != iM9717h) {
                this.f7279n = new byte[iM9717h];
            }
            int iM9717h2 = m9717h(this.f7275j) * this.f7277l;
            this.f7283r = iM9717h2;
            if (this.f7280o.length != iM9717h2) {
                this.f7280o = new byte[iM9717h2];
            }
        }
        this.f7281p = 0;
        this.f7285t = 0L;
        this.f7282q = 0;
        this.f7284s = false;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1845e
    /* JADX INFO: renamed from: e */
    public void mo9660e() {
        int i = this.f7282q;
        if (i > 0) {
            m9722r(this.f7279n, i);
        }
        if (this.f7284s) {
            return;
        }
        this.f7285t += (long) (this.f7283r / this.f7277l);
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1845e
    /* JADX INFO: renamed from: f */
    public void mo9661f() {
        this.f7278m = false;
        this.f7283r = 0;
        byte[] bArr = bmk0.f77318f;
        this.f7279n = bArr;
        this.f7280o = bArr;
    }

    /* JADX INFO: renamed from: h */
    public final int m9717h(long j) {
        return (int) ((j * ((long) this.f7239b.f7077a)) / 1000000);
    }

    /* JADX INFO: renamed from: i */
    public final int m9718i(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(iLimit)) <= this.f7276k);
        int i = this.f7277l;
        return ((iLimit / i) * i) + i;
    }

    /* JADX INFO: renamed from: j */
    public final int m9719j(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f7276k) {
                int i = this.f7277l;
                return i * (iPosition / i);
            }
        }
        return byteBuffer.limit();
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1845e, com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: k */
    public boolean mo9472k() {
        return this.f7278m;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: l */
    public void mo9473l(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !m9657a()) {
            int i = this.f7281p;
            if (i == 0) {
                m9724t(byteBuffer);
            } else if (i == 1) {
                m9723s(byteBuffer);
            } else {
                if (i != 2) {
                    wpg0.m207458a();
                    return;
                }
                m9725u(byteBuffer);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public long m9720p() {
        return this.f7285t;
    }

    /* JADX INFO: renamed from: q */
    public final void m9721q(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        m9662g(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.f7284s = true;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m9722r(byte[] bArr, int i) {
        m9662g(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f7284s = true;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m9723s(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iM9719j = m9719j(byteBuffer);
        int iPosition = iM9719j - byteBuffer.position();
        byte[] bArr = this.f7279n;
        int length = bArr.length;
        int i = this.f7282q;
        int i2 = length - i;
        if (iM9719j < iLimit && iPosition < i2) {
            m9722r(bArr, i);
            this.f7282q = 0;
            this.f7281p = 0;
            return;
        }
        int iMin = Math.min(iPosition, i2);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f7279n, this.f7282q, iMin);
        int i3 = this.f7282q + iMin;
        this.f7282q = i3;
        byte[] bArr2 = this.f7279n;
        if (i3 == bArr2.length) {
            if (this.f7284s) {
                m9722r(bArr2, this.f7283r);
                this.f7285t += (long) ((this.f7282q - (this.f7283r * 2)) / this.f7277l);
            } else {
                this.f7285t += (long) ((i3 - this.f7283r) / this.f7277l);
            }
            m9727w(byteBuffer, this.f7279n, this.f7282q);
            this.f7282q = 0;
            this.f7281p = 2;
        }
        byteBuffer.limit(iLimit);
    }

    /* JADX INFO: renamed from: t */
    public final void m9724t(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f7279n.length));
        int iM9718i = m9718i(byteBuffer);
        if (iM9718i == byteBuffer.position()) {
            this.f7281p = 1;
        } else {
            byteBuffer.limit(iM9718i);
            m9721q(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    /* JADX INFO: renamed from: u */
    public final void m9725u(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iM9719j = m9719j(byteBuffer);
        byteBuffer.limit(iM9719j);
        this.f7285t += (long) (byteBuffer.remaining() / this.f7277l);
        m9727w(byteBuffer, this.f7280o, this.f7283r);
        if (iM9719j < iLimit) {
            m9722r(this.f7280o, this.f7283r);
            this.f7281p = 0;
            byteBuffer.limit(iLimit);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m9726v(boolean z) {
        this.f7278m = z;
    }

    /* JADX INFO: renamed from: w */
    public final void m9727w(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.f7283r);
        int i2 = this.f7283r - iMin;
        System.arraycopy(bArr, i - i2, this.f7280o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f7280o, i2, iMin);
    }

    public C1849i() {
        this(150000L, 20000L, (short) 1024);
    }
}
