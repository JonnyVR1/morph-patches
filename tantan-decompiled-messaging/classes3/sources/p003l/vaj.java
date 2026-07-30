package p003l;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.Matrix;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class vaj extends ts2 {

    /* JADX INFO: renamed from: a */
    protected int f8253a;

    /* JADX INFO: renamed from: k */
    protected cki f8262k;

    /* JADX INFO: renamed from: m */
    protected float f8264m;

    /* JADX INFO: renamed from: n */
    protected float f8265n;

    /* JADX INFO: renamed from: c */
    protected float f8255c = 0.5f;

    /* JADX INFO: renamed from: d */
    protected float f8256d = 1.0f;

    /* JADX INFO: renamed from: e */
    protected float f8257e = 0.0f;

    /* JADX INFO: renamed from: f */
    protected float f8258f = 0.0f;

    /* JADX INFO: renamed from: g */
    protected float f8259g = 1.0f;

    /* JADX INFO: renamed from: i */
    protected float f8260i = 1.0f;

    /* JADX INFO: renamed from: j */
    protected boolean f8261j = false;

    /* JADX INFO: renamed from: l */
    protected float f8263l = 0.04f;

    /* JADX INFO: renamed from: b */
    protected float[] f8254b = {-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: Q1 */
    public void m8339Q1() {
        if (this.f8264m >= this.f8265n) {
            float f = this.f8255c + this.f8258f;
            this.f8255c = f;
            float f2 = this.f8256d;
            if (f > f2 / 2.0f) {
                this.f8255c = f2 / 2.0f;
            }
        }
        float f3 = this.f8256d;
        setRenderVertices(m8342T1(f3, f3, new PointF(this.f8255c, 0.5f)));
    }

    /* JADX INFO: renamed from: R1 */
    public void m8340R1(float f) {
        this.f8260i = f;
    }

    /* JADX INFO: renamed from: S1 */
    public void m8341S1(float f) {
        this.f8259g = f;
    }

    /* JADX INFO: renamed from: T1 */
    public float[] m8342T1(float f, float f2, PointF pointF) {
        if (pointF == null) {
            return null;
        }
        float f3 = -((pointF.x * 2.0f) - 1.0f);
        float f4 = ((-pointF.y) * 2.0f) + 1.0f;
        float[] fArr = new float[16];
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr2, 0, -f3, f4, 0.0f);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        Matrix.scaleM(fArr, 0, f * 1.0f, f2 * 1.0f, 1.0f);
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.f8254b, 0);
        return new float[]{fArr2[0], fArr2[1], fArr2[4], fArr2[5], fArr2[8], fArr2[9], fArr2[12], fArr2[13]};
    }

    /* JADX INFO: renamed from: U1 */
    public void m8343U1(float f) {
        this.f8257e = f;
    }

    /* JADX INFO: renamed from: V1 */
    public void m8344V1(float f) {
        this.f8265n = f;
        this.f8263l = 0.04f;
    }

    /* JADX INFO: renamed from: W1 */
    public void m8345W1(float f) {
        this.f8258f = f;
    }

    /* JADX INFO: renamed from: X1 */
    public void m8346X1(float f) {
        this.f8265n = f;
        this.f8263l = 0.04f;
    }

    /* JADX INFO: renamed from: Y1 */
    public void m8347Y1(boolean z) {
        this.f8261j = z;
        this.f8262k = new cki(this.f8259g, 1.0f, 3.0f);
        this.f8263l = 0.04f;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m8348Z1(float f) {
        this.f8256d = ((f - 1.0f) * 2.0f) + 1.0f;
    }

    /* JADX INFO: renamed from: a2 */
    public synchronized void m8349a2() {
        this.f8255c = 0.5f;
        this.f8256d = 1.0f;
        this.f8257e = 0.0f;
        this.f8258f = 0.0f;
        this.f8259g = 1.0f;
        this.f8260i = 1.0f;
        this.f8261j = false;
        this.f8263l = 0.04f;
        this.f8264m = 0.0f;
        this.f8265n = 0.0f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n  uniform float scaleStep;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale > 1.0 || scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    vec2 uv2 = scaleFromCenter(uv, scaleStep);\n    gl_FragColor = texture2D(inputImageTexture0, uv2);\n}\n";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f8253a = GLES20.glGetUniformLocation(this.programHandle, "scaleStep");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        this.f8264m += this.f8263l;
        m8339Q1();
        super.passShaderValues();
        boolean z = this.f8261j;
        float f = this.f8264m;
        if (z) {
            if (f <= 3.0f) {
                this.f8259g = this.f8262k.m3374a(f);
            }
        } else if (f > this.f8265n) {
            float f2 = this.f8259g;
            float f3 = this.f8257e;
            float f4 = f2 + f3;
            this.f8259g = f4;
            if (f3 <= 0.0f) {
                float f5 = this.f8260i;
                if (f4 < f5) {
                    this.f8259g = f5;
                }
            } else if (f4 > 1.0f) {
                this.f8259g = 1.0f;
            }
        }
        GLES20.glUniform1f(this.f8253a, this.f8259g);
    }
}
