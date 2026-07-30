package p149l;

import com.google.android.gms.internal.ads.zzds;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class mky0 extends zku0 {

    /* JADX INFO: renamed from: i */
    public static final int f134397i = Float.floatToIntBits(Float.NaN);

    /* JADX INFO: renamed from: i */
    public static void m155109i(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f134397i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // p149l.qju0
    /* JADX INFO: renamed from: a */
    public final void mo132014a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM219206d;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f203569b.f102818c;
        if (i2 == 21) {
            byteBufferM219206d = m219206d((i / 3) * 4);
            while (iPosition < iLimit) {
                m155109i(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferM219206d);
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferM219206d = m219206d(i);
            while (iPosition < iLimit) {
                int i3 = byteBuffer.get(iPosition) & 255;
                int i4 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                m155109i(i3 | i4 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferM219206d);
                iPosition += 4;
            }
        } else if (i2 == 1342177280) {
            byteBufferM219206d = m219206d((i / 3) * 4);
            while (iPosition < iLimit) {
                m155109i(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM219206d);
                iPosition += 3;
            }
        } else {
            if (i2 != 1610612736) {
                ohg0.m164364a();
                return;
            }
            byteBufferM219206d = m219206d(i);
            while (iPosition < iLimit) {
                int i5 = byteBuffer.get(iPosition + 3) & 255;
                int i6 = (byteBuffer.get(iPosition + 2) & 255) << 8;
                m155109i(i5 | i6 | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM219206d);
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
        int i2 = ggw0.f102568a;
        if (i == 21 || i == 1342177280 || i == 22 || i == 1610612736) {
            return new ghu0(ghu0Var.f102816a, ghu0Var.f102817b, 4);
        }
        if (i == 4) {
            return ghu0.f102815e;
        }
        throw new zzds("Unhandled input format:", ghu0Var);
    }
}
