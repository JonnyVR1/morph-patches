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
class TextureRenderExt {
    static final float[] CUBE = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    private static final int FLOAT_SIZE_BYTES = 4;
    private static final String FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float displayPos; \nuniform float heightInv; \nuniform float widthInv; \nuniform int width; \nuniform int halfShow;\nuniform int deblurEnabled;\nuniform float weight; \nuniform float threshold;\nuniform float saturation;\nvec3 luminanceWeighting=vec3(0.2125,0.7154,0.0721);\nvoid main() {\n  vec4 imageC = texture2D(sTexture, vTextureCoord);\n  vec4 imageH = imageC-\n            (texture2D(sTexture, clamp(vTextureCoord+vec2(-widthInv,-heightInv),0.0,1.0))*0.08\n            +texture2D(sTexture, clamp(vTextureCoord+vec2(      0.0,-heightInv),0.0,1.0))*0.12\n            +texture2D(sTexture, clamp(vTextureCoord+vec2( widthInv,-heightInv),0.0,1.0))*0.08\n            +texture2D(sTexture, clamp(vTextureCoord+vec2(-widthInv,       0.0),0.0,1.0))*0.12\n            +texture2D(sTexture, clamp(vTextureCoord+vec2( widthInv,       0.0),0.0,1.0))*0.12\n            +texture2D(sTexture, clamp(vTextureCoord+vec2(-widthInv, heightInv),0.0,1.0))*0.08\n            +texture2D(sTexture, clamp(vTextureCoord+vec2(      0.0, heightInv),0.0,1.0))*0.12\n            +texture2D(sTexture, clamp(vTextureCoord+vec2( widthInv, heightInv),0.0,1.0))*0.08\n            +imageC*0.2);\n  vec4 imageM = imageC;\n  vec4 diff = abs(imageH);\n  if (diff.r>threshold || diff.g>threshold || diff.b>threshold) imageM=clamp(imageC+imageH*weight,0.0,1.0);\n  float luminance = dot(imageM.rgb,luminanceWeighting);\n  vec3 greyScaleColor = vec3(luminance);\n  vec4 imageS=vec4(mix(greyScaleColor,imageM.rgb,saturation), imageM.w);\n  vec4 image = imageC;\n  if (deblurEnabled == 1 && (((vTextureCoord.x < displayPos) && halfShow==1) || halfShow==0)) {\n    image = imageS;\n   }\n  if ((abs(vTextureCoord.x-displayPos)<=(widthInv*1.0))&&deblurEnabled==1 && halfShow==1) {gl_FragColor=vec4(0.5,0.5,0.5,1.0);}else {gl_FragColor=image;}\n}\n";
    private static final String TAG = "TextureRender";
    private static final String VERTEX_SHADER = "uniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = aPosition;\n  vTextureCoord = aTextureCoord;\n}\n";
    private static final float weightAmp = 3.0f;
    private int mEnabledLocation;
    private int mHalfShowLocation;
    private int mImageDisplayLocation;
    private int mImageHeightStepLocation;
    private int mImageSaturationLocation;
    private int mImageThresholdLocation;
    private int mImageWeightLocation;
    private int mImageWidthStepLocation;
    private int mImageWidthocation;
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
    private int mDisplayPos = 1;
    private boolean mDisplayPosIncreasing = true;
    private float mDeblurWeight = 0.45f;
    private int mDeblurRadius = 1;
    private float mDeblurThreshold = 0.012f;
    private float mSaturation = 1.0f;
    private boolean mDeblurEnabled = false;
    private int mHalfShow = 0;

    public TextureRenderExt(fakeSurface fakesurface) {
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

    private int createProgram(String str, String str2) {
        int iLoadShader = loadShader(35633, str);
        if (iLoadShader == 0) {
            this.mSurfce.setLastErr(-1);
            return 0;
        }
        int iLoadShader2 = loadShader(35632, str2);
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
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
        checkGlError("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader2);
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
        int i = this.mOutputWidth;
        float f = i;
        int i2 = this.mOutputHeight;
        float f2 = i2;
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

    public void drawFrame(SurfaceTexture surfaceTexture) {
        checkGlError("onDrawFrame start");
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glUseProgram(this.mProgram);
        checkGlError("glUseProgram");
        boolean z = this.mDisplayPosIncreasing;
        int i = this.mDisplayPos;
        if (z) {
            this.mDisplayPos = i + 1;
        } else {
            this.mDisplayPos = i - 1;
        }
        int i2 = this.mDisplayPos;
        int i3 = this.mImageWidth;
        if (i2 >= i3) {
            this.mDisplayPosIncreasing = false;
        } else if (i2 <= 0) {
            this.mDisplayPosIncreasing = true;
        }
        float f = 1.0f / i3;
        float f2 = 1.0f / this.mImageHeight;
        GLES20.glUniform1f(this.mImageWidthStepLocation, f);
        GLES20.glUniform1f(this.mImageHeightStepLocation, f2);
        GLES20.glUniform1f(this.mImageDisplayLocation, (this.mDisplayPos * 1.0f) / this.mImageWidth);
        GLES20.glUniform1i(this.mImageWidthocation, this.mImageWidth);
        GLES20.glUniform1f(this.mImageWeightLocation, this.mDeblurWeight * weightAmp);
        GLES20.glUniform1i(this.mHalfShowLocation, this.mHalfShow);
        GLES20.glUniform1i(this.mEnabledLocation, this.mDeblurEnabled ? 1 : 0);
        GLES20.glUniform1f(this.mImageSaturationLocation, this.mSaturation);
        GLES20.glUniform1f(this.mImageThresholdLocation, this.mDeblurThreshold);
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
        GLES20.glFinish();
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

    public void setDeblurEnabled(boolean z) {
        n8c.c(TAG, "setDeblurEnabled:" + this.mDeblurEnabled + "--->" + z);
        this.mDeblurEnabled = z;
    }

    public void setDeblurWeight(float f) {
        n8c.c(TAG, "setDeblurWeight:" + this.mDeblurWeight + "--->" + f);
        this.mDeblurWeight = f;
    }

    public void setSaturation(float f) {
        n8c.c(TAG, "setSaturation:" + this.mSaturation + "--->" + f);
        this.mSaturation = f;
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
            return;
        }
        genTex();
        this.mImageWidthStepLocation = GLES20.glGetUniformLocation(this.mProgram, "widthInv");
        this.mImageHeightStepLocation = GLES20.glGetUniformLocation(this.mProgram, "HeightInv");
        this.mImageDisplayLocation = GLES20.glGetUniformLocation(this.mProgram, "displayPos");
        this.mImageWidthocation = GLES20.glGetUniformLocation(this.mProgram, IjkMediaMeta.IJKM_KEY_WIDTH);
        this.mImageWeightLocation = GLES20.glGetUniformLocation(this.mProgram, "weight");
        this.mHalfShowLocation = GLES20.glGetUniformLocation(this.mProgram, "halfShow");
        this.mEnabledLocation = GLES20.glGetUniformLocation(this.mProgram, "deblurEnabled");
        this.mImageSaturationLocation = GLES20.glGetUniformLocation(this.mProgram, "saturation");
        this.mImageThresholdLocation = GLES20.glGetUniformLocation(this.mProgram, "threshold");
    }

    public void updateRec(int i, int i2, int i3, int i4) {
        this.mImageWidth = ((i + 1) / 2) * 2;
        this.mImageHeight = i2;
        int i5 = ((i3 + 1) / 2) * 2;
        this.mScreenWidth = i5;
        this.mOutputWidth = i5;
        this.mScreenHight = i4;
        this.mOutputHeight = i4;
        if (i5 == 0 || i4 == 0) {
            this.mScreenWidth = i5;
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
        GLES20.glViewport(0, 0, this.mScreenWidth, this.mScreenHight);
        adjustImageScaling();
    }
}
