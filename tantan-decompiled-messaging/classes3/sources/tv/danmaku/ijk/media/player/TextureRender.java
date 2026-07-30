package tv.danmaku.ijk.media.player;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.immomo.baseutil.Rotation;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import l.n8c;
import l.wki0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class TextureRender {
    static final float[] CUBE = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    private static final int FLOAT_SIZE_BYTES = 4;
    private static final String FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private static final String TAG = "TextureRender";
    private static final String VERTEX_SHADER = "uniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = aPosition;\n  vTextureCoord = aTextureCoord;\n}\n";
    private int mOutputHeight;
    private int mOutputWidth;
    private int mProgram;
    private FloatBuffer mSource_coords;
    private final float[] mSource_coordsDate;
    private fakeSurface mSurfce;
    private FloatBuffer mTarget_coords;
    private final float[] mTarget_coordsDate;
    private int maPositionHandle;
    private int maTextureHandle;
    private Rotation mRotation = Rotation.NORMAL;
    private boolean mFlipHorizontal = false;
    private boolean mFlipVertical = false;
    private int mTextureID = -12345;
    private int mImageWidth = 640;
    private int mImageHeight = 352;
    private int mScreenWidth = 960;
    private int mScreenHight = 539;
    private float cut_l = 0.0f;
    private float cut_t = 0.0f;
    private float cut_r = 1.0f;
    private float cut_b = 1.0f;
    private boolean bNeedUpdateRec = true;
    private int vertexShader = 0;
    private int pixelShader = 0;

    public TextureRender(fakeSurface fakesurface) {
        float[] fArr = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        this.mSource_coordsDate = fArr;
        float[] fArr2 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        this.mTarget_coordsDate = fArr2;
        this.mSurfce = null;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mSource_coords = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mTarget_coords = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr2).position(0);
        this.mSurfce = fakesurface;
    }

    private float addDistance(float f, float f2) {
        return f == 0.0f ? f2 : 1.0f - f2;
    }

    private float addDistance2(float f, float f2, float f3) {
        return f == 0.0f ? f2 : f3;
    }

    private int createProgram(String str, String str2) {
        int iLoadShader = loadShader(35633, str);
        this.vertexShader = iLoadShader;
        if (iLoadShader == 0) {
            this.mSurfce.setLastErr(-1);
            return 0;
        }
        int iLoadShader2 = loadShader(35632, str2);
        this.pixelShader = iLoadShader2;
        if (iLoadShader2 == 0) {
            this.mSurfce.setLastErr(-1);
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        checkGlError("glCreateProgram");
        if (iGlCreateProgram == 0) {
            this.mSurfce.setLastErr(-1);
            n8c.a(TAG, "Could not create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, this.vertexShader);
        checkGlError("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, this.pixelShader);
        checkGlError("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        n8c.a(TAG, "Could not link program: ");
        n8c.a(TAG, GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glDeleteProgram(iGlCreateProgram);
        this.mSurfce.setLastErr(-1);
        return 0;
    }

    private int loadShader(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        checkGlError("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        n8c.a(TAG, "Could not compile shader " + i + ":");
        StringBuilder sb = new StringBuilder(" ");
        sb.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        n8c.a(TAG, sb.toString());
        GLES20.glDeleteShader(iGlCreateShader);
        this.mSurfce.setLastErr(-1);
        return 0;
    }

    public void adjustImageScaling() {
        n8c.c(TAG, "adjustImageScaling mOutputWidth:" + this.mOutputWidth + ";outputHeight:" + this.mOutputHeight + ";mImageWidth:" + this.mImageWidth + ";mImageHeight" + this.mImageHeight + ";mRotation:" + this.mRotation);
        int i = this.mOutputWidth;
        float f = (float) i;
        int i2 = this.mOutputHeight;
        float f2 = (float) i2;
        Rotation rotation = this.mRotation;
        if (rotation == Rotation.ROTATION_270 || rotation == Rotation.ROTATION_90) {
            f = i2;
            f2 = i;
        }
        float fMax = Math.max(f / this.mImageWidth, f2 / this.mImageHeight);
        float fRound = Math.round(this.mImageWidth * fMax) / f;
        float fRound2 = Math.round(this.mImageHeight * fMax) / f2;
        float[] fArr = CUBE;
        float[] fArrB = wki0.b(this.mRotation, this.mFlipHorizontal, this.mFlipVertical);
        float f3 = (1.0f - (1.0f / fRound)) / 2.0f;
        float f4 = (1.0f - (1.0f / fRound2)) / 2.0f;
        float[] fArr2 = {addDistance(fArrB[0], f3), addDistance(fArrB[1], f4), addDistance(fArrB[2], f3), addDistance(fArrB[3], f4), addDistance(fArrB[4], f3), addDistance(fArrB[5], f4), addDistance(fArrB[6], f3), addDistance(fArrB[7], f4)};
        this.mTarget_coords.clear();
        this.mTarget_coords.put(fArr).position(0);
        this.mSource_coords.clear();
        this.mSource_coords.put(fArr2).position(0);
    }

    public void adjustImageScaling2() {
        float[] fArr = CUBE;
        float[] fArrB = wki0.b(this.mRotation, this.mFlipHorizontal, this.mFlipVertical);
        float[] fArr2 = {addDistance2(fArrB[0], this.cut_l, this.cut_r), addDistance2(fArrB[1], this.cut_t, this.cut_b), addDistance2(fArrB[2], this.cut_l, this.cut_r), addDistance2(fArrB[3], this.cut_t, this.cut_b), addDistance2(fArrB[4], this.cut_l, this.cut_r), addDistance2(fArrB[5], this.cut_t, this.cut_b), addDistance2(fArrB[6], this.cut_l, this.cut_r), addDistance2(fArrB[7], this.cut_t, this.cut_b)};
        this.mTarget_coords.clear();
        this.mTarget_coords.put(fArr).position(0);
        this.mSource_coords.clear();
        this.mSource_coords.put(fArr2).position(0);
    }

    public void checkGlError(String str) {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            n8c.a(TAG, str + ": glError " + iGlGetError);
            this.mSurfce.setLastErr(-1);
        }
    }

    public void destroy() {
        int i = this.mProgram;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.mProgram = 0;
        }
        int i2 = this.vertexShader;
        if (i2 != 0) {
            GLES20.glDeleteShader(i2);
            this.vertexShader = 0;
        }
        int i3 = this.pixelShader;
        if (i3 != 0) {
            GLES20.glDeleteShader(i3);
            this.pixelShader = 0;
        }
        int i4 = this.mTextureID;
        if (i4 > 0) {
            GLES20.glDeleteTextures(1, new int[]{i4}, 0);
            this.mTextureID = 0;
        }
        n8c.c(TAG, "destroy: ");
    }

    public void drawFrame(SurfaceTexture surfaceTexture) {
        checkGlError("onDrawFrame start");
        if (this.bNeedUpdateRec) {
            adjustImageScaling2();
            this.bNeedUpdateRec = false;
            n8c.c(TAG, "@@@@@@@@@@  drawFrame NeedUpdateRec");
        }
        GLES20.glViewport(0, 0, this.mScreenWidth, this.mScreenHight);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.mProgram);
        checkGlError("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.mTextureID);
        this.mTarget_coords.position(0);
        GLES20.glVertexAttribPointer(this.maPositionHandle, 2, 5126, false, 8, (Buffer) this.mTarget_coords);
        checkGlError("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.maPositionHandle);
        checkGlError("glEnableVertexAttribArray maPositionHandle");
        this.mSource_coords.position(0);
        GLES20.glVertexAttribPointer(this.maTextureHandle, 2, 5126, false, 8, (Buffer) this.mSource_coords);
        checkGlError("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.maTextureHandle);
        checkGlError("glEnableVertexAttribArray maTextureHandle");
        GLES20.glDrawArrays(5, 0, 4);
        checkGlError("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.maPositionHandle);
        GLES20.glDisableVertexAttribArray(this.maTextureHandle);
        GLES20.glBindTexture(3553, 0);
    }

    public void genTex() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.mTextureID = i;
        GLES20.glBindTexture(36197, i);
        checkGlError("glBindTexture mTextureID");
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        checkGlError("glTexParameter");
    }

    public int getTextureId() {
        return this.mTextureID;
    }

    public void surfaceCreated() {
        int iCreateProgram = createProgram(VERTEX_SHADER, FRAGMENT_SHADER);
        this.mProgram = iCreateProgram;
        if (iCreateProgram == 0) {
            n8c.a(TAG, "failed creating program");
            this.mSurfce.setLastErr(-1);
            return;
        }
        this.maPositionHandle = GLES20.glGetAttribLocation(iCreateProgram, "aPosition");
        checkGlError("glGetAttribLocation aPosition");
        if (this.maPositionHandle == -1) {
            n8c.a(TAG, "Could not get attrib location for aPosition");
            this.mSurfce.setLastErr(-1);
            return;
        }
        this.maTextureHandle = GLES20.glGetAttribLocation(this.mProgram, "aTextureCoord");
        checkGlError("glGetAttribLocation aTextureCoord");
        if (this.maTextureHandle == -1) {
            n8c.a(TAG, "Could not get attrib location for aTextureCoord");
            this.mSurfce.setLastErr(-1);
        } else {
            genTex();
            n8c.c(TAG, "surfaceCreated: ");
        }
    }

    public void updateRec(float f, float f2, float f3, float f4) {
        if (this.cut_l == f && this.cut_t == f2 && this.cut_r == f + f3 && this.cut_b == f2 + f4) {
            return;
        }
        this.cut_l = f;
        this.cut_t = f2;
        this.cut_r = f + f3;
        this.cut_b = f2 + f4;
        this.bNeedUpdateRec = true;
        n8c.c(TAG, "@@@@@@@@@@  updateRec:" + f + ":" + f2 + ":" + f3 + ":" + f4);
    }

    public void updateRec(int i, int i2, int i3, int i4) {
        int i5 = (i + 1) & (-3);
        int i6 = (i3 + 1) & (-3);
        if (i5 == this.mImageWidth && i2 == this.mImageHeight && i6 == this.mScreenWidth && i4 == this.mScreenHight) {
            return;
        }
        this.mImageWidth = i5;
        this.mImageHeight = i2;
        this.mScreenWidth = i6;
        this.mOutputWidth = i6;
        this.mScreenHight = i4;
        this.mOutputHeight = i4;
        if (i6 == 0 || i4 == 0) {
            this.mScreenWidth = i6;
            this.mScreenHight = i2;
        }
        if (this.mScreenWidth <= 32 || this.mScreenHight <= 32) {
            this.mScreenWidth = 352;
            this.mImageWidth = 352;
            this.mOutputWidth = 352;
            this.mScreenHight = 640;
            this.mImageHeight = 640;
            this.mOutputHeight = 640;
        }
    }
}
