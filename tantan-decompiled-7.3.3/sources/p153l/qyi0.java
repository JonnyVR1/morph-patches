package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class qyi0 extends jt2 implements gam {

    /* JADX INFO: renamed from: a */
    private int f160154a;

    /* JADX INFO: renamed from: b */
    private float f160155b = 2.0f;

    /* JADX INFO: renamed from: c */
    private boolean f160156c = false;

    /* JADX INFO: renamed from: d */
    private long f160157d = -1;

    /* JADX INFO: renamed from: e */
    private long f160158e = -1;

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m178650Q1() {
        this.f160157d = -1L;
        this.f160156c = true;
        this.f160155b = 0.0f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float shift;\nvoid main(){\nvec2 uv = textureCoordinate;\n     \n     if (shift == 0.0) {\n         if (uv.y < 1.0 / 3.0) {\n             gl_FragColor = texture2D(inputImageTexture0, uv);\n         } else {\n             gl_FragColor = vec4(vec3(1.0), 1.0);\n         }\n     } else if (shift == 1.0) {\n         if (uv.y > 1.0 / 3.0 && uv.y < 2.0 / 3.0) {\n             gl_FragColor = texture2D(inputImageTexture0, uv);\n         } else {\n             gl_FragColor = vec4(vec3(1.0), 1.0);\n         }\n     } else if (shift == 2.0) {\n         if (uv.y > 2.0 / 3.0) {\n             gl_FragColor = texture2D(inputImageTexture0, uv);\n         } else {\n             gl_FragColor = vec4(vec3(1.0), 1.0);\n         }\n     } else {\n         gl_FragColor = texture2D(inputImageTexture0, uv);\n     } }\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f160154a = GLES20.glGetUniformLocation(this.programHandle, "shift");
    }

    @Override // p153l.jt2, p153l.dfj
    public synchronized void newTextureReady(int i, gfj gfjVar, boolean z) {
        try {
            System.currentTimeMillis();
            if (this.f160157d == -1) {
                this.f160157d = this.f160158e;
            }
            if (this.f160156c) {
                long j = this.f160158e - this.f160157d;
                if (j < 700) {
                    this.f160155b = 2.0f;
                } else if (j < 1400) {
                    this.f160155b = 1.0f;
                } else if (j < 2100) {
                    this.f160155b = 0.0f;
                } else {
                    this.f160155b = -1.0f;
                }
            }
            super.newTextureReady(i, gfjVar, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f160154a, this.f160155b);
    }

    @Override // p153l.gam
    public void setTimeStamp(long j) {
        this.f160158e = j;
    }
}
