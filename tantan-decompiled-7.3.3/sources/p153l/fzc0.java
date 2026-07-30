package p153l;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\t\u0018\u0000 42\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\bR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010'\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R\u0016\u0010+\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010%R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010-R\u0016\u0010/\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010%R\u0016\u00101\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010%¨\u00065"}, m88121d2 = {"Ll/fzc0;", "Ll/q4m;", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "<init>", "(Landroid/graphics/SurfaceTexture;)V", "", "j", "()V", "e", "h", "f", "g", "Ll/jo0;", Constants.KEY_CONFIG, "b", "(Ll/jo0;)V", "", "width", "height", "c", "(II)V", "swapBuffers", "a", "()I", BLiveStormDanmakuGiftResourceType.f45292l, "k", RXScreenCaptureService.KEY_INDEX, "Ll/w3k;", "Ll/w3k;", "vertexArray", "alphaArray", "rgbArray", "", Constants.INAPP_DATA_TAG, "Z", "surfaceSizeChanged", "I", "surfaceWidth", "surfaceHeight", "Ll/xje;", "Ll/xje;", "eglUtil", "shaderProgram", "", "[I", "genTexture", "uTextureLocation", "aPositionLocation", "aTextureAlphaLocation", "m", "aTextureRgbLocation", "Companion", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class fzc0 implements q4m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final w3k vertexArray;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final w3k alphaArray;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final w3k rgbArray;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean surfaceSizeChanged;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int surfaceWidth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int surfaceHeight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final xje eglUtil;

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

    public fzc0(@NotNull SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        this.vertexArray = new w3k();
        this.alphaArray = new w3k();
        this.rgbArray = new w3k();
        xje xjeVar = new xje();
        this.eglUtil = xjeVar;
        this.genTexture = new int[1];
        xjeVar.m211208e(surfaceTexture);
        m128157j();
    }

    @Override // p153l.q4m
    /* JADX INFO: renamed from: a */
    public int mo128148a() {
        return this.genTexture[0];
    }

    @Override // p153l.q4m
    /* JADX INFO: renamed from: b */
    public void mo128149b(@NotNull jo0 config) {
        config.getClass();
        m128159l(config);
        m128158k(config);
    }

    @Override // p153l.q4m
    /* JADX INFO: renamed from: c */
    public void mo128150c(int width, int height) {
        if (width <= 0 || height <= 0) {
            return;
        }
        this.surfaceSizeChanged = true;
        this.surfaceWidth = width;
        this.surfaceHeight = height;
    }

    @Override // p153l.q4m
    /* JADX INFO: renamed from: d */
    public /* bridge */ void mo128151d(int i, int i2, @Nullable byte[] bArr, @Nullable byte[] bArr2, @Nullable byte[] bArr3) {
        super.mo128151d(i, i2, bArr, bArr2, bArr3);
    }

    @Override // p153l.q4m
    /* JADX INFO: renamed from: e */
    public void mo128152e() {
        int i;
        int i2;
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        if (this.surfaceSizeChanged && (i = this.surfaceWidth) > 0 && (i2 = this.surfaceHeight) > 0) {
            this.surfaceSizeChanged = false;
            GLES20.glViewport(0, 0, i, i2);
        }
        m128156i();
    }

    @Override // p153l.q4m
    /* JADX INFO: renamed from: f */
    public void mo128153f() {
        mo128154g();
        this.eglUtil.m211207d();
    }

    @Override // p153l.q4m
    /* JADX INFO: renamed from: g */
    public void mo128154g() {
        int[] iArr = this.genTexture;
        GLES20.glDeleteTextures(iArr.length, iArr, 0);
    }

    @Override // p153l.q4m
    /* JADX INFO: renamed from: h */
    public void mo128155h() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        this.eglUtil.m211209f();
    }

    /* JADX INFO: renamed from: i */
    public final void m128156i() {
        GLES20.glUseProgram(this.shaderProgram);
        this.vertexArray.m204770c(this.aPositionLocation);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.genTexture[0]);
        GLES20.glUniform1i(this.uTextureLocation, 0);
        this.alphaArray.m204770c(this.aTextureAlphaLocation);
        this.rgbArray.m204770c(this.aTextureRgbLocation);
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* JADX INFO: renamed from: j */
    public void m128157j() {
        int iM118858c = e0f0.INSTANCE.m118858c("attribute vec4 vPosition;\nattribute vec4 vTexCoordinateAlpha;\nattribute vec4 vTexCoordinateRgb;\nvarying vec2 v_TexCoordinateAlpha;\nvarying vec2 v_TexCoordinateRgb;\n\nvoid main() {\n    v_TexCoordinateAlpha = vec2(vTexCoordinateAlpha.x, vTexCoordinateAlpha.y);\n    v_TexCoordinateRgb = vec2(vTexCoordinateRgb.x, vTexCoordinateRgb.y);\n    gl_Position = vPosition;\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES texture;\nvarying vec2 v_TexCoordinateAlpha;\nvarying vec2 v_TexCoordinateRgb;\n\nvoid main () {\n    vec4 alphaColor = texture2D(texture, v_TexCoordinateAlpha);\n    vec4 rgbColor = texture2D(texture, v_TexCoordinateRgb);\n    gl_FragColor = vec4(rgbColor.r, rgbColor.g, rgbColor.b, alphaColor.r);\n}");
        this.shaderProgram = iM118858c;
        this.uTextureLocation = GLES20.glGetUniformLocation(iM118858c, "texture");
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
    public final void m128158k(jo0 config) {
        vqi0 vqi0Var = vqi0.INSTANCE;
        float[] fArrM202383a = vqi0Var.m202383a(config.getVideoWidth(), config.getVideoHeight(), config.getAlphaPointRect(), this.alphaArray.getArray());
        float[] fArrM202383a2 = vqi0Var.m202383a(config.getVideoWidth(), config.getVideoHeight(), config.getRgbPointRect(), this.rgbArray.getArray());
        this.alphaArray.m204769b(fArrM202383a);
        this.rgbArray.m204769b(fArrM202383a2);
    }

    /* JADX INFO: renamed from: l */
    public final void m128159l(jo0 config) {
        this.vertexArray.m204769b(u9l0.INSTANCE.m195103a(config.getWidth(), config.getHeight(), new mi80(0, 0, config.getWidth(), config.getHeight()), this.vertexArray.getArray()));
    }

    @Override // p153l.q4m
    public void swapBuffers() {
        this.eglUtil.m211209f();
    }
}
