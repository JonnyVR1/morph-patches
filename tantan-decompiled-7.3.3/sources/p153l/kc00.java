package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class kc00 extends hs10 {

    /* JADX INFO: renamed from: a */
    private int f125009a;

    /* JADX INFO: renamed from: b */
    private float[] f125010b;

    /* JADX INFO: renamed from: c */
    String f125011c;

    public kc00() {
        super(3);
        this.f125010b = new float[3];
        this.f125011c = "precision highp float;\nvarying vec2 textureCoordinate;\nuniform vec3 mixCoeff;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform sampler2D inputImageTexture2;\nvoid main() {\n    gl_FragColor = texture2D(inputImageTexture0, textureCoordinate)*mixCoeff.x + texture2D(inputImageTexture1, textureCoordinate)*mixCoeff.y + texture2D(inputImageTexture2, textureCoordinate)*mixCoeff.z;\n}";
        setFloatTexture(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m149094Q1(float f, float f2, float f3) {
        float[] fArr = this.f125010b;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return this.f125011c;
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        super.initWithGLContext();
        this.f125009a = GLES20.glGetUniformLocation(this.programHandle, "mixCoeff");
    }

    @Override // p153l.hs10, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        int i = this.f125009a;
        float[] fArr = this.f125010b;
        GLES20.glUniform3f(i, fArr[0], fArr[1], fArr[2]);
    }
}
