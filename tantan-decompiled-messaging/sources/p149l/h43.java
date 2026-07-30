package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class h43 extends ts2 {

    /* JADX INFO: renamed from: a */
    private int f105795a;

    /* JADX INFO: renamed from: b */
    protected float f105796b = 0.04f;

    /* JADX INFO: renamed from: c */
    protected float f105797c = 0.0f;

    /* JADX INFO: renamed from: d */
    private float f105798d = 10.0f;

    /* JADX INFO: renamed from: e */
    private float f105799e = 8.0f;

    /* JADX INFO: renamed from: Q1 */
    public void m129218Q1(float f) {
        this.f105799e = f;
    }

    /* JADX INFO: renamed from: R1 */
    public synchronized void m129219R1() {
        this.f105796b = 0.04f;
        this.f105797c = 0.0f;
        this.f105798d = 10.0f;
        this.f105799e = 0.0f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n  uniform float grad;\nvoid main(){\n    vec2 uv = textureCoordinate;\n    gl_FragColor = texture2D(inputImageTexture0,uv, grad);\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f105795a = GLES20.glGetUniformLocation(this.programHandle, "grad");
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glTexParameterf(3553, 10240, 9987.0f);
        GLES20.glTexParameterf(3553, 10241, 9987.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glGenerateMipmap(3553);
        this.f105797c += this.f105796b;
        super.passShaderValues();
        if (this.f105797c >= this.f105799e) {
            float f = this.f105798d - 1.0f;
            this.f105798d = f;
            if (f < 0.0f) {
                this.f105798d = 0.0f;
            }
        }
        GLES20.glUniform1f(this.f105795a, this.f105798d);
    }
}
