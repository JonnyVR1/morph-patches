package p153l;

import android.opengl.GLES20;
import com.immomo.moment.media.momofilter.RendererCommon;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class pmq0 extends kt2 {

    /* JADX INFO: renamed from: D */
    public InterfaceC19404a f153211D;

    /* JADX INFO: renamed from: E */
    protected int[] f153212E;

    /* JADX INFO: renamed from: F */
    protected int[] f153213F;

    /* JADX INFO: renamed from: G */
    protected int[] f153214G;

    /* JADX INFO: renamed from: H */
    int f153215H;

    /* JADX INFO: renamed from: I */
    int f153216I;

    /* JADX INFO: renamed from: J */
    int f153217J;

    /* JADX INFO: renamed from: K */
    int f153218K;

    /* JADX INFO: renamed from: L */
    int f153219L;

    /* JADX INFO: renamed from: M */
    int f153220M;

    /* JADX INFO: renamed from: N */
    int f153221N;

    /* JADX INFO: renamed from: O */
    int f153222O;

    /* JADX INFO: renamed from: P */
    private int f153223P;

    /* JADX INFO: renamed from: Q */
    private int f153224Q;

    /* JADX INFO: renamed from: R */
    private int f153225R;

    /* JADX INFO: renamed from: S */
    private int f153226S;

    /* JADX INFO: renamed from: l.pmq0$a */
    public interface InterfaceC19404a {
        /* JADX INFO: renamed from: a */
        void mo121226a(ByteBuffer byteBuffer, long j);
    }

    public pmq0() {
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        this.f193942c = floatBufferArr;
        floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f193942c[0].put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f}).position(0);
        this.f193942c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f193942c[1].put(new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f}).position(0);
        this.f193942c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f193942c[2].put(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f}).position(0);
        this.f193942c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f193942c[3].put(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
    }

    /* JADX INFO: renamed from: O */
    public static final float[] m172960O() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    /* JADX INFO: renamed from: P */
    private void m172961P() {
        int[] iArr = this.f153212E;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f153212E = null;
        }
        int[] iArr2 = this.f153213F;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f153213F = null;
        }
        int[] iArr3 = this.f153214G;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f153214G = null;
        }
        int[] iArr4 = new int[1];
        this.f153212E = iArr4;
        this.f153213F = new int[1];
        this.f153214G = new int[1];
        GLES20.glGenFramebuffers(1, iArr4, 0);
        GLES20.glGenRenderbuffers(1, this.f153214G, 0);
        GLES20.glGenTextures(1, this.f153213F, 0);
        GLES20.glBindFramebuffer(36160, this.f153212E[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f153213F[0]);
        GLES20.glTexImage2D(3553, 0, 6408, m210702r() / 4, m210701n() + (m210701n() / 2), 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f153213F[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f153214G[0]);
        GLES20.glRenderbufferStorage(36161, 33189, m210702r() / 4, m210701n() + (m210701n() / 2));
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f153214G[0]);
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        muf.m160142a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    @Override // p153l.kt2, p153l.efj
    /* JADX INFO: renamed from: c */
    public void mo96079c(int i, hfj hfjVar, boolean z) {
        this.f193947h = i;
        m210695B(m210702r());
        m210704y(m210701n());
        mo134345v();
        hfjVar.m134804N();
    }

    @Override // p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: f */
    public void mo96080f() {
        super.mo96080f();
        int[] iArr = this.f153212E;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f153212E = null;
        }
        int[] iArr2 = this.f153213F;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f153213F = null;
        }
        int[] iArr3 = this.f153214G;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f153214G = null;
        }
    }

    @Override // p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: h */
    public void mo134805h() {
        int iM210702r = m210702r();
        int iM210701n = m210701n();
        long jNanoTime = System.nanoTime();
        if (this.f153212E == null) {
            if (m210702r() == 0 || m210701n() == 0) {
                return;
            } else {
                mo96077K();
            }
        }
        GLES20.glBindFramebuffer(36160, this.f153212E[0]);
        GLES20.glUseProgram(this.f193943d);
        GLES20.glClear(16640);
        GLES20.glClearColor(m210700l(), m210699k(), m210698j(), m210697i());
        mo112469w();
        float[] fArrM19659a = RendererCommon.m19659a(m172960O(), RendererCommon.m19660b());
        GLES20.glViewport(0, 0, this.f153219L, iM210701n);
        float f = iM210702r;
        GLES20.glUniform2f(this.f153224Q, fArrM19659a[0] / f, fArrM19659a[1] / f);
        GLES20.glUniform4f(this.f153225R, 0.299f, 0.587f, 0.114f, 0.0f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glViewport(0, iM210701n, this.f153220M, this.f153221N);
        GLES20.glUniform2f(this.f153224Q, (fArrM19659a[0] * 2.0f) / f, (fArrM19659a[1] * 2.0f) / f);
        GLES20.glUniform4f(this.f153225R, -0.169f, -0.331f, 0.499f, 0.5f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glViewport(this.f153219L / 2, iM210701n, this.f153220M, this.f153221N);
        GLES20.glUniform4f(this.f153225R, 0.499f, -0.418f, -0.0813f, 0.5f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
        System.nanoTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f153215H * this.f153216I * 4);
        GLES20.glReadPixels(0, 0, this.f153215H, this.f153216I, 6408, 5121, byteBufferAllocate);
        GLES20.glBindFramebuffer(36160, 0);
        InterfaceC19404a interfaceC19404a = this.f153211D;
        if (interfaceC19404a != null) {
            interfaceC19404a.mo121226a(byteBufferAllocate, jNanoTime);
        }
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: m */
    public String mo112466m() {
        return "precision highp float;\nvarying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\nvec2 newCoord;\n uniform float drawType; \nvoid main() {\n  newCoord = vec2(textureCoordinate.x,textureCoordinate.y);  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord + 1.5 * xUnit).rgb);\n}\n";
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: o */
    public String mo112467o() {
        return "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \n varying vec2 textureCoordinate;\n \nuniform mat4 texMatrix;\n\nvoid main()\n{\n    gl_Position = position;\n  textureCoordinate = (texMatrix * inputTextureCoordinate).xy;\n}\n";
    }

    @Override // p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: s */
    public void mo134806s() {
        this.f153217J = m210702r();
        int iM210701n = m210701n();
        this.f153218K = iM210701n;
        int i = this.f153217J;
        int i2 = (i + 3) / 4;
        this.f153219L = i2;
        this.f153220M = (i + 7) / 8;
        int i3 = (iM210701n + 1) / 2;
        this.f153221N = i3;
        int i4 = iM210701n + i3;
        this.f153222O = i4;
        this.f153215H = i2;
        this.f153216I = i4;
        m172961P();
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: t */
    public void mo112468t() {
        super.mo112468t();
        this.f153223P = GLES20.glGetUniformLocation(this.f193943d, "texMatrix");
        this.f153224Q = GLES20.glGetUniformLocation(this.f193943d, "xUnit");
        this.f153225R = GLES20.glGetUniformLocation(this.f193943d, "coeffs");
        this.f153226S = GLES20.glGetUniformLocation(this.f193943d, "drawType");
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: w */
    public void mo112469w() {
        super.mo112469w();
        GLES20.glUniformMatrix4fv(this.f153223P, 1, false, m172960O(), 0);
    }
}
