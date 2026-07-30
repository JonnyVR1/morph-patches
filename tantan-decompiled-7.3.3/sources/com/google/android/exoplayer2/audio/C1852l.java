package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import p153l.bmk0;
import p153l.wpg0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.l */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1852l extends AbstractC1845e {
    @Override // com.google.android.exoplayer2.audio.AbstractC1845e
    /* JADX INFO: renamed from: b */
    public AudioProcessor.C1827a mo9658b(AudioProcessor.C1827a c1827a) throws AudioProcessor.UnhandledAudioFormatException {
        int i = c1827a.f7079c;
        if (i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4) {
            return i != 2 ? new AudioProcessor.C1827a(c1827a.f7077a, c1827a.f7078b, 2) : AudioProcessor.C1827a.f7076e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(c1827a);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: l */
    public void mo9473l(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f7239b.f7079c;
        if (i2 == 3) {
            i *= 2;
        } else if (i2 == 4) {
            i /= 2;
        } else if (i2 != 268435456) {
            if (i2 != 536870912) {
                if (i2 != 805306368) {
                    wpg0.m207458a();
                    return;
                }
                i /= 2;
            } else {
                i /= 3;
                i *= 2;
            }
        }
        ByteBuffer byteBufferM9662g = m9662g(i);
        int i3 = this.f7239b.f7079c;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferM9662g.put((byte) 0);
                byteBufferM9662g.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sM105160p = (short) (bmk0.m105160p(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferM9662g.put((byte) (sM105160p & 255));
                byteBufferM9662g.put((byte) ((sM105160p >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM9662g.put(byteBuffer.get(iPosition + 1));
                byteBufferM9662g.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferM9662g.put(byteBuffer.get(iPosition + 1));
                byteBufferM9662g.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i3 != 805306368) {
                wpg0.m207458a();
                return;
            }
            while (iPosition < iLimit) {
                byteBufferM9662g.put(byteBuffer.get(iPosition + 2));
                byteBufferM9662g.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM9662g.flip();
    }
}
