package p153l;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.momo.mcamera.mask.BigEyeFilter;
import com.p051p1.mobile.putong.data.OMSSizeType;

/* JADX INFO: loaded from: classes3.dex */
public class oqq0 extends hs10 {

    /* JADX INFO: renamed from: A */
    private float f148612A;

    /* JADX INFO: renamed from: B */
    private float f148613B;

    /* JADX INFO: renamed from: C */
    private float f148614C;

    /* JADX INFO: renamed from: a */
    private int f148615a;

    /* JADX INFO: renamed from: b */
    private int f148616b;

    /* JADX INFO: renamed from: c */
    private int f148617c;

    /* JADX INFO: renamed from: d */
    private int f148618d;

    /* JADX INFO: renamed from: e */
    private int f148619e;

    /* JADX INFO: renamed from: f */
    private int f148620f;

    /* JADX INFO: renamed from: g */
    private int f148621g;

    /* JADX INFO: renamed from: i */
    private boolean f148622i;

    /* JADX INFO: renamed from: j */
    private float f148623j;

    /* JADX INFO: renamed from: k */
    private float f148624k;

    /* JADX INFO: renamed from: l */
    private float f148625l;

    /* JADX INFO: renamed from: m */
    private float f148626m;

    /* JADX INFO: renamed from: n */
    private float f148627n;

    /* JADX INFO: renamed from: o */
    private float f148628o;

    /* JADX INFO: renamed from: p */
    private float f148629p;

    /* JADX INFO: renamed from: q */
    private float f148630q;

    /* JADX INFO: renamed from: r */
    private float f148631r;

    /* JADX INFO: renamed from: s */
    public float[] f148632s;

    /* JADX INFO: renamed from: t */
    private float f148633t;

    /* JADX INFO: renamed from: u */
    private float f148634u;

    /* JADX INFO: renamed from: v */
    private float f148635v;

    /* JADX INFO: renamed from: x */
    private boolean f148636x;

    /* JADX INFO: renamed from: y */
    private float f148637y;

    /* JADX INFO: renamed from: z */
    private float f148638z;

    public oqq0() {
        super(2);
        this.f148622i = false;
        this.f148623j = 0.0f;
        this.f148624k = 0.5f;
        this.f148625l = 0.0f;
        this.f148626m = 1.0f;
        this.f148627n = 1.0f;
        this.f148628o = 0.0f;
        this.f148629p = 0.0f;
        this.f148630q = 0.0f;
        this.f148631r = 1.0f;
        this.f148633t = -1.0f;
        this.f148634u = 0.0f;
        this.f148635v = 0.0f;
        this.f148636x = false;
        this.f148637y = 0.0f;
        this.f148638z = 0.0f;
        this.f148613B = 0.0f;
        this.f148614C = 0.5f;
        this.f148632s = new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    /* JADX INFO: renamed from: Q1 */
    public void m168830Q1() {
        float f = this.f148624k + this.f148628o;
        this.f148624k = f;
        if (f >= 0.7f) {
            this.f148624k = 0.7f;
        }
        float f2 = this.f148614C + this.f148613B;
        this.f148614C = f2;
        if (f2 >= 0.6f) {
            this.f148614C = 0.6f;
        }
        float f3 = this.f148631r;
        setRenderVertices(m168832S1(f3, f3, new PointF(this.f148624k, this.f148614C)));
    }

    /* JADX INFO: renamed from: R1 */
    public void m168831R1(float f) {
        this.f148627n = (1.0f - f) + 1.0f;
    }

    /* JADX INFO: renamed from: S1 */
    public float[] m168832S1(float f, float f2, PointF pointF) {
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
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.f148632s, 0);
        return new float[]{fArr2[0], fArr2[1], fArr2[4], fArr2[5], fArr2[8], fArr2[9], fArr2[12], fArr2[13]};
    }

    /* JADX INFO: renamed from: T1 */
    public void m168833T1(float f) {
        this.f148623j = f;
    }

    /* JADX INFO: renamed from: U1 */
    public void m168834U1(float f) {
        this.f148630q = f;
    }

    /* JADX INFO: renamed from: V1 */
    public void m168835V1(float f) {
        float f2 = (1.0f - f) + 1.0f;
        this.f148625l = f2;
        this.f148626m = f2;
    }

    /* JADX INFO: renamed from: W1 */
    public void m168836W1(float f) {
        this.f148629p = f;
        this.f148612A = f;
    }

    /* JADX INFO: renamed from: X1 */
    public void m168837X1(float f) {
        this.f148624k = f;
    }

    /* JADX INFO: renamed from: Y1 */
    public void m168838Y1(float f) {
        this.f148628o = f;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m168839Z1(float f) {
        this.f148614C = f;
    }

    /* JADX INFO: renamed from: a2 */
    public void m168840a2(float f) {
        this.f148613B = f;
    }

    /* JADX INFO: renamed from: b2 */
    public void m168841b2(boolean z, int i) {
        this.f148636x = z;
        this.f148637y = i;
    }

    /* JADX INFO: renamed from: c2 */
    public void m168842c2(float f) {
        this.f148631r = ((f - 1.0f) * 2.0f) + 1.0f;
    }

    /* JADX INFO: renamed from: d2 */
    public void m168843d2(boolean z) {
        this.f148622i = z;
        this.f148623j = 0.0f;
        this.f148624k = 0.5f;
        this.f148625l = 0.0f;
        this.f148627n = 1.0f;
        this.f148628o = 0.0f;
        this.f148629p = 0.0f;
        this.f148630q = 0.0f;
        this.f148635v = 0.0f;
        this.f148633t = -1.0f;
        this.f148634u = 0.0f;
        this.f148636x = false;
        this.f148637y = 1.0f;
        this.f148638z = 0.0f;
        this.f148626m = 0.0f;
        this.f148612A = 0.0f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float scale;\n  uniform float ratio;\n  uniform float initScale;\n  uniform float slope;\n  uniform float intercept;\n  uniform float useTransfer;\n  uniform float index;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    vec2 uv1 = scaleFromCenter(uv,scale);\n    vec3 color1 = texture2D(inputImageTexture1, uv1).rgb;\n    vec2 uv2 = scaleFromCenter(uv,initScale);\n    vec3 color2 = texture2D(inputImageTexture0, uv2).rgb;\n    vec3 mixColor = mix(color1, color2, 1.0 - ratio);\n    if (useTransfer == 1.0) {\n       if (index == 0.0) {\n          if (uv.x > slope * uv.y + intercept) {\n             gl_FragColor = vec4(mixColor,1.0);\n          } else {\n             gl_FragColor = vec4(1.0,1.0,1.0,1.0);\n          }\n       } else {\n          if (uv.x < slope * uv.y + intercept) {\n             gl_FragColor = vec4(mixColor,1.0);\n          } else {\n             gl_FragColor = vec4(1.0,1.0,1.0,1.0);\n          }\n       }\n    } else {\n      gl_FragColor = vec4(mixColor,1.0);\n    }\n}\n";
    }

    @Override // p153l.hs10, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f148615a = GLES20.glGetUniformLocation(this.programHandle, BigEyeFilter.UNIFORM_SCALE);
        this.f148616b = GLES20.glGetUniformLocation(this.programHandle, OMSSizeType.ratio);
        this.f148617c = GLES20.glGetUniformLocation(this.programHandle, "initScale");
        this.f148618d = GLES20.glGetUniformLocation(this.programHandle, "slope");
        this.f148619e = GLES20.glGetUniformLocation(this.programHandle, "intercept");
        this.f148620f = GLES20.glGetUniformLocation(this.programHandle, "useTransfer");
        this.f148621g = GLES20.glGetUniformLocation(this.programHandle, FirebaseAnalytics.Param.INDEX);
    }

    @Override // p153l.hs10, p153l.wej
    public void passShaderValues() {
        m168830Q1();
        super.passShaderValues();
        if (this.f148622i) {
            float f = this.f148629p;
            if (f > 0.0f) {
                float f2 = this.f148625l + f;
                this.f148625l = f2;
                if (f2 >= 1.0f) {
                    this.f148625l = 1.0f;
                }
            } else {
                float f3 = f + 1.0f;
                this.f148625l = f3;
                this.f148629p = f + this.f148612A;
                float f4 = this.f148626m;
                if (f3 <= f4) {
                    this.f148625l = f4;
                }
            }
            float f5 = this.f148623j + this.f148630q;
            this.f148623j = f5;
            if (f5 >= 1.0d) {
                this.f148623j = 1.0f;
            }
            if (this.f148636x) {
                if (this.f148637y == 0.0f && Math.abs(this.f148629p) >= 0.2f) {
                    float f6 = this.f148634u + 1.0f;
                    this.f148634u = f6;
                    this.f148635v = -f6;
                    this.f148633t += 1.5f;
                    this.f148638z = 1.0f;
                } else if (this.f148637y == 1.0f) {
                    float f7 = this.f148634u + 1.0f;
                    this.f148634u = f7;
                    this.f148635v = -f7;
                    this.f148633t += 1.3f;
                    this.f148638z = 1.0f;
                }
            }
        }
        GLES20.glUniform1f(this.f148615a, this.f148625l);
        GLES20.glUniform1f(this.f148616b, this.f148623j);
        GLES20.glUniform1f(this.f148617c, this.f148627n);
        GLES20.glUniform1f(this.f148618d, this.f148635v);
        GLES20.glUniform1f(this.f148619e, this.f148633t);
        GLES20.glUniform1f(this.f148620f, this.f148638z);
        GLES20.glUniform1f(this.f148621g, this.f148637y);
    }
}
