package p153l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class r1f extends kt2 implements gul {

    /* JADX INFO: renamed from: J */
    public static final float[] f160811J = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: K */
    public static final float[] f160812K = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: E */
    private FloatBuffer f160814E;

    /* JADX INFO: renamed from: F */
    private FloatBuffer f160815F;

    /* JADX INFO: renamed from: D */
    private int f160813D = -1;

    /* JADX INFO: renamed from: G */
    private volatile boolean f160816G = true;

    /* JADX INFO: renamed from: H */
    private final String f160817H = "precision mediump float;\nattribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main() {\n   gl_Position = position;\n  textureCoordinate = inputTextureCoordinate;\n}";

    /* JADX INFO: renamed from: I */
    private final String f160818I = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES inputImageTexture0;\nvoid main() {\n        gl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\n}";

    public r1f() {
        m179406O();
    }

    /* JADX INFO: renamed from: O */
    private void m179406O() {
        float[] fArr = f160811J;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.f160814E = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.f160814E.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        this.f160815F = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(f160812K);
        this.f160815F.position(0);
    }

    @Override // p153l.hfj
    /* JADX INFO: renamed from: F */
    public void mo134797F() {
        GLES20.glViewport(0, 0, m210702r(), m210701n());
        GLES20.glUseProgram(this.f193943d);
        GLES20.glClearColor(m210700l(), m210699k(), m210698j(), m210697i());
        GLES20.glClear(16640);
        GLES20.glEnableVertexAttribArray(this.f193945f);
        GLES20.glVertexAttribPointer(this.f193945f, 2, 5126, false, 8, (Buffer) this.f160814E);
        GLES20.glEnableVertexAttribArray(this.f193946g);
        GLES20.glVertexAttribPointer(this.f193946g, 2, 5126, false, 8, (Buffer) this.f160815F);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f160813D);
        GLES20.glDrawArrays(5, 0, 4);
        this.f160816G = true;
    }

    /* JADX INFO: renamed from: P */
    public void m179407P(int i) {
        this.f160813D = i;
    }

    @Override // p153l.gul
    /* JADX INFO: renamed from: b */
    public boolean mo132335b() {
        return this.f160816G;
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: m */
    public String mo112466m() {
        return "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES inputImageTexture0;\nvoid main() {\n        gl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\n}";
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: o */
    public String mo112467o() {
        return "precision mediump float;\nattribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main() {\n   gl_Position = position;\n  textureCoordinate = inputTextureCoordinate;\n}";
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: v */
    public void mo134345v() {
        m134802L();
        super.mo134345v();
    }
}
