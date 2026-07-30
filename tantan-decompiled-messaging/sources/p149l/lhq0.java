package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class lhq0 extends xj10 {

    /* JADX INFO: renamed from: a */
    private int f128126a;

    /* JADX INFO: renamed from: b */
    private int f128127b;

    /* JADX INFO: renamed from: c */
    private float f128128c;

    /* JADX INFO: renamed from: d */
    private float f128129d;

    /* JADX INFO: renamed from: e */
    private boolean f128130e;

    /* JADX INFO: renamed from: f */
    private int f128131f;

    public lhq0() {
        super(2);
        this.f128128c = 0.8f;
        this.f128129d = 0.0f;
        this.f128130e = false;
        this.f128131f = 25;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m149853Q1(boolean z) {
        this.f128130e = z;
        this.f128128c = 0.8f;
        this.f128129d = 0.0f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float shift;\n  uniform float mixShift;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    vec2 uv1 = scaleFromCenter(uv,shift);\n    vec3 color1 = texture2D(inputImageTexture1, uv1).rgb;\n    vec3 color2 = texture2D(inputImageTexture0, uv).rgb;\n    vec3 mixColor = mix(color1, color2, 1.0 -mixShift);\n    gl_FragColor = vec4(mixColor,1.0);\n}\n";
    }

    @Override // p149l.xj10, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f128126a = GLES20.glGetUniformLocation(this.programHandle, "shift");
        this.f128127b = GLES20.glGetUniformLocation(this.programHandle, "mixShift");
    }

    @Override // p149l.xj10, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f128130e) {
            float f = this.f128128c;
            int i = this.f128131f;
            float f2 = f + (0.4f / i);
            this.f128128c = f2;
            if (f2 >= 1.0d) {
                this.f128128c = 1.0f;
            }
            float f3 = this.f128129d + (1.0f / i);
            this.f128129d = f3;
            if (f3 >= 1.0d) {
                this.f128129d = 1.0f;
            }
        }
        GLES20.glUniform1f(this.f128126a, this.f128128c);
        GLES20.glUniform1f(this.f128127b, this.f128129d);
    }

    public void setFrameRate(int i) {
        this.f128131f = i;
    }
}
