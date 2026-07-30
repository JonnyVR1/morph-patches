package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import p149l.ab80;
import p149l.dmr;
import p149l.fa5;
import p149l.i5e;
import p149l.la5;
import p149l.oq3;
import p149l.qlp0;
import p149l.rf80;
import p149l.rlp0;
import p149l.spi0;

/* JADX INFO: loaded from: classes.dex */
@i5e
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: b */
    public static Method f6464b;

    /* JADX INFO: renamed from: a */
    public final qlp0 f6465a = rlp0.m179875i();

    @i5e
    public GingerbreadPurgeableDecoder() {
    }

    /* JADX INFO: renamed from: h */
    public static MemoryFile m8463h(fa5<PooledByteBuffer> fa5Var, int i, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        dmr dmrVar;
        ab80 ab80Var = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            ab80 ab80Var2 = new ab80(fa5Var.m120155B());
            try {
                dmrVar = new dmr(ab80Var2, i);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    oq3.m165401a(dmrVar, outputStream2);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    fa5.m120154v(fa5Var);
                    la5.m149128b(ab80Var2);
                    la5.m149128b(dmrVar);
                    la5.m149127a(outputStream2, true);
                    return memoryFile;
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    ab80Var = ab80Var2;
                    fa5.m120154v(fa5Var);
                    la5.m149128b(ab80Var);
                    la5.m149128b(dmrVar);
                    la5.m149127a(outputStream, true);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                dmrVar = null;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            dmrVar = null;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* JADX INFO: renamed from: c */
    public Bitmap mo8453c(fa5<PooledByteBuffer> fa5Var, BitmapFactory.Options options) {
        return m8464i(fa5Var, fa5Var.m120155B().size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* JADX INFO: renamed from: d */
    public Bitmap mo8454d(fa5<PooledByteBuffer> fa5Var, int i, BitmapFactory.Options options) {
        return m8464i(fa5Var, i, DalvikPurgeableDecoder.m8449e(fa5Var, i) ? null : DalvikPurgeableDecoder.EOI, options);
    }

    /* JADX INFO: renamed from: i */
    public final Bitmap m8464i(fa5<PooledByteBuffer> fa5Var, int i, byte[] bArr, BitmapFactory.Options options) throws Throwable {
        MemoryFile memoryFile = null;
        try {
            try {
                MemoryFile memoryFileM8463h = m8463h(fa5Var, i, bArr);
                try {
                    FileDescriptor fileDescriptorM8466k = m8466k(memoryFileM8463h);
                    qlp0 qlp0Var = this.f6465a;
                    if (qlp0Var == null) {
                        throw new IllegalStateException("WebpBitmapFactory is null");
                    }
                    Bitmap bitmap = (Bitmap) rf80.m179117h(qlp0Var.mo9251b(fileDescriptorM8466k, null, options), "BitmapFactory returned null");
                    if (memoryFileM8463h != null) {
                        memoryFileM8463h.close();
                    }
                    return bitmap;
                } catch (IOException e) {
                    e = e;
                    memoryFile = memoryFileM8463h;
                    throw spi0.m185369a(e);
                } catch (Throwable th) {
                    th = th;
                    memoryFile = memoryFileM8463h;
                    if (memoryFile != null) {
                        memoryFile.close();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized Method m8465j() {
        if (f6464b == null) {
            try {
                f6464b = MemoryFile.class.getDeclaredMethod("getFileDescriptor", null);
            } catch (Exception e) {
                throw spi0.m185369a(e);
            }
        }
        return f6464b;
    }

    /* JADX INFO: renamed from: k */
    public final FileDescriptor m8466k(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) rf80.m179116g(m8465j().invoke(memoryFile, null));
        } catch (Exception e) {
            throw spi0.m185369a(e);
        }
    }
}
