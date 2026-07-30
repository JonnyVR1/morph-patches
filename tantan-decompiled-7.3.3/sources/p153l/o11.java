package p153l;

import android.annotation.TargetApi;
import android.os.SharedMemory;
import android.system.ErrnoException;
import androidx.annotation.VisibleForTesting;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(27)
public class o11 implements ppy, Closeable {

    /* JADX INFO: renamed from: a */
    public SharedMemory f144617a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f144618b;

    /* JADX INFO: renamed from: c */
    public final long f144619c;

    public o11(int i) {
        wn80.m207177b(Boolean.valueOf(i > 0));
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i);
            this.f144617a = sharedMemoryCreate;
            this.f144618b = sharedMemoryCreate.mapReadWrite();
            this.f144619c = System.identityHashCode(this);
        } catch (ErrnoException e) {
            vtq0.m202761a("Fail to create AshmemMemory", e);
            throw null;
        }
    }

    @Override // p153l.ppy
    /* JADX INFO: renamed from: b */
    public synchronized int mo8490b(int i, byte[] bArr, int i2, int i3) {
        int iM177473a;
        wn80.m207182g(bArr);
        wn80.m207182g(this.f144618b);
        iM177473a = qpy.m177473a(i, i3, getSize());
        qpy.m177474b(i, bArr.length, i2, iM177473a, getSize());
        this.f144618b.position(i);
        this.f144618b.put(bArr, i2, iM177473a);
        return iM177473a;
    }

    @Override // p153l.ppy, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.f144617a;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.f144618b;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.f144618b = null;
                this.f144617a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
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
                    m165575e(i, ppyVar, i2, i3);
                }
            }
        } else {
            synchronized (this) {
                synchronized (ppyVar) {
                    m165575e(i, ppyVar, i2, i3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m165575e(int i, ppy ppyVar, int i2, int i3) {
        if (!(ppyVar instanceof o11)) {
            wg3.m206174a("Cannot copy two incompatible MemoryChunks");
            return;
        }
        wn80.m207184i(!isClosed());
        wn80.m207184i(!ppyVar.isClosed());
        wn80.m207182g(this.f144618b);
        wn80.m207182g(ppyVar.getByteBuffer());
        qpy.m177474b(i, ppyVar.getSize(), i2, i3, getSize());
        this.f144618b.position(i);
        ppyVar.getByteBuffer().position(i2);
        byte[] bArr = new byte[i3];
        this.f144618b.get(bArr, 0, i3);
        ppyVar.getByteBuffer().put(bArr, 0, i3);
    }

    @Override // p153l.ppy
    public ByteBuffer getByteBuffer() {
        return this.f144618b;
    }

    @Override // p153l.ppy
    public int getSize() {
        wn80.m207182g(this.f144617a);
        return this.f144617a.getSize();
    }

    @Override // p153l.ppy
    public long getUniqueId() {
        return this.f144619c;
    }

    @Override // p153l.ppy
    public synchronized boolean isClosed() {
        return this.f144618b == null || this.f144617a == null;
    }

    @Override // p153l.ppy
    /* JADX INFO: renamed from: o */
    public long mo8492o() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // p153l.ppy
    /* JADX INFO: renamed from: p */
    public synchronized int mo8493p(int i, byte[] bArr, int i2, int i3) {
        int iM177473a;
        wn80.m207182g(bArr);
        wn80.m207182g(this.f144618b);
        iM177473a = qpy.m177473a(i, i3, getSize());
        qpy.m177474b(i, bArr.length, i2, iM177473a, getSize());
        this.f144618b.position(i);
        this.f144618b.get(bArr, i2, iM177473a);
        return iM177473a;
    }

    @Override // p153l.ppy
    /* JADX INFO: renamed from: r */
    public synchronized byte mo8494r(int i) {
        boolean z = true;
        wn80.m207184i(!isClosed());
        wn80.m207177b(Boolean.valueOf(i >= 0));
        if (i >= getSize()) {
            z = false;
        }
        wn80.m207177b(Boolean.valueOf(z));
        wn80.m207182g(this.f144618b);
        return this.f144618b.get(i);
    }

    @VisibleForTesting
    public o11() {
        this.f144617a = null;
        this.f144618b = null;
        this.f144619c = System.identityHashCode(this);
    }
}
