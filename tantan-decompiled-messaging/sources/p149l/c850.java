package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class c850 {

    /* JADX INFO: renamed from: d */
    public static final byte[] f79694d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f79695e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, Tnaf.POW_2_WIDTH, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a */
    public ByteBuffer f79696a = AudioProcessor.f7038a;

    /* JADX INFO: renamed from: c */
    public int f79698c = 0;

    /* JADX INFO: renamed from: b */
    public int f79697b = 2;

    /* JADX INFO: renamed from: a */
    public void m105651a(DecoderInputBuffer decoderInputBuffer, List<byte[]> list) {
        p11.m167011e(decoderInputBuffer.f7375c);
        if (decoderInputBuffer.f7375c.limit() - decoderInputBuffer.f7375c.position() == 0) {
            return;
        }
        this.f79696a = m105652b(decoderInputBuffer.f7375c, (this.f79697b == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null);
        decoderInputBuffer.mo9803i();
        decoderInputBuffer.m9805v(this.f79696a.remaining());
        decoderInputBuffer.f7375c.put(this.f79696a);
        decoderInputBuffer.m9806w();
    }

    /* JADX INFO: renamed from: b */
    public final ByteBuffer m105652b(ByteBuffer byteBuffer, @Nullable byte[] bArr) {
        int i;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = (i2 + 255) / 255;
        int length = i3 + 27 + i2;
        if (this.f79697b == 2) {
            int length2 = bArr != null ? bArr.length + 28 : f79694d.length;
            length += f79695e.length + length2;
            i = length2;
        } else {
            i = 0;
        }
        ByteBuffer byteBufferM105653c = m105653c(length);
        if (this.f79697b == 2) {
            if (bArr != null) {
                m105655e(byteBufferM105653c, bArr);
            } else {
                byteBufferM105653c.put(f79694d);
            }
            byteBufferM105653c.put(f79695e);
        }
        int iM181478i = this.f79698c + rx50.m181478i(byteBuffer);
        this.f79698c = iM181478i;
        m105656f(byteBufferM105653c, iM181478i, this.f79697b, i3, false);
        for (int i4 = 0; i4 < i3; i4++) {
            if (i2 >= 255) {
                byteBufferM105653c.put((byte) -1);
                i2 -= 255;
            } else {
                byteBufferM105653c.put((byte) i2);
                i2 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferM105653c.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM105653c.flip();
        if (this.f79697b == 2) {
            byte[] bArrArray = byteBufferM105653c.array();
            int iArrayOffset = byteBufferM105653c.arrayOffset() + i;
            byte[] bArr2 = f79695e;
            byteBufferM105653c.putInt(i + bArr2.length + 22, vck0.m197890t(bArrArray, iArrayOffset + bArr2.length, byteBufferM105653c.limit() - byteBufferM105653c.position(), 0));
        } else {
            byteBufferM105653c.putInt(22, vck0.m197890t(byteBufferM105653c.array(), byteBufferM105653c.arrayOffset(), byteBufferM105653c.limit() - byteBufferM105653c.position(), 0));
        }
        this.f79697b++;
        return byteBufferM105653c;
    }

    /* JADX INFO: renamed from: c */
    public final ByteBuffer m105653c(int i) {
        if (this.f79696a.capacity() < i) {
            this.f79696a = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f79696a.clear();
        }
        return this.f79696a;
    }

    /* JADX INFO: renamed from: d */
    public void m105654d() {
        this.f79696a = AudioProcessor.f7038a;
        this.f79698c = 0;
        this.f79697b = 2;
    }

    /* JADX INFO: renamed from: e */
    public final void m105655e(ByteBuffer byteBuffer, byte[] bArr) {
        m105656f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(jpj0.m142744a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, vck0.m197890t(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    /* JADX INFO: renamed from: f */
    public final void m105656f(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(jpj0.m142744a(i2));
    }
}
