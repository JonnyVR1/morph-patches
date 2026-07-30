package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class ph0 extends xj10 {

    /* JADX INFO: renamed from: a */
    private int f148840a;

    /* JADX INFO: renamed from: b */
    private int f148841b;

    /* JADX INFO: renamed from: c */
    private int f148842c;

    /* JADX INFO: renamed from: d */
    private int f148843d;

    /* JADX INFO: renamed from: e */
    private int f148844e;

    /* JADX INFO: renamed from: f */
    private int f148845f;

    /* JADX INFO: renamed from: g */
    private int f148846g;

    /* JADX INFO: renamed from: i */
    private int f148847i;

    /* JADX INFO: renamed from: j */
    private int f148848j;

    /* JADX INFO: renamed from: k */
    private float f148849k;

    /* JADX INFO: renamed from: l */
    private float f148850l;

    /* JADX INFO: renamed from: m */
    private float f148851m;

    /* JADX INFO: renamed from: n */
    private float f148852n;

    /* JADX INFO: renamed from: o */
    private float f148853o;

    /* JADX INFO: renamed from: p */
    private float f148854p;

    /* JADX INFO: renamed from: q */
    private float f148855q;

    /* JADX INFO: renamed from: r */
    private float f148856r;

    /* JADX INFO: renamed from: s */
    private float f148857s;

    /* JADX INFO: renamed from: t */
    private boolean f148858t;

    /* JADX INFO: renamed from: u */
    private int f148859u;

    public ph0() {
        super(2);
        this.f148849k = 0.0f;
        this.f148850l = 0.0f;
        this.f148851m = 0.0f;
        this.f148852n = 0.0f;
        this.f148853o = 0.0f;
        this.f148854p = 0.0f;
        this.f148855q = 0.0f;
        this.f148856r = 0.0f;
        this.f148857s = 0.5f;
        this.f148858t = true;
        this.f148859u = 25;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m168927Q1(boolean z) {
        this.f148858t = z;
        this.f148849k = 0.0f;
        this.f148850l = 0.0f;
        this.f148851m = 0.0f;
        this.f148852n = 0.0f;
        this.f148853o = 0.0f;
        this.f148854p = 0.0f;
        this.f148855q = 0.0f;
        this.f148856r = 0.0f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float shiftBottom;\nuniform float shiftBottom2;\nuniform float shiftBottom3;\nuniform float shiftTop;\nuniform float shiftTop2;\nuniform float shiftTop3;\nuniform float shiftCenter;\nuniform float shiftCenter1;\nuniform float shift;\nconst vec3 W = vec3(0.2125,0.7154,0.0721);\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    vec2 uv1 = textureCoordinate;\n    uv = scaleFromCenter(uv,shift);\n if (uv.y <= -0.2*uv.x + 0.4 ) {\n        if (uv.x < shiftBottom && uv.x > shiftBottom2) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        }else if (uv.x < shiftBottom2 && uv.x > shiftBottom3) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }else if (uv.x > shiftBottom){\n          gl_FragColor = texture2D(inputImageTexture1,uv1);\n        } else {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }\n    }else if (uv.y >= -0.2*uv.x + 0.8) {\n        if (uv.x < shiftTop && uv.x > shiftTop2) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        }else if (uv.x < shiftTop2 && uv.x > shiftTop3) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }else if (uv.x > shiftTop){\n          gl_FragColor = texture2D(inputImageTexture1,uv1);\n        } else {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }\n    } else {\n        if (uv.x > 1. - shiftCenter && uv.x < 1.0 -  shiftCenter1) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        } else if (uv.x > 1.0 - shiftCenter){\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }else {\n          gl_FragColor = texture2D(inputImageTexture1,uv1);\n        }\n    }}\n";
    }

    @Override // p149l.xj10, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f148840a = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom");
        this.f148841b = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom2");
        this.f148842c = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom3");
        this.f148843d = GLES20.glGetUniformLocation(this.programHandle, "shiftTop");
        this.f148844e = GLES20.glGetUniformLocation(this.programHandle, "shiftTop2");
        this.f148845f = GLES20.glGetUniformLocation(this.programHandle, "shiftTop3");
        this.f148846g = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter");
        this.f148847i = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter1");
        this.f148848j = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p149l.xj10, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f148858t) {
            float f = this.f148857s;
            int i = this.f148859u;
            float f2 = f + (0.2f / i);
            this.f148857s = f2;
            if (f2 >= 1.0d) {
                this.f148857s = 1.0f;
            }
            float f3 = this.f148849k + (2.0f / i);
            this.f148849k = f3;
            if (f3 >= 1.0d) {
                this.f148849k = 1.0f;
            }
            if (this.f148849k >= 0.8d) {
                float f4 = this.f148850l + (2.0f / i);
                this.f148850l = f4;
                if (f4 >= 1.0f) {
                    this.f148850l = 1.0f;
                }
                if (this.f148850l >= 0.8f) {
                    float f5 = this.f148851m + (4.0f / i);
                    this.f148851m = f5;
                    if (f5 >= 1.0f) {
                        this.f148851m = 1.0f;
                    }
                }
                float f6 = this.f148855q + (2.0f / i);
                this.f148855q = f6;
                if (f6 >= 1.0f) {
                    this.f148855q = 1.0f;
                }
                if (this.f148855q > 0.6f) {
                    float f7 = this.f148856r + (2.0f / i);
                    this.f148856r = f7;
                    if (f7 >= 1.0f) {
                        this.f148856r = 1.0f;
                    }
                }
                float f8 = this.f148852n + (2.0f / i);
                this.f148852n = f8;
                if (f8 >= 1.0f) {
                    this.f148852n = 1.0f;
                }
                if (this.f148852n > 0.9f) {
                    float f9 = this.f148853o + (2.0f / i);
                    this.f148853o = f9;
                    if (f9 >= 1.0f) {
                        this.f148853o = 1.0f;
                    }
                }
                if (this.f148853o >= 0.7f) {
                    float f10 = this.f148854p + (4.0f / i);
                    this.f148854p = f10;
                    if (f10 >= 1.0f) {
                        this.f148854p = 1.0f;
                        this.f148858t = false;
                    }
                }
            }
        }
        GLES20.glUniform1f(this.f148840a, this.f148849k);
        GLES20.glUniform1f(this.f148841b, this.f148850l);
        GLES20.glUniform1f(this.f148842c, this.f148851m);
        GLES20.glUniform1f(this.f148843d, this.f148852n);
        GLES20.glUniform1f(this.f148844e, this.f148853o);
        GLES20.glUniform1f(this.f148845f, this.f148854p);
        GLES20.glUniform1f(this.f148846g, this.f148855q);
        GLES20.glUniform1f(this.f148847i, this.f148856r);
        GLES20.glUniform1f(this.f148848j, this.f148857s);
    }
}
