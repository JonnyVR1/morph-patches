package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class y4d0 extends xj10 {

    /* JADX INFO: renamed from: a */
    private int f8913a;

    /* JADX INFO: renamed from: b */
    private float f8914b;

    /* JADX INFO: renamed from: c */
    private boolean f8915c;

    /* JADX INFO: renamed from: d */
    private int f8916d;

    public y4d0() {
        super(2);
        this.f8914b = 0.0f;
        this.f8915c = false;
        this.f8916d = 25;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m8888Q1(boolean z) {
        this.f8915c = z;
        this.f8914b = 0.0f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float shift;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    if (uv.x >= 1. - shift){\n    vec2 uv1 = vec2(uv.x- (1.- shift),uv.y);\n       gl_FragColor = texture2D(inputImageTexture1, uv1);\n    } else {\n        vec2 uv2 = scaleFromCenter(uv,1.0 + .2*shift);\n        if (uv.x > 0.2 * shift *0.5 && uv.x < 1.0 - 0.2 * shift *0.5\n           && uv.y > 0.2 * shift *0.5 && uv.y < 1.0 - 0.2 * shift*0.5) {\n           gl_FragColor = texture2D(inputImageTexture0, uv2)*(1.0 -  shift);\n        }\n    }\n}\n";
    }

    @Override // p003l.xj10, p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f8913a = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p003l.xj10, p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f8915c) {
            float f = this.f8914b + (2.0f / this.f8916d);
            this.f8914b = f;
            if (f >= 1.0d) {
                this.f8914b = 1.0f;
                this.f8915c = false;
            }
        }
        GLES20.glUniform1f(this.f8913a, this.f8914b);
    }

    public void setFrameRate(int i) {
        this.f8916d = i;
    }
}
