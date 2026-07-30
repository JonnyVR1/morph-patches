package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class qsy extends hs10 {

    /* JADX INFO: renamed from: a */
    final String f159367a;

    /* JADX INFO: renamed from: b */
    private int f159368b;

    /* JADX INFO: renamed from: c */
    float[] f159369c;

    /* JADX INFO: renamed from: d */
    String f159370d;

    public qsy() {
        super(4);
        this.f159367a = "coeff";
        this.f159369c = new float[4];
        this.f159370d = "precision highp float;\nvarying vec2 textureCoordinate;\nuniform vec4 coeff;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform sampler2D inputImageTexture2;\nuniform sampler2D inputImageTexture3;\nvoid main(){ \n    gl_FragColor = texture2D(inputImageTexture0, textureCoordinate)*coeff.x + texture2D(inputImageTexture1, textureCoordinate)*coeff.y +                    texture2D(inputImageTexture2, textureCoordinate)*coeff.z + texture2D(inputImageTexture3, textureCoordinate)*coeff.w;\n}";
        setFloatTexture(true);
        float[] fArr = this.f159369c;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m177842Q1(float f, float f2, float f3, float f4) {
        float[] fArr = this.f159369c;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return this.f159370d;
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        super.initWithGLContext();
        this.f159368b = GLES20.glGetUniformLocation(this.programHandle, "coeff");
    }

    @Override // p153l.hs10, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        int i = this.f159368b;
        float[] fArr = this.f159369c;
        GLES20.glUniform4f(i, fArr[0], fArr[1], fArr[2], fArr[3]);
    }
}
