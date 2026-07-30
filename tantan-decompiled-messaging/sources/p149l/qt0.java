package p149l;

import com.bytedance.hume.readapk.C1110a;
import com.meituan.android.walle.SignatureNotFoundException;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
final class qt0 {
    /* JADX INFO: renamed from: a */
    private static void m176379a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        ig3.m135964a("ByteBuffer byte order must be little endian");
    }

    /* JADX INFO: renamed from: b */
    public static i760<ByteBuffer, Long> m176380b(FileChannel fileChannel) throws SignatureNotFoundException, IOException {
        return m176381c(fileChannel, m176382d(fileChannel));
    }

    /* JADX INFO: renamed from: c */
    public static i760<ByteBuffer, Long> m176381c(FileChannel fileChannel, long j) throws SignatureNotFoundException, IOException {
        if (j < 32) {
            throw new SignatureNotFoundException("APK too small for APK Signing Block. ZIP Central Directory offset: " + j);
        }
        fileChannel.position(j - 24);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        fileChannel.read(byteBufferAllocate);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        if (byteBufferAllocate.getLong(8) != C1110a.f4710b || byteBufferAllocate.getLong(16) != C1110a.f4709a) {
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
            return i760.m134744b(byteBufferAllocate2, Long.valueOf(j3));
        }
        throw new SignatureNotFoundException("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
    }

    /* JADX INFO: renamed from: d */
    public static long m176382d(FileChannel fileChannel) throws IOException {
        return m176383e(fileChannel, m176386h(fileChannel));
    }

    /* JADX INFO: renamed from: e */
    public static long m176383e(FileChannel fileChannel, long j) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.position((fileChannel.size() - j) - 6);
        fileChannel.read(byteBufferAllocate);
        return byteBufferAllocate.getInt(0);
    }

    /* JADX INFO: renamed from: f */
    public static Map<Integer, ByteBuffer> m176384f(ByteBuffer byteBuffer) throws SignatureNotFoundException {
        m176379a(byteBuffer);
        ByteBuffer byteBufferM176387i = m176387i(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (byteBufferM176387i.hasRemaining()) {
            i++;
            if (byteBufferM176387i.remaining() < 8) {
                throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i);
            }
            long j = byteBufferM176387i.getLong();
            if (j < 4 || j > 2147483647L) {
                throw new SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + j);
            }
            int i2 = (int) j;
            int iPosition = byteBufferM176387i.position() + i2;
            if (i2 > byteBufferM176387i.remaining()) {
                throw new SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + byteBufferM176387i.remaining());
            }
            linkedHashMap.put(Integer.valueOf(byteBufferM176387i.getInt()), m176385g(byteBufferM176387i, i2 - 4));
            byteBufferM176387i.position(iPosition);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: g */
    private static ByteBuffer m176385g(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i < 0) {
            k250.m144273a("size: ", i);
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
    public static long m176386h(FileChannel fileChannel) throws IOException {
        long size = fileChannel.size();
        if (size < 22) {
            rhg0.m179353a("APK too small for ZIP End of Central Directory (EOCD) record");
            return 0L;
        }
        long j = size - 22;
        long jMin = Math.min(j, 65535L);
        int i = 0;
        while (true) {
            long j2 = i;
            if (j2 > jMin) {
                rhg0.m179353a("ZIP End of Central Directory (EOCD) record not found");
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
    private static ByteBuffer m176387i(ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0) {
            k250.m144273a("start: ", i);
            return null;
        }
        if (i2 < i) {
            ckq0.m107426a("end < start: ", i2, " < ", i);
            return null;
        }
        int iCapacity = byteBuffer.capacity();
        if (i2 > byteBuffer.capacity()) {
            ckq0.m107426a("end > capacity: ", i2, " > ", iCapacity);
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
