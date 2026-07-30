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
public class C14351h {

    /* JADX INFO: renamed from: a */
    public static int f60684a = 1;

    /* JADX INFO: renamed from: b */
    public static int f60685b = 2;

    /* JADX INFO: renamed from: o */
    private boolean f60698o;

    /* JADX INFO: renamed from: p */
    private final float[] f60699p;

    /* JADX INFO: renamed from: q */
    private FloatBuffer f60700q;

    /* JADX INFO: renamed from: t */
    private int f60703t;

    /* JADX INFO: renamed from: w */
    private int f60706w;

    /* JADX INFO: renamed from: x */
    private int f60707x;

    /* JADX INFO: renamed from: y */
    private int f60708y;

    /* JADX INFO: renamed from: z */
    private int f60709z;

    /* JADX INFO: renamed from: c */
    private int f60686c = 0;

    /* JADX INFO: renamed from: d */
    private int f60687d = 0;

    /* JADX INFO: renamed from: e */
    private int f60688e = 0;

    /* JADX INFO: renamed from: f */
    private int f60689f = 0;

    /* JADX INFO: renamed from: g */
    private int f60690g = f60685b;

    /* JADX INFO: renamed from: h */
    private int f60691h = 0;

    /* JADX INFO: renamed from: i */
    private boolean f60692i = false;

    /* JADX INFO: renamed from: j */
    private float[] f60693j = new float[16];

    /* JADX INFO: renamed from: k */
    private float[] f60694k = new float[16];

    /* JADX INFO: renamed from: l */
    private float f60695l = 1.0f;

    /* JADX INFO: renamed from: m */
    private float f60696m = 1.0f;

    /* JADX INFO: renamed from: n */
    private boolean f60697n = false;

    /* JADX INFO: renamed from: r */
    private float[] f60701r = new float[16];

    /* JADX INFO: renamed from: s */
    private float[] f60702s = new float[16];

    /* JADX INFO: renamed from: u */
    private int f60704u = -12345;

    /* JADX INFO: renamed from: v */
    private int f60705v = -12345;

    public C14351h(Boolean bool) {
        this.f60698o = true;
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.f60699p = fArr;
        this.f60698o = bool.booleanValue();
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f60700q = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        Matrix.setIdentityM(this.f60702s, 0);
    }

    /* JADX INFO: renamed from: d */
    private void m85125d() {
        if (this.f60697n) {
            TXCLog.m84152i("TXTweenFilter", "reloadFrameBuffer. size = " + this.f60686c + "*" + this.f60687d);
            m85126e();
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glGenFramebuffers(1, iArr2, 0);
            this.f60704u = iArr[0];
            this.f60705v = iArr2[0];
            TXCLog.m84147d("TXTweenFilter", "frameBuffer id = " + this.f60705v + ", texture id = " + this.f60704u);
            GLES20.glBindTexture(3553, this.f60704u);
            m85123a("glBindTexture mFrameBufferTextureID");
            GLES20.glTexImage2D(3553, 0, 6408, this.f60686c, this.f60687d, 0, 6408, 5121, null);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            m85123a("glTexParameter");
            GLES20.glBindFramebuffer(36160, this.f60705v);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f60704u, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
            this.f60697n = false;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m85126e() {
        int i = this.f60705v;
        if (i != -12345) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.f60705v = -12345;
        }
        int i2 = this.f60704u;
        if (i2 != -12345) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.f60704u = -12345;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85128a(int i, int i2) {
        if (i == this.f60686c && i2 == this.f60687d) {
            return;
        }
        TXCLog.m84152i("TXTweenFilter", "Output resolution change: " + this.f60686c + "*" + this.f60687d + " -> " + i + "*" + i2);
        this.f60686c = i;
        this.f60687d = i2;
        float[] fArr = this.f60693j;
        if (i > i2) {
            Matrix.orthoM(fArr, 0, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f);
            this.f60695l = 1.0f;
            this.f60696m = 1.0f;
        } else {
            Matrix.orthoM(fArr, 0, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f);
            this.f60695l = 1.0f;
            this.f60696m = 1.0f;
        }
        this.f60697n = true;
    }

    /* JADX INFO: renamed from: b */
    public void m85132b() {
        if (this.f60698o) {
            this.f60703t = m85122a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        } else {
            this.f60703t = m85122a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "varying highp vec2 vTextureCoord;\n \nuniform sampler2D sTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(sTexture, vTextureCoord);\n}");
        }
        int i = this.f60703t;
        if (i == 0) {
            TXCLog.m84149e("TXTweenFilter", "failed creating program");
            return;
        }
        this.f60708y = GLES20.glGetAttribLocation(i, "aPosition");
        m85123a("glGetAttribLocation aPosition");
        if (this.f60708y == -1) {
            TXCLog.m84149e("TXTweenFilter", "Could not get attrib location for aPosition");
            return;
        }
        this.f60709z = GLES20.glGetAttribLocation(this.f60703t, "aTextureCoord");
        m85123a("glGetAttribLocation aTextureCoord");
        if (this.f60709z == -1) {
            TXCLog.m84149e("TXTweenFilter", "Could not get attrib location for aTextureCoord");
            return;
        }
        this.f60706w = GLES20.glGetUniformLocation(this.f60703t, "uMVPMatrix");
        m85123a("glGetUniformLocation uMVPMatrix");
        if (this.f60706w == -1) {
            TXCLog.m84149e("TXTweenFilter", "Could not get attrib location for uMVPMatrix");
            return;
        }
        this.f60707x = GLES20.glGetUniformLocation(this.f60703t, "uSTMatrix");
        m85123a("glGetUniformLocation uSTMatrix");
        if (this.f60707x == -1) {
            TXCLog.m84149e("TXTweenFilter", "Could not get attrib location for uSTMatrix");
        }
    }

    /* JADX INFO: renamed from: c */
    public void m85136c(int i) {
        GLES20.glViewport(0, 0, this.f60686c, this.f60687d);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.f60703t);
        m85123a("glUseProgram");
        if (this.f60698o) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
        } else {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i);
        }
        this.f60700q.position(0);
        GLES20.glVertexAttribPointer(this.f60708y, 3, 5126, false, 20, (Buffer) this.f60700q);
        m85123a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f60708y);
        m85123a("glEnableVertexAttribArray maPositionHandle");
        this.f60700q.position(3);
        GLES20.glVertexAttribPointer(this.f60709z, 2, 5126, false, 20, (Buffer) this.f60700q);
        m85123a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f60709z);
        m85123a("glEnableVertexAttribArray maTextureHandle");
        Matrix.setIdentityM(this.f60701r, 0);
        m85124b(this.f60701r);
        GLES20.glUniformMatrix4fv(this.f60706w, 1, false, this.f60701r, 0);
        GLES20.glUniformMatrix4fv(this.f60707x, 1, false, this.f60702s, 0);
        m85123a("glDrawArrays");
        GLES20.glDrawArrays(5, 0, 4);
        m85123a("glDrawArrays");
        if (this.f60698o) {
            GLES20.glBindTexture(36197, 0);
        } else {
            GLES20.glBindTexture(3553, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m85131a() {
        return this.f60698o;
    }

    /* JADX INFO: renamed from: a */
    public void m85127a(int i) {
        this.f60690g = i;
    }

    /* JADX INFO: renamed from: a */
    public void m85129a(boolean z) {
        this.f60692i = z;
    }

    /* JADX INFO: renamed from: a */
    public void m85130a(float[] fArr) {
        this.f60702s = fArr;
    }

    /* JADX INFO: renamed from: a */
    private int m85121a(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        m85123a("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        TXCLog.m84149e("TXTweenFilter", "Could not compile shader " + i + ":");
        StringBuilder sb = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        TXCLog.m84149e("TXTweenFilter", sb.toString());
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private int m85122a(String str, String str2) {
        int iM85121a;
        int iM85121a2 = m85121a(35633, str);
        if (iM85121a2 == 0 || (iM85121a = m85121a(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        m85123a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            TXCLog.m84149e("TXTweenFilter", "Could not create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iM85121a2);
        m85123a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iM85121a);
        m85123a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        TXCLog.m84149e("TXTweenFilter", "Could not link program: ");
        TXCLog.m84149e("TXTweenFilter", GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public void m85133b(int i) {
        this.f60691h = i;
    }

    /* JADX INFO: renamed from: b */
    private void m85124b(float[] fArr) {
        int i;
        int i2 = this.f60687d;
        if (i2 == 0 || (i = this.f60686c) == 0) {
            return;
        }
        int i3 = this.f60688e;
        int i4 = this.f60689f;
        int i5 = this.f60691h;
        if (i5 == 270 || i5 == 90) {
            i4 = i3;
            i3 = i4;
        }
        float f = i3;
        float f2 = (i * 1.0f) / f;
        float f3 = i4;
        float f4 = (i2 * 1.0f) / f3;
        if (this.f60690g != f60684a ? f2 * f3 > i2 : f2 * f3 <= i2) {
            f2 = f4;
        }
        Matrix.setIdentityM(this.f60694k, 0);
        if (this.f60692i) {
            int i6 = this.f60691h % 180;
            float[] fArr2 = this.f60694k;
            if (i6 == 0) {
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            } else {
                Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
            }
        }
        Matrix.scaleM(this.f60694k, 0, ((f * f2) / this.f60686c) * 1.0f, ((f3 * f2) / this.f60687d) * 1.0f, 1.0f);
        Matrix.rotateM(this.f60694k, 0, this.f60691h, 0.0f, 0.0f, -1.0f);
        Matrix.multiplyMM(fArr, 0, this.f60693j, 0, this.f60694k, 0);
    }

    /* JADX INFO: renamed from: a */
    private void m85123a(String str) {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            TXCLog.m84149e("TXTweenFilter", str + ": glError " + iGlGetError);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m85134b(int i, int i2) {
        if (i == this.f60688e && i2 == this.f60689f) {
            return;
        }
        TXCLog.m84152i("TXTweenFilter", "Input resolution change: " + this.f60688e + "*" + this.f60689f + " -> " + i + "*" + i2);
        this.f60688e = i;
        this.f60689f = i2;
    }

    /* JADX INFO: renamed from: c */
    public void m85135c() {
        GLES20.glDeleteProgram(this.f60703t);
        m85126e();
    }

    /* JADX INFO: renamed from: d */
    public int m85137d(int i) {
        m85125d();
        int i2 = this.f60705v;
        if (i2 == -12345) {
            TXCLog.m84147d("TXTweenFilter", "invalid frame buffer id");
            return i;
        }
        GLES20.glBindFramebuffer(36160, i2);
        m85136c(i);
        GLES20.glBindFramebuffer(36160, 0);
        return this.f60704u;
    }
}
