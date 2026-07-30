package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class uxi0 extends ts2 {

    /* JADX INFO: renamed from: a */
    private int f8119a;

    /* JADX INFO: renamed from: b */
    private float f8120b = 0.0f;

    /* JADX INFO: renamed from: c */
    private boolean f8121c = true;

    /* JADX INFO: renamed from: d */
    private int f8122d = 25;

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m8253Q1() {
        this.f8121c = true;
        this.f8120b = 0.0f;
    }

    @Override // p003l.mcj, p003l.ccj
    public void destroy() {
        super.destroy();
        this.f8120b = 0.0f;
        this.f8121c = false;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float shift;\nvoid main(){\n    vec2 uv = textureCoordinate;\n    if (uv.y >= 1.0 - shift){\n       vec2 uv1 = vec2(uv.x,uv.y - 1.0 + shift);\n       gl_FragColor = texture2D(inputImageTexture0, uv1);\n    }}\n";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f8119a = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f8121c) {
            float f = this.f8120b;
            if (f < 1.0f) {
                float f2 = f + (0.5f / this.f8122d);
                this.f8120b = f2;
                if (f2 >= 1.0d) {
                    this.f8120b = 1.0f;
                }
            }
        }
        GLES20.glUniform1f(this.f8119a, this.f8120b);
    }
}
