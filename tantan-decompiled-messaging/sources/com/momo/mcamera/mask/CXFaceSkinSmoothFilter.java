package com.momo.mcamera.mask;

import android.opengl.GLES20;
import android.text.TextUtils;
import com.core.glcore.util.ImageUtils;
import com.core.glcore.util.TextureHelper;
import com.momo.mcamera.mask.skin.AIFaceTriangulation;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import p149l.etf;
import p149l.mcj;
import p149l.pjw;
import p149l.tw3;
import p149l.vjw;

/* JADX INFO: loaded from: classes7.dex */
public class CXFaceSkinSmoothFilter extends tw3 implements etf {
    public static final int STEP_FIRST = 1;
    public static final int STEP_SECOND = 2;
    private static final int TYPE_FULL_SCREEN = 0;
    private static final int TYPE_HD = 2;
    private static final int TYPE_NORMAL = 1;
    private static final String UNIFORM_CX_SKIN_SMOOTHING_CONSIDERS_SKIN_RELATION = "cxSkinSmoothingConsidersSkinRelation";
    private static final String UNIFORM_CX_SKIN_SMOOTHING_USES_MASK = "cxSkinSmoothingUsesMask";
    private static final String UNIFORM_EPSLONE = "epslone";
    private static final String UNIFORM_LAND = "land";
    private static final String UNIFORM_SAMPLE_STEP = "sampleStep";
    private static final String UNIFORM_WINSIZE = "winSize";
    private pjw mMmcvInfo;
    private int mWinSize = 6;
    private int[] mLowSkinThreshold = {0, 0, 0};
    private int[] mHighSkinThreshold = {255, 255, 255};
    private int[] mDefaultSkinThreshold = {160, 120, 110};
    private float mMMCVWidth = 0.0f;
    private int mCxSkinSmoothingUsesMask = 0;
    private int mCxSkinSmoothingConsidersSkinRelation = 0;
    private float[] mEpslone = new float[3];
    private float[] mSampleStep = new float[2];
    private float step = 0.0f;
    private float mFaceWidth = 0.0f;
    private int maskTexture = 0;
    private String maskPath = null;
    private int maskTextureHandle = 0;
    private int maskTexCoordHandle = 0;
    private int mDefaultSkinThresholdHandle = 0;
    private int mEpsloneHandle = 0;
    private int mCxSkinSmoothingUsesMaskHandle = 0;
    private int mCxSkinSmoothingConsidersSkinRelationHandle = 0;
    private int mSampleStepHandle = 0;
    private int mLandHandle = 0;
    private int mWinSizeHandle = 0;
    private List<SkinFaceBuffer> skinBuffers = new ArrayList(3);
    private int mType = 1;
    public int skinStep = 1;
    private int land = this.currentPass;
    private float mDermabrasion = 0.0f;
    private float mEyesAreaAmount = 0.0f;
    private int textureId = -1;
    private int textureInId = -1;
    private int textureBeforeId = -1;
    private boolean isDiscard = false;

    public class SkinFaceBuffer {
        private ByteBuffer byteBufVer = null;
        private FloatBuffer bufferVer = null;
        private ByteBuffer byteBufTex = null;
        private FloatBuffer bufferTex = null;
        private ByteBuffer byteBufSource = null;
        private FloatBuffer bufferSource = null;

        public SkinFaceBuffer() {
        }

        public String toString() {
            return "SkinFaceBuffer{byteBufVer=" + this.byteBufVer + ", bufferVer=" + this.bufferVer + ", byteBufTex=" + this.byteBufTex + ", bufferTex=" + this.bufferTex + ", byteBufSource=" + this.byteBufSource + ", bufferSource=" + this.bufferSource + '}';
        }
    }

    public CXFaceSkinSmoothFilter() {
        init(6);
    }

    private float CXSkinSmoothingEpsloneForAmount(float f) {
        return 0.005f * f * f;
    }

    private float CXSkinSmoothingEpsloneForMaskAmount(float f) {
        return 0.01f * f * f;
    }

    private void drawFace(float[] fArr, float[] fArr2, float[] fArr3, SkinFaceBuffer skinFaceBuffer) {
        if (skinFaceBuffer.byteBufVer == null) {
            skinFaceBuffer.byteBufVer = ByteBuffer.allocateDirect(fArr.length * 4);
            skinFaceBuffer.byteBufVer.order(ByteOrder.nativeOrder());
        }
        if (skinFaceBuffer.bufferVer == null) {
            skinFaceBuffer.bufferVer = skinFaceBuffer.byteBufVer.asFloatBuffer();
        }
        skinFaceBuffer.bufferVer.clear();
        skinFaceBuffer.bufferVer.put(fArr);
        skinFaceBuffer.bufferVer.flip();
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 0, (Buffer) skinFaceBuffer.bufferVer);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        if (skinFaceBuffer.byteBufTex == null) {
            skinFaceBuffer.byteBufTex = ByteBuffer.allocateDirect(fArr2.length * 4);
            skinFaceBuffer.byteBufTex.order(ByteOrder.nativeOrder());
        }
        if (skinFaceBuffer.bufferTex == null) {
            skinFaceBuffer.bufferTex = skinFaceBuffer.byteBufTex.asFloatBuffer();
        }
        skinFaceBuffer.bufferTex.clear();
        skinFaceBuffer.bufferTex.put(fArr2);
        skinFaceBuffer.bufferTex.flip();
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 0, (Buffer) skinFaceBuffer.bufferTex);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        if (this.mCxSkinSmoothingUsesMask > 0) {
            if (skinFaceBuffer.byteBufSource == null) {
                skinFaceBuffer.byteBufSource = ByteBuffer.allocateDirect(fArr2.length * 4);
                skinFaceBuffer.byteBufSource.order(ByteOrder.nativeOrder());
            }
            if (skinFaceBuffer.bufferSource == null) {
                skinFaceBuffer.bufferSource = skinFaceBuffer.byteBufSource.asFloatBuffer();
            }
            skinFaceBuffer.bufferSource.clear();
            skinFaceBuffer.bufferSource.put(fArr3);
            skinFaceBuffer.bufferSource.flip();
            GLES20.glVertexAttribPointer(this.maskTexCoordHandle, 2, 5126, false, 0, (Buffer) skinFaceBuffer.bufferSource);
            GLES20.glEnableVertexAttribArray(this.maskTexCoordHandle);
        }
        GLES20.glDrawArrays(4, 0, fArr2.length / 2);
        faceDisableDrawArray();
    }

    private void faceDisableDrawArray() {
        GLES20.glDisableVertexAttribArray(this.positionHandle);
        GLES20.glDisableVertexAttribArray(this.texCoordHandle);
        GLES20.glDisableVertexAttribArray(this.maskTexCoordHandle);
        GLES20.glBindTexture(3553, 0);
    }

    private void facePassShaderValues() {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
        if (this.mCxSkinSmoothingUsesMask > 0) {
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.maskTexture);
            GLES20.glUniform1i(this.maskTextureHandle, 1);
        }
        int i = this.currentPass - 1;
        this.land = i;
        GLES20.glUniform1i(this.mLandHandle, i);
        GLES20.glUniform1i(this.mWinSizeHandle, this.mWinSize);
        int i2 = this.mDefaultSkinThresholdHandle;
        int[] iArr = this.mDefaultSkinThreshold;
        GLES20.glUniform3f(i2, iArr[0] / 255.0f, iArr[1] / 255.0f, iArr[2] / 255.0f);
        GLES20.glUniform1i(this.mCxSkinSmoothingUsesMaskHandle, this.mCxSkinSmoothingUsesMask);
        GLES20.glUniform1i(this.mCxSkinSmoothingConsidersSkinRelationHandle, this.mCxSkinSmoothingConsidersSkinRelation);
        int i3 = this.mEpsloneHandle;
        float[] fArr = this.mEpslone;
        GLES20.glUniform3f(i3, fArr[0], fArr[1], fArr[2]);
        int i4 = this.mSampleStepHandle;
        float[] fArr2 = this.mSampleStep;
        GLES20.glUniform2f(i4, fArr2[0], fArr2[1]);
    }

    private float getNasolabialFoldAreaAmount(float f) {
        return Math.min(0.5f, Math.max(0.0f, f - 0.5f)) * 2.0f;
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
        for (int i2 = 0; i2 < 3; i2++) {
            this.skinBuffers.add(new SkinFaceBuffer());
        }
    }

    private float[] landMark104ToPoint(float[] fArr, float f, float f2) {
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        int i = 0;
        while (true) {
            int i2 = length / 2;
            if (i >= i2) {
                return fArr2;
            }
            fArr2[i] = fArr[i] / f;
            int i3 = i2 + i;
            fArr2[i3] = fArr[i3] / f2;
            i++;
        }
    }

    private void setParamters(int i, int i2, int i3, float f, float f2, float f3) {
        if (i == 0) {
            this.mWinSize = 4;
            this.step = 3.0f;
        } else if (i == 1) {
            this.mWinSize = 10;
            this.step = 3.0f;
        } else if (i == 2) {
            this.mWinSize = 12;
            this.step = 1.7f;
        }
        this.mCxSkinSmoothingConsidersSkinRelation = i2;
        this.mCxSkinSmoothingUsesMask = i3;
        this.mFaceWidth = f;
        float f4 = f / 360.0f;
        float f5 = this.step;
        float f6 = (f5 / this.width) * f4;
        float f7 = (f5 / this.height) * f4;
        float[] fArr = this.mSampleStep;
        fArr[0] = f6;
        fArr[1] = f7;
        if (i3 > 0) {
            this.mEpslone[0] = CXSkinSmoothingEpsloneForMaskAmount(f3);
            this.mEpslone[1] = CXSkinSmoothingEpsloneForMaskAmount(getNasolabialFoldAreaAmount(f2));
            this.mEpslone[2] = 0.0f;
        } else {
            float fCXSkinSmoothingEpsloneForAmount = CXSkinSmoothingEpsloneForAmount(f2);
            float[] fArr2 = this.mEpslone;
            fArr2[0] = fCXSkinSmoothingEpsloneForAmount;
            fArr2[1] = fCXSkinSmoothingEpsloneForAmount;
            fArr2[2] = fCXSkinSmoothingEpsloneForAmount;
        }
    }

    @Override // p149l.ccj
    public void bindShaderAttributes() {
        super.bindShaderAttributes();
        GLES20.glBindAttribLocation(this.programHandle, 2, "inputTextureCoordinate1");
    }

    @Override // p149l.tw3, p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        int i = this.maskTexture;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.maskTexture = 0;
        }
    }

    @Override // p149l.mcj
    public void drawSub() {
        if (this.isDiscard) {
            return;
        }
        int i = this.skinStep;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            setParamters(0, 1, 0, getWidth() / 2.0f, 0.0f, 0.0f);
            super.drawSub();
            pjw pjwVar = this.mMmcvInfo;
            if (pjwVar == null || pjwVar.m169950n() <= 0) {
                return;
            }
            for (int i2 = 0; i2 < this.mMmcvInfo.m169950n(); i2++) {
                if (this.mMmcvInfo.m169946j(i2).m220024r() != null) {
                    float[] fArrLandMark104ToPoint = landMark104ToPoint(this.mMmcvInfo.m169946j(i2).m220024r(), getWidth(), getHeight());
                    setParamters(this.mType, 1, 0, AIFaceTriangulation.getFaceTriangulationWidth(this.mMmcvInfo.m169946j(i2).m220024r(), this.width / this.mMMCVWidth), this.mDermabrasion, this.mEyesAreaAmount);
                    facePassShaderValues();
                    float[][] faceSkinHead = AIFaceTriangulation.getFaceSkinHead(fArrLandMark104ToPoint, false);
                    drawFace(faceSkinHead[0], faceSkinHead[1], faceSkinHead[2], this.skinBuffers.get(2));
                }
            }
            return;
        }
        setParamters(0, 1, 0, getWidth() / 2.0f, Math.min(this.mDermabrasion, 0.3f), 0.0f);
        super.drawSub();
        pjw pjwVar2 = this.mMmcvInfo;
        if (pjwVar2 == null || pjwVar2.m169950n() <= 0) {
            return;
        }
        for (int i3 = 0; i3 < this.mMmcvInfo.m169950n(); i3++) {
            if (this.mMmcvInfo.m169946j(i3).m220024r() != null) {
                float[] fArrLandMark104ToPoint2 = landMark104ToPoint(this.mMmcvInfo.m169946j(i3).m220024r(), getWidth(), getHeight());
                float faceTriangulationWidth = AIFaceTriangulation.getFaceTriangulationWidth(this.mMmcvInfo.m169946j(i3).m220024r(), this.width / this.mMMCVWidth);
                setParamters(this.mType, 1, 0, faceTriangulationWidth, this.mDermabrasion, this.mEyesAreaAmount);
                facePassShaderValues();
                float[][] faceSkinHead2 = AIFaceTriangulation.getFaceSkinHead(fArrLandMark104ToPoint2, false);
                drawFace(faceSkinHead2[0], faceSkinHead2[1], faceSkinHead2[2], this.skinBuffers.get(0));
                setParamters(this.mType, 1, 0, faceTriangulationWidth, this.mDermabrasion, this.mEyesAreaAmount);
                facePassShaderValues();
                float[][] fArr = AIFaceTriangulation.getfaceSkinBelowHead(fArrLandMark104ToPoint2, true);
                drawFace(fArr[0], fArr[1], fArr[2], this.skinBuffers.get(1));
            }
        }
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform vec3 skinDefaultRGB;\nuniform vec3 epslone;\nuniform int cxSkinSmoothingUsesMask;\nuniform int cxSkinSmoothingConsidersSkinRelation;\nuniform int land;\nuniform vec2 sampleStep;\nuniform int winSize;\nvoid main() {\n    mediump vec4 meanI = vec4(0., 0., 0., 0.);\n    mediump vec4 meanII = vec4(0., 0., 0., 0.);\n    mediump vec4 temp = vec4(0., 0., 0., 0.);\n    mediump vec4 sourceColor = texture2D(inputImageTexture0,textureCoordinate);\n    float eps = epslone.r;\n    if (cxSkinSmoothingUsesMask > 0) {\n            vec4 mask = texture2D(inputImageTexture1,textureCoordinate1);\n            eps = dot(epslone, vec3(mask.rgb));\n    };\n    if (cxSkinSmoothingConsidersSkinRelation > 0) {\n            vec3 relation = vec3(1.) + min((sourceColor.xyz - vec3(skinDefaultRGB)), vec3(0.0));\n            float meanrelation = dot(relation, vec3(1.0/3.0));\n            float r = 1.0 / (1.0 + exp(24.0 - 30.0 * meanrelation));\n            eps = eps * r;\n        }\n    if (eps < 0.000001) {\n         gl_FragColor = sourceColor;\n         return;\n    }\n    mediump float sumW = 0.0;\n    float xInc = sampleStep.x;\n    float yInc = sampleStep.y;\n    if(land == 1){\n    float x = textureCoordinate.x + (-float(winSize) * 0.5 * xInc);\n    float y = textureCoordinate.y;\n         int j = 0;\n         for (int i = 0; i < winSize; i++) {\n             temp = texture2D(inputImageTexture0, vec2(x + float(i) * xInc, y));\n             vec3 weightsRelation = clamp((vec3(1.0) - vec3(5.0) * abs(temp.xyz - sourceColor.xyz)), vec3(0.0), vec3(1.0));\n             mediump float weightFloat = dot(weightsRelation, vec3(1.0/3.0));\n             sumW += weightFloat;\n             meanI += weightFloat * temp;\n             meanII += weightFloat * temp * temp;\n         }\n    }else{\n    float x = textureCoordinate.x;\n    float y = textureCoordinate.y + (-float(winSize) * 0.5 * yInc);\n          int i = 0;\n          for (int j = 0; j < winSize; j++) {\n              temp = texture2D(inputImageTexture0, vec2(x, y + float(j) * yInc));\n              vec3 weightsRelation = clamp((vec3(1.0) - vec3(5.0) * abs(temp.xyz - sourceColor.xyz)), vec3(0.0), vec3(1.0));\n              mediump float weightFloat = dot(weightsRelation, vec3(1.0/3.0));\n              sumW += weightFloat;\n              meanI += weightFloat * temp;\n              meanII += weightFloat * temp * temp;\n          }\n    }\n    meanI /= sumW;\n    meanII /= sumW;\n    temp = meanII - meanI * meanI;\n    vec3 a = clamp((vec4(temp) / (vec4(temp) + vec4(vec3(eps), 1.0))), vec4(0.0), vec4(1.0)).rgb;\n    vec3 b = vec4(meanI).rgb - a * vec4(meanI).rgb;\n    gl_FragColor = vec4(a * sourceColor.rgb + b,sourceColor.a);\n}\n";
    }

    public String getMaskPath() {
        return this.maskPath;
    }

    public int getType() {
        return this.mType;
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nattribute vec2 inputTextureCoordinate1;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nvoid main() {\n  textureCoordinate = inputTextureCoordinate;\n  textureCoordinate1 = inputTextureCoordinate1;\n   gl_Position = position;\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.maskTexCoordHandle = GLES20.glGetAttribLocation(this.programHandle, "inputTextureCoordinate1");
        this.maskTextureHandle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture1");
        this.mDefaultSkinThresholdHandle = GLES20.glGetUniformLocation(this.programHandle, "skinDefaultRGB");
        this.mEpsloneHandle = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_EPSLONE);
        this.mCxSkinSmoothingUsesMaskHandle = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_CX_SKIN_SMOOTHING_USES_MASK);
        this.mCxSkinSmoothingConsidersSkinRelationHandle = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_CX_SKIN_SMOOTHING_CONSIDERS_SKIN_RELATION);
        this.mSampleStepHandle = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_SAMPLE_STEP);
        this.mLandHandle = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_LAND);
        this.mWinSizeHandle = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_WINSIZE);
    }

    @Override // p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        int i2;
        int i3;
        if (this.maskTexture == 0 && !TextUtils.isEmpty(this.maskPath)) {
            vjw vjwVar = new vjw();
            ImageUtils.decodeMMCVImage(vjwVar, this.maskPath);
            this.maskTexture = TextureHelper.bitmapToTexture(vjwVar);
        }
        if (this.textureInId != -1 && (i2 = this.textureId) != -1 && (i3 = this.textureBeforeId) != -1 && (i != i2 || i3 != i)) {
            this.isDiscard = true;
        }
        this.textureBeforeId = this.textureId;
        this.textureId = i;
        this.textureInId = this.texture_in;
        super.newTextureReady(i, mcjVar, z);
    }

    @Override // p149l.ccj
    public void onDrawFrame() {
        super.onDrawFrame();
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.textureVertices[this.curRotation].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        facePassShaderValues();
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        synchronized (getLockObject()) {
            try {
                if (pjwVar == null) {
                    return;
                }
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
                } else {
                    this.mMMCVWidth = pjwVar.f149899f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setMaskPath(String str) {
        this.maskPath = str;
    }

    public void setSkinParameter(float f, float f2) {
        this.mDermabrasion = f;
        this.mEyesAreaAmount = f2;
    }

    public void setType(int i) {
        this.mType = i;
    }
}
