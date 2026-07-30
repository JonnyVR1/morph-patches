package p153l;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.memory.PooledByteBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class zpy implements PooledByteBuffer {

    /* JADX INFO: renamed from: a */
    public final int f205546a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public fb5<ppy> f205547b;

    public zpy(fb5<ppy> fb5Var, int i) {
        wn80.m207182g(fb5Var);
        wn80.m207177b(Boolean.valueOf(i >= 0 && i <= fb5Var.m124875B().getSize()));
        this.f205547b = fb5Var.clone();
        this.f205546a = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        fb5.m124874v(this.f205547b);
        this.f205547b = null;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized ByteBuffer getByteBuffer() {
        wn80.m207182g(this.f205547b);
        return this.f205547b.m124875B().getByteBuffer();
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized boolean isClosed() {
        return !fb5.m124864Q(this.f205547b);
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m220933k() {
        if (isClosed()) {
            throw new PooledByteBuffer.ClosedException();
        }
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    /* JADX INFO: renamed from: o */
    public synchronized long mo8209o() throws UnsupportedOperationException {
        m220933k();
        wn80.m207182g(this.f205547b);
        return this.f205547b.m124875B().mo8492o();
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    /* JADX INFO: renamed from: p */
    public synchronized int mo8210p(int i, byte[] bArr, int i2, int i3) {
        m220933k();
        wn80.m207177b(Boolean.valueOf(i + i3 <= this.f205546a));
        wn80.m207182g(this.f205547b);
        return this.f205547b.m124875B().mo8493p(i, bArr, i2, i3);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    /* JADX INFO: renamed from: r */
    public synchronized byte mo8211r(int i) {
        m220933k();
        wn80.m207177b(Boolean.valueOf(i >= 0));
        wn80.m207177b(Boolean.valueOf(i < this.f205546a));
        wn80.m207182g(this.f205547b);
        return this.f205547b.m124875B().mo8494r(i);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized int size() {
        m220933k();
        return this.f205546a;
    }
}
