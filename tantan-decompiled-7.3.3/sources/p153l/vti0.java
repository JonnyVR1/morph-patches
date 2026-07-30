package p153l;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class vti0 {

    /* JADX INFO: renamed from: a */
    public final float[] f185711a;

    /* JADX INFO: renamed from: b */
    public FloatBuffer f185712b;

    /* JADX INFO: renamed from: c */
    public FloatBuffer f185713c;

    /* JADX INFO: renamed from: e */
    public float[] f185715e;

    /* JADX INFO: renamed from: f */
    public int f185716f;

    /* JADX INFO: renamed from: h */
    public int f185718h;

    /* JADX INFO: renamed from: i */
    public int f185719i;

    /* JADX INFO: renamed from: j */
    public int f185720j;

    /* JADX INFO: renamed from: k */
    public int f185721k;

    /* JADX INFO: renamed from: l */
    public int f185722l;

    /* JADX INFO: renamed from: d */
    public float[] f185714d = new float[16];

    /* JADX INFO: renamed from: g */
    public int f185717g = -12345;

    public vti0(int i) {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        this.f185711a = fArr;
        float[] fArr2 = new float[16];
        this.f185715e = fArr2;
        this.f185722l = i;
        Matrix.setIdentityM(fArr2, 0);
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f185712b = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.f185713c = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    /* JADX INFO: renamed from: a */
    public void m202674a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        y3k.m214151a(str, ": glError ", iGlGetError);
    }

    /* JADX INFO: renamed from: b */
    public final int m202675b(String str, String str2) {
        int iM202679f;
        int iM202679f2 = m202679f(35633, str);
        if (iM202679f2 == 0 || (iM202679f = m202679f(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        m202674a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            return 0;
        }
        GLES20.glAttachShader(iGlCreateProgram, iM202679f2);
        m202674a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iM202679f);
        m202674a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public void m202676c(SurfaceTexture surfaceTexture, boolean z) {
        surfaceTexture.getTransformMatrix(this.f185715e);
        if (z) {
            float[] fArr = this.f185715e;
            fArr[5] = -fArr[5];
            fArr[13] = 1.0f - fArr[13];
        }
        GLES20.glUseProgram(this.f185716f);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f185717g);
        this.f185712b.position(0);
        GLES20.glVertexAttribPointer(this.f185720j, 2, 5126, false, 0, (Buffer) this.f185712b);
        GLES20.glEnableVertexAttribArray(this.f185720j);
        this.f185713c.position(0);
        GLES20.glVertexAttribPointer(this.f185721k, 2, 5126, false, 0, (Buffer) this.f185713c);
        GLES20.glEnableVertexAttribArray(this.f185721k);
        GLES20.glUniformMatrix4fv(this.f185719i, 1, false, this.f185715e, 0);
        GLES20.glUniformMatrix4fv(this.f185718h, 1, false, this.f185714d, 0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* JADX INFO: renamed from: d */
    public int m202677d() {
        return this.f185717g;
    }

    /* JADX INFO: renamed from: e */
    public void m202678e(boolean z, float f, int i) {
        if (i == 90 || i == 270 || z) {
            float f2 = f + 0.0f;
            float f3 = 1.0f - f;
            this.f185713c.put(new float[]{0.0f, f2, 1.0f, f2, 0.0f, f3, 1.0f, f3}).position(0);
        } else {
            float f4 = f + 0.0f;
            float f5 = 1.0f - f;
            this.f185713c.put(new float[]{f4, 0.0f, f5, 0.0f, f4, 1.0f, f5, 1.0f}).position(0);
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m202679f(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        m202674a("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public void m202680g() {
        int iM202675b = m202675b("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        this.f185716f = iM202675b;
        if (iM202675b == 0) {
            azk0.m101074a("failed creating program");
            return;
        }
        this.f185720j = GLES20.glGetAttribLocation(iM202675b, "aPosition");
        this.f185721k = GLES20.glGetAttribLocation(this.f185716f, "aTextureCoord");
        this.f185718h = GLES20.glGetUniformLocation(this.f185716f, "uMVPMatrix");
        this.f185719i = GLES20.glGetUniformLocation(this.f185716f, "uSTMatrix");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.f185717g = i;
        GLES20.glBindTexture(36197, i);
        m202674a("glBindTexture mTextureID");
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m202674a("glTexParameter");
        Matrix.setIdentityM(this.f185714d, 0);
        int i2 = this.f185722l;
        if (i2 != 0) {
            Matrix.rotateM(this.f185714d, 0, i2, 0.0f, 0.0f, 1.0f);
        }
    }
}
