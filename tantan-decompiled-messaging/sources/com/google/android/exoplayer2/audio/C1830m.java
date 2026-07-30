package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.m */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1830m extends AbstractC1822e {

    /* JADX INFO: renamed from: i */
    public int f7265i;

    /* JADX INFO: renamed from: j */
    public int f7266j;

    /* JADX INFO: renamed from: k */
    public boolean f7267k;

    /* JADX INFO: renamed from: l */
    public int f7268l;

    /* JADX INFO: renamed from: m */
    public byte[] f7269m = vck0.f180953f;

    /* JADX INFO: renamed from: n */
    public int f7270n;

    /* JADX INFO: renamed from: o */
    public long f7271o;

    @Override // com.google.android.exoplayer2.audio.AbstractC1822e
    /* JADX INFO: renamed from: b */
    public AudioProcessor.C1804a mo9604b(AudioProcessor.C1804a c1804a) throws AudioProcessor.UnhandledAudioFormatException {
        if (c1804a.f7042c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(c1804a);
        }
        this.f7267k = true;
        return (this.f7265i == 0 && this.f7266j == 0) ? AudioProcessor.C1804a.f7039e : c1804a;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1822e, com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: c */
    public boolean mo9417c() {
        return super.mo9417c() && this.f7270n == 0;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1822e
    /* JADX INFO: renamed from: d */
    public void mo9605d() {
        if (this.f7267k) {
            this.f7267k = false;
            int i = this.f7266j;
            int i2 = this.f7202b.f7043d;
            this.f7269m = new byte[i * i2];
            this.f7268l = this.f7265i * i2;
        }
        this.f7270n = 0;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1822e
    /* JADX INFO: renamed from: e */
    public void mo9606e() {
        if (this.f7267k) {
            int i = this.f7270n;
            if (i > 0) {
                this.f7271o += (long) (i / this.f7202b.f7043d);
            }
            this.f7270n = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1822e
    /* JADX INFO: renamed from: f */
    public void mo9607f() {
        this.f7269m = vck0.f180953f;
    }

    /* JADX INFO: renamed from: h */
    public long m9678h() {
        return this.f7271o;
    }

    /* JADX INFO: renamed from: i */
    public void m9679i() {
        this.f7271o = 0L;
    }

    /* JADX INFO: renamed from: j */
    public void m9680j(int i, int i2) {
        this.f7265i = i;
        this.f7266j = i2;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: l */
    public void mo9419l(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f7268l);
        this.f7271o += (long) (iMin / this.f7202b.f7043d);
        this.f7268l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f7268l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f7270n + i2) - this.f7269m.length;
        ByteBuffer byteBufferM9608g = m9608g(length);
        int iM197884q = vck0.m197884q(length, 0, this.f7270n);
        byteBufferM9608g.put(this.f7269m, 0, iM197884q);
        int iM197884q2 = vck0.m197884q(length - iM197884q, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iM197884q2);
        byteBufferM9608g.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iM197884q2;
        int i4 = this.f7270n - iM197884q;
        this.f7270n = i4;
        byte[] bArr = this.f7269m;
        System.arraycopy(bArr, iM197884q, bArr, 0, i4);
        byteBuffer.get(this.f7269m, this.f7270n, i3);
        this.f7270n += i3;
        byteBufferM9608g.flip();
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1822e, com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: n */
    public ByteBuffer mo9421n() {
        int i;
        if (super.mo9417c() && (i = this.f7270n) > 0) {
            m9608g(i).put(this.f7269m, 0, this.f7270n).flip();
            this.f7270n = 0;
        }
        return super.mo9421n();
    }
}
