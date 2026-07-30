package p153l;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class gj80 extends InputStream {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final PooledByteBuffer f104613a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public int f104614b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public int f104615c;

    public gj80(PooledByteBuffer pooledByteBuffer) {
        wn80.m207177b(Boolean.valueOf(!pooledByteBuffer.isClosed()));
        this.f104613a = (PooledByteBuffer) wn80.m207182g(pooledByteBuffer);
        this.f104614b = 0;
        this.f104615c = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f104613a.size() - this.f104614b;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f104615c = this.f104614b;
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
        this.f104613a.mo8210p(this.f104614b, bArr, i, iMin);
        this.f104614b += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f104614b = this.f104615c;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        wn80.m207177b(Boolean.valueOf(j >= 0));
        int iMin = Math.min((int) j, available());
        this.f104614b += iMin;
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
        PooledByteBuffer pooledByteBuffer = this.f104613a;
        int i = this.f104614b;
        this.f104614b = i + 1;
        return pooledByteBuffer.mo8211r(i) & 255;
    }
}
