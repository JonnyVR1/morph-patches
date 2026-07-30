package p153l;

import androidx.annotation.VisibleForTesting;
import com.facebook.imagepipeline.memory.AbstractC1642b;
import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m88121d2 = {"Ll/aqy;", "Ll/fj80;", "Lcom/facebook/imagepipeline/memory/b;", "pool", "Ll/ij80;", "pooledByteStreams", "<init>", "(Lcom/facebook/imagepipeline/memory/b;Ll/ij80;)V", "Ljava/io/InputStream;", "inputStream", "Ll/zpy;", "g", "(Ljava/io/InputStream;)Ll/zpy;", "", HttpHeaderValues.BYTES, RXScreenCaptureService.KEY_INDEX, "([B)Ll/zpy;", "", "initialCapacity", "h", "(Ljava/io/InputStream;I)Ll/zpy;", "Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;", "outputStream", "f", "(Ljava/io/InputStream;Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;)Ll/zpy;", "j", "()Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;", "k", "(I)Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;", "a", "Lcom/facebook/imagepipeline/memory/b;", "b", "Ll/ij80;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class aqy implements fj80 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC1642b pool;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ij80 pooledByteStreams;

    public aqy(@NotNull AbstractC1642b abstractC1642b, @NotNull ij80 ij80Var) {
        abstractC1642b.getClass();
        ij80Var.getClass();
        this.pool = abstractC1642b;
        this.pooledByteStreams = ij80Var;
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: f */
    public final zpy m99568f(@NotNull InputStream inputStream, @NotNull MemoryPooledByteBufferOutputStream outputStream) throws IOException {
        inputStream.getClass();
        outputStream.getClass();
        this.pooledByteStreams.m140188a(inputStream, outputStream);
        return outputStream.mo8485k();
    }

    @Override // p153l.fj80
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public zpy mo99563a(@NotNull InputStream inputStream) throws Throwable {
        inputStream.getClass();
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.pool, 0, 2, null);
        try {
            return m99568f(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // p153l.fj80
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public zpy mo99567e(@NotNull InputStream inputStream, int initialCapacity) throws Throwable {
        inputStream.getClass();
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.pool, initialCapacity);
        try {
            return m99568f(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // p153l.fj80
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public zpy mo99565c(@NotNull byte[] bytes) throws Throwable {
        bytes.getClass();
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.pool, bytes.length);
        try {
            try {
                memoryPooledByteBufferOutputStream.write(bytes, 0, bytes.length);
                zpy zpyVarMo8485k = memoryPooledByteBufferOutputStream.mo8485k();
                memoryPooledByteBufferOutputStream.close();
                return zpyVarMo8485k;
            } catch (IOException e) {
                throw vyi0.m203997a(e);
            }
        } catch (Throwable th) {
            memoryPooledByteBufferOutputStream.close();
            throw th;
        }
    }

    @Override // p153l.fj80
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public MemoryPooledByteBufferOutputStream mo99564b() {
        return new MemoryPooledByteBufferOutputStream(this.pool, 0, 2, null);
    }

    @Override // p153l.fj80
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public MemoryPooledByteBufferOutputStream mo99566d(int initialCapacity) {
        return new MemoryPooledByteBufferOutputStream(this.pool, initialCapacity);
    }
}
