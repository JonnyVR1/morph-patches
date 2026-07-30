package p149l;

import android.annotation.TargetApi;
import android.os.SharedMemory;
import android.system.ErrnoException;
import androidx.annotation.VisibleForTesting;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(27)
public class h11 implements sgy, Closeable {

    /* JADX INFO: renamed from: a */
    public SharedMemory f105271a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f105272b;

    /* JADX INFO: renamed from: c */
    public final long f105273c;

    public h11(int i) {
        rf80.m179111b(Boolean.valueOf(i > 0));
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i);
            this.f105271a = sharedMemoryCreate;
            this.f105272b = sharedMemoryCreate.mapReadWrite();
            this.f105273c = System.identityHashCode(this);
        } catch (ErrnoException e) {
            pkq0.m170054a("Fail to create AshmemMemory", e);
            throw null;
        }
    }

    @Override // p149l.sgy
    /* JADX INFO: renamed from: b */
    public synchronized int mo8436b(int i, byte[] bArr, int i2, int i3) {
        int iM188833a;
        rf80.m179116g(bArr);
        rf80.m179116g(this.f105272b);
        iM188833a = tgy.m188833a(i, i3, getSize());
        tgy.m188834b(i, bArr.length, i2, iM188833a, getSize());
        this.f105272b.position(i);
        this.f105272b.put(bArr, i2, iM188833a);
        return iM188833a;
    }

    @Override // p149l.sgy, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.f105271a;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.f105272b;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.f105272b = null;
                this.f105271a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
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
                    m129002e(i, sgyVar, i2, i3);
                }
            }
        } else {
            synchronized (this) {
                synchronized (sgyVar) {
                    m129002e(i, sgyVar, i2, i3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m129002e(int i, sgy sgyVar, int i2, int i3) {
        if (!(sgyVar instanceof h11)) {
            ig3.m135964a("Cannot copy two incompatible MemoryChunks");
            return;
        }
        rf80.m179118i(!isClosed());
        rf80.m179118i(!sgyVar.isClosed());
        rf80.m179116g(this.f105272b);
        rf80.m179116g(sgyVar.getByteBuffer());
        tgy.m188834b(i, sgyVar.getSize(), i2, i3, getSize());
        this.f105272b.position(i);
        sgyVar.getByteBuffer().position(i2);
        byte[] bArr = new byte[i3];
        this.f105272b.get(bArr, 0, i3);
        sgyVar.getByteBuffer().put(bArr, 0, i3);
    }

    @Override // p149l.sgy
    public ByteBuffer getByteBuffer() {
        return this.f105272b;
    }

    @Override // p149l.sgy
    public int getSize() {
        rf80.m179116g(this.f105271a);
        return this.f105271a.getSize();
    }

    @Override // p149l.sgy
    public long getUniqueId() {
        return this.f105273c;
    }

    @Override // p149l.sgy
    public synchronized boolean isClosed() {
        return this.f105272b == null || this.f105271a == null;
    }

    @Override // p149l.sgy
    /* JADX INFO: renamed from: o */
    public long mo8438o() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // p149l.sgy
    /* JADX INFO: renamed from: p */
    public synchronized int mo8439p(int i, byte[] bArr, int i2, int i3) {
        int iM188833a;
        rf80.m179116g(bArr);
        rf80.m179116g(this.f105272b);
        iM188833a = tgy.m188833a(i, i3, getSize());
        tgy.m188834b(i, bArr.length, i2, iM188833a, getSize());
        this.f105272b.position(i);
        this.f105272b.get(bArr, i2, iM188833a);
        return iM188833a;
    }

    @Override // p149l.sgy
    /* JADX INFO: renamed from: r */
    public synchronized byte mo8440r(int i) {
        boolean z = true;
        rf80.m179118i(!isClosed());
        rf80.m179111b(Boolean.valueOf(i >= 0));
        if (i >= getSize()) {
            z = false;
        }
        rf80.m179111b(Boolean.valueOf(z));
        rf80.m179116g(this.f105272b);
        return this.f105272b.get(i);
    }

    @VisibleForTesting
    public h11() {
        this.f105271a = null;
        this.f105272b = null;
        this.f105273c = System.identityHashCode(this);
    }
}
