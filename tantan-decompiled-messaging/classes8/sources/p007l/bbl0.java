package p007l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import kotlin.Metadata;
import l.upk0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J%\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u001a"}, d2 = {"Ll/bbl0;", "", "<init>", "()V", "", "b", "", "textId", "width", "height", "a", "(III)V", "I", "program", "positionAttr", "c", "texCoordinateAttr", "d", "texUniform", "Ljava/nio/FloatBuffer;", "e", "Ljava/nio/FloatBuffer;", "vertexCoordinateBuffer", "f", "textureCoordinateBuffer", "Companion", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class bbl0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int program;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int positionAttr;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int texCoordinateAttr;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int texUniform;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public FloatBuffer vertexCoordinateBuffer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public FloatBuffer textureCoordinateBuffer;

    public bbl0() {
        FloatBuffer floatBufferAllocate = FloatBuffer.allocate(0);
        floatBufferAllocate.getClass();
        this.vertexCoordinateBuffer = floatBufferAllocate;
        FloatBuffer floatBufferAllocate2 = FloatBuffer.allocate(0);
        floatBufferAllocate2.getClass();
        this.textureCoordinateBuffer = floatBufferAllocate2;
    }

    /* JADX INFO: renamed from: a */
    public final void m8617a(int textId, int width, int height) {
        ocj.INSTANCE.m10190b();
        GLES20.glViewport(0, 0, width, height);
        GLES20.glUseProgram(this.program);
        GLES20.glEnableVertexAttribArray(this.positionAttr);
        GLES20.glVertexAttribPointer(this.positionAttr, 2, 5126, false, 0, (Buffer) this.vertexCoordinateBuffer);
        GLES20.glEnableVertexAttribArray(this.texCoordinateAttr);
        GLES20.glVertexAttribPointer(this.texCoordinateAttr, 2, 5126, false, 0, (Buffer) this.textureCoordinateBuffer);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, textId);
        GLES20.glUniform1i(this.texUniform, 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.positionAttr);
        GLES20.glDisableVertexAttribArray(this.texCoordinateAttr);
        GLES20.glBindTexture(3553, 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m8618b() {
        ocj ocjVar = ocj.INSTANCE;
        int iM10191c = ocjVar.m10191c("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.program = iM10191c;
        if (iM10191c == 0) {
            upk0.a("Unable to create program");
            return;
        }
        this.positionAttr = GLES20.glGetAttribLocation(iM10191c, "position");
        this.texCoordinateAttr = GLES20.glGetAttribLocation(this.program, "inputTextureCoordinate");
        this.texUniform = GLES20.glGetUniformLocation(this.program, "inputImageTexture");
        this.vertexCoordinateBuffer = ocjVar.m10195g(ocj.VERTEX_COORDS);
        this.textureCoordinateBuffer = ocjVar.m10195g(ocj.TEXTURE_NO_ROTATION);
    }
}
