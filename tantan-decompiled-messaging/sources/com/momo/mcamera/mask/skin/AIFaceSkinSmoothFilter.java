package com.momo.mcamera.mask.skin;

import android.opengl.GLES20;
import com.momo.mcamera.mask.FaceDetectFilter;
import com.momo.mcamera.mask.Sticker;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p149l.pjw;

/* JADX INFO: loaded from: classes7.dex */
public class AIFaceSkinSmoothFilter extends FaceDetectFilter {
    private FloatBuffer mBufferTex;
    private FloatBuffer mBufferVer;
    private ByteBuffer mByteBufTex;
    private ByteBuffer mByteBufVer;
    private int mDefaultSkinThresholdHandle;
    private int mFaceWidthHandle;
    private int mHighSkinThresholdHandle;
    private int mLowSkinThresholdHandle;
    private pjw mMmcvInfo;
    private int mSkinSmoothScaleHandle;
    private float mTexelHeight;
    private int mTexelHeightHandle;
    private float mTexelWidth;
    private int mTexelWidthHandle;
    private int mWinSize = 6;
    private int[] mLowSkinThreshold = {0, 0, 0};
    private int[] mHighSkinThreshold = {255, 255, 255};
    private int[] mDefaultSkinThreshold = {160, 120, 110};
    private float mSkinSmoothScale = 0.0f;
    private float mMMCVWidth = 0.0f;
    private float mMMCVHeight = 0.0f;

    public AIFaceSkinSmoothFilter() {
        init(6);
        setBackgroundColour(0.5f, 0.5f, 0.5f, 1.0f);
    }

    private void facePassShaderValues(int i) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glUniform1f(this.mSkinSmoothScaleHandle, this.mSkinSmoothScale);
        int i2 = this.mLowSkinThresholdHandle;
        int[] iArr = this.mLowSkinThreshold;
        GLES20.glUniform3f(i2, iArr[0] / 255.0f, iArr[1] / 255.0f, iArr[2] / 255.0f);
        int i3 = this.mHighSkinThresholdHandle;
        int[] iArr2 = this.mHighSkinThreshold;
        GLES20.glUniform3f(i3, iArr2[0] / 255.0f, iArr2[1] / 255.0f, iArr2[2] / 255.0f);
        int i4 = this.mDefaultSkinThresholdHandle;
        int[] iArr3 = this.mDefaultSkinThreshold;
        GLES20.glUniform3f(i4, iArr3[0] / 255.0f, iArr3[1] / 255.0f, iArr3[2] / 255.0f);
        GLES20.glUniform1f(this.mTexelWidthHandle, this.mTexelWidth);
        GLES20.glUniform1f(this.mTexelHeightHandle, this.mTexelHeight);
        pjw pjwVar = this.mMmcvInfo;
        if (pjwVar == null || pjwVar.m169950n() <= 0) {
            return;
        }
        GLES20.glUniform1f(this.mFaceWidthHandle, AIFaceTriangulation.getFaceTriangulationWidth(this.mMmcvInfo.m169946j(i).m220024r(), this.width / this.mMMCVWidth));
    }

    private void init(int i) {
        this.mWinSize = i;
        int[] iArr = this.mLowSkinThreshold;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int[] iArr2 = this.mHighSkinThreshold;
        iArr2[0] = 255;
        iArr2[1] = 255;
        iArr2[2] = 255;
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void cancelDraw() {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void clearPoints() {
    }

    @Override // p149l.mcj
    public void drawSub() {
        GLES20.glViewport(0, 0, this.width, this.height);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.programHandle);
        pjw pjwVar = this.mMmcvInfo;
        if (pjwVar == null || pjwVar.m169950n() <= 0) {
            return;
        }
        for (int i = 0; i < this.mMmcvInfo.m169950n(); i++) {
            facePassShaderValues(i);
            float[][] faceTriangulation = AIFaceTriangulation.getFaceTriangulation(this.mMmcvInfo.m169946j(i).m220024r(), getWidth(), getHeight(), null);
            float[] fArr = faceTriangulation[0];
            float[] fArr2 = faceTriangulation[1];
            if (this.mByteBufTex == null) {
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
                this.mByteBufVer = byteBufferAllocateDirect;
                byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
                this.mBufferVer = this.mByteBufVer.asFloatBuffer();
            }
            this.mBufferVer.rewind();
            this.mBufferVer.put(fArr);
            this.mBufferVer.position(0);
            GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 0, (Buffer) this.mBufferVer);
            GLES20.glEnableVertexAttribArray(this.positionHandle);
            if (this.mByteBufTex == null) {
                ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(fArr2.length * 4);
                this.mByteBufTex = byteBufferAllocateDirect2;
                byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
                this.mBufferTex = this.mByteBufTex.asFloatBuffer();
            }
            this.mBufferTex.rewind();
            this.mBufferTex.put(fArr2);
            this.mBufferTex.position(0);
            GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 0, (Buffer) this.mBufferTex);
            GLES20.glEnableVertexAttribArray(this.texCoordHandle);
            GLES20.glDrawArrays(4, 0, fArr2.length / 2);
        }
        disableDrawArray();
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float amount;\nuniform vec3 lowSkinThreshold;\nuniform vec3 highSkinThreshold;\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \nfloat minstep = 3.0;\nuniform vec3 skinDefaultRGB;\nuniform float faceWidth;\nvoid main() {\n    float epslone = 0.006 * amount * amount;\n    float faceWidthFactor = min(faceWidth / 360.0, 1.4);\n    float xInc = minstep * 1.0 / 480.0 * faceWidthFactor;\n    float yInc = minstep * 1.0 / (480.0 / texelWidthOffset * texelHeightOffset) * faceWidthFactor;\n    vec4 a = vec4(0., 0., 0., 0.);\n    vec4 b = vec4(0., 0., 0., 0.);\n    vec4 meanI = vec4(0., 0., 0., 0.);\n    vec4 meanII = vec4(0., 0., 0., 0.);\n    vec4 temp = vec4(0., 0., 0., 0.);\n    vec4 sourceColor = texture2D(inputImageTexture0,textureCoordinate);\n    vec3 relation = vec3(1.) + min((sourceColor.xyz - skinDefaultRGB), vec3(0.0));\n    float meanrelation =(relation.x + relation.y + relation.z) / 3.0;\n    float r = 1. / (1. + exp(24. - 30. * meanrelation));\n    float eps = epslone * r;\n    if (eps < 0.000001) {\n         gl_FragColor = vec4(0.5, 0.5, 0.5, 1.0);\n         return;\n    }\n    float x = textureCoordinate.x + (-float(" + this.mWinSize + ") * 0.5 * xInc);\n    float y = textureCoordinate.y + (-float(" + this.mWinSize + ") * 0.5 * yInc);\n    for (int i = 0; i < " + this.mWinSize + "; i++) {\n          for (int j = 0; j < " + this.mWinSize + "; j++) {\n              temp = texture2D(inputImageTexture0, vec2(x + float(i) * xInc, y + float(j) * yInc));\n              meanI += temp;\n              meanII += temp * temp;\n          }\n    }\n    meanI /= float(" + this.mWinSize + "*" + this.mWinSize + ");\n    meanII /= float(" + this.mWinSize + "*" + this.mWinSize + ");\n    temp = meanII - meanI * meanI;\n    a = clamp(temp / (temp + vec4(vec3(eps), 1.0)), 0.0, 1.0);\n    b = meanI - a * meanI;\n    vec4 temp3 = a * sourceColor + b;\n    gl_FragColor = vec4(temp3.xyz - sourceColor.xyz + vec3(0.5, 0.5, 0.5), 1.0);\n    return;\n}\n";
    }

    public float getSkinSmoothScale() {
        return this.mSkinSmoothScale;
    }

    @Override // p149l.mcj, p149l.ccj
    public void handleSizeChange() {
        super.handleSizeChange();
        this.mTexelWidth = getWidth();
        this.mTexelHeight = getHeight();
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.mSkinSmoothScaleHandle = GLES20.glGetUniformLocation(this.programHandle, "amount");
        this.mLowSkinThresholdHandle = GLES20.glGetUniformLocation(this.programHandle, "lowSkinThreshold");
        this.mHighSkinThresholdHandle = GLES20.glGetUniformLocation(this.programHandle, "highSkinThreshold");
        this.mDefaultSkinThresholdHandle = GLES20.glGetUniformLocation(this.programHandle, "skinDefaultRGB");
        this.mTexelWidthHandle = GLES20.glGetUniformLocation(this.programHandle, "texelWidthOffset");
        this.mTexelHeightHandle = GLES20.glGetUniformLocation(this.programHandle, "texelHeightOffset");
        this.mFaceWidthHandle = GLES20.glGetUniformLocation(this.programHandle, "faceWidth");
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void resetSticker(Sticker sticker) {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter, p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        this.mMmcvInfo = pjwVar;
        int[] iArr = this.mLowSkinThreshold;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int[] iArr2 = this.mHighSkinThreshold;
        iArr2[0] = 255;
        iArr2[1] = 255;
        iArr2[2] = 255;
        int[] iArr3 = this.mDefaultSkinThreshold;
        iArr3[0] = 160;
        iArr3[1] = 120;
        iArr3[2] = 110;
        int i = pjwVar.f149896c;
        if (i % 90 != 0 || i % 180 == 0) {
            this.mMMCVWidth = pjwVar.f149898e;
            this.mMMCVHeight = pjwVar.f149899f;
        } else {
            this.mMMCVWidth = pjwVar.f149899f;
            this.mMMCVHeight = pjwVar.f149898e;
        }
    }

    public void setSkinSmoothScale(float f) {
        this.mSkinSmoothScale = f;
    }
}
