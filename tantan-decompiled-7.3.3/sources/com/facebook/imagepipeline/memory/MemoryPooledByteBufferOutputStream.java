package com.facebook.imagepipeline.memory;

import androidx.annotation.VisibleForTesting;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.fb5;
import p153l.hj80;
import p153l.ppy;
import p153l.wtq0;
import p153l.zpy;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001$B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m88121d2 = {"Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;", "Ll/hj80;", "Lcom/facebook/imagepipeline/memory/b;", "pool", "", "initialCapacity", "<init>", "(Lcom/facebook/imagepipeline/memory/b;I)V", "Ll/zpy;", "q", "()Ll/zpy;", "size", "()I", "oneByte", "", "write", "(I)V", "", "buffer", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "count", "([BII)V", "close", "()V", "newLength", "n", "m", "a", "Lcom/facebook/imagepipeline/memory/b;", "Ll/fb5;", "Ll/ppy;", "b", "Ll/fb5;", "bufRef", "c", "I", "InvalidStreamException", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class MemoryPooledByteBufferOutputStream extends hj80 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC1642b pool;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public fb5<ppy> bufRef;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int count;

    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0002j\u0002`\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream$InvalidStreamException;", "Lkotlin/RuntimeException;", "Ljava/lang/RuntimeException;", "<init>", "()V", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class InvalidStreamException extends RuntimeException {
        public InvalidStreamException() {
            super("OutputStream no longer valid");
        }
    }

    @JvmOverloads
    public MemoryPooledByteBufferOutputStream(@NotNull AbstractC1642b abstractC1642b, int i) {
        abstractC1642b.getClass();
        if (i <= 0) {
            wtq0.m207906a("Check failed.");
            throw null;
        }
        this.pool = abstractC1642b;
        this.count = 0;
        this.bufRef = fb5.m124867Z(abstractC1642b.get(i), abstractC1642b);
    }

    @Override // p153l.hj80, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        fb5.m124874v(this.bufRef);
        this.bufRef = null;
        this.count = -1;
        super.close();
    }

    /* JADX INFO: renamed from: m */
    public final void m8486m() {
        if (!fb5.m124864Q(this.bufRef)) {
            throw new InvalidStreamException();
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: n */
    public final void m8487n(int newLength) throws Throwable {
        m8486m();
        fb5<ppy> fb5Var = this.bufRef;
        if (fb5Var == null) {
            wtq0.m207906a("Required value was null.");
            return;
        }
        fb5Var.getClass();
        if (newLength <= fb5Var.m124875B().getSize()) {
            return;
        }
        ppy ppyVar = this.pool.get(newLength);
        ppyVar.getClass();
        ppy ppyVar2 = ppyVar;
        fb5<ppy> fb5Var2 = this.bufRef;
        if (fb5Var2 == null) {
            wtq0.m207906a("Required value was null.");
            return;
        }
        fb5Var2.getClass();
        fb5Var2.m124875B().mo8491d(0, ppyVar2, 0, this.count);
        fb5<ppy> fb5Var3 = this.bufRef;
        fb5Var3.getClass();
        fb5Var3.close();
        this.bufRef = fb5.m124867Z(ppyVar2, this.pool);
    }

    @Override // p153l.hj80
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public zpy mo8485k() {
        m8486m();
        fb5<ppy> fb5Var = this.bufRef;
        if (fb5Var != null) {
            return new zpy(fb5Var, this.count);
        }
        wtq0.m207906a("Required value was null.");
        return null;
    }

    @Override // p153l.hj80
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
        m8486m();
        m8487n(this.count + count);
        fb5<ppy> fb5Var = this.bufRef;
        if (fb5Var == null) {
            wtq0.m207906a("Required value was null.");
        } else {
            fb5Var.m124875B().mo8490b(this.count, buffer, offset, count);
            this.count += count;
        }
    }

    public /* synthetic */ MemoryPooledByteBufferOutputStream(AbstractC1642b abstractC1642b, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC1642b, (i2 & 2) != 0 ? abstractC1642b.m8501D() : i);
    }

    @Override // java.io.OutputStream
    public void write(int oneByte) throws IOException {
        write(new byte[]{(byte) oneByte});
    }
}
