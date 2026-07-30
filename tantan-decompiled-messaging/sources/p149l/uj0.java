package p149l;

import android.opengl.GLES20;
import com.p046p1.mobile.putong.data.OMSFontStyle;

/* JADX INFO: loaded from: classes3.dex */
public class uj0 extends ts2 {

    /* JADX INFO: renamed from: a */
    private int f176720a;

    /* JADX INFO: renamed from: b */
    private int f176721b;

    /* JADX INFO: renamed from: c */
    protected float f176722c = 0.04f;

    /* JADX INFO: renamed from: d */
    protected float f176723d = 0.0f;

    /* JADX INFO: renamed from: e */
    protected float f176724e = 0.0f;

    /* JADX INFO: renamed from: f */
    private float f176725f = 1.0f;

    /* JADX INFO: renamed from: g */
    private float f176726g = 0.0f;

    /* JADX INFO: renamed from: i */
    private float f176727i = 1.0f;

    /* JADX INFO: renamed from: j */
    private float f176728j = 0.0f;

    /* JADX INFO: renamed from: k */
    private float f176729k = 0.0f;

    /* JADX INFO: renamed from: l */
    private float f176730l = 1.0f;

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m193985Q1(float f) {
        this.f176724e = f;
    }

    /* JADX INFO: renamed from: R1 */
    public synchronized void m193986R1(float f) {
        this.f176726g = f;
    }

    /* JADX INFO: renamed from: S1 */
    public synchronized void m193987S1(float f) {
        this.f176725f = f;
    }

    /* JADX INFO: renamed from: T1 */
    public synchronized void m193988T1(float f) {
        this.f176729k = f;
    }

    /* JADX INFO: renamed from: U1 */
    public synchronized void m193989U1(float f) {
        this.f176728j = f;
    }

    /* JADX INFO: renamed from: V1 */
    public synchronized void m193990V1(float f) {
        this.f176730l = f;
    }

    /* JADX INFO: renamed from: W1 */
    public synchronized void m193991W1() {
        this.f176722c = 0.04f;
        this.f176723d = 0.0f;
        this.f176724e = 0.0f;
        this.f176725f = 1.0f;
        this.f176726g = 0.0f;
        this.f176727i = 1.0f;
        this.f176728j = 0.0f;
        this.f176729k = 0.0f;
        this.f176730l = 1.0f;
    }

    @Override // p149l.mcj
    public void drawSub() {
        if (this.f176725f >= 1.0f) {
            super.drawSub();
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        super.drawSub();
        GLES20.glDisable(3042);
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n  uniform float alpha;\n  uniform float light;\nvoid main(){\n    vec2 uv = textureCoordinate;\n    gl_FragColor = vec4(texture2D(inputImageTexture0, uv).rgb,alpha)*light;\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f176720a = GLES20.glGetUniformLocation(this.programHandle, "alpha");
        this.f176721b = GLES20.glGetUniformLocation(this.programHandle, OMSFontStyle.light);
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        this.f176723d += this.f176722c;
        super.passShaderValues();
        float f = this.f176723d;
        if (f > this.f176724e) {
            float f2 = this.f176725f + this.f176726g;
            this.f176725f = f2;
            if (f2 > 1.0f) {
                this.f176725f = 1.0f;
            }
        }
        if (f > this.f176729k) {
            float f3 = this.f176728j;
            if (f3 > 0.0f) {
                float f4 = this.f176727i - f3;
                this.f176727i = f4;
                float f5 = this.f176730l;
                if (f4 < f5) {
                    this.f176727i = f5;
                }
            } else {
                float f6 = this.f176730l - f3;
                this.f176730l = f6;
                this.f176727i = f6;
                if (f6 > 1.0f) {
                    this.f176727i = 1.0f;
                }
            }
        }
        GLES20.glUniform1f(this.f176720a, this.f176725f);
        GLES20.glUniform1f(this.f176721b, this.f176727i);
    }
}
