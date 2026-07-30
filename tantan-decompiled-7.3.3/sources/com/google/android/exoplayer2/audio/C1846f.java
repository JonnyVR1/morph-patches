package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.f */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1846f extends AbstractC1845e {

    /* JADX INFO: renamed from: i */
    @Nullable
    public int[] f7246i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public int[] f7247j;

    @Override // com.google.android.exoplayer2.audio.AbstractC1845e
    /* JADX INFO: renamed from: b */
    public AudioProcessor.C1827a mo9658b(AudioProcessor.C1827a c1827a) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f7246i;
        if (iArr == null) {
            return AudioProcessor.C1827a.f7076e;
        }
        if (c1827a.f7079c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(c1827a);
        }
        boolean z = c1827a.f7078b != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 >= c1827a.f7078b) {
                throw new AudioProcessor.UnhandledAudioFormatException(c1827a);
            }
            z |= i2 != i;
            i++;
        }
        return z ? new AudioProcessor.C1827a(c1827a.f7077a, iArr.length, 2) : AudioProcessor.C1827a.f7076e;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1845e
    /* JADX INFO: renamed from: d */
    public void mo9659d() {
        this.f7247j = this.f7246i;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1845e
    /* JADX INFO: renamed from: f */
    public void mo9661f() {
        this.f7247j = null;
        this.f7246i = null;
    }

    /* JADX INFO: renamed from: h */
    public void m9663h(@Nullable int[] iArr) {
        this.f7246i = iArr;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: l */
    public void mo9473l(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) w11.m204369e(this.f7247j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM9662g = m9662g(((iLimit - iPosition) / this.f7239b.f7080d) * this.f7240c.f7080d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferM9662g.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.f7239b.f7080d;
        }
        byteBuffer.position(iLimit);
        byteBufferM9662g.flip();
    }
}
