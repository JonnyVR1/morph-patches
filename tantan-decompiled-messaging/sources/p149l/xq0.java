package p149l;

import android.graphics.Bitmap;
import java.io.Closeable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m87232d2 = {"Ll/xq0;", "Ljava/io/Closeable;", "", "frameNumber", "Ll/fa5;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(ILl/fa5;)V", "", "close", "()V", "a", "I", "m", "()I", "setFrameNumber", "(I)V", "b", "Ll/fa5;", "k", "()Ll/fa5;", "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class xq0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int frameNumber;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final fa5<Bitmap> bitmap;

    public xq0(int i, @NotNull fa5<Bitmap> fa5Var) {
        fa5Var.getClass();
        this.frameNumber = i;
        this.bitmap = fa5Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.bitmap.close();
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final fa5<Bitmap> m210539k() {
        return this.bitmap;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getFrameNumber() {
        return this.frameNumber;
    }
}
