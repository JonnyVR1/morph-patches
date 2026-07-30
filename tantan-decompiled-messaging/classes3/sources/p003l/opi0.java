package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class opi0 extends ts2 implements q7m {

    /* JADX INFO: renamed from: a */
    private int f6193a;

    /* JADX INFO: renamed from: b */
    private float f6194b = 0.0f;

    /* JADX INFO: renamed from: c */
    private boolean f6195c = false;

    /* JADX INFO: renamed from: d */
    private long f6196d = -1;

    /* JADX INFO: renamed from: e */
    private long f6197e = -1;

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m6724Q1() {
        this.f6196d = -1L;
        this.f6195c = true;
        this.f6194b = 0.0f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float shift;\nvoid main(){\n vec2 uv = textureCoordinate ;\n     \n     if (uv.y < 1.0 / 3.0 || uv.y > 2.0 / 3.0) {\n         if (uv.x < shift) {\n             vec2 uv1 = vec2(uv.x + 1.0 - shift, uv.y);\n             gl_FragColor = texture2D(inputImageTexture0, uv1);\n         } else {\n             gl_FragColor = vec4(vec3(0.0), 1.0);\n         }\n     } else {\n         gl_FragColor = texture2D(inputImageTexture0, uv);\n     }}\n";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f6193a = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p003l.ts2, p003l.jcj
    public synchronized void newTextureReady(int i, mcj mcjVar, boolean z) {
        super.newTextureReady(i, mcjVar, z);
        long j = this.f6196d;
        if (j == -1) {
            this.f6196d = this.f6197e;
            return;
        }
        if (this.f6195c) {
            long j2 = this.f6197e - j;
            float f = this.f6194b + (j2 / 1000.0f);
            this.f6194b = f;
            if (f >= 1.0f) {
                this.f6194b = 1.0f;
                this.f6195c = false;
            }
            this.f6196d = j2 + j;
        }
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f6193a, this.f6194b);
    }

    @Override // p003l.q7m
    public void setTimeStamp(long j) {
        this.f6197e = j;
    }
}
