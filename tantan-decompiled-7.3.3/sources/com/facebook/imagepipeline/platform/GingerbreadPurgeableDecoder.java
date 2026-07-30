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
import p153l.eor;
import p153l.fb5;
import p153l.gj80;
import p153l.lb5;
import p153l.nr3;
import p153l.uup0;
import p153l.vup0;
import p153l.vyi0;
import p153l.w6e;
import p153l.wn80;

/* JADX INFO: loaded from: classes.dex */
@w6e
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: b */
    public static Method f6501b;

    /* JADX INFO: renamed from: a */
    public final uup0 f6502a = vup0.m202874i();

    @w6e
    public GingerbreadPurgeableDecoder() {
    }

    /* JADX INFO: renamed from: h */
    public static MemoryFile m8517h(fb5<PooledByteBuffer> fb5Var, int i, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        eor eorVar;
        gj80 gj80Var = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            gj80 gj80Var2 = new gj80(fb5Var.m124875B());
            try {
                eorVar = new eor(gj80Var2, i);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    nr3.m164440a(eorVar, outputStream2);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    fb5.m124874v(fb5Var);
                    lb5.m153575b(gj80Var2);
                    lb5.m153575b(eorVar);
                    lb5.m153574a(outputStream2, true);
                    return memoryFile;
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    gj80Var = gj80Var2;
                    fb5.m124874v(fb5Var);
                    lb5.m153575b(gj80Var);
                    lb5.m153575b(eorVar);
                    lb5.m153574a(outputStream, true);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                eorVar = null;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            eorVar = null;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* JADX INFO: renamed from: c */
    public Bitmap mo8507c(fb5<PooledByteBuffer> fb5Var, BitmapFactory.Options options) {
        return m8518i(fb5Var, fb5Var.m124875B().size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* JADX INFO: renamed from: d */
    public Bitmap mo8508d(fb5<PooledByteBuffer> fb5Var, int i, BitmapFactory.Options options) {
        return m8518i(fb5Var, i, DalvikPurgeableDecoder.m8503e(fb5Var, i) ? null : DalvikPurgeableDecoder.EOI, options);
    }

    /* JADX INFO: renamed from: i */
    public final Bitmap m8518i(fb5<PooledByteBuffer> fb5Var, int i, byte[] bArr, BitmapFactory.Options options) throws Throwable {
        MemoryFile memoryFile = null;
        try {
            try {
                MemoryFile memoryFileM8517h = m8517h(fb5Var, i, bArr);
                try {
                    FileDescriptor fileDescriptorM8520k = m8520k(memoryFileM8517h);
                    uup0 uup0Var = this.f6502a;
                    if (uup0Var == null) {
                        throw new IllegalStateException("WebpBitmapFactory is null");
                    }
                    Bitmap bitmap = (Bitmap) wn80.m207183h(uup0Var.mo9305b(fileDescriptorM8520k, null, options), "BitmapFactory returned null");
                    if (memoryFileM8517h != null) {
                        memoryFileM8517h.close();
                    }
                    return bitmap;
                } catch (IOException e) {
                    e = e;
                    memoryFile = memoryFileM8517h;
                    throw vyi0.m203997a(e);
                } catch (Throwable th) {
                    th = th;
                    memoryFile = memoryFileM8517h;
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
    public final synchronized Method m8519j() {
        if (f6501b == null) {
            try {
                f6501b = MemoryFile.class.getDeclaredMethod("getFileDescriptor", null);
            } catch (Exception e) {
                throw vyi0.m203997a(e);
            }
        }
        return f6501b;
    }

    /* JADX INFO: renamed from: k */
    public final FileDescriptor m8520k(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) wn80.m207182g(m8519j().invoke(memoryFile, null));
        } catch (Exception e) {
            throw vyi0.m203997a(e);
        }
    }
}
