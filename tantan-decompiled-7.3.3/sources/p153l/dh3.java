package p153l;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class dh3 implements ppy, Closeable {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f88414a;

    /* JADX INFO: renamed from: b */
    public final int f88415b;

    /* JADX INFO: renamed from: c */
    public final long f88416c = System.identityHashCode(this);

    public dh3(int i) {
        this.f88414a = ByteBuffer.allocateDirect(i);
        this.f88415b = i;
    }

    /* JADX INFO: renamed from: e */
    private void m115782e(int i, ppy ppyVar, int i2, int i3) {
        if (!(ppyVar instanceof dh3)) {
            wg3.m206174a("Cannot copy two incompatible MemoryChunks");
            return;
        }
        wn80.m207184i(!isClosed());
        wn80.m207184i(!ppyVar.isClosed());
        wn80.m207182g(this.f88414a);
        qpy.m177474b(i, ppyVar.getSize(), i2, i3, this.f88415b);
        this.f88414a.position(i);
        ByteBuffer byteBuffer = (ByteBuffer) wn80.m207182g(ppyVar.getByteBuffer());
        byteBuffer.position(i2);
        byte[] bArr = new byte[i3];
        this.f88414a.get(bArr, 0, i3);
        byteBuffer.put(bArr, 0, i3);
    }

    @Override // p153l.ppy
    /* JADX INFO: renamed from: b */
    public synchronized int mo8490b(int i, byte[] bArr, int i2, int i3) {
        int iM177473a;
        wn80.m207182g(bArr);
        wn80.m207184i(!isClosed());
        wn80.m207182g(this.f88414a);
        iM177473a = qpy.m177473a(i, i3, this.f88415b);
        qpy.m177474b(i, bArr.length, i2, iM177473a, this.f88415b);
        this.f88414a.position(i);
        this.f88414a.put(bArr, i2, iM177473a);
        return iM177473a;
    }

    @Override // p153l.ppy, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f88414a = null;
    }

    @Override // p153l.ppy
    /* JADX INFO: renamed from: d */
    public void mo8491d(int i, ppy ppyVar, int i2, int i3) {
        wn80.m207182g(ppyVar);
        if (ppyVar.getUniqueId() == getUniqueId()) {
            Long.toHexString(getUniqueId());
            Long.toHexString(ppyVar.getUniqueId());
            wn80.m207177b(Boolean.FALSE);
        }
        if (ppyVar.getUniqueId() < getUniqueId()) {
            synchronized (ppyVar) {
                synchronized (this) {
                    m115782e(i, ppyVar, i2, i3);
                }
            }
        } else {
            synchronized (this) {
                synchronized (ppyVar) {
                    m115782e(i, ppyVar, i2, i3);
                }
            }
        }
    }

    @Override // p153l.ppy
    public synchronized ByteBuffer getByteBuffer() {
        return this.f88414a;
    }

    @Override // p153l.ppy
    public int getSize() {
        return this.f88415b;
    }

    @Override // p153l.ppy
    public long getUniqueId() {
        return this.f88416c;
    }

    @Override // p153l.ppy
    public synchronized boolean isClosed() {
        return this.f88414a == null;
    }

    @Override // p153l.ppy
    /* JADX INFO: renamed from: o */
    public long mo8492o() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // p153l.ppy
    /* JADX INFO: renamed from: p */
    public synchronized int mo8493p(int i, byte[] bArr, int i2, int i3) {
        int iM177473a;
        wn80.m207182g(bArr);
        wn80.m207184i(!isClosed());
        wn80.m207182g(this.f88414a);
        iM177473a = qpy.m177473a(i, i3, this.f88415b);
        qpy.m177474b(i, bArr.length, i2, iM177473a, this.f88415b);
        this.f88414a.position(i);
        this.f88414a.get(bArr, i2, iM177473a);
        return iM177473a;
    }

    @Override // p153l.ppy
    /* JADX INFO: renamed from: r */
    public synchronized byte mo8494r(int i) {
        boolean z = true;
        wn80.m207184i(!isClosed());
        wn80.m207177b(Boolean.valueOf(i >= 0));
        if (i >= this.f88415b) {
            z = false;
        }
        wn80.m207177b(Boolean.valueOf(z));
        wn80.m207182g(this.f88414a);
        return this.f88414a.get(i);
    }
}
