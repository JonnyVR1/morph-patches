package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ee3 extends xj10 {

    /* JADX INFO: renamed from: a */
    private int f3258a;

    /* JADX INFO: renamed from: b */
    private float f3259b;

    /* JADX INFO: renamed from: c */
    private boolean f3260c;

    /* JADX INFO: renamed from: d */
    private int f3261d;

    public ee3() {
        super(2);
        this.f3259b = 0.0f;
        this.f3260c = false;
        this.f3261d = 25;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m3819Q1(boolean z) {
        this.f3260c = z;
        this.f3259b = 0.0f;
    }

    @Override // p003l.xj10, p003l.mcj, p003l.ccj
    public void destroy() {
        super.destroy();
        this.f3259b = 0.0f;
        this.f3260c = false;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float shift;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    if (uv.y <= shift){\n    vec2 uv1 = vec2(uv.x,uv.y + 1.0 - shift);\n       gl_FragColor = texture2D(inputImageTexture1, uv1);\n    } else {\n        vec2 uv2 = scaleFromCenter(uv,1.0 + .2*shift);\n        if (uv.x > 0.2 * shift *0.5 && uv.x < 1.0 - 0.2 * shift *0.5\n           && uv.y > 0.2 * shift *0.5 && uv.y < 1.0 - 0.2 * shift*0.5) {\n           gl_FragColor = texture2D(inputImageTexture0, uv2)*(1.0 -  shift);\n        }\n    }\n}\n";
    }

    @Override // p003l.xj10, p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f3258a = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p003l.xj10, p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f3260c) {
            float f = this.f3259b;
            if (f < 1.0f) {
                float f2 = f + (2.0f / this.f3261d);
                this.f3259b = f2;
                if (f2 >= 1.0d) {
                    this.f3259b = 1.0f;
                }
            }
        }
        GLES20.glUniform1f(this.f3258a, this.f3259b);
    }

    public void setFrameRate(int i) {
        this.f3261d = i;
    }
}
