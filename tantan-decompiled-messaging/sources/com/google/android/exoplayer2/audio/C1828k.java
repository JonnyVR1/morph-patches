package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import p149l.ohg0;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.k */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1828k extends AbstractC1822e {

    /* JADX INFO: renamed from: i */
    public static final int f7264i = Float.floatToIntBits(Float.NaN);

    /* JADX INFO: renamed from: h */
    public static void m9677h(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f7264i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC1822e
    /* JADX INFO: renamed from: b */
    public AudioProcessor.C1804a mo9604b(AudioProcessor.C1804a c1804a) throws AudioProcessor.UnhandledAudioFormatException {
        int i = c1804a.f7042c;
        if (vck0.m197790B0(i)) {
            return i != 4 ? new AudioProcessor.C1804a(c1804a.f7040a, c1804a.f7041b, 4) : AudioProcessor.C1804a.f7039e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(c1804a);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: l */
    public void mo9419l(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM9608g;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f7202b.f7042c;
        if (i2 == 536870912) {
            byteBufferM9608g = m9608g((i / 3) * 4);
            while (iPosition < iLimit) {
                m9677h(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferM9608g);
                iPosition += 3;
            }
        } else {
            if (i2 != 805306368) {
                ohg0.m164364a();
                return;
            }
            byteBufferM9608g = m9608g(i);
            while (iPosition < iLimit) {
                m9677h((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferM9608g);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM9608g.flip();
    }
}
