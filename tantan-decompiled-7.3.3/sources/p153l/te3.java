package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class te3 extends hs10 {

    /* JADX INFO: renamed from: a */
    private int f173435a;

    /* JADX INFO: renamed from: b */
    private float f173436b;

    /* JADX INFO: renamed from: c */
    private boolean f173437c;

    /* JADX INFO: renamed from: d */
    private int f173438d;

    public te3() {
        super(2);
        this.f173436b = 0.0f;
        this.f173437c = false;
        this.f173438d = 25;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m190680Q1(boolean z) {
        this.f173437c = z;
        this.f173436b = 0.0f;
    }

    @Override // p153l.hs10, p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        this.f173436b = 0.0f;
        this.f173437c = false;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float shift;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    if (uv.y <= shift){\n    vec2 uv1 = vec2(uv.x,uv.y + 1.0 - shift);\n       gl_FragColor = texture2D(inputImageTexture1, uv1);\n    } else {\n        vec2 uv2 = scaleFromCenter(uv,1.0 + .2*shift);\n        if (uv.x > 0.2 * shift *0.5 && uv.x < 1.0 - 0.2 * shift *0.5\n           && uv.y > 0.2 * shift *0.5 && uv.y < 1.0 - 0.2 * shift*0.5) {\n           gl_FragColor = texture2D(inputImageTexture0, uv2)*(1.0 -  shift);\n        }\n    }\n}\n";
    }

    @Override // p153l.hs10, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f173435a = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p153l.hs10, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f173437c) {
            float f = this.f173436b;
            if (f < 1.0f) {
                float f2 = f + (2.0f / this.f173438d);
                this.f173436b = f2;
                if (f2 >= 1.0d) {
                    this.f173436b = 1.0f;
                }
            }
        }
        GLES20.glUniform1f(this.f173435a, this.f173436b);
    }

    public void setFrameRate(int i) {
        this.f173438d = i;
    }
}
