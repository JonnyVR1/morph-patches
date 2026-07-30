package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class y6j0 extends jt2 {

    /* JADX INFO: renamed from: a */
    private int f197691a;

    /* JADX INFO: renamed from: b */
    private float f197692b = 0.0f;

    /* JADX INFO: renamed from: c */
    private boolean f197693c = true;

    /* JADX INFO: renamed from: d */
    private int f197694d = 25;

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m214485Q1() {
        this.f197693c = true;
        this.f197692b = 0.0f;
    }

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        this.f197692b = 0.0f;
        this.f197693c = false;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float shift;\nvoid main(){\n    vec2 uv = textureCoordinate;\n    if (uv.y >= 1.0 - shift){\n       vec2 uv1 = vec2(uv.x,uv.y - 1.0 + shift);\n       gl_FragColor = texture2D(inputImageTexture0, uv1);\n    }}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f197691a = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f197693c) {
            float f = this.f197692b;
            if (f < 1.0f) {
                float f2 = f + (0.5f / this.f197694d);
                this.f197692b = f2;
                if (f2 >= 1.0d) {
                    this.f197692b = 1.0f;
                }
            }
        }
        GLES20.glUniform1f(this.f197691a, this.f197692b);
    }
}
