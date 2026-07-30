package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class ogj0 extends jt2 {

    /* JADX INFO: renamed from: a */
    private int f147280a;

    /* JADX INFO: renamed from: f */
    private float f147285f;

    /* JADX INFO: renamed from: b */
    private boolean f147281b = true;

    /* JADX INFO: renamed from: c */
    private int f147282c = 25;

    /* JADX INFO: renamed from: d */
    private float[] f147283d = new float[6];

    /* JADX INFO: renamed from: g */
    private float f147286g = 0.0f;

    /* JADX INFO: renamed from: i */
    private float f147287i = 0.0f;

    /* JADX INFO: renamed from: j */
    private float f147288j = 0.0f;

    /* JADX INFO: renamed from: k */
    private float f147289k = 0.0f;

    /* JADX INFO: renamed from: l */
    private float f147290l = 0.0f;

    /* JADX INFO: renamed from: m */
    private float f147291m = 0.0f;

    /* JADX INFO: renamed from: n */
    private float f147292n = 0.0f;

    /* JADX INFO: renamed from: e */
    private ymi f147284e = new ymi(0.0f, 1.0f, 1.0f);

    public ogj0() {
        this.f147285f = 0.0f;
        this.f147285f = 1.0f / this.f147282c;
    }

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m167651Q1() {
        this.f147281b = true;
        int i = 0;
        while (true) {
            float[] fArr = this.f147283d;
            if (i < fArr.length) {
                fArr[i] = 0.0f;
                i++;
            }
        }
    }

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        this.f147281b = false;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision lowp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n\nconst float barWidth = 1.0 / 6.0;\n\nuniform float barLength[6];\n\nvoid main() {\n    int bar = int((1.0 - textureCoordinate.y) / barWidth);\n    \n    vec4 color;\n    if (textureCoordinate.x < barLength[bar]) {\n        color = vec4(1.0);\n    } else {\n        color = texture2D(inputImageTexture0, textureCoordinate);\n    }\n    gl_FragColor = color;\n}";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f147280a = GLES20.glGetUniformLocation(this.programHandle, "barLength");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f147281b) {
            float f = this.f147286g + this.f147285f;
            this.f147286g = f;
            if (f > 2.5f) {
                float f2 = f - 2.5f;
                if (this.f147287i < 1.0f) {
                    float f3 = f2 > 0.36f ? 0.36f : f2;
                    this.f147284e.m216695c(0.36f);
                    float fM216694b = this.f147284e.m216694b(f3);
                    this.f147287i = fM216694b;
                    float[] fArr = this.f147283d;
                    if (fM216694b > 1.0f) {
                        fM216694b = 1.0f;
                    }
                    fArr[0] = fM216694b;
                }
                if (f2 > 0.12f && this.f147288j < 1.0f) {
                    float f4 = f2 - 0.12f;
                    if (f4 > 0.56f) {
                        f4 = 0.56f;
                    }
                    this.f147284e.m216695c(0.56f);
                    float fM216694b2 = this.f147284e.m216694b(f4);
                    this.f147288j = fM216694b2;
                    float[] fArr2 = this.f147283d;
                    if (fM216694b2 > 1.0f) {
                        fM216694b2 = 1.0f;
                    }
                    fArr2[1] = fM216694b2;
                }
                if (f2 > 0.3f && this.f147289k < 1.0f) {
                    float f5 = f2 - 0.3f;
                    if (f5 > 0.3f) {
                        f5 = 0.3f;
                    }
                    this.f147284e.m216695c(0.3f);
                    float fM216694b3 = this.f147284e.m216694b(f5);
                    this.f147289k = fM216694b3;
                    float[] fArr3 = this.f147283d;
                    if (fM216694b3 > 1.0f) {
                        fM216694b3 = 1.0f;
                    }
                    fArr3[2] = fM216694b3;
                }
                if (f2 > 0.2f && this.f147290l < 1.0f) {
                    float f6 = f2 - 0.2f;
                    if (f6 > 0.4f) {
                        f6 = 0.4f;
                    }
                    this.f147284e.m216695c(0.4f);
                    float fM216694b4 = this.f147284e.m216694b(f6);
                    this.f147290l = fM216694b4;
                    float[] fArr4 = this.f147283d;
                    if (fM216694b4 > 1.0f) {
                        fM216694b4 = 1.0f;
                    }
                    fArr4[3] = fM216694b4;
                }
                if (f2 > 0.12f && this.f147291m < 1.0f) {
                    float f7 = f2 - 0.12f;
                    if (f7 > 0.16f) {
                        f7 = 0.16f;
                    }
                    this.f147284e.m216695c(0.16f);
                    float fM216694b5 = this.f147284e.m216694b(f7);
                    this.f147291m = fM216694b5;
                    float[] fArr5 = this.f147283d;
                    if (fM216694b5 > 1.0f) {
                        fM216694b5 = 1.0f;
                    }
                    fArr5[4] = fM216694b5;
                }
                if (f2 > 0.42f && this.f147292n < 1.0f) {
                    float f8 = f2 - 0.42f;
                    if (f8 > 0.2f) {
                        f8 = 0.2f;
                    }
                    this.f147284e.m216695c(0.2f);
                    float fM216694b6 = this.f147284e.m216694b(f8);
                    this.f147292n = fM216694b6;
                    this.f147283d[5] = fM216694b6 <= 1.0f ? fM216694b6 : 1.0f;
                }
            }
        }
        GLES20.glUniform1fv(this.f147280a, 6, this.f147283d, 0);
    }
}
