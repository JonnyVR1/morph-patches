package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class aem extends ts2 {

    /* JADX INFO: renamed from: a */
    private int f69054a;

    /* JADX INFO: renamed from: b */
    private int f69055b;

    /* JADX INFO: renamed from: c */
    private int f69056c;

    /* JADX INFO: renamed from: d */
    private int f69057d;

    /* JADX INFO: renamed from: e */
    private int f69058e;

    /* JADX INFO: renamed from: f */
    private int f69059f;

    /* JADX INFO: renamed from: g */
    private int f69060g;

    /* JADX INFO: renamed from: i */
    private int f69061i;

    /* JADX INFO: renamed from: j */
    private float f69062j = 0.4f;

    /* JADX INFO: renamed from: k */
    private int f69063k = 1;

    /* JADX INFO: renamed from: l */
    private float f69064l = 0.012f;

    /* JADX INFO: renamed from: m */
    private float f69065m = 1.2f;

    /* JADX INFO: renamed from: n */
    private float f69066n = 0.0f;

    /* JADX INFO: renamed from: o */
    private boolean f69067o = false;

    /* JADX INFO: renamed from: Q1 */
    public void m96117Q1(float f) {
        this.f69066n = f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m96118R1(boolean z) {
        this.f69067o = z;
    }

    /* JADX INFO: renamed from: S1 */
    public void m96119S1(float f) {
        this.f69065m = f;
    }

    /* JADX INFO: renamed from: T1 */
    public void m96120T1(float f) {
        this.f69062j = f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\n\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture0;\n\nuniform float heightInv;\nuniform float widthInv;\nuniform int width;\nuniform bool deblurEnabled;\nuniform float weight;\nuniform float threshold;\nuniform float saturation;\nuniform float contrast;\nconst vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n\nvoid main() {\n    vec4 outColor;\n    vec4 origin = texture2D(inputImageTexture0, textureCoordinate);\n    outColor = origin;\n    if (deblurEnabled) {\n        vec4 imageH = origin\n            - (texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(-widthInv,-heightInv),0.0,1.0))*0.08\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(      0.0,-heightInv),0.0,1.0))*0.12\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2( widthInv,-heightInv),0.0,1.0))*0.08\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(-widthInv,       0.0),0.0,1.0))*0.12\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2( widthInv,       0.0),0.0,1.0))*0.12\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(-widthInv, heightInv),0.0,1.0))*0.08\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(      0.0, heightInv),0.0,1.0))*0.12\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2( widthInv, heightInv),0.0,1.0))*0.08\n            +origin*0.2);\n        vec4 diff = abs(imageH);\n        float minVal = min(diff.r, min(diff.g, diff.b));\n        float temp = step(minVal, threshold);\n        vec4 imageM = temp * origin + ((1.0 - temp) * clamp(origin + imageH * weight, 0.0, 1.0));\n        outColor = imageM;\n\n        if (saturation > 0.0) {\n            float luminance = dot(imageM.rgb,luminanceWeighting);\n            vec3 greyScaleColor = vec3(luminance);\n            vec4 imageS=vec4(mix(greyScaleColor,imageM.rgb,saturation), imageM.a);\n            outColor = imageS;\n        }\n        if (contrast > 0.0) {            outColor = vec4(((outColor.rgb - vec3(0.5)) * contrast + vec3(0.5)), outColor.a);\n        }\n    }\n    gl_FragColor = outColor;\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f69054a = GLES20.glGetUniformLocation(this.programHandle, "widthInv");
        this.f69055b = GLES20.glGetUniformLocation(this.programHandle, "HeightInv");
        this.f69056c = GLES20.glGetUniformLocation(this.programHandle, "width");
        this.f69057d = GLES20.glGetUniformLocation(this.programHandle, "weight");
        this.f69061i = GLES20.glGetUniformLocation(this.programHandle, "threshold");
        this.f69059f = GLES20.glGetUniformLocation(this.programHandle, "saturation");
        this.f69060g = GLES20.glGetUniformLocation(this.programHandle, "contrast");
        this.f69058e = GLES20.glGetUniformLocation(this.programHandle, "deblurEnabled");
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        float width = 1.0f / getWidth();
        float height = 1.0f / getHeight();
        GLES20.glUniform1f(this.f69054a, width);
        GLES20.glUniform1f(this.f69055b, height);
        GLES20.glUniform1i(this.f69056c, getWidth());
        GLES20.glUniform1f(this.f69057d, this.f69062j * 3.0f);
        GLES20.glUniform1f(this.f69061i, this.f69064l);
        GLES20.glUniform1f(this.f69059f, this.f69065m);
        GLES20.glUniform1f(this.f69060g, this.f69066n);
        GLES20.glUniform1i(this.f69058e, this.f69067o ? 1 : 0);
    }
}
