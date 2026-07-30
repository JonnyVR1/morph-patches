package p149l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class obj extends mcj implements jcj {

    /* JADX INFO: renamed from: b */
    private float f142946b;

    /* JADX INFO: renamed from: c */
    private float f142947c;

    /* JADX INFO: renamed from: f */
    private FloatBuffer[] f142950f;

    /* JADX INFO: renamed from: g */
    private float[] f142951g;

    /* JADX INFO: renamed from: i */
    private float[] f142952i;

    /* JADX INFO: renamed from: j */
    private float[] f142953j;

    /* JADX INFO: renamed from: k */
    private float[] f142954k;

    /* JADX INFO: renamed from: m */
    private int f142956m;

    /* JADX INFO: renamed from: d */
    private int f142948d = 0;

    /* JADX INFO: renamed from: e */
    private int f142949e = 0;

    /* JADX INFO: renamed from: a */
    private float f142945a = 1.3333334f;

    /* JADX INFO: renamed from: l */
    private boolean f142955l = false;

    /* JADX INFO: renamed from: R1 */
    private void m163443R1(float f, float f2, float f3, float f4) {
        if (!this.f142955l) {
            this.f142950f = new FloatBuffer[4];
            this.f142951g = new float[8];
            this.f142952i = new float[8];
            this.f142953j = new float[8];
            this.f142954k = new float[8];
            this.f142955l = true;
        }
        if (this.f142955l) {
            float[] fArr = this.f142951g;
            fArr[0] = f;
            fArr[1] = f3;
            fArr[2] = f2;
            fArr[3] = f3;
            fArr[4] = f;
            fArr[5] = f4;
            fArr[6] = f2;
            fArr[7] = f4;
            FloatBuffer[] floatBufferArr = this.f142950f;
            floatBufferArr[0] = og3.m164159a(floatBufferArr[0], fArr);
            float[] fArr2 = this.f142952i;
            fArr2[0] = f;
            fArr2[1] = f4;
            fArr2[2] = f;
            fArr2[3] = f3;
            fArr2[4] = f2;
            fArr2[5] = f4;
            fArr2[6] = f2;
            fArr2[7] = f3;
            FloatBuffer[] floatBufferArr2 = this.f142950f;
            floatBufferArr2[1] = og3.m164159a(floatBufferArr2[1], fArr2);
            float[] fArr3 = this.f142953j;
            fArr3[0] = f2;
            fArr3[1] = f4;
            fArr3[2] = f;
            fArr3[3] = f4;
            fArr3[4] = f2;
            fArr3[5] = f3;
            fArr3[6] = f;
            fArr3[7] = f3;
            FloatBuffer[] floatBufferArr3 = this.f142950f;
            floatBufferArr3[2] = og3.m164159a(floatBufferArr3[2], fArr3);
            float[] fArr4 = this.f142954k;
            fArr4[0] = f2;
            fArr4[1] = f3;
            fArr4[2] = f2;
            fArr4[3] = f4;
            fArr4[4] = f;
            fArr4[5] = f3;
            fArr4[6] = f;
            fArr4[7] = f4;
            FloatBuffer[] floatBufferArr4 = this.f142950f;
            floatBufferArr4[3] = og3.m164159a(floatBufferArr4[3], fArr4);
        }
    }

    private void drawIndeed() {
        if (this.texture_in == 0) {
            return;
        }
        if (this.f142948d == 0 && this.f142949e == 0 && (getHeight() * 1.0f) / getWidth() != this.f142945a) {
            getWidth();
            GLES20.glViewport(-((((int) this.f142946b) - getWidth()) / 2), -((((int) this.f142947c) - getHeight()) / 2), (int) this.f142946b, (int) this.f142947c);
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
    public void m163444Q1(int i, int i2) {
        this.f142948d = i;
        this.f142949e = i2;
    }

    @Override // p149l.mcj, p149l.ccj
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
        if (rbjVar != null && rbjVar.m178609h() == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                return;
            } else {
                initFBO();
            }
        }
        if (this.dirty) {
            GLES20.glBindFramebuffer(36160, this.glFrameBuffer.m178609h()[0]);
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
                    it.next().newTextureReady(this.glFrameBuffer.m178610i()[0], this, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying float right_edge; \nvoid main(){\nif (textureCoordinate.x < right_edge) \ngl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\nelse {\nvec2 xy = vec2(textureCoordinate.x-(1.0-right_edge), textureCoordinate.y); \ngl_FragColor = texture2D(inputImageTexture0,xy);\n} \n}\n";
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float rightEdge; \nvarying float right_edge; \nvoid main() {\nright_edge = rightEdge; \n  textureCoordinate = inputTextureCoordinate;\n   gl_Position = position;\n}\n";
    }

    @Override // p149l.mcj
    public void initFBO() {
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null) {
            rbjVar.m178606e();
        }
        rbj rbjVar2 = new rbj(getWidth(), getHeight());
        this.glFrameBuffer = rbjVar2;
        rbjVar2.m178603b(getWidth(), getHeight());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        ysf.m215904a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        this.textureHandle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture0");
        this.positionHandle = GLES20.glGetAttribLocation(this.programHandle, "position");
        this.texCoordHandle = GLES20.glGetAttribLocation(this.programHandle, "inputTextureCoordinate");
        this.f142956m = GLES20.glGetUniformLocation(this.programHandle, "rightEdge");
    }

    @Override // p149l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
    }

    @Override // p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (z) {
            markAsDirty();
        }
        this.texture_in = i;
        this.f142946b = mcjVar.getWidth();
        float height = mcjVar.getHeight();
        this.f142947c = height;
        this.f142945a = height / (this.f142946b * 1.0f);
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        onDrawFrame();
        mcjVar.unlockRenderBuffer();
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        if (this.f142948d == 0 && this.f142949e == 0) {
            GLES20.glUniform1f(this.f142956m, 1.0f);
            this.textureVertices[this.curRotation].position(0);
            GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
        } else {
            GLES20.glUniform1f(this.f142956m, 1.0f - (1.0f / this.f142946b));
            float f = this.f142948d * 1.0f;
            float f2 = this.f142947c;
            m163443R1(0.0f, 1.0f, f / f2, (this.f142949e * 1.0f) / f2);
            this.f142950f[this.curRotation].position(0);
            GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.f142950f[this.curRotation]);
        }
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }
}
