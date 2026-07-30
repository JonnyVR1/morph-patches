package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class jg50 {

    /* JADX INFO: renamed from: d */
    public static final byte[] f120671d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f120672e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, Tnaf.POW_2_WIDTH, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a */
    public ByteBuffer f120673a = AudioProcessor.f7075a;

    /* JADX INFO: renamed from: c */
    public int f120675c = 0;

    /* JADX INFO: renamed from: b */
    public int f120674b = 2;

    /* JADX INFO: renamed from: a */
    public void m144753a(DecoderInputBuffer decoderInputBuffer, List<byte[]> list) {
        w11.m204369e(decoderInputBuffer.f7412c);
        if (decoderInputBuffer.f7412c.limit() - decoderInputBuffer.f7412c.position() == 0) {
            return;
        }
        this.f120673a = m144754b(decoderInputBuffer.f7412c, (this.f120674b == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null);
        decoderInputBuffer.mo9857i();
        decoderInputBuffer.m9859v(this.f120673a.remaining());
        decoderInputBuffer.f7412c.put(this.f120673a);
        decoderInputBuffer.m9860w();
    }

    /* JADX INFO: renamed from: b */
    public final ByteBuffer m144754b(ByteBuffer byteBuffer, @Nullable byte[] bArr) {
        int i;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = (i2 + 255) / 255;
        int length = i3 + 27 + i2;
        if (this.f120674b == 2) {
            int length2 = bArr != null ? bArr.length + 28 : f120671d.length;
            length += f120672e.length + length2;
            i = length2;
        } else {
            i = 0;
        }
        ByteBuffer byteBufferM144755c = m144755c(length);
        if (this.f120674b == 2) {
            if (bArr != null) {
                m144757e(byteBufferM144755c, bArr);
            } else {
                byteBufferM144755c.put(f120671d);
            }
            byteBufferM144755c.put(f120672e);
        }
        int iM204967i = this.f120675c + w560.m204967i(byteBuffer);
        this.f120675c = iM204967i;
        m144758f(byteBufferM144755c, iM204967i, this.f120674b, i3, false);
        for (int i4 = 0; i4 < i3; i4++) {
            if (i2 >= 255) {
                byteBufferM144755c.put((byte) -1);
                i2 -= 255;
            } else {
                byteBufferM144755c.put((byte) i2);
                i2 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferM144755c.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM144755c.flip();
        if (this.f120674b == 2) {
            byte[] bArrArray = byteBufferM144755c.array();
            int iArrayOffset = byteBufferM144755c.arrayOffset() + i;
            byte[] bArr2 = f120672e;
            byteBufferM144755c.putInt(i + bArr2.length + 22, bmk0.m105168t(bArrArray, iArrayOffset + bArr2.length, byteBufferM144755c.limit() - byteBufferM144755c.position(), 0));
        } else {
            byteBufferM144755c.putInt(22, bmk0.m105168t(byteBufferM144755c.array(), byteBufferM144755c.arrayOffset(), byteBufferM144755c.limit() - byteBufferM144755c.position(), 0));
        }
        this.f120674b++;
        return byteBufferM144755c;
    }

    /* JADX INFO: renamed from: c */
    public final ByteBuffer m144755c(int i) {
        if (this.f120673a.capacity() < i) {
            this.f120673a = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f120673a.clear();
        }
        return this.f120673a;
    }

    /* JADX INFO: renamed from: d */
    public void m144756d() {
        this.f120673a = AudioProcessor.f7075a;
        this.f120675c = 0;
        this.f120674b = 2;
    }

    /* JADX INFO: renamed from: e */
    public final void m144757e(ByteBuffer byteBuffer, byte[] bArr) {
        m144758f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(myj0.m160797a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, bmk0.m105168t(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    /* JADX INFO: renamed from: f */
    public final void m144758f(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
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
        byteBuffer.put(myj0.m160797a(i2));
    }
}
