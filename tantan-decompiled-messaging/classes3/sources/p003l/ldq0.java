package p003l;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import l.ysf;
import project.android.imageprocessing.RendererCommon;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ldq0 extends ccj implements jcj {

    /* JADX INFO: renamed from: a */
    public InterfaceC0404a f5263a;

    /* JADX INFO: renamed from: b */
    protected int[] f5264b;

    /* JADX INFO: renamed from: c */
    protected int[] f5265c;

    /* JADX INFO: renamed from: d */
    protected int[] f5266d;

    /* JADX INFO: renamed from: e */
    int f5267e;

    /* JADX INFO: renamed from: f */
    int f5268f;

    /* JADX INFO: renamed from: g */
    int f5269g;

    /* JADX INFO: renamed from: i */
    int f5270i;

    /* JADX INFO: renamed from: j */
    int f5271j;

    /* JADX INFO: renamed from: k */
    int f5272k;

    /* JADX INFO: renamed from: l */
    int f5273l;

    /* JADX INFO: renamed from: m */
    int f5274m;

    /* JADX INFO: renamed from: r */
    private int f5279r;

    /* JADX INFO: renamed from: s */
    private int f5280s;

    /* JADX INFO: renamed from: t */
    private int f5281t;

    /* JADX INFO: renamed from: u */
    private int f5282u;

    /* JADX INFO: renamed from: q */
    private boolean f5278q = this.f5278q;

    /* JADX INFO: renamed from: q */
    private boolean f5278q = this.f5278q;

    /* JADX INFO: renamed from: n */
    private String f5275n = this.f5275n;

    /* JADX INFO: renamed from: n */
    private String f5275n = this.f5275n;

    /* JADX INFO: renamed from: o */
    private boolean f5276o = this.f5276o;

    /* JADX INFO: renamed from: o */
    private boolean f5276o = this.f5276o;

    /* JADX INFO: renamed from: p */
    private int f5277p = 1;

    /* JADX INFO: renamed from: l.ldq0$a */
    public interface InterfaceC0404a {
        /* JADX INFO: renamed from: a */
        void mo6003a(ByteBuffer byteBuffer, long j);
    }

    public ldq0() {
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        this.textureVertices = floatBufferArr;
        floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[0].put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f}).position(0);
        this.textureVertices[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[1].put(new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f}).position(0);
        this.textureVertices[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[2].put(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f}).position(0);
        this.textureVertices[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[3].put(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
    }

    /* JADX INFO: renamed from: Q1 */
    public static final float[] m6002Q1() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    private void initFBO() {
        int[] iArr = this.f5264b;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f5264b = null;
        }
        int[] iArr2 = this.f5265c;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f5265c = null;
        }
        int[] iArr3 = this.f5266d;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f5266d = null;
        }
        int[] iArr4 = new int[1];
        this.f5264b = iArr4;
        this.f5265c = new int[1];
        this.f5266d = new int[1];
        GLES20.glGenFramebuffers(1, iArr4, 0);
        GLES20.glGenRenderbuffers(1, this.f5266d, 0);
        GLES20.glGenTextures(1, this.f5265c, 0);
        GLES20.glBindFramebuffer(36160, this.f5264b[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f5265c[0]);
        GLES20.glTexImage2D(3553, 0, 6408, getWidth() / 4, getHeight() + (getHeight() / 2), 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f5265c[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f5266d[0]);
        GLES20.glRenderbufferStorage(36161, 33189, getWidth() / 4, getHeight() + (getHeight() / 2));
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f5266d[0]);
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        ysf.a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    @Override // p003l.ccj
    public void destroy() {
        super.destroy();
        int[] iArr = this.f5264b;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f5264b = null;
        }
        int[] iArr2 = this.f5265c;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f5265c = null;
        }
        int[] iArr3 = this.f5266d;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f5266d = null;
        }
    }

    @Override // p003l.ccj
    public void drawFrame() {
        int width = getWidth();
        int height = getHeight();
        long jNanoTime = System.nanoTime();
        if (this.f5264b == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                return;
            } else {
                initFBO();
            }
        }
        GLES20.glBindFramebuffer(36160, this.f5264b[0]);
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClear(16640);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        passShaderValues();
        float[] fArrM9738a = RendererCommon.m9738a(m6002Q1(), RendererCommon.m9739b());
        GLES20.glViewport(0, 0, this.f5271j, height);
        float f = width;
        GLES20.glUniform2f(this.f5280s, fArrM9738a[0] / f, fArrM9738a[1] / f);
        GLES20.glUniform4f(this.f5281t, 0.299f, 0.587f, 0.114f, 0.0f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glViewport(0, height, this.f5272k, this.f5273l);
        GLES20.glUniform2f(this.f5280s, (fArrM9738a[0] * 2.0f) / f, (fArrM9738a[1] * 2.0f) / f);
        GLES20.glUniform4f(this.f5281t, -0.169f, -0.331f, 0.499f, 0.5f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glViewport(this.f5271j / 2, height, this.f5272k, this.f5273l);
        GLES20.glUniform4f(this.f5281t, 0.499f, -0.418f, -0.0813f, 0.5f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
        System.nanoTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f5267e * this.f5268f * 4);
        GLES20.glReadPixels(0, 0, this.f5267e, this.f5268f, 6408, 5121, byteBufferAllocate);
        GLES20.glBindFramebuffer(36160, 0);
        InterfaceC0404a interfaceC0404a = this.f5263a;
        if (interfaceC0404a != null) {
            interfaceC0404a.mo6003a(byteBufferAllocate, jNanoTime);
        }
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nvarying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\nvec2 newCoord;\n uniform float drawType; \nvoid main() {\n  newCoord = vec2(textureCoordinate.x,textureCoordinate.y);  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord + 1.5 * xUnit).rgb);\n}\n";
    }

    @Override // p003l.ccj
    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \n varying vec2 textureCoordinate;\n \nuniform mat4 texMatrix;\n\nvoid main()\n{\n    gl_Position = position;\n  textureCoordinate = (texMatrix * inputTextureCoordinate).xy;\n}\n";
    }

    @Override // p003l.ccj
    public void handleSizeChange() {
        this.f5269g = getWidth();
        int height = getHeight();
        this.f5270i = height;
        int i = this.f5269g;
        int i2 = (i + 3) / 4;
        this.f5271j = i2;
        this.f5272k = (i + 7) / 8;
        int i3 = (height + 1) / 2;
        this.f5273l = i3;
        int i4 = height + i3;
        this.f5274m = i4;
        this.f5267e = i2;
        this.f5268f = i4;
        initFBO();
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f5279r = GLES20.glGetUniformLocation(this.programHandle, "texMatrix");
        this.f5280s = GLES20.glGetUniformLocation(this.programHandle, "xUnit");
        this.f5281t = GLES20.glGetUniformLocation(this.programHandle, "coeffs");
        this.f5282u = GLES20.glGetUniformLocation(this.programHandle, "drawType");
    }

    @Override // p003l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        this.texture_in = i;
        setWidth(getWidth());
        setHeight(getHeight());
        onDrawFrame();
        mcjVar.unlockRenderBuffer();
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniformMatrix4fv(this.f5279r, 1, false, m6002Q1(), 0);
    }
}
