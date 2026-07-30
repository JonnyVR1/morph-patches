package project.android.imageprocessing.ext;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import p003l.mcj;
import p003l.og3;
import p003l.ts2;

/* JADX INFO: renamed from: project.android.imageprocessing.ext.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1095a extends ts2 {

    /* JADX INFO: renamed from: b */
    private float f10700b;

    /* JADX INFO: renamed from: c */
    private float f10701c;

    /* JADX INFO: renamed from: i */
    private int f10706i;

    /* JADX INFO: renamed from: j */
    private int f10707j;

    /* JADX INFO: renamed from: k */
    private int f10708k;

    /* JADX INFO: renamed from: l */
    private int f10709l;

    /* JADX INFO: renamed from: m */
    private FloatBuffer[] f10710m;

    /* JADX INFO: renamed from: n */
    private float[] f10711n;

    /* JADX INFO: renamed from: o */
    private float[] f10712o;

    /* JADX INFO: renamed from: p */
    private float[] f10713p;

    /* JADX INFO: renamed from: q */
    private float[] f10714q;

    /* JADX INFO: renamed from: d */
    private int f10702d = 0;

    /* JADX INFO: renamed from: e */
    private boolean f10703e = true;

    /* JADX INFO: renamed from: f */
    private int f10704f = 0;

    /* JADX INFO: renamed from: g */
    private int f10705g = 1;

    /* JADX INFO: renamed from: s */
    private int f10716s = 0;

    /* JADX INFO: renamed from: t */
    private String f10717t = "";

    /* JADX INFO: renamed from: r */
    private boolean f10715r = false;

    /* JADX INFO: renamed from: a */
    private float f10699a = 1.3333334f;

    /* JADX INFO: renamed from: Q1 */
    private void m9740Q1(int i, int i2) {
        float f = (i * 1.0f) / this.f10700b;
        float f2 = (i2 * 1.0f) / this.f10701c;
        if (f > 0.5f || f2 > 0.5f) {
            this.f10704f = 0;
        } else {
            this.f10704f = 2;
        }
    }

    /* JADX INFO: renamed from: R1 */
    private void m9741R1() {
        int i;
        int i2;
        int width = getWidth();
        int height = getHeight();
        float f = this.f10700b;
        float f2 = this.f10701c;
        int i3 = (int) (height * ((f * 1.0f) / f2));
        int i4 = (int) (width * ((f2 * 1.0f) / f));
        if (i3 < width) {
            i = (width - i3) / 2;
            i4 = height;
            i2 = 0;
        } else if (i4 < height) {
            i2 = (height - i4) / 2;
            i3 = width;
            i = 0;
        } else {
            i3 = width;
            i4 = height;
            i = 0;
            i2 = 0;
        }
        GLES20.glViewport(i, i2, i3 + 1, i4);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.programHandle);
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
        disableDrawArray();
    }

    /* JADX INFO: renamed from: S1 */
    private void m9742S1(float f) {
        float f2 = this.f10701c;
        int i = (int) (f2 / f);
        float f3 = this.f10700b;
        int i2 = (int) (f * f3);
        float f4 = i;
        if (f4 < f3) {
            float f5 = ((f3 - f4) * 0.5f) / f3;
            m9743T1(f5, 1.0f - f5, 0.0f, 1.0f);
        } else {
            float f6 = ((f2 - i2) * 0.5f) / f2;
            m9743T1(0.0f, 1.0f, f6, 1.0f - f6);
        }
    }

    /* JADX INFO: renamed from: T1 */
    private void m9743T1(float f, float f2, float f3, float f4) {
        if (!this.f10715r) {
            this.f10710m = new FloatBuffer[4];
            this.f10711n = new float[8];
            this.f10712o = new float[8];
            this.f10713p = new float[8];
            this.f10714q = new float[8];
            this.f10715r = true;
        }
        if (this.f10715r) {
            float[] fArr = this.f10711n;
            fArr[0] = f;
            fArr[1] = f3;
            fArr[2] = f2;
            fArr[3] = f3;
            fArr[4] = f;
            fArr[5] = f4;
            fArr[6] = f2;
            fArr[7] = f4;
            FloatBuffer[] floatBufferArr = this.f10710m;
            floatBufferArr[0] = og3.m6707a(floatBufferArr[0], fArr);
            float[] fArr2 = this.f10712o;
            fArr2[0] = f;
            fArr2[1] = f4;
            fArr2[2] = f;
            fArr2[3] = f3;
            fArr2[4] = f2;
            fArr2[5] = f4;
            fArr2[6] = f2;
            fArr2[7] = f3;
            FloatBuffer[] floatBufferArr2 = this.f10710m;
            floatBufferArr2[1] = og3.m6707a(floatBufferArr2[1], fArr2);
            float[] fArr3 = this.f10713p;
            fArr3[0] = f2;
            fArr3[1] = f4;
            fArr3[2] = f;
            fArr3[3] = f4;
            fArr3[4] = f2;
            fArr3[5] = f3;
            fArr3[6] = f;
            fArr3[7] = f3;
            FloatBuffer[] floatBufferArr3 = this.f10710m;
            floatBufferArr3[2] = og3.m6707a(floatBufferArr3[2], fArr3);
            float[] fArr4 = this.f10714q;
            fArr4[0] = f2;
            fArr4[1] = f3;
            fArr4[2] = f2;
            fArr4[3] = f4;
            fArr4[4] = f;
            fArr4[5] = f3;
            fArr4[6] = f;
            fArr4[7] = f4;
            FloatBuffer[] floatBufferArr4 = this.f10710m;
            floatBufferArr4[3] = og3.m6707a(floatBufferArr4[3], fArr4);
        }
    }

    private void drawIndeed() {
        if (this.texture_in == 0) {
            return;
        }
        int i = this.f10705g;
        if (i == 1) {
            m9740Q1(getWidth(), getHeight());
            if ((getHeight() * 1.0f) / getWidth() != this.f10699a) {
                m9742S1((getHeight() * 1.0f) / getWidth());
            } else {
                m9742S1((getHeight() * 1.0f) / getWidth());
            }
        } else if (i == 2) {
            m9740Q1(getHeight(), getWidth());
            if ((getWidth() * 1.0f) / getHeight() != this.f10699a) {
                m9742S1((getWidth() * 1.0f) / getHeight());
            } else {
                m9742S1((getHeight() * 1.0f) / getWidth());
            }
        }
        GLES20.glViewport(0, 0, getWidth(), getHeight());
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClear(16640);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
        disableDrawArray();
    }

    /* JADX INFO: renamed from: U1 */
    public void m9744U1(int i) {
        this.f10716s = i;
    }

    /* JADX INFO: renamed from: V1 */
    public void m9745V1(String str) {
        this.f10717t = str;
    }

    /* JADX INFO: renamed from: W1 */
    public void m9746W1(int i) {
        this.f10705g = i;
    }

    @Override // p003l.mcj
    public void drawSub() {
        if (this.f10716s == 0) {
            drawIndeed();
        } else {
            m9741R1();
        }
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return this.f10716s == 1 ? super.getFragmentShader() : "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying vec2 xy_step;\nvarying float pos; \nvarying float smooth; \nvoid main(){\nvec2 point = textureCoordinate; \nvec4 image_c = texture2D(inputImageTexture0,point); \nvec4 image = image_c;\nif (smooth >= 0.1) { \nvec4 image_lt=texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x,  xy_step.y), 0.0, 1.0)); \nvec4 image_lb=texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x, -xy_step.y), 0.0, 1.0)); \nvec4 image_rt=texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x,  xy_step.y), 0.0, 1.0)); \nvec4 image_rb=texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x, -xy_step.y), 0.0, 1.0)); \nvec4 image_l =texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x,     0.0), 0.0, 1.0)); \nvec4 image_r =texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x,     0.0), 0.0, 1.0)); \nvec4 image_t =texture2D(inputImageTexture0, clamp(point+vec2(    0.0,  xy_step.y), 0.0, 1.0)); \nvec4 image_b =texture2D(inputImageTexture0, clamp(point+vec2(    0.0, -xy_step.y), 0.0, 1.0)); \nimage = clamp(image_c*0.25+(image_lt+image_lb+image_rt+image_rb)*0.125+(image_l+image_t+image_b+image_r)*0.0625, 0.0, 1.0); \n} \ngl_FragColor = image;\n}\n";
    }

    @Override // p003l.ccj
    public String getVertexShader() {
        return this.f10716s == 1 ? super.getVertexShader() : "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float widthStep; \nuniform float heightStep; \nuniform float displayPos; \nuniform float smoothMode; \nvarying float smooth; \nvarying float pos; \nvarying vec2 xy_step;\nvoid main() {\npos = displayPos; \nsmooth = smoothMode; \n  textureCoordinate = inputTextureCoordinate;\nxy_step = vec2(widthStep, heightStep);\ngl_Position = position;\n}\n";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        if (this.f10716s == 1) {
            super.initShaderHandles();
            return;
        }
        this.textureHandle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture0");
        this.positionHandle = GLES20.glGetAttribLocation(this.programHandle, "position");
        this.texCoordHandle = GLES20.glGetAttribLocation(this.programHandle, "inputTextureCoordinate");
        this.f10706i = GLES20.glGetUniformLocation(this.programHandle, "widthStep");
        this.f10707j = GLES20.glGetUniformLocation(this.programHandle, "heightStep");
        this.f10708k = GLES20.glGetUniformLocation(this.programHandle, "displayPos");
        this.f10709l = GLES20.glGetUniformLocation(this.programHandle, "smoothMode");
    }

    @Override // p003l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
    }

    @Override // p003l.ts2, p003l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (z) {
            markAsDirty();
        }
        this.inputFrameBuffer = mcjVar.glFrameBuffer;
        this.texture_in = i;
        this.f10700b = mcjVar.getWidth();
        float height = mcjVar.getHeight();
        this.f10701c = height;
        this.f10699a = height / (this.f10700b * 1.0f);
        onDrawFrame();
        mcjVar.unlockRenderBuffer();
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        if (this.f10716s == 1) {
            super.passShaderValues();
            return;
        }
        int i = this.curRotation;
        this.renderVertices.position(0);
        boolean z = this.f10703e;
        int i2 = this.f10702d;
        if (z) {
            this.f10702d = i2 + 1;
        } else {
            this.f10702d = i2 - 1;
        }
        int i3 = this.f10702d;
        float f = this.f10700b;
        if (i3 >= ((int) f)) {
            this.f10703e = false;
        } else if (i3 <= 0) {
            this.f10703e = true;
        }
        float f2 = 1.0f / this.f10701c;
        GLES20.glUniform1f(this.f10706i, 1.0f / f);
        GLES20.glUniform1f(this.f10707j, f2);
        GLES20.glUniform1f(this.f10708k, (this.f10702d * 1.0f) / this.f10700b);
        GLES20.glUniform1f(this.f10709l, this.f10704f / 10.0f);
        int i4 = this.f10705g;
        if (i4 != 1 && i4 == 2) {
            i++;
        }
        int i5 = i % 4;
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.f10710m[i5].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.f10710m[i5]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }
}
