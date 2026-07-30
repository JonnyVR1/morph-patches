package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class pd5 extends ts2 {

    /* JADX INFO: renamed from: a */
    private int f6369a;

    /* JADX INFO: renamed from: b */
    private int f6370b;

    /* JADX INFO: renamed from: c */
    private int f6371c;

    /* JADX INFO: renamed from: d */
    private int f6372d;

    /* JADX INFO: renamed from: e */
    protected float f6373e = 0.04f;

    /* JADX INFO: renamed from: f */
    protected float f6374f = 0.0f;

    /* JADX INFO: renamed from: g */
    private float f6375g = 0.0f;

    /* JADX INFO: renamed from: i */
    private float[] f6376i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j */
    private float[] f6377j = {1.0f, 0.0f};

    /* JADX INFO: renamed from: k */
    private float[] f6378k = {1.0f, 1.0f};

    /* JADX INFO: renamed from: l */
    private float[] f6379l = {0.0f, 1.0f};

    /* JADX INFO: renamed from: m */
    private float f6380m = 0.0f;

    /* JADX INFO: renamed from: n */
    private float f6381n = 1.0f;

    /* JADX INFO: renamed from: Q1 */
    private float m6833Q1(float f, float f2, float f3, float f4) {
        return (f * f4) - (((((((f * f3) - f2) * 2.0f) / (f3 * f3)) * f4) * f4) / 2.0f);
    }

    /* JADX INFO: renamed from: R1 */
    private float m6834R1(float f, float f2, float[] fArr) {
        return ((f - fArr[1]) / f2) + fArr[0];
    }

    /* JADX INFO: renamed from: S1 */
    private float m6835S1(float f, float f2, float[] fArr) {
        return (f2 * (f - fArr[0])) + fArr[1];
    }

    /* JADX INFO: renamed from: T1 */
    public void m6836T1(float f) {
        this.f6375g = f;
    }

    /* JADX INFO: renamed from: U1 */
    public synchronized void m6837U1() {
        this.f6373e = 0.04f;
        this.f6374f = 0.0f;
        this.f6375g = 0.0f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\n\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n\nuniform vec2 pointA;\nuniform vec2 pointB;\n\nuniform vec2 pointC;\nuniform vec2 pointD;\n\nfloat determinant(vec2 lv, vec2 rv) {\n    return lv.x * rv.y - lv.y * rv.x;\n}\n\nvoid main() {\n    vec2 tlv = textureCoordinate - pointA;\n    vec2 trv = pointB - pointA;\n    \n    vec2 blv = textureCoordinate - pointC;\n    vec2 brv = pointD - pointC;\n    \n    float tResult = sign(determinant(tlv, trv));\n    float bResult = sign(determinant(blv, brv));\n    if (tResult * bResult > 0.0) {\n        gl_FragColor = texture2D(inputImageTexture0, textureCoordinate);\n    } else {\n        vec4 color = texture2D(inputImageTexture0, textureCoordinate);\n        gl_FragColor = vec4(color.rgb * 0.5, 1.0);\n    }\n}\n";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f6369a = GLES20.glGetUniformLocation(this.programHandle, "pointA");
        this.f6370b = GLES20.glGetUniformLocation(this.programHandle, "pointB");
        this.f6371c = GLES20.glGetUniformLocation(this.programHandle, "pointC");
        this.f6372d = GLES20.glGetUniformLocation(this.programHandle, "pointD");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        this.f6374f += this.f6373e;
        super.passShaderValues();
        float f = this.f6374f;
        float f2 = this.f6375g;
        if (f >= f2) {
            float f3 = f - f2;
            if (this.f6380m < 0.5d) {
                float fM6833Q1 = m6833Q1(1.0f, 0.5f, 0.7f, f3);
                if (fM6833Q1 > 0.5f) {
                    fM6833Q1 = 0.5f;
                }
                this.f6380m = fM6833Q1;
            }
            if (this.f6381n > 0.0f) {
                float fM6833Q2 = 1.0f - m6833Q1(2.0f, 1.0f, 0.7f, f3);
                if (fM6833Q2 < 0.0f) {
                    fM6833Q2 = 0.0f;
                }
                this.f6381n = fM6833Q2;
            }
            float[] fArr = this.f6376i;
            fArr[0] = 0.0f;
            fArr[1] = 1.0f - this.f6380m;
            float fM6834R1 = m6834R1(1.0f, this.f6381n, fArr);
            if (fM6834R1 < 1.0f) {
                float[] fArr2 = this.f6377j;
                fArr2[0] = fM6834R1;
                fArr2[1] = 1.0f;
            } else {
                float fM6835S1 = m6835S1(1.0f, this.f6381n, this.f6376i);
                float[] fArr3 = this.f6377j;
                fArr3[0] = 1.0f;
                if (fM6835S1 <= 0.5f) {
                    fM6835S1 = 0.5f;
                }
                fArr3[1] = fM6835S1;
            }
            float[] fArr4 = this.f6378k;
            fArr4[0] = 1.0f;
            fArr4[1] = this.f6380m;
            float fM6834R2 = m6834R1(0.0f, this.f6381n, fArr4);
            if (fM6834R2 > 0.0f) {
                float[] fArr5 = this.f6379l;
                fArr5[0] = fM6834R2;
                fArr5[1] = 0.0f;
            } else {
                float fM6835S2 = m6835S1(0.0f, this.f6381n, this.f6378k);
                float[] fArr6 = this.f6379l;
                fArr6[0] = 0.0f;
                fArr6[1] = fM6835S2 < 0.5f ? fM6835S2 : 0.5f;
            }
        }
        GLES20.glUniform2fv(this.f6369a, 1, this.f6376i, 0);
        GLES20.glUniform2fv(this.f6370b, 1, this.f6377j, 0);
        GLES20.glUniform2fv(this.f6371c, 1, this.f6378k, 0);
        GLES20.glUniform2fv(this.f6372d, 1, this.f6379l, 0);
    }
}
