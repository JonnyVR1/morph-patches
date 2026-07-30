package p149l;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public class vaj extends ts2 {

    /* JADX INFO: renamed from: a */
    protected int f180745a;

    /* JADX INFO: renamed from: k */
    protected cki f180754k;

    /* JADX INFO: renamed from: m */
    protected float f180756m;

    /* JADX INFO: renamed from: n */
    protected float f180757n;

    /* JADX INFO: renamed from: c */
    protected float f180747c = 0.5f;

    /* JADX INFO: renamed from: d */
    protected float f180748d = 1.0f;

    /* JADX INFO: renamed from: e */
    protected float f180749e = 0.0f;

    /* JADX INFO: renamed from: f */
    protected float f180750f = 0.0f;

    /* JADX INFO: renamed from: g */
    protected float f180751g = 1.0f;

    /* JADX INFO: renamed from: i */
    protected float f180752i = 1.0f;

    /* JADX INFO: renamed from: j */
    protected boolean f180753j = false;

    /* JADX INFO: renamed from: l */
    protected float f180755l = 0.04f;

    /* JADX INFO: renamed from: b */
    protected float[] f180746b = {-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: Q1 */
    public void m197631Q1() {
        if (this.f180756m >= this.f180757n) {
            float f = this.f180747c + this.f180750f;
            this.f180747c = f;
            float f2 = this.f180748d;
            if (f > f2 / 2.0f) {
                this.f180747c = f2 / 2.0f;
            }
        }
        float f3 = this.f180748d;
        setRenderVertices(m197634T1(f3, f3, new PointF(this.f180747c, 0.5f)));
    }

    /* JADX INFO: renamed from: R1 */
    public void m197632R1(float f) {
        this.f180752i = f;
    }

    /* JADX INFO: renamed from: S1 */
    public void m197633S1(float f) {
        this.f180751g = f;
    }

    /* JADX INFO: renamed from: T1 */
    public float[] m197634T1(float f, float f2, PointF pointF) {
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
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.f180746b, 0);
        return new float[]{fArr2[0], fArr2[1], fArr2[4], fArr2[5], fArr2[8], fArr2[9], fArr2[12], fArr2[13]};
    }

    /* JADX INFO: renamed from: U1 */
    public void m197635U1(float f) {
        this.f180749e = f;
    }

    /* JADX INFO: renamed from: V1 */
    public void m197636V1(float f) {
        this.f180757n = f;
        this.f180755l = 0.04f;
    }

    /* JADX INFO: renamed from: W1 */
    public void m197637W1(float f) {
        this.f180750f = f;
    }

    /* JADX INFO: renamed from: X1 */
    public void m197638X1(float f) {
        this.f180757n = f;
        this.f180755l = 0.04f;
    }

    /* JADX INFO: renamed from: Y1 */
    public void m197639Y1(boolean z) {
        this.f180753j = z;
        this.f180754k = new cki(this.f180751g, 1.0f, 3.0f);
        this.f180755l = 0.04f;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m197640Z1(float f) {
        this.f180748d = ((f - 1.0f) * 2.0f) + 1.0f;
    }

    /* JADX INFO: renamed from: a2 */
    public synchronized void m197641a2() {
        this.f180747c = 0.5f;
        this.f180748d = 1.0f;
        this.f180749e = 0.0f;
        this.f180750f = 0.0f;
        this.f180751g = 1.0f;
        this.f180752i = 1.0f;
        this.f180753j = false;
        this.f180755l = 0.04f;
        this.f180756m = 0.0f;
        this.f180757n = 0.0f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n  uniform float scaleStep;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale > 1.0 || scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    vec2 uv2 = scaleFromCenter(uv, scaleStep);\n    gl_FragColor = texture2D(inputImageTexture0, uv2);\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f180745a = GLES20.glGetUniformLocation(this.programHandle, "scaleStep");
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        this.f180756m += this.f180755l;
        m197631Q1();
        super.passShaderValues();
        boolean z = this.f180753j;
        float f = this.f180756m;
        if (z) {
            if (f <= 3.0f) {
                this.f180751g = this.f180754k.m107413a(f);
            }
        } else if (f > this.f180757n) {
            float f2 = this.f180751g;
            float f3 = this.f180749e;
            float f4 = f2 + f3;
            this.f180751g = f4;
            if (f3 <= 0.0f) {
                float f5 = this.f180752i;
                if (f4 < f5) {
                    this.f180751g = f5;
                }
            } else if (f4 > 1.0f) {
                this.f180751g = 1.0f;
            }
        }
        GLES20.glUniform1f(this.f180745a, this.f180751g);
    }
}
