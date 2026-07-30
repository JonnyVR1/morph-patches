package com.momo.mcamera.mask;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes8.dex */
public class ArtifactframeFilter extends TriggerBlendFilter {
    private static final String UNIFORM_HORD = "horizontalDisplacementComponent";
    private static final String UNIFORM_MAXH = "maximumHorizontalDisplacement";
    private static final String UNIFORM_MAXV = "maximumVerticalDisplacement";
    private static final String UNIFORM_TEXH = "textureHeight";
    private static final String UNIFORM_TEXW = "textureWidth";
    private static final String UNIFORM_VERD = "verticalDisplacementComponent";
    private int hordHandler;
    private int maxHHandler;
    private int maxVHandler;
    private int texhHandler;
    private int texwHandler;
    private int verdHandler;
    private float maxHfault = 0.0f;
    private float maxVfault = 0.0f;

    @Override // com.momo.mcamera.mask.TriggerBlendFilter, p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nvarying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform float maximumHorizontalDisplacement;\nuniform float maximumVerticalDisplacement;\nuniform int horizontalDisplacementComponent;\nuniform int verticalDisplacementComponent;\nuniform float textureWidth;\nuniform float textureHeight;\nvoid main() {\n    vec4 displacement = texture2D(inputImageTexture1,textureCoordinate);\n    float h = displacement.x ; \n    float v = displacement.x ;\n    float hOffset = (h - 0.5) * 2.0 * maximumHorizontalDisplacement;\n    float vOffset = (v -0.5) * 2.0 * maximumVerticalDisplacement;\n    vec2 textureSize = vec2(textureWidth, textureHeight);\n    const int count = 8;\n    vec2 subSampleOffsets[count];\n    subSampleOffsets[0] = vec2( 0.0625, -0.1875);\n    subSampleOffsets[1] = vec2(-0.0625,  0.1875);\n    subSampleOffsets[2] = vec2( 0.3125,  0.0625);\n    subSampleOffsets[3] = vec2(-0.1875, -0.3125);\n    subSampleOffsets[4] = vec2(-0.3125,  0.3125);\n    subSampleOffsets[5] = vec2(-0.4375, -0.0625);\n    subSampleOffsets[6] = vec2( 0.1875,  0.4375);\n    subSampleOffsets[7] = vec2( 0.4375, -0.4375);\n    vec2 textureCoordinates[count];\n    for (int i = 0; i < count; i += 1) {\n        textureCoordinates[i] = textureCoordinate + subSampleOffsets[i]/textureSize;\n    }\n    vec4 color = vec4(0.0, 0.0, 0.0, 0.0);\n    float count1 = float(count); vec4 origin;\n    for (int i = 0; i < count; i += 1) {\n       origin   = texture2D(inputImageTexture0, textureCoordinates[i] + vec2(hOffset, vOffset));\n       color += origin/count1;\n    }\n    gl_FragColor =  color;\n}\n";
    }

    @Override // com.momo.mcamera.mask.TriggerBlendFilter, p153l.hs10, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.maxHHandler = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_MAXH);
        this.maxVHandler = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_MAXV);
        this.hordHandler = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_HORD);
        this.verdHandler = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_VERD);
        this.texwHandler = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_TEXW);
        this.texhHandler = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_TEXH);
    }

    @Override // com.momo.mcamera.mask.TriggerBlendFilter, p153l.hs10, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.maxHHandler, this.maxHfault);
        GLES20.glUniform1f(this.maxVHandler, this.maxVfault);
        GLES20.glUniform1i(this.hordHandler, 0);
        GLES20.glUniform1i(this.verdHandler, 0);
        GLES20.glUniform1f(this.texwHandler, getWidth());
        GLES20.glUniform1f(this.texhHandler, getHeight());
    }

    public void setFaultInfo(float f, float f2) {
        this.maxHfault = f;
        this.maxVfault = f2;
    }
}
