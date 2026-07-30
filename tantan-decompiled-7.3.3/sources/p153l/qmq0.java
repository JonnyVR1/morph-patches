package p153l;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import project.android.imageprocessing.RendererCommon;

/* JADX INFO: loaded from: classes3.dex */
public class qmq0 extends wej implements dfj {

    /* JADX INFO: renamed from: a */
    public InterfaceC19603a f158394a;

    /* JADX INFO: renamed from: b */
    protected int[] f158395b;

    /* JADX INFO: renamed from: c */
    protected int[] f158396c;

    /* JADX INFO: renamed from: d */
    protected int[] f158397d;

    /* JADX INFO: renamed from: e */
    int f158398e;

    /* JADX INFO: renamed from: f */
    int f158399f;

    /* JADX INFO: renamed from: g */
    int f158400g;

    /* JADX INFO: renamed from: i */
    int f158401i;

    /* JADX INFO: renamed from: j */
    int f158402j;

    /* JADX INFO: renamed from: k */
    int f158403k;

    /* JADX INFO: renamed from: l */
    int f158404l;

    /* JADX INFO: renamed from: m */
    int f158405m;

    /* JADX INFO: renamed from: r */
    private int f158410r;

    /* JADX INFO: renamed from: s */
    private int f158411s;

    /* JADX INFO: renamed from: t */
    private int f158412t;

    /* JADX INFO: renamed from: u */
    private int f158413u;

    /* JADX INFO: renamed from: q */
    private boolean f158409q = this.f158409q;

    /* JADX INFO: renamed from: q */
    private boolean f158409q = this.f158409q;

    /* JADX INFO: renamed from: n */
    private String f158406n = this.f158406n;

    /* JADX INFO: renamed from: n */
    private String f158406n = this.f158406n;

    /* JADX INFO: renamed from: o */
    private boolean f158407o = this.f158407o;

    /* JADX INFO: renamed from: o */
    private boolean f158407o = this.f158407o;

    /* JADX INFO: renamed from: p */
    private int f158408p = 1;

    /* JADX INFO: renamed from: l.qmq0$a */
    public interface InterfaceC19603a {
        /* JADX INFO: renamed from: a */
        void mo128845a(ByteBuffer byteBuffer, long j);
    }

    public qmq0() {
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
    public static final float[] m177142Q1() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    private void initFBO() {
        int[] iArr = this.f158395b;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f158395b = null;
        }
        int[] iArr2 = this.f158396c;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f158396c = null;
        }
        int[] iArr3 = this.f158397d;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f158397d = null;
        }
        int[] iArr4 = new int[1];
        this.f158395b = iArr4;
        this.f158396c = new int[1];
        this.f158397d = new int[1];
        GLES20.glGenFramebuffers(1, iArr4, 0);
        GLES20.glGenRenderbuffers(1, this.f158397d, 0);
        GLES20.glGenTextures(1, this.f158396c, 0);
        GLES20.glBindFramebuffer(36160, this.f158395b[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f158396c[0]);
        GLES20.glTexImage2D(3553, 0, 6408, getWidth() / 4, getHeight() + (getHeight() / 2), 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f158396c[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f158397d[0]);
        GLES20.glRenderbufferStorage(36161, 33189, getWidth() / 4, getHeight() + (getHeight() / 2));
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f158397d[0]);
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        muf.m160142a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    @Override // p153l.wej
    public void destroy() {
        super.destroy();
        int[] iArr = this.f158395b;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f158395b = null;
        }
        int[] iArr2 = this.f158396c;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f158396c = null;
        }
        int[] iArr3 = this.f158397d;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f158397d = null;
        }
    }

    @Override // p153l.wej
    public void drawFrame() {
        int width = getWidth();
        int height = getHeight();
        long jNanoTime = System.nanoTime();
        if (this.f158395b == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                return;
            } else {
                initFBO();
            }
        }
        GLES20.glBindFramebuffer(36160, this.f158395b[0]);
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClear(16640);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        passShaderValues();
        float[] fArrM222527a = RendererCommon.m222527a(m177142Q1(), RendererCommon.m222528b());
        GLES20.glViewport(0, 0, this.f158402j, height);
        float f = width;
        GLES20.glUniform2f(this.f158411s, fArrM222527a[0] / f, fArrM222527a[1] / f);
        GLES20.glUniform4f(this.f158412t, 0.299f, 0.587f, 0.114f, 0.0f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glViewport(0, height, this.f158403k, this.f158404l);
        GLES20.glUniform2f(this.f158411s, (fArrM222527a[0] * 2.0f) / f, (fArrM222527a[1] * 2.0f) / f);
        GLES20.glUniform4f(this.f158412t, -0.169f, -0.331f, 0.499f, 0.5f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glViewport(this.f158402j / 2, height, this.f158403k, this.f158404l);
        GLES20.glUniform4f(this.f158412t, 0.499f, -0.418f, -0.0813f, 0.5f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
        System.nanoTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f158398e * this.f158399f * 4);
        GLES20.glReadPixels(0, 0, this.f158398e, this.f158399f, 6408, 5121, byteBufferAllocate);
        GLES20.glBindFramebuffer(36160, 0);
        InterfaceC19603a interfaceC19603a = this.f158394a;
        if (interfaceC19603a != null) {
            interfaceC19603a.mo128845a(byteBufferAllocate, jNanoTime);
        }
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nvarying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\nvec2 newCoord;\n uniform float drawType; \nvoid main() {\n  newCoord = vec2(textureCoordinate.x,textureCoordinate.y);  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord + 1.5 * xUnit).rgb);\n}\n";
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \n varying vec2 textureCoordinate;\n \nuniform mat4 texMatrix;\n\nvoid main()\n{\n    gl_Position = position;\n  textureCoordinate = (texMatrix * inputTextureCoordinate).xy;\n}\n";
    }

    @Override // p153l.wej
    public void handleSizeChange() {
        this.f158400g = getWidth();
        int height = getHeight();
        this.f158401i = height;
        int i = this.f158400g;
        int i2 = (i + 3) / 4;
        this.f158402j = i2;
        this.f158403k = (i + 7) / 8;
        int i3 = (height + 1) / 2;
        this.f158404l = i3;
        int i4 = height + i3;
        this.f158405m = i4;
        this.f158398e = i2;
        this.f158399f = i4;
        initFBO();
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f158410r = GLES20.glGetUniformLocation(this.programHandle, "texMatrix");
        this.f158411s = GLES20.glGetUniformLocation(this.programHandle, "xUnit");
        this.f158412t = GLES20.glGetUniformLocation(this.programHandle, "coeffs");
        this.f158413u = GLES20.glGetUniformLocation(this.programHandle, "drawType");
    }

    @Override // p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        this.texture_in = i;
        setWidth(getWidth());
        setHeight(getHeight());
        onDrawFrame();
        gfjVar.unlockRenderBuffer();
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniformMatrix4fv(this.f158410r, 1, false, m177142Q1(), 0);
    }
}
