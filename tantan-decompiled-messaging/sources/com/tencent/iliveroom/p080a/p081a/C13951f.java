package com.tencent.iliveroom.p080a.p081a;

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
/* JADX INFO: loaded from: classes2.dex */
public class C13951f {

    /* JADX INFO: renamed from: b */
    private float[] f57787b;

    /* JADX INFO: renamed from: d */
    private FloatBuffer f57789d;

    /* JADX INFO: renamed from: e */
    private FloatBuffer f57790e;

    /* JADX INFO: renamed from: f */
    private ShortBuffer f57791f;

    /* JADX INFO: renamed from: i */
    private int[] f57794i;

    /* JADX INFO: renamed from: j */
    private int f57795j;

    /* JADX INFO: renamed from: k */
    private int f57796k;

    /* JADX INFO: renamed from: l */
    private int f57797l;

    /* JADX INFO: renamed from: m */
    private int f57798m;

    /* JADX INFO: renamed from: n */
    private int f57799n;

    /* JADX INFO: renamed from: o */
    private int f57800o;

    /* JADX INFO: renamed from: p */
    private int f57801p;

    /* JADX INFO: renamed from: t */
    private int f57805t;

    /* JADX INFO: renamed from: u */
    private int f57806u;

    /* JADX INFO: renamed from: g */
    private float[] f57792g = new float[16];

    /* JADX INFO: renamed from: h */
    private float[] f57793h = new float[16];

    /* JADX INFO: renamed from: q */
    private int f57802q = -1;

    /* JADX INFO: renamed from: r */
    private int f57803r = -1;

    /* JADX INFO: renamed from: s */
    private boolean f57804s = false;

    /* JADX INFO: renamed from: v */
    private int f57807v = -12345;

    /* JADX INFO: renamed from: w */
    private int f57808w = -12345;

    /* JADX INFO: renamed from: x */
    private float[] f57809x = {1.0f, 1.0f, 1.0f, 0.0f, -0.343f, 1.765f, 1.4f, -0.711f, 0.0f};

    /* JADX INFO: renamed from: y */
    private float[] f57810y = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

    /* JADX INFO: renamed from: z */
    private float[] f57811z = {0.0f, -0.5f, -0.5f};

    /* JADX INFO: renamed from: A */
    private float[] f57781A = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

    /* JADX INFO: renamed from: B */
    private float[] f57782B = {-0.0627451f, -0.5019608f, -0.5019608f};

    /* JADX INFO: renamed from: C */
    private float[] f57783C = {1.1644f, 1.1644f, 1.1644f, 0.0f, -0.3918f, 2.0172f, 1.596f, -0.813f, 0.0f};

    /* JADX INFO: renamed from: D */
    private float[] f57784D = {0.0f, -0.5019608f, -0.5019608f};

    /* JADX INFO: renamed from: E */
    private float[] f57785E = {1.0f, 1.0f, 1.0f, 0.0f, -0.3441f, 1.772f, 1.402f, -0.7141f, 0.0f};

    /* JADX INFO: renamed from: c */
    private short[] f57788c = {0, 1, 2, 1, 3, 2};

    /* JADX INFO: renamed from: a */
    private float[] f57786a = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    public C13951f() {
        float[] fArr = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        this.f57787b = fArr;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f57790e = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(this.f57787b);
        this.f57790e.position(0);
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(this.f57786a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f57789d = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(this.f57786a);
        this.f57789d.position(0);
        ShortBuffer shortBufferAsShortBuffer = ByteBuffer.allocateDirect(this.f57788c.length * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        this.f57791f = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(this.f57788c);
        this.f57791f.position(0);
        m82593b();
    }

    /* JADX INFO: renamed from: b */
    private void m82593b() {
        int iGlCreateShader = GLES20.glCreateShader(35633);
        m82597e();
        GLES20.glShaderSource(iGlCreateShader, "uniform mat4 uMatrix;uniform mat4 uTextureMatrix;attribute vec2 position;attribute vec2 inputTextureCoordinate;varying vec2 textureCoordinate;void main() {vec4 pos  = vec4(position, 0.0, 1.0);gl_Position = uMatrix * pos;textureCoordinate = (uTextureMatrix*vec4(inputTextureCoordinate, 0.0, 0.0)).xy;}");
        m82597e();
        GLES20.glCompileShader(iGlCreateShader);
        m82597e();
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        m82597e();
        GLES20.glShaderSource(iGlCreateShader2, "precision highp float;\nvarying vec2 textureCoordinate;\nuniform sampler2D yTexture;\nuniform sampler2D uTexture;\nuniform mat3 convertMatrix;\nuniform vec3 offset;\n\nvoid main()\n{\n    highp vec3 yuvColor;\n    highp vec3 rgbColor;\n\n    // Get the YUV values\n    yuvColor.x = texture2D(yTexture, textureCoordinate).r;\n    yuvColor.y = texture2D(uTexture, vec2(textureCoordinate.x * 0.5, textureCoordinate.y * 0.5)).r;\n    yuvColor.z = texture2D(uTexture, vec2(textureCoordinate.x * 0.5, textureCoordinate.y * 0.5 + 0.5)).r;\n\n    // Do the color transform   \n    yuvColor += offset;\n    rgbColor = convertMatrix * yuvColor; \n\n    gl_FragColor = vec4(rgbColor, 1.0);\n}\n");
        m82597e();
        GLES20.glCompileShader(iGlCreateShader2);
        this.f57795j = GLES20.glCreateProgram();
        m82597e();
        GLES20.glAttachShader(this.f57795j, iGlCreateShader);
        m82597e();
        GLES20.glAttachShader(this.f57795j, iGlCreateShader2);
        m82597e();
        GLES20.glLinkProgram(this.f57795j);
        m82597e();
        GLES20.glDeleteShader(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader2);
        this.f57796k = GLES20.glGetUniformLocation(this.f57795j, "uMatrix");
        m82597e();
        this.f57797l = GLES20.glGetUniformLocation(this.f57795j, "uTextureMatrix");
        m82597e();
        this.f57798m = GLES20.glGetAttribLocation(this.f57795j, "position");
        m82597e();
        this.f57799n = GLES20.glGetAttribLocation(this.f57795j, "inputTextureCoordinate");
        m82597e();
        this.f57800o = GLES20.glGetUniformLocation(this.f57795j, "yTexture");
        m82597e();
        this.f57801p = GLES20.glGetUniformLocation(this.f57795j, "uTexture");
        m82597e();
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f57795j, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
        this.f57803r = iGlGetUniformLocation;
        GLES20.glUniform3fv(iGlGetUniformLocation, 1, FloatBuffer.wrap(this.f57784D));
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f57795j, "convertMatrix");
        this.f57802q = iGlGetUniformLocation2;
        GLES20.glUniformMatrix3fv(iGlGetUniformLocation2, 1, false, this.f57785E, 0);
        int[] iArr = new int[2];
        this.f57794i = iArr;
        GLES20.glGenTextures(2, iArr, 0);
    }

    /* JADX INFO: renamed from: c */
    private void m82595c() {
        if (this.f57804s) {
            TXCLog.m82969i("TRTCYuvTextureRender", "reloadFrameBuffer. size = " + this.f57806u + "*" + this.f57805t);
            m82596d();
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glGenFramebuffers(1, iArr2, 0);
            this.f57807v = iArr[0];
            this.f57808w = iArr2[0];
            TXCLog.m82964d("TRTCYuvTextureRender", "frameBuffer id = " + this.f57808w + ", texture id = " + this.f57807v);
            GLES20.glBindTexture(3553, this.f57807v);
            GLES20.glTexImage2D(3553, 0, 6408, this.f57806u, this.f57805t, 0, 6408, 5121, null);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glBindFramebuffer(36160, this.f57808w);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f57807v, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
            this.f57804s = false;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m82596d() {
        int i = this.f57808w;
        if (i != -12345) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.f57808w = -12345;
        }
        int i2 = this.f57807v;
        if (i2 != -12345) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.f57807v = -12345;
        }
    }

    /* JADX INFO: renamed from: e */
    private int m82597e() {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            TXCLog.m82966e("TRTCYuvTextureRender", "check error:" + iGlGetError);
        }
        return iGlGetError;
    }

    /* JADX INFO: renamed from: a */
    public int m82598a(ByteBuffer byteBuffer, int i, int i2) {
        if (this.f57806u != i || this.f57805t != i2) {
            this.f57806u = i;
            this.f57805t = i2;
            this.f57804s = true;
        }
        m82595c();
        int i3 = this.f57808w;
        if (i3 == -12345) {
            TXCLog.m82973w("TRTCYuvTextureRender", "invalid frame buffer id");
            return -12345;
        }
        GLES20.glBindFramebuffer(36160, i3);
        GLES20.glViewport(0, 0, this.f57806u, this.f57805t);
        m82594b(byteBuffer, i, i2);
        GLES20.glBindFramebuffer(36160, 0);
        return this.f57807v;
    }

    /* JADX INFO: renamed from: a */
    public void m82599a() {
        int[] iArr = this.f57794i;
        if (iArr != null) {
            GLES20.glDeleteTextures(2, iArr, 0);
            this.f57794i = null;
        }
        m82596d();
        GLES20.glDeleteProgram(this.f57795j);
    }

    /* JADX INFO: renamed from: b */
    private void m82594b(ByteBuffer byteBuffer, int i, int i2) {
        if (byteBuffer == null) {
            TXCLog.m82966e("TRTCYuvTextureRender", "drawFrameInner: byte buffer is null.");
            return;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        Matrix.setIdentityM(this.f57792g, 0);
        Matrix.setIdentityM(this.f57793h, 0);
        GLES20.glUseProgram(this.f57795j);
        m82597e();
        GLES20.glEnableVertexAttribArray(this.f57798m);
        m82597e();
        this.f57789d.position(0);
        GLES20.glVertexAttribPointer(this.f57798m, 2, 5126, false, 8, (Buffer) this.f57789d);
        m82597e();
        GLES20.glEnableVertexAttribArray(this.f57799n);
        m82597e();
        this.f57790e.position(0);
        GLES20.glVertexAttribPointer(this.f57799n, 2, 5126, false, 8, (Buffer) this.f57790e);
        m82597e();
        GLES20.glUniformMatrix4fv(this.f57796k, 1, false, this.f57792g, 0);
        m82597e();
        GLES20.glUniformMatrix4fv(this.f57797l, 1, false, this.f57793h, 0);
        m82597e();
        GLES20.glUniform3fv(this.f57803r, 1, FloatBuffer.wrap(this.f57784D));
        GLES20.glUniformMatrix3fv(this.f57802q, 1, false, this.f57785E, 0);
        GLES20.glUniform1i(this.f57800o, 0);
        m82597e();
        GLES20.glUniform1i(this.f57801p, 1);
        m82597e();
        int iPosition = byteBuffer.position();
        int[] iArr = this.f57794i;
        if (iArr != null) {
            TXCYuvTextureRender.nativeLoadTexture(byteBuffer, i, i2, iArr);
        }
        byteBuffer.position(iPosition);
        GLES20.glDrawElements(4, this.f57788c.length, 5123, this.f57791f);
        GLES20.glDisableVertexAttribArray(this.f57798m);
        GLES20.glDisableVertexAttribArray(this.f57799n);
    }
}
