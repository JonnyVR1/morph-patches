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
public class C14346c {

    /* JADX INFO: renamed from: a */
    private final float[] f60596a;

    /* JADX INFO: renamed from: b */
    private final float[] f60597b;

    /* JADX INFO: renamed from: c */
    private FloatBuffer f60598c;

    /* JADX INFO: renamed from: f */
    private int f60601f;

    /* JADX INFO: renamed from: h */
    private int f60603h;

    /* JADX INFO: renamed from: i */
    private int f60604i;

    /* JADX INFO: renamed from: j */
    private int f60605j;

    /* JADX INFO: renamed from: k */
    private int f60606k;

    /* JADX INFO: renamed from: m */
    private boolean f60608m;

    /* JADX INFO: renamed from: d */
    private float[] f60599d = new float[16];

    /* JADX INFO: renamed from: e */
    private float[] f60600e = new float[16];

    /* JADX INFO: renamed from: g */
    private int f60602g = -12345;

    /* JADX INFO: renamed from: l */
    private boolean f60607l = false;

    /* JADX INFO: renamed from: n */
    private boolean f60609n = false;

    /* JADX INFO: renamed from: o */
    private int f60610o = -1;

    /* JADX INFO: renamed from: p */
    private int f60611p = 0;

    /* JADX INFO: renamed from: q */
    private int f60612q = 0;

    public C14346c(boolean z) {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.f60596a = fArr;
        float[] fArr2 = {1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f};
        this.f60597b = fArr2;
        this.f60608m = z;
        if (z) {
            FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f60598c = floatBufferAsFloatBuffer;
            floatBufferAsFloatBuffer.put(fArr).position(0);
        } else {
            FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f60598c = floatBufferAsFloatBuffer2;
            floatBufferAsFloatBuffer2.put(fArr2).position(0);
        }
        Matrix.setIdentityM(this.f60600e, 0);
    }

    /* JADX INFO: renamed from: b */
    private void m85064b(int i, int i2) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        if (this.f60607l) {
            this.f60607l = false;
            return;
        }
        GLES20.glUseProgram(this.f60601f);
        m85070a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(i, i2);
        this.f60598c.position(0);
        GLES20.glVertexAttribPointer(this.f60605j, 3, 5126, false, 20, (Buffer) this.f60598c);
        m85070a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f60605j);
        m85070a("glEnableVertexAttribArray maPositionHandle");
        this.f60598c.position(3);
        GLES20.glVertexAttribPointer(this.f60606k, 2, 5126, false, 20, (Buffer) this.f60598c);
        m85070a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f60606k);
        m85070a("glEnableVertexAttribArray maTextureHandle");
        Matrix.setIdentityM(this.f60599d, 0);
        GLES20.glUniformMatrix4fv(this.f60603h, 1, false, this.f60599d, 0);
        int i3 = this.f60611p;
        if (i3 % 8 != 0) {
            Matrix.scaleM(this.f60600e, 0, ((i3 - 1) * 1.0f) / (((i3 + 7) / 8) * 8), 1.0f, 1.0f);
        }
        int i4 = this.f60612q;
        if (i4 % 8 != 0) {
            Matrix.scaleM(this.f60600e, 0, 1.0f, ((i4 - 1) * 1.0f) / (((i4 + 7) / 8) * 8), 1.0f);
        }
        GLES20.glUniformMatrix4fv(this.f60604i, 1, false, this.f60600e, 0);
        GLES20.glDrawArrays(5, 0, 4);
        m85070a("glDrawArrays");
        GLES20.glFinish();
    }

    /* JADX INFO: renamed from: d */
    private void m85065d() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.f60602g = i;
        GLES20.glBindTexture(36197, i);
        m85070a("glBindTexture mTextureID");
    }

    /* JADX INFO: renamed from: a */
    public void m85068a(int i, boolean z, int i2) {
        if (this.f60609n != z || this.f60610o != i2) {
            this.f60609n = z;
            this.f60610o = i2;
            float[] fArr = new float[20];
            for (int i3 = 0; i3 < 20; i3++) {
                fArr[i3] = this.f60597b[i3];
            }
            if (this.f60609n) {
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
            this.f60598c.clear();
            this.f60598c.put(fArr).position(0);
        }
        m85064b(3553, i);
    }

    /* JADX INFO: renamed from: c */
    public void m85072c() {
        int i = this.f60601f;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
        }
        GLES20.glDeleteTextures(1, new int[]{this.f60602g}, 0);
        this.f60602g = -1;
    }

    /* JADX INFO: renamed from: a */
    public void m85069a(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null) {
            return;
        }
        m85070a("onDrawFrame start");
        surfaceTexture.getTransformMatrix(this.f60600e);
        m85064b(36197, this.f60602g);
    }

    /* JADX INFO: renamed from: a */
    public void m85067a(int i, int i2) {
        this.f60611p = i;
        this.f60612q = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m85066a() {
        return this.f60602g;
    }

    /* JADX INFO: renamed from: a */
    private int m85062a(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        m85070a("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        TXCLog.m84149e("TXCOesTextureRender", "Could not compile shader " + i + ":");
        StringBuilder sb = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        TXCLog.m84149e("TXCOesTextureRender", sb.toString());
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private int m85063a(String str, String str2) {
        int iM85062a;
        int iM85062a2 = m85062a(35633, str);
        if (iM85062a2 == 0 || (iM85062a = m85062a(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        m85070a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            TXCLog.m84149e("TXCOesTextureRender", "Could not create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iM85062a2);
        m85070a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iM85062a);
        m85070a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        TXCLog.m84149e("TXCOesTextureRender", "Could not link program: ");
        TXCLog.m84149e("TXCOesTextureRender", GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public void m85070a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            TXCLog.m84149e("TXCOesTextureRender", str + ": glError " + iGlGetError);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m85071b() {
        if (this.f60608m) {
            this.f60601f = m85063a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        } else {
            this.f60601f = m85063a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "varying highp vec2 vTextureCoord;\n \nuniform sampler2D sTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(sTexture, vTextureCoord);\n}");
        }
        int i = this.f60601f;
        if (i == 0) {
            TXCLog.m84149e("TXCOesTextureRender", "failed creating program");
            return;
        }
        this.f60605j = GLES20.glGetAttribLocation(i, "aPosition");
        m85070a("glGetAttribLocation aPosition");
        if (this.f60605j == -1) {
            TXCLog.m84149e("TXCOesTextureRender", "Could not get attrib location for aPosition");
            return;
        }
        this.f60606k = GLES20.glGetAttribLocation(this.f60601f, "aTextureCoord");
        m85070a("glGetAttribLocation aTextureCoord");
        if (this.f60606k == -1) {
            TXCLog.m84149e("TXCOesTextureRender", "Could not get attrib location for aTextureCoord");
            return;
        }
        this.f60603h = GLES20.glGetUniformLocation(this.f60601f, "uMVPMatrix");
        m85070a("glGetUniformLocation uMVPMatrix");
        if (this.f60603h == -1) {
            TXCLog.m84149e("TXCOesTextureRender", "Could not get attrib location for uMVPMatrix");
            return;
        }
        this.f60604i = GLES20.glGetUniformLocation(this.f60601f, "uSTMatrix");
        m85070a("glGetUniformLocation uSTMatrix");
        if (this.f60604i == -1) {
            TXCLog.m84149e("TXCOesTextureRender", "Could not get attrib location for uSTMatrix");
            return;
        }
        if (this.f60608m) {
            m85065d();
        }
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m85070a("glTexParameter");
    }
}
