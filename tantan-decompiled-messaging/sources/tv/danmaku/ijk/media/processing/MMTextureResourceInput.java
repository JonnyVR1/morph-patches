package tv.danmaku.ijk.media.processing;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.clevertap.android.sdk.Constants;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p149l.mcj;
import p149l.n8c;

/* JADX INFO: loaded from: classes3.dex */
public class MMTextureResourceInput extends mcj {

    /* JADX INFO: renamed from: u */
    private static final String f208130u = "tv.danmaku.ijk.media.processing.MMTextureResourceInput";

    /* JADX INFO: renamed from: v */
    public static final float[] f208131v = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: a */
    private int f208132a;

    /* JADX INFO: renamed from: g */
    private boolean f208138g;

    /* JADX INFO: renamed from: i */
    private Bitmap f208139i;

    /* JADX INFO: renamed from: l */
    private int f208142l;

    /* JADX INFO: renamed from: m */
    private SurfaceTexture f208143m;

    /* JADX INFO: renamed from: o */
    protected int f208145o;

    /* JADX INFO: renamed from: p */
    private int f208146p;

    /* JADX INFO: renamed from: b */
    public SurfaceTexture f208133b = null;

    /* JADX INFO: renamed from: c */
    private int f208134c = 0;

    /* JADX INFO: renamed from: d */
    private int f208135d = 0;

    /* JADX INFO: renamed from: e */
    private int f208136e = 0;

    /* JADX INFO: renamed from: f */
    private boolean f208137f = false;

    /* JADX INFO: renamed from: j */
    private int f208140j = -1;

    /* JADX INFO: renamed from: k */
    private int f208141k = -1;

    /* JADX INFO: renamed from: n */
    private int[] f208144n = null;

    /* JADX INFO: renamed from: q */
    private float f208147q = 1.0f;

    /* JADX INFO: renamed from: r */
    private int f208148r = 1;

    /* JADX INFO: renamed from: s */
    private int f208149s = 0;

    /* JADX INFO: renamed from: t */
    private int f208150t = 0;

    public MMTextureResourceInput() {
        this.f208138g = true;
        this.f208139i = null;
        this.f208142l = 0;
        this.f208143m = null;
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
        this.f208142l = 0;
        this.f208143m = null;
        this.f208138g = true;
        this.f208139i = null;
    }

    private void bindTexture() {
        GLES20.glActiveTexture(33984);
        if (this.f208138g) {
            GLES20.glBindTexture(36197, this.texture_in);
        } else {
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.texture_in);
        }
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        SurfaceTexture surfaceTexture = this.f208143m;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f208143m = null;
        }
        this.f208133b = null;
        this.f208142l = 0;
        this.f208143m = null;
        this.f208138g = true;
        this.f208139i = null;
        n8c.m158485c(f208130u, "----destroy");
    }

    @Override // p149l.mcj, p149l.ccj
    public void drawFrame() {
        SurfaceTexture surfaceTexture = this.f208133b;
        if (surfaceTexture != null && this.f208134c == 1) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
                n8c.m158483a(f208130u, " mSurfaceTexture.updateTexImage exception ");
            }
            this.f208134c = 0;
        }
        if (this.f208137f) {
            handleSizeChange();
            this.f208137f = false;
        }
        super.drawFrame();
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvarying float oes_flag; \nvoid main() {\nif (oes_flag ==1.0) {   gl_FragColor = texture2D(inputImageTexture0, textureCoordinate);\n} else { \ngl_FragColor = texture2D(inputImageTexture1, textureCoordinate);} \n}\n";
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return "uniform mat4 u_Matrix;\nattribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float oesFlag; \nvarying float oes_flag; \nvoid main() {\n   oes_flag = oesFlag; \n   vec4 texPos = u_Matrix * vec4(inputTextureCoordinate, 1, 1);\n   textureCoordinate = texPos.xy;\n   gl_Position = position;\n}\n";
    }

    @Override // p149l.mcj
    public void initFBO() {
        super.initFBO();
        if (this.f208137f) {
            this.f208137f = false;
        }
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f208132a = GLES20.glGetUniformLocation(this.programHandle, "u_Matrix");
        this.f208145o = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture1");
        this.f208146p = GLES20.glGetUniformLocation(this.programHandle, "oesFlag");
    }

    @Override // p149l.ccj
    public void initWithGLContext() {
        n8c.m158485c(f208130u, "----initWithGLContext");
        super.initWithGLContext();
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.textureVertices[this.curRotation].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        boolean z = this.f208138g;
        int i = this.f208146p;
        if (z) {
            GLES20.glUniform1f(i, 1.0f);
        } else {
            GLES20.glUniform1f(i, 0.0f);
        }
        bindTexture();
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glUniform1i(this.f208145o, 1);
        GLES20.glUniformMatrix4fv(this.f208132a, 1, false, f208131v, 0);
    }

    @Override // p149l.ccj
    public void setDisplayMode(int i, int i2, int i3) {
        if (this.f208148r == i3 && this.f208150t == i2 && this.f208149s == i) {
            return;
        }
        n8c.m158485c(f208130u, "----setDisplayMode: (w,h,t)=(" + i + Constants.SEPARATOR_COMMA + i2 + Constants.SEPARATOR_COMMA + i3 + "<---(" + this.f208149s + Constants.SEPARATOR_COMMA + this.f208150t + Constants.SEPARATOR_COMMA + this.f208148r + ")");
        this.f208148r = i3;
        this.f208150t = i2;
        this.f208149s = i;
        super.setDisplayMode(i, i2, i3);
    }

    @Override // p149l.ccj
    public void setRenderSize(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (i != this.f208136e || i2 != this.f208135d) {
            n8c.m158485c(f208130u, "----size: [" + i + ", " + i2 + "]<---[" + this.f208136e + Constants.SEPARATOR_COMMA + this.f208135d + Constants.AES_SUFFIX);
            this.f208137f = true;
            this.f208135d = i2;
            this.f208136e = i;
        }
        if (this.f208137f) {
            super.setRenderSize(i, i2);
        }
    }
}
