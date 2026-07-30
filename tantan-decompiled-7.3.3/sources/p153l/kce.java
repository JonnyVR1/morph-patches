package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class kce extends jt2 {

    /* JADX INFO: renamed from: a */
    int f125045a;

    /* JADX INFO: renamed from: b */
    int f125046b;

    /* JADX INFO: renamed from: c */
    int f125047c;

    /* JADX INFO: renamed from: d */
    int f125048d;

    /* JADX INFO: renamed from: e */
    int f125049e;

    /* JADX INFO: renamed from: f */
    int f125050f;

    /* JADX INFO: renamed from: i */
    private float f125052i;

    /* JADX INFO: renamed from: g */
    private float[] f125051g = new float[2];

    /* JADX INFO: renamed from: j */
    private float[] f125053j = new float[4];

    /* JADX INFO: renamed from: k */
    private float[] f125054k = new float[4];

    /* JADX INFO: renamed from: l */
    private float[] f125055l = new float[4];

    /* JADX INFO: renamed from: m */
    private float[] f125056m = new float[4];

    /* JADX INFO: renamed from: n */
    String f125057n = "precision highp float;\nattribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nuniform vec2 stepSize;\nuniform float Stride;\nvarying vec2 TexCoord1;\nvarying vec2 TexCoord2;\nvarying vec2 TexCoord3;\nvarying vec2 TexCoord4;\nvoid main(){ \n    TexCoord1 = inputTextureCoordinate;\n    TexCoord2 = inputTextureCoordinate + stepSize*Stride;\n    TexCoord3 = inputTextureCoordinate + stepSize*2.0*Stride;\n    TexCoord4 = inputTextureCoordinate + stepSize*3.0*Stride;\n    gl_Position = position;\n}";

    /* JADX INFO: renamed from: o */
    String f125058o = "precision highp float;\nuniform vec4 colorCoeff1;\nuniform vec4 colorCoeff2;\nuniform vec4 colorCoeff3;\nuniform vec4 colorCoeff4;\nvarying vec2 TexCoord1;\nvarying vec2 TexCoord2;\nvarying vec2 TexCoord3;\nvarying vec2 TexCoord4;\nuniform sampler2D inputImageTexture0;\nvoid main(){ \n    gl_FragColor = texture2D(inputImageTexture0, TexCoord1)*colorCoeff1 + texture2D(inputImageTexture0, TexCoord2)*colorCoeff2 + texture2D(inputImageTexture0, TexCoord3)*colorCoeff3 + texture2D(inputImageTexture0, TexCoord4)*colorCoeff4; \n}";

    /* JADX INFO: renamed from: Q1 */
    public void m149106Q1(float f, float f2, float f3, float f4) {
        float[] fArr = this.f125053j;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }

    /* JADX INFO: renamed from: R1 */
    public void m149107R1(float f, float f2, float f3, float f4) {
        float[] fArr = this.f125054k;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }

    /* JADX INFO: renamed from: S1 */
    public void m149108S1(float f, float f2, float f3, float f4) {
        float[] fArr = this.f125055l;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }

    /* JADX INFO: renamed from: T1 */
    public void m149109T1(float f, float f2, float f3, float f4) {
        float[] fArr = this.f125056m;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }

    /* JADX INFO: renamed from: U1 */
    public void m149110U1(float f, float f2) {
        float[] fArr = this.f125051g;
        fArr[0] = f;
        fArr[1] = f2;
    }

    /* JADX INFO: renamed from: V1 */
    public void m149111V1(float f) {
        this.f125052i = f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return this.f125058o;
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return this.f125057n;
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        super.initWithGLContext();
        this.f125045a = GLES20.glGetUniformLocation(this.programHandle, "stepSize");
        this.f125046b = GLES20.glGetUniformLocation(this.programHandle, "Stride");
        this.f125047c = GLES20.glGetUniformLocation(this.programHandle, "colorCoeff1");
        this.f125048d = GLES20.glGetUniformLocation(this.programHandle, "colorCoeff2");
        this.f125049e = GLES20.glGetUniformLocation(this.programHandle, "colorCoeff3");
        this.f125050f = GLES20.glGetUniformLocation(this.programHandle, "colorCoeff4");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f125046b, this.f125052i);
        int i = this.f125045a;
        float[] fArr = this.f125051g;
        GLES20.glUniform2f(i, fArr[0], fArr[1]);
        int i2 = this.f125047c;
        float[] fArr2 = this.f125053j;
        GLES20.glUniform4f(i2, fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        int i3 = this.f125048d;
        float[] fArr3 = this.f125054k;
        GLES20.glUniform4f(i3, fArr3[0], fArr3[1], fArr3[2], fArr3[3]);
        int i4 = this.f125049e;
        float[] fArr4 = this.f125055l;
        GLES20.glUniform4f(i4, fArr4[0], fArr4[1], fArr4[2], fArr4[3]);
        int i5 = this.f125050f;
        float[] fArr5 = this.f125056m;
        GLES20.glUniform4f(i5, fArr5[0], fArr5[1], fArr5[2], fArr5[3]);
    }
}
