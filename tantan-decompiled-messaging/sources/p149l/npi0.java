package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class npi0 extends ts2 implements q7m {

    /* JADX INFO: renamed from: a */
    private int f139972a;

    /* JADX INFO: renamed from: b */
    private float f139973b = 2.0f;

    /* JADX INFO: renamed from: c */
    private boolean f139974c = false;

    /* JADX INFO: renamed from: d */
    private long f139975d = -1;

    /* JADX INFO: renamed from: e */
    private long f139976e = -1;

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m160507Q1() {
        this.f139975d = -1L;
        this.f139974c = true;
        this.f139973b = 0.0f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float shift;\nvoid main(){\nvec2 uv = textureCoordinate;\n     \n     if (shift == 0.0) {\n         if (uv.y < 1.0 / 3.0) {\n             gl_FragColor = texture2D(inputImageTexture0, uv);\n         } else {\n             gl_FragColor = vec4(vec3(1.0), 1.0);\n         }\n     } else if (shift == 1.0) {\n         if (uv.y > 1.0 / 3.0 && uv.y < 2.0 / 3.0) {\n             gl_FragColor = texture2D(inputImageTexture0, uv);\n         } else {\n             gl_FragColor = vec4(vec3(1.0), 1.0);\n         }\n     } else if (shift == 2.0) {\n         if (uv.y > 2.0 / 3.0) {\n             gl_FragColor = texture2D(inputImageTexture0, uv);\n         } else {\n             gl_FragColor = vec4(vec3(1.0), 1.0);\n         }\n     } else {\n         gl_FragColor = texture2D(inputImageTexture0, uv);\n     } }\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f139972a = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p149l.ts2, p149l.jcj
    public synchronized void newTextureReady(int i, mcj mcjVar, boolean z) {
        try {
            System.currentTimeMillis();
            if (this.f139975d == -1) {
                this.f139975d = this.f139976e;
            }
            if (this.f139974c) {
                long j = this.f139976e - this.f139975d;
                if (j < 700) {
                    this.f139973b = 2.0f;
                } else if (j < 1400) {
                    this.f139973b = 1.0f;
                } else if (j < 2100) {
                    this.f139973b = 0.0f;
                } else {
                    this.f139973b = -1.0f;
                }
            }
            super.newTextureReady(i, mcjVar, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f139972a, this.f139973b);
    }

    @Override // p149l.q7m
    public void setTimeStamp(long j) {
        this.f139976e = j;
    }
}
