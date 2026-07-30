package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class pd5 extends ts2 {

    /* JADX INFO: renamed from: a */
    private int f148264a;

    /* JADX INFO: renamed from: b */
    private int f148265b;

    /* JADX INFO: renamed from: c */
    private int f148266c;

    /* JADX INFO: renamed from: d */
    private int f148267d;

    /* JADX INFO: renamed from: e */
    protected float f148268e = 0.04f;

    /* JADX INFO: renamed from: f */
    protected float f148269f = 0.0f;

    /* JADX INFO: renamed from: g */
    private float f148270g = 0.0f;

    /* JADX INFO: renamed from: i */
    private float[] f148271i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j */
    private float[] f148272j = {1.0f, 0.0f};

    /* JADX INFO: renamed from: k */
    private float[] f148273k = {1.0f, 1.0f};

    /* JADX INFO: renamed from: l */
    private float[] f148274l = {0.0f, 1.0f};

    /* JADX INFO: renamed from: m */
    private float f148275m = 0.0f;

    /* JADX INFO: renamed from: n */
    private float f148276n = 1.0f;

    /* JADX INFO: renamed from: Q1 */
    private float m168380Q1(float f, float f2, float f3, float f4) {
        return (f * f4) - (((((((f * f3) - f2) * 2.0f) / (f3 * f3)) * f4) * f4) / 2.0f);
    }

    /* JADX INFO: renamed from: R1 */
    private float m168381R1(float f, float f2, float[] fArr) {
        return ((f - fArr[1]) / f2) + fArr[0];
    }

    /* JADX INFO: renamed from: S1 */
    private float m168382S1(float f, float f2, float[] fArr) {
        return (f2 * (f - fArr[0])) + fArr[1];
    }

    /* JADX INFO: renamed from: T1 */
    public void m168383T1(float f) {
        this.f148270g = f;
    }

    /* JADX INFO: renamed from: U1 */
    public synchronized void m168384U1() {
        this.f148268e = 0.04f;
        this.f148269f = 0.0f;
        this.f148270g = 0.0f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\n\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n\nuniform vec2 pointA;\nuniform vec2 pointB;\n\nuniform vec2 pointC;\nuniform vec2 pointD;\n\nfloat determinant(vec2 lv, vec2 rv) {\n    return lv.x * rv.y - lv.y * rv.x;\n}\n\nvoid main() {\n    vec2 tlv = textureCoordinate - pointA;\n    vec2 trv = pointB - pointA;\n    \n    vec2 blv = textureCoordinate - pointC;\n    vec2 brv = pointD - pointC;\n    \n    float tResult = sign(determinant(tlv, trv));\n    float bResult = sign(determinant(blv, brv));\n    if (tResult * bResult > 0.0) {\n        gl_FragColor = texture2D(inputImageTexture0, textureCoordinate);\n    } else {\n        vec4 color = texture2D(inputImageTexture0, textureCoordinate);\n        gl_FragColor = vec4(color.rgb * 0.5, 1.0);\n    }\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f148264a = GLES20.glGetUniformLocation(this.programHandle, "pointA");
        this.f148265b = GLES20.glGetUniformLocation(this.programHandle, "pointB");
        this.f148266c = GLES20.glGetUniformLocation(this.programHandle, "pointC");
        this.f148267d = GLES20.glGetUniformLocation(this.programHandle, "pointD");
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        this.f148269f += this.f148268e;
        super.passShaderValues();
        float f = this.f148269f;
        float f2 = this.f148270g;
        if (f >= f2) {
            float f3 = f - f2;
            if (this.f148275m < 0.5d) {
                float fM168380Q1 = m168380Q1(1.0f, 0.5f, 0.7f, f3);
                if (fM168380Q1 > 0.5f) {
                    fM168380Q1 = 0.5f;
                }
                this.f148275m = fM168380Q1;
            }
            if (this.f148276n > 0.0f) {
                float fM168380Q2 = 1.0f - m168380Q1(2.0f, 1.0f, 0.7f, f3);
                if (fM168380Q2 < 0.0f) {
                    fM168380Q2 = 0.0f;
                }
                this.f148276n = fM168380Q2;
            }
            float[] fArr = this.f148271i;
            fArr[0] = 0.0f;
            fArr[1] = 1.0f - this.f148275m;
            float fM168381R1 = m168381R1(1.0f, this.f148276n, fArr);
            if (fM168381R1 < 1.0f) {
                float[] fArr2 = this.f148272j;
                fArr2[0] = fM168381R1;
                fArr2[1] = 1.0f;
            } else {
                float fM168382S1 = m168382S1(1.0f, this.f148276n, this.f148271i);
                float[] fArr3 = this.f148272j;
                fArr3[0] = 1.0f;
                if (fM168382S1 <= 0.5f) {
                    fM168382S1 = 0.5f;
                }
                fArr3[1] = fM168382S1;
            }
            float[] fArr4 = this.f148273k;
            fArr4[0] = 1.0f;
            fArr4[1] = this.f148275m;
            float fM168381R2 = m168381R1(0.0f, this.f148276n, fArr4);
            if (fM168381R2 > 0.0f) {
                float[] fArr5 = this.f148274l;
                fArr5[0] = fM168381R2;
                fArr5[1] = 0.0f;
            } else {
                float fM168382S2 = m168382S1(0.0f, this.f148276n, this.f148273k);
                float[] fArr6 = this.f148274l;
                fArr6[0] = 0.0f;
                fArr6[1] = fM168382S2 < 0.5f ? fM168382S2 : 0.5f;
            }
        }
        GLES20.glUniform2fv(this.f148264a, 1, this.f148271i, 0);
        GLES20.glUniform2fv(this.f148265b, 1, this.f148272j, 0);
        GLES20.glUniform2fv(this.f148266c, 1, this.f148273k, 0);
        GLES20.glUniform2fv(this.f148267d, 1, this.f148274l, 0);
    }
}
