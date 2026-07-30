package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class qgm extends jt2 {

    /* JADX INFO: renamed from: a */
    private int f157428a;

    /* JADX INFO: renamed from: b */
    private int f157429b;

    /* JADX INFO: renamed from: c */
    private int f157430c;

    /* JADX INFO: renamed from: d */
    private int f157431d;

    /* JADX INFO: renamed from: e */
    private int f157432e;

    /* JADX INFO: renamed from: f */
    private int f157433f;

    /* JADX INFO: renamed from: g */
    private int f157434g;

    /* JADX INFO: renamed from: i */
    private int f157435i;

    /* JADX INFO: renamed from: j */
    private float f157436j = 0.4f;

    /* JADX INFO: renamed from: k */
    private int f157437k = 1;

    /* JADX INFO: renamed from: l */
    private float f157438l = 0.012f;

    /* JADX INFO: renamed from: m */
    private float f157439m = 1.2f;

    /* JADX INFO: renamed from: n */
    private float f157440n = 0.0f;

    /* JADX INFO: renamed from: o */
    private boolean f157441o = false;

    /* JADX INFO: renamed from: Q1 */
    public void m176498Q1(float f) {
        this.f157440n = f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m176499R1(boolean z) {
        this.f157441o = z;
    }

    /* JADX INFO: renamed from: S1 */
    public void m176500S1(float f) {
        this.f157439m = f;
    }

    /* JADX INFO: renamed from: T1 */
    public void m176501T1(float f) {
        this.f157436j = f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\n\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture0;\n\nuniform float heightInv;\nuniform float widthInv;\nuniform int width;\nuniform bool deblurEnabled;\nuniform float weight;\nuniform float threshold;\nuniform float saturation;\nuniform float contrast;\nconst vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n\nvoid main() {\n    vec4 outColor;\n    vec4 origin = texture2D(inputImageTexture0, textureCoordinate);\n    outColor = origin;\n    if (deblurEnabled) {\n        vec4 imageH = origin\n            - (texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(-widthInv,-heightInv),0.0,1.0))*0.08\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(      0.0,-heightInv),0.0,1.0))*0.12\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2( widthInv,-heightInv),0.0,1.0))*0.08\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(-widthInv,       0.0),0.0,1.0))*0.12\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2( widthInv,       0.0),0.0,1.0))*0.12\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(-widthInv, heightInv),0.0,1.0))*0.08\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(      0.0, heightInv),0.0,1.0))*0.12\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2( widthInv, heightInv),0.0,1.0))*0.08\n            +origin*0.2);\n        vec4 diff = abs(imageH);\n        float minVal = min(diff.r, min(diff.g, diff.b));\n        float temp = step(minVal, threshold);\n        vec4 imageM = temp * origin + ((1.0 - temp) * clamp(origin + imageH * weight, 0.0, 1.0));\n        outColor = imageM;\n\n        if (saturation > 0.0) {\n            float luminance = dot(imageM.rgb,luminanceWeighting);\n            vec3 greyScaleColor = vec3(luminance);\n            vec4 imageS=vec4(mix(greyScaleColor,imageM.rgb,saturation), imageM.a);\n            outColor = imageS;\n        }\n        if (contrast > 0.0) {            outColor = vec4(((outColor.rgb - vec3(0.5)) * contrast + vec3(0.5)), outColor.a);\n        }\n    }\n    gl_FragColor = outColor;\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f157428a = GLES20.glGetUniformLocation(this.programHandle, "widthInv");
        this.f157429b = GLES20.glGetUniformLocation(this.programHandle, "HeightInv");
        this.f157430c = GLES20.glGetUniformLocation(this.programHandle, "width");
        this.f157431d = GLES20.glGetUniformLocation(this.programHandle, "weight");
        this.f157435i = GLES20.glGetUniformLocation(this.programHandle, "threshold");
        this.f157433f = GLES20.glGetUniformLocation(this.programHandle, "saturation");
        this.f157434g = GLES20.glGetUniformLocation(this.programHandle, "contrast");
        this.f157432e = GLES20.glGetUniformLocation(this.programHandle, "deblurEnabled");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        float width = 1.0f / getWidth();
        float height = 1.0f / getHeight();
        GLES20.glUniform1f(this.f157428a, width);
        GLES20.glUniform1f(this.f157429b, height);
        GLES20.glUniform1i(this.f157430c, getWidth());
        GLES20.glUniform1f(this.f157431d, this.f157436j * 3.0f);
        GLES20.glUniform1f(this.f157435i, this.f157438l);
        GLES20.glUniform1f(this.f157433f, this.f157439m);
        GLES20.glUniform1f(this.f157434g, this.f157440n);
        GLES20.glUniform1i(this.f157432e, this.f157441o ? 1 : 0);
    }
}
