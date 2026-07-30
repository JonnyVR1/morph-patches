package tv.danmaku.ijk.media.player;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PlayerAdjustFilter extends AbsIjkRender {
    private static final float WEIGHT_AMP = 3.0f;
    private int mContrastLocation;
    private int mEnabledLocation;
    private int mHeightStepLocation;
    private int mSaturationLocation;
    private int mThresholdLocation;
    private int mWeightLocation;
    private int mWidthLocation;
    private int mWidthStepLocation;
    private float mDeblurWeight = 0.0f;
    private int mDeblurRadius = 1;
    private float mDeblurThreshold = 0.012f;
    private float mSaturation = 1.2f;
    private float mContrast = 0.0f;
    private boolean mDeblurEnabled = true;

    @Override // tv.danmaku.ijk.media.player.AbsIjkRender
    public String getFragmentShader() {
        return "precision mediump float;\n\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture0;\n\nuniform float heightInv;\nuniform float widthInv;\nuniform int width;\nuniform bool deblurEnabled;\nuniform float weight;\nuniform float threshold;\nuniform float saturation;\nuniform float contrast;\nconst vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n\nvoid main() {\n    vec4 outColor = texture2D(inputImageTexture0, textureCoordinate);\n    if (!deblurEnabled) {\n        gl_FragColor = outColor;\n        return;\n    }\n    if (weight > 0.0) {\n    vec4 imageH = outColor\n        - (texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(-widthInv,-heightInv),0.0,1.0))*0.08\n        +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(      0.0,-heightInv),0.0,1.0))*0.12\n        +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2( widthInv,-heightInv),0.0,1.0))*0.08\n        +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(-widthInv,       0.0),0.0,1.0))*0.12\n        +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2( widthInv,       0.0),0.0,1.0))*0.12\n        +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(-widthInv, heightInv),0.0,1.0))*0.08\n        +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(      0.0, heightInv),0.0,1.0))*0.12\n        +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2( widthInv, heightInv),0.0,1.0))*0.08\n        +outColor*0.2);\n    vec4 diff = abs(imageH);\n    float minVal = min(diff.r, min(diff.g, diff.b));\n    float temp = step(minVal, threshold);\n    vec4 imageM = temp * outColor + ((1.0 - temp) * clamp(outColor + imageH * weight, 0.0, 1.0));\n    outColor = imageM;\n    }\n\n    if (saturation > 0.0) {\n        float luminance = dot(outColor.rgb,luminanceWeighting);\n        vec3 greyScaleColor = vec3(luminance);\n        vec4 imageS=vec4(mix(greyScaleColor,outColor.rgb,saturation), outColor.a);\n        outColor = imageS;\n    }\n    if (contrast > 0.0) {        outColor = vec4(((outColor.rgb - vec3(0.5)) * contrast + vec3(0.5)), outColor.a);\n    }\n    gl_FragColor = outColor;\n}\n";
    }

    @Override // tv.danmaku.ijk.media.player.AbsIjkRender
    public void initShaderHandles() {
        super.initShaderHandles();
        this.mWidthStepLocation = GLES20.glGetUniformLocation(this.programHandle, "widthInv");
        this.mHeightStepLocation = GLES20.glGetUniformLocation(this.programHandle, "HeightInv");
        this.mWidthLocation = GLES20.glGetUniformLocation(this.programHandle, IjkMediaMeta.IJKM_KEY_WIDTH);
        this.mWeightLocation = GLES20.glGetUniformLocation(this.programHandle, "weight");
        this.mThresholdLocation = GLES20.glGetUniformLocation(this.programHandle, "threshold");
        this.mSaturationLocation = GLES20.glGetUniformLocation(this.programHandle, "saturation");
        this.mContrastLocation = GLES20.glGetUniformLocation(this.programHandle, "contrast");
        this.mEnabledLocation = GLES20.glGetUniformLocation(this.programHandle, "deblurEnabled");
    }

    @Override // tv.danmaku.ijk.media.player.AbsIjkRender, tv.danmaku.ijk.media.player.IjkFilter
    public void onDrawFrame(int i) {
        super.onDrawFrame(i);
    }

    @Override // tv.danmaku.ijk.media.player.AbsIjkRender
    public void passShaderValues() {
        super.passShaderValues();
        float width = 1.0f / getWidth();
        float height = 1.0f / getHeight();
        GLES20.glUniform1f(this.mWidthStepLocation, width);
        GLES20.glUniform1f(this.mHeightStepLocation, height);
        GLES20.glUniform1i(this.mWidthLocation, getWidth());
        GLES20.glUniform1f(this.mWeightLocation, this.mDeblurWeight * WEIGHT_AMP);
        GLES20.glUniform1f(this.mThresholdLocation, this.mDeblurThreshold);
        GLES20.glUniform1f(this.mSaturationLocation, this.mSaturation);
        GLES20.glUniform1f(this.mContrastLocation, this.mContrast);
        GLES20.glUniform1i(this.mEnabledLocation, this.mDeblurEnabled ? 1 : 0);
    }

    public void setContrast(float f) {
        this.mContrast = f;
    }

    public void setDeblurRadius(int i) {
        this.mDeblurRadius = i;
    }

    public void setDeblurThreshold(float f) {
        this.mDeblurThreshold = f;
    }

    public void setEnable(boolean z) {
        this.mDeblurEnabled = z;
    }

    public void setSaturation(float f) {
        this.mSaturation = f;
    }

    public void setSharpening(float f) {
        this.mDeblurWeight = f;
    }
}
