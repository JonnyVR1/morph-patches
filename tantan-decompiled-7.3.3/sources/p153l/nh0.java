package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class nh0 extends hs10 {

    /* JADX INFO: renamed from: a */
    private int f141872a;

    /* JADX INFO: renamed from: b */
    private int f141873b;

    /* JADX INFO: renamed from: c */
    private int f141874c;

    /* JADX INFO: renamed from: d */
    private int f141875d;

    /* JADX INFO: renamed from: e */
    private int f141876e;

    /* JADX INFO: renamed from: f */
    private int f141877f;

    /* JADX INFO: renamed from: g */
    private int f141878g;

    /* JADX INFO: renamed from: i */
    private int f141879i;

    /* JADX INFO: renamed from: j */
    private int f141880j;

    /* JADX INFO: renamed from: k */
    private int f141881k;

    /* JADX INFO: renamed from: l */
    private float f141882l;

    /* JADX INFO: renamed from: m */
    private float f141883m;

    /* JADX INFO: renamed from: n */
    private float f141884n;

    /* JADX INFO: renamed from: o */
    private float f141885o;

    /* JADX INFO: renamed from: p */
    private float f141886p;

    /* JADX INFO: renamed from: q */
    private float f141887q;

    /* JADX INFO: renamed from: r */
    private float f141888r;

    /* JADX INFO: renamed from: s */
    private float f141889s;

    /* JADX INFO: renamed from: t */
    private float f141890t;

    /* JADX INFO: renamed from: u */
    private float f141891u;

    /* JADX INFO: renamed from: v */
    private boolean f141892v;

    /* JADX INFO: renamed from: x */
    private int f141893x;

    public nh0() {
        super(2);
        this.f141882l = 0.0f;
        this.f141883m = 0.0f;
        this.f141884n = 0.0f;
        this.f141885o = 0.0f;
        this.f141886p = 0.0f;
        this.f141887q = 0.0f;
        this.f141888r = 0.0f;
        this.f141889s = 0.0f;
        this.f141890t = 0.0f;
        this.f141891u = 0.5f;
        this.f141892v = true;
        this.f141893x = 25;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m163016Q1(boolean z) {
        this.f141892v = z;
        this.f141891u = 0.5f;
        this.f141882l = 0.0f;
        this.f141883m = 0.0f;
        this.f141884n = 0.0f;
        this.f141885o = 0.0f;
        this.f141886p = 0.0f;
        this.f141887q = 0.0f;
        this.f141888r = 0.0f;
        this.f141889s = 0.0f;
        this.f141890t = 0.0f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float shiftBottom;\nuniform float shiftBottom2;\nuniform float shiftBottom3;\nuniform float shiftTop;\nuniform float shiftTop2;\nuniform float shiftTop3;\nuniform float shiftCenter;\nuniform float shiftCenter1;\nuniform float shiftCenter2;\nuniform float shift;\nconst vec3 W = vec3(0.2125,0.7154,0.0721);\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    vec2 uv1 = textureCoordinate;\n    gl_FragColor = texture2D(inputImageTexture1,uv1);\n    uv = scaleFromCenter(uv,shift);\n if (uv.y >= -5.*uv.x + 4. ) {\n        if (uv.y > 1.0 - shiftBottom ) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));\n        }         if (uv.y > 1.0 - shiftBottom2 ) {          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n        if (uv.y > 1.0 - shiftBottom3 ) {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }  }  if (uv.y > -5.*uv.x + 3.9 && uv.y <= -5.*uv.x + 4.0 ) {\n        if (uv.y > 1.0 - shiftBottom + 0.01 ) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv + vec2(0.1,0.01))*vec4( 1.0,0.,0.,1.0));\n        }\n        if (uv.y > 1.0 - shiftBottom2 - 0.01 ) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n        if (uv.y > 1.0 - shiftBottom3 ) {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }  }if (uv.y > -5.*uv.x + 3.8 && uv.y <= -5.*uv.x + 3.9 ) {\n        if (uv.y > 1.0 - shiftBottom + 0.02) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv + vec2(0.1,0.02))*vec4( 1.0,0.,0.,1.0));\n        }\n        if (uv.y > 1.0 - shiftBottom2 - 0.02 ) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n        if (uv.y > 1.0 - shiftBottom3 ) {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        }  }if (uv.y < -5.*uv.x + 4. && uv.y <= 5.0 * uv.x - 1.0) {        if (uv.y < shiftCenter) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));        }\n        if (uv.y < shiftCenter1 ) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n        if (uv.y < shiftCenter2 ) {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        } }if (uv.y > 5.0 * uv.x - 1.0 && uv.y < 5.0 * uv.x - 0.9) {        if (uv.y < shiftCenter - 0.01) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv + vec2(0.01,0.02))*vec4( 1.0,0.,0.,1.0));        }\n        if (uv.y < shiftCenter1 - 0.01 ) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n}if (uv.y > 5.0 * uv.x - 0.9 && uv.y < 5.0 * uv.x - 0.8) {        if (uv.y < shiftCenter - 0.02) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv + vec2(0.01,0.01))*vec4( 1.0,0.,0.,1.0));        }\n        if (uv.y < shiftCenter1 - 0.02 ) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n}if (uv.y > 5.0 * uv.x - 1.0){        if (uv.y >= 1.0 - shiftTop) {\n          gl_FragColor = (texture2D(inputImageTexture0,uv)*vec4( 1.0,0.,0.,1.0));        }\n        if (uv.y > 1.0 - shiftTop2 ) {\n          vec3 color = texture2D(inputImageTexture0,uv).rgb;\n          float luminace = dot(color,W);\n          gl_FragColor = vec4(luminace,luminace,luminace,1.0);\n        }\n        if (uv.y > 1.0 - shiftTop3 ) {\n          gl_FragColor = texture2D(inputImageTexture0,uv);\n        } }}\n";
    }

    @Override // p153l.hs10, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f141872a = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom");
        this.f141873b = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom2");
        this.f141874c = GLES20.glGetUniformLocation(this.programHandle, "shiftBottom3");
        this.f141875d = GLES20.glGetUniformLocation(this.programHandle, "shiftTop");
        this.f141876e = GLES20.glGetUniformLocation(this.programHandle, "shiftTop2");
        this.f141877f = GLES20.glGetUniformLocation(this.programHandle, "shiftTop3");
        this.f141878g = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter");
        this.f141879i = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter1");
        this.f141880j = GLES20.glGetUniformLocation(this.programHandle, "shiftCenter2");
        this.f141881k = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p153l.hs10, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f141892v) {
            float f = this.f141891u;
            int i = this.f141893x;
            float f2 = f + (0.2f / i);
            this.f141891u = f2;
            if (f2 >= 1.0d) {
                this.f141891u = 1.0f;
            }
            float f3 = this.f141882l + (2.0f / i);
            this.f141882l = f3;
            if (f3 >= 1.0d) {
                this.f141882l = 1.0f;
            }
            if (this.f141882l >= 0.6d) {
                float f4 = this.f141883m + (2.0f / i);
                this.f141883m = f4;
                if (f4 >= 1.0f) {
                    this.f141883m = 1.0f;
                }
                if (this.f141883m >= 0.8f) {
                    float f5 = this.f141884n + (4.0f / i);
                    this.f141884n = f5;
                    if (f5 >= 1.0f) {
                        this.f141884n = 1.0f;
                    }
                }
                float f6 = this.f141888r + (2.0f / i);
                this.f141888r = f6;
                if (f6 >= 1.0f) {
                    this.f141888r = 1.0f;
                }
                if (this.f141888r > 0.6f) {
                    float f7 = this.f141889s + (2.0f / i);
                    this.f141889s = f7;
                    if (f7 >= 1.0f) {
                        this.f141889s = 1.0f;
                    }
                    if (this.f141889s > 0.6d) {
                        float f8 = this.f141890t + (4.0f / i);
                        this.f141890t = f8;
                        if (f8 >= 1.0f) {
                            this.f141890t = 1.0f;
                        }
                    }
                    float f9 = this.f141885o + (2.0f / i);
                    this.f141885o = f9;
                    if (f9 >= 1.0f) {
                        this.f141885o = 1.0f;
                    }
                    if (this.f141885o > 0.6f) {
                        float f10 = this.f141886p + (2.0f / i);
                        this.f141886p = f10;
                        if (f10 >= 1.0f) {
                            this.f141886p = 1.0f;
                        }
                    }
                    if (this.f141886p >= 0.7f) {
                        float f11 = this.f141887q + (4.0f / i);
                        this.f141887q = f11;
                        if (f11 >= 1.0f) {
                            this.f141887q = 1.0f;
                            this.f141892v = false;
                        }
                    }
                }
            }
        }
        GLES20.glUniform1f(this.f141872a, this.f141882l);
        GLES20.glUniform1f(this.f141873b, this.f141883m);
        GLES20.glUniform1f(this.f141874c, this.f141884n);
        GLES20.glUniform1f(this.f141875d, this.f141885o);
        GLES20.glUniform1f(this.f141876e, this.f141886p);
        GLES20.glUniform1f(this.f141877f, this.f141887q);
        GLES20.glUniform1f(this.f141878g, this.f141888r);
        GLES20.glUniform1f(this.f141879i, this.f141889s);
        GLES20.glUniform1f(this.f141880j, this.f141890t);
        GLES20.glUniform1f(this.f141881k, this.f141891u);
    }
}
