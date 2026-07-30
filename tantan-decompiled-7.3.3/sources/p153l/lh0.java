package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class lh0 extends hs10 {

    /* JADX INFO: renamed from: a */
    private int f132041a;

    /* JADX INFO: renamed from: b */
    private int f132042b;

    /* JADX INFO: renamed from: c */
    private int f132043c;

    /* JADX INFO: renamed from: d */
    private int f132044d;

    /* JADX INFO: renamed from: e */
    private int f132045e;

    /* JADX INFO: renamed from: f */
    private int f132046f;

    /* JADX INFO: renamed from: g */
    private int f132047g;

    /* JADX INFO: renamed from: i */
    private int f132048i;

    /* JADX INFO: renamed from: j */
    private int f132049j;

    /* JADX INFO: renamed from: k */
    private float f132050k;

    /* JADX INFO: renamed from: l */
    private float f132051l;

    /* JADX INFO: renamed from: m */
    private float f132052m;

    /* JADX INFO: renamed from: n */
    private float f132053n;

    /* JADX INFO: renamed from: o */
    private float f132054o;

    /* JADX INFO: renamed from: p */
    private float f132055p;

    /* JADX INFO: renamed from: q */
    private float f132056q;

    /* JADX INFO: renamed from: r */
    private float f132057r;

    /* JADX INFO: renamed from: s */
    private float f132058s;

    /* JADX INFO: renamed from: t */
    private boolean f132059t;

    /* JADX INFO: renamed from: u */
    private int f132060u;

    public lh0() {
        super(2);
        this.f132050k = 0.0f;
        this.f132051l = 0.0f;
        this.f132052m = 0.0f;
        this.f132053n = 0.0f;
        this.f132054o = 0.0f;
        this.f132055p = 0.0f;
        this.f132056q = 0.0f;
        this.f132057r = 0.0f;
        this.f132058s = 0.5f;
        this.f132059t = true;
        this.f132060u = 25;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m154200Q1(boolean z) {
        this.f132059t = z;
        this.f132050k = 0.0f;
        this.f132051l = 0.0f;
        this.f132052m = 0.0f;
        this.f132053n = 0.0f;
        this.f132054o = 0.0f;
        this.f132055p = 0.0f;
        this.f132056q = 0.0f;
        this.f132057r = 0.0f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float shiftBottom;\nuniform float shiftBottom2;\nuniform float shiftBottom3;\nuniform float shiftTop;\nuniform float shiftTop2;\nuniform float shiftTop3;\nuniform float shiftCenter;\nuniform float shiftCenter1;\nuniform float shift;\nconst vec3 W = vec3(0.2125,0.7154,0.0721);\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    vec2 uv1 = textureCoordinate;\n    uv = scaleFromCenter(uv,shift);\n if (uv.y <= -0.2*uv.x + 0.4 ) {\n        if (uv.x < shiftBottom && uv.x > shiftBottom2) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        }else if (uv.x < shiftBottom2 && uv.x > shiftBottom3) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }else if (uv.x > shiftBottom){\n          gl_FragColor = texture2D(inputImageTexture1,uv1);\n        } else {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }\n    }else if (uv.y >= -0.2*uv.x + 0.8) {\n        if (uv.x < shiftTop && uv.x > shiftTop2) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        }else if (uv.x < shiftTop2 && uv.x > shiftTop3) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }else if (uv.x > shiftTop){\n          gl_FragColor = texture2D(inputImageTexture1,uv1);\n        } else {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }\n    } else {\n        if (uv.x > 1. - shiftCenter && uv.x < 1.0 -  shiftCenter1) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        } else if (uv.x > 1.0 - shiftCenter){\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }else {\n          gl_FragColor = texture2D(inputImageTexture1,uv1);\n        }\n    }}\n";
    }

    @Override // p153l.hs10, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f132041a = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom");
        this.f132042b = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom2");
        this.f132043c = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom3");
        this.f132044d = GLES20.glGetUniformLocation(this.programHandle, "shiftTop");
        this.f132045e = GLES20.glGetUniformLocation(this.programHandle, "shiftTop2");
        this.f132046f = GLES20.glGetUniformLocation(this.programHandle, "shiftTop3");
        this.f132047g = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter");
        this.f132048i = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter1");
        this.f132049j = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p153l.hs10, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f132059t) {
            float f = this.f132058s;
            int i = this.f132060u;
            float f2 = f + (0.2f / i);
            this.f132058s = f2;
            if (f2 >= 1.0d) {
                this.f132058s = 1.0f;
            }
            float f3 = this.f132050k + (2.0f / i);
            this.f132050k = f3;
            if (f3 >= 1.0d) {
                this.f132050k = 1.0f;
            }
            if (this.f132050k >= 0.8d) {
                float f4 = this.f132051l + (2.0f / i);
                this.f132051l = f4;
                if (f4 >= 1.0f) {
                    this.f132051l = 1.0f;
                }
                if (this.f132051l >= 0.8f) {
                    float f5 = this.f132052m + (4.0f / i);
                    this.f132052m = f5;
                    if (f5 >= 1.0f) {
                        this.f132052m = 1.0f;
                    }
                }
                float f6 = this.f132056q + (2.0f / i);
                this.f132056q = f6;
                if (f6 >= 1.0f) {
                    this.f132056q = 1.0f;
                }
                if (this.f132056q > 0.6f) {
                    float f7 = this.f132057r + (2.0f / i);
                    this.f132057r = f7;
                    if (f7 >= 1.0f) {
                        this.f132057r = 1.0f;
                    }
                }
                float f8 = this.f132053n + (2.0f / i);
                this.f132053n = f8;
                if (f8 >= 1.0f) {
                    this.f132053n = 1.0f;
                }
                if (this.f132053n > 0.9f) {
                    float f9 = this.f132054o + (2.0f / i);
                    this.f132054o = f9;
                    if (f9 >= 1.0f) {
                        this.f132054o = 1.0f;
                    }
                }
                if (this.f132054o >= 0.7f) {
                    float f10 = this.f132055p + (4.0f / i);
                    this.f132055p = f10;
                    if (f10 >= 1.0f) {
                        this.f132055p = 1.0f;
                        this.f132059t = false;
                    }
                }
            }
        }
        GLES20.glUniform1f(this.f132041a, this.f132050k);
        GLES20.glUniform1f(this.f132042b, this.f132051l);
        GLES20.glUniform1f(this.f132043c, this.f132052m);
        GLES20.glUniform1f(this.f132044d, this.f132053n);
        GLES20.glUniform1f(this.f132045e, this.f132054o);
        GLES20.glUniform1f(this.f132046f, this.f132055p);
        GLES20.glUniform1f(this.f132047g, this.f132056q);
        GLES20.glUniform1f(this.f132048i, this.f132057r);
        GLES20.glUniform1f(this.f132049j, this.f132058s);
    }
}
