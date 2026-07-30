package p153l;

import com.bytedance.hume.readapk.C1133a;
import com.meituan.android.walle.SignatureNotFoundException;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
final class wt0 {
    /* JADX INFO: renamed from: a */
    private static void m207802a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        wg3.m206174a("ByteBuffer byte order must be little endian");
    }

    /* JADX INFO: renamed from: b */
    public static of60<ByteBuffer, Long> m207803b(FileChannel fileChannel) throws SignatureNotFoundException, IOException {
        return m207804c(fileChannel, m207805d(fileChannel));
    }

    /* JADX INFO: renamed from: c */
    public static of60<ByteBuffer, Long> m207804c(FileChannel fileChannel, long j) throws SignatureNotFoundException, IOException {
        if (j < 32) {
            throw new SignatureNotFoundException("APK too small for APK Signing Block. ZIP Central Directory offset: " + j);
        }
        fileChannel.position(j - 24);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        fileChannel.read(byteBufferAllocate);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        if (byteBufferAllocate.getLong(8) != C1133a.f4747b || byteBufferAllocate.getLong(16) != C1133a.f4746a) {
            throw new SignatureNotFoundException("No APK Signing Block before ZIP Central Directory");
        }
        long j2 = byteBufferAllocate.getLong(0);
        if (j2 < byteBufferAllocate.capacity() || j2 > 2147483639) {
            throw new SignatureNotFoundException("APK Signing Block size out of range: " + j2);
        }
        int i = (int) (8 + j2);
        long j3 = j - ((long) i);
        if (j3 < 0) {
            throw new SignatureNotFoundException("APK Signing Block offset out of range: " + j3);
        }
        fileChannel.position(j3);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
        fileChannel.read(byteBufferAllocate2);
        byteBufferAllocate2.order(byteOrder);
        long j4 = byteBufferAllocate2.getLong(0);
        if (j4 == j2) {
            return of60.m167406b(byteBufferAllocate2, Long.valueOf(j3));
        }
        throw new SignatureNotFoundException("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
    }

    /* JADX INFO: renamed from: d */
    public static long m207805d(FileChannel fileChannel) throws IOException {
        return m207806e(fileChannel, m207809h(fileChannel));
    }

    /* JADX INFO: renamed from: e */
    public static long m207806e(FileChannel fileChannel, long j) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.position((fileChannel.size() - j) - 6);
        fileChannel.read(byteBufferAllocate);
        return byteBufferAllocate.getInt(0);
    }

    /* JADX INFO: renamed from: f */
    public static Map<Integer, ByteBuffer> m207807f(ByteBuffer byteBuffer) throws SignatureNotFoundException {
        m207802a(byteBuffer);
        ByteBuffer byteBufferM207810i = m207810i(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (byteBufferM207810i.hasRemaining()) {
            i++;
            if (byteBufferM207810i.remaining() < 8) {
                throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i);
            }
            long j = byteBufferM207810i.getLong();
            if (j < 4 || j > 2147483647L) {
                throw new SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + j);
            }
            int i2 = (int) j;
            int iPosition = byteBufferM207810i.position() + i2;
            if (i2 > byteBufferM207810i.remaining()) {
                throw new SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + byteBufferM207810i.remaining());
            }
            linkedHashMap.put(Integer.valueOf(byteBufferM207810i.getInt()), m207808g(byteBufferM207810i, i2 - 4));
            byteBufferM207810i.position(iPosition);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: g */
    private static ByteBuffer m207808g(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i < 0) {
            za50.m219101a("size: ", i);
            return null;
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    /* JADX INFO: renamed from: h */
    public static long m207809h(FileChannel fileChannel) throws IOException {
        long size = fileChannel.size();
        if (size < 22) {
            zpg0.m220844a("APK too small for ZIP End of Central Directory (EOCD) record");
            return 0L;
        }
        long j = size - 22;
        long jMin = Math.min(j, 65535L);
        int i = 0;
        while (true) {
            long j2 = i;
            if (j2 > jMin) {
                zpg0.m220844a("ZIP End of Central Directory (EOCD) record not found");
                return 0L;
            }
            long j3 = j - j2;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            fileChannel.position(j3);
            fileChannel.read(byteBufferAllocate);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            if (byteBufferAllocate.getInt(0) == 101010256) {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(2);
                fileChannel.position(j3 + 20);
                fileChannel.read(byteBufferAllocate2);
                byteBufferAllocate2.order(byteOrder);
                short s = byteBufferAllocate2.getShort(0);
                if (s == i) {
                    return s;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: i */
    private static ByteBuffer m207810i(ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0) {
            za50.m219101a("start: ", i);
            return null;
        }
        if (i2 < i) {
            itq0.m142074a("end < start: ", i2, " < ", i);
            return null;
        }
        int iCapacity = byteBuffer.capacity();
        if (i2 > byteBuffer.capacity()) {
            itq0.m142074a("end > capacity: ", i2, " > ", iCapacity);
            return null;
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i2);
            byteBuffer.position(i);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            return byteBufferSlice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(iLimit);
            byteBuffer.position(iPosition);
        }
    }
}
