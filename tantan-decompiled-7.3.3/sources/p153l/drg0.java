package p153l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class drg0 implements Closeable {
    private static final long[] MASKS = new long[64];
    private static final int MAXIMUM_CACHE_SIZE = 63;
    private long bitsCached = 0;
    private int bitsCachedSize = 0;
    private final ByteOrder byteOrder;

    /* JADX INFO: renamed from: in */
    private final ezg0 f90388in;

    static {
        for (int i = 1; i <= 63; i++) {
            long[] jArr = MASKS;
            jArr[i] = (jArr[i - 1] << 1) + 1;
        }
    }

    public drg0(InputStream inputStream, ByteOrder byteOrder) {
        this.f90388in = new ezg0(inputStream);
        this.byteOrder = byteOrder;
    }

    public void alignWithByteBoundary() {
        int i = this.bitsCachedSize;
        int i2 = i % 8;
        if (i2 > 0) {
            if (this.byteOrder == ByteOrder.LITTLE_ENDIAN) {
                long j = this.bitsCached;
                long j2 = MASKS[i2];
                this.bitsCached = j >>> i2;
            } else {
                long j3 = MASKS[i2];
            }
            this.bitsCachedSize = i - i2;
        }
    }

    public long bitsAvailable() {
        return (((long) this.f90388in.available()) * 8) + ((long) this.bitsCachedSize);
    }

    public int bitsCached() {
        return this.bitsCachedSize;
    }

    public void clearBitCache() {
        this.bitsCached = 0L;
        this.bitsCachedSize = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f90388in.close();
    }

    public long getBytesRead() {
        return this.f90388in.getBytesRead();
    }

    public long readBits(int i) {
        int i2;
        long j;
        long j2;
        if (i < 0 || i > 63) {
            wg3.m206174a("count must not be negative or greater than 63");
            return 0L;
        }
        while (true) {
            i2 = this.bitsCachedSize;
            if (i2 >= i || i2 >= 57) {
                break;
            }
            long j3 = this.f90388in.read();
            if (j3 < 0) {
                return -1L;
            }
            ByteOrder byteOrder = this.byteOrder;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            long j4 = this.bitsCached;
            if (byteOrder == byteOrder2) {
                this.bitsCached = (j3 << this.bitsCachedSize) | j4;
            } else {
                this.bitsCached = j3 | (j4 << 8);
            }
            this.bitsCachedSize += 8;
        }
        if (i2 >= i) {
            ByteOrder byteOrder3 = this.byteOrder;
            ByteOrder byteOrder4 = ByteOrder.LITTLE_ENDIAN;
            long j5 = this.bitsCached;
            if (byteOrder3 == byteOrder4) {
                j = j5 & MASKS[i];
                this.bitsCached = j5 >>> i;
            } else {
                j = (j5 >> (i2 - i)) & MASKS[i];
            }
            this.bitsCachedSize = i2 - i;
            return j;
        }
        int i3 = i - i2;
        int i4 = 8 - i3;
        long j6 = this.f90388in.read();
        if (j6 < 0) {
            return j6;
        }
        if (this.byteOrder == ByteOrder.LITTLE_ENDIAN) {
            long[] jArr = MASKS;
            this.bitsCached = ((jArr[i3] & j6) << this.bitsCachedSize) | this.bitsCached;
            j2 = (j6 >>> i3) & jArr[i4];
        } else {
            long j7 = this.bitsCached << i3;
            this.bitsCached = j7;
            long[] jArr2 = MASKS;
            this.bitsCached = j7 | ((j6 >>> i4) & jArr2[i3]);
            j2 = jArr2[i4] & j6;
        }
        long j8 = this.bitsCached & MASKS[i];
        this.bitsCached = j2;
        this.bitsCachedSize = i4;
        return j8;
    }
}
