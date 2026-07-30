package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class pe5 extends jt2 {

    /* JADX INFO: renamed from: a */
    private int f151865a;

    /* JADX INFO: renamed from: b */
    private int f151866b;

    /* JADX INFO: renamed from: c */
    private int f151867c;

    /* JADX INFO: renamed from: d */
    private int f151868d;

    /* JADX INFO: renamed from: e */
    protected float f151869e = 0.04f;

    /* JADX INFO: renamed from: f */
    protected float f151870f = 0.0f;

    /* JADX INFO: renamed from: g */
    private float f151871g = 0.0f;

    /* JADX INFO: renamed from: i */
    private float[] f151872i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j */
    private float[] f151873j = {1.0f, 0.0f};

    /* JADX INFO: renamed from: k */
    private float[] f151874k = {1.0f, 1.0f};

    /* JADX INFO: renamed from: l */
    private float[] f151875l = {0.0f, 1.0f};

    /* JADX INFO: renamed from: m */
    private float f151876m = 0.0f;

    /* JADX INFO: renamed from: n */
    private float f151877n = 1.0f;

    /* JADX INFO: renamed from: Q1 */
    private float m171916Q1(float f, float f2, float f3, float f4) {
        return (f * f4) - (((((((f * f3) - f2) * 2.0f) / (f3 * f3)) * f4) * f4) / 2.0f);
    }

    /* JADX INFO: renamed from: R1 */
    private float m171917R1(float f, float f2, float[] fArr) {
        return ((f - fArr[1]) / f2) + fArr[0];
    }

    /* JADX INFO: renamed from: S1 */
    private float m171918S1(float f, float f2, float[] fArr) {
        return (f2 * (f - fArr[0])) + fArr[1];
    }

    /* JADX INFO: renamed from: T1 */
    public void m171919T1(float f) {
        this.f151871g = f;
    }

    /* JADX INFO: renamed from: U1 */
    public synchronized void m171920U1() {
        this.f151869e = 0.04f;
        this.f151870f = 0.0f;
        this.f151871g = 0.0f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\n\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n\nuniform vec2 pointA;\nuniform vec2 pointB;\n\nuniform vec2 pointC;\nuniform vec2 pointD;\n\nfloat determinant(vec2 lv, vec2 rv) {\n    return lv.x * rv.y - lv.y * rv.x;\n}\n\nvoid main() {\n    vec2 tlv = textureCoordinate - pointA;\n    vec2 trv = pointB - pointA;\n    \n    vec2 blv = textureCoordinate - pointC;\n    vec2 brv = pointD - pointC;\n    \n    float tResult = sign(determinant(tlv, trv));\n    float bResult = sign(determinant(blv, brv));\n    if (tResult * bResult > 0.0) {\n        gl_FragColor = texture2D(inputImageTexture0, textureCoordinate);\n    } else {\n        vec4 color = texture2D(inputImageTexture0, textureCoordinate);\n        gl_FragColor = vec4(color.rgb * 0.5, 1.0);\n    }\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f151865a = GLES20.glGetUniformLocation(this.programHandle, "pointA");
        this.f151866b = GLES20.glGetUniformLocation(this.programHandle, "pointB");
        this.f151867c = GLES20.glGetUniformLocation(this.programHandle, "pointC");
        this.f151868d = GLES20.glGetUniformLocation(this.programHandle, "pointD");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        this.f151870f += this.f151869e;
        super.passShaderValues();
        float f = this.f151870f;
        float f2 = this.f151871g;
        if (f >= f2) {
            float f3 = f - f2;
            if (this.f151876m < 0.5d) {
                float fM171916Q1 = m171916Q1(1.0f, 0.5f, 0.7f, f3);
                if (fM171916Q1 > 0.5f) {
                    fM171916Q1 = 0.5f;
                }
                this.f151876m = fM171916Q1;
            }
            if (this.f151877n > 0.0f) {
                float fM171916Q2 = 1.0f - m171916Q1(2.0f, 1.0f, 0.7f, f3);
                if (fM171916Q2 < 0.0f) {
                    fM171916Q2 = 0.0f;
                }
                this.f151877n = fM171916Q2;
            }
            float[] fArr = this.f151872i;
            fArr[0] = 0.0f;
            fArr[1] = 1.0f - this.f151876m;
            float fM171917R1 = m171917R1(1.0f, this.f151877n, fArr);
            if (fM171917R1 < 1.0f) {
                float[] fArr2 = this.f151873j;
                fArr2[0] = fM171917R1;
                fArr2[1] = 1.0f;
            } else {
                float fM171918S1 = m171918S1(1.0f, this.f151877n, this.f151872i);
                float[] fArr3 = this.f151873j;
                fArr3[0] = 1.0f;
                if (fM171918S1 <= 0.5f) {
                    fM171918S1 = 0.5f;
                }
                fArr3[1] = fM171918S1;
            }
            float[] fArr4 = this.f151874k;
            fArr4[0] = 1.0f;
            fArr4[1] = this.f151876m;
            float fM171917R2 = m171917R1(0.0f, this.f151877n, fArr4);
            if (fM171917R2 > 0.0f) {
                float[] fArr5 = this.f151875l;
                fArr5[0] = fM171917R2;
                fArr5[1] = 0.0f;
            } else {
                float fM171918S2 = m171918S1(0.0f, this.f151877n, this.f151874k);
                float[] fArr6 = this.f151875l;
                fArr6[0] = 0.0f;
                fArr6[1] = fM171918S2 < 0.5f ? fM171918S2 : 0.5f;
            }
        }
        GLES20.glUniform2fv(this.f151865a, 1, this.f151872i, 0);
        GLES20.glUniform2fv(this.f151866b, 1, this.f151873j, 0);
        GLES20.glUniform2fv(this.f151867c, 1, this.f151874k, 0);
        GLES20.glUniform2fv(this.f151868d, 1, this.f151875l, 0);
    }
}
