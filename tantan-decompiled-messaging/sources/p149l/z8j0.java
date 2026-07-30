package p149l;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.OMSSizeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\rR\"\u0010\u0018\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%¨\u0006)"}, m87232d2 = {"Ll/z8j0;", "Ll/y8j0;", "Ll/w7j0;", "transition", "<init>", "(Ll/w7j0;)V", "", "textureStart", "textureEnd", "", BaseSei.f13932Z, "(II)V", "E", "()V", "D", "A", "F", "", "p", "Ljava/lang/String;", "B", "()Ljava/lang/String;", "setFragmentShader", "(Ljava/lang/String;)V", "fragmentShader", "", "q", "getProgress", "()F", b2s.C_ZONE, "(F)V", "progress", "r", "I", "program", "Ljava/nio/FloatBuffer;", BLiveStormDanmakuGiftResourceType.f44446s, "Ljava/nio/FloatBuffer;", "vertexCoordsBuffer", Constants.KEY_T, "textureCoordsBuffer", "android_release"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class z8j0 extends y8j0 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public String fragmentShader;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public float progress;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public int program;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public FloatBuffer vertexCoordsBuffer;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public FloatBuffer textureCoordsBuffer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8j0(@NotNull w7j0 w7j0Var) {
        super(null, null, 3, null);
        w7j0Var.getClass();
        this.fragmentShader = "\nprecision mediump float;\n\nuniform sampler2D texture1;\nuniform sampler2D texture2;\n\nuniform float progress;\nuniform float ratio;\n\nvarying vec2 texCoord;\n\nvec4 getFromColor(vec2 uv) {\n  return texture2D(texture1, uv);\n}\n\nvec4 getToColor(vec2 uv) {\n  return texture2D(texture2, uv);\n}\n\nvec4 transition(vec2 uv);\n\nvoid main() {\n  gl_FragColor = transition(texCoord);\n}\n        \n" + w7j0Var.getSource();
        FloatBuffer floatBufferAllocate = FloatBuffer.allocate(0);
        floatBufferAllocate.getClass();
        this.vertexCoordsBuffer = floatBufferAllocate;
        FloatBuffer floatBufferAllocate2 = FloatBuffer.allocate(0);
        floatBufferAllocate2.getClass();
        this.textureCoordsBuffer = floatBufferAllocate2;
    }

    /* JADX INFO: renamed from: A */
    public final void m217602A() {
        GLES20.glEnableVertexAttribArray(getPositionAttr());
        GLES20.glVertexAttribPointer(getPositionAttr(), 2, 5126, false, 0, (Buffer) this.vertexCoordsBuffer);
        GLES20.glEnableVertexAttribArray(getTextureCoordinateAttr());
        GLES20.glVertexAttribPointer(getTextureCoordinateAttr(), 2, 5126, false, 0, (Buffer) this.textureCoordsBuffer);
    }

    @NotNull
    /* JADX INFO: renamed from: B, reason: from getter */
    public String getFragmentShader() {
        return this.fragmentShader;
    }

    /* JADX INFO: renamed from: C */
    public final void m217604C(float f) {
        this.progress = f;
    }

    /* JADX INFO: renamed from: D */
    public final void m217605D() {
        m213400t(GLES20.glGetAttribLocation(this.program, "vPosition"));
        m213405y(GLES20.glGetAttribLocation(this.program, "vTextureCoordinate"));
        m213399s(GLES20.glGetUniformLocation(this.program, "mvpMatrix"));
        m213397q(GLES20.glGetUniformLocation(this.program, "flipX"));
        m213398r(GLES20.glGetUniformLocation(this.program, "flipY"));
        m213402v(GLES20.glGetUniformLocation(this.program, OMSSizeType.ratio));
        m213403w(GLES20.glGetUniformLocation(this.program, "texture1"));
        m213404x(GLES20.glGetUniformLocation(this.program, "texture2"));
        m213401u(GLES20.glGetUniformLocation(this.program, "progress"));
        ocj ocjVar = ocj.INSTANCE;
        this.vertexCoordsBuffer = ocjVar.m163530g(ocj.VERTEX_COORDS);
        this.textureCoordsBuffer = ocjVar.m163530g(ocj.TEXTURE_NO_ROTATION);
        m213396p(true);
        Matrix.setIdentityM(getMvpMatrix(), 0);
    }

    /* JADX INFO: renamed from: E */
    public final void m217606E() {
        this.program = ocj.INSTANCE.m163526c(getVertexShader(), getFragmentShader());
    }

    /* JADX INFO: renamed from: F */
    public final void m217607F() {
        GLES20.glUniform1i(getFlipXUniform(), getFlipX());
        GLES20.glUniform1i(getFlipYUniform(), getFlipY());
        GLES20.glUniformMatrix4fv(getMvpMatrixUniform(), 1, false, getMvpMatrix(), 0);
        GLES20.glUniform1f(getRatioUniform(), getCom.p1.mobile.putong.data.OMSSizeType.ratio java.lang.String());
        GLES20.glUniform1f(getProgressUniform(), this.progress);
    }

    /* JADX INFO: renamed from: z */
    public void m217608z(int textureStart, int textureEnd) {
        vek0.m198203c("textureStart：" + textureStart + ", textureEnd：" + textureEnd);
        ocj.INSTANCE.m163525b();
        GLES20.glUseProgram(this.program);
        m217602A();
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, textureStart);
        GLES20.glUniform1i(getTexture1Uniform(), 1);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, textureEnd);
        GLES20.glUniform1i(getTexture2Uniform(), 2);
        m217607F();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
        GLES20.glDisableVertexAttribArray(getPositionAttr());
        GLES20.glDisableVertexAttribArray(getTextureCoordinateAttr());
    }
}
