package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class npi0 extends ts2 implements q7m {

    /* JADX INFO: renamed from: a */
    private int f5943a;

    /* JADX INFO: renamed from: b */
    private float f5944b = 2.0f;

    /* JADX INFO: renamed from: c */
    private boolean f5945c = false;

    /* JADX INFO: renamed from: d */
    private long f5946d = -1;

    /* JADX INFO: renamed from: e */
    private long f5947e = -1;

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m6557Q1() {
        this.f5946d = -1L;
        this.f5945c = true;
        this.f5944b = 0.0f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float shift;\nvoid main(){\nvec2 uv = textureCoordinate;\n     \n     if (shift == 0.0) {\n         if (uv.y < 1.0 / 3.0) {\n             gl_FragColor = texture2D(inputImageTexture0, uv);\n         } else {\n             gl_FragColor = vec4(vec3(1.0), 1.0);\n         }\n     } else if (shift == 1.0) {\n         if (uv.y > 1.0 / 3.0 && uv.y < 2.0 / 3.0) {\n             gl_FragColor = texture2D(inputImageTexture0, uv);\n         } else {\n             gl_FragColor = vec4(vec3(1.0), 1.0);\n         }\n     } else if (shift == 2.0) {\n         if (uv.y > 2.0 / 3.0) {\n             gl_FragColor = texture2D(inputImageTexture0, uv);\n         } else {\n             gl_FragColor = vec4(vec3(1.0), 1.0);\n         }\n     } else {\n         gl_FragColor = texture2D(inputImageTexture0, uv);\n     } }\n";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f5943a = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p003l.ts2, p003l.jcj
    public synchronized void newTextureReady(int i, mcj mcjVar, boolean z) {
        try {
            System.currentTimeMillis();
            if (this.f5946d == -1) {
                this.f5946d = this.f5947e;
            }
            if (this.f5945c) {
                long j = this.f5947e - this.f5946d;
                if (j < 700) {
                    this.f5944b = 2.0f;
                } else if (j < 1400) {
                    this.f5944b = 1.0f;
                } else if (j < 2100) {
                    this.f5944b = 0.0f;
                } else {
                    this.f5944b = -1.0f;
                }
            }
            super.newTextureReady(i, mcjVar, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f5943a, this.f5944b);
    }

    @Override // p003l.q7m
    public void setTimeStamp(long j) {
        this.f5947e = j;
    }
}
