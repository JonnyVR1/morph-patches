package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class ee3 extends xj10 {

    /* JADX INFO: renamed from: a */
    private int f90664a;

    /* JADX INFO: renamed from: b */
    private float f90665b;

    /* JADX INFO: renamed from: c */
    private boolean f90666c;

    /* JADX INFO: renamed from: d */
    private int f90667d;

    public ee3() {
        super(2);
        this.f90665b = 0.0f;
        this.f90666c = false;
        this.f90667d = 25;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m115844Q1(boolean z) {
        this.f90666c = z;
        this.f90665b = 0.0f;
    }

    @Override // p149l.xj10, p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        this.f90665b = 0.0f;
        this.f90666c = false;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float shift;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    if (uv.y <= shift){\n    vec2 uv1 = vec2(uv.x,uv.y + 1.0 - shift);\n       gl_FragColor = texture2D(inputImageTexture1, uv1);\n    } else {\n        vec2 uv2 = scaleFromCenter(uv,1.0 + .2*shift);\n        if (uv.x > 0.2 * shift *0.5 && uv.x < 1.0 - 0.2 * shift *0.5\n           && uv.y > 0.2 * shift *0.5 && uv.y < 1.0 - 0.2 * shift*0.5) {\n           gl_FragColor = texture2D(inputImageTexture0, uv2)*(1.0 -  shift);\n        }\n    }\n}\n";
    }

    @Override // p149l.xj10, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f90664a = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p149l.xj10, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f90666c) {
            float f = this.f90665b;
            if (f < 1.0f) {
                float f2 = f + (2.0f / this.f90667d);
                this.f90665b = f2;
                if (f2 >= 1.0d) {
                    this.f90665b = 1.0f;
                }
            }
        }
        GLES20.glUniform1f(this.f90664a, this.f90665b);
    }

    public void setFrameRate(int i) {
        this.f90667d = i;
    }
}
