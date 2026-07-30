package p149l;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class ab80 extends InputStream {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final PooledByteBuffer f68634a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public int f68635b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public int f68636c;

    public ab80(PooledByteBuffer pooledByteBuffer) {
        rf80.m179111b(Boolean.valueOf(!pooledByteBuffer.isClosed()));
        this.f68634a = (PooledByteBuffer) rf80.m179116g(pooledByteBuffer);
        this.f68635b = 0;
        this.f68636c = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f68634a.size() - this.f68635b;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f68636c = this.f68635b;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        int iAvailable = available();
        if (iAvailable <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int iMin = Math.min(iAvailable, i2);
        this.f68634a.mo8156p(this.f68635b, bArr, i, iMin);
        this.f68635b += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f68635b = this.f68636c;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        rf80.m179111b(Boolean.valueOf(j >= 0));
        int iMin = Math.min((int) j, available());
        this.f68635b += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        PooledByteBuffer pooledByteBuffer = this.f68634a;
        int i = this.f68635b;
        this.f68635b = i + 1;
        return pooledByteBuffer.mo8157r(i) & 255;
    }
}
