package com.momo.mcamera.mask;

import android.opengl.GLES20;
import p153l.omw;

/* JADX INFO: loaded from: classes8.dex */
public class FaceSharpenFilter extends FaceDetectFilter {
    private int highSkinYUVThresholdHandle;
    private int lowSkinYUVThresholdHandle;
    private int sharpenScaleHandle;
    private float sharpenScaleValue = 0.0f;
    private int[] lowSkinYUVThreshold = {0, 0, 0};
    private int[] highSkinYUVThreshold = {0, 0, 0};

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void cancelDraw() {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void clearPoints() {
    }

    @Override // p153l.gfj
    public void drawSub() {
        super.drawSub();
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nvarying highp vec2 textureCoordinate;\nvarying highp vec2 leftTextureCoordinate;\nvarying highp vec2 rightTextureCoordinate;\nvarying highp vec2 topTextureCoordinate;\nvarying highp vec2 bottomTextureCoordinate;\nvarying float sharpnessVary;\nvarying highp float centerMultiplier;\nvarying highp float edgeMultiplier;\nuniform sampler2D inputImageTexture0;\nuniform vec3 lowSkinYUVThreshold;\nuniform vec3 highSkinYUVThreshold;\nvoid main()\n{\n    mediump vec3 textureColor = texture2D(inputImageTexture0, textureCoordinate).rgb;\n    mediump vec3 leftTextureColor = texture2D(inputImageTexture0, leftTextureCoordinate).rgb;\n    mediump vec3 rightTextureColor = texture2D(inputImageTexture0, rightTextureCoordinate).rgb;\n    mediump vec3 topTextureColor = texture2D(inputImageTexture0, topTextureCoordinate).rgb;\n    mediump vec3 bottomTextureColor = texture2D(inputImageTexture0, bottomTextureCoordinate).rgb;\n    float u_low = lowSkinYUVThreshold.y/256.;\n    float v_low = lowSkinYUVThreshold.z/256.;\n    float u_height = highSkinYUVThreshold.y/256.;\n    float v_height = highSkinYUVThreshold.z/256.;\n    vec4 sourceColorVec4 = texture2D(inputImageTexture0, textureCoordinate);\n    if (sharpnessVary < 0.001){\n         gl_FragColor = sourceColorVec4;\n         return;}\n    float m_r = sourceColorVec4.r;\n    float m_g = sourceColorVec4.g;\n    float m_b = sourceColorVec4.b;\n    float m_max = max(m_r, max(m_g, m_b));\n    float m_min = min(m_r, min(m_g, m_b));\n    float u = -0.1687*m_r - 0.3313*m_g + 0.5*m_b + 128./256.;\n    float v = 0.5*m_r - 0.4187*m_g - 0.0813*m_b + 128./256.;\n    if(( u_low<u && u<u_height && v_low<v && v<v_height && m_r>m_g && m_r > m_b  && m_max - m_min > 15./256. && abs(m_r - m_g)>15./256. )) {\n         gl_FragColor = vec4((textureColor * centerMultiplier - (leftTextureColor * edgeMultiplier + rightTextureColor * edgeMultiplier + topTextureColor * edgeMultiplier + bottomTextureColor * edgeMultiplier)), texture2D(inputImageTexture0,  bottomTextureCoordinate).w);\n   }\n    else\n        gl_FragColor = sourceColorVec4;\n}\n";
    }

    public float getSkinSmoothScale() {
        return this.sharpenScaleValue;
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return "precision highp float;\nattribute vec4  position;\nattribute vec2 inputTextureCoordinate;\nfloat imageWidthFactor = 1./480.;\nfloat imageHeightFactor = 1./640.;\nuniform float sharpness;\nvarying vec2 textureCoordinate;\nvarying vec2 leftTextureCoordinate;\nvarying vec2 rightTextureCoordinate;\nvarying vec2 topTextureCoordinate;\nvarying vec2 bottomTextureCoordinate;\nvarying float centerMultiplier;\nvarying float edgeMultiplier;\nvarying float sharpnessVary;\nvoid main() {\nsharpnessVary = sharpness;\ngl_Position = position;\nvec2 widthStep = vec2(imageWidthFactor, 0.0);\nvec2 heightStep = vec2(0.0, imageHeightFactor);\ntextureCoordinate = inputTextureCoordinate;\nleftTextureCoordinate = inputTextureCoordinate - widthStep;\nrightTextureCoordinate = inputTextureCoordinate + widthStep;\ntopTextureCoordinate = inputTextureCoordinate + heightStep;\nbottomTextureCoordinate = inputTextureCoordinate - heightStep;\ncenterMultiplier = 1.0 + 4.0 * sharpnessVary;\nedgeMultiplier = sharpnessVary;\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.sharpenScaleHandle = GLES20.glGetUniformLocation(this.programHandle, "sharpness");
        this.lowSkinYUVThresholdHandle = GLES20.glGetUniformLocation(this.programHandle, "lowSkinYUVThreshold");
        this.highSkinYUVThresholdHandle = GLES20.glGetUniformLocation(this.programHandle, "highSkinYUVThreshold");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.sharpenScaleHandle, this.sharpenScaleValue);
        int i = this.lowSkinYUVThresholdHandle;
        int[] iArr = this.lowSkinYUVThreshold;
        GLES20.glUniform3f(i, iArr[0], iArr[1], iArr[2]);
        int i2 = this.highSkinYUVThresholdHandle;
        int[] iArr2 = this.highSkinYUVThreshold;
        GLES20.glUniform3f(i2, iArr2[0], iArr2[1], iArr2[2]);
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void resetSticker(Sticker sticker) {
    }

    public void setSharpenScale(float f) {
        synchronized (getLockObject()) {
            this.sharpenScaleValue = f;
        }
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter, p153l.suf
    public void setMMCVInfo(omw omwVar) {
    }
}
