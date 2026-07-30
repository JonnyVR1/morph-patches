package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class th0 extends xj10 {

    /* JADX INFO: renamed from: a */
    private int f170152a;

    /* JADX INFO: renamed from: b */
    private int f170153b;

    /* JADX INFO: renamed from: c */
    private int f170154c;

    /* JADX INFO: renamed from: d */
    private int f170155d;

    /* JADX INFO: renamed from: e */
    private int f170156e;

    /* JADX INFO: renamed from: f */
    private int f170157f;

    /* JADX INFO: renamed from: g */
    private int f170158g;

    /* JADX INFO: renamed from: i */
    private int f170159i;

    /* JADX INFO: renamed from: j */
    private int f170160j;

    /* JADX INFO: renamed from: k */
    private float f170161k;

    /* JADX INFO: renamed from: l */
    private float f170162l;

    /* JADX INFO: renamed from: m */
    private float f170163m;

    /* JADX INFO: renamed from: n */
    private float f170164n;

    /* JADX INFO: renamed from: o */
    private float f170165o;

    /* JADX INFO: renamed from: p */
    private float f170166p;

    /* JADX INFO: renamed from: q */
    private float f170167q;

    /* JADX INFO: renamed from: r */
    private float f170168r;

    /* JADX INFO: renamed from: s */
    private float f170169s;

    /* JADX INFO: renamed from: t */
    private boolean f170170t;

    /* JADX INFO: renamed from: u */
    private int f170171u;

    public th0() {
        super(2);
        this.f170161k = 0.0f;
        this.f170162l = 0.0f;
        this.f170163m = 0.0f;
        this.f170164n = 0.0f;
        this.f170165o = 0.0f;
        this.f170166p = 0.0f;
        this.f170167q = 0.0f;
        this.f170168r = 0.0f;
        this.f170169s = 0.6f;
        this.f170170t = true;
        this.f170171u = 25;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m188835Q1(boolean z) {
        this.f170170t = z;
        this.f170161k = 0.0f;
        this.f170162l = 0.0f;
        this.f170163m = 0.0f;
        this.f170164n = 0.0f;
        this.f170165o = 0.0f;
        this.f170166p = 0.0f;
        this.f170167q = 0.0f;
        this.f170168r = 0.0f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float shiftBottom;\nuniform float shiftBottom2;\nuniform float shiftBottom3;\nuniform float shiftTop;\nuniform float shiftTop2;\nuniform float shiftTop3;\nuniform float shiftCenter;\nuniform float shiftCenter1;\nuniform float shift;\nconst vec3 W = vec3(0.2125,0.7154,0.0721);\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    vec2 uv1 = textureCoordinate;\n    uv = scaleFromCenter(uv,shift);\n if (uv.x <= -0.2*uv.y + 0.4 ) {\n        if (uv.y < shiftBottom && uv.y > shiftBottom2) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        }else if (uv.y < shiftBottom2 && uv.y > shiftBottom3) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }else if (uv.y > shiftBottom){\n          gl_FragColor = texture2D(inputImageTexture1,uv1);\n        } else {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }\n    }else if (uv.x >= -0.2*uv.y + 0.8) {\n        if (uv.y < shiftTop && uv.y > shiftTop2) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        }else if (uv.y < shiftTop2 && uv.y > shiftTop3) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }else if (uv.y > shiftTop){\n          gl_FragColor = texture2D(inputImageTexture1,uv1);\n        } else {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }\n    } else {\n        if (uv.y > 1. - shiftCenter && uv.y < 1.0 -  shiftCenter1) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        } else if (uv.y > 1.0 - shiftCenter){\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }else {\n          gl_FragColor = texture2D(inputImageTexture1,uv1);\n        }\n    }}\n";
    }

    @Override // p149l.xj10, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f170152a = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom");
        this.f170153b = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom2");
        this.f170154c = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom3");
        this.f170155d = GLES20.glGetUniformLocation(this.programHandle, "shiftTop");
        this.f170156e = GLES20.glGetUniformLocation(this.programHandle, "shiftTop2");
        this.f170157f = GLES20.glGetUniformLocation(this.programHandle, "shiftTop3");
        this.f170158g = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter");
        this.f170159i = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter1");
        this.f170160j = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p149l.xj10, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f170170t) {
            float f = this.f170169s;
            int i = this.f170171u;
            float f2 = f + (0.2f / i);
            this.f170169s = f2;
            if (f2 >= 1.0d) {
                this.f170169s = 1.0f;
            }
            float f3 = this.f170161k + (1.0f / i);
            this.f170161k = f3;
            if (f3 >= 1.0d) {
                this.f170161k = 1.0f;
            }
            if (this.f170161k >= 0.8d) {
                float f4 = this.f170162l + (2.0f / i);
                this.f170162l = f4;
                if (f4 >= 1.0f) {
                    this.f170162l = 1.0f;
                }
                if (this.f170162l >= 0.8f) {
                    float f5 = this.f170163m + (1.0f / i);
                    this.f170163m = f5;
                    if (f5 >= 1.0f) {
                        this.f170163m = 1.0f;
                    }
                }
                float f6 = this.f170167q + (1.0f / i);
                this.f170167q = f6;
                if (f6 >= 1.0f) {
                    this.f170167q = 1.0f;
                }
                if (this.f170167q > 0.6f) {
                    float f7 = this.f170168r + (2.0f / i);
                    this.f170168r = f7;
                    if (f7 >= 1.0f) {
                        this.f170168r = 1.0f;
                    }
                }
                float f8 = this.f170164n + (1.0f / i);
                this.f170164n = f8;
                if (f8 >= 1.0f) {
                    this.f170164n = 1.0f;
                }
                if (this.f170164n > 0.9f) {
                    float f9 = this.f170165o + (2.0f / i);
                    this.f170165o = f9;
                    if (f9 >= 1.0f) {
                        this.f170165o = 1.0f;
                    }
                }
                if (this.f170165o >= 0.7f) {
                    float f10 = this.f170166p + (1.0f / i);
                    this.f170166p = f10;
                    if (f10 >= 1.0f) {
                        this.f170166p = 1.0f;
                        this.f170170t = false;
                    }
                }
            }
        }
        GLES20.glUniform1f(this.f170152a, this.f170161k);
        GLES20.glUniform1f(this.f170153b, this.f170162l);
        GLES20.glUniform1f(this.f170154c, this.f170163m);
        GLES20.glUniform1f(this.f170155d, this.f170164n);
        GLES20.glUniform1f(this.f170156e, this.f170165o);
        GLES20.glUniform1f(this.f170157f, this.f170166p);
        GLES20.glUniform1f(this.f170158g, this.f170167q);
        GLES20.glUniform1f(this.f170159i, this.f170168r);
        GLES20.glUniform1f(this.f170160j, this.f170169s);
    }
}
