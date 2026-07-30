package project.android.imageprocessing.ext;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import p153l.ch3;
import p153l.gfj;
import p153l.jt2;

/* JADX INFO: renamed from: project.android.imageprocessing.ext.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22417a extends jt2 {

    /* JADX INFO: renamed from: b */
    private float f207997b;

    /* JADX INFO: renamed from: c */
    private float f207998c;

    /* JADX INFO: renamed from: i */
    private int f208003i;

    /* JADX INFO: renamed from: j */
    private int f208004j;

    /* JADX INFO: renamed from: k */
    private int f208005k;

    /* JADX INFO: renamed from: l */
    private int f208006l;

    /* JADX INFO: renamed from: m */
    private FloatBuffer[] f208007m;

    /* JADX INFO: renamed from: n */
    private float[] f208008n;

    /* JADX INFO: renamed from: o */
    private float[] f208009o;

    /* JADX INFO: renamed from: p */
    private float[] f208010p;

    /* JADX INFO: renamed from: q */
    private float[] f208011q;

    /* JADX INFO: renamed from: d */
    private int f207999d = 0;

    /* JADX INFO: renamed from: e */
    private boolean f208000e = true;

    /* JADX INFO: renamed from: f */
    private int f208001f = 0;

    /* JADX INFO: renamed from: g */
    private int f208002g = 1;

    /* JADX INFO: renamed from: s */
    private int f208013s = 0;

    /* JADX INFO: renamed from: t */
    private String f208014t = "";

    /* JADX INFO: renamed from: r */
    private boolean f208012r = false;

    /* JADX INFO: renamed from: a */
    private float f207996a = 1.3333334f;

    /* JADX INFO: renamed from: Q1 */
    private void m222529Q1(int i, int i2) {
        float f = (i * 1.0f) / this.f207997b;
        float f2 = (i2 * 1.0f) / this.f207998c;
        if (f > 0.5f || f2 > 0.5f) {
            this.f208001f = 0;
        } else {
            this.f208001f = 2;
        }
    }

    /* JADX INFO: renamed from: R1 */
    private void m222530R1() {
        int i;
        int i2;
        int width = getWidth();
        int height = getHeight();
        float f = this.f207997b;
        float f2 = this.f207998c;
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
    private void m222531S1(float f) {
        float f2 = this.f207998c;
        int i = (int) (f2 / f);
        float f3 = this.f207997b;
        int i2 = (int) (f * f3);
        float f4 = i;
        if (f4 < f3) {
            float f5 = ((f3 - f4) * 0.5f) / f3;
            m222532T1(f5, 1.0f - f5, 0.0f, 1.0f);
        } else {
            float f6 = ((f2 - i2) * 0.5f) / f2;
            m222532T1(0.0f, 1.0f, f6, 1.0f - f6);
        }
    }

    /* JADX INFO: renamed from: T1 */
    private void m222532T1(float f, float f2, float f3, float f4) {
        if (!this.f208012r) {
            this.f208007m = new FloatBuffer[4];
            this.f208008n = new float[8];
            this.f208009o = new float[8];
            this.f208010p = new float[8];
            this.f208011q = new float[8];
            this.f208012r = true;
        }
        if (this.f208012r) {
            float[] fArr = this.f208008n;
            fArr[0] = f;
            fArr[1] = f3;
            fArr[2] = f2;
            fArr[3] = f3;
            fArr[4] = f;
            fArr[5] = f4;
            fArr[6] = f2;
            fArr[7] = f4;
            FloatBuffer[] floatBufferArr = this.f208007m;
            floatBufferArr[0] = ch3.m109765a(floatBufferArr[0], fArr);
            float[] fArr2 = this.f208009o;
            fArr2[0] = f;
            fArr2[1] = f4;
            fArr2[2] = f;
            fArr2[3] = f3;
            fArr2[4] = f2;
            fArr2[5] = f4;
            fArr2[6] = f2;
            fArr2[7] = f3;
            FloatBuffer[] floatBufferArr2 = this.f208007m;
            floatBufferArr2[1] = ch3.m109765a(floatBufferArr2[1], fArr2);
            float[] fArr3 = this.f208010p;
            fArr3[0] = f2;
            fArr3[1] = f4;
            fArr3[2] = f;
            fArr3[3] = f4;
            fArr3[4] = f2;
            fArr3[5] = f3;
            fArr3[6] = f;
            fArr3[7] = f3;
            FloatBuffer[] floatBufferArr3 = this.f208007m;
            floatBufferArr3[2] = ch3.m109765a(floatBufferArr3[2], fArr3);
            float[] fArr4 = this.f208011q;
            fArr4[0] = f2;
            fArr4[1] = f3;
            fArr4[2] = f2;
            fArr4[3] = f4;
            fArr4[4] = f;
            fArr4[5] = f3;
            fArr4[6] = f;
            fArr4[7] = f4;
            FloatBuffer[] floatBufferArr4 = this.f208007m;
            floatBufferArr4[3] = ch3.m109765a(floatBufferArr4[3], fArr4);
        }
    }

    private void drawIndeed() {
        if (this.texture_in == 0) {
            return;
        }
        int i = this.f208002g;
        if (i == 1) {
            m222529Q1(getWidth(), getHeight());
            if ((getHeight() * 1.0f) / getWidth() != this.f207996a) {
                m222531S1((getHeight() * 1.0f) / getWidth());
            } else {
                m222531S1((getHeight() * 1.0f) / getWidth());
            }
        } else if (i == 2) {
            m222529Q1(getHeight(), getWidth());
            if ((getWidth() * 1.0f) / getHeight() != this.f207996a) {
                m222531S1((getWidth() * 1.0f) / getHeight());
            } else {
                m222531S1((getHeight() * 1.0f) / getWidth());
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
    public void m222533U1(int i) {
        this.f208013s = i;
    }

    /* JADX INFO: renamed from: V1 */
    public void m222534V1(String str) {
        this.f208014t = str;
    }

    /* JADX INFO: renamed from: W1 */
    public void m222535W1(int i) {
        this.f208002g = i;
    }

    @Override // p153l.gfj
    public void drawSub() {
        if (this.f208013s == 0) {
            drawIndeed();
        } else {
            m222530R1();
        }
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return this.f208013s == 1 ? super.getFragmentShader() : "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying vec2 xy_step;\nvarying float pos; \nvarying float smooth; \nvoid main(){\nvec2 point = textureCoordinate; \nvec4 image_c = texture2D(inputImageTexture0,point); \nvec4 image = image_c;\nif (smooth >= 0.1) { \nvec4 image_lt=texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x,  xy_step.y), 0.0, 1.0)); \nvec4 image_lb=texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x, -xy_step.y), 0.0, 1.0)); \nvec4 image_rt=texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x,  xy_step.y), 0.0, 1.0)); \nvec4 image_rb=texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x, -xy_step.y), 0.0, 1.0)); \nvec4 image_l =texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x,     0.0), 0.0, 1.0)); \nvec4 image_r =texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x,     0.0), 0.0, 1.0)); \nvec4 image_t =texture2D(inputImageTexture0, clamp(point+vec2(    0.0,  xy_step.y), 0.0, 1.0)); \nvec4 image_b =texture2D(inputImageTexture0, clamp(point+vec2(    0.0, -xy_step.y), 0.0, 1.0)); \nimage = clamp(image_c*0.25+(image_lt+image_lb+image_rt+image_rb)*0.125+(image_l+image_t+image_b+image_r)*0.0625, 0.0, 1.0); \n} \ngl_FragColor = image;\n}\n";
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return this.f208013s == 1 ? super.getVertexShader() : "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float widthStep; \nuniform float heightStep; \nuniform float displayPos; \nuniform float smoothMode; \nvarying float smooth; \nvarying float pos; \nvarying vec2 xy_step;\nvoid main() {\npos = displayPos; \nsmooth = smoothMode; \n  textureCoordinate = inputTextureCoordinate;\nxy_step = vec2(widthStep, heightStep);\ngl_Position = position;\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        if (this.f208013s == 1) {
            super.initShaderHandles();
            return;
        }
        this.textureHandle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture0");
        this.positionHandle = GLES20.glGetAttribLocation(this.programHandle, "position");
        this.texCoordHandle = GLES20.glGetAttribLocation(this.programHandle, "inputTextureCoordinate");
        this.f208003i = GLES20.glGetUniformLocation(this.programHandle, "widthStep");
        this.f208004j = GLES20.glGetUniformLocation(this.programHandle, "heightStep");
        this.f208005k = GLES20.glGetUniformLocation(this.programHandle, "displayPos");
        this.f208006l = GLES20.glGetUniformLocation(this.programHandle, "smoothMode");
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        super.initWithGLContext();
    }

    @Override // p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        if (z) {
            markAsDirty();
        }
        this.inputFrameBuffer = gfjVar.glFrameBuffer;
        this.texture_in = i;
        this.f207997b = gfjVar.getWidth();
        float height = gfjVar.getHeight();
        this.f207998c = height;
        this.f207996a = height / (this.f207997b * 1.0f);
        onDrawFrame();
        gfjVar.unlockRenderBuffer();
    }

    @Override // p153l.wej
    public void passShaderValues() {
        if (this.f208013s == 1) {
            super.passShaderValues();
            return;
        }
        int i = this.curRotation;
        this.renderVertices.position(0);
        boolean z = this.f208000e;
        int i2 = this.f207999d;
        if (z) {
            this.f207999d = i2 + 1;
        } else {
            this.f207999d = i2 - 1;
        }
        int i3 = this.f207999d;
        float f = this.f207997b;
        if (i3 >= ((int) f)) {
            this.f208000e = false;
        } else if (i3 <= 0) {
            this.f208000e = true;
        }
        float f2 = 1.0f / this.f207998c;
        GLES20.glUniform1f(this.f208003i, 1.0f / f);
        GLES20.glUniform1f(this.f208004j, f2);
        GLES20.glUniform1f(this.f208005k, (this.f207999d * 1.0f) / this.f207997b);
        GLES20.glUniform1f(this.f208006l, this.f208001f / 10.0f);
        int i4 = this.f208002g;
        if (i4 != 1 && i4 == 2) {
            i++;
        }
        int i5 = i % 4;
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.f208007m[i5].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.f208007m[i5]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }
}
