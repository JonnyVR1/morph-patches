package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class rh0 extends xj10 {

    /* JADX INFO: renamed from: a */
    private int f6907a;

    /* JADX INFO: renamed from: b */
    private int f6908b;

    /* JADX INFO: renamed from: c */
    private int f6909c;

    /* JADX INFO: renamed from: d */
    private int f6910d;

    /* JADX INFO: renamed from: e */
    private int f6911e;

    /* JADX INFO: renamed from: f */
    private int f6912f;

    /* JADX INFO: renamed from: g */
    private int f6913g;

    /* JADX INFO: renamed from: i */
    private int f6914i;

    /* JADX INFO: renamed from: j */
    private int f6915j;

    /* JADX INFO: renamed from: k */
    private int f6916k;

    /* JADX INFO: renamed from: l */
    private float f6917l;

    /* JADX INFO: renamed from: m */
    private float f6918m;

    /* JADX INFO: renamed from: n */
    private float f6919n;

    /* JADX INFO: renamed from: o */
    private float f6920o;

    /* JADX INFO: renamed from: p */
    private float f6921p;

    /* JADX INFO: renamed from: q */
    private float f6922q;

    /* JADX INFO: renamed from: r */
    private float f6923r;

    /* JADX INFO: renamed from: s */
    private float f6924s;

    /* JADX INFO: renamed from: t */
    private float f6925t;

    /* JADX INFO: renamed from: u */
    private float f6926u;

    /* JADX INFO: renamed from: v */
    private boolean f6927v;

    /* JADX INFO: renamed from: x */
    private int f6928x;

    public rh0() {
        super(2);
        this.f6917l = 0.0f;
        this.f6918m = 0.0f;
        this.f6919n = 0.0f;
        this.f6920o = 0.0f;
        this.f6921p = 0.0f;
        this.f6922q = 0.0f;
        this.f6923r = 0.0f;
        this.f6924s = 0.0f;
        this.f6925t = 0.0f;
        this.f6926u = 0.5f;
        this.f6927v = true;
        this.f6928x = 25;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m7257Q1(boolean z) {
        this.f6927v = z;
        this.f6926u = 0.5f;
        this.f6917l = 0.0f;
        this.f6918m = 0.0f;
        this.f6919n = 0.0f;
        this.f6920o = 0.0f;
        this.f6921p = 0.0f;
        this.f6922q = 0.0f;
        this.f6923r = 0.0f;
        this.f6924s = 0.0f;
        this.f6925t = 0.0f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float shiftBottom;\nuniform float shiftBottom2;\nuniform float shiftBottom3;\nuniform float shiftTop;\nuniform float shiftTop2;\nuniform float shiftTop3;\nuniform float shiftCenter;\nuniform float shiftCenter1;\nuniform float shiftCenter2;\nuniform float shift;\nconst vec3 W = vec3(0.2125,0.7154,0.0721);\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    vec2 uv1 = textureCoordinate;\n    gl_FragColor = texture2D(inputImageTexture1,uv1);\n    uv = scaleFromCenter(uv,shift);\n if (uv.y >= -5.*uv.x + 4. ) {\n        if (uv.y > 1.0 - shiftBottom ) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        }         if (uv.y > 1.0 - shiftBottom2 ) {          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n        if (uv.y > 1.0 - shiftBottom3 ) {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }  }  if (uv.y > -5.*uv.x + 3.9 && uv.y <= -5.*uv.x + 4.0 ) {\n        if (uv.y > 1.0 - shiftBottom + 0.01 ) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv + vec2(0.1,0.01))*vec4( 1.0,0.,0.,1.0));\n        }\n        if (uv.y > 1.0 - shiftBottom2 - 0.01 ) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n        if (uv.y > 1.0 - shiftBottom3 ) {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }  }if (uv.y > -5.*uv.x + 3.8 && uv.y <= -5.*uv.x + 3.9 ) {\n        if (uv.y > 1.0 - shiftBottom + 0.02) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv + vec2(0.1,0.02))*vec4( 1.0,0.,0.,1.0));\n        }\n        if (uv.y > 1.0 - shiftBottom2 - 0.02 ) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n        if (uv.y > 1.0 - shiftBottom3 ) {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }  }if (uv.y < -5.*uv.x + 4. && uv.y <= 5.0 * uv.x - 1.0) {        if (uv.y < shiftCenter) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));        }\n        if (uv.y < shiftCenter1 ) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n        if (uv.y < shiftCenter2 ) {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        } }if (uv.y > 5.0 * uv.x - 1.0 && uv.y < 5.0 * uv.x - 0.9) {        if (uv.y < shiftCenter - 0.01) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv + vec2(0.01,0.02))*vec4( 1.0,0.,0.,1.0));        }\n        if (uv.y < shiftCenter1 - 0.01 ) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n}if (uv.y > 5.0 * uv.x - 0.9 && uv.y < 5.0 * uv.x - 0.8) {        if (uv.y < shiftCenter - 0.02) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv + vec2(0.01,0.01))*vec4( 1.0,0.,0.,1.0));        }\n        if (uv.y < shiftCenter1 - 0.02 ) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n}if (uv.y > 5.0 * uv.x - 1.0){        if (uv.y >= 1.0 - shiftTop) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));        }\n        if (uv.y > 1.0 - shiftTop2 ) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n        if (uv.y > 1.0 - shiftTop3 ) {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        } }}\n";
    }

    @Override // p003l.xj10, p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f6907a = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom");
        this.f6908b = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom2");
        this.f6909c = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom3");
        this.f6910d = GLES20.glGetUniformLocation(this.programHandle, "shiftTop");
        this.f6911e = GLES20.glGetUniformLocation(this.programHandle, "shiftTop2");
        this.f6912f = GLES20.glGetUniformLocation(this.programHandle, "shiftTop3");
        this.f6913g = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter");
        this.f6914i = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter1");
        this.f6915j = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter2");
        this.f6916k = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p003l.xj10, p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f6927v) {
            float f = this.f6926u;
            int i = this.f6928x;
            float f2 = f + (0.2f / i);
            this.f6926u = f2;
            if (f2 >= 1.0d) {
                this.f6926u = 1.0f;
            }
            float f3 = this.f6917l + (2.0f / i);
            this.f6917l = f3;
            if (f3 >= 1.0d) {
                this.f6917l = 1.0f;
            }
            if (this.f6917l >= 0.6d) {
                float f4 = this.f6918m + (2.0f / i);
                this.f6918m = f4;
                if (f4 >= 1.0f) {
                    this.f6918m = 1.0f;
                }
                if (this.f6918m >= 0.8f) {
                    float f5 = this.f6919n + (4.0f / i);
                    this.f6919n = f5;
                    if (f5 >= 1.0f) {
                        this.f6919n = 1.0f;
                    }
                }
                float f6 = this.f6923r + (2.0f / i);
                this.f6923r = f6;
                if (f6 >= 1.0f) {
                    this.f6923r = 1.0f;
                }
                if (this.f6923r > 0.6f) {
                    float f7 = this.f6924s + (2.0f / i);
                    this.f6924s = f7;
                    if (f7 >= 1.0f) {
                        this.f6924s = 1.0f;
                    }
                    if (this.f6924s > 0.6d) {
                        float f8 = this.f6925t + (4.0f / i);
                        this.f6925t = f8;
                        if (f8 >= 1.0f) {
                            this.f6925t = 1.0f;
                        }
                    }
                    float f9 = this.f6920o + (2.0f / i);
                    this.f6920o = f9;
                    if (f9 >= 1.0f) {
                        this.f6920o = 1.0f;
                    }
                    if (this.f6920o > 0.6f) {
                        float f10 = this.f6921p + (2.0f / i);
                        this.f6921p = f10;
                        if (f10 >= 1.0f) {
                            this.f6921p = 1.0f;
                        }
                    }
                    if (this.f6921p >= 0.7f) {
                        float f11 = this.f6922q + (4.0f / i);
                        this.f6922q = f11;
                        if (f11 >= 1.0f) {
                            this.f6922q = 1.0f;
                            this.f6927v = false;
                        }
                    }
                }
            }
        }
        GLES20.glUniform1f(this.f6907a, this.f6917l);
        GLES20.glUniform1f(this.f6908b, this.f6918m);
        GLES20.glUniform1f(this.f6909c, this.f6919n);
        GLES20.glUniform1f(this.f6910d, this.f6920o);
        GLES20.glUniform1f(this.f6911e, this.f6921p);
        GLES20.glUniform1f(this.f6912f, this.f6922q);
        GLES20.glUniform1f(this.f6913g, this.f6923r);
        GLES20.glUniform1f(this.f6914i, this.f6924s);
        GLES20.glUniform1f(this.f6915j, this.f6925t);
        GLES20.glUniform1f(this.f6916k, this.f6926u);
    }
}
