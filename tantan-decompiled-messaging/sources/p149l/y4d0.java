package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class y4d0 extends xj10 {

    /* JADX INFO: renamed from: a */
    private int f196270a;

    /* JADX INFO: renamed from: b */
    private float f196271b;

    /* JADX INFO: renamed from: c */
    private boolean f196272c;

    /* JADX INFO: renamed from: d */
    private int f196273d;

    public y4d0() {
        super(2);
        this.f196271b = 0.0f;
        this.f196272c = false;
        this.f196273d = 25;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m212892Q1(boolean z) {
        this.f196272c = z;
        this.f196271b = 0.0f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float shift;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    if (uv.x >= 1. - shift){\n    vec2 uv1 = vec2(uv.x- (1.- shift),uv.y);\n       gl_FragColor = texture2D(inputImageTexture1, uv1);\n    } else {\n        vec2 uv2 = scaleFromCenter(uv,1.0 + .2*shift);\n        if (uv.x > 0.2 * shift *0.5 && uv.x < 1.0 - 0.2 * shift *0.5\n           && uv.y > 0.2 * shift *0.5 && uv.y < 1.0 - 0.2 * shift*0.5) {\n           gl_FragColor = texture2D(inputImageTexture0, uv2)*(1.0 -  shift);\n        }\n    }\n}\n";
    }

    @Override // p149l.xj10, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f196270a = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p149l.xj10, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f196272c) {
            float f = this.f196271b + (2.0f / this.f196273d);
            this.f196271b = f;
            if (f >= 1.0d) {
                this.f196271b = 1.0f;
                this.f196272c = false;
            }
        }
        GLES20.glUniform1f(this.f196270a, this.f196271b);
    }

    public void setFrameRate(int i) {
        this.f196273d = i;
    }
}
