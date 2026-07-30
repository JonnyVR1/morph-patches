package p153l;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class qnw extends gfj {

    /* JADX INFO: renamed from: u */
    public static final float[] f158648u = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: a */
    private int f158649a;

    /* JADX INFO: renamed from: g */
    private boolean f158655g;

    /* JADX INFO: renamed from: i */
    private Bitmap f158656i;

    /* JADX INFO: renamed from: l */
    private int f158659l;

    /* JADX INFO: renamed from: m */
    private SurfaceTexture f158660m;

    /* JADX INFO: renamed from: o */
    protected int f158662o;

    /* JADX INFO: renamed from: p */
    private int f158663p;

    /* JADX INFO: renamed from: b */
    public SurfaceTexture f158650b = null;

    /* JADX INFO: renamed from: c */
    protected int f158651c = 0;

    /* JADX INFO: renamed from: d */
    private int f158652d = 0;

    /* JADX INFO: renamed from: e */
    private int f158653e = 0;

    /* JADX INFO: renamed from: f */
    protected boolean f158654f = false;

    /* JADX INFO: renamed from: j */
    private int f158657j = -1;

    /* JADX INFO: renamed from: k */
    private int f158658k = -1;

    /* JADX INFO: renamed from: n */
    private int[] f158661n = null;

    /* JADX INFO: renamed from: q */
    private float f158664q = 1.0f;

    /* JADX INFO: renamed from: r */
    private int f158665r = 1;

    /* JADX INFO: renamed from: s */
    private int f158666s = 0;

    /* JADX INFO: renamed from: t */
    private int f158667t = 0;

    public qnw() {
        this.f158655g = true;
        this.f158656i = null;
        this.f158659l = 0;
        this.f158660m = null;
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
        this.f158659l = 0;
        this.f158660m = null;
        this.f158655g = true;
        this.f158656i = null;
    }

    private void bindTexture() {
        GLES20.glActiveTexture(33984);
        if (this.f158655g) {
            GLES20.glBindTexture(36197, this.texture_in);
        } else {
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.texture_in);
        }
    }

    private int bitmapToTexture(Bitmap bitmap) {
        int[] iArr = this.f158661n;
        if (iArr != null) {
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f158661n = null;
        }
        int[] iArr2 = new int[1];
        this.f158661n = iArr2;
        GLES20.glGenTextures(1, iArr2, 0);
        GLES20.glBindTexture(3553, this.f158661n[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        if (bitmap != null && !bitmap.isRecycled()) {
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        }
        return this.f158661n[0];
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

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        SurfaceTexture surfaceTexture = this.f158650b;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        SurfaceTexture surfaceTexture2 = this.f158660m;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.f158660m = null;
        }
        this.f158650b = null;
        this.f158659l = 0;
        this.f158660m = null;
        this.f158655g = true;
        this.f158656i = null;
    }

    @Override // p153l.gfj, p153l.wej
    public void drawFrame() {
        SurfaceTexture surfaceTexture = this.f158650b;
        if (surfaceTexture != null && this.f158651c == 1) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
            this.f158651c = 0;
        }
        if (this.f158654f) {
            handleSizeChange();
            this.f158654f = false;
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
        return this.f158660m;
    }

    public int getBitmapTextureID() {
        return this.f158659l;
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
        lej lejVar = this.glFrameBuffer;
        if (lejVar != null) {
            lejVar.m153898e();
        }
        if (this.useCache) {
            this.glFrameBuffer = sej.m185545d().m185548c(getWidth(), getHeight());
        } else {
            this.glFrameBuffer = new lej(getWidth(), getHeight());
        }
        this.glFrameBuffer.m153895b(getWidth(), getHeight());
        this.glFrameBuffer.m153904k(false);
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            if (this.f158654f) {
                this.f158654f = false;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            muf.m160142a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
        }
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f158649a = GLES20.glGetUniformLocation(this.programHandle, "u_Matrix");
        this.f158662o = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture1");
        this.f158663p = GLES20.glGetUniformLocation(this.programHandle, "oesFlag");
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        super.initWithGLContext();
    }

    public void loadTexture(Bitmap bitmap) {
        if (this.f158655g) {
            return;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            if (this.f158659l == 0 || this.f158660m == null) {
                this.f158657j = bitmap.getWidth();
                int height = bitmap.getHeight();
                this.f158658k = height;
                setRenderSize(this.f158657j, height);
                int iBitmapToTexture = bitmapToTexture(bitmap);
                this.f158659l = iBitmapToTexture;
                if (iBitmapToTexture > 0) {
                    this.f158660m = new SurfaceTexture(this.f158659l);
                    bitmap.recycle();
                }
            } else {
                int height2 = bitmap.getHeight();
                int width = bitmap.getWidth();
                if (height2 == this.f158658k && width == this.f158657j) {
                    updateBitmap(bitmap, this.f158659l);
                } else {
                    this.f158657j = width;
                    this.f158658k = height2;
                    setRenderSize(width, height2);
                    this.f158659l = 0;
                    SurfaceTexture surfaceTexture = this.f158660m;
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                        this.f158660m = null;
                    }
                    this.f158659l = bitmapToTexture(bitmap);
                    this.f158660m = new SurfaceTexture(this.f158659l);
                }
                bitmap.recycle();
            }
        }
        this.texture_in = this.f158659l;
        SurfaceTexture surfaceTexture2 = this.f158660m;
        this.f158650b = surfaceTexture2;
        if (surfaceTexture2 == null) {
            return;
        }
        this.f158651c = 1;
        markAsDirty();
    }

    @Override // p153l.wej
    public void passShaderValues() {
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.textureVertices[this.curRotation].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        boolean z = this.f158655g;
        int i = this.f158663p;
        if (z) {
            GLES20.glUniform1f(i, 1.0f);
        } else {
            GLES20.glUniform1f(i, 0.0f);
        }
        bindTexture();
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glUniform1i(this.f158662o, 1);
        GLES20.glUniformMatrix4fv(this.f158649a, 1, false, f158648u, 0);
    }

    @Override // p153l.gfj, p153l.wej
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        this.f158650b = null;
        this.f158655g = true;
        this.f158656i = null;
    }

    @Override // p153l.wej
    public void setDisplayMode(int i, int i2, int i3) {
        if (this.f158665r == i3 && this.f158667t == i2 && this.f158666s == i) {
            return;
        }
        this.f158665r = i3;
        this.f158667t = i2;
        this.f158666s = i;
        super.setDisplayMode(i, i2, i3);
    }

    public void setOESMode(boolean z) {
        this.f158655g = z;
    }

    @Override // p153l.wej
    public void setRenderSize(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (i != this.f158653e || i2 != this.f158652d) {
            this.f158654f = true;
            this.f158652d = i2;
            this.f158653e = i;
        }
        if (this.f158654f) {
            super.setRenderSize(i, i2);
        }
    }

    public void loadTexture(int i, SurfaceTexture surfaceTexture) {
        if (this.f158655g) {
            this.texture_in = i;
            this.f158650b = surfaceTexture;
            this.f158651c = 1;
            markAsDirty();
        }
    }
}
