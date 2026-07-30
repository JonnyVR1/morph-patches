package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class uxi0 extends ts2 {

    /* JADX INFO: renamed from: a */
    private int f178741a;

    /* JADX INFO: renamed from: b */
    private float f178742b = 0.0f;

    /* JADX INFO: renamed from: c */
    private boolean f178743c = true;

    /* JADX INFO: renamed from: d */
    private int f178744d = 25;

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m196183Q1() {
        this.f178743c = true;
        this.f178742b = 0.0f;
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        this.f178742b = 0.0f;
        this.f178743c = false;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float shift;\nvoid main(){\n    vec2 uv = textureCoordinate;\n    if (uv.y >= 1.0 - shift){\n       vec2 uv1 = vec2(uv.x,uv.y - 1.0 + shift);\n       gl_FragColor = texture2D(inputImageTexture0, uv1);\n    }}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f178741a = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f178743c) {
            float f = this.f178742b;
            if (f < 1.0f) {
                float f2 = f + (0.5f / this.f178744d);
                this.f178742b = f2;
                if (f2 >= 1.0d) {
                    this.f178742b = 1.0f;
                }
            }
        }
        GLES20.glUniform1f(this.f178741a, this.f178742b);
    }
}
