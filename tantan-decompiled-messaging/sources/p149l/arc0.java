package p149l;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\t\u0018\u0000 42\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\bR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010'\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R\u0016\u0010+\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010%R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010-R\u0016\u0010/\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010%R\u0016\u00101\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010%¨\u00065"}, m87232d2 = {"Ll/arc0;", "Ll/x1m;", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "<init>", "(Landroid/graphics/SurfaceTexture;)V", "", "j", "()V", "e", "h", "f", "g", "Ll/no0;", Constants.KEY_CONFIG, "b", "(Ll/no0;)V", "", "width", "height", "c", "(II)V", "swapBuffers", "a", "()I", BLiveStormDanmakuGiftResourceType.f44444l, "k", RXScreenCaptureService.KEY_INDEX, "Ll/g1k;", "Ll/g1k;", "vertexArray", "alphaArray", "rgbArray", "", Constants.INAPP_DATA_TAG, "Z", "surfaceSizeChanged", "I", "surfaceWidth", "surfaceHeight", "Ll/tie;", "Ll/tie;", "eglUtil", "shaderProgram", "", "[I", "genTexture", "uTextureLocation", "aPositionLocation", "aTextureAlphaLocation", "m", "aTextureRgbLocation", "Companion", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class arc0 implements x1m {

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
    public boolean surfaceSizeChanged;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int surfaceWidth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int surfaceHeight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final tie eglUtil;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int shaderProgram;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public int[] genTexture;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int uTextureLocation;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int aPositionLocation;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int aTextureAlphaLocation;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int aTextureRgbLocation;

    public arc0(@NotNull SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        this.vertexArray = new g1k();
        this.alphaArray = new g1k();
        this.rgbArray = new g1k();
        tie tieVar = new tie();
        this.eglUtil = tieVar;
        this.genTexture = new int[1];
        tieVar.m189180e(surfaceTexture);
        m98379j();
    }

    @Override // p149l.x1m
    /* JADX INFO: renamed from: a */
    public int mo98370a() {
        return this.genTexture[0];
    }

    @Override // p149l.x1m
    /* JADX INFO: renamed from: b */
    public void mo98371b(@NotNull no0 config) {
        config.getClass();
        m98381l(config);
        m98380k(config);
    }

    @Override // p149l.x1m
    /* JADX INFO: renamed from: c */
    public void mo98372c(int width, int height) {
        if (width <= 0 || height <= 0) {
            return;
        }
        this.surfaceSizeChanged = true;
        this.surfaceWidth = width;
        this.surfaceHeight = height;
    }

    @Override // p149l.x1m
    /* JADX INFO: renamed from: d */
    public /* bridge */ void mo98373d(int i, int i2, @Nullable byte[] bArr, @Nullable byte[] bArr2, @Nullable byte[] bArr3) {
        super.mo98373d(i, i2, bArr, bArr2, bArr3);
    }

    @Override // p149l.x1m
    /* JADX INFO: renamed from: e */
    public void mo98374e() {
        int i;
        int i2;
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        if (this.surfaceSizeChanged && (i = this.surfaceWidth) > 0 && (i2 = this.surfaceHeight) > 0) {
            this.surfaceSizeChanged = false;
            GLES20.glViewport(0, 0, i, i2);
        }
        m98378i();
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
        int[] iArr = this.genTexture;
        GLES20.glDeleteTextures(iArr.length, iArr, 0);
    }

    @Override // p149l.x1m
    /* JADX INFO: renamed from: h */
    public void mo98377h() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        this.eglUtil.m189181f();
    }

    /* JADX INFO: renamed from: i */
    public final void m98378i() {
        GLES20.glUseProgram(this.shaderProgram);
        this.vertexArray.m124085c(this.aPositionLocation);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.genTexture[0]);
        GLES20.glUniform1i(this.uTextureLocation, 0);
        this.alphaArray.m124085c(this.aTextureAlphaLocation);
        this.rgbArray.m124085c(this.aTextureRgbLocation);
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* JADX INFO: renamed from: j */
    public void m98379j() {
        int iM210675c = xre0.INSTANCE.m210675c("attribute vec4 vPosition;\nattribute vec4 vTexCoordinateAlpha;\nattribute vec4 vTexCoordinateRgb;\nvarying vec2 v_TexCoordinateAlpha;\nvarying vec2 v_TexCoordinateRgb;\n\nvoid main() {\n    v_TexCoordinateAlpha = vec2(vTexCoordinateAlpha.x, vTexCoordinateAlpha.y);\n    v_TexCoordinateRgb = vec2(vTexCoordinateRgb.x, vTexCoordinateRgb.y);\n    gl_Position = vPosition;\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES texture;\nvarying vec2 v_TexCoordinateAlpha;\nvarying vec2 v_TexCoordinateRgb;\n\nvoid main () {\n    vec4 alphaColor = texture2D(texture, v_TexCoordinateAlpha);\n    vec4 rgbColor = texture2D(texture, v_TexCoordinateRgb);\n    gl_FragColor = vec4(rgbColor.r, rgbColor.g, rgbColor.b, alphaColor.r);\n}");
        this.shaderProgram = iM210675c;
        this.uTextureLocation = GLES20.glGetUniformLocation(iM210675c, "texture");
        this.aPositionLocation = GLES20.glGetAttribLocation(this.shaderProgram, "vPosition");
        this.aTextureAlphaLocation = GLES20.glGetAttribLocation(this.shaderProgram, "vTexCoordinateAlpha");
        this.aTextureRgbLocation = GLES20.glGetAttribLocation(this.shaderProgram, "vTexCoordinateRgb");
        int[] iArr = this.genTexture;
        GLES20.glGenTextures(iArr.length, iArr, 0);
        GLES20.glBindTexture(36197, this.genTexture[0]);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
    }

    /* JADX INFO: renamed from: k */
    public final void m98380k(no0 config) {
        vhi0 vhi0Var = vhi0.INSTANCE;
        float[] fArrM198463a = vhi0Var.m198463a(config.getVideoWidth(), config.getVideoHeight(), config.getAlphaPointRect(), this.alphaArray.getArray());
        float[] fArrM198463a2 = vhi0Var.m198463a(config.getVideoWidth(), config.getVideoHeight(), config.getRgbPointRect(), this.rgbArray.getArray());
        this.alphaArray.m124084b(fArrM198463a);
        this.rgbArray.m124084b(fArrM198463a2);
    }

    /* JADX INFO: renamed from: l */
    public final void m98381l(no0 config) {
        this.vertexArray.m124084b(p0l0.INSTANCE.m166989a(config.getWidth(), config.getHeight(), new ga80(0, 0, config.getWidth(), config.getHeight()), this.vertexArray.getArray()));
    }

    @Override // p149l.x1m
    public void swapBuffers() {
        this.eglUtil.m189181f();
    }
}
