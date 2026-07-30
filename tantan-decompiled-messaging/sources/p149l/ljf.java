package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class ljf extends ts2 {

    /* JADX INFO: renamed from: b */
    int f128314b;

    /* JADX INFO: renamed from: a */
    final String f128313a = "twoTexelSize";

    /* JADX INFO: renamed from: c */
    float[] f128315c = new float[2];

    /* JADX INFO: renamed from: d */
    String f128316d = "precision highp float;\nattribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nuniform vec2 twoTexelSize;\nvarying vec2 TexCoord1;\nvarying vec2 TexCoord2;\nvarying vec2 TexCoord3;\nvarying vec2 TexCoord4;\nvoid main(){ \nTexCoord1 = inputTextureCoordinate;\nTexCoord2 = inputTextureCoordinate + vec2(twoTexelSize.x, 0);\nTexCoord3 = inputTextureCoordinate + vec2(twoTexelSize.x, twoTexelSize.y);\nTexCoord4 = inputTextureCoordinate + vec2(0, twoTexelSize.y);\ngl_Position = position; \n}";

    /* JADX INFO: renamed from: e */
    String f128317e = "precision highp float;\nvarying vec2 TexCoord1;\nvarying vec2 TexCoord2;\nvarying vec2 TexCoord3;\nvarying vec2 TexCoord4;\nuniform sampler2D inputImageTexture0;\nvoid main(){ \n   gl_FragColor= max(max(texture2D(inputImageTexture0, TexCoord1), texture2D(inputImageTexture0, TexCoord2)), max(texture2D(inputImageTexture0, TexCoord3), texture2D(inputImageTexture0, TexCoord4))); \n}";

    public ljf(int i, int i2) {
        setRenderSize(i, i2);
        float[] fArr = this.f128315c;
        fArr[0] = 1.0f / i;
        fArr[1] = 1.0f / i2;
        setFloatTexture(true);
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return this.f128317e;
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return this.f128316d;
    }

    @Override // p149l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
        this.f128314b = GLES20.glGetUniformLocation(this.programHandle, "twoTexelSize");
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        int i = this.f128314b;
        float[] fArr = this.f128315c;
        GLES20.glUniform2f(i, fArr[0], fArr[1]);
    }
}
