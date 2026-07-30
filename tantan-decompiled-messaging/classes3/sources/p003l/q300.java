package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class q300 extends xj10 {

    /* JADX INFO: renamed from: a */
    final String f6581a;

    /* JADX INFO: renamed from: b */
    int f6582b;

    /* JADX INFO: renamed from: c */
    float[] f6583c;

    /* JADX INFO: renamed from: d */
    String f6584d;

    public q300() {
        super(4);
        this.f6581a = "coeff";
        this.f6583c = new float[4];
        this.f6584d = "precision highp float;\nvarying vec2 textureCoordinate; \nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform sampler2D inputImageTexture2;\nuniform sampler2D inputImageTexture3;\nvoid main(){ \n    vec4 color1 = max(texture2D(inputImageTexture0, textureCoordinate), texture2D(inputImageTexture1, textureCoordinate));\n    vec4 color2 = max(texture2D(inputImageTexture2, textureCoordinate), texture2D(inputImageTexture3, textureCoordinate));\n    gl_FragColor = max(color1, color2); \n}\n";
        setFloatTexture(true);
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return this.f6584d;
    }

    @Override // p003l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
        this.f6582b = GLES20.glGetUniformLocation(this.programHandle, "coeff");
    }

    @Override // p003l.xj10, p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
    }
}
