package project.android.imageprocessing.ext;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import p149l.mcj;
import p149l.og3;
import p149l.ts2;

/* JADX INFO: renamed from: project.android.imageprocessing.ext.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22302a extends ts2 {

    /* JADX INFO: renamed from: b */
    private float f207075b;

    /* JADX INFO: renamed from: c */
    private float f207076c;

    /* JADX INFO: renamed from: i */
    private int f207081i;

    /* JADX INFO: renamed from: j */
    private int f207082j;

    /* JADX INFO: renamed from: k */
    private int f207083k;

    /* JADX INFO: renamed from: l */
    private int f207084l;

    /* JADX INFO: renamed from: m */
    private FloatBuffer[] f207085m;

    /* JADX INFO: renamed from: n */
    private float[] f207086n;

    /* JADX INFO: renamed from: o */
    private float[] f207087o;

    /* JADX INFO: renamed from: p */
    private float[] f207088p;

    /* JADX INFO: renamed from: q */
    private float[] f207089q;

    /* JADX INFO: renamed from: d */
    private int f207077d = 0;

    /* JADX INFO: renamed from: e */
    private boolean f207078e = true;

    /* JADX INFO: renamed from: f */
    private int f207079f = 0;

    /* JADX INFO: renamed from: g */
    private int f207080g = 1;

    /* JADX INFO: renamed from: s */
    private int f207091s = 0;

    /* JADX INFO: renamed from: t */
    private String f207092t = "";

    /* JADX INFO: renamed from: r */
    private boolean f207090r = false;

    /* JADX INFO: renamed from: a */
    private float f207074a = 1.3333334f;

    /* JADX INFO: renamed from: Q1 */
    private void m221283Q1(int i, int i2) {
        float f = (i * 1.0f) / this.f207075b;
        float f2 = (i2 * 1.0f) / this.f207076c;
        if (f > 0.5f || f2 > 0.5f) {
            this.f207079f = 0;
        } else {
            this.f207079f = 2;
        }
    }

    /* JADX INFO: renamed from: R1 */
    private void m221284R1() {
        int i;
        int i2;
        int width = getWidth();
        int height = getHeight();
        float f = this.f207075b;
        float f2 = this.f207076c;
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
    private void m221285S1(float f) {
        float f2 = this.f207076c;
        int i = (int) (f2 / f);
        float f3 = this.f207075b;
        int i2 = (int) (f * f3);
        float f4 = i;
        if (f4 < f3) {
            float f5 = ((f3 - f4) * 0.5f) / f3;
            m221286T1(f5, 1.0f - f5, 0.0f, 1.0f);
        } else {
            float f6 = ((f2 - i2) * 0.5f) / f2;
            m221286T1(0.0f, 1.0f, f6, 1.0f - f6);
        }
    }

    /* JADX INFO: renamed from: T1 */
    private void m221286T1(float f, float f2, float f3, float f4) {
        if (!this.f207090r) {
            this.f207085m = new FloatBuffer[4];
            this.f207086n = new float[8];
            this.f207087o = new float[8];
            this.f207088p = new float[8];
            this.f207089q = new float[8];
            this.f207090r = true;
        }
        if (this.f207090r) {
            float[] fArr = this.f207086n;
            fArr[0] = f;
            fArr[1] = f3;
            fArr[2] = f2;
            fArr[3] = f3;
            fArr[4] = f;
            fArr[5] = f4;
            fArr[6] = f2;
            fArr[7] = f4;
            FloatBuffer[] floatBufferArr = this.f207085m;
            floatBufferArr[0] = og3.m164159a(floatBufferArr[0], fArr);
            float[] fArr2 = this.f207087o;
            fArr2[0] = f;
            fArr2[1] = f4;
            fArr2[2] = f;
            fArr2[3] = f3;
            fArr2[4] = f2;
            fArr2[5] = f4;
            fArr2[6] = f2;
            fArr2[7] = f3;
            FloatBuffer[] floatBufferArr2 = this.f207085m;
            floatBufferArr2[1] = og3.m164159a(floatBufferArr2[1], fArr2);
            float[] fArr3 = this.f207088p;
            fArr3[0] = f2;
            fArr3[1] = f4;
            fArr3[2] = f;
            fArr3[3] = f4;
            fArr3[4] = f2;
            fArr3[5] = f3;
            fArr3[6] = f;
            fArr3[7] = f3;
            FloatBuffer[] floatBufferArr3 = this.f207085m;
            floatBufferArr3[2] = og3.m164159a(floatBufferArr3[2], fArr3);
            float[] fArr4 = this.f207089q;
            fArr4[0] = f2;
            fArr4[1] = f3;
            fArr4[2] = f2;
            fArr4[3] = f4;
            fArr4[4] = f;
            fArr4[5] = f3;
            fArr4[6] = f;
            fArr4[7] = f4;
            FloatBuffer[] floatBufferArr4 = this.f207085m;
            floatBufferArr4[3] = og3.m164159a(floatBufferArr4[3], fArr4);
        }
    }

    private void drawIndeed() {
        if (this.texture_in == 0) {
            return;
        }
        int i = this.f207080g;
        if (i == 1) {
            m221283Q1(getWidth(), getHeight());
            if ((getHeight() * 1.0f) / getWidth() != this.f207074a) {
                m221285S1((getHeight() * 1.0f) / getWidth());
            } else {
                m221285S1((getHeight() * 1.0f) / getWidth());
            }
        } else if (i == 2) {
            m221283Q1(getHeight(), getWidth());
            if ((getWidth() * 1.0f) / getHeight() != this.f207074a) {
                m221285S1((getWidth() * 1.0f) / getHeight());
            } else {
                m221285S1((getHeight() * 1.0f) / getWidth());
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
    public void m221287U1(int i) {
        this.f207091s = i;
    }

    /* JADX INFO: renamed from: V1 */
    public void m221288V1(String str) {
        this.f207092t = str;
    }

    /* JADX INFO: renamed from: W1 */
    public void m221289W1(int i) {
        this.f207080g = i;
    }

    @Override // p149l.mcj
    public void drawSub() {
        if (this.f207091s == 0) {
            drawIndeed();
        } else {
            m221284R1();
        }
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return this.f207091s == 1 ? super.getFragmentShader() : "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying vec2 xy_step;\nvarying float pos; \nvarying float smooth; \nvoid main(){\nvec2 point = textureCoordinate; \nvec4 image_c = texture2D(inputImageTexture0,point); \nvec4 image = image_c;\nif (smooth >= 0.1) { \nvec4 image_lt=texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x,  xy_step.y), 0.0, 1.0)); \nvec4 image_lb=texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x, -xy_step.y), 0.0, 1.0)); \nvec4 image_rt=texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x,  xy_step.y), 0.0, 1.0)); \nvec4 image_rb=texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x, -xy_step.y), 0.0, 1.0)); \nvec4 image_l =texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x,     0.0), 0.0, 1.0)); \nvec4 image_r =texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x,     0.0), 0.0, 1.0)); \nvec4 image_t =texture2D(inputImageTexture0, clamp(point+vec2(    0.0,  xy_step.y), 0.0, 1.0)); \nvec4 image_b =texture2D(inputImageTexture0, clamp(point+vec2(    0.0, -xy_step.y), 0.0, 1.0)); \nimage = clamp(image_c*0.25+(image_lt+image_lb+image_rt+image_rb)*0.125+(image_l+image_t+image_b+image_r)*0.0625, 0.0, 1.0); \n} \ngl_FragColor = image;\n}\n";
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return this.f207091s == 1 ? super.getVertexShader() : "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float widthStep; \nuniform float heightStep; \nuniform float displayPos; \nuniform float smoothMode; \nvarying float smooth; \nvarying float pos; \nvarying vec2 xy_step;\nvoid main() {\npos = displayPos; \nsmooth = smoothMode; \n  textureCoordinate = inputTextureCoordinate;\nxy_step = vec2(widthStep, heightStep);\ngl_Position = position;\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        if (this.f207091s == 1) {
            super.initShaderHandles();
            return;
        }
        this.textureHandle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture0");
        this.positionHandle = GLES20.glGetAttribLocation(this.programHandle, "position");
        this.texCoordHandle = GLES20.glGetAttribLocation(this.programHandle, "inputTextureCoordinate");
        this.f207081i = GLES20.glGetUniformLocation(this.programHandle, "widthStep");
        this.f207082j = GLES20.glGetUniformLocation(this.programHandle, "heightStep");
        this.f207083k = GLES20.glGetUniformLocation(this.programHandle, "displayPos");
        this.f207084l = GLES20.glGetUniformLocation(this.programHandle, "smoothMode");
    }

    @Override // p149l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
    }

    @Override // p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (z) {
            markAsDirty();
        }
        this.inputFrameBuffer = mcjVar.glFrameBuffer;
        this.texture_in = i;
        this.f207075b = mcjVar.getWidth();
        float height = mcjVar.getHeight();
        this.f207076c = height;
        this.f207074a = height / (this.f207075b * 1.0f);
        onDrawFrame();
        mcjVar.unlockRenderBuffer();
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        if (this.f207091s == 1) {
            super.passShaderValues();
            return;
        }
        int i = this.curRotation;
        this.renderVertices.position(0);
        boolean z = this.f207078e;
        int i2 = this.f207077d;
        if (z) {
            this.f207077d = i2 + 1;
        } else {
            this.f207077d = i2 - 1;
        }
        int i3 = this.f207077d;
        float f = this.f207075b;
        if (i3 >= ((int) f)) {
            this.f207078e = false;
        } else if (i3 <= 0) {
            this.f207078e = true;
        }
        float f2 = 1.0f / this.f207076c;
        GLES20.glUniform1f(this.f207081i, 1.0f / f);
        GLES20.glUniform1f(this.f207082j, f2);
        GLES20.glUniform1f(this.f207083k, (this.f207077d * 1.0f) / this.f207075b);
        GLES20.glUniform1f(this.f207084l, this.f207079f / 10.0f);
        int i4 = this.f207080g;
        if (i4 != 1 && i4 == 2) {
            i++;
        }
        int i5 = i % 4;
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.f207085m[i5].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.f207085m[i5]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }
}
