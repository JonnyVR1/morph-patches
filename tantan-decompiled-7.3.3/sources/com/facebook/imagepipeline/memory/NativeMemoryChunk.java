package com.facebook.imagepipeline.memory;

import androidx.annotation.VisibleForTesting;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p153l.ppy;
import p153l.qpy;
import p153l.re20;
import p153l.w6e;
import p153l.wg3;
import p153l.wn80;

/* JADX INFO: loaded from: classes.dex */
@w6e
public class NativeMemoryChunk implements ppy, Closeable {
    private static final String TAG = "NativeMemoryChunk";
    private boolean mIsClosed;
    private final long mNativePtr;
    private final int mSize;

    static {
        re20.m180963d("imagepipeline");
    }

    public NativeMemoryChunk(int i) {
        wn80.m207177b(Boolean.valueOf(i > 0));
        this.mSize = i;
        this.mNativePtr = nativeAllocate(i);
        this.mIsClosed = false;
    }

    /* JADX INFO: renamed from: e */
    private void m8489e(int i, ppy ppyVar, int i2, int i3) {
        if (!(ppyVar instanceof NativeMemoryChunk)) {
            wg3.m206174a("Cannot copy two incompatible MemoryChunks");
            return;
        }
        wn80.m207184i(!isClosed());
        wn80.m207184i(!ppyVar.isClosed());
        qpy.m177474b(i, ppyVar.getSize(), i2, i3, this.mSize);
        nativeMemcpy(ppyVar.mo8492o() + ((long) i2), this.mNativePtr + ((long) i), i3);
    }

    @w6e
    private static native long nativeAllocate(int i);

    @w6e
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @w6e
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @w6e
    private static native void nativeFree(long j);

    @w6e
    private static native void nativeMemcpy(long j, long j2, int i);

    @w6e
    private static native byte nativeReadByte(long j);

    @Override // p153l.ppy
    /* JADX INFO: renamed from: b */
    public synchronized int mo8490b(int i, byte[] bArr, int i2, int i3) {
        int iM177473a;
        wn80.m207182g(bArr);
        wn80.m207184i(!isClosed());
        iM177473a = qpy.m177473a(i, i3, this.mSize);
        qpy.m177474b(i, bArr.length, i2, iM177473a, this.mSize);
        nativeCopyFromByteArray(this.mNativePtr + ((long) i), bArr, i2, iM177473a);
        return iM177473a;
    }

    @Override // p153l.ppy, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.mIsClosed) {
            this.mIsClosed = true;
            nativeFree(this.mNativePtr);
        }
    }

    @Override // p153l.ppy
    /* JADX INFO: renamed from: d */
    public void mo8491d(int i, ppy ppyVar, int i2, int i3) {
        wn80.m207182g(ppyVar);
        if (ppyVar.getUniqueId() == getUniqueId()) {
            Integer.toHexString(System.identityHashCode(this));
            Integer.toHexString(System.identityHashCode(ppyVar));
            Long.toHexString(this.mNativePtr);
            wn80.m207177b(Boolean.FALSE);
        }
        if (ppyVar.getUniqueId() < getUniqueId()) {
            synchronized (ppyVar) {
                synchronized (this) {
                    m8489e(i, ppyVar, i2, i3);
                }
            }
        } else {
            synchronized (this) {
                synchronized (ppyVar) {
                    m8489e(i, ppyVar, i2, i3);
                }
            }
        }
    }

    public void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Integer.toHexString(System.identityHashCode(this));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // p153l.ppy
    public ByteBuffer getByteBuffer() {
        return null;
    }

    @Override // p153l.ppy
    public int getSize() {
        return this.mSize;
    }

    @Override // p153l.ppy
    public long getUniqueId() {
        return this.mNativePtr;
    }

    @Override // p153l.ppy
    public synchronized boolean isClosed() {
        return this.mIsClosed;
    }

    @Override // p153l.ppy
    /* JADX INFO: renamed from: o */
    public long mo8492o() {
        return this.mNativePtr;
    }

    @Override // p153l.ppy
    /* JADX INFO: renamed from: p */
    public synchronized int mo8493p(int i, byte[] bArr, int i2, int i3) {
        int iM177473a;
        wn80.m207182g(bArr);
        wn80.m207184i(!isClosed());
        iM177473a = qpy.m177473a(i, i3, this.mSize);
        qpy.m177474b(i, bArr.length, i2, iM177473a, this.mSize);
        nativeCopyToByteArray(this.mNativePtr + ((long) i), bArr, i2, iM177473a);
        return iM177473a;
    }

    @Override // p153l.ppy
    /* JADX INFO: renamed from: r */
    public synchronized byte mo8494r(int i) {
        boolean z = true;
        wn80.m207184i(!isClosed());
        wn80.m207177b(Boolean.valueOf(i >= 0));
        if (i >= this.mSize) {
            z = false;
        }
        wn80.m207177b(Boolean.valueOf(z));
        return nativeReadByte(this.mNativePtr + ((long) i));
    }

    @VisibleForTesting
    public NativeMemoryChunk() {
        this.mSize = 0;
        this.mNativePtr = 0L;
        this.mIsClosed = true;
    }
}
