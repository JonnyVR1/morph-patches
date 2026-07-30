package p149l;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.memory.PooledByteBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class chy implements PooledByteBuffer {

    /* JADX INFO: renamed from: a */
    public final int f81021a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public fa5<sgy> f81022b;

    public chy(fa5<sgy> fa5Var, int i) {
        rf80.m179116g(fa5Var);
        rf80.m179111b(Boolean.valueOf(i >= 0 && i <= fa5Var.m120155B().getSize()));
        this.f81022b = fa5Var.clone();
        this.f81021a = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        fa5.m120154v(this.f81022b);
        this.f81022b = null;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized ByteBuffer getByteBuffer() {
        rf80.m179116g(this.f81022b);
        return this.f81022b.m120155B().getByteBuffer();
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized boolean isClosed() {
        return !fa5.m120144Q(this.f81022b);
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m107027k() {
        if (isClosed()) {
            throw new PooledByteBuffer.ClosedException();
        }
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    /* JADX INFO: renamed from: o */
    public synchronized long mo8155o() throws UnsupportedOperationException {
        m107027k();
        rf80.m179116g(this.f81022b);
        return this.f81022b.m120155B().mo8438o();
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    /* JADX INFO: renamed from: p */
    public synchronized int mo8156p(int i, byte[] bArr, int i2, int i3) {
        m107027k();
        rf80.m179111b(Boolean.valueOf(i + i3 <= this.f81021a));
        rf80.m179116g(this.f81022b);
        return this.f81022b.m120155B().mo8439p(i, bArr, i2, i3);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    /* JADX INFO: renamed from: r */
    public synchronized byte mo8157r(int i) {
        m107027k();
        rf80.m179111b(Boolean.valueOf(i >= 0));
        rf80.m179111b(Boolean.valueOf(i < this.f81021a));
        rf80.m179116g(this.f81022b);
        return this.f81022b.m120155B().mo8440r(i);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized int size() {
        m107027k();
        return this.f81021a;
    }
}
