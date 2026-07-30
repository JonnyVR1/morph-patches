package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class k7j0 extends ts2 {

    /* JADX INFO: renamed from: a */
    private int f121594a;

    /* JADX INFO: renamed from: f */
    private float f121599f;

    /* JADX INFO: renamed from: b */
    private boolean f121595b = true;

    /* JADX INFO: renamed from: c */
    private int f121596c = 25;

    /* JADX INFO: renamed from: d */
    private float[] f121597d = new float[6];

    /* JADX INFO: renamed from: g */
    private float f121600g = 0.0f;

    /* JADX INFO: renamed from: i */
    private float f121601i = 0.0f;

    /* JADX INFO: renamed from: j */
    private float f121602j = 0.0f;

    /* JADX INFO: renamed from: k */
    private float f121603k = 0.0f;

    /* JADX INFO: renamed from: l */
    private float f121604l = 0.0f;

    /* JADX INFO: renamed from: m */
    private float f121605m = 0.0f;

    /* JADX INFO: renamed from: n */
    private float f121606n = 0.0f;

    /* JADX INFO: renamed from: e */
    private cki f121598e = new cki(0.0f, 1.0f, 1.0f);

    public k7j0() {
        this.f121599f = 0.0f;
        this.f121599f = 1.0f / this.f121596c;
    }

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m144678Q1() {
        this.f121595b = true;
        int i = 0;
        while (true) {
            float[] fArr = this.f121597d;
            if (i < fArr.length) {
                fArr[i] = 0.0f;
                i++;
            }
        }
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        this.f121595b = false;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision lowp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n\nconst float barWidth = 1.0 / 6.0;\n\nuniform float barLength[6];\n\nvoid main() {\n    int bar = int((1.0 - textureCoordinate.y) / barWidth);\n    \n    vec4 color;\n    if (textureCoordinate.x < barLength[bar]) {\n        color = vec4(1.0);\n    } else {\n        color = texture2D(inputImageTexture0, textureCoordinate);\n    }\n    gl_FragColor = color;\n}";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f121594a = GLES20.glGetUniformLocation(this.programHandle, "barLength");
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f121595b) {
            float f = this.f121600g + this.f121599f;
            this.f121600g = f;
            if (f > 2.5f) {
                float f2 = f - 2.5f;
                if (this.f121601i < 1.0f) {
                    float f3 = f2 > 0.36f ? 0.36f : f2;
                    this.f121598e.m107415c(0.36f);
                    float fM107414b = this.f121598e.m107414b(f3);
                    this.f121601i = fM107414b;
                    float[] fArr = this.f121597d;
                    if (fM107414b > 1.0f) {
                        fM107414b = 1.0f;
                    }
                    fArr[0] = fM107414b;
                }
                if (f2 > 0.12f && this.f121602j < 1.0f) {
                    float f4 = f2 - 0.12f;
                    if (f4 > 0.56f) {
                        f4 = 0.56f;
                    }
                    this.f121598e.m107415c(0.56f);
                    float fM107414b2 = this.f121598e.m107414b(f4);
                    this.f121602j = fM107414b2;
                    float[] fArr2 = this.f121597d;
                    if (fM107414b2 > 1.0f) {
                        fM107414b2 = 1.0f;
                    }
                    fArr2[1] = fM107414b2;
                }
                if (f2 > 0.3f && this.f121603k < 1.0f) {
                    float f5 = f2 - 0.3f;
                    if (f5 > 0.3f) {
                        f5 = 0.3f;
                    }
                    this.f121598e.m107415c(0.3f);
                    float fM107414b3 = this.f121598e.m107414b(f5);
                    this.f121603k = fM107414b3;
                    float[] fArr3 = this.f121597d;
                    if (fM107414b3 > 1.0f) {
                        fM107414b3 = 1.0f;
                    }
                    fArr3[2] = fM107414b3;
                }
                if (f2 > 0.2f && this.f121604l < 1.0f) {
                    float f6 = f2 - 0.2f;
                    if (f6 > 0.4f) {
                        f6 = 0.4f;
                    }
                    this.f121598e.m107415c(0.4f);
                    float fM107414b4 = this.f121598e.m107414b(f6);
                    this.f121604l = fM107414b4;
                    float[] fArr4 = this.f121597d;
                    if (fM107414b4 > 1.0f) {
                        fM107414b4 = 1.0f;
                    }
                    fArr4[3] = fM107414b4;
                }
                if (f2 > 0.12f && this.f121605m < 1.0f) {
                    float f7 = f2 - 0.12f;
                    if (f7 > 0.16f) {
                        f7 = 0.16f;
                    }
                    this.f121598e.m107415c(0.16f);
                    float fM107414b5 = this.f121598e.m107414b(f7);
                    this.f121605m = fM107414b5;
                    float[] fArr5 = this.f121597d;
                    if (fM107414b5 > 1.0f) {
                        fM107414b5 = 1.0f;
                    }
                    fArr5[4] = fM107414b5;
                }
                if (f2 > 0.42f && this.f121606n < 1.0f) {
                    float f8 = f2 - 0.42f;
                    if (f8 > 0.2f) {
                        f8 = 0.2f;
                    }
                    this.f121598e.m107415c(0.2f);
                    float fM107414b6 = this.f121598e.m107414b(f8);
                    this.f121606n = fM107414b6;
                    this.f121597d[5] = fM107414b6 <= 1.0f ? fM107414b6 : 1.0f;
                }
            }
        }
        GLES20.glUniform1fv(this.f121594a, 6, this.f121597d, 0);
    }
}
