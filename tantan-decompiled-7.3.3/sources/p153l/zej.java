package p153l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class zej extends wej implements dfj {

    /* JADX INFO: renamed from: a */
    private float f204015a;

    /* JADX INFO: renamed from: c */
    private float f204017c;

    /* JADX INFO: renamed from: d */
    private float f204018d;

    /* JADX INFO: renamed from: f */
    private int f204020f;

    /* JADX INFO: renamed from: g */
    private int f204021g;

    /* JADX INFO: renamed from: i */
    private int f204022i;

    /* JADX INFO: renamed from: k */
    private FloatBuffer[] f204024k;

    /* JADX INFO: renamed from: l */
    private float[] f204025l;

    /* JADX INFO: renamed from: m */
    private float[] f204026m;

    /* JADX INFO: renamed from: n */
    private float[] f204027n;

    /* JADX INFO: renamed from: o */
    private float[] f204028o;

    /* JADX INFO: renamed from: b */
    private float f204016b = 1.0f;

    /* JADX INFO: renamed from: e */
    private boolean f204019e = true;

    /* JADX INFO: renamed from: j */
    private int f204023j = 0;

    /* JADX INFO: renamed from: p */
    private boolean f204029p = false;

    /* JADX INFO: renamed from: Q1 */
    private void m219493Q1(int i, int i2) {
        float f = (i * 1.0f) / this.f204017c;
        float f2 = (i2 * 1.0f) / this.f204018d;
        if (f > 0.5f || f2 > 0.5f) {
            this.f204023j = 0;
        } else {
            this.f204023j = 2;
        }
    }

    /* JADX INFO: renamed from: R1 */
    private void m219494R1(float f) {
        float f2 = this.f204018d;
        int i = (int) (f2 / f);
        float f3 = this.f204017c;
        int i2 = (int) (f * f3);
        float f4 = i;
        if (f4 < f3) {
            float f5 = ((f3 - f4) * 0.5f) / f3;
            m219495S1(f5, 1.0f - f5, 0.0f, 1.0f);
        } else {
            float f6 = ((f2 - i2) * 0.5f) / f2;
            m219495S1(0.0f, 1.0f, f6, 1.0f - f6);
        }
    }

    /* JADX INFO: renamed from: S1 */
    private void m219495S1(float f, float f2, float f3, float f4) {
        if (!this.f204029p) {
            this.f204024k = new FloatBuffer[4];
            this.f204025l = new float[8];
            this.f204026m = new float[8];
            this.f204027n = new float[8];
            this.f204028o = new float[8];
            this.f204029p = true;
        }
        if (this.f204029p) {
            float[] fArr = this.f204025l;
            fArr[0] = f;
            fArr[1] = f3;
            fArr[2] = f2;
            fArr[3] = f3;
            fArr[4] = f;
            fArr[5] = f4;
            fArr[6] = f2;
            fArr[7] = f4;
            FloatBuffer[] floatBufferArr = this.f204024k;
            floatBufferArr[0] = ch3.m109765a(floatBufferArr[0], fArr);
            float[] fArr2 = this.f204026m;
            fArr2[0] = f;
            fArr2[1] = f4;
            fArr2[2] = f;
            fArr2[3] = f3;
            fArr2[4] = f2;
            fArr2[5] = f4;
            fArr2[6] = f2;
            fArr2[7] = f3;
            FloatBuffer[] floatBufferArr2 = this.f204024k;
            floatBufferArr2[1] = ch3.m109765a(floatBufferArr2[1], fArr2);
            float[] fArr3 = this.f204027n;
            fArr3[0] = f2;
            fArr3[1] = f4;
            fArr3[2] = f;
            fArr3[3] = f4;
            fArr3[4] = f2;
            fArr3[5] = f3;
            fArr3[6] = f;
            fArr3[7] = f3;
            FloatBuffer[] floatBufferArr3 = this.f204024k;
            floatBufferArr3[2] = ch3.m109765a(floatBufferArr3[2], fArr3);
            float[] fArr4 = this.f204028o;
            fArr4[0] = f2;
            fArr4[1] = f3;
            fArr4[2] = f2;
            fArr4[3] = f4;
            fArr4[4] = f;
            fArr4[5] = f3;
            fArr4[6] = f;
            fArr4[7] = f4;
            FloatBuffer[] floatBufferArr4 = this.f204024k;
            floatBufferArr4[3] = ch3.m109765a(floatBufferArr4[3], fArr4);
        }
    }

    /* JADX INFO: renamed from: T1 */
    public void m219496T1(boolean z) {
        this.f204019e = z;
    }

    /* JADX INFO: renamed from: U1 */
    public void m219497U1(float f) {
        this.f204016b = f;
    }

    @Override // p153l.wej
    public void destroy() {
        super.destroy();
    }

    @Override // p153l.wej
    public void drawFrame() {
        if (this.texture_in == 0) {
            return;
        }
        m219493Q1(getWidth(), getHeight());
        if ((getHeight() * 1.0f) / getWidth() != this.f204015a) {
            m219494R1((getHeight() * 1.0f) / getWidth());
        } else {
            m219495S1(0.0f, 1.0f, 0.0f, 1.0f);
        }
        GLES20.glViewport(0, 0, getWidth(), getHeight());
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        GLES20.glClear(16640);
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
        if (this.f204019e) {
            GLES20.glFinish();
        }
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying vec2 xy_step;\nvarying float smooth; \nvoid main(){\nvec2 point = textureCoordinate; \nvec4 image_c = texture2D(inputImageTexture0,point); \nvec4 image = image_c;\nif (smooth >= 0.1) { \nvec4 image_lt=texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x,  xy_step.y), 0.0, 1.0)); \nvec4 image_lb=texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x, -xy_step.y), 0.0, 1.0)); \nvec4 image_rt=texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x,  xy_step.y), 0.0, 1.0)); \nvec4 image_rb=texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x, -xy_step.y), 0.0, 1.0)); \nvec4 image_l =texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x,     0.0), 0.0, 1.0)); \nvec4 image_r =texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x,     0.0), 0.0, 1.0)); \nvec4 image_t =texture2D(inputImageTexture0, clamp(point+vec2(    0.0,  xy_step.y), 0.0, 1.0)); \nvec4 image_b =texture2D(inputImageTexture0, clamp(point+vec2(    0.0, -xy_step.y), 0.0, 1.0)); \nimage = clamp(image_c*0.25+(image_lt+image_lb+image_rt+image_rb)*0.125+(image_l+image_t+image_b+image_r)*0.0625, 0.0, 1.0); \n} \ngl_FragColor = image;\n}\n";
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float widthStep; \nuniform float heightStep; \nuniform float smoothMode; \nvarying float smooth; \nvarying vec2 xy_step;\nvoid main() {\nsmooth = smoothMode; \n  textureCoordinate = inputTextureCoordinate;\nxy_step = vec2(widthStep, heightStep);\ngl_Position = position;\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        this.textureHandle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture0");
        this.positionHandle = GLES20.glGetAttribLocation(this.programHandle, "position");
        this.texCoordHandle = GLES20.glGetAttribLocation(this.programHandle, "inputTextureCoordinate");
        this.f204020f = GLES20.glGetUniformLocation(this.programHandle, "widthStep");
        this.f204021g = GLES20.glGetUniformLocation(this.programHandle, "heightStep");
        this.f204022i = GLES20.glGetUniformLocation(this.programHandle, "smoothMode");
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        super.initWithGLContext();
    }

    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        this.texture_in = i;
        setWidth(gfjVar.getWidth());
        setHeight(gfjVar.getHeight());
        if (this.curRotation % 2 == 1) {
            this.f204017c = gfjVar.getHeight();
            this.f204018d = gfjVar.getWidth();
            this.f204015a = gfjVar.getWidth() / gfjVar.getHeight();
        } else {
            this.f204017c = gfjVar.getWidth();
            this.f204018d = gfjVar.getHeight();
            this.f204015a = gfjVar.getHeight() / gfjVar.getWidth();
        }
        if (getClass().equals(zej.class)) {
            u6y.m194722F().m194736O();
        }
        onDrawFrame();
        lej lejVar = gfjVar.glFrameBuffer;
        if (lejVar != null) {
            lejVar.f131759h--;
        }
        gfjVar.unlockRenderBuffer();
    }

    @Override // p153l.wej
    public void passShaderValues() {
        int i = this.curRotation;
        this.renderVertices.position(0);
        float f = 1.0f / this.f204017c;
        float f2 = 1.0f / this.f204018d;
        GLES20.glUniform1f(this.f204020f, f);
        GLES20.glUniform1f(this.f204021g, f2);
        GLES20.glUniform1f(this.f204022i, this.f204023j / 10.0f);
        int i2 = i % 4;
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.f204024k[i2].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.f204024k[i2]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    @Override // p153l.wej
    public void setRenderSize(int i, int i2) {
        super.setRenderSize(i, i2);
    }
}
