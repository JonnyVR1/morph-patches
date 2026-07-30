package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import p149l.p11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.f */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1823f extends AbstractC1822e {

    /* JADX INFO: renamed from: i */
    @Nullable
    public int[] f7209i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public int[] f7210j;

    @Override // com.google.android.exoplayer2.audio.AbstractC1822e
    /* JADX INFO: renamed from: b */
    public AudioProcessor.C1804a mo9604b(AudioProcessor.C1804a c1804a) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f7209i;
        if (iArr == null) {
            return AudioProcessor.C1804a.f7039e;
        }
        if (c1804a.f7042c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(c1804a);
        }
        boolean z = c1804a.f7041b != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 >= c1804a.f7041b) {
                throw new AudioProcessor.UnhandledAudioFormatException(c1804a);
            }
            z |= i2 != i;
            i++;
        }
        return z ? new AudioProcessor.C1804a(c1804a.f7040a, iArr.length, 2) : AudioProcessor.C1804a.f7039e;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1822e
    /* JADX INFO: renamed from: d */
    public void mo9605d() {
        this.f7210j = this.f7209i;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1822e
    /* JADX INFO: renamed from: f */
    public void mo9607f() {
        this.f7210j = null;
        this.f7209i = null;
    }

    /* JADX INFO: renamed from: h */
    public void m9609h(@Nullable int[] iArr) {
        this.f7209i = iArr;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: l */
    public void mo9419l(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) p11.m167011e(this.f7210j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM9608g = m9608g(((iLimit - iPosition) / this.f7202b.f7043d) * this.f7203c.f7043d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferM9608g.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.f7202b.f7043d;
        }
        byteBuffer.position(iLimit);
        byteBufferM9608g.flip();
    }
}
