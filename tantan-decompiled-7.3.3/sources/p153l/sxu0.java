package p153l;

import com.google.android.gms.internal.ads.zzds;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class sxu0 extends fuu0 {
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    @Override // p153l.wsu0
    /* JADX INFO: renamed from: a */
    public final void mo165047a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f100948b.f138278c;
        if (i2 == 3) {
            i += i;
        } else if (i2 == 4) {
            i /= 2;
        } else {
            if (i2 != 21) {
                if (i2 == 22) {
                    i /= 2;
                } else if (i2 != 268435456) {
                    if (i2 != 1342177280) {
                        if (i2 != 1610612736) {
                            wpg0.m207458a();
                            return;
                        }
                        i /= 2;
                    }
                }
            }
            i /= 3;
            i += i;
        }
        ByteBuffer byteBufferM127543d = m127543d(i);
        int i3 = this.f100948b.f138278c;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferM127543d.put((byte) 0);
                byteBufferM127543d.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sMax = (short) (Math.max(-1.0f, Math.min(byteBuffer.getFloat(iPosition), 1.0f)) * 32767.0f);
                byteBufferM127543d.put((byte) (sMax & 255));
                byteBufferM127543d.put((byte) ((sMax >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 21) {
            while (iPosition < iLimit) {
                byteBufferM127543d.put(byteBuffer.get(iPosition + 1));
                byteBufferM127543d.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            while (iPosition < iLimit) {
                byteBufferM127543d.put(byteBuffer.get(iPosition + 2));
                byteBufferM127543d.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM127543d.put(byteBuffer.get(iPosition + 1));
                byteBufferM127543d.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferM127543d.put(byteBuffer.get(iPosition + 1));
                byteBufferM127543d.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                wpg0.m207458a();
                return;
            }
            while (iPosition < iLimit) {
                byteBufferM127543d.put(byteBuffer.get(iPosition + 1));
                byteBufferM127543d.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM127543d.flip();
    }

    @Override // p153l.fuu0
    /* JADX INFO: renamed from: c */
    public final mqu0 mo127542c(mqu0 mqu0Var) throws zzds {
        int i = mqu0Var.f138278c;
        if (i != 3) {
            if (i == 2) {
                return mqu0.f138275e;
            }
            if (i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
                throw new zzds("Unhandled input format:", mqu0Var);
            }
        }
        return new mqu0(mqu0Var.f138276a, mqu0Var.f138277b, 2);
    }
}
