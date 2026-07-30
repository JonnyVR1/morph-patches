package p149l;

import androidx.annotation.VisibleForTesting;
import com.facebook.imagepipeline.memory.AbstractC1619b;
import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m87232d2 = {"Ll/dhy;", "Ll/za80;", "Lcom/facebook/imagepipeline/memory/b;", "pool", "Ll/cb80;", "pooledByteStreams", "<init>", "(Lcom/facebook/imagepipeline/memory/b;Ll/cb80;)V", "Ljava/io/InputStream;", "inputStream", "Ll/chy;", "g", "(Ljava/io/InputStream;)Ll/chy;", "", HttpHeaderValues.BYTES, RXScreenCaptureService.KEY_INDEX, "([B)Ll/chy;", "", "initialCapacity", "h", "(Ljava/io/InputStream;I)Ll/chy;", "Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;", "outputStream", "f", "(Ljava/io/InputStream;Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;)Ll/chy;", "j", "()Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;", "k", "(I)Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream;", "a", "Lcom/facebook/imagepipeline/memory/b;", "b", "Ll/cb80;", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class dhy implements za80 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC1619b pool;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final cb80 pooledByteStreams;

    public dhy(@NotNull AbstractC1619b abstractC1619b, @NotNull cb80 cb80Var) {
        abstractC1619b.getClass();
        cb80Var.getClass();
        this.pool = abstractC1619b;
        this.pooledByteStreams = cb80Var;
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: f */
    public final chy m111850f(@NotNull InputStream inputStream, @NotNull MemoryPooledByteBufferOutputStream outputStream) throws IOException {
        inputStream.getClass();
        outputStream.getClass();
        this.pooledByteStreams.m105972a(inputStream, outputStream);
        return outputStream.mo8431k();
    }

    @Override // p149l.za80
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public chy mo111845a(@NotNull InputStream inputStream) throws Throwable {
        inputStream.getClass();
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.pool, 0, 2, null);
        try {
            return m111850f(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // p149l.za80
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public chy mo111849e(@NotNull InputStream inputStream, int initialCapacity) throws Throwable {
        inputStream.getClass();
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.pool, initialCapacity);
        try {
            return m111850f(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // p149l.za80
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public chy mo111847c(@NotNull byte[] bytes) throws Throwable {
        bytes.getClass();
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.pool, bytes.length);
        try {
            try {
                memoryPooledByteBufferOutputStream.write(bytes, 0, bytes.length);
                chy chyVarMo8431k = memoryPooledByteBufferOutputStream.mo8431k();
                memoryPooledByteBufferOutputStream.close();
                return chyVarMo8431k;
            } catch (IOException e) {
                throw spi0.m185369a(e);
            }
        } catch (Throwable th) {
            memoryPooledByteBufferOutputStream.close();
            throw th;
        }
    }

    @Override // p149l.za80
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public MemoryPooledByteBufferOutputStream mo111846b() {
        return new MemoryPooledByteBufferOutputStream(this.pool, 0, 2, null);
    }

    @Override // p149l.za80
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public MemoryPooledByteBufferOutputStream mo111848d(int initialCapacity) {
        return new MemoryPooledByteBufferOutputStream(this.pool, initialCapacity);
    }
}
