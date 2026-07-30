package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class n300 extends xj10 {

    /* JADX INFO: renamed from: a */
    private int f5826a;

    /* JADX INFO: renamed from: b */
    private float[] f5827b;

    /* JADX INFO: renamed from: c */
    String f5828c;

    public n300() {
        super(3);
        this.f5827b = new float[3];
        this.f5828c = "precision highp float;\nvarying vec2 textureCoordinate;\nuniform vec3 mixCoeff;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform sampler2D inputImageTexture2;\nvoid main() {\n    gl_FragColor = texture2D(inputImageTexture0, textureCoordinate)*mixCoeff.x + texture2D(inputImageTexture1, textureCoordinate)*mixCoeff.y + texture2D(inputImageTexture2, textureCoordinate)*mixCoeff.z;\n}";
        setFloatTexture(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m6525Q1(float f, float f2, float f3) {
        float[] fArr = this.f5827b;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return this.f5828c;
    }

    @Override // p003l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
        this.f5826a = GLES20.glGetUniformLocation(this.programHandle, "mixCoeff");
    }

    @Override // p003l.xj10, p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        int i = this.f5826a;
        float[] fArr = this.f5827b;
        GLES20.glUniform3f(i, fArr[0], fArr[1], fArr[2]);
    }
}
