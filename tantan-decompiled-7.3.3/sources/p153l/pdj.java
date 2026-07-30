package p153l;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public class pdj extends jt2 {

    /* JADX INFO: renamed from: a */
    protected int f151793a;

    /* JADX INFO: renamed from: k */
    protected ymi f151802k;

    /* JADX INFO: renamed from: m */
    protected float f151804m;

    /* JADX INFO: renamed from: n */
    protected float f151805n;

    /* JADX INFO: renamed from: c */
    protected float f151795c = 0.5f;

    /* JADX INFO: renamed from: d */
    protected float f151796d = 1.0f;

    /* JADX INFO: renamed from: e */
    protected float f151797e = 0.0f;

    /* JADX INFO: renamed from: f */
    protected float f151798f = 0.0f;

    /* JADX INFO: renamed from: g */
    protected float f151799g = 1.0f;

    /* JADX INFO: renamed from: i */
    protected float f151800i = 1.0f;

    /* JADX INFO: renamed from: j */
    protected boolean f151801j = false;

    /* JADX INFO: renamed from: l */
    protected float f151803l = 0.04f;

    /* JADX INFO: renamed from: b */
    protected float[] f151794b = {-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: Q1 */
    public void m171870Q1() {
        if (this.f151804m >= this.f151805n) {
            float f = this.f151795c + this.f151798f;
            this.f151795c = f;
            float f2 = this.f151796d;
            if (f > f2 / 2.0f) {
                this.f151795c = f2 / 2.0f;
            }
        }
        float f3 = this.f151796d;
        setRenderVertices(m171873T1(f3, f3, new PointF(this.f151795c, 0.5f)));
    }

    /* JADX INFO: renamed from: R1 */
    public void m171871R1(float f) {
        this.f151800i = f;
    }

    /* JADX INFO: renamed from: S1 */
    public void m171872S1(float f) {
        this.f151799g = f;
    }

    /* JADX INFO: renamed from: T1 */
    public float[] m171873T1(float f, float f2, PointF pointF) {
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
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.f151794b, 0);
        return new float[]{fArr2[0], fArr2[1], fArr2[4], fArr2[5], fArr2[8], fArr2[9], fArr2[12], fArr2[13]};
    }

    /* JADX INFO: renamed from: U1 */
    public void m171874U1(float f) {
        this.f151797e = f;
    }

    /* JADX INFO: renamed from: V1 */
    public void m171875V1(float f) {
        this.f151805n = f;
        this.f151803l = 0.04f;
    }

    /* JADX INFO: renamed from: W1 */
    public void m171876W1(float f) {
        this.f151798f = f;
    }

    /* JADX INFO: renamed from: X1 */
    public void m171877X1(float f) {
        this.f151805n = f;
        this.f151803l = 0.04f;
    }

    /* JADX INFO: renamed from: Y1 */
    public void m171878Y1(boolean z) {
        this.f151801j = z;
        this.f151802k = new ymi(this.f151799g, 1.0f, 3.0f);
        this.f151803l = 0.04f;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m171879Z1(float f) {
        this.f151796d = ((f - 1.0f) * 2.0f) + 1.0f;
    }

    /* JADX INFO: renamed from: a2 */
    public synchronized void m171880a2() {
        this.f151795c = 0.5f;
        this.f151796d = 1.0f;
        this.f151797e = 0.0f;
        this.f151798f = 0.0f;
        this.f151799g = 1.0f;
        this.f151800i = 1.0f;
        this.f151801j = false;
        this.f151803l = 0.04f;
        this.f151804m = 0.0f;
        this.f151805n = 0.0f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n  uniform float scaleStep;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale > 1.0 || scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    vec2 uv2 = scaleFromCenter(uv, scaleStep);\n    gl_FragColor = texture2D(inputImageTexture0, uv2);\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f151793a = GLES20.glGetUniformLocation(this.programHandle, "scaleStep");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        this.f151804m += this.f151803l;
        m171870Q1();
        super.passShaderValues();
        boolean z = this.f151801j;
        float f = this.f151804m;
        if (z) {
            if (f <= 3.0f) {
                this.f151799g = this.f151802k.m216693a(f);
            }
        } else if (f > this.f151805n) {
            float f2 = this.f151799g;
            float f3 = this.f151797e;
            float f4 = f2 + f3;
            this.f151799g = f4;
            if (f3 <= 0.0f) {
                float f5 = this.f151800i;
                if (f4 < f5) {
                    this.f151799g = f5;
                }
            } else if (f4 > 1.0f) {
                this.f151799g = 1.0f;
            }
        }
        GLES20.glUniform1f(this.f151793a, this.f151799g);
    }
}
