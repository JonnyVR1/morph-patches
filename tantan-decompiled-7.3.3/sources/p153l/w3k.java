package p153l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Ll/w3k;", "", "<init>", "()V", "", "array", "", "b", "([F)V", "", "attributeLocation", "c", "(I)V", "a", "[F", "()[F", "Ljava/nio/FloatBuffer;", "Ljava/nio/FloatBuffer;", "floatBuffer", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class w3k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final float[] array;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public FloatBuffer floatBuffer;

    public w3k() {
        float[] fArr = new float[8];
        this.array = fArr;
        FloatBuffer floatBufferPut = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
        floatBufferPut.getClass();
        this.floatBuffer = floatBufferPut;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final float[] getArray() {
        return this.array;
    }

    /* JADX INFO: renamed from: b */
    public final void m204769b(@NotNull float[] array) {
        array.getClass();
        this.floatBuffer.position(0);
        this.floatBuffer.put(array);
    }

    /* JADX INFO: renamed from: c */
    public final void m204770c(int attributeLocation) {
        this.floatBuffer.position(0);
        GLES20.glVertexAttribPointer(attributeLocation, 2, 5126, false, 0, (Buffer) this.floatBuffer);
        GLES20.glEnableVertexAttribArray(attributeLocation);
    }
}
