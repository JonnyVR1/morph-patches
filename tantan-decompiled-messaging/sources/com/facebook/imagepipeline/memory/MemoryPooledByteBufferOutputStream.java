package com.facebook.imagepipeline.memory;

import androidx.annotation.VisibleForTesting;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.bb80;
import p149l.chy;
import p149l.fa5;
import p149l.qkq0;
import p149l.sgy;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001$B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m87232d2 = {"Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;", "Ll/bb80;", "Lcom/facebook/imagepipeline/memory/b;", "pool", "", "initialCapacity", "<init>", "(Lcom/facebook/imagepipeline/memory/b;I)V", "Ll/chy;", "q", "()Ll/chy;", "size", "()I", "oneByte", "", "write", "(I)V", "", "buffer", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "count", "([BII)V", "close", "()V", "newLength", "n", "m", "a", "Lcom/facebook/imagepipeline/memory/b;", "Ll/fa5;", "Ll/sgy;", "b", "Ll/fa5;", "bufRef", "c", "I", "InvalidStreamException", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class MemoryPooledByteBufferOutputStream extends bb80 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC1619b pool;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public fa5<sgy> bufRef;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int count;

    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0002j\u0002`\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream$InvalidStreamException;", "Lkotlin/RuntimeException;", "Ljava/lang/RuntimeException;", "<init>", "()V", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class InvalidStreamException extends RuntimeException {
        public InvalidStreamException() {
            super("OutputStream no longer valid");
        }
    }

    @JvmOverloads
    public MemoryPooledByteBufferOutputStream(@NotNull AbstractC1619b abstractC1619b, int i) {
        abstractC1619b.getClass();
        if (i <= 0) {
            qkq0.m175383a("Check failed.");
            throw null;
        }
        this.pool = abstractC1619b;
        this.count = 0;
        this.bufRef = fa5.m120147Y(abstractC1619b.get(i), abstractC1619b);
    }

    @Override // p149l.bb80, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        fa5.m120154v(this.bufRef);
        this.bufRef = null;
        this.count = -1;
        super.close();
    }

    /* JADX INFO: renamed from: m */
    public final void m8432m() {
        if (!fa5.m120144Q(this.bufRef)) {
            throw new InvalidStreamException();
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: n */
    public final void m8433n(int newLength) throws Throwable {
        m8432m();
        fa5<sgy> fa5Var = this.bufRef;
        if (fa5Var == null) {
            qkq0.m175383a("Required value was null.");
            return;
        }
        fa5Var.getClass();
        if (newLength <= fa5Var.m120155B().getSize()) {
            return;
        }
        sgy sgyVar = this.pool.get(newLength);
        sgyVar.getClass();
        sgy sgyVar2 = sgyVar;
        fa5<sgy> fa5Var2 = this.bufRef;
        if (fa5Var2 == null) {
            qkq0.m175383a("Required value was null.");
            return;
        }
        fa5Var2.getClass();
        fa5Var2.m120155B().mo8437d(0, sgyVar2, 0, this.count);
        fa5<sgy> fa5Var3 = this.bufRef;
        fa5Var3.getClass();
        fa5Var3.close();
        this.bufRef = fa5.m120147Y(sgyVar2, this.pool);
    }

    @Override // p149l.bb80
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public chy mo8431k() {
        m8432m();
        fa5<sgy> fa5Var = this.bufRef;
        if (fa5Var != null) {
            return new chy(fa5Var, this.count);
        }
        qkq0.m175383a("Required value was null.");
        return null;
    }

    @Override // p149l.bb80
    /* JADX INFO: renamed from: size, reason: from getter */
    public int getCount() {
        return this.count;
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] buffer, int offset, int count) throws Throwable {
        buffer.getClass();
        if (offset < 0 || count < 0 || offset + count > buffer.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + buffer.length + "; regionStart=" + offset + "; regionLength=" + count);
        }
        m8432m();
        m8433n(this.count + count);
        fa5<sgy> fa5Var = this.bufRef;
        if (fa5Var == null) {
            qkq0.m175383a("Required value was null.");
        } else {
            fa5Var.m120155B().mo8436b(this.count, buffer, offset, count);
            this.count += count;
        }
    }

    public /* synthetic */ MemoryPooledByteBufferOutputStream(AbstractC1619b abstractC1619b, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC1619b, (i2 & 2) != 0 ? abstractC1619b.m8447D() : i);
    }

    @Override // java.io.OutputStream
    public void write(int oneByte) throws IOException {
        write(new byte[]{(byte) oneByte});
    }
}
