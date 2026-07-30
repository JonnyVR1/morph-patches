package p149l;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import project.android.imageprocessing.RendererCommon;

/* JADX INFO: loaded from: classes3.dex */
public class ldq0 extends ccj implements jcj {

    /* JADX INFO: renamed from: a */
    public InterfaceC18199a f127576a;

    /* JADX INFO: renamed from: b */
    protected int[] f127577b;

    /* JADX INFO: renamed from: c */
    protected int[] f127578c;

    /* JADX INFO: renamed from: d */
    protected int[] f127579d;

    /* JADX INFO: renamed from: e */
    int f127580e;

    /* JADX INFO: renamed from: f */
    int f127581f;

    /* JADX INFO: renamed from: g */
    int f127582g;

    /* JADX INFO: renamed from: i */
    int f127583i;

    /* JADX INFO: renamed from: j */
    int f127584j;

    /* JADX INFO: renamed from: k */
    int f127585k;

    /* JADX INFO: renamed from: l */
    int f127586l;

    /* JADX INFO: renamed from: m */
    int f127587m;

    /* JADX INFO: renamed from: r */
    private int f127592r;

    /* JADX INFO: renamed from: s */
    private int f127593s;

    /* JADX INFO: renamed from: t */
    private int f127594t;

    /* JADX INFO: renamed from: u */
    private int f127595u;

    /* JADX INFO: renamed from: q */
    private boolean f127591q = this.f127591q;

    /* JADX INFO: renamed from: q */
    private boolean f127591q = this.f127591q;

    /* JADX INFO: renamed from: n */
    private String f127588n = this.f127588n;

    /* JADX INFO: renamed from: n */
    private String f127588n = this.f127588n;

    /* JADX INFO: renamed from: o */
    private boolean f127589o = this.f127589o;

    /* JADX INFO: renamed from: o */
    private boolean f127589o = this.f127589o;

    /* JADX INFO: renamed from: p */
    private int f127590p = 1;

    /* JADX INFO: renamed from: l.ldq0$a */
    public interface InterfaceC18199a {
        /* JADX INFO: renamed from: a */
        void mo149469a(ByteBuffer byteBuffer, long j);
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
    public static final float[] m149468Q1() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    private void initFBO() {
        int[] iArr = this.f127577b;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f127577b = null;
        }
        int[] iArr2 = this.f127578c;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f127578c = null;
        }
        int[] iArr3 = this.f127579d;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f127579d = null;
        }
        int[] iArr4 = new int[1];
        this.f127577b = iArr4;
        this.f127578c = new int[1];
        this.f127579d = new int[1];
        GLES20.glGenFramebuffers(1, iArr4, 0);
        GLES20.glGenRenderbuffers(1, this.f127579d, 0);
        GLES20.glGenTextures(1, this.f127578c, 0);
        GLES20.glBindFramebuffer(36160, this.f127577b[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f127578c[0]);
        GLES20.glTexImage2D(3553, 0, 6408, getWidth() / 4, getHeight() + (getHeight() / 2), 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f127578c[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f127579d[0]);
        GLES20.glRenderbufferStorage(36161, 33189, getWidth() / 4, getHeight() + (getHeight() / 2));
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f127579d[0]);
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        ysf.m215904a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    @Override // p149l.ccj
    public void destroy() {
        super.destroy();
        int[] iArr = this.f127577b;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f127577b = null;
        }
        int[] iArr2 = this.f127578c;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f127578c = null;
        }
        int[] iArr3 = this.f127579d;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f127579d = null;
        }
    }

    @Override // p149l.ccj
    public void drawFrame() {
        int width = getWidth();
        int height = getHeight();
        long jNanoTime = System.nanoTime();
        if (this.f127577b == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                return;
            } else {
                initFBO();
            }
        }
        GLES20.glBindFramebuffer(36160, this.f127577b[0]);
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClear(16640);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        passShaderValues();
        float[] fArrM221281a = RendererCommon.m221281a(m149468Q1(), RendererCommon.m221282b());
        GLES20.glViewport(0, 0, this.f127584j, height);
        float f = width;
        GLES20.glUniform2f(this.f127593s, fArrM221281a[0] / f, fArrM221281a[1] / f);
        GLES20.glUniform4f(this.f127594t, 0.299f, 0.587f, 0.114f, 0.0f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glViewport(0, height, this.f127585k, this.f127586l);
        GLES20.glUniform2f(this.f127593s, (fArrM221281a[0] * 2.0f) / f, (fArrM221281a[1] * 2.0f) / f);
        GLES20.glUniform4f(this.f127594t, -0.169f, -0.331f, 0.499f, 0.5f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glViewport(this.f127584j / 2, height, this.f127585k, this.f127586l);
        GLES20.glUniform4f(this.f127594t, 0.499f, -0.418f, -0.0813f, 0.5f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
        System.nanoTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f127580e * this.f127581f * 4);
        GLES20.glReadPixels(0, 0, this.f127580e, this.f127581f, 6408, 5121, byteBufferAllocate);
        GLES20.glBindFramebuffer(36160, 0);
        InterfaceC18199a interfaceC18199a = this.f127576a;
        if (interfaceC18199a != null) {
            interfaceC18199a.mo149469a(byteBufferAllocate, jNanoTime);
        }
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nvarying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\nvec2 newCoord;\n uniform float drawType; \nvoid main() {\n  newCoord = vec2(textureCoordinate.x,textureCoordinate.y);  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(inputImageTexture, newCoord + 1.5 * xUnit).rgb);\n}\n";
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \n varying vec2 textureCoordinate;\n \nuniform mat4 texMatrix;\n\nvoid main()\n{\n    gl_Position = position;\n  textureCoordinate = (texMatrix * inputTextureCoordinate).xy;\n}\n";
    }

    @Override // p149l.ccj
    public void handleSizeChange() {
        this.f127582g = getWidth();
        int height = getHeight();
        this.f127583i = height;
        int i = this.f127582g;
        int i2 = (i + 3) / 4;
        this.f127584j = i2;
        this.f127585k = (i + 7) / 8;
        int i3 = (height + 1) / 2;
        this.f127586l = i3;
        int i4 = height + i3;
        this.f127587m = i4;
        this.f127580e = i2;
        this.f127581f = i4;
        initFBO();
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f127592r = GLES20.glGetUniformLocation(this.programHandle, "texMatrix");
        this.f127593s = GLES20.glGetUniformLocation(this.programHandle, "xUnit");
        this.f127594t = GLES20.glGetUniformLocation(this.programHandle, "coeffs");
        this.f127595u = GLES20.glGetUniformLocation(this.programHandle, "drawType");
    }

    @Override // p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        this.texture_in = i;
        setWidth(getWidth());
        setHeight(getHeight());
        onDrawFrame();
        mcjVar.unlockRenderBuffer();
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniformMatrix4fv(this.f127592r, 1, false, m149468Q1(), 0);
    }
}
