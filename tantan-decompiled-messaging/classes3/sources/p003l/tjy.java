package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class tjy extends xj10 {

    /* JADX INFO: renamed from: a */
    final String f7529a;

    /* JADX INFO: renamed from: b */
    private int f7530b;

    /* JADX INFO: renamed from: c */
    float[] f7531c;

    /* JADX INFO: renamed from: d */
    String f7532d;

    public tjy() {
        super(4);
        this.f7529a = "coeff";
        this.f7531c = new float[4];
        this.f7532d = "precision highp float;\nvarying vec2 textureCoordinate;\nuniform vec4 coeff;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform sampler2D inputImageTexture2;\nuniform sampler2D inputImageTexture3;\nvoid main(){ \n    gl_FragColor = texture2D(inputImageTexture0, textureCoordinate)*coeff.x + texture2D(inputImageTexture1, textureCoordinate)*coeff.y +                    texture2D(inputImageTexture2, textureCoordinate)*coeff.z + texture2D(inputImageTexture3, textureCoordinate)*coeff.w;\n}";
        setFloatTexture(true);
        float[] fArr = this.f7531c;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m7765Q1(float f, float f2, float f3, float f4) {
        float[] fArr = this.f7531c;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return this.f7532d;
    }

    @Override // p003l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
        this.f7530b = GLES20.glGetUniformLocation(this.programHandle, "coeff");
    }

    @Override // p003l.xj10, p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        int i = this.f7530b;
        float[] fArr = this.f7531c;
        GLES20.glUniform4f(i, fArr[0], fArr[1], fArr[2], fArr[3]);
    }
}
