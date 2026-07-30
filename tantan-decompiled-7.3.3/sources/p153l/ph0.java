package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class ph0 extends hs10 {

    /* JADX INFO: renamed from: a */
    private int f152370a;

    /* JADX INFO: renamed from: b */
    private int f152371b;

    /* JADX INFO: renamed from: c */
    private int f152372c;

    /* JADX INFO: renamed from: d */
    private int f152373d;

    /* JADX INFO: renamed from: e */
    private int f152374e;

    /* JADX INFO: renamed from: f */
    private int f152375f;

    /* JADX INFO: renamed from: g */
    private int f152376g;

    /* JADX INFO: renamed from: i */
    private int f152377i;

    /* JADX INFO: renamed from: j */
    private int f152378j;

    /* JADX INFO: renamed from: k */
    private float f152379k;

    /* JADX INFO: renamed from: l */
    private float f152380l;

    /* JADX INFO: renamed from: m */
    private float f152381m;

    /* JADX INFO: renamed from: n */
    private float f152382n;

    /* JADX INFO: renamed from: o */
    private float f152383o;

    /* JADX INFO: renamed from: p */
    private float f152384p;

    /* JADX INFO: renamed from: q */
    private float f152385q;

    /* JADX INFO: renamed from: r */
    private float f152386r;

    /* JADX INFO: renamed from: s */
    private float f152387s;

    /* JADX INFO: renamed from: t */
    private boolean f152388t;

    /* JADX INFO: renamed from: u */
    private int f152389u;

    public ph0() {
        super(2);
        this.f152379k = 0.0f;
        this.f152380l = 0.0f;
        this.f152381m = 0.0f;
        this.f152382n = 0.0f;
        this.f152383o = 0.0f;
        this.f152384p = 0.0f;
        this.f152385q = 0.0f;
        this.f152386r = 0.0f;
        this.f152387s = 0.6f;
        this.f152388t = true;
        this.f152389u = 25;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m172315Q1(boolean z) {
        this.f152388t = z;
        this.f152379k = 0.0f;
        this.f152380l = 0.0f;
        this.f152381m = 0.0f;
        this.f152382n = 0.0f;
        this.f152383o = 0.0f;
        this.f152384p = 0.0f;
        this.f152385q = 0.0f;
        this.f152386r = 0.0f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float shiftBottom;\nuniform float shiftBottom2;\nuniform float shiftBottom3;\nuniform float shiftTop;\nuniform float shiftTop2;\nuniform float shiftTop3;\nuniform float shiftCenter;\nuniform float shiftCenter1;\nuniform float shift;\nconst vec3 W = vec3(0.2125,0.7154,0.0721);\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    vec2 uv1 = textureCoordinate;\n    uv = scaleFromCenter(uv,shift);\n if (uv.x <= -0.2*uv.y + 0.4 ) {\n        if (uv.y < shiftBottom && uv.y > shiftBottom2) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        }else if (uv.y < shiftBottom2 && uv.y > shiftBottom3) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }else if (uv.y > shiftBottom){\n          gl_FragColor = texture2D(inputImageTexture1,uv1);\n        } else {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }\n    }else if (uv.x >= -0.2*uv.y + 0.8) {\n        if (uv.y < shiftTop && uv.y > shiftTop2) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        }else if (uv.y < shiftTop2 && uv.y > shiftTop3) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }else if (uv.y > shiftTop){\n          gl_FragColor = texture2D(inputImageTexture1,uv1);\n        } else {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }\n    } else {\n        if (uv.y > 1. - shiftCenter && uv.y < 1.0 -  shiftCenter1) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        } else if (uv.y > 1.0 - shiftCenter){\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }else {\n          gl_FragColor = texture2D(inputImageTexture1,uv1);\n        }\n    }}\n";
    }

    @Override // p153l.hs10, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f152370a = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom");
        this.f152371b = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom2");
        this.f152372c = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom3");
        this.f152373d = GLES20.glGetUniformLocation(this.programHandle, "shiftTop");
        this.f152374e = GLES20.glGetUniformLocation(this.programHandle, "shiftTop2");
        this.f152375f = GLES20.glGetUniformLocation(this.programHandle, "shiftTop3");
        this.f152376g = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter");
        this.f152377i = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter1");
        this.f152378j = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p153l.hs10, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f152388t) {
            float f = this.f152387s;
            int i = this.f152389u;
            float f2 = f + (0.2f / i);
            this.f152387s = f2;
            if (f2 >= 1.0d) {
                this.f152387s = 1.0f;
            }
            float f3 = this.f152379k + (1.0f / i);
            this.f152379k = f3;
            if (f3 >= 1.0d) {
                this.f152379k = 1.0f;
            }
            if (this.f152379k >= 0.8d) {
                float f4 = this.f152380l + (2.0f / i);
                this.f152380l = f4;
                if (f4 >= 1.0f) {
                    this.f152380l = 1.0f;
                }
                if (this.f152380l >= 0.8f) {
                    float f5 = this.f152381m + (1.0f / i);
                    this.f152381m = f5;
                    if (f5 >= 1.0f) {
                        this.f152381m = 1.0f;
                    }
                }
                float f6 = this.f152385q + (1.0f / i);
                this.f152385q = f6;
                if (f6 >= 1.0f) {
                    this.f152385q = 1.0f;
                }
                if (this.f152385q > 0.6f) {
                    float f7 = this.f152386r + (2.0f / i);
                    this.f152386r = f7;
                    if (f7 >= 1.0f) {
                        this.f152386r = 1.0f;
                    }
                }
                float f8 = this.f152382n + (1.0f / i);
                this.f152382n = f8;
                if (f8 >= 1.0f) {
                    this.f152382n = 1.0f;
                }
                if (this.f152382n > 0.9f) {
                    float f9 = this.f152383o + (2.0f / i);
                    this.f152383o = f9;
                    if (f9 >= 1.0f) {
                        this.f152383o = 1.0f;
                    }
                }
                if (this.f152383o >= 0.7f) {
                    float f10 = this.f152384p + (1.0f / i);
                    this.f152384p = f10;
                    if (f10 >= 1.0f) {
                        this.f152384p = 1.0f;
                        this.f152388t = false;
                    }
                }
            }
        }
        GLES20.glUniform1f(this.f152370a, this.f152379k);
        GLES20.glUniform1f(this.f152371b, this.f152380l);
        GLES20.glUniform1f(this.f152372c, this.f152381m);
        GLES20.glUniform1f(this.f152373d, this.f152382n);
        GLES20.glUniform1f(this.f152374e, this.f152383o);
        GLES20.glUniform1f(this.f152375f, this.f152384p);
        GLES20.glUniform1f(this.f152376g, this.f152385q);
        GLES20.glUniform1f(this.f152377i, this.f152386r);
        GLES20.glUniform1f(this.f152378j, this.f152387s);
    }
}
