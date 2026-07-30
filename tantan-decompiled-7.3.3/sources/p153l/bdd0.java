package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class bdd0 extends hs10 {

    /* JADX INFO: renamed from: a */
    private int f76258a;

    /* JADX INFO: renamed from: b */
    private float f76259b;

    /* JADX INFO: renamed from: c */
    private boolean f76260c;

    /* JADX INFO: renamed from: d */
    private int f76261d;

    public bdd0() {
        super(2);
        this.f76259b = 0.0f;
        this.f76260c = false;
        this.f76261d = 25;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m103606Q1(boolean z) {
        this.f76260c = z;
        this.f76259b = 0.0f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float shift;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    if (uv.x >= 1. - shift){\n    vec2 uv1 = vec2(uv.x- (1.- shift),uv.y);\n       gl_FragColor = texture2D(inputImageTexture1, uv1);\n    } else {\n        vec2 uv2 = scaleFromCenter(uv,1.0 + .2*shift);\n        if (uv.x > 0.2 * shift *0.5 && uv.x < 1.0 - 0.2 * shift *0.5\n           && uv.y > 0.2 * shift *0.5 && uv.y < 1.0 - 0.2 * shift*0.5) {\n           gl_FragColor = texture2D(inputImageTexture0, uv2)*(1.0 -  shift);\n        }\n    }\n}\n";
    }

    @Override // p153l.hs10, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f76258a = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p153l.hs10, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f76260c) {
            float f = this.f76259b + (2.0f / this.f76261d);
            this.f76259b = f;
            if (f >= 1.0d) {
                this.f76259b = 1.0f;
                this.f76260c = false;
            }
        }
        GLES20.glUniform1f(this.f76258a, this.f76259b);
    }

    public void setFrameRate(int i) {
        this.f76261d = i;
    }
}
