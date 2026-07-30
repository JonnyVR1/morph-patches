package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import p149l.ohg0;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.l */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1829l extends AbstractC1822e {
    @Override // com.google.android.exoplayer2.audio.AbstractC1822e
    /* JADX INFO: renamed from: b */
    public AudioProcessor.C1804a mo9604b(AudioProcessor.C1804a c1804a) throws AudioProcessor.UnhandledAudioFormatException {
        int i = c1804a.f7042c;
        if (i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4) {
            return i != 2 ? new AudioProcessor.C1804a(c1804a.f7040a, c1804a.f7041b, 2) : AudioProcessor.C1804a.f7039e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(c1804a);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: l */
    public void mo9419l(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f7202b.f7042c;
        if (i2 == 3) {
            i *= 2;
        } else if (i2 == 4) {
            i /= 2;
        } else if (i2 != 268435456) {
            if (i2 != 536870912) {
                if (i2 != 805306368) {
                    ohg0.m164364a();
                    return;
                }
                i /= 2;
            } else {
                i /= 3;
                i *= 2;
            }
        }
        ByteBuffer byteBufferM9608g = m9608g(i);
        int i3 = this.f7202b.f7042c;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferM9608g.put((byte) 0);
                byteBufferM9608g.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sM197882p = (short) (vck0.m197882p(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferM9608g.put((byte) (sM197882p & 255));
                byteBufferM9608g.put((byte) ((sM197882p >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM9608g.put(byteBuffer.get(iPosition + 1));
                byteBufferM9608g.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferM9608g.put(byteBuffer.get(iPosition + 1));
                byteBufferM9608g.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i3 != 805306368) {
                ohg0.m164364a();
                return;
            }
            while (iPosition < iLimit) {
                byteBufferM9608g.put(byteBuffer.get(iPosition + 2));
                byteBufferM9608g.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM9608g.flip();
    }
}
