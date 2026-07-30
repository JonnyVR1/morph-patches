package p003l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.Iterator;
import l.ysf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class obj extends mcj implements jcj {

    /* JADX INFO: renamed from: b */
    private float f6081b;

    /* JADX INFO: renamed from: c */
    private float f6082c;

    /* JADX INFO: renamed from: f */
    private FloatBuffer[] f6085f;

    /* JADX INFO: renamed from: g */
    private float[] f6086g;

    /* JADX INFO: renamed from: i */
    private float[] f6087i;

    /* JADX INFO: renamed from: j */
    private float[] f6088j;

    /* JADX INFO: renamed from: k */
    private float[] f6089k;

    /* JADX INFO: renamed from: m */
    private int f6091m;

    /* JADX INFO: renamed from: d */
    private int f6083d = 0;

    /* JADX INFO: renamed from: e */
    private int f6084e = 0;

    /* JADX INFO: renamed from: a */
    private float f6080a = 1.3333334f;

    /* JADX INFO: renamed from: l */
    private boolean f6090l = false;

    /* JADX INFO: renamed from: R1 */
    private void m6599R1(float f, float f2, float f3, float f4) {
        if (!this.f6090l) {
            this.f6085f = new FloatBuffer[4];
            this.f6086g = new float[8];
            this.f6087i = new float[8];
            this.f6088j = new float[8];
            this.f6089k = new float[8];
            this.f6090l = true;
        }
        if (this.f6090l) {
            float[] fArr = this.f6086g;
            fArr[0] = f;
            fArr[1] = f3;
            fArr[2] = f2;
            fArr[3] = f3;
            fArr[4] = f;
            fArr[5] = f4;
            fArr[6] = f2;
            fArr[7] = f4;
            FloatBuffer[] floatBufferArr = this.f6085f;
            floatBufferArr[0] = og3.m6707a(floatBufferArr[0], fArr);
            float[] fArr2 = this.f6087i;
            fArr2[0] = f;
            fArr2[1] = f4;
            fArr2[2] = f;
            fArr2[3] = f3;
            fArr2[4] = f2;
            fArr2[5] = f4;
            fArr2[6] = f2;
            fArr2[7] = f3;
            FloatBuffer[] floatBufferArr2 = this.f6085f;
            floatBufferArr2[1] = og3.m6707a(floatBufferArr2[1], fArr2);
            float[] fArr3 = this.f6088j;
            fArr3[0] = f2;
            fArr3[1] = f4;
            fArr3[2] = f;
            fArr3[3] = f4;
            fArr3[4] = f2;
            fArr3[5] = f3;
            fArr3[6] = f;
            fArr3[7] = f3;
            FloatBuffer[] floatBufferArr3 = this.f6085f;
            floatBufferArr3[2] = og3.m6707a(floatBufferArr3[2], fArr3);
            float[] fArr4 = this.f6089k;
            fArr4[0] = f2;
            fArr4[1] = f3;
            fArr4[2] = f2;
            fArr4[3] = f4;
            fArr4[4] = f;
            fArr4[5] = f3;
            fArr4[6] = f;
            fArr4[7] = f4;
            FloatBuffer[] floatBufferArr4 = this.f6085f;
            floatBufferArr4[3] = og3.m6707a(floatBufferArr4[3], fArr4);
        }
    }

    private void drawIndeed() {
        if (this.texture_in == 0) {
            return;
        }
        if (this.f6083d == 0 && this.f6084e == 0 && (getHeight() * 1.0f) / getWidth() != this.f6080a) {
            getWidth();
            GLES20.glViewport(-((((int) this.f6081b) - getWidth()) / 2), -((((int) this.f6082c) - getHeight()) / 2), (int) this.f6081b, (int) this.f6082c);
        } else {
            GLES20.glViewport(0, 0, getWidth(), getHeight());
        }
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        GLES20.glClear(16640);
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m6600Q1(int i, int i2) {
        this.f6083d = i;
        this.f6084e = i2;
    }

    @Override // p003l.mcj, p003l.ccj
    public void drawFrame() {
        boolean z;
        if (this.glFrameBuffer == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                return;
            } else {
                initFBO();
            }
        }
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null && rbjVar.m7172h() == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                return;
            } else {
                initFBO();
            }
        }
        if (this.dirty) {
            GLES20.glBindFramebuffer(36160, this.glFrameBuffer.m7172h()[0]);
            drawIndeed();
            GLES20.glBindFramebuffer(36160, 0);
            z = true;
        } else {
            z = false;
        }
        synchronized (this.listLock) {
            try {
                Iterator<jcj> it = this.targets.iterator();
                while (it.hasNext()) {
                    it.next().newTextureReady(this.glFrameBuffer.m7173i()[0], this, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying float right_edge; \nvoid main(){\nif (textureCoordinate.x < right_edge) \ngl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\nelse {\nvec2 xy = vec2(textureCoordinate.x-(1.0-right_edge), textureCoordinate.y); \ngl_FragColor = texture2D(inputImageTexture0,xy);\n} \n}\n";
    }

    @Override // p003l.ccj
    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float rightEdge; \nvarying float right_edge; \nvoid main() {\nright_edge = rightEdge; \n  textureCoordinate = inputTextureCoordinate;\n   gl_Position = position;\n}\n";
    }

    @Override // p003l.mcj
    public void initFBO() {
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null) {
            rbjVar.m7169e();
        }
        rbj rbjVar2 = new rbj(getWidth(), getHeight());
        this.glFrameBuffer = rbjVar2;
        rbjVar2.m7166b(getWidth(), getHeight());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        ysf.a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        this.textureHandle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture0");
        this.positionHandle = GLES20.glGetAttribLocation(this.programHandle, "position");
        this.texCoordHandle = GLES20.glGetAttribLocation(this.programHandle, "inputTextureCoordinate");
        this.f6091m = GLES20.glGetUniformLocation(this.programHandle, "rightEdge");
    }

    @Override // p003l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
    }

    @Override // p003l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (z) {
            markAsDirty();
        }
        this.texture_in = i;
        this.f6081b = mcjVar.getWidth();
        float height = mcjVar.getHeight();
        this.f6082c = height;
        this.f6080a = height / (this.f6081b * 1.0f);
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        onDrawFrame();
        mcjVar.unlockRenderBuffer();
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        if (this.f6083d == 0 && this.f6084e == 0) {
            GLES20.glUniform1f(this.f6091m, 1.0f);
            this.textureVertices[this.curRotation].position(0);
            GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
        } else {
            GLES20.glUniform1f(this.f6091m, 1.0f - (1.0f / this.f6081b));
            float f = this.f6083d * 1.0f;
            float f2 = this.f6082c;
            m6599R1(0.0f, 1.0f, f / f2, (this.f6084e * 1.0f) / f2);
            this.f6085f[this.curRotation].position(0);
            GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.f6085f[this.curRotation]);
        }
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }
}
