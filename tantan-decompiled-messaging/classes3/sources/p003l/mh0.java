package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class mh0 extends ts2 {

    /* JADX INFO: renamed from: a */
    private int f5631a;

    /* JADX INFO: renamed from: b */
    private int f5632b;

    /* JADX INFO: renamed from: c */
    private int f5633c;

    /* JADX INFO: renamed from: d */
    private int f5634d;

    /* JADX INFO: renamed from: e */
    private int f5635e;

    /* JADX INFO: renamed from: f */
    private int f5636f;

    /* JADX INFO: renamed from: g */
    private int f5637g;

    /* JADX INFO: renamed from: i */
    private float f5638i = 0.0f;

    /* JADX INFO: renamed from: j */
    private float f5639j = 0.0f;

    /* JADX INFO: renamed from: k */
    private float f5640k = 0.0f;

    /* JADX INFO: renamed from: l */
    private float f5641l = 0.0f;

    /* JADX INFO: renamed from: m */
    private float f5642m = 1.0f;

    /* JADX INFO: renamed from: n */
    private float f5643n = 0.0f;

    /* JADX INFO: renamed from: o */
    private float f5644o = 1.0f;

    /* JADX INFO: renamed from: p */
    private boolean f5645p = true;

    /* JADX INFO: renamed from: q */
    private int f5646q = 15;

    /* JADX INFO: renamed from: r */
    private int f5647r = 0;

    /* JADX INFO: renamed from: s */
    private String f5648s = "    float scanLineNumber = floor(uv.y*340.0);\n    float scanLineBrightness = 0.8*sin(fract(uv.y*340.0)*3.14159265358979323);    gl_FragColor = texture2D(inputImageTexture0,uv)*scanLineBrightness;\n";

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m6398Q1() {
        this.f5645p = true;
        this.f5647r = 0;
        this.f5643n = 0.0f;
        this.f5642m = 1.0f;
        this.f5644o = 1.0f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float shiftX;\nuniform float shiftY;\nuniform float shiftW;\nuniform float shiftH;\nuniform float shift;\nuniform float judge;\nuniform float offset;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    if (judge == 1.0) {\n    uv = scaleFromCenter(uv,offset);\n    if (uv.x > shift) {       gl_FragColor = texture2D(inputImageTexture0,uv);\n    } else {\n" + this.f5648s + "    }\n    } else {\n    if (uv.x < shift) {       if (uv.x >= shiftX - shiftW/2.0 && uv.x <= shiftX + shiftW/2.0 && uv.y > shiftY - shiftH/2.0  && uv.y < shiftY + shiftH/2.0 ) {\n" + this.f5648s + "       } else {\n       uv = scaleFromCenter(uv,offset);\n       gl_FragColor = texture2D(inputImageTexture0,uv);\n       }    } else {\n       uv = scaleFromCenter(uv,offset);\n" + this.f5648s + "    }\n  }\n}\n";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f5631a = GLES20.glGetUniformLocation(this.programHandle, "shiftX");
        this.f5632b = GLES20.glGetUniformLocation(this.programHandle, "shiftY");
        this.f5633c = GLES20.glGetUniformLocation(this.programHandle, "shiftW");
        this.f5634d = GLES20.glGetUniformLocation(this.programHandle, "shiftH");
        this.f5635e = GLES20.glGetUniformLocation(this.programHandle, "shift");
        this.f5636f = GLES20.glGetUniformLocation(this.programHandle, "judge");
        this.f5637g = GLES20.glGetUniformLocation(this.programHandle, "offset");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f5645p) {
            int i = this.f5647r;
            if (i <= 10) {
                this.f5642m = 0.6f;
                this.f5638i = ((float) Math.random()) * 0.6f;
                this.f5639j = (float) Math.random();
                this.f5640k = ((float) Math.random()) * 0.2f;
                this.f5641l = ((float) Math.random()) * 0.5f;
            } else if (10 < i && i <= 12) {
                this.f5642m = 0.6f;
                this.f5638i = 0.0f;
                this.f5639j = 0.0f;
                this.f5640k = 0.0f;
                this.f5641l = 0.0f;
                this.f5644o -= 0.005f;
            } else if (12 >= i || i > 25) {
                this.f5642m = 0.0f;
                this.f5645p = false;
            } else {
                this.f5643n = 1.0f;
                float f = this.f5644o - 0.005f;
                this.f5644o = f;
                if (f <= 0.8d) {
                    this.f5644o = 0.8f;
                }
            }
        }
        GLES20.glUniform1f(this.f5631a, this.f5638i);
        GLES20.glUniform1f(this.f5632b, this.f5639j);
        GLES20.glUniform1f(this.f5633c, this.f5640k);
        GLES20.glUniform1f(this.f5634d, this.f5641l);
        GLES20.glUniform1f(this.f5635e, this.f5642m);
        GLES20.glUniform1f(this.f5636f, this.f5643n);
        GLES20.glUniform1f(this.f5637g, this.f5644o);
        this.f5647r++;
    }
}
