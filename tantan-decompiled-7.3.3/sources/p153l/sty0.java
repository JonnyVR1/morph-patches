package p153l;

import com.google.android.gms.internal.ads.zzds;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class sty0 extends fuu0 {

    /* JADX INFO: renamed from: i */
    public static final int f170630i = Float.floatToIntBits(Float.NaN);

    /* JADX INFO: renamed from: i */
    public static void m187976i(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f170630i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // p153l.wsu0
    /* JADX INFO: renamed from: a */
    public final void mo165047a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM127543d;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f100948b.f138278c;
        if (i2 == 21) {
            byteBufferM127543d = m127543d((i / 3) * 4);
            while (iPosition < iLimit) {
                m187976i(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferM127543d);
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferM127543d = m127543d(i);
            while (iPosition < iLimit) {
                int i3 = byteBuffer.get(iPosition) & 255;
                int i4 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                m187976i(i3 | i4 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferM127543d);
                iPosition += 4;
            }
        } else if (i2 == 1342177280) {
            byteBufferM127543d = m127543d((i / 3) * 4);
            while (iPosition < iLimit) {
                m187976i(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM127543d);
                iPosition += 3;
            }
        } else {
            if (i2 != 1610612736) {
                wpg0.m207458a();
                return;
            }
            byteBufferM127543d = m127543d(i);
            while (iPosition < iLimit) {
                int i5 = byteBuffer.get(iPosition + 3) & 255;
                int i6 = (byteBuffer.get(iPosition + 2) & 255) << 8;
                m187976i(i5 | i6 | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM127543d);
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
        int i2 = mpw0.f137957a;
        if (i == 21 || i == 1342177280 || i == 22 || i == 1610612736) {
            return new mqu0(mqu0Var.f138276a, mqu0Var.f138277b, 4);
        }
        if (i == 4) {
            return mqu0.f138275e;
        }
        throw new zzds("Unhandled input format:", mqu0Var);
    }
}
