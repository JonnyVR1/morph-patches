package p149l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class fcj extends ccj implements jcj {

    /* JADX INFO: renamed from: a */
    private float f96801a;

    /* JADX INFO: renamed from: c */
    private float f96803c;

    /* JADX INFO: renamed from: d */
    private float f96804d;

    /* JADX INFO: renamed from: f */
    private int f96806f;

    /* JADX INFO: renamed from: g */
    private int f96807g;

    /* JADX INFO: renamed from: i */
    private int f96808i;

    /* JADX INFO: renamed from: k */
    private FloatBuffer[] f96810k;

    /* JADX INFO: renamed from: l */
    private float[] f96811l;

    /* JADX INFO: renamed from: m */
    private float[] f96812m;

    /* JADX INFO: renamed from: n */
    private float[] f96813n;

    /* JADX INFO: renamed from: o */
    private float[] f96814o;

    /* JADX INFO: renamed from: b */
    private float f96802b = 1.0f;

    /* JADX INFO: renamed from: e */
    private boolean f96805e = true;

    /* JADX INFO: renamed from: j */
    private int f96809j = 0;

    /* JADX INFO: renamed from: p */
    private boolean f96815p = false;

    /* JADX INFO: renamed from: Q1 */
    private void m120431Q1(int i, int i2) {
        float f = (i * 1.0f) / this.f96803c;
        float f2 = (i2 * 1.0f) / this.f96804d;
        if (f > 0.5f || f2 > 0.5f) {
            this.f96809j = 0;
        } else {
            this.f96809j = 2;
        }
    }

    /* JADX INFO: renamed from: R1 */
    private void m120432R1(float f) {
        float f2 = this.f96804d;
        int i = (int) (f2 / f);
        float f3 = this.f96803c;
        int i2 = (int) (f * f3);
        float f4 = i;
        if (f4 < f3) {
            float f5 = ((f3 - f4) * 0.5f) / f3;
            m120433S1(f5, 1.0f - f5, 0.0f, 1.0f);
        } else {
            float f6 = ((f2 - i2) * 0.5f) / f2;
            m120433S1(0.0f, 1.0f, f6, 1.0f - f6);
        }
    }

    /* JADX INFO: renamed from: S1 */
    private void m120433S1(float f, float f2, float f3, float f4) {
        if (!this.f96815p) {
            this.f96810k = new FloatBuffer[4];
            this.f96811l = new float[8];
            this.f96812m = new float[8];
            this.f96813n = new float[8];
            this.f96814o = new float[8];
            this.f96815p = true;
        }
        if (this.f96815p) {
            float[] fArr = this.f96811l;
            fArr[0] = f;
            fArr[1] = f3;
            fArr[2] = f2;
            fArr[3] = f3;
            fArr[4] = f;
            fArr[5] = f4;
            fArr[6] = f2;
            fArr[7] = f4;
            FloatBuffer[] floatBufferArr = this.f96810k;
            floatBufferArr[0] = og3.m164159a(floatBufferArr[0], fArr);
            float[] fArr2 = this.f96812m;
            fArr2[0] = f;
            fArr2[1] = f4;
            fArr2[2] = f;
            fArr2[3] = f3;
            fArr2[4] = f2;
            fArr2[5] = f4;
            fArr2[6] = f2;
            fArr2[7] = f3;
            FloatBuffer[] floatBufferArr2 = this.f96810k;
            floatBufferArr2[1] = og3.m164159a(floatBufferArr2[1], fArr2);
            float[] fArr3 = this.f96813n;
            fArr3[0] = f2;
            fArr3[1] = f4;
            fArr3[2] = f;
            fArr3[3] = f4;
            fArr3[4] = f2;
            fArr3[5] = f3;
            fArr3[6] = f;
            fArr3[7] = f3;
            FloatBuffer[] floatBufferArr3 = this.f96810k;
            floatBufferArr3[2] = og3.m164159a(floatBufferArr3[2], fArr3);
            float[] fArr4 = this.f96814o;
            fArr4[0] = f2;
            fArr4[1] = f3;
            fArr4[2] = f2;
            fArr4[3] = f4;
            fArr4[4] = f;
            fArr4[5] = f3;
            fArr4[6] = f;
            fArr4[7] = f4;
            FloatBuffer[] floatBufferArr4 = this.f96810k;
            floatBufferArr4[3] = og3.m164159a(floatBufferArr4[3], fArr4);
        }
    }

    /* JADX INFO: renamed from: T1 */
    public void m120434T1(boolean z) {
        this.f96805e = z;
    }

    /* JADX INFO: renamed from: U1 */
    public void m120435U1(float f) {
        this.f96802b = f;
    }

    @Override // p149l.ccj
    public void destroy() {
        super.destroy();
    }

    @Override // p149l.ccj
    public void drawFrame() {
        if (this.texture_in == 0) {
            return;
        }
        m120431Q1(getWidth(), getHeight());
        if ((getHeight() * 1.0f) / getWidth() != this.f96801a) {
            m120432R1((getHeight() * 1.0f) / getWidth());
        } else {
            m120433S1(0.0f, 1.0f, 0.0f, 1.0f);
        }
        GLES20.glViewport(0, 0, getWidth(), getHeight());
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        GLES20.glClear(16640);
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
        if (this.f96805e) {
            GLES20.glFinish();
        }
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying vec2 xy_step;\nvarying float smooth; \nvoid main(){\nvec2 point = textureCoordinate; \nvec4 image_c = texture2D(inputImageTexture0,point); \nvec4 image = image_c;\nif (smooth >= 0.1) { \nvec4 image_lt=texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x,  xy_step.y), 0.0, 1.0)); \nvec4 image_lb=texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x, -xy_step.y), 0.0, 1.0)); \nvec4 image_rt=texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x,  xy_step.y), 0.0, 1.0)); \nvec4 image_rb=texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x, -xy_step.y), 0.0, 1.0)); \nvec4 image_l =texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x,     0.0), 0.0, 1.0)); \nvec4 image_r =texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x,     0.0), 0.0, 1.0)); \nvec4 image_t =texture2D(inputImageTexture0, clamp(point+vec2(    0.0,  xy_step.y), 0.0, 1.0)); \nvec4 image_b =texture2D(inputImageTexture0, clamp(point+vec2(    0.0, -xy_step.y), 0.0, 1.0)); \nimage = clamp(image_c*0.25+(image_lt+image_lb+image_rt+image_rb)*0.125+(image_l+image_t+image_b+image_r)*0.0625, 0.0, 1.0); \n} \ngl_FragColor = image;\n}\n";
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float widthStep; \nuniform float heightStep; \nuniform float smoothMode; \nvarying float smooth; \nvarying vec2 xy_step;\nvoid main() {\nsmooth = smoothMode; \n  textureCoordinate = inputTextureCoordinate;\nxy_step = vec2(widthStep, heightStep);\ngl_Position = position;\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        this.textureHandle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture0");
        this.positionHandle = GLES20.glGetAttribLocation(this.programHandle, "position");
        this.texCoordHandle = GLES20.glGetAttribLocation(this.programHandle, "inputTextureCoordinate");
        this.f96806f = GLES20.glGetUniformLocation(this.programHandle, "widthStep");
        this.f96807g = GLES20.glGetUniformLocation(this.programHandle, "heightStep");
        this.f96808i = GLES20.glGetUniformLocation(this.programHandle, "smoothMode");
    }

    @Override // p149l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
    }

    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        this.texture_in = i;
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        if (this.curRotation % 2 == 1) {
            this.f96803c = mcjVar.getHeight();
            this.f96804d = mcjVar.getWidth();
            this.f96801a = mcjVar.getWidth() / mcjVar.getHeight();
        } else {
            this.f96803c = mcjVar.getWidth();
            this.f96804d = mcjVar.getHeight();
            this.f96801a = mcjVar.getHeight() / mcjVar.getWidth();
        }
        if (getClass().equals(fcj.class)) {
            xxx.m211572F().m211586O();
        }
        onDrawFrame();
        rbj rbjVar = mcjVar.glFrameBuffer;
        if (rbjVar != null) {
            rbjVar.f158622h--;
        }
        mcjVar.unlockRenderBuffer();
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        int i = this.curRotation;
        this.renderVertices.position(0);
        float f = 1.0f / this.f96803c;
        float f2 = 1.0f / this.f96804d;
        GLES20.glUniform1f(this.f96806f, f);
        GLES20.glUniform1f(this.f96807g, f2);
        GLES20.glUniform1f(this.f96808i, this.f96809j / 10.0f);
        int i2 = i % 4;
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.f96810k[i2].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.f96810k[i2]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    @Override // p149l.ccj
    public void setRenderSize(int i, int i2) {
        super.setRenderSize(i, i2);
    }
}
