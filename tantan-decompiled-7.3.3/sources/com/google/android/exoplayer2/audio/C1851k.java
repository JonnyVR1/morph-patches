package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import p153l.bmk0;
import p153l.wpg0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.k */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1851k extends AbstractC1845e {

    /* JADX INFO: renamed from: i */
    public static final int f7301i = Float.floatToIntBits(Float.NaN);

    /* JADX INFO: renamed from: h */
    public static void m9731h(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f7301i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1845e
    /* JADX INFO: renamed from: b */
    public AudioProcessor.C1827a mo9658b(AudioProcessor.C1827a c1827a) throws AudioProcessor.UnhandledAudioFormatException {
        int i = c1827a.f7079c;
        if (bmk0.m105068B0(i)) {
            return i != 4 ? new AudioProcessor.C1827a(c1827a.f7077a, c1827a.f7078b, 4) : AudioProcessor.C1827a.f7076e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(c1827a);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: l */
    public void mo9473l(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM9662g;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f7239b.f7079c;
        if (i2 == 536870912) {
            byteBufferM9662g = m9662g((i / 3) * 4);
            while (iPosition < iLimit) {
                m9731h(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferM9662g);
                iPosition += 3;
            }
        } else {
            if (i2 != 805306368) {
                wpg0.m207458a();
                return;
            }
            byteBufferM9662g = m9662g(i);
            while (iPosition < iLimit) {
                m9731h((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferM9662g);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM9662g.flip();
    }
}
