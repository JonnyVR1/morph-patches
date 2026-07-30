package com.bytedance.hume.readapk;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import p149l.ckq0;
import p149l.ig3;
import p149l.k250;
import p149l.rhg0;

/* JADX INFO: renamed from: com.bytedance.hume.readapk.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1110a {

    /* JADX INFO: renamed from: a */
    public static final long f4709a = 3617552046287187010L;

    /* JADX INFO: renamed from: b */
    public static final long f4710b = 2334950737559900225L;

    /* JADX INFO: renamed from: c */
    public static final int f4711c = 1896449818;

    /* JADX INFO: renamed from: d */
    public static final int f4712d = 1114793335;

    /* JADX INFO: renamed from: e */
    public static final int f4713e = 4096;

    /* JADX INFO: renamed from: f */
    public static final String f4714f = "UTF-8";

    /* JADX INFO: renamed from: g */
    private static final int f4715g = 32;

    /* JADX INFO: renamed from: h */
    private static final int f4716h = 22;

    /* JADX INFO: renamed from: i */
    private static final int f4717i = 101010256;

    /* JADX INFO: renamed from: j */
    private static final int f4718j = 65535;

    /* JADX INFO: renamed from: k */
    private static final int f4719k = 20;

    private C1110a() {
    }

    /* JADX INFO: renamed from: a */
    public static Map<Integer, ByteBuffer> m5672a(ByteBuffer byteBuffer) throws C1115e {
        m5675b(byteBuffer);
        ByteBuffer byteBufferM5671a = m5671a(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (byteBufferM5671a.hasRemaining()) {
            i++;
            if (byteBufferM5671a.remaining() < 8) {
                throw new C1115e("Insufficient data to read size of APK Signing Block entry #" + i);
            }
            long j = byteBufferM5671a.getLong();
            if (j < 4 || j > 2147483647L) {
                throw new C1115e("APK Signing Block entry #" + i + " size out of range: " + j);
            }
            int i2 = (int) j;
            int iPosition = byteBufferM5671a.position() + i2;
            if (i2 > byteBufferM5671a.remaining()) {
                throw new C1115e("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + byteBufferM5671a.remaining());
            }
            linkedHashMap.put(Integer.valueOf(byteBufferM5671a.getInt()), m5670a(byteBufferM5671a, i2 - 4));
            byteBufferM5671a.position(iPosition);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: b */
    public static C1113c<ByteBuffer, Long> m5674b(FileChannel fileChannel, long j) throws C1115e, IOException {
        if (j < 32) {
            throw new C1115e("APK too small for APK Signing Block. ZIP Central Directory offset: " + j);
        }
        fileChannel.position(j - 24);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        fileChannel.read(byteBufferAllocate);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        if (byteBufferAllocate.getLong(8) != f4710b || byteBufferAllocate.getLong(16) != f4709a) {
            throw new C1115e("No APK Signing Block before ZIP Central Directory");
        }
        long j2 = byteBufferAllocate.getLong(0);
        if (j2 < byteBufferAllocate.capacity() || j2 > 2147483639) {
            throw new C1115e("APK Signing Block size out of range: " + j2);
        }
        int i = (int) (8 + j2);
        long j3 = j - ((long) i);
        if (j3 < 0) {
            throw new C1115e("APK Signing Block offset out of range: " + j3);
        }
        fileChannel.position(j3);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
        fileChannel.read(byteBufferAllocate2);
        byteBufferAllocate2.order(byteOrder);
        long j4 = byteBufferAllocate2.getLong(0);
        if (j4 == j2) {
            return C1113c.m5680a(byteBufferAllocate2, Long.valueOf(j3));
        }
        throw new C1115e("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
    }

    /* JADX INFO: renamed from: c */
    public static C1113c<ByteBuffer, Long> m5676c(FileChannel fileChannel) {
        return m5674b(fileChannel, m5673b(fileChannel));
    }

    /* JADX INFO: renamed from: a */
    public static long m5669a(FileChannel fileChannel, long j) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.position((fileChannel.size() - j) - 6);
        fileChannel.read(byteBufferAllocate);
        return byteBufferAllocate.getInt(0);
    }

    /* JADX INFO: renamed from: b */
    public static long m5673b(FileChannel fileChannel) {
        return m5669a(fileChannel, m5668a(fileChannel));
    }

    /* JADX INFO: renamed from: a */
    private static ByteBuffer m5670a(ByteBuffer byteBuffer, int i) {
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

    /* JADX INFO: renamed from: b */
    private static void m5675b(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        ig3.m135964a("ByteBuffer byte order must be little endian");
    }

    /* JADX INFO: renamed from: a */
    private static ByteBuffer m5671a(ByteBuffer byteBuffer, int i, int i2) {
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

    /* JADX INFO: renamed from: a */
    public static long m5668a(FileChannel fileChannel) throws IOException {
        String str;
        long size = fileChannel.size();
        if (size >= 22) {
            long j = size - 22;
            long jMin = Math.min(j, 65535L);
            int i = 0;
            while (true) {
                long j2 = i;
                if (j2 > jMin) {
                    str = "ZIP End of Central Directory (EOCD) record not found";
                    break;
                }
                long j3 = j - j2;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                fileChannel.position(j3);
                fileChannel.read(byteBufferAllocate);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                if (byteBufferAllocate.getInt(0) == f4717i) {
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
        } else {
            str = "APK too small for ZIP End of Central Directory (EOCD) record";
        }
        rhg0.m179353a(str);
        return 0L;
    }
}
