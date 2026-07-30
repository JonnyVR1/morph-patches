package com.momo.mcamera.mask.videomix;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p153l.gfj;
import p153l.lej;
import p153l.muf;

/* JADX INFO: loaded from: classes8.dex */
public class MMTextureResourceInput1 extends gfj {
    public static final int FLIP_BOTH = 2;
    public static final int FLIP_HORIZONTAL = 1;
    public static final int FLIP_NONE = 3;
    public static final int FLIP_VERTICAL = 0;
    private static final String TAG = "com.momo.mcamera.mask.videomix.MMTextureResourceInput1";
    private static final String UNIFORM_CAM_MATRIX = "u_Matrix";
    public static final String UNIFORM_TEXTURE1 = "inputImageTexture1";
    public static final float[] identityMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private Bitmap mBitmap;
    private boolean mIsOES;
    private int mOESLocation;
    private SurfaceTexture mSurfaceTextureBitmap;
    private int mTextureIDBitmap;
    private int matrixHandle;
    protected int textureHandle1;
    public SurfaceTexture mText = null;
    protected int updateText = 0;
    private int mHeightOutput = 0;
    private int mWidthOutput = 0;
    protected boolean mSizeChanged = false;
    private int mBitmapWidth = -1;
    private int mBitmapHeight = -1;
    private int[] mTextureTex = null;
    private float mOES = 1.0f;
    private int mDisplayMode = 1;
    private int mInputWidth = 0;
    private int mInputHeight = 0;

    public MMTextureResourceInput1() {
        this.mIsOES = true;
        this.mBitmap = null;
        this.mTextureIDBitmap = 0;
        this.mSurfaceTextureBitmap = null;
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
        this.mTextureIDBitmap = 0;
        this.mSurfaceTextureBitmap = null;
        this.mIsOES = true;
        this.mBitmap = null;
    }

    private void bindTexture() {
        GLES20.glActiveTexture(33984);
        if (this.mIsOES) {
            GLES20.glBindTexture(36197, this.texture_in);
        } else {
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.texture_in);
        }
    }

    private int bitmapToTexture(Bitmap bitmap) {
        int[] iArr = this.mTextureTex;
        if (iArr != null) {
            GLES20.glDeleteTextures(1, iArr, 0);
            this.mTextureTex = null;
        }
        int[] iArr2 = new int[1];
        this.mTextureTex = iArr2;
        GLES20.glGenTextures(1, iArr2, 0);
        GLES20.glBindTexture(3553, this.mTextureTex[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        if (bitmap != null && !bitmap.isRecycled()) {
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        }
        return this.mTextureTex[0];
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
        SurfaceTexture surfaceTexture = this.mText;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        SurfaceTexture surfaceTexture2 = this.mSurfaceTextureBitmap;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.mSurfaceTextureBitmap = null;
        }
        this.mText = null;
        this.mTextureIDBitmap = 0;
        this.mSurfaceTextureBitmap = null;
        this.mIsOES = true;
        this.mBitmap = null;
    }

    public void drawImageFrame() {
        drawFrame();
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
        return this.mSurfaceTextureBitmap;
    }

    public int getBitmapTextureID() {
        return this.mTextureIDBitmap;
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
        lej lejVar2 = new lej(getWidth(), getHeight());
        this.glFrameBuffer = lejVar2;
        lejVar2.m153895b(getWidth(), getHeight());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            if (this.mSizeChanged) {
                this.mSizeChanged = false;
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
        this.matrixHandle = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_CAM_MATRIX);
        this.textureHandle1 = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture1");
        this.mOESLocation = GLES20.glGetUniformLocation(this.programHandle, "oesFlag");
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        super.initWithGLContext();
    }

    public void loadTexture(Bitmap bitmap) {
        if (this.mIsOES) {
            return;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            if (this.mTextureIDBitmap == 0 || this.mSurfaceTextureBitmap == null) {
                this.mBitmapWidth = bitmap.getWidth();
                int height = bitmap.getHeight();
                this.mBitmapHeight = height;
                setRenderSize(this.mBitmapWidth, height);
                int iBitmapToTexture = bitmapToTexture(bitmap);
                this.mTextureIDBitmap = iBitmapToTexture;
                if (iBitmapToTexture > 0) {
                    this.mSurfaceTextureBitmap = new SurfaceTexture(this.mTextureIDBitmap);
                    bitmap.recycle();
                }
            } else {
                int height2 = bitmap.getHeight();
                int width = bitmap.getWidth();
                if (height2 == this.mBitmapHeight && width == this.mBitmapWidth) {
                    updateBitmap(bitmap, this.mTextureIDBitmap);
                } else {
                    this.mBitmapWidth = width;
                    this.mBitmapHeight = height2;
                    setRenderSize(width, height2);
                    this.mTextureIDBitmap = 0;
                    SurfaceTexture surfaceTexture = this.mSurfaceTextureBitmap;
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                        this.mSurfaceTextureBitmap = null;
                    }
                    this.mTextureIDBitmap = bitmapToTexture(bitmap);
                    this.mSurfaceTextureBitmap = new SurfaceTexture(this.mTextureIDBitmap);
                }
                bitmap.recycle();
            }
        }
        this.texture_in = this.mTextureIDBitmap;
        SurfaceTexture surfaceTexture2 = this.mSurfaceTextureBitmap;
        this.mText = surfaceTexture2;
        if (surfaceTexture2 == null) {
            return;
        }
        this.updateText = 1;
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
        boolean z = this.mIsOES;
        int i = this.mOESLocation;
        if (z) {
            GLES20.glUniform1f(i, 1.0f);
        } else {
            GLES20.glUniform1f(i, 0.0f);
        }
        bindTexture();
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glUniform1i(this.textureHandle1, 1);
        GLES20.glUniformMatrix4fv(this.matrixHandle, 1, false, identityMatrix, 0);
    }

    @Override // p153l.gfj, p153l.wej
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        this.mText = null;
        this.mIsOES = true;
        this.mBitmap = null;
    }

    @Override // p153l.wej
    public void setDisplayMode(int i, int i2, int i3) {
        if (this.mDisplayMode == i3 && this.mInputHeight == i2 && this.mInputWidth == i) {
            return;
        }
        this.mDisplayMode = i3;
        this.mInputHeight = i2;
        this.mInputWidth = i;
        super.setDisplayMode(i, i2, i3);
    }

    public void setOESMode(boolean z) {
        this.mIsOES = z;
    }

    @Override // p153l.wej
    public void setRenderSize(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (i != this.mWidthOutput || i2 != this.mHeightOutput) {
            this.mSizeChanged = true;
            this.mHeightOutput = i2;
            this.mWidthOutput = i;
        }
        if (this.mSizeChanged) {
            super.setRenderSize(i, i2);
        }
    }

    public void updateYUVBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
    }

    public void loadTexture(int i, SurfaceTexture surfaceTexture) {
        if (this.mIsOES) {
            this.texture_in = i;
            this.mText = surfaceTexture;
            this.updateText = 1;
            markAsDirty();
        }
    }
}
