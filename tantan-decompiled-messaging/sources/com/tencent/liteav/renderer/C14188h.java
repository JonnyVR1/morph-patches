package com.tencent.liteav.renderer;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.renderer.h */
/* JADX INFO: loaded from: classes2.dex */
public class C14188h {

    /* JADX INFO: renamed from: a */
    public static int f59836a = 1;

    /* JADX INFO: renamed from: b */
    public static int f59837b = 2;

    /* JADX INFO: renamed from: o */
    private boolean f59850o;

    /* JADX INFO: renamed from: p */
    private final float[] f59851p;

    /* JADX INFO: renamed from: q */
    private FloatBuffer f59852q;

    /* JADX INFO: renamed from: t */
    private int f59855t;

    /* JADX INFO: renamed from: w */
    private int f59858w;

    /* JADX INFO: renamed from: x */
    private int f59859x;

    /* JADX INFO: renamed from: y */
    private int f59860y;

    /* JADX INFO: renamed from: z */
    private int f59861z;

    /* JADX INFO: renamed from: c */
    private int f59838c = 0;

    /* JADX INFO: renamed from: d */
    private int f59839d = 0;

    /* JADX INFO: renamed from: e */
    private int f59840e = 0;

    /* JADX INFO: renamed from: f */
    private int f59841f = 0;

    /* JADX INFO: renamed from: g */
    private int f59842g = f59837b;

    /* JADX INFO: renamed from: h */
    private int f59843h = 0;

    /* JADX INFO: renamed from: i */
    private boolean f59844i = false;

    /* JADX INFO: renamed from: j */
    private float[] f59845j = new float[16];

    /* JADX INFO: renamed from: k */
    private float[] f59846k = new float[16];

    /* JADX INFO: renamed from: l */
    private float f59847l = 1.0f;

    /* JADX INFO: renamed from: m */
    private float f59848m = 1.0f;

    /* JADX INFO: renamed from: n */
    private boolean f59849n = false;

    /* JADX INFO: renamed from: r */
    private float[] f59853r = new float[16];

    /* JADX INFO: renamed from: s */
    private float[] f59854s = new float[16];

    /* JADX INFO: renamed from: u */
    private int f59856u = -12345;

    /* JADX INFO: renamed from: v */
    private int f59857v = -12345;

    public C14188h(Boolean bool) {
        this.f59850o = true;
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.f59851p = fArr;
        this.f59850o = bool.booleanValue();
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f59852q = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        Matrix.setIdentityM(this.f59854s, 0);
    }

    /* JADX INFO: renamed from: d */
    private void m83942d() {
        if (this.f59849n) {
            TXCLog.m82969i("TXTweenFilter", "reloadFrameBuffer. size = " + this.f59838c + "*" + this.f59839d);
            m83943e();
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glGenFramebuffers(1, iArr2, 0);
            this.f59856u = iArr[0];
            this.f59857v = iArr2[0];
            TXCLog.m82964d("TXTweenFilter", "frameBuffer id = " + this.f59857v + ", texture id = " + this.f59856u);
            GLES20.glBindTexture(3553, this.f59856u);
            m83940a("glBindTexture mFrameBufferTextureID");
            GLES20.glTexImage2D(3553, 0, 6408, this.f59838c, this.f59839d, 0, 6408, 5121, null);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            m83940a("glTexParameter");
            GLES20.glBindFramebuffer(36160, this.f59857v);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f59856u, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
            this.f59849n = false;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m83943e() {
        int i = this.f59857v;
        if (i != -12345) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.f59857v = -12345;
        }
        int i2 = this.f59856u;
        if (i2 != -12345) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.f59856u = -12345;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83945a(int i, int i2) {
        if (i == this.f59838c && i2 == this.f59839d) {
            return;
        }
        TXCLog.m82969i("TXTweenFilter", "Output resolution change: " + this.f59838c + "*" + this.f59839d + " -> " + i + "*" + i2);
        this.f59838c = i;
        this.f59839d = i2;
        float[] fArr = this.f59845j;
        if (i > i2) {
            Matrix.orthoM(fArr, 0, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f);
            this.f59847l = 1.0f;
            this.f59848m = 1.0f;
        } else {
            Matrix.orthoM(fArr, 0, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f);
            this.f59847l = 1.0f;
            this.f59848m = 1.0f;
        }
        this.f59849n = true;
    }

    /* JADX INFO: renamed from: b */
    public void m83949b() {
        if (this.f59850o) {
            this.f59855t = m83939a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        } else {
            this.f59855t = m83939a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "varying highp vec2 vTextureCoord;\n \nuniform sampler2D sTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(sTexture, vTextureCoord);\n}");
        }
        int i = this.f59855t;
        if (i == 0) {
            TXCLog.m82966e("TXTweenFilter", "failed creating program");
            return;
        }
        this.f59860y = GLES20.glGetAttribLocation(i, "aPosition");
        m83940a("glGetAttribLocation aPosition");
        if (this.f59860y == -1) {
            TXCLog.m82966e("TXTweenFilter", "Could not get attrib location for aPosition");
            return;
        }
        this.f59861z = GLES20.glGetAttribLocation(this.f59855t, "aTextureCoord");
        m83940a("glGetAttribLocation aTextureCoord");
        if (this.f59861z == -1) {
            TXCLog.m82966e("TXTweenFilter", "Could not get attrib location for aTextureCoord");
            return;
        }
        this.f59858w = GLES20.glGetUniformLocation(this.f59855t, "uMVPMatrix");
        m83940a("glGetUniformLocation uMVPMatrix");
        if (this.f59858w == -1) {
            TXCLog.m82966e("TXTweenFilter", "Could not get attrib location for uMVPMatrix");
            return;
        }
        this.f59859x = GLES20.glGetUniformLocation(this.f59855t, "uSTMatrix");
        m83940a("glGetUniformLocation uSTMatrix");
        if (this.f59859x == -1) {
            TXCLog.m82966e("TXTweenFilter", "Could not get attrib location for uSTMatrix");
        }
    }

    /* JADX INFO: renamed from: c */
    public void m83953c(int i) {
        GLES20.glViewport(0, 0, this.f59838c, this.f59839d);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.f59855t);
        m83940a("glUseProgram");
        if (this.f59850o) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
        } else {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i);
        }
        this.f59852q.position(0);
        GLES20.glVertexAttribPointer(this.f59860y, 3, 5126, false, 20, (Buffer) this.f59852q);
        m83940a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f59860y);
        m83940a("glEnableVertexAttribArray maPositionHandle");
        this.f59852q.position(3);
        GLES20.glVertexAttribPointer(this.f59861z, 2, 5126, false, 20, (Buffer) this.f59852q);
        m83940a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f59861z);
        m83940a("glEnableVertexAttribArray maTextureHandle");
        Matrix.setIdentityM(this.f59853r, 0);
        m83941b(this.f59853r);
        GLES20.glUniformMatrix4fv(this.f59858w, 1, false, this.f59853r, 0);
        GLES20.glUniformMatrix4fv(this.f59859x, 1, false, this.f59854s, 0);
        m83940a("glDrawArrays");
        GLES20.glDrawArrays(5, 0, 4);
        m83940a("glDrawArrays");
        if (this.f59850o) {
            GLES20.glBindTexture(36197, 0);
        } else {
            GLES20.glBindTexture(3553, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m83948a() {
        return this.f59850o;
    }

    /* JADX INFO: renamed from: a */
    public void m83944a(int i) {
        this.f59842g = i;
    }

    /* JADX INFO: renamed from: a */
    public void m83946a(boolean z) {
        this.f59844i = z;
    }

    /* JADX INFO: renamed from: a */
    public void m83947a(float[] fArr) {
        this.f59854s = fArr;
    }

    /* JADX INFO: renamed from: a */
    private int m83938a(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        m83940a("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        TXCLog.m82966e("TXTweenFilter", "Could not compile shader " + i + ":");
        StringBuilder sb = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        TXCLog.m82966e("TXTweenFilter", sb.toString());
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private int m83939a(String str, String str2) {
        int iM83938a;
        int iM83938a2 = m83938a(35633, str);
        if (iM83938a2 == 0 || (iM83938a = m83938a(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        m83940a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            TXCLog.m82966e("TXTweenFilter", "Could not create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iM83938a2);
        m83940a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iM83938a);
        m83940a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        TXCLog.m82966e("TXTweenFilter", "Could not link program: ");
        TXCLog.m82966e("TXTweenFilter", GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public void m83950b(int i) {
        this.f59843h = i;
    }

    /* JADX INFO: renamed from: b */
    private void m83941b(float[] fArr) {
        int i;
        int i2 = this.f59839d;
        if (i2 == 0 || (i = this.f59838c) == 0) {
            return;
        }
        int i3 = this.f59840e;
        int i4 = this.f59841f;
        int i5 = this.f59843h;
        if (i5 == 270 || i5 == 90) {
            i4 = i3;
            i3 = i4;
        }
        float f = i3;
        float f2 = (i * 1.0f) / f;
        float f3 = i4;
        float f4 = (i2 * 1.0f) / f3;
        if (this.f59842g != f59836a ? f2 * f3 > i2 : f2 * f3 <= i2) {
            f2 = f4;
        }
        Matrix.setIdentityM(this.f59846k, 0);
        if (this.f59844i) {
            int i6 = this.f59843h % 180;
            float[] fArr2 = this.f59846k;
            if (i6 == 0) {
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            } else {
                Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
            }
        }
        Matrix.scaleM(this.f59846k, 0, ((f * f2) / this.f59838c) * 1.0f, ((f3 * f2) / this.f59839d) * 1.0f, 1.0f);
        Matrix.rotateM(this.f59846k, 0, this.f59843h, 0.0f, 0.0f, -1.0f);
        Matrix.multiplyMM(fArr, 0, this.f59845j, 0, this.f59846k, 0);
    }

    /* JADX INFO: renamed from: a */
    private void m83940a(String str) {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            TXCLog.m82966e("TXTweenFilter", str + ": glError " + iGlGetError);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83951b(int i, int i2) {
        if (i == this.f59840e && i2 == this.f59841f) {
            return;
        }
        TXCLog.m82969i("TXTweenFilter", "Input resolution change: " + this.f59840e + "*" + this.f59841f + " -> " + i + "*" + i2);
        this.f59840e = i;
        this.f59841f = i2;
    }

    /* JADX INFO: renamed from: c */
    public void m83952c() {
        GLES20.glDeleteProgram(this.f59855t);
        m83943e();
    }

    /* JADX INFO: renamed from: d */
    public int m83954d(int i) {
        m83942d();
        int i2 = this.f59857v;
        if (i2 == -12345) {
            TXCLog.m82964d("TXTweenFilter", "invalid frame buffer id");
            return i;
        }
        GLES20.glBindFramebuffer(36160, i2);
        m83953c(i);
        GLES20.glBindFramebuffer(36160, 0);
        return this.f59856u;
    }
}
