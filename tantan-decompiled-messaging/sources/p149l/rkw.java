package p149l;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class rkw extends mcj {

    /* JADX INFO: renamed from: u */
    public static final float[] f159892u = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: a */
    private int f159893a;

    /* JADX INFO: renamed from: g */
    private boolean f159899g;

    /* JADX INFO: renamed from: i */
    private Bitmap f159900i;

    /* JADX INFO: renamed from: l */
    private int f159903l;

    /* JADX INFO: renamed from: m */
    private SurfaceTexture f159904m;

    /* JADX INFO: renamed from: o */
    protected int f159906o;

    /* JADX INFO: renamed from: p */
    private int f159907p;

    /* JADX INFO: renamed from: b */
    public SurfaceTexture f159894b = null;

    /* JADX INFO: renamed from: c */
    protected int f159895c = 0;

    /* JADX INFO: renamed from: d */
    private int f159896d = 0;

    /* JADX INFO: renamed from: e */
    private int f159897e = 0;

    /* JADX INFO: renamed from: f */
    protected boolean f159898f = false;

    /* JADX INFO: renamed from: j */
    private int f159901j = -1;

    /* JADX INFO: renamed from: k */
    private int f159902k = -1;

    /* JADX INFO: renamed from: n */
    private int[] f159905n = null;

    /* JADX INFO: renamed from: q */
    private float f159908q = 1.0f;

    /* JADX INFO: renamed from: r */
    private int f159909r = 1;

    /* JADX INFO: renamed from: s */
    private int f159910s = 0;

    /* JADX INFO: renamed from: t */
    private int f159911t = 0;

    public rkw() {
        this.f159899g = true;
        this.f159900i = null;
        this.f159903l = 0;
        this.f159904m = null;
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
        this.f159903l = 0;
        this.f159904m = null;
        this.f159899g = true;
        this.f159900i = null;
    }

    private void bindTexture() {
        GLES20.glActiveTexture(33984);
        if (this.f159899g) {
            GLES20.glBindTexture(36197, this.texture_in);
        } else {
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.texture_in);
        }
    }

    private int bitmapToTexture(Bitmap bitmap) {
        int[] iArr = this.f159905n;
        if (iArr != null) {
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f159905n = null;
        }
        int[] iArr2 = new int[1];
        this.f159905n = iArr2;
        GLES20.glGenTextures(1, iArr2, 0);
        GLES20.glBindTexture(3553, this.f159905n[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        if (bitmap != null && !bitmap.isRecycled()) {
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        }
        return this.f159905n[0];
    }

    public static void updateBitmap(Bitmap bitmap, int i) {
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
    }

    public void changeCurRotation(int i) {
        this.curRotation = 0;
        rotateClockwise90Degrees(i / 90);
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        SurfaceTexture surfaceTexture = this.f159894b;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        SurfaceTexture surfaceTexture2 = this.f159904m;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.f159904m = null;
        }
        this.f159894b = null;
        this.f159903l = 0;
        this.f159904m = null;
        this.f159899g = true;
        this.f159900i = null;
    }

    @Override // p149l.mcj, p149l.ccj
    public void drawFrame() {
        SurfaceTexture surfaceTexture = this.f159894b;
        if (surfaceTexture != null && this.f159895c == 1) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
            this.f159895c = 0;
        }
        if (this.f159898f) {
            handleSizeChange();
            this.f159898f = false;
        }
        super.drawFrame();
    }

    public void flipPosition(int i) {
        float f;
        float f2;
        if (i == 3) {
            setRenderVertices(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
            FloatBuffer[] floatBufferArr = new FloatBuffer[4];
            this.textureVertices = floatBufferArr;
            floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.textureVertices[0].put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
            this.textureVertices[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.textureVertices[1].put(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f}).position(0);
            this.textureVertices[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.textureVertices[2].put(new float[]{1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f}).position(0);
            this.textureVertices[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.textureVertices[3].put(new float[]{1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}).position(0);
            return;
        }
        float f3 = 1.0f;
        float f4 = 0.0f;
        if (i == 0) {
            f = 1.0f;
            f2 = 0.0f;
        } else if (i == 1) {
            f2 = 1.0f;
            f = 0.0f;
            f4 = 1.0f;
            f3 = 0.0f;
        } else if (i != 2) {
            f2 = 1.0f;
            f = 1.0f;
            f3 = 0.0f;
        } else {
            f2 = 0.0f;
            f = 0.0f;
            f4 = 1.0f;
        }
        this.textureVertices[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[0].put(new float[]{f3, f4, f2, f4, f3, f, f2, f}).position(0);
        this.textureVertices[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[1].put(new float[]{f4, f2, f4, f3, f, f2, f, f3}).position(0);
        this.textureVertices[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[2].put(new float[]{f2, f, f3, f, f2, f4, f3, f4}).position(0);
        this.textureVertices[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[3].put(new float[]{f, f3, f, f2, f4, f3, f4, f2}).position(0);
    }

    public SurfaceTexture getBitmapSurfaceTexture() {
        return this.f159904m;
    }

    public int getBitmapTextureID() {
        return this.f159903l;
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
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null) {
            rbjVar.m178606e();
        }
        if (this.useCache) {
            this.glFrameBuffer = ybj.m213953d().m213956c(getWidth(), getHeight());
        } else {
            this.glFrameBuffer = new rbj(getWidth(), getHeight());
        }
        this.glFrameBuffer.m178603b(getWidth(), getHeight());
        this.glFrameBuffer.m178612k(false);
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            if (this.f159898f) {
                this.f159898f = false;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            ysf.m215904a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
        }
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f159893a = GLES20.glGetUniformLocation(this.programHandle, "u_Matrix");
        this.f159906o = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture1");
        this.f159907p = GLES20.glGetUniformLocation(this.programHandle, "oesFlag");
    }

    @Override // p149l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
    }

    public void loadTexture(Bitmap bitmap) {
        if (this.f159899g) {
            return;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            if (this.f159903l == 0 || this.f159904m == null) {
                this.f159901j = bitmap.getWidth();
                int height = bitmap.getHeight();
                this.f159902k = height;
                setRenderSize(this.f159901j, height);
                int iBitmapToTexture = bitmapToTexture(bitmap);
                this.f159903l = iBitmapToTexture;
                if (iBitmapToTexture > 0) {
                    this.f159904m = new SurfaceTexture(this.f159903l);
                    bitmap.recycle();
                }
            } else {
                int height2 = bitmap.getHeight();
                int width = bitmap.getWidth();
                if (height2 == this.f159902k && width == this.f159901j) {
                    updateBitmap(bitmap, this.f159903l);
                } else {
                    this.f159901j = width;
                    this.f159902k = height2;
                    setRenderSize(width, height2);
                    this.f159903l = 0;
                    SurfaceTexture surfaceTexture = this.f159904m;
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                        this.f159904m = null;
                    }
                    this.f159903l = bitmapToTexture(bitmap);
                    this.f159904m = new SurfaceTexture(this.f159903l);
                }
                bitmap.recycle();
            }
        }
        this.texture_in = this.f159903l;
        SurfaceTexture surfaceTexture2 = this.f159904m;
        this.f159894b = surfaceTexture2;
        if (surfaceTexture2 == null) {
            return;
        }
        this.f159895c = 1;
        markAsDirty();
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.textureVertices[this.curRotation].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        boolean z = this.f159899g;
        int i = this.f159907p;
        if (z) {
            GLES20.glUniform1f(i, 1.0f);
        } else {
            GLES20.glUniform1f(i, 0.0f);
        }
        bindTexture();
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glUniform1i(this.f159906o, 1);
        GLES20.glUniformMatrix4fv(this.f159893a, 1, false, f159892u, 0);
    }

    @Override // p149l.mcj, p149l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        this.f159894b = null;
        this.f159899g = true;
        this.f159900i = null;
    }

    @Override // p149l.ccj
    public void setDisplayMode(int i, int i2, int i3) {
        if (this.f159909r == i3 && this.f159911t == i2 && this.f159910s == i) {
            return;
        }
        this.f159909r = i3;
        this.f159911t = i2;
        this.f159910s = i;
        super.setDisplayMode(i, i2, i3);
    }

    public void setOESMode(boolean z) {
        this.f159899g = z;
    }

    @Override // p149l.ccj
    public void setRenderSize(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (i != this.f159897e || i2 != this.f159896d) {
            this.f159898f = true;
            this.f159896d = i2;
            this.f159897e = i;
        }
        if (this.f159898f) {
            super.setRenderSize(i, i2);
        }
    }

    public void loadTexture(int i, SurfaceTexture surfaceTexture) {
        if (this.f159899g) {
            this.texture_in = i;
            this.f159894b = surfaceTexture;
            this.f159895c = 1;
            markAsDirty();
        }
    }
}
