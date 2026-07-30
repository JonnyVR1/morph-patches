package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ph0 extends xj10 {

    /* JADX INFO: renamed from: a */
    private int f6413a;

    /* JADX INFO: renamed from: b */
    private int f6414b;

    /* JADX INFO: renamed from: c */
    private int f6415c;

    /* JADX INFO: renamed from: d */
    private int f6416d;

    /* JADX INFO: renamed from: e */
    private int f6417e;

    /* JADX INFO: renamed from: f */
    private int f6418f;

    /* JADX INFO: renamed from: g */
    private int f6419g;

    /* JADX INFO: renamed from: i */
    private int f6420i;

    /* JADX INFO: renamed from: j */
    private int f6421j;

    /* JADX INFO: renamed from: k */
    private float f6422k;

    /* JADX INFO: renamed from: l */
    private float f6423l;

    /* JADX INFO: renamed from: m */
    private float f6424m;

    /* JADX INFO: renamed from: n */
    private float f6425n;

    /* JADX INFO: renamed from: o */
    private float f6426o;

    /* JADX INFO: renamed from: p */
    private float f6427p;

    /* JADX INFO: renamed from: q */
    private float f6428q;

    /* JADX INFO: renamed from: r */
    private float f6429r;

    /* JADX INFO: renamed from: s */
    private float f6430s;

    /* JADX INFO: renamed from: t */
    private boolean f6431t;

    /* JADX INFO: renamed from: u */
    private int f6432u;

    public ph0() {
        super(2);
        this.f6422k = 0.0f;
        this.f6423l = 0.0f;
        this.f6424m = 0.0f;
        this.f6425n = 0.0f;
        this.f6426o = 0.0f;
        this.f6427p = 0.0f;
        this.f6428q = 0.0f;
        this.f6429r = 0.0f;
        this.f6430s = 0.5f;
        this.f6431t = true;
        this.f6432u = 25;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m6860Q1(boolean z) {
        this.f6431t = z;
        this.f6422k = 0.0f;
        this.f6423l = 0.0f;
        this.f6424m = 0.0f;
        this.f6425n = 0.0f;
        this.f6426o = 0.0f;
        this.f6427p = 0.0f;
        this.f6428q = 0.0f;
        this.f6429r = 0.0f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float shiftBottom;\nuniform float shiftBottom2;\nuniform float shiftBottom3;\nuniform float shiftTop;\nuniform float shiftTop2;\nuniform float shiftTop3;\nuniform float shiftCenter;\nuniform float shiftCenter1;\nuniform float shift;\nconst vec3 W = vec3(0.2125,0.7154,0.0721);\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    vec2 uv1 = textureCoordinate;\n    uv = scaleFromCenter(uv,shift);\n if (uv.y <= -0.2*uv.x + 0.4 ) {\n        if (uv.x < shiftBottom && uv.x > shiftBottom2) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        }else if (uv.x < shiftBottom2 && uv.x > shiftBottom3) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }else if (uv.x > shiftBottom){\n          gl_FragColor = texture2D(inputImageTexture1,uv1);\n        } else {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }\n    }else if (uv.y >= -0.2*uv.x + 0.8) {\n        if (uv.x < shiftTop && uv.x > shiftTop2) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        }else if (uv.x < shiftTop2 && uv.x > shiftTop3) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }else if (uv.x > shiftTop){\n          gl_FragColor = texture2D(inputImageTexture1,uv1);\n        } else {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }\n    } else {\n        if (uv.x > 1. - shiftCenter && uv.x < 1.0 -  shiftCenter1) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        } else if (uv.x > 1.0 - shiftCenter){\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }else {\n          gl_FragColor = texture2D(inputImageTexture1,uv1);\n        }\n    }}\n";
    }

    @Override // p003l.xj10, p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f6413a = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom");
        this.f6414b = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom2");
        this.f6415c = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom3");
        this.f6416d = GLES20.glGetUniformLocation(this.programHandle, "shiftTop");
        this.f6417e = GLES20.glGetUniformLocation(this.programHandle, "shiftTop2");
        this.f6418f = GLES20.glGetUniformLocation(this.programHandle, "shiftTop3");
        this.f6419g = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter");
        this.f6420i = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter1");
        this.f6421j = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p003l.xj10, p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f6431t) {
            float f = this.f6430s;
            int i = this.f6432u;
            float f2 = f + (0.2f / i);
            this.f6430s = f2;
            if (f2 >= 1.0d) {
                this.f6430s = 1.0f;
            }
            float f3 = this.f6422k + (2.0f / i);
            this.f6422k = f3;
            if (f3 >= 1.0d) {
                this.f6422k = 1.0f;
            }
            if (this.f6422k >= 0.8d) {
                float f4 = this.f6423l + (2.0f / i);
                this.f6423l = f4;
                if (f4 >= 1.0f) {
                    this.f6423l = 1.0f;
                }
                if (this.f6423l >= 0.8f) {
                    float f5 = this.f6424m + (4.0f / i);
                    this.f6424m = f5;
                    if (f5 >= 1.0f) {
                        this.f6424m = 1.0f;
                    }
                }
                float f6 = this.f6428q + (2.0f / i);
                this.f6428q = f6;
                if (f6 >= 1.0f) {
                    this.f6428q = 1.0f;
                }
                if (this.f6428q > 0.6f) {
                    float f7 = this.f6429r + (2.0f / i);
                    this.f6429r = f7;
                    if (f7 >= 1.0f) {
                        this.f6429r = 1.0f;
                    }
                }
                float f8 = this.f6425n + (2.0f / i);
                this.f6425n = f8;
                if (f8 >= 1.0f) {
                    this.f6425n = 1.0f;
                }
                if (this.f6425n > 0.9f) {
                    float f9 = this.f6426o + (2.0f / i);
                    this.f6426o = f9;
                    if (f9 >= 1.0f) {
                        this.f6426o = 1.0f;
                    }
                }
                if (this.f6426o >= 0.7f) {
                    float f10 = this.f6427p + (4.0f / i);
                    this.f6427p = f10;
                    if (f10 >= 1.0f) {
                        this.f6427p = 1.0f;
                        this.f6431t = false;
                    }
                }
            }
        }
        GLES20.glUniform1f(this.f6413a, this.f6422k);
        GLES20.glUniform1f(this.f6414b, this.f6423l);
        GLES20.glUniform1f(this.f6415c, this.f6424m);
        GLES20.glUniform1f(this.f6416d, this.f6425n);
        GLES20.glUniform1f(this.f6417e, this.f6426o);
        GLES20.glUniform1f(this.f6418f, this.f6427p);
        GLES20.glUniform1f(this.f6419g, this.f6428q);
        GLES20.glUniform1f(this.f6420i, this.f6429r);
        GLES20.glUniform1f(this.f6421j, this.f6430s);
    }
}
