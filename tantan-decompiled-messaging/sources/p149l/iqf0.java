package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class iqf0 extends ts2 {

    /* JADX INFO: renamed from: a */
    private int f114500a;

    /* JADX INFO: renamed from: b */
    protected float f114501b = 0.04f;

    /* JADX INFO: renamed from: c */
    protected float f114502c = 0.0f;

    /* JADX INFO: renamed from: d */
    private float f114503d = 0.5f;

    /* JADX INFO: renamed from: e */
    private float f114504e = 0.0f;

    /* JADX INFO: renamed from: f */
    private float f114505f = 0.0f;

    /* JADX INFO: renamed from: Q1 */
    public void m137757Q1(float f) {
        this.f114504e = f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m137758R1(float f) {
        this.f114505f = f;
    }

    /* JADX INFO: renamed from: S1 */
    public synchronized void m137759S1() {
        this.f114501b = 0.04f;
        this.f114502c = 0.0f;
        this.f114503d = 0.5f;
        this.f114504e = 0.0f;
        this.f114505f = 0.0f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n  uniform float range;\nvoid main(){\n    vec2 uv = textureCoordinate;\n    if (uv.x > range && uv.x < 1.0 - range) {\n        gl_FragColor = texture2D(inputImageTexture0,uv);\n    } else {    }\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f114500a = GLES20.glGetUniformLocation(this.programHandle, "range");
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        this.f114502c += this.f114501b;
        super.passShaderValues();
        if (this.f114502c >= this.f114505f) {
            float f = this.f114503d - this.f114504e;
            this.f114503d = f;
            if (f < 0.0f) {
                this.f114503d = 0.0f;
            }
        }
        GLES20.glUniform1f(this.f114500a, this.f114503d);
    }
}
