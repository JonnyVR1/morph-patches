package p003l;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.Matrix;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class jhq0 extends xj10 {

    /* JADX INFO: renamed from: A */
    private float f4646A;

    /* JADX INFO: renamed from: B */
    private float f4647B;

    /* JADX INFO: renamed from: C */
    private float f4648C;

    /* JADX INFO: renamed from: a */
    private int f4649a;

    /* JADX INFO: renamed from: b */
    private int f4650b;

    /* JADX INFO: renamed from: c */
    private int f4651c;

    /* JADX INFO: renamed from: d */
    private int f4652d;

    /* JADX INFO: renamed from: e */
    private int f4653e;

    /* JADX INFO: renamed from: f */
    private int f4654f;

    /* JADX INFO: renamed from: g */
    private int f4655g;

    /* JADX INFO: renamed from: i */
    private boolean f4656i;

    /* JADX INFO: renamed from: j */
    private float f4657j;

    /* JADX INFO: renamed from: k */
    private float f4658k;

    /* JADX INFO: renamed from: l */
    private float f4659l;

    /* JADX INFO: renamed from: m */
    private float f4660m;

    /* JADX INFO: renamed from: n */
    private float f4661n;

    /* JADX INFO: renamed from: o */
    private float f4662o;

    /* JADX INFO: renamed from: p */
    private float f4663p;

    /* JADX INFO: renamed from: q */
    private float f4664q;

    /* JADX INFO: renamed from: r */
    private float f4665r;

    /* JADX INFO: renamed from: s */
    public float[] f4666s;

    /* JADX INFO: renamed from: t */
    private float f4667t;

    /* JADX INFO: renamed from: u */
    private float f4668u;

    /* JADX INFO: renamed from: v */
    private float f4669v;

    /* JADX INFO: renamed from: x */
    private boolean f4670x;

    /* JADX INFO: renamed from: y */
    private float f4671y;

    /* JADX INFO: renamed from: z */
    private float f4672z;

    public jhq0() {
        super(2);
        this.f4656i = false;
        this.f4657j = 0.0f;
        this.f4658k = 0.5f;
        this.f4659l = 0.0f;
        this.f4660m = 1.0f;
        this.f4661n = 1.0f;
        this.f4662o = 0.0f;
        this.f4663p = 0.0f;
        this.f4664q = 0.0f;
        this.f4665r = 1.0f;
        this.f4667t = -1.0f;
        this.f4668u = 0.0f;
        this.f4669v = 0.0f;
        this.f4670x = false;
        this.f4671y = 0.0f;
        this.f4672z = 0.0f;
        this.f4647B = 0.0f;
        this.f4648C = 0.5f;
        this.f4666s = new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    /* JADX INFO: renamed from: Q1 */
    public void m5331Q1() {
        float f = this.f4658k + this.f4662o;
        this.f4658k = f;
        if (f >= 0.7f) {
            this.f4658k = 0.7f;
        }
        float f2 = this.f4648C + this.f4647B;
        this.f4648C = f2;
        if (f2 >= 0.6f) {
            this.f4648C = 0.6f;
        }
        float f3 = this.f4665r;
        setRenderVertices(m5333S1(f3, f3, new PointF(this.f4658k, this.f4648C)));
    }

    /* JADX INFO: renamed from: R1 */
    public void m5332R1(float f) {
        this.f4661n = (1.0f - f) + 1.0f;
    }

    /* JADX INFO: renamed from: S1 */
    public float[] m5333S1(float f, float f2, PointF pointF) {
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
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.f4666s, 0);
        return new float[]{fArr2[0], fArr2[1], fArr2[4], fArr2[5], fArr2[8], fArr2[9], fArr2[12], fArr2[13]};
    }

    /* JADX INFO: renamed from: T1 */
    public void m5334T1(float f) {
        this.f4657j = f;
    }

    /* JADX INFO: renamed from: U1 */
    public void m5335U1(float f) {
        this.f4664q = f;
    }

    /* JADX INFO: renamed from: V1 */
    public void m5336V1(float f) {
        float f2 = (1.0f - f) + 1.0f;
        this.f4659l = f2;
        this.f4660m = f2;
    }

    /* JADX INFO: renamed from: W1 */
    public void m5337W1(float f) {
        this.f4663p = f;
        this.f4646A = f;
    }

    /* JADX INFO: renamed from: X1 */
    public void m5338X1(float f) {
        this.f4658k = f;
    }

    /* JADX INFO: renamed from: Y1 */
    public void m5339Y1(float f) {
        this.f4662o = f;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m5340Z1(float f) {
        this.f4648C = f;
    }

    /* JADX INFO: renamed from: a2 */
    public void m5341a2(float f) {
        this.f4647B = f;
    }

    /* JADX INFO: renamed from: b2 */
    public void m5342b2(boolean z, int i) {
        this.f4670x = z;
        this.f4671y = i;
    }

    /* JADX INFO: renamed from: c2 */
    public void m5343c2(float f) {
        this.f4665r = ((f - 1.0f) * 2.0f) + 1.0f;
    }

    /* JADX INFO: renamed from: d2 */
    public void m5344d2(boolean z) {
        this.f4656i = z;
        this.f4657j = 0.0f;
        this.f4658k = 0.5f;
        this.f4659l = 0.0f;
        this.f4661n = 1.0f;
        this.f4662o = 0.0f;
        this.f4663p = 0.0f;
        this.f4664q = 0.0f;
        this.f4669v = 0.0f;
        this.f4667t = -1.0f;
        this.f4668u = 0.0f;
        this.f4670x = false;
        this.f4671y = 1.0f;
        this.f4672z = 0.0f;
        this.f4660m = 0.0f;
        this.f4646A = 0.0f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float scale;\n  uniform float ratio;\n  uniform float initScale;\n  uniform float slope;\n  uniform float intercept;\n  uniform float useTransfer;\n  uniform float index;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    vec2 uv1 = scaleFromCenter(uv,scale);\n    vec3 color1 = texture2D(inputImageTexture1, uv1).rgb;\n    vec2 uv2 = scaleFromCenter(uv,initScale);\n    vec3 color2 = texture2D(inputImageTexture0, uv2).rgb;\n    vec3 mixColor = mix(color1, color2, 1.0 - ratio);\n    if (useTransfer == 1.0) {\n       if (index == 0.0) {\n          if (uv.x > slope * uv.y + intercept) {\n             gl_FragColor = vec4(mixColor,1.0);\n          } else {\n             gl_FragColor = vec4(1.0,1.0,1.0,1.0);\n          }\n       } else {\n          if (uv.x < slope * uv.y + intercept) {\n             gl_FragColor = vec4(mixColor,1.0);\n          } else {\n             gl_FragColor = vec4(1.0,1.0,1.0,1.0);\n          }\n       }\n    } else {\n      gl_FragColor = vec4(mixColor,1.0);\n    }\n}\n";
    }

    @Override // p003l.xj10, p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f4649a = GLES20.glGetUniformLocation(this.programHandle, "scale");
        this.f4650b = GLES20.glGetUniformLocation(this.programHandle, "ratio");
        this.f4651c = GLES20.glGetUniformLocation(this.programHandle, "initScale");
        this.f4652d = GLES20.glGetUniformLocation(this.programHandle, "slope");
        this.f4653e = GLES20.glGetUniformLocation(this.programHandle, "intercept");
        this.f4654f = GLES20.glGetUniformLocation(this.programHandle, "useTransfer");
        this.f4655g = GLES20.glGetUniformLocation(this.programHandle, "index");
    }

    @Override // p003l.xj10, p003l.ccj
    public void passShaderValues() {
        m5331Q1();
        super.passShaderValues();
        if (this.f4656i) {
            float f = this.f4663p;
            if (f > 0.0f) {
                float f2 = this.f4659l + f;
                this.f4659l = f2;
                if (f2 >= 1.0f) {
                    this.f4659l = 1.0f;
                }
            } else {
                float f3 = f + 1.0f;
                this.f4659l = f3;
                this.f4663p = f + this.f4646A;
                float f4 = this.f4660m;
                if (f3 <= f4) {
                    this.f4659l = f4;
                }
            }
            float f5 = this.f4657j + this.f4664q;
            this.f4657j = f5;
            if (f5 >= 1.0d) {
                this.f4657j = 1.0f;
            }
            if (this.f4670x) {
                if (this.f4671y == 0.0f && Math.abs(this.f4663p) >= 0.2f) {
                    float f6 = this.f4668u + 1.0f;
                    this.f4668u = f6;
                    this.f4669v = -f6;
                    this.f4667t += 1.5f;
                    this.f4672z = 1.0f;
                } else if (this.f4671y == 1.0f) {
                    float f7 = this.f4668u + 1.0f;
                    this.f4668u = f7;
                    this.f4669v = -f7;
                    this.f4667t += 1.3f;
                    this.f4672z = 1.0f;
                }
            }
        }
        GLES20.glUniform1f(this.f4649a, this.f4659l);
        GLES20.glUniform1f(this.f4650b, this.f4657j);
        GLES20.glUniform1f(this.f4651c, this.f4661n);
        GLES20.glUniform1f(this.f4652d, this.f4669v);
        GLES20.glUniform1f(this.f4653e, this.f4667t);
        GLES20.glUniform1f(this.f4654f, this.f4672z);
        GLES20.glUniform1f(this.f4655g, this.f4671y);
    }
}
