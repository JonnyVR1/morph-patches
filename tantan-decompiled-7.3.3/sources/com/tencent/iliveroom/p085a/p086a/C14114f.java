package com.tencent.iliveroom.p085a.p086a;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.renderer.TXCYuvTextureRender;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.a.f */
/* JADX INFO: loaded from: classes12.dex */
public class C14114f {

    /* JADX INFO: renamed from: b */
    private float[] f58635b;

    /* JADX INFO: renamed from: d */
    private FloatBuffer f58637d;

    /* JADX INFO: renamed from: e */
    private FloatBuffer f58638e;

    /* JADX INFO: renamed from: f */
    private ShortBuffer f58639f;

    /* JADX INFO: renamed from: i */
    private int[] f58642i;

    /* JADX INFO: renamed from: j */
    private int f58643j;

    /* JADX INFO: renamed from: k */
    private int f58644k;

    /* JADX INFO: renamed from: l */
    private int f58645l;

    /* JADX INFO: renamed from: m */
    private int f58646m;

    /* JADX INFO: renamed from: n */
    private int f58647n;

    /* JADX INFO: renamed from: o */
    private int f58648o;

    /* JADX INFO: renamed from: p */
    private int f58649p;

    /* JADX INFO: renamed from: t */
    private int f58653t;

    /* JADX INFO: renamed from: u */
    private int f58654u;

    /* JADX INFO: renamed from: g */
    private float[] f58640g = new float[16];

    /* JADX INFO: renamed from: h */
    private float[] f58641h = new float[16];

    /* JADX INFO: renamed from: q */
    private int f58650q = -1;

    /* JADX INFO: renamed from: r */
    private int f58651r = -1;

    /* JADX INFO: renamed from: s */
    private boolean f58652s = false;

    /* JADX INFO: renamed from: v */
    private int f58655v = -12345;

    /* JADX INFO: renamed from: w */
    private int f58656w = -12345;

    /* JADX INFO: renamed from: x */
    private float[] f58657x = {1.0f, 1.0f, 1.0f, 0.0f, -0.343f, 1.765f, 1.4f, -0.711f, 0.0f};

    /* JADX INFO: renamed from: y */
    private float[] f58658y = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

    /* JADX INFO: renamed from: z */
    private float[] f58659z = {0.0f, -0.5f, -0.5f};

    /* JADX INFO: renamed from: A */
    private float[] f58629A = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

    /* JADX INFO: renamed from: B */
    private float[] f58630B = {-0.0627451f, -0.5019608f, -0.5019608f};

    /* JADX INFO: renamed from: C */
    private float[] f58631C = {1.1644f, 1.1644f, 1.1644f, 0.0f, -0.3918f, 2.0172f, 1.596f, -0.813f, 0.0f};

    /* JADX INFO: renamed from: D */
    private float[] f58632D = {0.0f, -0.5019608f, -0.5019608f};

    /* JADX INFO: renamed from: E */
    private float[] f58633E = {1.0f, 1.0f, 1.0f, 0.0f, -0.3441f, 1.772f, 1.402f, -0.7141f, 0.0f};

    /* JADX INFO: renamed from: c */
    private short[] f58636c = {0, 1, 2, 1, 3, 2};

    /* JADX INFO: renamed from: a */
    private float[] f58634a = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    public C14114f() {
        float[] fArr = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        this.f58635b = fArr;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f58638e = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(this.f58635b);
        this.f58638e.position(0);
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(this.f58634a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f58637d = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(this.f58634a);
        this.f58637d.position(0);
        ShortBuffer shortBufferAsShortBuffer = ByteBuffer.allocateDirect(this.f58636c.length * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        this.f58639f = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(this.f58636c);
        this.f58639f.position(0);
        m83776b();
    }

    /* JADX INFO: renamed from: b */
    private void m83776b() {
        int iGlCreateShader = GLES20.glCreateShader(35633);
        m83780e();
        GLES20.glShaderSource(iGlCreateShader, "uniform mat4 uMatrix;uniform mat4 uTextureMatrix;attribute vec2 position;attribute vec2 inputTextureCoordinate;varying vec2 textureCoordinate;void main() {vec4 pos  = vec4(position, 0.0, 1.0);gl_Position = uMatrix * pos;textureCoordinate = (uTextureMatrix*vec4(inputTextureCoordinate, 0.0, 0.0)).xy;}");
        m83780e();
        GLES20.glCompileShader(iGlCreateShader);
        m83780e();
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        m83780e();
        GLES20.glShaderSource(iGlCreateShader2, "precision highp float;\nvarying vec2 textureCoordinate;\nuniform sampler2D yTexture;\nuniform sampler2D uTexture;\nuniform mat3 convertMatrix;\nuniform vec3 offset;\n\nvoid main()\n{\n    highp vec3 yuvColor;\n    highp vec3 rgbColor;\n\n    // Get the YUV values\n    yuvColor.x = texture2D(yTexture, textureCoordinate).r;\n    yuvColor.y = texture2D(uTexture, vec2(textureCoordinate.x * 0.5, textureCoordinate.y * 0.5)).r;\n    yuvColor.z = texture2D(uTexture, vec2(textureCoordinate.x * 0.5, textureCoordinate.y * 0.5 + 0.5)).r;\n\n    // Do the color transform   \n    yuvColor += offset;\n    rgbColor = convertMatrix * yuvColor; \n\n    gl_FragColor = vec4(rgbColor, 1.0);\n}\n");
        m83780e();
        GLES20.glCompileShader(iGlCreateShader2);
        this.f58643j = GLES20.glCreateProgram();
        m83780e();
        GLES20.glAttachShader(this.f58643j, iGlCreateShader);
        m83780e();
        GLES20.glAttachShader(this.f58643j, iGlCreateShader2);
        m83780e();
        GLES20.glLinkProgram(this.f58643j);
        m83780e();
        GLES20.glDeleteShader(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader2);
        this.f58644k = GLES20.glGetUniformLocation(this.f58643j, "uMatrix");
        m83780e();
        this.f58645l = GLES20.glGetUniformLocation(this.f58643j, "uTextureMatrix");
        m83780e();
        this.f58646m = GLES20.glGetAttribLocation(this.f58643j, "position");
        m83780e();
        this.f58647n = GLES20.glGetAttribLocation(this.f58643j, "inputTextureCoordinate");
        m83780e();
        this.f58648o = GLES20.glGetUniformLocation(this.f58643j, "yTexture");
        m83780e();
        this.f58649p = GLES20.glGetUniformLocation(this.f58643j, "uTexture");
        m83780e();
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f58643j, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
        this.f58651r = iGlGetUniformLocation;
        GLES20.glUniform3fv(iGlGetUniformLocation, 1, FloatBuffer.wrap(this.f58632D));
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f58643j, "convertMatrix");
        this.f58650q = iGlGetUniformLocation2;
        GLES20.glUniformMatrix3fv(iGlGetUniformLocation2, 1, false, this.f58633E, 0);
        int[] iArr = new int[2];
        this.f58642i = iArr;
        GLES20.glGenTextures(2, iArr, 0);
    }

    /* JADX INFO: renamed from: c */
    private void m83778c() {
        if (this.f58652s) {
            TXCLog.m84152i("TRTCYuvTextureRender", "reloadFrameBuffer. size = " + this.f58654u + "*" + this.f58653t);
            m83779d();
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glGenFramebuffers(1, iArr2, 0);
            this.f58655v = iArr[0];
            this.f58656w = iArr2[0];
            TXCLog.m84147d("TRTCYuvTextureRender", "frameBuffer id = " + this.f58656w + ", texture id = " + this.f58655v);
            GLES20.glBindTexture(3553, this.f58655v);
            GLES20.glTexImage2D(3553, 0, 6408, this.f58654u, this.f58653t, 0, 6408, 5121, null);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glBindFramebuffer(36160, this.f58656w);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f58655v, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
            this.f58652s = false;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m83779d() {
        int i = this.f58656w;
        if (i != -12345) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.f58656w = -12345;
        }
        int i2 = this.f58655v;
        if (i2 != -12345) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.f58655v = -12345;
        }
    }

    /* JADX INFO: renamed from: e */
    private int m83780e() {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            TXCLog.m84149e("TRTCYuvTextureRender", "check error:" + iGlGetError);
        }
        return iGlGetError;
    }

    /* JADX INFO: renamed from: a */
    public int m83781a(ByteBuffer byteBuffer, int i, int i2) {
        if (this.f58654u != i || this.f58653t != i2) {
            this.f58654u = i;
            this.f58653t = i2;
            this.f58652s = true;
        }
        m83778c();
        int i3 = this.f58656w;
        if (i3 == -12345) {
            TXCLog.m84156w("TRTCYuvTextureRender", "invalid frame buffer id");
            return -12345;
        }
        GLES20.glBindFramebuffer(36160, i3);
        GLES20.glViewport(0, 0, this.f58654u, this.f58653t);
        m83777b(byteBuffer, i, i2);
        GLES20.glBindFramebuffer(36160, 0);
        return this.f58655v;
    }

    /* JADX INFO: renamed from: a */
    public void m83782a() {
        int[] iArr = this.f58642i;
        if (iArr != null) {
            GLES20.glDeleteTextures(2, iArr, 0);
            this.f58642i = null;
        }
        m83779d();
        GLES20.glDeleteProgram(this.f58643j);
    }

    /* JADX INFO: renamed from: b */
    private void m83777b(ByteBuffer byteBuffer, int i, int i2) {
        if (byteBuffer == null) {
            TXCLog.m84149e("TRTCYuvTextureRender", "drawFrameInner: byte buffer is null.");
            return;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        Matrix.setIdentityM(this.f58640g, 0);
        Matrix.setIdentityM(this.f58641h, 0);
        GLES20.glUseProgram(this.f58643j);
        m83780e();
        GLES20.glEnableVertexAttribArray(this.f58646m);
        m83780e();
        this.f58637d.position(0);
        GLES20.glVertexAttribPointer(this.f58646m, 2, 5126, false, 8, (Buffer) this.f58637d);
        m83780e();
        GLES20.glEnableVertexAttribArray(this.f58647n);
        m83780e();
        this.f58638e.position(0);
        GLES20.glVertexAttribPointer(this.f58647n, 2, 5126, false, 8, (Buffer) this.f58638e);
        m83780e();
        GLES20.glUniformMatrix4fv(this.f58644k, 1, false, this.f58640g, 0);
        m83780e();
        GLES20.glUniformMatrix4fv(this.f58645l, 1, false, this.f58641h, 0);
        m83780e();
        GLES20.glUniform3fv(this.f58651r, 1, FloatBuffer.wrap(this.f58632D));
        GLES20.glUniformMatrix3fv(this.f58650q, 1, false, this.f58633E, 0);
        GLES20.glUniform1i(this.f58648o, 0);
        m83780e();
        GLES20.glUniform1i(this.f58649p, 1);
        m83780e();
        int iPosition = byteBuffer.position();
        int[] iArr = this.f58642i;
        if (iArr != null) {
            TXCYuvTextureRender.nativeLoadTexture(byteBuffer, i, i2, iArr);
        }
        byteBuffer.position(iPosition);
        GLES20.glDrawElements(4, this.f58636c.length, 5123, this.f58639f);
        GLES20.glDisableVertexAttribArray(this.f58646m);
        GLES20.glDisableVertexAttribArray(this.f58647n);
    }
}
