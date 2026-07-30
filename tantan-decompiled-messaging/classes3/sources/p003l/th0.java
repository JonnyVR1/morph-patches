package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class th0 extends xj10 {

    /* JADX INFO: renamed from: a */
    private int f7470a;

    /* JADX INFO: renamed from: b */
    private int f7471b;

    /* JADX INFO: renamed from: c */
    private int f7472c;

    /* JADX INFO: renamed from: d */
    private int f7473d;

    /* JADX INFO: renamed from: e */
    private int f7474e;

    /* JADX INFO: renamed from: f */
    private int f7475f;

    /* JADX INFO: renamed from: g */
    private int f7476g;

    /* JADX INFO: renamed from: i */
    private int f7477i;

    /* JADX INFO: renamed from: j */
    private int f7478j;

    /* JADX INFO: renamed from: k */
    private float f7479k;

    /* JADX INFO: renamed from: l */
    private float f7480l;

    /* JADX INFO: renamed from: m */
    private float f7481m;

    /* JADX INFO: renamed from: n */
    private float f7482n;

    /* JADX INFO: renamed from: o */
    private float f7483o;

    /* JADX INFO: renamed from: p */
    private float f7484p;

    /* JADX INFO: renamed from: q */
    private float f7485q;

    /* JADX INFO: renamed from: r */
    private float f7486r;

    /* JADX INFO: renamed from: s */
    private float f7487s;

    /* JADX INFO: renamed from: t */
    private boolean f7488t;

    /* JADX INFO: renamed from: u */
    private int f7489u;

    public th0() {
        super(2);
        this.f7479k = 0.0f;
        this.f7480l = 0.0f;
        this.f7481m = 0.0f;
        this.f7482n = 0.0f;
        this.f7483o = 0.0f;
        this.f7484p = 0.0f;
        this.f7485q = 0.0f;
        this.f7486r = 0.0f;
        this.f7487s = 0.6f;
        this.f7488t = true;
        this.f7489u = 25;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m7748Q1(boolean z) {
        this.f7488t = z;
        this.f7479k = 0.0f;
        this.f7480l = 0.0f;
        this.f7481m = 0.0f;
        this.f7482n = 0.0f;
        this.f7483o = 0.0f;
        this.f7484p = 0.0f;
        this.f7485q = 0.0f;
        this.f7486r = 0.0f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float shiftBottom;\nuniform float shiftBottom2;\nuniform float shiftBottom3;\nuniform float shiftTop;\nuniform float shiftTop2;\nuniform float shiftTop3;\nuniform float shiftCenter;\nuniform float shiftCenter1;\nuniform float shift;\nconst vec3 W = vec3(0.2125,0.7154,0.0721);\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    vec2 uv1 = textureCoordinate;\n    uv = scaleFromCenter(uv,shift);\n if (uv.x <= -0.2*uv.y + 0.4 ) {\n        if (uv.y < shiftBottom && uv.y > shiftBottom2) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        }else if (uv.y < shiftBottom2 && uv.y > shiftBottom3) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }else if (uv.y > shiftBottom){\n          gl_FragColor = texture2D(inputImageTexture1,uv1);\n        } else {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }\n    }else if (uv.x >= -0.2*uv.y + 0.8) {\n        if (uv.y < shiftTop && uv.y > shiftTop2) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        }else if (uv.y < shiftTop2 && uv.y > shiftTop3) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }else if (uv.y > shiftTop){\n          gl_FragColor = texture2D(inputImageTexture1,uv1);\n        } else {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }\n    } else {\n        if (uv.y > 1. - shiftCenter && uv.y < 1.0 -  shiftCenter1) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        } else if (uv.y > 1.0 - shiftCenter){\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }else {\n          gl_FragColor = texture2D(inputImageTexture1,uv1);\n        }\n    }}\n";
    }

    @Override // p003l.xj10, p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f7470a = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom");
        this.f7471b = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom2");
        this.f7472c = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom3");
        this.f7473d = GLES20.glGetUniformLocation(this.programHandle, "shiftTop");
        this.f7474e = GLES20.glGetUniformLocation(this.programHandle, "shiftTop2");
        this.f7475f = GLES20.glGetUniformLocation(this.programHandle, "shiftTop3");
        this.f7476g = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter");
        this.f7477i = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter1");
        this.f7478j = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p003l.xj10, p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f7488t) {
            float f = this.f7487s;
            int i = this.f7489u;
            float f2 = f + (0.2f / i);
            this.f7487s = f2;
            if (f2 >= 1.0d) {
                this.f7487s = 1.0f;
            }
            float f3 = this.f7479k + (1.0f / i);
            this.f7479k = f3;
            if (f3 >= 1.0d) {
                this.f7479k = 1.0f;
            }
            if (this.f7479k >= 0.8d) {
                float f4 = this.f7480l + (2.0f / i);
                this.f7480l = f4;
                if (f4 >= 1.0f) {
                    this.f7480l = 1.0f;
                }
                if (this.f7480l >= 0.8f) {
                    float f5 = this.f7481m + (1.0f / i);
                    this.f7481m = f5;
                    if (f5 >= 1.0f) {
                        this.f7481m = 1.0f;
                    }
                }
                float f6 = this.f7485q + (1.0f / i);
                this.f7485q = f6;
                if (f6 >= 1.0f) {
                    this.f7485q = 1.0f;
                }
                if (this.f7485q > 0.6f) {
                    float f7 = this.f7486r + (2.0f / i);
                    this.f7486r = f7;
                    if (f7 >= 1.0f) {
                        this.f7486r = 1.0f;
                    }
                }
                float f8 = this.f7482n + (1.0f / i);
                this.f7482n = f8;
                if (f8 >= 1.0f) {
                    this.f7482n = 1.0f;
                }
                if (this.f7482n > 0.9f) {
                    float f9 = this.f7483o + (2.0f / i);
                    this.f7483o = f9;
                    if (f9 >= 1.0f) {
                        this.f7483o = 1.0f;
                    }
                }
                if (this.f7483o >= 0.7f) {
                    float f10 = this.f7484p + (1.0f / i);
                    this.f7484p = f10;
                    if (f10 >= 1.0f) {
                        this.f7484p = 1.0f;
                        this.f7488t = false;
                    }
                }
            }
        }
        GLES20.glUniform1f(this.f7470a, this.f7479k);
        GLES20.glUniform1f(this.f7471b, this.f7480l);
        GLES20.glUniform1f(this.f7472c, this.f7481m);
        GLES20.glUniform1f(this.f7473d, this.f7482n);
        GLES20.glUniform1f(this.f7474e, this.f7483o);
        GLES20.glUniform1f(this.f7475f, this.f7484p);
        GLES20.glUniform1f(this.f7476g, this.f7485q);
        GLES20.glUniform1f(this.f7477i, this.f7486r);
        GLES20.glUniform1f(this.f7478j, this.f7487s);
    }
}
