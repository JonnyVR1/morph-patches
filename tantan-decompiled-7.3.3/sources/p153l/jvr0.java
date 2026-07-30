package p153l;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public final class jvr0 {
    /* JADX INFO: renamed from: a */
    public static long m147099a(ByteBuffer byteBuffer) {
        m147105g(byteBuffer);
        return m147103e(byteBuffer, byteBuffer.position() + 16);
    }

    /* JADX INFO: renamed from: b */
    public static long m147100b(ByteBuffer byteBuffer) {
        m147105g(byteBuffer);
        return m147103e(byteBuffer, byteBuffer.position() + 12);
    }

    /* JADX INFO: renamed from: c */
    public static Pair m147101c(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair pairM147104f = m147104f(randomAccessFile, 0);
        return pairM147104f != null ? pairM147104f : m147104f(randomAccessFile, p7f.COLOR_SPACE_UNCALIBRATED);
    }

    /* JADX INFO: renamed from: d */
    public static void m147102d(ByteBuffer byteBuffer, long j) {
        m147105g(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j < 0 || j > 4294967295L) {
            fcg0.m125008a("uint32 value of out range: ", j);
        } else {
            byteBuffer.putInt(byteBuffer.position() + iPosition, (int) j);
        }
    }

    /* JADX INFO: renamed from: e */
    public static long m147103e(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }

    /* JADX INFO: renamed from: f */
    public static Pair m147104f(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        m147105g(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity >= 22) {
            int i3 = iCapacity - 22;
            int iMin = Math.min(i3, p7f.COLOR_SPACE_UNCALIBRATED);
            int i4 = 0;
            while (true) {
                if (i4 >= iMin) {
                    i2 = -1;
                    break;
                }
                i2 = i3 - i4;
                if (byteBufferAllocate.getInt(i2) == 101010256 && ((char) byteBufferAllocate.getShort(i2 + 20)) == i4) {
                    break;
                }
                i4++;
            }
        } else {
            i2 = -1;
            break;
        }
        if (i2 == -1) {
            return null;
        }
        byteBufferAllocate.position(i2);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i2)));
    }

    /* JADX INFO: renamed from: g */
    public static void m147105g(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        wg3.m206174a("ByteBuffer byte order must be little endian");
    }
}
