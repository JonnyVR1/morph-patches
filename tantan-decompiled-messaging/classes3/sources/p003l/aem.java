package p003l;

import android.opengl.GLES20;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class aem extends ts2 {

    /* JADX INFO: renamed from: a */
    private int f2156a;

    /* JADX INFO: renamed from: b */
    private int f2157b;

    /* JADX INFO: renamed from: c */
    private int f2158c;

    /* JADX INFO: renamed from: d */
    private int f2159d;

    /* JADX INFO: renamed from: e */
    private int f2160e;

    /* JADX INFO: renamed from: f */
    private int f2161f;

    /* JADX INFO: renamed from: g */
    private int f2162g;

    /* JADX INFO: renamed from: i */
    private int f2163i;

    /* JADX INFO: renamed from: j */
    private float f2164j = 0.4f;

    /* JADX INFO: renamed from: k */
    private int f2165k = 1;

    /* JADX INFO: renamed from: l */
    private float f2166l = 0.012f;

    /* JADX INFO: renamed from: m */
    private float f2167m = 1.2f;

    /* JADX INFO: renamed from: n */
    private float f2168n = 0.0f;

    /* JADX INFO: renamed from: o */
    private boolean f2169o = false;

    /* JADX INFO: renamed from: Q1 */
    public void m2838Q1(float f) {
        this.f2168n = f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m2839R1(boolean z) {
        this.f2169o = z;
    }

    /* JADX INFO: renamed from: S1 */
    public void m2840S1(float f) {
        this.f2167m = f;
    }

    /* JADX INFO: renamed from: T1 */
    public void m2841T1(float f) {
        this.f2164j = f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\n\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture0;\n\nuniform float heightInv;\nuniform float widthInv;\nuniform int width;\nuniform bool deblurEnabled;\nuniform float weight;\nuniform float threshold;\nuniform float saturation;\nuniform float contrast;\nconst vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\n\nvoid main() {\n    vec4 outColor;\n    vec4 origin = texture2D(inputImageTexture0, textureCoordinate);\n    outColor = origin;\n    if (deblurEnabled) {\n        vec4 imageH = origin\n            - (texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(-widthInv,-heightInv),0.0,1.0))*0.08\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(      0.0,-heightInv),0.0,1.0))*0.12\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2( widthInv,-heightInv),0.0,1.0))*0.08\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(-widthInv,       0.0),0.0,1.0))*0.12\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2( widthInv,       0.0),0.0,1.0))*0.12\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(-widthInv, heightInv),0.0,1.0))*0.08\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2(      0.0, heightInv),0.0,1.0))*0.12\n            +texture2D(inputImageTexture0, clamp(textureCoordinate+vec2( widthInv, heightInv),0.0,1.0))*0.08\n            +origin*0.2);\n        vec4 diff = abs(imageH);\n        float minVal = min(diff.r, min(diff.g, diff.b));\n        float temp = step(minVal, threshold);\n        vec4 imageM = temp * origin + ((1.0 - temp) * clamp(origin + imageH * weight, 0.0, 1.0));\n        outColor = imageM;\n\n        if (saturation > 0.0) {\n            float luminance = dot(imageM.rgb,luminanceWeighting);\n            vec3 greyScaleColor = vec3(luminance);\n            vec4 imageS=vec4(mix(greyScaleColor,imageM.rgb,saturation), imageM.a);\n            outColor = imageS;\n        }\n        if (contrast > 0.0) {            outColor = vec4(((outColor.rgb - vec3(0.5)) * contrast + vec3(0.5)), outColor.a);\n        }\n    }\n    gl_FragColor = outColor;\n}\n";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f2156a = GLES20.glGetUniformLocation(this.programHandle, "widthInv");
        this.f2157b = GLES20.glGetUniformLocation(this.programHandle, "HeightInv");
        this.f2158c = GLES20.glGetUniformLocation(this.programHandle, IjkMediaMeta.IJKM_KEY_WIDTH);
        this.f2159d = GLES20.glGetUniformLocation(this.programHandle, "weight");
        this.f2163i = GLES20.glGetUniformLocation(this.programHandle, "threshold");
        this.f2161f = GLES20.glGetUniformLocation(this.programHandle, "saturation");
        this.f2162g = GLES20.glGetUniformLocation(this.programHandle, "contrast");
        this.f2160e = GLES20.glGetUniformLocation(this.programHandle, "deblurEnabled");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        float width = 1.0f / getWidth();
        float height = 1.0f / getHeight();
        GLES20.glUniform1f(this.f2156a, width);
        GLES20.glUniform1f(this.f2157b, height);
        GLES20.glUniform1i(this.f2158c, getWidth());
        GLES20.glUniform1f(this.f2159d, this.f2164j * 3.0f);
        GLES20.glUniform1f(this.f2163i, this.f2166l);
        GLES20.glUniform1f(this.f2161f, this.f2167m);
        GLES20.glUniform1f(this.f2162g, this.f2168n);
        GLES20.glUniform1i(this.f2160e, this.f2169o ? 1 : 0);
    }
}
