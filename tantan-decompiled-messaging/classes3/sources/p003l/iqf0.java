package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class iqf0 extends ts2 {

    /* JADX INFO: renamed from: a */
    private int f4457a;

    /* JADX INFO: renamed from: b */
    protected float f4458b = 0.04f;

    /* JADX INFO: renamed from: c */
    protected float f4459c = 0.0f;

    /* JADX INFO: renamed from: d */
    private float f4460d = 0.5f;

    /* JADX INFO: renamed from: e */
    private float f4461e = 0.0f;

    /* JADX INFO: renamed from: f */
    private float f4462f = 0.0f;

    /* JADX INFO: renamed from: Q1 */
    public void m5224Q1(float f) {
        this.f4461e = f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m5225R1(float f) {
        this.f4462f = f;
    }

    /* JADX INFO: renamed from: S1 */
    public synchronized void m5226S1() {
        this.f4458b = 0.04f;
        this.f4459c = 0.0f;
        this.f4460d = 0.5f;
        this.f4461e = 0.0f;
        this.f4462f = 0.0f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n  uniform float range;\nvoid main(){\n    vec2 uv = textureCoordinate;\n    if (uv.x > range && uv.x < 1.0 - range) {\n        gl_FragColor = texture2D(inputImageTexture0,uv);\n    } else {    }\n}\n";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f4457a = GLES20.glGetUniformLocation(this.programHandle, "range");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        this.f4459c += this.f4458b;
        super.passShaderValues();
        if (this.f4459c >= this.f4462f) {
            float f = this.f4460d - this.f4461e;
            this.f4460d = f;
            if (f < 0.0f) {
                this.f4460d = 0.0f;
            }
        }
        GLES20.glUniform1f(this.f4457a, this.f4460d);
    }
}
