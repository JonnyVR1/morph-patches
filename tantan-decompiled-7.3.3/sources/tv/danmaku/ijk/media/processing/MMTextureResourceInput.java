package tv.danmaku.ijk.media.processing;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.clevertap.android.sdk.Constants;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p153l.gfj;
import p153l.t9c;

/* JADX INFO: loaded from: classes3.dex */
public class MMTextureResourceInput extends gfj {

    /* JADX INFO: renamed from: u */
    private static final String f209052u = "tv.danmaku.ijk.media.processing.MMTextureResourceInput";

    /* JADX INFO: renamed from: v */
    public static final float[] f209053v = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: a */
    private int f209054a;

    /* JADX INFO: renamed from: g */
    private boolean f209060g;

    /* JADX INFO: renamed from: i */
    private Bitmap f209061i;

    /* JADX INFO: renamed from: l */
    private int f209064l;

    /* JADX INFO: renamed from: m */
    private SurfaceTexture f209065m;

    /* JADX INFO: renamed from: o */
    protected int f209067o;

    /* JADX INFO: renamed from: p */
    private int f209068p;

    /* JADX INFO: renamed from: b */
    public SurfaceTexture f209055b = null;

    /* JADX INFO: renamed from: c */
    private int f209056c = 0;

    /* JADX INFO: renamed from: d */
    private int f209057d = 0;

    /* JADX INFO: renamed from: e */
    private int f209058e = 0;

    /* JADX INFO: renamed from: f */
    private boolean f209059f = false;

    /* JADX INFO: renamed from: j */
    private int f209062j = -1;

    /* JADX INFO: renamed from: k */
    private int f209063k = -1;

    /* JADX INFO: renamed from: n */
    private int[] f209066n = null;

    /* JADX INFO: renamed from: q */
    private float f209069q = 1.0f;

    /* JADX INFO: renamed from: r */
    private int f209070r = 1;

    /* JADX INFO: renamed from: s */
    private int f209071s = 0;

    /* JADX INFO: renamed from: t */
    private int f209072t = 0;

    public MMTextureResourceInput() {
        this.f209060g = true;
        this.f209061i = null;
        this.f209064l = 0;
        this.f209065m = null;
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
        this.f209064l = 0;
        this.f209065m = null;
        this.f209060g = true;
        this.f209061i = null;
    }

    private void bindTexture() {
        GLES20.glActiveTexture(33984);
        if (this.f209060g) {
            GLES20.glBindTexture(36197, this.texture_in);
        } else {
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.texture_in);
        }
    }

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        SurfaceTexture surfaceTexture = this.f209065m;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f209065m = null;
        }
        this.f209055b = null;
        this.f209064l = 0;
        this.f209065m = null;
        this.f209060g = true;
        this.f209061i = null;
        t9c.m189745c(f209052u, "----destroy");
    }

    @Override // p153l.gfj, p153l.wej
    public void drawFrame() {
        SurfaceTexture surfaceTexture = this.f209055b;
        if (surfaceTexture != null && this.f209056c == 1) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
                t9c.m189743a(f209052u, " mSurfaceTexture.updateTexImage exception ");
            }
            this.f209056c = 0;
        }
        if (this.f209059f) {
            handleSizeChange();
            this.f209059f = false;
        }
        super.drawFrame();
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvarying float oes_flag; \nvoid main() {\nif (oes_flag ==1.0) {   gl_FragColor = texture2D(inputImageTexture0, textureCoordinate);\n} else { \ngl_FragColor = texture2D(inputImageTexture1, textureCoordinate);} \n}\n";
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return "uniform mat4 u_Matrix;\nattribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float oesFlag; \nvarying float oes_flag; \nvoid main() {\n   oes_flag = oesFlag; \n   vec4 texPos = u_Matrix * vec4(inputTextureCoordinate, 1, 1);\n   textureCoordinate = texPos.xy;\n   gl_Position = position;\n}\n";
    }

    @Override // p153l.gfj
    public void initFBO() {
        super.initFBO();
        if (this.f209059f) {
            this.f209059f = false;
        }
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f209054a = GLES20.glGetUniformLocation(this.programHandle, "u_Matrix");
        this.f209067o = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture1");
        this.f209068p = GLES20.glGetUniformLocation(this.programHandle, "oesFlag");
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        t9c.m189745c(f209052u, "----initWithGLContext");
        super.initWithGLContext();
    }

    @Override // p153l.wej
    public void passShaderValues() {
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.textureVertices[this.curRotation].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        boolean z = this.f209060g;
        int i = this.f209068p;
        if (z) {
            GLES20.glUniform1f(i, 1.0f);
        } else {
            GLES20.glUniform1f(i, 0.0f);
        }
        bindTexture();
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glUniform1i(this.f209067o, 1);
        GLES20.glUniformMatrix4fv(this.f209054a, 1, false, f209053v, 0);
    }

    @Override // p153l.wej
    public void setDisplayMode(int i, int i2, int i3) {
        if (this.f209070r == i3 && this.f209072t == i2 && this.f209071s == i) {
            return;
        }
        t9c.m189745c(f209052u, "----setDisplayMode: (w,h,t)=(" + i + Constants.SEPARATOR_COMMA + i2 + Constants.SEPARATOR_COMMA + i3 + "<---(" + this.f209071s + Constants.SEPARATOR_COMMA + this.f209072t + Constants.SEPARATOR_COMMA + this.f209070r + ")");
        this.f209070r = i3;
        this.f209072t = i2;
        this.f209071s = i;
        super.setDisplayMode(i, i2, i3);
    }

    @Override // p153l.wej
    public void setRenderSize(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (i != this.f209058e || i2 != this.f209057d) {
            t9c.m189745c(f209052u, "----size: [" + i + ", " + i2 + "]<---[" + this.f209058e + Constants.SEPARATOR_COMMA + this.f209057d + Constants.AES_SUFFIX);
            this.f209059f = true;
            this.f209057d = i2;
            this.f209058e = i;
        }
        if (this.f209059f) {
            super.setRenderSize(i, i2);
        }
    }
}
