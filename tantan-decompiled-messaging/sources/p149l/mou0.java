package p149l;

import com.google.android.gms.internal.ads.zzds;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class mou0 extends zku0 {
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    @Override // p149l.qju0
    /* JADX INFO: renamed from: a */
    public final void mo132014a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f203569b.f102818c;
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
                            ohg0.m164364a();
                            return;
                        }
                        i /= 2;
                    }
                }
            }
            i /= 3;
            i += i;
        }
        ByteBuffer byteBufferM219206d = m219206d(i);
        int i3 = this.f203569b.f102818c;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferM219206d.put((byte) 0);
                byteBufferM219206d.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sMax = (short) (Math.max(-1.0f, Math.min(byteBuffer.getFloat(iPosition), 1.0f)) * 32767.0f);
                byteBufferM219206d.put((byte) (sMax & 255));
                byteBufferM219206d.put((byte) ((sMax >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 21) {
            while (iPosition < iLimit) {
                byteBufferM219206d.put(byteBuffer.get(iPosition + 1));
                byteBufferM219206d.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            while (iPosition < iLimit) {
                byteBufferM219206d.put(byteBuffer.get(iPosition + 2));
                byteBufferM219206d.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM219206d.put(byteBuffer.get(iPosition + 1));
                byteBufferM219206d.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferM219206d.put(byteBuffer.get(iPosition + 1));
                byteBufferM219206d.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                ohg0.m164364a();
                return;
            }
            while (iPosition < iLimit) {
                byteBufferM219206d.put(byteBuffer.get(iPosition + 1));
                byteBufferM219206d.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM219206d.flip();
    }

    @Override // p149l.zku0
    /* JADX INFO: renamed from: c */
    public final ghu0 mo150391c(ghu0 ghu0Var) throws zzds {
        int i = ghu0Var.f102818c;
        if (i != 3) {
            if (i == 2) {
                return ghu0.f102815e;
            }
            if (i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
                throw new zzds("Unhandled input format:", ghu0Var);
            }
        }
        return new ghu0(ghu0Var.f102816a, ghu0Var.f102817b, 2);
    }
}
