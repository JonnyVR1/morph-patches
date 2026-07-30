package com.tencent.liteav.renderer;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.renderer.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14183c {

    /* JADX INFO: renamed from: a */
    private final float[] f59748a;

    /* JADX INFO: renamed from: b */
    private final float[] f59749b;

    /* JADX INFO: renamed from: c */
    private FloatBuffer f59750c;

    /* JADX INFO: renamed from: f */
    private int f59753f;

    /* JADX INFO: renamed from: h */
    private int f59755h;

    /* JADX INFO: renamed from: i */
    private int f59756i;

    /* JADX INFO: renamed from: j */
    private int f59757j;

    /* JADX INFO: renamed from: k */
    private int f59758k;

    /* JADX INFO: renamed from: m */
    private boolean f59760m;

    /* JADX INFO: renamed from: d */
    private float[] f59751d = new float[16];

    /* JADX INFO: renamed from: e */
    private float[] f59752e = new float[16];

    /* JADX INFO: renamed from: g */
    private int f59754g = -12345;

    /* JADX INFO: renamed from: l */
    private boolean f59759l = false;

    /* JADX INFO: renamed from: n */
    private boolean f59761n = false;

    /* JADX INFO: renamed from: o */
    private int f59762o = -1;

    /* JADX INFO: renamed from: p */
    private int f59763p = 0;

    /* JADX INFO: renamed from: q */
    private int f59764q = 0;

    public C14183c(boolean z) {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.f59748a = fArr;
        float[] fArr2 = {1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f};
        this.f59749b = fArr2;
        this.f59760m = z;
        if (z) {
            FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f59750c = floatBufferAsFloatBuffer;
            floatBufferAsFloatBuffer.put(fArr).position(0);
        } else {
            FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f59750c = floatBufferAsFloatBuffer2;
            floatBufferAsFloatBuffer2.put(fArr2).position(0);
        }
        Matrix.setIdentityM(this.f59752e, 0);
    }

    /* JADX INFO: renamed from: b */
    private void m83881b(int i, int i2) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        if (this.f59759l) {
            this.f59759l = false;
            return;
        }
        GLES20.glUseProgram(this.f59753f);
        m83887a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(i, i2);
        this.f59750c.position(0);
        GLES20.glVertexAttribPointer(this.f59757j, 3, 5126, false, 20, (Buffer) this.f59750c);
        m83887a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f59757j);
        m83887a("glEnableVertexAttribArray maPositionHandle");
        this.f59750c.position(3);
        GLES20.glVertexAttribPointer(this.f59758k, 2, 5126, false, 20, (Buffer) this.f59750c);
        m83887a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f59758k);
        m83887a("glEnableVertexAttribArray maTextureHandle");
        Matrix.setIdentityM(this.f59751d, 0);
        GLES20.glUniformMatrix4fv(this.f59755h, 1, false, this.f59751d, 0);
        int i3 = this.f59763p;
        if (i3 % 8 != 0) {
            Matrix.scaleM(this.f59752e, 0, ((i3 - 1) * 1.0f) / (((i3 + 7) / 8) * 8), 1.0f, 1.0f);
        }
        int i4 = this.f59764q;
        if (i4 % 8 != 0) {
            Matrix.scaleM(this.f59752e, 0, 1.0f, ((i4 - 1) * 1.0f) / (((i4 + 7) / 8) * 8), 1.0f);
        }
        GLES20.glUniformMatrix4fv(this.f59756i, 1, false, this.f59752e, 0);
        GLES20.glDrawArrays(5, 0, 4);
        m83887a("glDrawArrays");
        GLES20.glFinish();
    }

    /* JADX INFO: renamed from: d */
    private void m83882d() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.f59754g = i;
        GLES20.glBindTexture(36197, i);
        m83887a("glBindTexture mTextureID");
    }

    /* JADX INFO: renamed from: a */
    public void m83885a(int i, boolean z, int i2) {
        if (this.f59761n != z || this.f59762o != i2) {
            this.f59761n = z;
            this.f59762o = i2;
            float[] fArr = new float[20];
            for (int i3 = 0; i3 < 20; i3++) {
                fArr[i3] = this.f59749b[i3];
            }
            if (this.f59761n) {
                fArr[0] = -fArr[0];
                fArr[5] = -fArr[5];
                fArr[10] = -fArr[10];
                fArr[15] = -fArr[15];
            }
            int i4 = i2 / 90;
            for (int i5 = 0; i5 < i4; i5++) {
                float f = fArr[3];
                float f2 = fArr[4];
                fArr[3] = fArr[8];
                fArr[4] = fArr[9];
                fArr[8] = fArr[18];
                fArr[9] = fArr[19];
                fArr[18] = fArr[13];
                fArr[19] = fArr[14];
                fArr[13] = f;
                fArr[14] = f2;
            }
            this.f59750c.clear();
            this.f59750c.put(fArr).position(0);
        }
        m83881b(3553, i);
    }

    /* JADX INFO: renamed from: c */
    public void m83889c() {
        int i = this.f59753f;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
        }
        GLES20.glDeleteTextures(1, new int[]{this.f59754g}, 0);
        this.f59754g = -1;
    }

    /* JADX INFO: renamed from: a */
    public void m83886a(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null) {
            return;
        }
        m83887a("onDrawFrame start");
        surfaceTexture.getTransformMatrix(this.f59752e);
        m83881b(36197, this.f59754g);
    }

    /* JADX INFO: renamed from: a */
    public void m83884a(int i, int i2) {
        this.f59763p = i;
        this.f59764q = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m83883a() {
        return this.f59754g;
    }

    /* JADX INFO: renamed from: a */
    private int m83879a(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        m83887a("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        TXCLog.m82966e("TXCOesTextureRender", "Could not compile shader " + i + ":");
        StringBuilder sb = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        TXCLog.m82966e("TXCOesTextureRender", sb.toString());
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private int m83880a(String str, String str2) {
        int iM83879a;
        int iM83879a2 = m83879a(35633, str);
        if (iM83879a2 == 0 || (iM83879a = m83879a(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        m83887a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            TXCLog.m82966e("TXCOesTextureRender", "Could not create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iM83879a2);
        m83887a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iM83879a);
        m83887a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        TXCLog.m82966e("TXCOesTextureRender", "Could not link program: ");
        TXCLog.m82966e("TXCOesTextureRender", GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public void m83887a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            TXCLog.m82966e("TXCOesTextureRender", str + ": glError " + iGlGetError);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83888b() {
        if (this.f59760m) {
            this.f59753f = m83880a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        } else {
            this.f59753f = m83880a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "varying highp vec2 vTextureCoord;\n \nuniform sampler2D sTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(sTexture, vTextureCoord);\n}");
        }
        int i = this.f59753f;
        if (i == 0) {
            TXCLog.m82966e("TXCOesTextureRender", "failed creating program");
            return;
        }
        this.f59757j = GLES20.glGetAttribLocation(i, "aPosition");
        m83887a("glGetAttribLocation aPosition");
        if (this.f59757j == -1) {
            TXCLog.m82966e("TXCOesTextureRender", "Could not get attrib location for aPosition");
            return;
        }
        this.f59758k = GLES20.glGetAttribLocation(this.f59753f, "aTextureCoord");
        m83887a("glGetAttribLocation aTextureCoord");
        if (this.f59758k == -1) {
            TXCLog.m82966e("TXCOesTextureRender", "Could not get attrib location for aTextureCoord");
            return;
        }
        this.f59755h = GLES20.glGetUniformLocation(this.f59753f, "uMVPMatrix");
        m83887a("glGetUniformLocation uMVPMatrix");
        if (this.f59755h == -1) {
            TXCLog.m82966e("TXCOesTextureRender", "Could not get attrib location for uMVPMatrix");
            return;
        }
        this.f59756i = GLES20.glGetUniformLocation(this.f59753f, "uSTMatrix");
        m83887a("glGetUniformLocation uSTMatrix");
        if (this.f59756i == -1) {
            TXCLog.m82966e("TXCOesTextureRender", "Could not get attrib location for uSTMatrix");
            return;
        }
        if (this.f59760m) {
            m83882d();
        }
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m83887a("glTexParameter");
    }
}
