package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class nc00 extends hs10 {

    /* JADX INFO: renamed from: a */
    final String f141301a;

    /* JADX INFO: renamed from: b */
    int f141302b;

    /* JADX INFO: renamed from: c */
    float[] f141303c;

    /* JADX INFO: renamed from: d */
    String f141304d;

    public nc00() {
        super(4);
        this.f141301a = "coeff";
        this.f141303c = new float[4];
        this.f141304d = "precision highp float;\nvarying vec2 textureCoordinate; \nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform sampler2D inputImageTexture2;\nuniform sampler2D inputImageTexture3;\nvoid main(){ \n    vec4 color1 = max(texture2D(inputImageTexture0, textureCoordinate), texture2D(inputImageTexture1, textureCoordinate));\n    vec4 color2 = max(texture2D(inputImageTexture2, textureCoordinate), texture2D(inputImageTexture3, textureCoordinate));\n    gl_FragColor = max(color1, color2); \n}\n";
        setFloatTexture(true);
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return this.f141304d;
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        super.initWithGLContext();
        this.f141302b = GLES20.glGetUniformLocation(this.programHandle, "coeff");
    }

    @Override // p153l.hs10, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
    }
}
