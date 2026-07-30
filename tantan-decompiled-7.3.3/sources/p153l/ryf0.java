package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class ryf0 extends jt2 {

    /* JADX INFO: renamed from: a */
    private int f165430a;

    /* JADX INFO: renamed from: b */
    protected float f165431b = 0.04f;

    /* JADX INFO: renamed from: c */
    protected float f165432c = 0.0f;

    /* JADX INFO: renamed from: d */
    private float f165433d = 0.5f;

    /* JADX INFO: renamed from: e */
    private float f165434e = 0.0f;

    /* JADX INFO: renamed from: f */
    private float f165435f = 0.0f;

    /* JADX INFO: renamed from: Q1 */
    public void m183603Q1(float f) {
        this.f165434e = f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m183604R1(float f) {
        this.f165435f = f;
    }

    /* JADX INFO: renamed from: S1 */
    public synchronized void m183605S1() {
        this.f165431b = 0.04f;
        this.f165432c = 0.0f;
        this.f165433d = 0.5f;
        this.f165434e = 0.0f;
        this.f165435f = 0.0f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n  uniform float range;\nvoid main(){\n    vec2 uv = textureCoordinate;\n    if (uv.x > range && uv.x < 1.0 - range) {\n        gl_FragColor = texture2D(inputImageTexture0,uv);\n    } else {    }\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f165430a = GLES20.glGetUniformLocation(this.programHandle, "range");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        this.f165432c += this.f165431b;
        super.passShaderValues();
        if (this.f165432c >= this.f165435f) {
            float f = this.f165433d - this.f165434e;
            this.f165433d = f;
            if (f < 0.0f) {
                this.f165433d = 0.0f;
            }
        }
        GLES20.glUniform1f(this.f165430a, this.f165433d);
    }
}
