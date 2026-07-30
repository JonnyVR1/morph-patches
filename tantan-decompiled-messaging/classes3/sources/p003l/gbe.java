package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class gbe extends ts2 {

    /* JADX INFO: renamed from: a */
    int f3828a;

    /* JADX INFO: renamed from: b */
    int f3829b;

    /* JADX INFO: renamed from: c */
    int f3830c;

    /* JADX INFO: renamed from: d */
    int f3831d;

    /* JADX INFO: renamed from: e */
    int f3832e;

    /* JADX INFO: renamed from: f */
    int f3833f;

    /* JADX INFO: renamed from: i */
    private float f3835i;

    /* JADX INFO: renamed from: g */
    private float[] f3834g = new float[2];

    /* JADX INFO: renamed from: j */
    private float[] f3836j = new float[4];

    /* JADX INFO: renamed from: k */
    private float[] f3837k = new float[4];

    /* JADX INFO: renamed from: l */
    private float[] f3838l = new float[4];

    /* JADX INFO: renamed from: m */
    private float[] f3839m = new float[4];

    /* JADX INFO: renamed from: n */
    String f3840n = "precision highp float;\nattribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nuniform vec2 stepSize;\nuniform float Stride;\nvarying vec2 TexCoord1;\nvarying vec2 TexCoord2;\nvarying vec2 TexCoord3;\nvarying vec2 TexCoord4;\nvoid main(){ \n    TexCoord1 = inputTextureCoordinate;\n    TexCoord2 = inputTextureCoordinate + stepSize*Stride;\n    TexCoord3 = inputTextureCoordinate + stepSize*2.0*Stride;\n    TexCoord4 = inputTextureCoordinate + stepSize*3.0*Stride;\n    gl_Position = position;\n}";

    /* JADX INFO: renamed from: o */
    String f3841o = "precision highp float;\nuniform vec4 colorCoeff1;\nuniform vec4 colorCoeff2;\nuniform vec4 colorCoeff3;\nuniform vec4 colorCoeff4;\nvarying vec2 TexCoord1;\nvarying vec2 TexCoord2;\nvarying vec2 TexCoord3;\nvarying vec2 TexCoord4;\nuniform sampler2D inputImageTexture0;\nvoid main(){ \n    gl_FragColor = texture2D(inputImageTexture0, TexCoord1)*colorCoeff1 + texture2D(inputImageTexture0, TexCoord2)*colorCoeff2 + texture2D(inputImageTexture0, TexCoord3)*colorCoeff3 + texture2D(inputImageTexture0, TexCoord4)*colorCoeff4; \n}";

    /* JADX INFO: renamed from: Q1 */
    public void m4520Q1(float f, float f2, float f3, float f4) {
        float[] fArr = this.f3836j;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }

    /* JADX INFO: renamed from: R1 */
    public void m4521R1(float f, float f2, float f3, float f4) {
        float[] fArr = this.f3837k;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }

    /* JADX INFO: renamed from: S1 */
    public void m4522S1(float f, float f2, float f3, float f4) {
        float[] fArr = this.f3838l;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }

    /* JADX INFO: renamed from: T1 */
    public void m4523T1(float f, float f2, float f3, float f4) {
        float[] fArr = this.f3839m;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }

    /* JADX INFO: renamed from: U1 */
    public void m4524U1(float f, float f2) {
        float[] fArr = this.f3834g;
        fArr[0] = f;
        fArr[1] = f2;
    }

    /* JADX INFO: renamed from: V1 */
    public void m4525V1(float f) {
        this.f3835i = f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return this.f3841o;
    }

    @Override // p003l.ccj
    public String getVertexShader() {
        return this.f3840n;
    }

    @Override // p003l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
        this.f3828a = GLES20.glGetUniformLocation(this.programHandle, "stepSize");
        this.f3829b = GLES20.glGetUniformLocation(this.programHandle, "Stride");
        this.f3830c = GLES20.glGetUniformLocation(this.programHandle, "colorCoeff1");
        this.f3831d = GLES20.glGetUniformLocation(this.programHandle, "colorCoeff2");
        this.f3832e = GLES20.glGetUniformLocation(this.programHandle, "colorCoeff3");
        this.f3833f = GLES20.glGetUniformLocation(this.programHandle, "colorCoeff4");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f3829b, this.f3835i);
        int i = this.f3828a;
        float[] fArr = this.f3834g;
        GLES20.glUniform2f(i, fArr[0], fArr[1]);
        int i2 = this.f3830c;
        float[] fArr2 = this.f3836j;
        GLES20.glUniform4f(i2, fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        int i3 = this.f3831d;
        float[] fArr3 = this.f3837k;
        GLES20.glUniform4f(i3, fArr3[0], fArr3[1], fArr3[2], fArr3[3]);
        int i4 = this.f3832e;
        float[] fArr4 = this.f3838l;
        GLES20.glUniform4f(i4, fArr4[0], fArr4[1], fArr4[2], fArr4[3]);
        int i5 = this.f3833f;
        float[] fArr5 = this.f3839m;
        GLES20.glUniform4f(i5, fArr5[0], fArr5[1], fArr5[2], fArr5[3]);
    }
}
