package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class opi0 extends ts2 implements q7m {

    /* JADX INFO: renamed from: a */
    private int f145002a;

    /* JADX INFO: renamed from: b */
    private float f145003b = 0.0f;

    /* JADX INFO: renamed from: c */
    private boolean f145004c = false;

    /* JADX INFO: renamed from: d */
    private long f145005d = -1;

    /* JADX INFO: renamed from: e */
    private long f145006e = -1;

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m165360Q1() {
        this.f145005d = -1L;
        this.f145004c = true;
        this.f145003b = 0.0f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float shift;\nvoid main(){\n vec2 uv = textureCoordinate ;\n     \n     if (uv.y < 1.0 / 3.0 || uv.y > 2.0 / 3.0) {\n         if (uv.x < shift) {\n             vec2 uv1 = vec2(uv.x + 1.0 - shift, uv.y);\n             gl_FragColor = texture2D(inputImageTexture0, uv1);\n         } else {\n             gl_FragColor = vec4(vec3(0.0), 1.0);\n         }\n     } else {\n         gl_FragColor = texture2D(inputImageTexture0, uv);\n     }}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f145002a = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p149l.ts2, p149l.jcj
    public synchronized void newTextureReady(int i, mcj mcjVar, boolean z) {
        super.newTextureReady(i, mcjVar, z);
        long j = this.f145005d;
        if (j == -1) {
            this.f145005d = this.f145006e;
            return;
        }
        if (this.f145004c) {
            long j2 = this.f145006e - j;
            float f = this.f145003b + (j2 / 1000.0f);
            this.f145003b = f;
            if (f >= 1.0f) {
                this.f145003b = 1.0f;
                this.f145004c = false;
            }
            this.f145005d = j2 + j;
        }
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f145002a, this.f145003b);
    }

    @Override // p149l.q7m
    public void setTimeStamp(long j) {
        this.f145006e = j;
    }
}
