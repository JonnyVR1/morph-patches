package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class h43 extends ts2 {

    /* JADX INFO: renamed from: a */
    private int f4107a;

    /* JADX INFO: renamed from: b */
    protected float f4108b = 0.04f;

    /* JADX INFO: renamed from: c */
    protected float f4109c = 0.0f;

    /* JADX INFO: renamed from: d */
    private float f4110d = 10.0f;

    /* JADX INFO: renamed from: e */
    private float f4111e = 8.0f;

    /* JADX INFO: renamed from: Q1 */
    public void m4912Q1(float f) {
        this.f4111e = f;
    }

    /* JADX INFO: renamed from: R1 */
    public synchronized void m4913R1() {
        this.f4108b = 0.04f;
        this.f4109c = 0.0f;
        this.f4110d = 10.0f;
        this.f4111e = 0.0f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n  uniform float grad;\nvoid main(){\n    vec2 uv = textureCoordinate;\n    gl_FragColor = texture2D(inputImageTexture0,uv, grad);\n}\n";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f4107a = GLES20.glGetUniformLocation(this.programHandle, "grad");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glTexParameterf(3553, 10240, 9987.0f);
        GLES20.glTexParameterf(3553, 10241, 9987.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glGenerateMipmap(3553);
        this.f4109c += this.f4108b;
        super.passShaderValues();
        if (this.f4109c >= this.f4111e) {
            float f = this.f4110d - 1.0f;
            this.f4110d = f;
            if (f < 0.0f) {
                this.f4110d = 0.0f;
            }
        }
        GLES20.glUniform1f(this.f4107a, this.f4110d);
    }
}
