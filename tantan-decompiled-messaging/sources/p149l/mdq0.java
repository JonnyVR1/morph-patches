package p149l;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0005\u0018\u0000 G2\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\bJ=\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0014\u0010#\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0016\u0010%\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u0016\u0010&\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010$R\u0016\u0010'\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010$R\u0016\u0010(\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0016\u0010)\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0016\u0010*\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0016\u0010+\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010$R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010$R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010$R\u0016\u00105\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010$R\u0016\u00107\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010$R\u0018\u0010\u0019\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010\u001a\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R\u0018\u0010\u001b\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010$R\u0014\u0010E\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010DR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010D¨\u0006H"}, m87232d2 = {"Ll/mdq0;", "Ll/x1m;", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "<init>", "(Landroid/graphics/SurfaceTexture;)V", "", RXScreenCaptureService.KEY_INDEX, "()V", "j", "e", "h", "f", "Ll/no0;", Constants.KEY_CONFIG, "b", "(Ll/no0;)V", "", "a", "()I", "g", "swapBuffers", "width", "height", "", BaseSei.f13931Y, "u", ResourceDirection.f38808v, Constants.INAPP_DATA_TAG, "(II[B[B[B)V", "Ll/g1k;", "Ll/g1k;", "vertexArray", "alphaArray", "c", "rgbArray", "I", "shaderProgram", "avPosition", "rgbPosition", "alphaPosition", "samplerY", "samplerU", "samplerV", "", "k", "[I", "textureId", BLiveStormDanmakuGiftResourceType.f44444l, "convertMatrixUniform", "m", "convertOffsetUniform", "n", "widthYUV", "o", "heightYUV", "Ljava/nio/ByteBuffer;", "p", "Ljava/nio/ByteBuffer;", "q", "r", "Ll/tie;", BLiveStormDanmakuGiftResourceType.f44446s, "Ll/tie;", "eglUtil", Constants.KEY_T, "unpackAlign", "", "[F", "YUV_OFFSET", "YUV_MATRIX", "Companion", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class mdq0 implements x1m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final g1k vertexArray;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g1k alphaArray;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final g1k rgbArray;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int shaderProgram;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int avPosition;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int rgbPosition;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int alphaPosition;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int samplerY;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int samplerU;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int samplerV;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public int[] textureId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int convertMatrixUniform;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int convertOffsetUniform;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public int widthYUV;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int heightYUV;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public ByteBuffer y;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public ByteBuffer u;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public ByteBuffer v;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final tie eglUtil;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public int unpackAlign;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final float[] YUV_OFFSET;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final float[] YUV_MATRIX;

    public mdq0(@NotNull SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        this.vertexArray = new g1k();
        this.alphaArray = new g1k();
        this.rgbArray = new g1k();
        this.textureId = new int[3];
        tie tieVar = new tie();
        this.eglUtil = tieVar;
        this.unpackAlign = 4;
        this.YUV_OFFSET = new float[]{0.0f, -0.5019608f, -0.5019608f};
        this.YUV_MATRIX = new float[]{1.0f, 1.0f, 1.0f, 0.0f, -0.3441f, 1.772f, 1.402f, -0.7141f, 0.0f};
        tieVar.m189180e(surfaceTexture);
        m154105j();
    }

    /* JADX INFO: renamed from: i */
    private final void m154104i() {
        if (this.widthYUV <= 0 || this.heightYUV <= 0 || this.y == null || this.u == null || this.v == null) {
            return;
        }
        GLES20.glUseProgram(this.shaderProgram);
        this.vertexArray.m124085c(this.avPosition);
        this.alphaArray.m124085c(this.alphaPosition);
        this.rgbArray.m124085c(this.rgbPosition);
        GLES20.glPixelStorei(3317, this.unpackAlign);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.textureId[0]);
        GLES20.glTexImage2D(3553, 0, 6409, this.widthYUV, this.heightYUV, 0, 6409, 5121, this.y);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.textureId[1]);
        GLES20.glTexImage2D(3553, 0, 6409, this.widthYUV / 2, this.heightYUV / 2, 0, 6409, 5121, this.u);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, this.textureId[2]);
        GLES20.glTexImage2D(3553, 0, 6409, this.widthYUV / 2, this.heightYUV / 2, 0, 6409, 5121, this.v);
        GLES20.glUniform1i(this.samplerY, 0);
        GLES20.glUniform1i(this.samplerU, 1);
        GLES20.glUniform1i(this.samplerV, 2);
        GLES20.glUniform3fv(this.convertOffsetUniform, 1, FloatBuffer.wrap(this.YUV_OFFSET));
        GLES20.glUniformMatrix3fv(this.convertMatrixUniform, 1, false, this.YUV_MATRIX, 0);
        GLES20.glDrawArrays(5, 0, 4);
        ByteBuffer byteBuffer = this.y;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.u;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        ByteBuffer byteBuffer3 = this.v;
        if (byteBuffer3 != null) {
            byteBuffer3.clear();
        }
        this.y = null;
        this.u = null;
        this.v = null;
        GLES20.glDisableVertexAttribArray(this.avPosition);
        GLES20.glDisableVertexAttribArray(this.rgbPosition);
        GLES20.glDisableVertexAttribArray(this.alphaPosition);
    }

    @Override // p149l.x1m
    /* JADX INFO: renamed from: a */
    public int mo98370a() {
        return this.textureId[0];
    }

    @Override // p149l.x1m
    /* JADX INFO: renamed from: b */
    public void mo98371b(@NotNull no0 config) {
        config.getClass();
        this.vertexArray.m124084b(p0l0.INSTANCE.m166989a(config.getWidth(), config.getHeight(), new ga80(0, 0, config.getWidth(), config.getHeight()), this.vertexArray.getArray()));
        vhi0 vhi0Var = vhi0.INSTANCE;
        float[] fArrM198463a = vhi0Var.m198463a(config.getVideoWidth(), config.getVideoHeight(), config.getAlphaPointRect(), this.alphaArray.getArray());
        float[] fArrM198463a2 = vhi0Var.m198463a(config.getVideoWidth(), config.getVideoHeight(), config.getRgbPointRect(), this.rgbArray.getArray());
        this.alphaArray.m124084b(fArrM198463a);
        this.rgbArray.m124084b(fArrM198463a2);
    }

    @Override // p149l.x1m
    /* JADX INFO: renamed from: c */
    public /* bridge */ void mo98372c(int i, int i2) {
        super.mo98372c(i, i2);
    }

    @Override // p149l.x1m
    /* JADX INFO: renamed from: d */
    public void mo98373d(int width, int height, @Nullable byte[] y, @Nullable byte[] u, @Nullable byte[] v2) {
        this.widthYUV = width;
        this.heightYUV = height;
        this.y = ByteBuffer.wrap(y);
        this.u = ByteBuffer.wrap(u);
        this.v = ByteBuffer.wrap(v2);
        int i = this.widthYUV;
        if ((i / 2) % 4 != 0) {
            this.unpackAlign = (i / 2) % 2 != 0 ? 1 : 2;
        }
    }

    @Override // p149l.x1m
    /* JADX INFO: renamed from: e */
    public void mo98374e() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        m154104i();
    }

    @Override // p149l.x1m
    /* JADX INFO: renamed from: f */
    public void mo98375f() {
        mo98376g();
        this.eglUtil.m189179d();
    }

    @Override // p149l.x1m
    /* JADX INFO: renamed from: g */
    public void mo98376g() {
        int[] iArr = this.textureId;
        GLES20.glDeleteTextures(iArr.length, iArr, 0);
    }

    @Override // p149l.x1m
    /* JADX INFO: renamed from: h */
    public void mo98377h() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        this.eglUtil.m189181f();
    }

    /* JADX INFO: renamed from: j */
    public void m154105j() {
        int iM210675c = xre0.INSTANCE.m210675c("attribute vec4 v_Position;\nattribute vec2 vTexCoordinateAlpha;\nattribute vec2 vTexCoordinateRgb;\nvarying vec2 v_TexCoordinateAlpha;\nvarying vec2 v_TexCoordinateRgb;\n\nvoid main() {\n    v_TexCoordinateAlpha = vTexCoordinateAlpha;\n    v_TexCoordinateRgb = vTexCoordinateRgb;\n    gl_Position = v_Position;\n}", "precision mediump float;\nuniform sampler2D sampler_y;\nuniform sampler2D sampler_u;\nuniform sampler2D sampler_v;\nvarying vec2 v_TexCoordinateAlpha;\nvarying vec2 v_TexCoordinateRgb;\nuniform mat3 convertMatrix;\nuniform vec3 offset;\n\nvoid main() {\n   highp vec3 yuvColorAlpha;\n   highp vec3 yuvColorRGB;\n   highp vec3 rgbColorAlpha;\n   highp vec3 rgbColorRGB;\n   yuvColorAlpha.x = texture2D(sampler_y,v_TexCoordinateAlpha).r;\n   yuvColorRGB.x = texture2D(sampler_y,v_TexCoordinateRgb).r;\n   yuvColorAlpha.y = texture2D(sampler_u,v_TexCoordinateAlpha).r;\n   yuvColorAlpha.z = texture2D(sampler_v,v_TexCoordinateAlpha).r;\n   yuvColorRGB.y = texture2D(sampler_u,v_TexCoordinateRgb).r;\n   yuvColorRGB.z = texture2D(sampler_v,v_TexCoordinateRgb).r;\n   yuvColorAlpha += offset;\n   yuvColorRGB += offset;\n   rgbColorAlpha = convertMatrix * yuvColorAlpha; \n   rgbColorRGB = convertMatrix * yuvColorRGB; \n   gl_FragColor=vec4(rgbColorRGB, rgbColorAlpha.r);\n}");
        this.shaderProgram = iM210675c;
        this.avPosition = GLES20.glGetAttribLocation(iM210675c, "v_Position");
        this.rgbPosition = GLES20.glGetAttribLocation(this.shaderProgram, "vTexCoordinateRgb");
        this.alphaPosition = GLES20.glGetAttribLocation(this.shaderProgram, "vTexCoordinateAlpha");
        this.samplerY = GLES20.glGetUniformLocation(this.shaderProgram, "sampler_y");
        this.samplerU = GLES20.glGetUniformLocation(this.shaderProgram, "sampler_u");
        this.samplerV = GLES20.glGetUniformLocation(this.shaderProgram, "sampler_v");
        this.convertMatrixUniform = GLES20.glGetUniformLocation(this.shaderProgram, "convertMatrix");
        this.convertOffsetUniform = GLES20.glGetUniformLocation(this.shaderProgram, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
        int[] iArr = this.textureId;
        GLES20.glGenTextures(iArr.length, iArr, 0);
        for (int i : this.textureId) {
            GLES20.glBindTexture(3553, i);
            GLES20.glTexParameteri(3553, 10242, 10497);
            GLES20.glTexParameteri(3553, 10243, 10497);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
        }
    }

    @Override // p149l.x1m
    public void swapBuffers() {
        this.eglUtil.m189181f();
    }
}
