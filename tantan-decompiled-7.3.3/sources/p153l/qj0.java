package p153l;

import android.opengl.GLES20;
import com.p051p1.mobile.putong.data.OMSFontStyle;

/* JADX INFO: loaded from: classes3.dex */
public class qj0 extends jt2 {

    /* JADX INFO: renamed from: a */
    private int f157900a;

    /* JADX INFO: renamed from: b */
    private int f157901b;

    /* JADX INFO: renamed from: c */
    protected float f157902c = 0.04f;

    /* JADX INFO: renamed from: d */
    protected float f157903d = 0.0f;

    /* JADX INFO: renamed from: e */
    protected float f157904e = 0.0f;

    /* JADX INFO: renamed from: f */
    private float f157905f = 1.0f;

    /* JADX INFO: renamed from: g */
    private float f157906g = 0.0f;

    /* JADX INFO: renamed from: i */
    private float f157907i = 1.0f;

    /* JADX INFO: renamed from: j */
    private float f157908j = 0.0f;

    /* JADX INFO: renamed from: k */
    private float f157909k = 0.0f;

    /* JADX INFO: renamed from: l */
    private float f157910l = 1.0f;

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m176794Q1(float f) {
        this.f157904e = f;
    }

    /* JADX INFO: renamed from: R1 */
    public synchronized void m176795R1(float f) {
        this.f157906g = f;
    }

    /* JADX INFO: renamed from: S1 */
    public synchronized void m176796S1(float f) {
        this.f157905f = f;
    }

    /* JADX INFO: renamed from: T1 */
    public synchronized void m176797T1(float f) {
        this.f157909k = f;
    }

    /* JADX INFO: renamed from: U1 */
    public synchronized void m176798U1(float f) {
        this.f157908j = f;
    }

    /* JADX INFO: renamed from: V1 */
    public synchronized void m176799V1(float f) {
        this.f157910l = f;
    }

    /* JADX INFO: renamed from: W1 */
    public synchronized void m176800W1() {
        this.f157902c = 0.04f;
        this.f157903d = 0.0f;
        this.f157904e = 0.0f;
        this.f157905f = 1.0f;
        this.f157906g = 0.0f;
        this.f157907i = 1.0f;
        this.f157908j = 0.0f;
        this.f157909k = 0.0f;
        this.f157910l = 1.0f;
    }

    @Override // p153l.gfj
    public void drawSub() {
        if (this.f157905f >= 1.0f) {
            super.drawSub();
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        super.drawSub();
        GLES20.glDisable(3042);
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n  uniform float alpha;\n  uniform float light;\nvoid main(){\n    vec2 uv = textureCoordinate;\n    gl_FragColor = vec4(texture2D(inputImageTexture0, uv).rgb,alpha)*light;\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f157900a = GLES20.glGetUniformLocation(this.programHandle, "alpha");
        this.f157901b = GLES20.glGetUniformLocation(this.programHandle, OMSFontStyle.light);
    }

    @Override // p153l.wej
    public void passShaderValues() {
        this.f157903d += this.f157902c;
        super.passShaderValues();
        float f = this.f157903d;
        if (f > this.f157904e) {
            float f2 = this.f157905f + this.f157906g;
            this.f157905f = f2;
            if (f2 > 1.0f) {
                this.f157905f = 1.0f;
            }
        }
        if (f > this.f157909k) {
            float f3 = this.f157908j;
            if (f3 > 0.0f) {
                float f4 = this.f157907i - f3;
                this.f157907i = f4;
                float f5 = this.f157910l;
                if (f4 < f5) {
                    this.f157907i = f5;
                }
            } else {
                float f6 = this.f157910l - f3;
                this.f157910l = f6;
                this.f157907i = f6;
                if (f6 > 1.0f) {
                    this.f157907i = 1.0f;
                }
            }
        }
        GLES20.glUniform1f(this.f157900a, this.f157905f);
        GLES20.glUniform1f(this.f157901b, this.f157907i);
    }
}
