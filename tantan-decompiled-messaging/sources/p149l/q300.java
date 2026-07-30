package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class q300 extends xj10 {

    /* JADX INFO: renamed from: a */
    final String f152351a;

    /* JADX INFO: renamed from: b */
    int f152352b;

    /* JADX INFO: renamed from: c */
    float[] f152353c;

    /* JADX INFO: renamed from: d */
    String f152354d;

    public q300() {
        super(4);
        this.f152351a = "coeff";
        this.f152353c = new float[4];
        this.f152354d = "precision highp float;\nvarying vec2 textureCoordinate; \nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform sampler2D inputImageTexture2;\nuniform sampler2D inputImageTexture3;\nvoid main(){ \n    vec4 color1 = max(texture2D(inputImageTexture0, textureCoordinate), texture2D(inputImageTexture1, textureCoordinate));\n    vec4 color2 = max(texture2D(inputImageTexture2, textureCoordinate), texture2D(inputImageTexture3, textureCoordinate));\n    gl_FragColor = max(color1, color2); \n}\n";
        setFloatTexture(true);
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return this.f152354d;
    }

    @Override // p149l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
        this.f152352b = GLES20.glGetUniformLocation(this.programHandle, "coeff");
    }

    @Override // p149l.xj10, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
    }
}
