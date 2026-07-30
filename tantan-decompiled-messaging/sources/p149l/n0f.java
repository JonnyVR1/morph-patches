package p149l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class n0f extends us2 implements trl {

    /* JADX INFO: renamed from: J */
    public static final float[] f136541J = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: K */
    public static final float[] f136542K = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: E */
    private FloatBuffer f136544E;

    /* JADX INFO: renamed from: F */
    private FloatBuffer f136545F;

    /* JADX INFO: renamed from: D */
    private int f136543D = -1;

    /* JADX INFO: renamed from: G */
    private volatile boolean f136546G = true;

    /* JADX INFO: renamed from: H */
    private final String f136547H = "precision mediump float;\nattribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main() {\n   gl_Position = position;\n  textureCoordinate = inputTextureCoordinate;\n}";

    /* JADX INFO: renamed from: I */
    private final String f136548I = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES inputImageTexture0;\nvoid main() {\n        gl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\n}";

    public n0f() {
        m157268O();
    }

    /* JADX INFO: renamed from: O */
    private void m157268O() {
        float[] fArr = f136541J;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.f136544E = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.f136544E.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        this.f136545F = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(f136542K);
        this.f136545F.position(0);
    }

    @Override // p149l.ncj
    /* JADX INFO: renamed from: F */
    public void mo118663F() {
        GLES20.glViewport(0, 0, m110705r(), m110701n());
        GLES20.glUseProgram(this.f85418d);
        GLES20.glClearColor(m110700l(), m110699k(), m110698j(), m110697i());
        GLES20.glClear(16640);
        GLES20.glEnableVertexAttribArray(this.f85420f);
        GLES20.glVertexAttribPointer(this.f85420f, 2, 5126, false, 8, (Buffer) this.f136544E);
        GLES20.glEnableVertexAttribArray(this.f85421g);
        GLES20.glVertexAttribPointer(this.f85421g, 2, 5126, false, 8, (Buffer) this.f136545F);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f136543D);
        GLES20.glDrawArrays(5, 0, 4);
        this.f136546G = true;
    }

    /* JADX INFO: renamed from: P */
    public void m157269P(int i) {
        this.f136543D = i;
    }

    @Override // p149l.trl
    /* JADX INFO: renamed from: b */
    public boolean mo157270b() {
        return this.f136546G;
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: m */
    public String mo102573m() {
        return "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES inputImageTexture0;\nvoid main() {\n        gl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\n}";
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: o */
    public String mo110702o() {
        return "precision mediump float;\nattribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main() {\n   gl_Position = position;\n  textureCoordinate = inputTextureCoordinate;\n}";
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: v */
    public void mo110709v() {
        m158950L();
        super.mo110709v();
    }
}
