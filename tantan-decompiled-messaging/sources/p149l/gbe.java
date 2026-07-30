package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class gbe extends ts2 {

    /* JADX INFO: renamed from: a */
    int f101828a;

    /* JADX INFO: renamed from: b */
    int f101829b;

    /* JADX INFO: renamed from: c */
    int f101830c;

    /* JADX INFO: renamed from: d */
    int f101831d;

    /* JADX INFO: renamed from: e */
    int f101832e;

    /* JADX INFO: renamed from: f */
    int f101833f;

    /* JADX INFO: renamed from: i */
    private float f101835i;

    /* JADX INFO: renamed from: g */
    private float[] f101834g = new float[2];

    /* JADX INFO: renamed from: j */
    private float[] f101836j = new float[4];

    /* JADX INFO: renamed from: k */
    private float[] f101837k = new float[4];

    /* JADX INFO: renamed from: l */
    private float[] f101838l = new float[4];

    /* JADX INFO: renamed from: m */
    private float[] f101839m = new float[4];

    /* JADX INFO: renamed from: n */
    String f101840n = "precision highp float;\nattribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nuniform vec2 stepSize;\nuniform float Stride;\nvarying vec2 TexCoord1;\nvarying vec2 TexCoord2;\nvarying vec2 TexCoord3;\nvarying vec2 TexCoord4;\nvoid main(){ \n    TexCoord1 = inputTextureCoordinate;\n    TexCoord2 = inputTextureCoordinate + stepSize*Stride;\n    TexCoord3 = inputTextureCoordinate + stepSize*2.0*Stride;\n    TexCoord4 = inputTextureCoordinate + stepSize*3.0*Stride;\n    gl_Position = position;\n}";

    /* JADX INFO: renamed from: o */
    String f101841o = "precision highp float;\nuniform vec4 colorCoeff1;\nuniform vec4 colorCoeff2;\nuniform vec4 colorCoeff3;\nuniform vec4 colorCoeff4;\nvarying vec2 TexCoord1;\nvarying vec2 TexCoord2;\nvarying vec2 TexCoord3;\nvarying vec2 TexCoord4;\nuniform sampler2D inputImageTexture0;\nvoid main(){ \n    gl_FragColor = texture2D(inputImageTexture0, TexCoord1)*colorCoeff1 + texture2D(inputImageTexture0, TexCoord2)*colorCoeff2 + texture2D(inputImageTexture0, TexCoord3)*colorCoeff3 + texture2D(inputImageTexture0, TexCoord4)*colorCoeff4; \n}";

    /* JADX INFO: renamed from: Q1 */
    public void m125126Q1(float f, float f2, float f3, float f4) {
        float[] fArr = this.f101836j;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }

    /* JADX INFO: renamed from: R1 */
    public void m125127R1(float f, float f2, float f3, float f4) {
        float[] fArr = this.f101837k;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }

    /* JADX INFO: renamed from: S1 */
    public void m125128S1(float f, float f2, float f3, float f4) {
        float[] fArr = this.f101838l;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }

    /* JADX INFO: renamed from: T1 */
    public void m125129T1(float f, float f2, float f3, float f4) {
        float[] fArr = this.f101839m;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }

    /* JADX INFO: renamed from: U1 */
    public void m125130U1(float f, float f2) {
        float[] fArr = this.f101834g;
        fArr[0] = f;
        fArr[1] = f2;
    }

    /* JADX INFO: renamed from: V1 */
    public void m125131V1(float f) {
        this.f101835i = f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return this.f101841o;
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return this.f101840n;
    }

    @Override // p149l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
        this.f101828a = GLES20.glGetUniformLocation(this.programHandle, "stepSize");
        this.f101829b = GLES20.glGetUniformLocation(this.programHandle, "Stride");
        this.f101830c = GLES20.glGetUniformLocation(this.programHandle, "colorCoeff1");
        this.f101831d = GLES20.glGetUniformLocation(this.programHandle, "colorCoeff2");
        this.f101832e = GLES20.glGetUniformLocation(this.programHandle, "colorCoeff3");
        this.f101833f = GLES20.glGetUniformLocation(this.programHandle, "colorCoeff4");
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f101829b, this.f101835i);
        int i = this.f101828a;
        float[] fArr = this.f101834g;
        GLES20.glUniform2f(i, fArr[0], fArr[1]);
        int i2 = this.f101830c;
        float[] fArr2 = this.f101836j;
        GLES20.glUniform4f(i2, fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        int i3 = this.f101831d;
        float[] fArr3 = this.f101837k;
        GLES20.glUniform4f(i3, fArr3[0], fArr3[1], fArr3[2], fArr3[3]);
        int i4 = this.f101832e;
        float[] fArr4 = this.f101838l;
        GLES20.glUniform4f(i4, fArr4[0], fArr4[1], fArr4[2], fArr4[3]);
        int i5 = this.f101833f;
        float[] fArr5 = this.f101839m;
        GLES20.glUniform4f(i5, fArr5[0], fArr5[1], fArr5[2], fArr5[3]);
    }
}
