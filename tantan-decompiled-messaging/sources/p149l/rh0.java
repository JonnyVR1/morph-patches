package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class rh0 extends xj10 {

    /* JADX INFO: renamed from: a */
    private int f159306a;

    /* JADX INFO: renamed from: b */
    private int f159307b;

    /* JADX INFO: renamed from: c */
    private int f159308c;

    /* JADX INFO: renamed from: d */
    private int f159309d;

    /* JADX INFO: renamed from: e */
    private int f159310e;

    /* JADX INFO: renamed from: f */
    private int f159311f;

    /* JADX INFO: renamed from: g */
    private int f159312g;

    /* JADX INFO: renamed from: i */
    private int f159313i;

    /* JADX INFO: renamed from: j */
    private int f159314j;

    /* JADX INFO: renamed from: k */
    private int f159315k;

    /* JADX INFO: renamed from: l */
    private float f159316l;

    /* JADX INFO: renamed from: m */
    private float f159317m;

    /* JADX INFO: renamed from: n */
    private float f159318n;

    /* JADX INFO: renamed from: o */
    private float f159319o;

    /* JADX INFO: renamed from: p */
    private float f159320p;

    /* JADX INFO: renamed from: q */
    private float f159321q;

    /* JADX INFO: renamed from: r */
    private float f159322r;

    /* JADX INFO: renamed from: s */
    private float f159323s;

    /* JADX INFO: renamed from: t */
    private float f159324t;

    /* JADX INFO: renamed from: u */
    private float f159325u;

    /* JADX INFO: renamed from: v */
    private boolean f159326v;

    /* JADX INFO: renamed from: x */
    private int f159327x;

    public rh0() {
        super(2);
        this.f159316l = 0.0f;
        this.f159317m = 0.0f;
        this.f159318n = 0.0f;
        this.f159319o = 0.0f;
        this.f159320p = 0.0f;
        this.f159321q = 0.0f;
        this.f159322r = 0.0f;
        this.f159323s = 0.0f;
        this.f159324t = 0.0f;
        this.f159325u = 0.5f;
        this.f159326v = true;
        this.f159327x = 25;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m179268Q1(boolean z) {
        this.f159326v = z;
        this.f159325u = 0.5f;
        this.f159316l = 0.0f;
        this.f159317m = 0.0f;
        this.f159318n = 0.0f;
        this.f159319o = 0.0f;
        this.f159320p = 0.0f;
        this.f159321q = 0.0f;
        this.f159322r = 0.0f;
        this.f159323s = 0.0f;
        this.f159324t = 0.0f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float shiftBottom;\nuniform float shiftBottom2;\nuniform float shiftBottom3;\nuniform float shiftTop;\nuniform float shiftTop2;\nuniform float shiftTop3;\nuniform float shiftCenter;\nuniform float shiftCenter1;\nuniform float shiftCenter2;\nuniform float shift;\nconst vec3 W = vec3(0.2125,0.7154,0.0721);\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    vec2 uv1 = textureCoordinate;\n    gl_FragColor = texture2D(inputImageTexture1,uv1);\n    uv = scaleFromCenter(uv,shift);\n if (uv.y >= -5.*uv.x + 4. ) {\n        if (uv.y > 1.0 - shiftBottom ) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        }         if (uv.y > 1.0 - shiftBottom2 ) {          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n        if (uv.y > 1.0 - shiftBottom3 ) {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }  }  if (uv.y > -5.*uv.x + 3.9 && uv.y <= -5.*uv.x + 4.0 ) {\n        if (uv.y > 1.0 - shiftBottom + 0.01 ) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv + vec2(0.1,0.01))*vec4( 1.0,0.,0.,1.0));\n        }\n        if (uv.y > 1.0 - shiftBottom2 - 0.01 ) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n        if (uv.y > 1.0 - shiftBottom3 ) {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }  }if (uv.y > -5.*uv.x + 3.8 && uv.y <= -5.*uv.x + 3.9 ) {\n        if (uv.y > 1.0 - shiftBottom + 0.02) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv + vec2(0.1,0.02))*vec4( 1.0,0.,0.,1.0));\n        }\n        if (uv.y > 1.0 - shiftBottom2 - 0.02 ) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n        if (uv.y > 1.0 - shiftBottom3 ) {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }  }if (uv.y < -5.*uv.x + 4. && uv.y <= 5.0 * uv.x - 1.0) {        if (uv.y < shiftCenter) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));        }\n        if (uv.y < shiftCenter1 ) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n        if (uv.y < shiftCenter2 ) {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        } }if (uv.y > 5.0 * uv.x - 1.0 && uv.y < 5.0 * uv.x - 0.9) {        if (uv.y < shiftCenter - 0.01) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv + vec2(0.01,0.02))*vec4( 1.0,0.,0.,1.0));        }\n        if (uv.y < shiftCenter1 - 0.01 ) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n}if (uv.y > 5.0 * uv.x - 0.9 && uv.y < 5.0 * uv.x - 0.8) {        if (uv.y < shiftCenter - 0.02) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv + vec2(0.01,0.01))*vec4( 1.0,0.,0.,1.0));        }\n        if (uv.y < shiftCenter1 - 0.02 ) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n}if (uv.y > 5.0 * uv.x - 1.0){        if (uv.y >= 1.0 - shiftTop) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));        }\n        if (uv.y > 1.0 - shiftTop2 ) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n        if (uv.y > 1.0 - shiftTop3 ) {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        } }}\n";
    }

    @Override // p149l.xj10, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f159306a = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom");
        this.f159307b = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom2");
        this.f159308c = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom3");
        this.f159309d = GLES20.glGetUniformLocation(this.programHandle, "shiftTop");
        this.f159310e = GLES20.glGetUniformLocation(this.programHandle, "shiftTop2");
        this.f159311f = GLES20.glGetUniformLocation(this.programHandle, "shiftTop3");
        this.f159312g = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter");
        this.f159313i = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter1");
        this.f159314j = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter2");
        this.f159315k = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p149l.xj10, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f159326v) {
            float f = this.f159325u;
            int i = this.f159327x;
            float f2 = f + (0.2f / i);
            this.f159325u = f2;
            if (f2 >= 1.0d) {
                this.f159325u = 1.0f;
            }
            float f3 = this.f159316l + (2.0f / i);
            this.f159316l = f3;
            if (f3 >= 1.0d) {
                this.f159316l = 1.0f;
            }
            if (this.f159316l >= 0.6d) {
                float f4 = this.f159317m + (2.0f / i);
                this.f159317m = f4;
                if (f4 >= 1.0f) {
                    this.f159317m = 1.0f;
                }
                if (this.f159317m >= 0.8f) {
                    float f5 = this.f159318n + (4.0f / i);
                    this.f159318n = f5;
                    if (f5 >= 1.0f) {
                        this.f159318n = 1.0f;
                    }
                }
                float f6 = this.f159322r + (2.0f / i);
                this.f159322r = f6;
                if (f6 >= 1.0f) {
                    this.f159322r = 1.0f;
                }
                if (this.f159322r > 0.6f) {
                    float f7 = this.f159323s + (2.0f / i);
                    this.f159323s = f7;
                    if (f7 >= 1.0f) {
                        this.f159323s = 1.0f;
                    }
                    if (this.f159323s > 0.6d) {
                        float f8 = this.f159324t + (4.0f / i);
                        this.f159324t = f8;
                        if (f8 >= 1.0f) {
                            this.f159324t = 1.0f;
                        }
                    }
                    float f9 = this.f159319o + (2.0f / i);
                    this.f159319o = f9;
                    if (f9 >= 1.0f) {
                        this.f159319o = 1.0f;
                    }
                    if (this.f159319o > 0.6f) {
                        float f10 = this.f159320p + (2.0f / i);
                        this.f159320p = f10;
                        if (f10 >= 1.0f) {
                            this.f159320p = 1.0f;
                        }
                    }
                    if (this.f159320p >= 0.7f) {
                        float f11 = this.f159321q + (4.0f / i);
                        this.f159321q = f11;
                        if (f11 >= 1.0f) {
                            this.f159321q = 1.0f;
                            this.f159326v = false;
                        }
                    }
                }
            }
        }
        GLES20.glUniform1f(this.f159306a, this.f159316l);
        GLES20.glUniform1f(this.f159307b, this.f159317m);
        GLES20.glUniform1f(this.f159308c, this.f159318n);
        GLES20.glUniform1f(this.f159309d, this.f159319o);
        GLES20.glUniform1f(this.f159310e, this.f159320p);
        GLES20.glUniform1f(this.f159311f, this.f159321q);
        GLES20.glUniform1f(this.f159312g, this.f159322r);
        GLES20.glUniform1f(this.f159313i, this.f159323s);
        GLES20.glUniform1f(this.f159314j, this.f159324t);
        GLES20.glUniform1f(this.f159315k, this.f159325u);
    }
}
