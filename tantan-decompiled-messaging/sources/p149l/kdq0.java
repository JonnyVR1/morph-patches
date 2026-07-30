package p149l;

import android.opengl.GLES20;
import com.immomo.moment.media.momofilter.RendererCommon;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class kdq0 extends us2 {

    /* JADX INFO: renamed from: D */
    public InterfaceC17989a f122601D;

    /* JADX INFO: renamed from: E */
    protected int[] f122602E;

    /* JADX INFO: renamed from: F */
    protected int[] f122603F;

    /* JADX INFO: renamed from: G */
    protected int[] f122604G;

    /* JADX INFO: renamed from: H */
    int f122605H;

    /* JADX INFO: renamed from: I */
    int f122606I;

    /* JADX INFO: renamed from: J */
    int f122607J;

    /* JADX INFO: renamed from: K */
    int f122608K;

    /* JADX INFO: renamed from: L */
    int f122609L;

    /* JADX INFO: renamed from: M */
    int f122610M;

    /* JADX INFO: renamed from: N */
    int f122611N;

    /* JADX INFO: renamed from: O */
    int f122612O;

    /* JADX INFO: renamed from: P */
    private int f122613P;

    /* JADX INFO: renamed from: Q */
    private int f122614Q;

    /* JADX INFO: renamed from: R */
    private int f122615R;

    /* JADX INFO: renamed from: S */
    private int f122616S;

    /* JADX INFO: renamed from: l.kdq0$a */
    public interface InterfaceC17989a {
        /* JADX INFO: renamed from: a */
        void mo115724a(ByteBuffer byteBuffer, long j);
    }

    public kdq0() {
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        this.f85417c = floatBufferArr;
        floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f85417c[0].put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f}).position(0);
        this.f85417c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f85417c[1].put(new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f}).position(0);
        this.f85417c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f85417c[2].put(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f}).position(0);
        this.f85417c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f85417c[3].put(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
    }

    /* JADX INFO: renamed from: O */
    public static final float[] m145678O() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    /* JADX INFO: renamed from: P */
    private void m145679P() {
        int[] iArr = this.f122602E;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f122602E = null;
        }
        int[] iArr2 = this.f122603F;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f122603F = null;
        }
        int[] iArr3 = this.f122604G;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f122604G = null;
        }
        int[] iArr4 = new int[1];
        this.f122602E = iArr4;
        this.f122603F = new int[1];
        this.f122604G = new int[1];
        GLES20.glGenFramebuffers(1, iArr4, 0);
        GLES20.glGenRenderbuffers(1, this.f122604G, 0);
        GLES20.glGenTextures(1, this.f122603F, 0);
        GLES20.glBindFramebuffer(36160, this.f122602E[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f122603F[0]);
        GLES20.glTexImage2D(3553, 0, 6408, m110705r() / 4, m110701n() + (m110701n() / 2), 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f122603F[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f122604G[0]);
        GLES20.glRenderbufferStorage(36161, 33189, m110705r() / 4, m110701n() + (m110701n() / 2));
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f122604G[0]);
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        ysf.m215904a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    @Override // p149l.us2, p149l.kcj
    /* JADX INFO: renamed from: c */
    public void mo102037c(int i, ncj ncjVar, boolean z) {
        this.f85422h = i;
        m110693B(m110705r());
        m110712y(m110701n());
        mo110709v();
        ncjVar.m158952N();
    }

    @Override // p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: f */
    public void mo102038f() {
        super.mo102038f();
        int[] iArr = this.f122602E;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f122602E = null;
        }
        int[] iArr2 = this.f122603F;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f122603F = null;
        }
        int[] iArr3 = this.f122604G;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f122604G = null;
        }
    }

    @Override // p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: h */
    public void mo110696h() {
        int iM110705r = m110705r();
        int iM110701n = m110701n();
        long jNanoTime = System.nanoTime();
        if (this.f122602E == null) {
            if (m110705r() == 0 || m110701n() == 0) {
                return;
            } else {
                mo158949K();
            }
        }
        GLES20.glBindFramebuffer(36160, this.f122602E[0]);
        GLES20.glUseProgram(this.f85418d);
        GLES20.glClear(16640);
        GLES20.glClearColor(m110700l(), m110699k(), m110698j(), m110697i());
        mo110710w();
        float[] fArrM18679a = RendererCommon.m18679a(m145678O(), RendererCommon.m18680b());
        GLES20.glViewport(0, 0, this.f122609L, iM110701n);
        float f = iM110705r;
        GLES20.glUniform2f(this.f122614Q, fArrM18679a[0] / f, fArrM18679a[1] / f);
        GLES20.glUniform4f(this.f122615R, 0.299f, 0.587f, 0.114f, 0.0f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glViewport(0, iM110701n, this.f122610M, this.f122611N);
        GLES20.glUniform2f(this.f122614Q, (fArrM18679a[0] * 2.0f) / f, (fArrM18679a[1] * 2.0f) / f);
        GLES20.glUniform4f(this.f122615R, -0.169f, -0.331f, 0.499f, 0.5f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glViewport(this.f122609L / 2, iM110701n, this.f122610M, this.f122611N);
        GLES20.glUniform4f(this.f122615R, 0.499f, -0.418f, -0.0813f, 0.5f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
        System.nanoTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f122605H * this.f122606I * 4);
        GLES20.glReadPixels(0, 0, this.f122605H, this.f122606I, 6408, 5121, byteBufferAllocate);
        GLES20.glBindFramebuffer(36160, 0);
        InterfaceC17989a interfaceC17989a = this.f122601D;
        if (interfaceC17989a != null) {
            interfaceC17989a.mo115724a(byteBufferAllocate, jNanoTime);
        }
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: m */
    public String mo102573m() {
        return "precision highp float;\nvarying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\nvec2 newCoord;\n uniform float drawType; \nvoid main() {\n  newCoord = vec2(textureCoordinate.x,textureCoordinate.y);  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord + 1.5 * xUnit).rgb);\n}\n";
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: o */
    public String mo110702o() {
        return "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \n varying vec2 textureCoordinate;\n \nuniform mat4 texMatrix;\n\nvoid main()\n{\n    gl_Position = position;\n  textureCoordinate = (texMatrix * inputTextureCoordinate).xy;\n}\n";
    }

    @Override // p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: s */
    public void mo110706s() {
        this.f122607J = m110705r();
        int iM110701n = m110701n();
        this.f122608K = iM110701n;
        int i = this.f122607J;
        int i2 = (i + 3) / 4;
        this.f122609L = i2;
        this.f122610M = (i + 7) / 8;
        int i3 = (iM110701n + 1) / 2;
        this.f122611N = i3;
        int i4 = iM110701n + i3;
        this.f122612O = i4;
        this.f122605H = i2;
        this.f122606I = i4;
        m145679P();
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: t */
    public void mo110707t() {
        super.mo110707t();
        this.f122613P = GLES20.glGetUniformLocation(this.f85418d, "texMatrix");
        this.f122614Q = GLES20.glGetUniformLocation(this.f85418d, "xUnit");
        this.f122615R = GLES20.glGetUniformLocation(this.f85418d, "coeffs");
        this.f122616S = GLES20.glGetUniformLocation(this.f85418d, "drawType");
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: w */
    public void mo110710w() {
        super.mo110710w();
        GLES20.glUniformMatrix4fv(this.f122613P, 1, false, m145678O(), 0);
    }
}
