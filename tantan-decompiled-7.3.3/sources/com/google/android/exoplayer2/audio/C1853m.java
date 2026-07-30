package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import p153l.bmk0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.m */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1853m extends AbstractC1845e {

    /* JADX INFO: renamed from: i */
    public int f7302i;

    /* JADX INFO: renamed from: j */
    public int f7303j;

    /* JADX INFO: renamed from: k */
    public boolean f7304k;

    /* JADX INFO: renamed from: l */
    public int f7305l;

    /* JADX INFO: renamed from: m */
    public byte[] f7306m = bmk0.f77318f;

    /* JADX INFO: renamed from: n */
    public int f7307n;

    /* JADX INFO: renamed from: o */
    public long f7308o;

    @Override // com.google.android.exoplayer2.audio.AbstractC1845e
    /* JADX INFO: renamed from: b */
    public AudioProcessor.C1827a mo9658b(AudioProcessor.C1827a c1827a) throws AudioProcessor.UnhandledAudioFormatException {
        if (c1827a.f7079c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(c1827a);
        }
        this.f7304k = true;
        return (this.f7302i == 0 && this.f7303j == 0) ? AudioProcessor.C1827a.f7076e : c1827a;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1845e, com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: c */
    public boolean mo9471c() {
        return super.mo9471c() && this.f7307n == 0;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1845e
    /* JADX INFO: renamed from: d */
    public void mo9659d() {
        if (this.f7304k) {
            this.f7304k = false;
            int i = this.f7303j;
            int i2 = this.f7239b.f7080d;
            this.f7306m = new byte[i * i2];
            this.f7305l = this.f7302i * i2;
        }
        this.f7307n = 0;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1845e
    /* JADX INFO: renamed from: e */
    public void mo9660e() {
        if (this.f7304k) {
            int i = this.f7307n;
            if (i > 0) {
                this.f7308o += (long) (i / this.f7239b.f7080d);
            }
            this.f7307n = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1845e
    /* JADX INFO: renamed from: f */
    public void mo9661f() {
        this.f7306m = bmk0.f77318f;
    }

    /* JADX INFO: renamed from: h */
    public long m9732h() {
        return this.f7308o;
    }

    /* JADX INFO: renamed from: i */
    public void m9733i() {
        this.f7308o = 0L;
    }

    /* JADX INFO: renamed from: j */
    public void m9734j(int i, int i2) {
        this.f7302i = i;
        this.f7303j = i2;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: l */
    public void mo9473l(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f7305l);
        this.f7308o += (long) (iMin / this.f7239b.f7080d);
        this.f7305l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f7305l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f7307n + i2) - this.f7306m.length;
        ByteBuffer byteBufferM9662g = m9662g(length);
        int iM105162q = bmk0.m105162q(length, 0, this.f7307n);
        byteBufferM9662g.put(this.f7306m, 0, iM105162q);
        int iM105162q2 = bmk0.m105162q(length - iM105162q, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iM105162q2);
        byteBufferM9662g.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iM105162q2;
        int i4 = this.f7307n - iM105162q;
        this.f7307n = i4;
        byte[] bArr = this.f7306m;
        System.arraycopy(bArr, iM105162q, bArr, 0, i4);
        byteBuffer.get(this.f7306m, this.f7307n, i3);
        this.f7307n += i3;
        byteBufferM9662g.flip();
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1845e, com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: n */
    public ByteBuffer mo9475n() {
        int i;
        if (super.mo9471c() && (i = this.f7307n) > 0) {
            m9662g(i).put(this.f7306m, 0, this.f7307n).flip();
            this.f7307n = 0;
        }
        return super.mo9475n();
    }
}
