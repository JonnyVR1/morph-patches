package tv.danmaku.ijk.media.processing;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import l.n8c;
import p003l.mcj;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MMTextureResourceInput extends mcj {

    /* JADX INFO: renamed from: u */
    private static final String f11755u = "tv.danmaku.ijk.media.processing.MMTextureResourceInput";

    /* JADX INFO: renamed from: v */
    public static final float[] f11756v = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: a */
    private int f11757a;

    /* JADX INFO: renamed from: g */
    private boolean f11763g;

    /* JADX INFO: renamed from: i */
    private Bitmap f11764i;

    /* JADX INFO: renamed from: l */
    private int f11767l;

    /* JADX INFO: renamed from: m */
    private SurfaceTexture f11768m;

    /* JADX INFO: renamed from: o */
    protected int f11770o;

    /* JADX INFO: renamed from: p */
    private int f11771p;

    /* JADX INFO: renamed from: b */
    public SurfaceTexture f11758b = null;

    /* JADX INFO: renamed from: c */
    private int f11759c = 0;

    /* JADX INFO: renamed from: d */
    private int f11760d = 0;

    /* JADX INFO: renamed from: e */
    private int f11761e = 0;

    /* JADX INFO: renamed from: f */
    private boolean f11762f = false;

    /* JADX INFO: renamed from: j */
    private int f11765j = -1;

    /* JADX INFO: renamed from: k */
    private int f11766k = -1;

    /* JADX INFO: renamed from: n */
    private int[] f11769n = null;

    /* JADX INFO: renamed from: q */
    private float f11772q = 1.0f;

    /* JADX INFO: renamed from: r */
    private int f11773r = 1;

    /* JADX INFO: renamed from: s */
    private int f11774s = 0;

    /* JADX INFO: renamed from: t */
    private int f11775t = 0;

    public MMTextureResourceInput() {
        this.f11763g = true;
        this.f11764i = null;
        this.f11767l = 0;
        this.f11768m = null;
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
        this.f11767l = 0;
        this.f11768m = null;
        this.f11763g = true;
        this.f11764i = null;
    }

    private void bindTexture() {
        GLES20.glActiveTexture(33984);
        if (this.f11763g) {
            GLES20.glBindTexture(36197, this.texture_in);
        } else {
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.texture_in);
        }
    }

    @Override // p003l.mcj, p003l.ccj
    public void destroy() {
        super.destroy();
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        SurfaceTexture surfaceTexture = this.f11768m;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f11768m = null;
        }
        this.f11758b = null;
        this.f11767l = 0;
        this.f11768m = null;
        this.f11763g = true;
        this.f11764i = null;
        n8c.c(f11755u, "----destroy");
    }

    @Override // p003l.mcj, p003l.ccj
    public void drawFrame() {
        SurfaceTexture surfaceTexture = this.f11758b;
        if (surfaceTexture != null && this.f11759c == 1) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
                n8c.a(f11755u, " mSurfaceTexture.updateTexImage exception ");
            }
            this.f11759c = 0;
        }
        if (this.f11762f) {
            handleSizeChange();
            this.f11762f = false;
        }
        super.drawFrame();
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvarying float oes_flag; \nvoid main() {\nif (oes_flag ==1.0) {   gl_FragColor = texture2D(inputImageTexture0, textureCoordinate);\n} else { \ngl_FragColor = texture2D(inputImageTexture1, textureCoordinate);} \n}\n";
    }

    @Override // p003l.ccj
    public String getVertexShader() {
        return "uniform mat4 u_Matrix;\nattribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float oesFlag; \nvarying float oes_flag; \nvoid main() {\n   oes_flag = oesFlag; \n   vec4 texPos = u_Matrix * vec4(inputTextureCoordinate, 1, 1);\n   textureCoordinate = texPos.xy;\n   gl_Position = position;\n}\n";
    }

    @Override // p003l.mcj
    public void initFBO() {
        super.initFBO();
        if (this.f11762f) {
            this.f11762f = false;
        }
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f11757a = GLES20.glGetUniformLocation(this.programHandle, "u_Matrix");
        this.f11770o = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture1");
        this.f11771p = GLES20.glGetUniformLocation(this.programHandle, "oesFlag");
    }

    @Override // p003l.ccj
    public void initWithGLContext() {
        n8c.c(f11755u, "----initWithGLContext");
        super.initWithGLContext();
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.textureVertices[this.curRotation].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        boolean z = this.f11763g;
        int i = this.f11771p;
        if (z) {
            GLES20.glUniform1f(i, 1.0f);
        } else {
            GLES20.glUniform1f(i, 0.0f);
        }
        bindTexture();
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glUniform1i(this.f11770o, 1);
        GLES20.glUniformMatrix4fv(this.f11757a, 1, false, f11756v, 0);
    }

    @Override // p003l.ccj
    public void setDisplayMode(int i, int i2, int i3) {
        if (this.f11773r == i3 && this.f11775t == i2 && this.f11774s == i) {
            return;
        }
        n8c.c(f11755u, "----setDisplayMode: (w,h,t)=(" + i + "," + i2 + "," + i3 + "<---(" + this.f11774s + "," + this.f11775t + "," + this.f11773r + ")");
        this.f11773r = i3;
        this.f11775t = i2;
        this.f11774s = i;
        super.setDisplayMode(i, i2, i3);
    }

    @Override // p003l.ccj
    public void setRenderSize(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (i != this.f11761e || i2 != this.f11760d) {
            n8c.c(f11755u, "----size: [" + i + ", " + i2 + "]<---[" + this.f11761e + "," + this.f11760d + "]");
            this.f11762f = true;
            this.f11760d = i2;
            this.f11761e = i;
        }
        if (this.f11762f) {
            super.setRenderSize(i, i2);
        }
    }
}
