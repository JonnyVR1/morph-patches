package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class lhq0 extends xj10 {

    /* JADX INFO: renamed from: a */
    private int f5307a;

    /* JADX INFO: renamed from: b */
    private int f5308b;

    /* JADX INFO: renamed from: c */
    private float f5309c;

    /* JADX INFO: renamed from: d */
    private float f5310d;

    /* JADX INFO: renamed from: e */
    private boolean f5311e;

    /* JADX INFO: renamed from: f */
    private int f5312f;

    public lhq0() {
        super(2);
        this.f5309c = 0.8f;
        this.f5310d = 0.0f;
        this.f5311e = false;
        this.f5312f = 25;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m6025Q1(boolean z) {
        this.f5311e = z;
        this.f5309c = 0.8f;
        this.f5310d = 0.0f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float shift;\n  uniform float mixShift;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    vec2 uv1 = scaleFromCenter(uv,shift);\n    vec3 color1 = texture2D(inputImageTexture1, uv1).rgb;\n    vec3 color2 = texture2D(inputImageTexture0, uv).rgb;\n    vec3 mixColor = mix(color1, color2, 1.0 -mixShift);\n    gl_FragColor = vec4(mixColor,1.0);\n}\n";
    }

    @Override // p003l.xj10, p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f5307a = GLES20.glGetUniformLocation(this.programHandle, "shift");
        this.f5308b = GLES20.glGetUniformLocation(this.programHandle, "mixShift");
    }

    @Override // p003l.xj10, p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f5311e) {
            float f = this.f5309c;
            int i = this.f5312f;
            float f2 = f + (0.4f / i);
            this.f5309c = f2;
            if (f2 >= 1.0d) {
                this.f5309c = 1.0f;
            }
            float f3 = this.f5310d + (1.0f / i);
            this.f5310d = f3;
            if (f3 >= 1.0d) {
                this.f5310d = 1.0f;
            }
        }
        GLES20.glUniform1f(this.f5307a, this.f5309c);
        GLES20.glUniform1f(this.f5308b, this.f5310d);
    }

    public void setFrameRate(int i) {
        this.f5312f = i;
    }
}
