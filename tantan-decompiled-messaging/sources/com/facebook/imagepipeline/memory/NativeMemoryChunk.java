package com.facebook.imagepipeline.memory;

import androidx.annotation.VisibleForTesting;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p149l.i5e;
import p149l.ig3;
import p149l.j620;
import p149l.rf80;
import p149l.sgy;
import p149l.tgy;

/* JADX INFO: loaded from: classes.dex */
@i5e
public class NativeMemoryChunk implements sgy, Closeable {
    private static final String TAG = "NativeMemoryChunk";
    private boolean mIsClosed;
    private final long mNativePtr;
    private final int mSize;

    static {
        j620.m139879d("imagepipeline");
    }

    public NativeMemoryChunk(int i) {
        rf80.m179111b(Boolean.valueOf(i > 0));
        this.mSize = i;
        this.mNativePtr = nativeAllocate(i);
        this.mIsClosed = false;
    }

    /* JADX INFO: renamed from: e */
    private void m8435e(int i, sgy sgyVar, int i2, int i3) {
        if (!(sgyVar instanceof NativeMemoryChunk)) {
            ig3.m135964a("Cannot copy two incompatible MemoryChunks");
            return;
        }
        rf80.m179118i(!isClosed());
        rf80.m179118i(!sgyVar.isClosed());
        tgy.m188834b(i, sgyVar.getSize(), i2, i3, this.mSize);
        nativeMemcpy(sgyVar.mo8438o() + ((long) i2), this.mNativePtr + ((long) i), i3);
    }

    @i5e
    private static native long nativeAllocate(int i);

    @i5e
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @i5e
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @i5e
    private static native void nativeFree(long j);

    @i5e
    private static native void nativeMemcpy(long j, long j2, int i);

    @i5e
    private static native byte nativeReadByte(long j);

    @Override // p149l.sgy
    /* JADX INFO: renamed from: b */
    public synchronized int mo8436b(int i, byte[] bArr, int i2, int i3) {
        int iM188833a;
        rf80.m179116g(bArr);
        rf80.m179118i(!isClosed());
        iM188833a = tgy.m188833a(i, i3, this.mSize);
        tgy.m188834b(i, bArr.length, i2, iM188833a, this.mSize);
        nativeCopyFromByteArray(this.mNativePtr + ((long) i), bArr, i2, iM188833a);
        return iM188833a;
    }

    @Override // p149l.sgy, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.mIsClosed) {
            this.mIsClosed = true;
            nativeFree(this.mNativePtr);
        }
    }

    @Override // p149l.sgy
    /* JADX INFO: renamed from: d */
    public void mo8437d(int i, sgy sgyVar, int i2, int i3) {
        rf80.m179116g(sgyVar);
        if (sgyVar.getUniqueId() == getUniqueId()) {
            Integer.toHexString(System.identityHashCode(this));
            Integer.toHexString(System.identityHashCode(sgyVar));
            Long.toHexString(this.mNativePtr);
            rf80.m179111b(Boolean.FALSE);
        }
        if (sgyVar.getUniqueId() < getUniqueId()) {
            synchronized (sgyVar) {
                synchronized (this) {
                    m8435e(i, sgyVar, i2, i3);
                }
            }
        } else {
            synchronized (this) {
                synchronized (sgyVar) {
                    m8435e(i, sgyVar, i2, i3);
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

    @Override // p149l.sgy
    public ByteBuffer getByteBuffer() {
        return null;
    }

    @Override // p149l.sgy
    public int getSize() {
        return this.mSize;
    }

    @Override // p149l.sgy
    public long getUniqueId() {
        return this.mNativePtr;
    }

    @Override // p149l.sgy
    public synchronized boolean isClosed() {
        return this.mIsClosed;
    }

    @Override // p149l.sgy
    /* JADX INFO: renamed from: o */
    public long mo8438o() {
        return this.mNativePtr;
    }

    @Override // p149l.sgy
    /* JADX INFO: renamed from: p */
    public synchronized int mo8439p(int i, byte[] bArr, int i2, int i3) {
        int iM188833a;
        rf80.m179116g(bArr);
        rf80.m179118i(!isClosed());
        iM188833a = tgy.m188833a(i, i3, this.mSize);
        tgy.m188834b(i, bArr.length, i2, iM188833a, this.mSize);
        nativeCopyToByteArray(this.mNativePtr + ((long) i), bArr, i2, iM188833a);
        return iM188833a;
    }

    @Override // p149l.sgy
    /* JADX INFO: renamed from: r */
    public synchronized byte mo8440r(int i) {
        boolean z = true;
        rf80.m179118i(!isClosed());
        rf80.m179111b(Boolean.valueOf(i >= 0));
        if (i >= this.mSize) {
            z = false;
        }
        rf80.m179111b(Boolean.valueOf(z));
        return nativeReadByte(this.mNativePtr + ((long) i));
    }

    @VisibleForTesting
    public NativeMemoryChunk() {
        this.mSize = 0;
        this.mNativePtr = 0L;
        this.mIsClosed = true;
    }
}
