package p149l;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class pg3 implements sgy, Closeable {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f148609a;

    /* JADX INFO: renamed from: b */
    public final int f148610b;

    /* JADX INFO: renamed from: c */
    public final long f148611c = System.identityHashCode(this);

    public pg3(int i) {
        this.f148609a = ByteBuffer.allocateDirect(i);
        this.f148610b = i;
    }

    /* JADX INFO: renamed from: e */
    private void m168661e(int i, sgy sgyVar, int i2, int i3) {
        if (!(sgyVar instanceof pg3)) {
            ig3.m135964a("Cannot copy two incompatible MemoryChunks");
            return;
        }
        rf80.m179118i(!isClosed());
        rf80.m179118i(!sgyVar.isClosed());
        rf80.m179116g(this.f148609a);
        tgy.m188834b(i, sgyVar.getSize(), i2, i3, this.f148610b);
        this.f148609a.position(i);
        ByteBuffer byteBuffer = (ByteBuffer) rf80.m179116g(sgyVar.getByteBuffer());
        byteBuffer.position(i2);
        byte[] bArr = new byte[i3];
        this.f148609a.get(bArr, 0, i3);
        byteBuffer.put(bArr, 0, i3);
    }

    @Override // p149l.sgy
    /* JADX INFO: renamed from: b */
    public synchronized int mo8436b(int i, byte[] bArr, int i2, int i3) {
        int iM188833a;
        rf80.m179116g(bArr);
        rf80.m179118i(!isClosed());
        rf80.m179116g(this.f148609a);
        iM188833a = tgy.m188833a(i, i3, this.f148610b);
        tgy.m188834b(i, bArr.length, i2, iM188833a, this.f148610b);
        this.f148609a.position(i);
        this.f148609a.put(bArr, i2, iM188833a);
        return iM188833a;
    }

    @Override // p149l.sgy, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f148609a = null;
    }

    @Override // p149l.sgy
    /* JADX INFO: renamed from: d */
    public void mo8437d(int i, sgy sgyVar, int i2, int i3) {
        rf80.m179116g(sgyVar);
        if (sgyVar.getUniqueId() == getUniqueId()) {
            Long.toHexString(getUniqueId());
            Long.toHexString(sgyVar.getUniqueId());
            rf80.m179111b(Boolean.FALSE);
        }
        if (sgyVar.getUniqueId() < getUniqueId()) {
            synchronized (sgyVar) {
                synchronized (this) {
                    m168661e(i, sgyVar, i2, i3);
                }
            }
        } else {
            synchronized (this) {
                synchronized (sgyVar) {
                    m168661e(i, sgyVar, i2, i3);
                }
            }
        }
    }

    @Override // p149l.sgy
    public synchronized ByteBuffer getByteBuffer() {
        return this.f148609a;
    }

    @Override // p149l.sgy
    public int getSize() {
        return this.f148610b;
    }

    @Override // p149l.sgy
    public long getUniqueId() {
        return this.f148611c;
    }

    @Override // p149l.sgy
    public synchronized boolean isClosed() {
        return this.f148609a == null;
    }

    @Override // p149l.sgy
    /* JADX INFO: renamed from: o */
    public long mo8438o() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // p149l.sgy
    /* JADX INFO: renamed from: p */
    public synchronized int mo8439p(int i, byte[] bArr, int i2, int i3) {
        int iM188833a;
        rf80.m179116g(bArr);
        rf80.m179118i(!isClosed());
        rf80.m179116g(this.f148609a);
        iM188833a = tgy.m188833a(i, i3, this.f148610b);
        tgy.m188834b(i, bArr.length, i2, iM188833a, this.f148610b);
        this.f148609a.position(i);
        this.f148609a.get(bArr, i2, iM188833a);
        return iM188833a;
    }

    @Override // p149l.sgy
    /* JADX INFO: renamed from: r */
    public synchronized byte mo8440r(int i) {
        boolean z = true;
        rf80.m179118i(!isClosed());
        rf80.m179111b(Boolean.valueOf(i >= 0));
        if (i >= this.f148610b) {
            z = false;
        }
        rf80.m179111b(Boolean.valueOf(z));
        rf80.m179116g(this.f148609a);
        return this.f148609a.get(i);
    }
}
