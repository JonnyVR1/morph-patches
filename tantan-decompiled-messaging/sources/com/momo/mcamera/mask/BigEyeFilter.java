package com.momo.mcamera.mask;

import android.graphics.PointF;
import android.opengl.GLES20;
import com.momo.mcamera.mask.skin.AIFaceTriangulation;
import p149l.etf;
import p149l.mcj;
import p149l.pjw;
import p149l.ts2;

/* JADX INFO: loaded from: classes7.dex */
public class BigEyeFilter extends ts2 implements etf {
    public static final String UNIFORM_CENTER_LEFT = "centerLeft";
    public static final String UNIFORM_CENTER_RIGHT = "centerRight";
    public static final String UNIFORM_RADIUS_LEFT = "radiusLeft";
    public static final String UNIFORM_RADIUS_RIGHT = "radiusRight";
    public static final String UNIFORM_SCALE = "scale";
    public static final String UNIFORM_TEXTURE_SIZE = "textureSize";
    private EyesProgram eyesProgram;
    public int handleTextureSize = 0;
    public int handleCenterLeft = 0;
    public int handleCenterRight = 0;
    public int handleRadiusLeft = 0;
    public int handleRadiuRight = 0;
    public int handleScale = 0;
    public float[] textureSize = new float[2];
    public float[] centerLeft = new float[2];
    public float[] centerRight = new float[2];
    public float radiusLeft = 0.0f;
    public float radiusRight = 0.0f;
    private float scale = 0.0f;
    private float mEyeScale = 0.0f;
    private pjw mMmcvInfo = null;

    public class EyesProgram extends GLProgram {
        public EyesProgram(int i, int i2) {
            super(i, i2);
        }

        @Override // com.momo.mcamera.mask.GLProgram
        public String getSubFrameShader() {
            return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate0;\nuniform vec2 textureSize;\nuniform vec2 centerLeft;\nuniform vec2 centerRight;\nuniform float radiusLeft;\nuniform float radiusRight; \nuniform float scale;\nvoid main() {\n    vec2 textureCoordinate = textureCoordinate0  * textureSize;\n    float distanceLeft = distance(centerLeft, textureCoordinate);\n    if (distanceLeft < radiusLeft) {\n        vec2 offset = textureCoordinate - centerLeft;\n        float percent = 1.0 - ((radiusLeft - distanceLeft) / radiusLeft) * scale;\n        percent = percent * percent;\n        offset *= percent;\n        gl_FragColor = texture2D(inputImageTexture0, (centerLeft + offset)/textureSize);\n        return;\n    }\n    float distanceRight = distance(centerRight, textureCoordinate);\n    if (distanceRight < radiusRight) {\n        vec2 offset = textureCoordinate - centerRight;\n        float percent = 1.0 - ((radiusRight - distanceRight) / radiusRight) * scale;\n        percent = percent * percent;\n        offset *= percent;\n        gl_FragColor = texture2D(inputImageTexture0, (centerRight + offset)/textureSize);\n        return;\n    }\n    gl_FragColor = texture2D(inputImageTexture0, textureCoordinate0);\n}";
        }

        @Override // com.momo.mcamera.mask.GLProgram
        public void initShaderHandles() {
            super.initShaderHandles();
            BigEyeFilter.this.handleTextureSize = GLES20.glGetUniformLocation(this.programHandle, BigEyeFilter.UNIFORM_TEXTURE_SIZE);
            BigEyeFilter.this.handleCenterLeft = GLES20.glGetUniformLocation(this.programHandle, BigEyeFilter.UNIFORM_CENTER_LEFT);
            BigEyeFilter.this.handleCenterRight = GLES20.glGetUniformLocation(this.programHandle, BigEyeFilter.UNIFORM_CENTER_RIGHT);
            BigEyeFilter.this.handleRadiusLeft = GLES20.glGetUniformLocation(this.programHandle, BigEyeFilter.UNIFORM_RADIUS_LEFT);
            BigEyeFilter.this.handleRadiuRight = GLES20.glGetUniformLocation(this.programHandle, BigEyeFilter.UNIFORM_RADIUS_RIGHT);
            BigEyeFilter.this.handleScale = GLES20.glGetUniformLocation(this.programHandle, BigEyeFilter.UNIFORM_SCALE);
        }

        @Override // com.momo.mcamera.mask.GLProgram
        public void passShaderValues(float[][] fArr, int[] iArr) {
            super.passShaderValues(fArr, iArr);
            BigEyeFilter bigEyeFilter = BigEyeFilter.this;
            float[] fArr2 = bigEyeFilter.textureSize;
            float f = this.width;
            fArr2[0] = f;
            float f2 = this.height;
            fArr2[1] = f2;
            GLES20.glUniform2f(bigEyeFilter.handleTextureSize, f, f2);
            BigEyeFilter bigEyeFilter2 = BigEyeFilter.this;
            int i = bigEyeFilter2.handleCenterLeft;
            float[] fArr3 = bigEyeFilter2.centerLeft;
            GLES20.glUniform2f(i, fArr3[0], fArr3[1]);
            BigEyeFilter bigEyeFilter3 = BigEyeFilter.this;
            int i2 = bigEyeFilter3.handleCenterRight;
            float[] fArr4 = bigEyeFilter3.centerRight;
            GLES20.glUniform2f(i2, fArr4[0], fArr4[1]);
            BigEyeFilter bigEyeFilter4 = BigEyeFilter.this;
            GLES20.glUniform1f(bigEyeFilter4.handleRadiusLeft, bigEyeFilter4.radiusLeft);
            BigEyeFilter bigEyeFilter5 = BigEyeFilter.this;
            GLES20.glUniform1f(bigEyeFilter5.handleRadiuRight, bigEyeFilter5.radiusRight);
            BigEyeFilter bigEyeFilter6 = BigEyeFilter.this;
            GLES20.glUniform1f(bigEyeFilter6.handleScale, bigEyeFilter6.scale);
        }
    }

    public BigEyeFilter() {
        EyesProgram eyesProgram = new EyesProgram(1, 1);
        this.eyesProgram = eyesProgram;
        eyesProgram.setDrawType(4);
    }

    private void drawEyes() {
        pjw pjwVar = this.mMmcvInfo;
        if (pjwVar == null || pjwVar.m169950n() <= 0) {
            return;
        }
        for (int i = 0; i < this.mMmcvInfo.m169950n(); i++) {
            if (this.mMmcvInfo.m169946j(i) != null && this.mMmcvInfo.m169946j(i).m220024r() != null) {
                pjw pjwVar2 = this.mMmcvInfo;
                int i2 = pjwVar2.f149895b;
                int iM169956t = (i2 == 90 || i2 == 270) ? pjwVar2.m169956t() : pjwVar2.m169949m();
                PointF pointF = new PointF(this.mMmcvInfo.m169946j(i).m220024r()[39], this.mMmcvInfo.m169946j(i).m220024r()[143]);
                PointF pointF2 = new PointF(this.mMmcvInfo.m169946j(i).m220024r()[45], this.mMmcvInfo.m169946j(i).m220024r()[149]);
                float[] fArr = this.centerLeft;
                fArr[0] = (pointF.x + pointF2.x) / 2.0f;
                float f = iM169956t * 1.0f;
                fArr[1] = f - ((pointF.y + pointF2.y) / 2.0f);
                PointF pointF3 = new PointF(this.mMmcvInfo.m169946j(i).m220024r()[51], this.mMmcvInfo.m169946j(i).m220024r()[155]);
                PointF pointF4 = new PointF(this.mMmcvInfo.m169946j(i).m220024r()[57], this.mMmcvInfo.m169946j(i).m220024r()[161]);
                float[] fArr2 = this.centerRight;
                fArr2[0] = (pointF3.x + pointF4.x) / 2.0f;
                fArr2[1] = f - ((pointF3.y + pointF4.y) / 2.0f);
                float f2 = pointF.x;
                float f3 = pointF2.x;
                float f4 = (f2 - f3) * (f2 - f3);
                float f5 = pointF.y;
                float f6 = pointF2.y;
                double dSqrt = Math.sqrt(f4 + ((f5 - f6) * (f5 - f6)));
                float f7 = pointF3.x;
                float f8 = pointF4.x;
                float f9 = (f7 - f8) * (f7 - f8);
                float f10 = pointF3.y;
                float f11 = pointF4.y;
                double dSqrt2 = (Math.sqrt(f9 + ((f10 - f11) * (f10 - f11))) + dSqrt) / 2.0d;
                this.scale = (float) (((double) this.mEyeScale) * 0.2d * Math.exp(((double) (1.0f - Math.min(Math.abs(this.mMmcvInfo.m169946j(i).m220012c()[1]) / 60.0f, 1.0f))) - 1.0d));
                float f12 = (float) (dSqrt2 * 0.8d);
                this.radiusLeft = f12;
                this.radiusRight = f12;
                this.eyesProgram.drawFrame(AIFaceTriangulation.getFaceTriangulation(this.mMmcvInfo.m169946j(i).m220024r(), getWidth(), getHeight(), null), new int[]{this.texture_in});
            }
        }
    }

    @Override // p149l.mcj
    public void drawSub() {
        super.drawSub();
        drawEyes();
    }

    @Override // p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        EyesProgram eyesProgram = this.eyesProgram;
        if (eyesProgram != null) {
            eyesProgram.setRenderSize(mcjVar.getWidth(), mcjVar.getHeight());
        }
        super.newTextureReady(i, mcjVar, z);
    }

    public void setEyeScale(float f) {
        this.mEyeScale = f;
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        synchronized (getLockObject()) {
            try {
                if (pjwVar == null) {
                    return;
                }
                this.mMmcvInfo = pjwVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
