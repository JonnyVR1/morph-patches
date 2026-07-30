package p149l;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.momo.mcamera.mask.BigEyeFilter;
import com.p046p1.mobile.putong.data.OMSSizeType;

/* JADX INFO: loaded from: classes3.dex */
public class jhq0 extends xj10 {

    /* JADX INFO: renamed from: A */
    private float f117970A;

    /* JADX INFO: renamed from: B */
    private float f117971B;

    /* JADX INFO: renamed from: C */
    private float f117972C;

    /* JADX INFO: renamed from: a */
    private int f117973a;

    /* JADX INFO: renamed from: b */
    private int f117974b;

    /* JADX INFO: renamed from: c */
    private int f117975c;

    /* JADX INFO: renamed from: d */
    private int f117976d;

    /* JADX INFO: renamed from: e */
    private int f117977e;

    /* JADX INFO: renamed from: f */
    private int f117978f;

    /* JADX INFO: renamed from: g */
    private int f117979g;

    /* JADX INFO: renamed from: i */
    private boolean f117980i;

    /* JADX INFO: renamed from: j */
    private float f117981j;

    /* JADX INFO: renamed from: k */
    private float f117982k;

    /* JADX INFO: renamed from: l */
    private float f117983l;

    /* JADX INFO: renamed from: m */
    private float f117984m;

    /* JADX INFO: renamed from: n */
    private float f117985n;

    /* JADX INFO: renamed from: o */
    private float f117986o;

    /* JADX INFO: renamed from: p */
    private float f117987p;

    /* JADX INFO: renamed from: q */
    private float f117988q;

    /* JADX INFO: renamed from: r */
    private float f117989r;

    /* JADX INFO: renamed from: s */
    public float[] f117990s;

    /* JADX INFO: renamed from: t */
    private float f117991t;

    /* JADX INFO: renamed from: u */
    private float f117992u;

    /* JADX INFO: renamed from: v */
    private float f117993v;

    /* JADX INFO: renamed from: x */
    private boolean f117994x;

    /* JADX INFO: renamed from: y */
    private float f117995y;

    /* JADX INFO: renamed from: z */
    private float f117996z;

    public jhq0() {
        super(2);
        this.f117980i = false;
        this.f117981j = 0.0f;
        this.f117982k = 0.5f;
        this.f117983l = 0.0f;
        this.f117984m = 1.0f;
        this.f117985n = 1.0f;
        this.f117986o = 0.0f;
        this.f117987p = 0.0f;
        this.f117988q = 0.0f;
        this.f117989r = 1.0f;
        this.f117991t = -1.0f;
        this.f117992u = 0.0f;
        this.f117993v = 0.0f;
        this.f117994x = false;
        this.f117995y = 0.0f;
        this.f117996z = 0.0f;
        this.f117971B = 0.0f;
        this.f117972C = 0.5f;
        this.f117990s = new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    /* JADX INFO: renamed from: Q1 */
    public void m141555Q1() {
        float f = this.f117982k + this.f117986o;
        this.f117982k = f;
        if (f >= 0.7f) {
            this.f117982k = 0.7f;
        }
        float f2 = this.f117972C + this.f117971B;
        this.f117972C = f2;
        if (f2 >= 0.6f) {
            this.f117972C = 0.6f;
        }
        float f3 = this.f117989r;
        setRenderVertices(m141557S1(f3, f3, new PointF(this.f117982k, this.f117972C)));
    }

    /* JADX INFO: renamed from: R1 */
    public void m141556R1(float f) {
        this.f117985n = (1.0f - f) + 1.0f;
    }

    /* JADX INFO: renamed from: S1 */
    public float[] m141557S1(float f, float f2, PointF pointF) {
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
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.f117990s, 0);
        return new float[]{fArr2[0], fArr2[1], fArr2[4], fArr2[5], fArr2[8], fArr2[9], fArr2[12], fArr2[13]};
    }

    /* JADX INFO: renamed from: T1 */
    public void m141558T1(float f) {
        this.f117981j = f;
    }

    /* JADX INFO: renamed from: U1 */
    public void m141559U1(float f) {
        this.f117988q = f;
    }

    /* JADX INFO: renamed from: V1 */
    public void m141560V1(float f) {
        float f2 = (1.0f - f) + 1.0f;
        this.f117983l = f2;
        this.f117984m = f2;
    }

    /* JADX INFO: renamed from: W1 */
    public void m141561W1(float f) {
        this.f117987p = f;
        this.f117970A = f;
    }

    /* JADX INFO: renamed from: X1 */
    public void m141562X1(float f) {
        this.f117982k = f;
    }

    /* JADX INFO: renamed from: Y1 */
    public void m141563Y1(float f) {
        this.f117986o = f;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m141564Z1(float f) {
        this.f117972C = f;
    }

    /* JADX INFO: renamed from: a2 */
    public void m141565a2(float f) {
        this.f117971B = f;
    }

    /* JADX INFO: renamed from: b2 */
    public void m141566b2(boolean z, int i) {
        this.f117994x = z;
        this.f117995y = i;
    }

    /* JADX INFO: renamed from: c2 */
    public void m141567c2(float f) {
        this.f117989r = ((f - 1.0f) * 2.0f) + 1.0f;
    }

    /* JADX INFO: renamed from: d2 */
    public void m141568d2(boolean z) {
        this.f117980i = z;
        this.f117981j = 0.0f;
        this.f117982k = 0.5f;
        this.f117983l = 0.0f;
        this.f117985n = 1.0f;
        this.f117986o = 0.0f;
        this.f117987p = 0.0f;
        this.f117988q = 0.0f;
        this.f117993v = 0.0f;
        this.f117991t = -1.0f;
        this.f117992u = 0.0f;
        this.f117994x = false;
        this.f117995y = 1.0f;
        this.f117996z = 0.0f;
        this.f117984m = 0.0f;
        this.f117970A = 0.0f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float scale;\n  uniform float ratio;\n  uniform float initScale;\n  uniform float slope;\n  uniform float intercept;\n  uniform float useTransfer;\n  uniform float index;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    vec2 uv1 = scaleFromCenter(uv,scale);\n    vec3 color1 = texture2D(inputImageTexture1, uv1).rgb;\n    vec2 uv2 = scaleFromCenter(uv,initScale);\n    vec3 color2 = texture2D(inputImageTexture0, uv2).rgb;\n    vec3 mixColor = mix(color1, color2, 1.0 - ratio);\n    if (useTransfer == 1.0) {\n       if (index == 0.0) {\n          if (uv.x > slope * uv.y + intercept) {\n             gl_FragColor = vec4(mixColor,1.0);\n          } else {\n             gl_FragColor = vec4(1.0,1.0,1.0,1.0);\n          }\n       } else {\n          if (uv.x < slope * uv.y + intercept) {\n             gl_FragColor = vec4(mixColor,1.0);\n          } else {\n             gl_FragColor = vec4(1.0,1.0,1.0,1.0);\n          }\n       }\n    } else {\n      gl_FragColor = vec4(mixColor,1.0);\n    }\n}\n";
    }

    @Override // p149l.xj10, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f117973a = GLES20.glGetUniformLocation(this.programHandle, BigEyeFilter.UNIFORM_SCALE);
        this.f117974b = GLES20.glGetUniformLocation(this.programHandle, OMSSizeType.ratio);
        this.f117975c = GLES20.glGetUniformLocation(this.programHandle, "initScale");
        this.f117976d = GLES20.glGetUniformLocation(this.programHandle, "slope");
        this.f117977e = GLES20.glGetUniformLocation(this.programHandle, "intercept");
        this.f117978f = GLES20.glGetUniformLocation(this.programHandle, "useTransfer");
        this.f117979g = GLES20.glGetUniformLocation(this.programHandle, FirebaseAnalytics.Param.INDEX);
    }

    @Override // p149l.xj10, p149l.ccj
    public void passShaderValues() {
        m141555Q1();
        super.passShaderValues();
        if (this.f117980i) {
            float f = this.f117987p;
            if (f > 0.0f) {
                float f2 = this.f117983l + f;
                this.f117983l = f2;
                if (f2 >= 1.0f) {
                    this.f117983l = 1.0f;
                }
            } else {
                float f3 = f + 1.0f;
                this.f117983l = f3;
                this.f117987p = f + this.f117970A;
                float f4 = this.f117984m;
                if (f3 <= f4) {
                    this.f117983l = f4;
                }
            }
            float f5 = this.f117981j + this.f117988q;
            this.f117981j = f5;
            if (f5 >= 1.0d) {
                this.f117981j = 1.0f;
            }
            if (this.f117994x) {
                if (this.f117995y == 0.0f && Math.abs(this.f117987p) >= 0.2f) {
                    float f6 = this.f117992u + 1.0f;
                    this.f117992u = f6;
                    this.f117993v = -f6;
                    this.f117991t += 1.5f;
                    this.f117996z = 1.0f;
                } else if (this.f117995y == 1.0f) {
                    float f7 = this.f117992u + 1.0f;
                    this.f117992u = f7;
                    this.f117993v = -f7;
                    this.f117991t += 1.3f;
                    this.f117996z = 1.0f;
                }
            }
        }
        GLES20.glUniform1f(this.f117973a, this.f117983l);
        GLES20.glUniform1f(this.f117974b, this.f117981j);
        GLES20.glUniform1f(this.f117975c, this.f117985n);
        GLES20.glUniform1f(this.f117976d, this.f117993v);
        GLES20.glUniform1f(this.f117977e, this.f117991t);
        GLES20.glUniform1f(this.f117978f, this.f117996z);
        GLES20.glUniform1f(this.f117979g, this.f117995y);
    }
}
