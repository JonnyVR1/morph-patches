package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class k7j0 extends ts2 {

    /* JADX INFO: renamed from: a */
    private int f4811a;

    /* JADX INFO: renamed from: f */
    private float f4816f;

    /* JADX INFO: renamed from: b */
    private boolean f4812b = true;

    /* JADX INFO: renamed from: c */
    private int f4813c = 25;

    /* JADX INFO: renamed from: d */
    private float[] f4814d = new float[6];

    /* JADX INFO: renamed from: g */
    private float f4817g = 0.0f;

    /* JADX INFO: renamed from: i */
    private float f4818i = 0.0f;

    /* JADX INFO: renamed from: j */
    private float f4819j = 0.0f;

    /* JADX INFO: renamed from: k */
    private float f4820k = 0.0f;

    /* JADX INFO: renamed from: l */
    private float f4821l = 0.0f;

    /* JADX INFO: renamed from: m */
    private float f4822m = 0.0f;

    /* JADX INFO: renamed from: n */
    private float f4823n = 0.0f;

    /* JADX INFO: renamed from: e */
    private cki f4815e = new cki(0.0f, 1.0f, 1.0f);

    public k7j0() {
        this.f4816f = 0.0f;
        this.f4816f = 1.0f / this.f4813c;
    }

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m5547Q1() {
        this.f4812b = true;
        int i = 0;
        while (true) {
            float[] fArr = this.f4814d;
            if (i < fArr.length) {
                fArr[i] = 0.0f;
                i++;
            }
        }
    }

    @Override // p003l.mcj, p003l.ccj
    public void destroy() {
        super.destroy();
        this.f4812b = false;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision lowp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n\nconst float barWidth = 1.0 / 6.0;\n\nuniform float barLength[6];\n\nvoid main() {\n    int bar = int((1.0 - textureCoordinate.y) / barWidth);\n    \n    vec4 color;\n    if (textureCoordinate.x < barLength[bar]) {\n        color = vec4(1.0);\n    } else {\n        color = texture2D(inputImageTexture0, textureCoordinate);\n    }\n    gl_FragColor = color;\n}";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f4811a = GLES20.glGetUniformLocation(this.programHandle, "barLength");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f4812b) {
            float f = this.f4817g + this.f4816f;
            this.f4817g = f;
            if (f > 2.5f) {
                float f2 = f - 2.5f;
                if (this.f4818i < 1.0f) {
                    float f3 = f2 > 0.36f ? 0.36f : f2;
                    this.f4815e.m3376c(0.36f);
                    float fM3375b = this.f4815e.m3375b(f3);
                    this.f4818i = fM3375b;
                    float[] fArr = this.f4814d;
                    if (fM3375b > 1.0f) {
                        fM3375b = 1.0f;
                    }
                    fArr[0] = fM3375b;
                }
                if (f2 > 0.12f && this.f4819j < 1.0f) {
                    float f4 = f2 - 0.12f;
                    if (f4 > 0.56f) {
                        f4 = 0.56f;
                    }
                    this.f4815e.m3376c(0.56f);
                    float fM3375b2 = this.f4815e.m3375b(f4);
                    this.f4819j = fM3375b2;
                    float[] fArr2 = this.f4814d;
                    if (fM3375b2 > 1.0f) {
                        fM3375b2 = 1.0f;
                    }
                    fArr2[1] = fM3375b2;
                }
                if (f2 > 0.3f && this.f4820k < 1.0f) {
                    float f5 = f2 - 0.3f;
                    if (f5 > 0.3f) {
                        f5 = 0.3f;
                    }
                    this.f4815e.m3376c(0.3f);
                    float fM3375b3 = this.f4815e.m3375b(f5);
                    this.f4820k = fM3375b3;
                    float[] fArr3 = this.f4814d;
                    if (fM3375b3 > 1.0f) {
                        fM3375b3 = 1.0f;
                    }
                    fArr3[2] = fM3375b3;
                }
                if (f2 > 0.2f && this.f4821l < 1.0f) {
                    float f6 = f2 - 0.2f;
                    if (f6 > 0.4f) {
                        f6 = 0.4f;
                    }
                    this.f4815e.m3376c(0.4f);
                    float fM3375b4 = this.f4815e.m3375b(f6);
                    this.f4821l = fM3375b4;
                    float[] fArr4 = this.f4814d;
                    if (fM3375b4 > 1.0f) {
                        fM3375b4 = 1.0f;
                    }
                    fArr4[3] = fM3375b4;
                }
                if (f2 > 0.12f && this.f4822m < 1.0f) {
                    float f7 = f2 - 0.12f;
                    if (f7 > 0.16f) {
                        f7 = 0.16f;
                    }
                    this.f4815e.m3376c(0.16f);
                    float fM3375b5 = this.f4815e.m3375b(f7);
                    this.f4822m = fM3375b5;
                    float[] fArr5 = this.f4814d;
                    if (fM3375b5 > 1.0f) {
                        fM3375b5 = 1.0f;
                    }
                    fArr5[4] = fM3375b5;
                }
                if (f2 > 0.42f && this.f4823n < 1.0f) {
                    float f8 = f2 - 0.42f;
                    if (f8 > 0.2f) {
                        f8 = 0.2f;
                    }
                    this.f4815e.m3376c(0.2f);
                    float fM3375b6 = this.f4815e.m3375b(f8);
                    this.f4823n = fM3375b6;
                    this.f4814d[5] = fM3375b6 <= 1.0f ? fM3375b6 : 1.0f;
                }
            }
        }
        GLES20.glUniform1fv(this.f4811a, 6, this.f4814d, 0);
    }
}
