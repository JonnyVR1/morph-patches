package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class ryi0 extends jt2 implements gam {

    /* JADX INFO: renamed from: a */
    private int f165439a;

    /* JADX INFO: renamed from: b */
    private float f165440b = 0.0f;

    /* JADX INFO: renamed from: c */
    private boolean f165441c = false;

    /* JADX INFO: renamed from: d */
    private long f165442d = -1;

    /* JADX INFO: renamed from: e */
    private long f165443e = -1;

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m183609Q1() {
        this.f165442d = -1L;
        this.f165441c = true;
        this.f165440b = 0.0f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float shift;\nvoid main(){\n vec2 uv = textureCoordinate ;\n     \n     if (uv.y < 1.0 / 3.0 || uv.y > 2.0 / 3.0) {\n         if (uv.x < shift) {\n             vec2 uv1 = vec2(uv.x + 1.0 - shift, uv.y);\n             gl_FragColor = texture2D(inputImageTexture0, uv1);\n         } else {\n             gl_FragColor = vec4(vec3(0.0), 1.0);\n         }\n     } else {\n         gl_FragColor = texture2D(inputImageTexture0, uv);\n     }}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f165439a = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p153l.jt2, p153l.dfj
    public synchronized void newTextureReady(int i, gfj gfjVar, boolean z) {
        super.newTextureReady(i, gfjVar, z);
        long j = this.f165442d;
        if (j == -1) {
            this.f165442d = this.f165443e;
            return;
        }
        if (this.f165441c) {
            long j2 = this.f165443e - j;
            float f = this.f165440b + (j2 / 1000.0f);
            this.f165440b = f;
            if (f >= 1.0f) {
                this.f165440b = 1.0f;
                this.f165441c = false;
            }
            this.f165442d = j2 + j;
        }
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f165439a, this.f165440b);
    }

    @Override // p153l.gam
    public void setTimeStamp(long j) {
        this.f165443e = j;
    }
}
