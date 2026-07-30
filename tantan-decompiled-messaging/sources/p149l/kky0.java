package p149l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
public final class kky0 {

    /* JADX INFO: renamed from: d */
    public static final byte[] f123608d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f123609e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, Tnaf.POW_2_WIDTH, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a */
    public ByteBuffer f123610a = qju0.f154991a;

    /* JADX INFO: renamed from: c */
    public int f123612c = 0;

    /* JADX INFO: renamed from: b */
    public int f123611b = 2;

    /* JADX INFO: renamed from: c */
    public static final void m146359c(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(qkw0.m175392a(i2));
    }

    /* JADX INFO: renamed from: a */
    public final void m146360a(ylx0 ylx0Var, List list) {
        int length;
        ByteBuffer byteBuffer;
        int i;
        ByteBuffer byteBuffer2 = ylx0Var.f198945d;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - ylx0Var.f198945d.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f123611b == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = ylx0Var.f198945d;
        int iPosition = byteBuffer3.position();
        int iLimit = byteBuffer3.limit();
        int i2 = iLimit - iPosition;
        int i3 = (i2 + 255) / 255;
        int i4 = i3 + 27 + i2;
        if (this.f123611b == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i4 += length + 44;
        } else {
            length = 0;
        }
        if (this.f123610a.capacity() < i4) {
            this.f123610a = ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f123610a.clear();
        }
        ByteBuffer byteBuffer4 = this.f123610a;
        if (this.f123611b == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i = 22;
                m146359c(byteBuffer, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer.put(qkw0.m175392a(length2));
                byteBuffer.put(bArr);
                int i5 = length2 + 28;
                byteBuffer.putInt(22, ggw0.m126077s(byteBuffer.array(), byteBuffer.arrayOffset(), i5, 0));
                byteBuffer.position(i5);
            } else {
                byteBuffer = byteBuffer4;
                i = 22;
                byteBuffer.put(f123608d);
            }
            byteBuffer.put(f123609e);
        } else {
            byteBuffer = byteBuffer4;
            i = 22;
        }
        int iM178088c = this.f123612c + r6r0.m178088c(byteBuffer3);
        this.f123612c = iM178088c;
        int i6 = i;
        ByteBuffer byteBuffer5 = byteBuffer;
        m146359c(byteBuffer5, iM178088c, this.f123611b, i3, false);
        for (int i7 = 0; i7 < i3; i7++) {
            if (i2 >= 255) {
                byteBuffer5.put((byte) -1);
                i2 -= 255;
            } else {
                byteBuffer5.put((byte) i2);
                i2 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer5.put(byteBuffer3.get(iPosition));
            iPosition++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.f123611b == 2) {
            byteBuffer5.putInt(length + 66, ggw0.m126077s(byteBuffer5.array(), byteBuffer5.arrayOffset() + length + 44, byteBuffer5.limit() - byteBuffer5.position(), 0));
        } else {
            byteBuffer5.putInt(i6, ggw0.m126077s(byteBuffer5.array(), byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        }
        this.f123611b++;
        this.f123610a = byteBuffer5;
        ylx0Var.mo160161b();
        ylx0Var.m215311i(this.f123610a.remaining());
        ylx0Var.f198945d.put(this.f123610a);
        ylx0Var.m215312j();
    }

    /* JADX INFO: renamed from: b */
    public final void m146361b() {
        this.f123610a = qju0.f154991a;
        this.f123612c = 0;
        this.f123611b = 2;
    }
}
