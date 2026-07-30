package com.bytedance.hume.readapk;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import p153l.itq0;
import p153l.wg3;
import p153l.za50;
import p153l.zpg0;

/* JADX INFO: renamed from: com.bytedance.hume.readapk.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1133a {

    /* JADX INFO: renamed from: a */
    public static final long f4746a = 3617552046287187010L;

    /* JADX INFO: renamed from: b */
    public static final long f4747b = 2334950737559900225L;

    /* JADX INFO: renamed from: c */
    public static final int f4748c = 1896449818;

    /* JADX INFO: renamed from: d */
    public static final int f4749d = 1114793335;

    /* JADX INFO: renamed from: e */
    public static final int f4750e = 4096;

    /* JADX INFO: renamed from: f */
    public static final String f4751f = "UTF-8";

    /* JADX INFO: renamed from: g */
    private static final int f4752g = 32;

    /* JADX INFO: renamed from: h */
    private static final int f4753h = 22;

    /* JADX INFO: renamed from: i */
    private static final int f4754i = 101010256;

    /* JADX INFO: renamed from: j */
    private static final int f4755j = 65535;

    /* JADX INFO: renamed from: k */
    private static final int f4756k = 20;

    private C1133a() {
    }

    /* JADX INFO: renamed from: a */
    public static Map<Integer, ByteBuffer> m5726a(ByteBuffer byteBuffer) throws C1138e {
        m5729b(byteBuffer);
        ByteBuffer byteBufferM5725a = m5725a(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (byteBufferM5725a.hasRemaining()) {
            i++;
            if (byteBufferM5725a.remaining() < 8) {
                throw new C1138e("Insufficient data to read size of APK Signing Block entry #" + i);
            }
            long j = byteBufferM5725a.getLong();
            if (j < 4 || j > 2147483647L) {
                throw new C1138e("APK Signing Block entry #" + i + " size out of range: " + j);
            }
            int i2 = (int) j;
            int iPosition = byteBufferM5725a.position() + i2;
            if (i2 > byteBufferM5725a.remaining()) {
                throw new C1138e("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + byteBufferM5725a.remaining());
            }
            linkedHashMap.put(Integer.valueOf(byteBufferM5725a.getInt()), m5724a(byteBufferM5725a, i2 - 4));
            byteBufferM5725a.position(iPosition);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: b */
    public static C1136c<ByteBuffer, Long> m5728b(FileChannel fileChannel, long j) throws C1138e, IOException {
        if (j < 32) {
            throw new C1138e("APK too small for APK Signing Block. ZIP Central Directory offset: " + j);
        }
        fileChannel.position(j - 24);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        fileChannel.read(byteBufferAllocate);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        if (byteBufferAllocate.getLong(8) != f4747b || byteBufferAllocate.getLong(16) != f4746a) {
            throw new C1138e("No APK Signing Block before ZIP Central Directory");
        }
        long j2 = byteBufferAllocate.getLong(0);
        if (j2 < byteBufferAllocate.capacity() || j2 > 2147483639) {
            throw new C1138e("APK Signing Block size out of range: " + j2);
        }
        int i = (int) (8 + j2);
        long j3 = j - ((long) i);
        if (j3 < 0) {
            throw new C1138e("APK Signing Block offset out of range: " + j3);
        }
        fileChannel.position(j3);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
        fileChannel.read(byteBufferAllocate2);
        byteBufferAllocate2.order(byteOrder);
        long j4 = byteBufferAllocate2.getLong(0);
        if (j4 == j2) {
            return C1136c.m5734a(byteBufferAllocate2, Long.valueOf(j3));
        }
        throw new C1138e("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
    }

    /* JADX INFO: renamed from: c */
    public static C1136c<ByteBuffer, Long> m5730c(FileChannel fileChannel) {
        return m5728b(fileChannel, m5727b(fileChannel));
    }

    /* JADX INFO: renamed from: a */
    public static long m5723a(FileChannel fileChannel, long j) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.position((fileChannel.size() - j) - 6);
        fileChannel.read(byteBufferAllocate);
        return byteBufferAllocate.getInt(0);
    }

    /* JADX INFO: renamed from: b */
    public static long m5727b(FileChannel fileChannel) {
        return m5723a(fileChannel, m5722a(fileChannel));
    }

    /* JADX INFO: renamed from: a */
    private static ByteBuffer m5724a(ByteBuffer byteBuffer, int i) {
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

    /* JADX INFO: renamed from: b */
    private static void m5729b(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        wg3.m206174a("ByteBuffer byte order must be little endian");
    }

    /* JADX INFO: renamed from: a */
    private static ByteBuffer m5725a(ByteBuffer byteBuffer, int i, int i2) {
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

    /* JADX INFO: renamed from: a */
    public static long m5722a(FileChannel fileChannel) throws IOException {
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
                if (byteBufferAllocate.getInt(0) == f4754i) {
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
        zpg0.m220844a(str);
        return 0L;
    }
}
