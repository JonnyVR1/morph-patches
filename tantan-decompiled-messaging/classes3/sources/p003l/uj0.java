package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class uj0 extends ts2 {

    /* JADX INFO: renamed from: a */
    private int f7992a;

    /* JADX INFO: renamed from: b */
    private int f7993b;

    /* JADX INFO: renamed from: c */
    protected float f7994c = 0.04f;

    /* JADX INFO: renamed from: d */
    protected float f7995d = 0.0f;

    /* JADX INFO: renamed from: e */
    protected float f7996e = 0.0f;

    /* JADX INFO: renamed from: f */
    private float f7997f = 1.0f;

    /* JADX INFO: renamed from: g */
    private float f7998g = 0.0f;

    /* JADX INFO: renamed from: i */
    private float f7999i = 1.0f;

    /* JADX INFO: renamed from: j */
    private float f8000j = 0.0f;

    /* JADX INFO: renamed from: k */
    private float f8001k = 0.0f;

    /* JADX INFO: renamed from: l */
    private float f8002l = 1.0f;

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m8146Q1(float f) {
        this.f7996e = f;
    }

    /* JADX INFO: renamed from: R1 */
    public synchronized void m8147R1(float f) {
        this.f7998g = f;
    }

    /* JADX INFO: renamed from: S1 */
    public synchronized void m8148S1(float f) {
        this.f7997f = f;
    }

    /* JADX INFO: renamed from: T1 */
    public synchronized void m8149T1(float f) {
        this.f8001k = f;
    }

    /* JADX INFO: renamed from: U1 */
    public synchronized void m8150U1(float f) {
        this.f8000j = f;
    }

    /* JADX INFO: renamed from: V1 */
    public synchronized void m8151V1(float f) {
        this.f8002l = f;
    }

    /* JADX INFO: renamed from: W1 */
    public synchronized void m8152W1() {
        this.f7994c = 0.04f;
        this.f7995d = 0.0f;
        this.f7996e = 0.0f;
        this.f7997f = 1.0f;
        this.f7998g = 0.0f;
        this.f7999i = 1.0f;
        this.f8000j = 0.0f;
        this.f8001k = 0.0f;
        this.f8002l = 1.0f;
    }

    @Override // p003l.mcj
    public void drawSub() {
        if (this.f7997f >= 1.0f) {
            super.drawSub();
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        super.drawSub();
        GLES20.glDisable(3042);
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n  uniform float alpha;\n  uniform float light;\nvoid main(){\n    vec2 uv = textureCoordinate;\n    gl_FragColor = vec4(texture2D(inputImageTexture0, uv).rgb,alpha)*light;\n}\n";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f7992a = GLES20.glGetUniformLocation(this.programHandle, "alpha");
        this.f7993b = GLES20.glGetUniformLocation(this.programHandle, "light");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        this.f7995d += this.f7994c;
        super.passShaderValues();
        float f = this.f7995d;
        if (f > this.f7996e) {
            float f2 = this.f7997f + this.f7998g;
            this.f7997f = f2;
            if (f2 > 1.0f) {
                this.f7997f = 1.0f;
            }
        }
        if (f > this.f8001k) {
            float f3 = this.f8000j;
            if (f3 > 0.0f) {
                float f4 = this.f7999i - f3;
                this.f7999i = f4;
                float f5 = this.f8002l;
                if (f4 < f5) {
                    this.f7999i = f5;
                }
            } else {
                float f6 = this.f8002l - f3;
                this.f8002l = f6;
                this.f7999i = f6;
                if (f6 > 1.0f) {
                    this.f7999i = 1.0f;
                }
            }
        }
        GLES20.glUniform1f(this.f7992a, this.f7997f);
        GLES20.glUniform1f(this.f7993b, this.f7999i);
    }
}
